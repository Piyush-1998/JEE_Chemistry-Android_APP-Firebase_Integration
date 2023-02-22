package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdtq {
    private static final zzdtq zzhop = new zzdtq(0, new int[0], new Object[0], false);
    private int count;
    private boolean zzhfr;
    private int zzhks;
    private Object[] zzhnb;
    private int[] zzhoq;

    public static zzdtq zzbbx() {
        return zzhop;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdtq zzbby() {
        return new zzdtq();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdtq zza(zzdtq zzdtqVar, zzdtq zzdtqVar2) {
        int i = zzdtqVar.count + zzdtqVar2.count;
        int[] copyOf = Arrays.copyOf(zzdtqVar.zzhoq, i);
        System.arraycopy(zzdtqVar2.zzhoq, 0, copyOf, zzdtqVar.count, zzdtqVar2.count);
        Object[] copyOf2 = Arrays.copyOf(zzdtqVar.zzhnb, i);
        System.arraycopy(zzdtqVar2.zzhnb, 0, copyOf2, zzdtqVar.count, zzdtqVar2.count);
        return new zzdtq(i, copyOf, copyOf2, true);
    }

    private zzdtq() {
        this(0, new int[8], new Object[8], true);
    }

    private zzdtq(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zzhks = -1;
        this.count = i;
        this.zzhoq = iArr;
        this.zzhnb = objArr;
        this.zzhfr = z;
    }

    public final void zzaxj() {
        this.zzhfr = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzduk zzdukVar) throws IOException {
        if (zzdukVar.zzayy() == zzdqw.zzd.zzhlh) {
            for (int i = this.count - 1; i >= 0; i--) {
                zzdukVar.zzb(this.zzhoq[i] >>> 3, this.zzhnb[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.count; i2++) {
            zzdukVar.zzb(this.zzhoq[i2] >>> 3, this.zzhnb[i2]);
        }
    }

    public final void zzb(zzduk zzdukVar) throws IOException {
        if (this.count == 0) {
            return;
        }
        if (zzdukVar.zzayy() == zzdqw.zzd.zzhlg) {
            for (int i = 0; i < this.count; i++) {
                zzb(this.zzhoq[i], this.zzhnb[i], zzdukVar);
            }
            return;
        }
        for (int i2 = this.count - 1; i2 >= 0; i2--) {
            zzb(this.zzhoq[i2], this.zzhnb[i2], zzdukVar);
        }
    }

    private static void zzb(int i, Object obj, zzduk zzdukVar) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zzdukVar.zzo(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            zzdukVar.zzi(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            zzdukVar.zza(i2, (zzdpm) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                zzdukVar.zzad(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzdrg.zzbah());
        } else if (zzdukVar.zzayy() == zzdqw.zzd.zzhlg) {
            zzdukVar.zzgm(i2);
            ((zzdtq) obj).zzb(zzdukVar);
            zzdukVar.zzgn(i2);
        } else {
            zzdukVar.zzgn(i2);
            ((zzdtq) obj).zzb(zzdukVar);
            zzdukVar.zzgm(i2);
        }
    }

    public final int zzbbz() {
        int i = this.zzhks;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            i2 += zzdqf.zzd(this.zzhoq[i3] >>> 3, (zzdpm) this.zzhnb[i3]);
        }
        this.zzhks = i2;
        return i2;
    }

    public final int zzazu() {
        int zzk;
        int i = this.zzhks;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            int i4 = this.zzhoq[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                zzk = zzdqf.zzk(i5, ((Long) this.zzhnb[i3]).longValue());
            } else if (i6 == 1) {
                zzk = zzdqf.zzm(i5, ((Long) this.zzhnb[i3]).longValue());
            } else if (i6 == 2) {
                zzk = zzdqf.zzc(i5, (zzdpm) this.zzhnb[i3]);
            } else if (i6 == 3) {
                zzk = (zzdqf.zzgd(i5) << 1) + ((zzdtq) this.zzhnb[i3]).zzazu();
            } else if (i6 == 5) {
                zzk = zzdqf.zzah(i5, ((Integer) this.zzhnb[i3]).intValue());
            } else {
                throw new IllegalStateException(zzdrg.zzbah());
            }
            i2 += zzk;
        }
        this.zzhks = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzdtq)) {
            zzdtq zzdtqVar = (zzdtq) obj;
            int i = this.count;
            if (i == zzdtqVar.count) {
                int[] iArr = this.zzhoq;
                int[] iArr2 = zzdtqVar.zzhoq;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        z = true;
                        break;
                    } else if (iArr[i2] != iArr2[i2]) {
                        z = false;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z) {
                    Object[] objArr = this.zzhnb;
                    Object[] objArr2 = zzdtqVar.zzhnb;
                    int i3 = this.count;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            z2 = true;
                            break;
                        } else if (!objArr[i4].equals(objArr2[i4])) {
                            z2 = false;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.count;
        int i2 = (i + 527) * 31;
        int[] iArr = this.zzhoq;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.zzhnb;
        int i7 = this.count;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            zzdsh.zza(sb, i, String.valueOf(this.zzhoq[i2] >>> 3), this.zzhnb[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(int i, Object obj) {
        if (!this.zzhfr) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.count;
        if (i2 == this.zzhoq.length) {
            int i3 = this.count + (i2 < 4 ? 8 : i2 >> 1);
            this.zzhoq = Arrays.copyOf(this.zzhoq, i3);
            this.zzhnb = Arrays.copyOf(this.zzhnb, i3);
        }
        int[] iArr = this.zzhoq;
        int i4 = this.count;
        iArr[i4] = i;
        this.zzhnb[i4] = obj;
        this.count = i4 + 1;
    }
}
