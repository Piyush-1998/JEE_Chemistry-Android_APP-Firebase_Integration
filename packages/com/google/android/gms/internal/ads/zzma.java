package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzma {
    private int length;
    private int zzbbz;
    private int zzbca;
    private int zzbcb;
    private zzgo zzbcg;
    private int zzbbv = 1000;
    private int[] zzbbw = new int[1000];
    private long[] zzamv = new long[1000];
    private long[] zzamx = new long[1000];
    private int[] zzavk = new int[1000];
    private int[] zzamu = new int[1000];
    private zzjg[] zzbbx = new zzjg[1000];
    private zzgo[] zzbby = new zzgo[1000];
    private long zzbcc = Long.MIN_VALUE;
    private long zzbcd = Long.MIN_VALUE;
    private boolean zzbcf = true;
    private boolean zzbce = true;

    public final void zzhn() {
        this.zzbbz = 0;
        this.zzbca = 0;
        this.zzbcb = 0;
        this.length = 0;
        this.zzbce = true;
    }

    public final void zzho() {
        this.zzbcc = Long.MIN_VALUE;
        this.zzbcd = Long.MIN_VALUE;
    }

    public final int zzhp() {
        return this.zzbbz + this.length;
    }

    public final synchronized boolean zzhq() {
        return this.length != 0;
    }

    public final synchronized zzgo zzhr() {
        if (this.zzbcf) {
            return null;
        }
        return this.zzbcg;
    }

    public final synchronized long zzhh() {
        return Math.max(this.zzbcc, this.zzbcd);
    }

    public final synchronized int zza(zzgq zzgqVar, zzik zzikVar, boolean z, boolean z2, zzgo zzgoVar, zzlz zzlzVar) {
        if (!zzhq()) {
            if (z2) {
                zzikVar.setFlags(4);
                return -4;
            } else if (this.zzbcg == null || (!z && this.zzbcg == zzgoVar)) {
                return -3;
            } else {
                zzgqVar.zzafx = this.zzbcg;
                return -5;
            }
        }
        if (!z && this.zzbby[this.zzbca] == zzgoVar) {
            if (zzikVar.zzcq == null) {
                return -3;
            }
            zzikVar.zzamb = this.zzamx[this.zzbca];
            zzikVar.setFlags(this.zzavk[this.zzbca]);
            zzlzVar.size = this.zzamu[this.zzbca];
            zzlzVar.zzauv = this.zzamv[this.zzbca];
            zzlzVar.zzapp = this.zzbbx[this.zzbca];
            this.zzbcc = Math.max(this.zzbcc, zzikVar.zzamb);
            this.length--;
            int i = this.zzbca + 1;
            this.zzbca = i;
            this.zzbbz++;
            if (i == this.zzbbv) {
                this.zzbca = 0;
            }
            zzlzVar.zzbbu = this.length > 0 ? this.zzamv[this.zzbca] : zzlzVar.zzauv + zzlzVar.size;
            return -4;
        }
        zzgqVar.zzafx = this.zzbby[this.zzbca];
        return -5;
    }

    public final synchronized long zzhs() {
        if (zzhq()) {
            int i = ((this.zzbca + this.length) - 1) % this.zzbbv;
            this.zzbca = (this.zzbca + this.length) % this.zzbbv;
            this.zzbbz += this.length;
            this.length = 0;
            return this.zzamv[i] + this.zzamu[i];
        }
        return -1L;
    }

    public final synchronized long zzd(long j, boolean z) {
        if (zzhq() && j >= this.zzamx[this.zzbca]) {
            if (j <= this.zzbcd || z) {
                int i = 0;
                int i2 = this.zzbca;
                int i3 = -1;
                while (i2 != this.zzbcb && this.zzamx[i2] <= j) {
                    if ((this.zzavk[i2] & 1) != 0) {
                        i3 = i;
                    }
                    i2 = (i2 + 1) % this.zzbbv;
                    i++;
                }
                if (i3 == -1) {
                    return -1L;
                }
                int i4 = (this.zzbca + i3) % this.zzbbv;
                this.zzbca = i4;
                this.zzbbz += i3;
                this.length -= i3;
                return this.zzamv[i4];
            }
            return -1L;
        }
        return -1L;
    }

    public final synchronized boolean zzg(zzgo zzgoVar) {
        if (zzgoVar == null) {
            this.zzbcf = true;
            return false;
        }
        this.zzbcf = false;
        if (zzof.zza(zzgoVar, this.zzbcg)) {
            return false;
        }
        this.zzbcg = zzgoVar;
        return true;
    }

    public final synchronized void zza(long j, int i, long j2, int i2, zzjg zzjgVar) {
        if (this.zzbce) {
            if ((i & 1) == 0) {
                return;
            }
            this.zzbce = false;
        }
        zznr.checkState(!this.zzbcf);
        zzec(j);
        this.zzamx[this.zzbcb] = j;
        this.zzamv[this.zzbcb] = j2;
        this.zzamu[this.zzbcb] = i2;
        this.zzavk[this.zzbcb] = i;
        this.zzbbx[this.zzbcb] = zzjgVar;
        this.zzbby[this.zzbcb] = this.zzbcg;
        this.zzbbw[this.zzbcb] = 0;
        int i3 = this.length + 1;
        this.length = i3;
        if (i3 == this.zzbbv) {
            int i4 = this.zzbbv + 1000;
            int[] iArr = new int[i4];
            long[] jArr = new long[i4];
            long[] jArr2 = new long[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            zzjg[] zzjgVarArr = new zzjg[i4];
            zzgo[] zzgoVarArr = new zzgo[i4];
            int i5 = this.zzbbv - this.zzbca;
            System.arraycopy(this.zzamv, this.zzbca, jArr, 0, i5);
            System.arraycopy(this.zzamx, this.zzbca, jArr2, 0, i5);
            System.arraycopy(this.zzavk, this.zzbca, iArr2, 0, i5);
            System.arraycopy(this.zzamu, this.zzbca, iArr3, 0, i5);
            System.arraycopy(this.zzbbx, this.zzbca, zzjgVarArr, 0, i5);
            System.arraycopy(this.zzbby, this.zzbca, zzgoVarArr, 0, i5);
            System.arraycopy(this.zzbbw, this.zzbca, iArr, 0, i5);
            int i6 = this.zzbca;
            System.arraycopy(this.zzamv, 0, jArr, i5, i6);
            System.arraycopy(this.zzamx, 0, jArr2, i5, i6);
            System.arraycopy(this.zzavk, 0, iArr2, i5, i6);
            System.arraycopy(this.zzamu, 0, iArr3, i5, i6);
            System.arraycopy(this.zzbbx, 0, zzjgVarArr, i5, i6);
            System.arraycopy(this.zzbby, 0, zzgoVarArr, i5, i6);
            System.arraycopy(this.zzbbw, 0, iArr, i5, i6);
            this.zzamv = jArr;
            this.zzamx = jArr2;
            this.zzavk = iArr2;
            this.zzamu = iArr3;
            this.zzbbx = zzjgVarArr;
            this.zzbby = zzgoVarArr;
            this.zzbbw = iArr;
            this.zzbca = 0;
            this.zzbcb = this.zzbbv;
            this.length = this.zzbbv;
            this.zzbbv = i4;
            return;
        }
        int i7 = this.zzbcb + 1;
        this.zzbcb = i7;
        if (i7 == this.zzbbv) {
            this.zzbcb = 0;
        }
    }

    public final synchronized void zzec(long j) {
        this.zzbcd = Math.max(this.zzbcd, j);
    }
}
