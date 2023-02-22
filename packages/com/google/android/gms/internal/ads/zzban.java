package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzban implements zzne {
    private Uri uri;
    private final zzne zzecx;
    private final long zzecy;
    private final zzne zzecz;
    private long zzeda;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzban(zzne zzneVar, int i, zzne zzneVar2) {
        this.zzecx = zzneVar;
        this.zzecy = i;
        this.zzecz = zzneVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final long zza(zznf zznfVar) throws IOException {
        long j;
        zznf zznfVar2;
        this.uri = zznfVar.uri;
        zznf zznfVar3 = null;
        if (zznfVar.zzamq >= this.zzecy) {
            zznfVar2 = null;
        } else {
            long j2 = zznfVar.zzamq;
            if (zznfVar.zzcb != -1) {
                j = Math.min(zznfVar.zzcb, this.zzecy - j2);
            } else {
                j = this.zzecy - j2;
            }
            zznfVar2 = new zznf(zznfVar.uri, j2, j, null);
        }
        if (zznfVar.zzcb == -1 || zznfVar.zzamq + zznfVar.zzcb > this.zzecy) {
            zznfVar3 = new zznf(zznfVar.uri, Math.max(this.zzecy, zznfVar.zzamq), zznfVar.zzcb != -1 ? Math.min(zznfVar.zzcb, (zznfVar.zzamq + zznfVar.zzcb) - this.zzecy) : -1L, null);
        }
        long zza = zznfVar2 != null ? this.zzecx.zza(zznfVar2) : 0L;
        long zza2 = zznfVar3 != null ? this.zzecz.zza(zznfVar3) : 0L;
        this.zzeda = zznfVar.zzamq;
        if (zza == -1 || zza2 == -1) {
            return -1L;
        }
        return zza + zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzeda;
        long j2 = this.zzecy;
        if (j < j2) {
            i3 = this.zzecx.read(bArr, i, (int) Math.min(i2, j2 - j));
            this.zzeda += i3;
        } else {
            i3 = 0;
        }
        if (this.zzeda >= this.zzecy) {
            int read = this.zzecz.read(bArr, i + i3, i2 - i3);
            int i4 = i3 + read;
            this.zzeda += read;
            return i4;
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final Uri getUri() {
        return this.uri;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void close() throws IOException {
        this.zzecx.close();
        this.zzecz.close();
    }
}
