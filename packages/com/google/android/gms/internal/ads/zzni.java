package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzni implements zznc {
    private final boolean zzbfd;
    private final int zzbfe;
    private final byte[] zzbff;
    private final zzmz[] zzbfg;
    private int zzbfh;
    private int zzbfi;
    private int zzbfj;
    private zzmz[] zzbfk;

    public zzni(boolean z, int i) {
        this(true, 65536, 0);
    }

    private zzni(boolean z, int i, int i2) {
        zznr.checkArgument(true);
        zznr.checkArgument(true);
        this.zzbfd = true;
        this.zzbfe = 65536;
        this.zzbfj = 0;
        this.zzbfk = new zzmz[100];
        this.zzbff = null;
        this.zzbfg = new zzmz[1];
    }

    public final synchronized void reset() {
        if (this.zzbfd) {
            zzba(0);
        }
    }

    public final synchronized void zzba(int i) {
        boolean z = i < this.zzbfh;
        this.zzbfh = i;
        if (z) {
            zzm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final synchronized zzmz zzhz() {
        zzmz zzmzVar;
        this.zzbfi++;
        if (this.zzbfj > 0) {
            zzmz[] zzmzVarArr = this.zzbfk;
            int i = this.zzbfj - 1;
            this.zzbfj = i;
            zzmzVar = zzmzVarArr[i];
            this.zzbfk[i] = null;
        } else {
            zzmzVar = new zzmz(new byte[this.zzbfe], 0);
        }
        return zzmzVar;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final synchronized void zza(zzmz zzmzVar) {
        this.zzbfg[0] = zzmzVar;
        zza(this.zzbfg);
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final synchronized void zza(zzmz[] zzmzVarArr) {
        boolean z;
        if (this.zzbfj + zzmzVarArr.length >= this.zzbfk.length) {
            this.zzbfk = (zzmz[]) Arrays.copyOf(this.zzbfk, Math.max(this.zzbfk.length << 1, this.zzbfj + zzmzVarArr.length));
        }
        for (zzmz zzmzVar : zzmzVarArr) {
            if (zzmzVar.data != null && zzmzVar.data.length != this.zzbfe) {
                z = false;
                zznr.checkArgument(z);
                zzmz[] zzmzVarArr2 = this.zzbfk;
                int i = this.zzbfj;
                this.zzbfj = i + 1;
                zzmzVarArr2[i] = zzmzVar;
            }
            z = true;
            zznr.checkArgument(z);
            zzmz[] zzmzVarArr22 = this.zzbfk;
            int i2 = this.zzbfj;
            this.zzbfj = i2 + 1;
            zzmzVarArr22[i2] = zzmzVar;
        }
        this.zzbfi -= zzmzVarArr.length;
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final synchronized void zzm() {
        int max = Math.max(0, zzof.zze(this.zzbfh, this.zzbfe) - this.zzbfi);
        if (max >= this.zzbfj) {
            return;
        }
        Arrays.fill(this.zzbfk, max, this.zzbfj, (Object) null);
        this.zzbfj = max;
    }

    public final synchronized int zzid() {
        return this.zzbfi * this.zzbfe;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final int zzia() {
        return this.zzbfe;
    }
}
