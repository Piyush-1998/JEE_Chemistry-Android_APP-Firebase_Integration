package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzlw implements zzlr, zzls {
    private zzmk zzadf;
    private zzlr zzbaf;
    public final zzls[] zzbbm;
    private final IdentityHashMap<zzmd, Integer> zzbbn = new IdentityHashMap<>();
    private int zzbbo;
    private zzls[] zzbbp;
    private zzmg zzbbq;

    public zzlw(zzls... zzlsVarArr) {
        this.zzbbm = zzlsVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zza(zzlr zzlrVar, long j) {
        this.zzbaf = zzlrVar;
        zzls[] zzlsVarArr = this.zzbbm;
        this.zzbbo = zzlsVarArr.length;
        for (zzls zzlsVar : zzlsVarArr) {
            zzlsVar.zza(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzha() throws IOException {
        for (zzls zzlsVar : this.zzbbm) {
            zzlsVar.zzha();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final zzmk zzhb() {
        return this.zzadf;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final long zza(zzmt[] zzmtVarArr, boolean[] zArr, zzmd[] zzmdVarArr, boolean[] zArr2, long j) {
        zzmd[] zzmdVarArr2 = zzmdVarArr;
        int[] iArr = new int[zzmtVarArr.length];
        int[] iArr2 = new int[zzmtVarArr.length];
        for (int i = 0; i < zzmtVarArr.length; i++) {
            iArr[i] = zzmdVarArr2[i] == null ? -1 : this.zzbbn.get(zzmdVarArr2[i]).intValue();
            iArr2[i] = -1;
            if (zzmtVarArr[i] != null) {
                zzmh zzhx = zzmtVarArr[i].zzhx();
                int i2 = 0;
                while (true) {
                    zzls[] zzlsVarArr = this.zzbbm;
                    if (i2 >= zzlsVarArr.length) {
                        break;
                    } else if (zzlsVarArr[i2].zzhb().zza(zzhx) != -1) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        this.zzbbn.clear();
        int length = zzmtVarArr.length;
        zzmd[] zzmdVarArr3 = new zzmd[length];
        zzmd[] zzmdVarArr4 = new zzmd[zzmtVarArr.length];
        zzmt[] zzmtVarArr2 = new zzmt[zzmtVarArr.length];
        ArrayList arrayList = new ArrayList(this.zzbbm.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.zzbbm.length) {
            for (int i4 = 0; i4 < zzmtVarArr.length; i4++) {
                zzmt zzmtVar = null;
                zzmdVarArr4[i4] = iArr[i4] == i3 ? zzmdVarArr2[i4] : null;
                if (iArr2[i4] == i3) {
                    zzmtVar = zzmtVarArr[i4];
                }
                zzmtVarArr2[i4] = zzmtVar;
            }
            int i5 = i3;
            zzmt[] zzmtVarArr3 = zzmtVarArr2;
            ArrayList arrayList2 = arrayList;
            long zza = this.zzbbm[i3].zza(zzmtVarArr2, zArr, zzmdVarArr4, zArr2, j2);
            if (i5 == 0) {
                j2 = zza;
            } else if (zza != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i6 = 0; i6 < zzmtVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    zznr.checkState(zzmdVarArr4[i6] != null);
                    zzmdVarArr3[i6] = zzmdVarArr4[i6];
                    this.zzbbn.put(zzmdVarArr4[i6], Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    zznr.checkState(zzmdVarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zzbbm[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            zzmtVarArr2 = zzmtVarArr3;
            zzmdVarArr2 = zzmdVarArr;
        }
        zzmd[] zzmdVarArr5 = zzmdVarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzmdVarArr3, 0, zzmdVarArr5, 0, length);
        zzls[] zzlsVarArr2 = new zzls[arrayList3.size()];
        this.zzbbp = zzlsVarArr2;
        arrayList3.toArray(zzlsVarArr2);
        this.zzbbq = new zzlf(this.zzbbp);
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzdz(long j) {
        for (zzls zzlsVar : this.zzbbp) {
            zzlsVar.zzdz(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzls, com.google.android.gms.internal.ads.zzmg
    public final boolean zzdy(long j) {
        return this.zzbbq.zzdy(j);
    }

    @Override // com.google.android.gms.internal.ads.zzls, com.google.android.gms.internal.ads.zzmg
    public final long zzgz() {
        return this.zzbbq.zzgz();
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final long zzhc() {
        zzls[] zzlsVarArr;
        long zzhc = this.zzbbm[0].zzhc();
        int i = 1;
        while (true) {
            zzls[] zzlsVarArr2 = this.zzbbm;
            if (i >= zzlsVarArr2.length) {
                if (zzhc != -9223372036854775807L) {
                    for (zzls zzlsVar : this.zzbbp) {
                        if (zzlsVar != this.zzbbm[0] && zzlsVar.zzea(zzhc) != zzhc) {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return zzhc;
            } else if (zzlsVarArr2[i].zzhc() != -9223372036854775807L) {
                throw new IllegalStateException("Child reported discontinuity");
            } else {
                i++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final long zzhd() {
        long j = Long.MAX_VALUE;
        for (zzls zzlsVar : this.zzbbp) {
            long zzhd = zzlsVar.zzhd();
            if (zzhd != Long.MIN_VALUE) {
                j = Math.min(j, zzhd);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final long zzea(long j) {
        long zzea = this.zzbbp[0].zzea(j);
        int i = 1;
        while (true) {
            zzls[] zzlsVarArr = this.zzbbp;
            if (i >= zzlsVarArr.length) {
                return zzea;
            }
            if (zzlsVarArr[i].zzea(zzea) != zzea) {
                throw new IllegalStateException("Children seeked to different positions");
            }
            i++;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zza(zzls zzlsVar) {
        int i = this.zzbbo - 1;
        this.zzbbo = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (zzls zzlsVar2 : this.zzbbm) {
            i2 += zzlsVar2.zzhb().length;
        }
        zzmh[] zzmhVarArr = new zzmh[i2];
        int i3 = 0;
        for (zzls zzlsVar3 : this.zzbbm) {
            zzmk zzhb = zzlsVar3.zzhb();
            int i4 = zzhb.length;
            int i5 = 0;
            while (i5 < i4) {
                zzmhVarArr[i3] = zzhb.zzav(i5);
                i5++;
                i3++;
            }
        }
        this.zzadf = new zzmk(zzmhVarArr);
        this.zzbaf.zza((zzls) this);
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final /* synthetic */ void zza(zzls zzlsVar) {
        if (this.zzadf != null) {
            this.zzbaf.zza((zzlr) this);
        }
    }
}
