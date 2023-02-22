package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdut;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdvh extends zzdul<zzdvh> {
    private static volatile zzdvh[] zzhwb;
    public Integer zzhwc = null;
    public String url = null;
    public zzdvg zzhwd = null;
    private zzdvf zzhwe = null;
    private Integer zzhwf = null;
    private int[] zzhwg = zzduu.zzhmz;
    private String zzhwh = null;
    public zzdut.zzb.zzh.zza zzhwi = null;
    public String[] zzhwj = zzduu.zzhrq;

    public static zzdvh[] zzbcz() {
        if (zzhwb == null) {
            synchronized (zzdup.zzhre) {
                if (zzhwb == null) {
                    zzhwb = new zzdvh[0];
                }
            }
        }
        return zzhwb;
    }

    public zzdvh() {
        this.zzhqy = null;
        this.zzhrh = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdul, com.google.android.gms.internal.ads.zzdus
    public final void zza(zzduj zzdujVar) throws IOException {
        zzdujVar.zzaa(1, this.zzhwc.intValue());
        String str = this.url;
        if (str != null) {
            zzdujVar.zzg(2, str);
        }
        zzdvg zzdvgVar = this.zzhwd;
        if (zzdvgVar != null) {
            zzdujVar.zza(3, zzdvgVar);
        }
        int[] iArr = this.zzhwg;
        int i = 0;
        if (iArr != null && iArr.length > 0) {
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.zzhwg;
                if (i2 >= iArr2.length) {
                    break;
                }
                zzdujVar.zzaa(6, iArr2[i2]);
                i2++;
            }
        }
        zzdut.zzb.zzh.zza zzaVar = this.zzhwi;
        if (zzaVar != null && zzaVar != null) {
            zzdujVar.zzaa(8, zzaVar.zzab());
        }
        String[] strArr = this.zzhwj;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.zzhwj;
                if (i >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i];
                if (str2 != null) {
                    zzdujVar.zzg(9, str2);
                }
                i++;
            }
        }
        super.zza(zzdujVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdul, com.google.android.gms.internal.ads.zzdus
    public final int zznx() {
        int[] iArr;
        int zznx = super.zznx() + zzduj.zzae(1, this.zzhwc.intValue());
        String str = this.url;
        if (str != null) {
            zznx += zzduj.zzh(2, str);
        }
        zzdvg zzdvgVar = this.zzhwd;
        if (zzdvgVar != null) {
            zznx += zzduj.zzb(3, zzdvgVar);
        }
        int[] iArr2 = this.zzhwg;
        int i = 0;
        if (iArr2 != null && iArr2.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                iArr = this.zzhwg;
                if (i2 >= iArr.length) {
                    break;
                }
                i3 += zzduj.zzge(iArr[i2]);
                i2++;
            }
            zznx = zznx + i3 + (iArr.length * 1);
        }
        zzdut.zzb.zzh.zza zzaVar = this.zzhwi;
        if (zzaVar != null && zzaVar != null) {
            zznx += zzduj.zzae(8, zzaVar.zzab());
        }
        String[] strArr = this.zzhwj;
        if (strArr == null || strArr.length <= 0) {
            return zznx;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String[] strArr2 = this.zzhwj;
            if (i >= strArr2.length) {
                return zznx + i4 + (i5 * 1);
            }
            String str2 = strArr2[i];
            if (str2 != null) {
                i5++;
                i4 += zzduj.zzhj(str2);
            }
            i++;
        }
    }
}
