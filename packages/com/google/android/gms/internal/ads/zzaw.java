package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaw extends ByteArrayOutputStream {
    private final zzaj zzbw;

    public zzaw(zzaj zzajVar, int i) {
        this.zzbw = zzajVar;
        this.buf = zzajVar.zzc(Math.max(i, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zzbw.zza(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.zzbw.zza(this.buf);
    }

    private final void zzd(int i) {
        if (this.count + i <= this.buf.length) {
            return;
        }
        byte[] zzc = this.zzbw.zzc((this.count + i) << 1);
        System.arraycopy(this.buf, 0, zzc, 0, this.count);
        this.zzbw.zza(this.buf);
        this.buf = zzc;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        zzd(i2);
        super.write(bArr, i, i2);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        zzd(1);
        super.write(i);
    }
}
