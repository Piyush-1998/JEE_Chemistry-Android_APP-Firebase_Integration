package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.zznq;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zznn<T extends zznq> extends Handler implements Runnable {
    private volatile boolean zzaei;
    private final T zzbfr;
    private final zzno<T> zzbfs;
    public final int zzbft;
    private final long zzbfu;
    private IOException zzbfv;
    private int zzbfw;
    private volatile Thread zzbfx;
    private final /* synthetic */ zznl zzbfy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zznn(zznl zznlVar, Looper looper, T t, zzno<T> zznoVar, int i, long j) {
        super(looper);
        this.zzbfy = zznlVar;
        this.zzbfr = t;
        this.zzbfs = zznoVar;
        this.zzbft = i;
        this.zzbfu = j;
    }

    public final void zzbb(int i) throws IOException {
        IOException iOException = this.zzbfv;
        if (iOException != null && this.zzbfw > i) {
            throw iOException;
        }
    }

    public final void zzee(long j) {
        zznn zznnVar;
        zznnVar = this.zzbfy.zzbfn;
        zznr.checkState(zznnVar == null);
        this.zzbfy.zzbfn = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            execute();
        }
    }

    public final void zzk(boolean z) {
        this.zzaei = z;
        this.zzbfv = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.zzbfr.cancelLoad();
            if (this.zzbfx != null) {
                this.zzbfx.interrupt();
            }
        }
        if (z) {
            finish();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzbfs.zza((zzno<T>) this.zzbfr, elapsedRealtime, elapsedRealtime - this.zzbfu, true);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzbfx = Thread.currentThread();
            if (!this.zzbfr.zzhj()) {
                String valueOf = String.valueOf(this.zzbfr.getClass().getSimpleName());
                zzog.beginSection(valueOf.length() != 0 ? "load:".concat(valueOf) : new String("load:"));
                try {
                    this.zzbfr.zzhk();
                    zzog.endSection();
                } catch (Throwable th) {
                    zzog.endSection();
                    throw th;
                }
            }
            if (this.zzaei) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.zzaei) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            Log.e("LoadTask", "Unexpected exception loading stream", e2);
            if (this.zzaei) {
                return;
            }
            obtainMessage(3, new zznp(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e3);
            if (this.zzaei) {
                return;
            }
            obtainMessage(3, new zznp(e3)).sendToTarget();
        } catch (Error e4) {
            Log.e("LoadTask", "Unexpected error loading stream", e4);
            if (!this.zzaei) {
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        } catch (InterruptedException unused) {
            zznr.checkState(this.zzbfr.zzhj());
            if (this.zzaei) {
                return;
            }
            sendEmptyMessage(2);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzaei) {
            return;
        }
        if (message.what == 0) {
            execute();
        } else if (message.what == 4) {
            throw ((Error) message.obj);
        } else {
            finish();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.zzbfu;
            if (this.zzbfr.zzhj()) {
                this.zzbfs.zza((zzno<T>) this.zzbfr, elapsedRealtime, j, false);
                return;
            }
            int i = message.what;
            if (i == 1) {
                this.zzbfs.zza((zzno<T>) this.zzbfr, elapsedRealtime, j, false);
            } else if (i == 2) {
                this.zzbfs.zza(this.zzbfr, elapsedRealtime, j);
            } else if (i != 3) {
            } else {
                IOException iOException = (IOException) message.obj;
                this.zzbfv = iOException;
                int zza = this.zzbfs.zza((zzno<T>) this.zzbfr, elapsedRealtime, j, iOException);
                if (zza == 3) {
                    this.zzbfy.zzbfo = this.zzbfv;
                } else if (zza != 2) {
                    int i2 = zza == 1 ? 1 : this.zzbfw + 1;
                    this.zzbfw = i2;
                    zzee(Math.min((i2 - 1) * 1000, 5000));
                }
            }
        }
    }

    private final void execute() {
        ExecutorService executorService;
        zznn zznnVar;
        this.zzbfv = null;
        executorService = this.zzbfy.zzbfm;
        zznnVar = this.zzbfy.zzbfn;
        executorService.execute(zznnVar);
    }

    private final void finish() {
        this.zzbfy.zzbfn = null;
    }
}
