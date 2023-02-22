package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzms extends zzmy {
    private zzmr zzbeb;
    private final SparseArray<Map<zzmk, zzmu>> zzbdz = new SparseArray<>();
    private final SparseBooleanArray zzbea = new SparseBooleanArray();
    private int zzagf = 0;

    protected abstract zzmt[] zza(zzgw[] zzgwVarArr, zzmk[] zzmkVarArr, int[][][] iArr) throws zzgd;

    public final void zzf(int i, boolean z) {
        if (this.zzbea.get(i) == z) {
            return;
        }
        this.zzbea.put(i, z);
        invalidate();
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final zzna zza(zzgw[] zzgwVarArr, zzmk zzmkVar) throws zzgd {
        int[] iArr;
        int[] iArr2 = new int[zzgwVarArr.length + 1];
        int length = zzgwVarArr.length + 1;
        zzmh[][] zzmhVarArr = new zzmh[length];
        int[][][] iArr3 = new int[zzgwVarArr.length + 1][];
        for (int i = 0; i < length; i++) {
            zzmhVarArr[i] = new zzmh[zzmkVar.length];
            iArr3[i] = new int[zzmkVar.length];
        }
        int length2 = zzgwVarArr.length;
        int[] iArr4 = new int[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            iArr4[i2] = zzgwVarArr[i2].zzdq();
        }
        for (int i3 = 0; i3 < zzmkVar.length; i3++) {
            zzmh zzav = zzmkVar.zzav(i3);
            int length3 = zzgwVarArr.length;
            int i4 = 0;
            for (int i5 = 0; i5 < zzgwVarArr.length; i5++) {
                zzgw zzgwVar = zzgwVarArr[i5];
                for (int i6 = 0; i6 < zzav.length; i6++) {
                    int zza = zzgwVar.zza(zzav.zzau(i6)) & 3;
                    if (zza > i4) {
                        length3 = i5;
                        if (zza == 3) {
                            break;
                        }
                        i4 = zza;
                    }
                }
            }
            if (length3 == zzgwVarArr.length) {
                iArr = new int[zzav.length];
            } else {
                zzgw zzgwVar2 = zzgwVarArr[length3];
                int[] iArr5 = new int[zzav.length];
                for (int i7 = 0; i7 < zzav.length; i7++) {
                    iArr5[i7] = zzgwVar2.zza(zzav.zzau(i7));
                }
                iArr = iArr5;
            }
            int i8 = iArr2[length3];
            zzmhVarArr[length3][i8] = zzav;
            iArr3[length3][i8] = iArr;
            iArr2[length3] = iArr2[length3] + 1;
        }
        zzmk[] zzmkVarArr = new zzmk[zzgwVarArr.length];
        int[] iArr6 = new int[zzgwVarArr.length];
        for (int i9 = 0; i9 < zzgwVarArr.length; i9++) {
            int i10 = iArr2[i9];
            zzmkVarArr[i9] = new zzmk((zzmh[]) Arrays.copyOf(zzmhVarArr[i9], i10));
            iArr3[i9] = (int[][]) Arrays.copyOf(iArr3[i9], i10);
            iArr6[i9] = zzgwVarArr[i9].getTrackType();
        }
        zzmk zzmkVar2 = new zzmk((zzmh[]) Arrays.copyOf(zzmhVarArr[zzgwVarArr.length], iArr2[zzgwVarArr.length]));
        zzmt[] zza2 = zza(zzgwVarArr, zzmkVarArr, iArr3);
        int i11 = 0;
        while (true) {
            if (i11 < zzgwVarArr.length) {
                if (this.zzbea.get(i11)) {
                    zza2[i11] = null;
                } else {
                    zzmk zzmkVar3 = zzmkVarArr[i11];
                    Map<zzmk, zzmu> map = this.zzbdz.get(i11);
                    if ((map != null ? map.get(zzmkVar3) : null) != null) {
                        throw new NoSuchMethodError();
                    }
                }
                i11++;
            } else {
                zzmr zzmrVar = new zzmr(iArr6, zzmkVarArr, iArr4, iArr3, zzmkVar2);
                zzgz[] zzgzVarArr = new zzgz[zzgwVarArr.length];
                for (int i12 = 0; i12 < zzgwVarArr.length; i12++) {
                    zzgzVarArr[i12] = zza2[i12] != null ? zzgz.zzage : null;
                }
                return new zzna(zzmkVar, new zzmv(zza2), zzmrVar, zzgzVarArr);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final void zzd(Object obj) {
        this.zzbeb = (zzmr) obj;
    }
}
