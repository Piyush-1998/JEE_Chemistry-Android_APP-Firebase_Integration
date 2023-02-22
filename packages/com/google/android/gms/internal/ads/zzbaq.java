package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzbaq implements zzdvn {
    private final ByteBuffer zzakm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbaq(ByteBuffer byteBuffer) {
        this.zzakm = byteBuffer.duplicate();
    }

    @Override // com.google.android.gms.internal.ads.zzdvn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzdvn
    public final int read(ByteBuffer byteBuffer) throws IOException {
        if (this.zzakm.remaining() != 0 || byteBuffer.remaining() <= 0) {
            int min = Math.min(byteBuffer.remaining(), this.zzakm.remaining());
            byte[] bArr = new byte[min];
            this.zzakm.get(bArr);
            byteBuffer.put(bArr);
            return min;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdvn
    public final long size() throws IOException {
        return this.zzakm.limit();
    }

    @Override // com.google.android.gms.internal.ads.zzdvn
    public final long position() throws IOException {
        return this.zzakm.position();
    }

    @Override // com.google.android.gms.internal.ads.zzdvn
    public final void zzew(long j) throws IOException {
        this.zzakm.position((int) j);
    }

    @Override // com.google.android.gms.internal.ads.zzdvn
    public final ByteBuffer zzh(long j, long j2) throws IOException {
        int position = this.zzakm.position();
        this.zzakm.position((int) j);
        ByteBuffer slice = this.zzakm.slice();
        slice.limit((int) j2);
        this.zzakm.position(position);
        return slice;
    }
}
