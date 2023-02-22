package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzey;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzhs {
    private static final zzhs zzaly = new zzhs(0, new int[0], new Object[0], false);
    private int count;
    private boolean zzacz;
    private int zzaia;
    private Object[] zzakk;
    private int[] zzalz;

    public static zzhs zzwq() {
        return zzaly;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzhs zzwr() {
        return new zzhs();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzhs zza(zzhs zzhsVar, zzhs zzhsVar2) {
        int i = zzhsVar.count + zzhsVar2.count;
        int[] copyOf = Arrays.copyOf(zzhsVar.zzalz, i);
        System.arraycopy(zzhsVar2.zzalz, 0, copyOf, zzhsVar.count, zzhsVar2.count);
        Object[] copyOf2 = Arrays.copyOf(zzhsVar.zzakk, i);
        System.arraycopy(zzhsVar2.zzakk, 0, copyOf2, zzhsVar.count, zzhsVar2.count);
        return new zzhs(i, copyOf, copyOf2, true);
    }

    private zzhs() {
        this(0, new int[8], new Object[8], true);
    }

    private zzhs(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zzaia = -1;
        this.count = i;
        this.zzalz = iArr;
        this.zzakk = objArr;
        this.zzacz = z;
    }

    public final void zzry() {
        this.zzacz = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzim zzimVar) throws IOException {
        if (zzimVar.zztk() == zzey.zzd.zzaip) {
            for (int i = this.count - 1; i >= 0; i--) {
                zzimVar.zza(this.zzalz[i] >>> 3, this.zzakk[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.count; i2++) {
            zzimVar.zza(this.zzalz[i2] >>> 3, this.zzakk[i2]);
        }
    }

    public final void zzb(zzim zzimVar) throws IOException {
        if (this.count == 0) {
            return;
        }
        if (zzimVar.zztk() == zzey.zzd.zzaio) {
            for (int i = 0; i < this.count; i++) {
                zzb(this.zzalz[i], this.zzakk[i], zzimVar);
            }
            return;
        }
        for (int i2 = this.count - 1; i2 >= 0; i2--) {
            zzb(this.zzalz[i2], this.zzakk[i2], zzimVar);
        }
    }

    private static void zzb(int i, Object obj, zzim zzimVar) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zzimVar.zzi(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            zzimVar.zzc(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            zzimVar.zza(i2, (zzdp) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                zzimVar.zzf(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzfi.zzuy());
        } else if (zzimVar.zztk() == zzey.zzd.zzaio) {
            zzimVar.zzbr(i2);
            ((zzhs) obj).zzb(zzimVar);
            zzimVar.zzbs(i2);
        } else {
            zzimVar.zzbs(i2);
            ((zzhs) obj).zzb(zzimVar);
            zzimVar.zzbr(i2);
        }
    }

    public final int zzws() {
        int i = this.zzaia;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            i2 += zzee.zzd(this.zzalz[i3] >>> 3, (zzdp) this.zzakk[i3]);
        }
        this.zzaia = i2;
        return i2;
    }

    public final int zzuk() {
        int zze;
        int i = this.zzaia;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            int i4 = this.zzalz[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                zze = zzee.zze(i5, ((Long) this.zzakk[i3]).longValue());
            } else if (i6 == 1) {
                zze = zzee.zzg(i5, ((Long) this.zzakk[i3]).longValue());
            } else if (i6 == 2) {
                zze = zzee.zzc(i5, (zzdp) this.zzakk[i3]);
            } else if (i6 == 3) {
                zze = (zzee.zzbi(i5) << 1) + ((zzhs) this.zzakk[i3]).zzuk();
            } else if (i6 == 5) {
                zze = zzee.zzj(i5, ((Integer) this.zzakk[i3]).intValue());
            } else {
                throw new IllegalStateException(zzfi.zzuy());
            }
            i2 += zze;
        }
        this.zzaia = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzhs)) {
            zzhs zzhsVar = (zzhs) obj;
            int i = this.count;
            if (i == zzhsVar.count) {
                int[] iArr = this.zzalz;
                int[] iArr2 = zzhsVar.zzalz;
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
                    Object[] objArr = this.zzakk;
                    Object[] objArr2 = zzhsVar.zzakk;
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
        int[] iArr = this.zzalz;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.zzakk;
        int i7 = this.count;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            zzgj.zzb(sb, i, String.valueOf(this.zzalz[i2] >>> 3), this.zzakk[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(int i, Object obj) {
        if (!this.zzacz) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.count;
        if (i2 == this.zzalz.length) {
            int i3 = this.count + (i2 < 4 ? 8 : i2 >> 1);
            this.zzalz = Arrays.copyOf(this.zzalz, i3);
            this.zzakk = Arrays.copyOf(this.zzakk, i3);
        }
        int[] iArr = this.zzalz;
        int i4 = this.count;
        iArr[i4] = i;
        this.zzakk[i4] = obj;
        this.count = i4 + 1;
    }
}
