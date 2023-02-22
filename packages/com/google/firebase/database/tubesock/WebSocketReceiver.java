package com.google.firebase.database.tubesock;

import com.google.firebase.database.tubesock.MessageBuilderFactory;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
class WebSocketReceiver {
    private MessageBuilderFactory.Builder pendingBuilder;
    private WebSocket websocket;
    private DataInputStream input = null;
    private WebSocketEventHandler eventHandler = null;
    private byte[] inputHeader = new byte[112];
    private volatile boolean stop = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebSocketReceiver(WebSocket webSocket) {
        this.websocket = null;
        this.websocket = webSocket;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setInput(DataInputStream dataInputStream) {
        this.input = dataInputStream;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void run() {
        int read;
        boolean z;
        this.eventHandler = this.websocket.getEventHandler();
        while (!this.stop) {
            try {
                read = read(this.inputHeader, 0, 1) + 0;
                z = (this.inputHeader[0] & 128) != 0;
            } catch (WebSocketException e) {
                handleError(e);
            } catch (SocketTimeoutException unused) {
            } catch (IOException e2) {
                handleError(new WebSocketException("IO Error", e2));
            }
            if ((this.inputHeader[0] & 112) != 0) {
                throw new WebSocketException("Invalid frame received");
            }
            byte b = (byte) (this.inputHeader[0] & 15);
            int read2 = read + read(this.inputHeader, read, 1);
            byte b2 = this.inputHeader[1];
            long j = 0;
            if (b2 < 126) {
                j = b2;
            } else if (b2 == 126) {
                read(this.inputHeader, read2, 2);
                j = ((this.inputHeader[2] & 255) << 8) | (this.inputHeader[3] & 255);
            } else if (b2 == Byte.MAX_VALUE) {
                j = parseLong(this.inputHeader, (read2 + read(this.inputHeader, read2, 8)) - 8);
            }
            int i = (int) j;
            byte[] bArr = new byte[i];
            read(bArr, 0, i);
            if (b == 8) {
                this.websocket.onCloseOpReceived();
            } else if (b != 10) {
                if (b != 1 && b != 2 && b != 9 && b != 0) {
                    throw new WebSocketException("Unsupported opcode: " + ((int) b));
                }
                appendBytes(z, b, bArr);
            }
        }
    }

    private void appendBytes(boolean z, byte b, byte[] bArr) {
        if (b == 9) {
            if (z) {
                handlePing(bArr);
                return;
            }
            throw new WebSocketException("PING must not fragment across frames");
        } else if (this.pendingBuilder != null && b != 0) {
            throw new WebSocketException("Failed to continue outstanding frame");
        } else {
            if (this.pendingBuilder == null && b == 0) {
                throw new WebSocketException("Received continuing frame, but there's nothing to continue");
            }
            if (this.pendingBuilder == null) {
                this.pendingBuilder = MessageBuilderFactory.builder(b);
            }
            if (!this.pendingBuilder.appendBytes(bArr)) {
                throw new WebSocketException("Failed to decode frame");
            }
            if (z) {
                WebSocketMessage message = this.pendingBuilder.toMessage();
                this.pendingBuilder = null;
                if (message == null) {
                    throw new WebSocketException("Failed to decode whole message");
                }
                this.eventHandler.onMessage(message);
            }
        }
    }

    private void handlePing(byte[] bArr) {
        if (bArr.length <= 125) {
            this.websocket.pong(bArr);
            return;
        }
        throw new WebSocketException("PING frame too long");
    }

    private long parseLong(byte[] bArr, int i) {
        return (bArr[i + 0] << 56) + ((bArr[i + 1] & 255) << 48) + ((bArr[i + 2] & 255) << 40) + ((bArr[i + 3] & 255) << 32) + ((bArr[i + 4] & 255) << 24) + ((bArr[i + 5] & 255) << 16) + ((bArr[i + 6] & 255) << 8) + ((bArr[i + 7] & 255) << 0);
    }

    private int read(byte[] bArr, int i, int i2) throws IOException {
        this.input.readFully(bArr, i, i2);
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void stopit() {
        this.stop = true;
    }

    boolean isRunning() {
        return !this.stop;
    }

    private void handleError(WebSocketException webSocketException) {
        stopit();
        this.websocket.handleReceiverError(webSocketException);
    }
}
