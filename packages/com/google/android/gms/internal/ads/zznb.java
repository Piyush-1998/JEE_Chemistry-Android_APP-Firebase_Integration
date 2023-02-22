package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zznb implements zzne {
    private final byte[] data;
    private Uri uri;
    private int zzbei;
    private int zzbej;

    public zznb(byte[] bArr) {
        zznr.checkNotNull(bArr);
        zznr.checkArgument(bArr.length > 0);
        this.data = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final long zza(zznf zznfVar) throws IOException {
        this.uri = zznfVar.uri;
        this.zzbei = (int) zznfVar.zzamq;
        int length = (int) (zznfVar.zzcb == -1 ? this.data.length - zznfVar.zzamq : zznfVar.zzcb);
        this.zzbej = length;
        if (length <= 0 || this.zzbei + length > this.data.length) {
            int i = this.zzbei;
            long j = zznfVar.zzcb;
            int length2 = this.data.length;
            StringBuilder sb = new StringBuilder(77);
            sb.append("Unsatisfiable range: [");
            sb.append(i);
            sb.append(", ");
            sb.append(j);
            sb.append("], length: ");
            sb.append(length2);
            throw new IOException(sb.toString());
        }
        return length;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zzbej;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.data, this.zzbei, bArr, i, min);
        this.zzbei += min;
        this.zzbej -= min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final Uri getUri() {
        return this.uri;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void close() throws IOException {
        this.uri = null;
    }
}
