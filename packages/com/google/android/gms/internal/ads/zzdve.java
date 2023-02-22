package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdut;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdve extends zzdul<zzdve> {
    public zzdut.zzb.zzg zzhvf = null;
    private zzdut.zza.zzc zzhvg = null;
    public String url = null;
    public String zzhvh = null;
    private String zzhvi = null;
    public zzdut.zzb.C0013zzb zzhvj = null;
    public zzdvh[] zzhvk = zzdvh.zzbcz();
    public String zzhvl = null;
    public zzdvi zzhvm = null;
    private Boolean zzhvn = null;
    private String[] zzhvo = zzduu.zzhrq;
    private String zzhvp = null;
    private Boolean zzhvq = null;
    private Boolean zzhvr = null;
    private byte[] zzhvs = null;
    public zzdut.zzb.zzi zzhvt = null;
    public String[] zzhvu = zzduu.zzhrq;
    public String[] zzhvv = zzduu.zzhrq;

    public zzdve() {
        this.zzhqy = null;
        this.zzhrh = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdul, com.google.android.gms.internal.ads.zzdus
    public final void zza(zzduj zzdujVar) throws IOException {
        String str = this.url;
        if (str != null) {
            zzdujVar.zzg(1, str);
        }
        String str2 = this.zzhvh;
        if (str2 != null) {
            zzdujVar.zzg(2, str2);
        }
        zzdvh[] zzdvhVarArr = this.zzhvk;
        int i = 0;
        if (zzdvhVarArr != null && zzdvhVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzdvh[] zzdvhVarArr2 = this.zzhvk;
                if (i2 >= zzdvhVarArr2.length) {
                    break;
                }
                zzdvh zzdvhVar = zzdvhVarArr2[i2];
                if (zzdvhVar != null) {
                    zzdujVar.zza(4, zzdvhVar);
                }
                i2++;
            }
        }
        String[] strArr = this.zzhvo;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.zzhvo;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str3 = strArr2[i3];
                if (str3 != null) {
                    zzdujVar.zzg(6, str3);
                }
                i3++;
            }
        }
        zzdut.zzb.zzg zzgVar = this.zzhvf;
        if (zzgVar != null && zzgVar != null) {
            zzdujVar.zzaa(10, zzgVar.zzab());
        }
        zzdut.zzb.C0013zzb c0013zzb = this.zzhvj;
        if (c0013zzb != null) {
            zzdujVar.zze(12, c0013zzb);
        }
        String str4 = this.zzhvl;
        if (str4 != null) {
            zzdujVar.zzg(13, str4);
        }
        zzdvi zzdviVar = this.zzhvm;
        if (zzdviVar != null) {
            zzdujVar.zza(14, zzdviVar);
        }
        zzdut.zzb.zzi zziVar = this.zzhvt;
        if (zziVar != null) {
            zzdujVar.zze(17, zziVar);
        }
        String[] strArr3 = this.zzhvu;
        if (strArr3 != null && strArr3.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr4 = this.zzhvu;
                if (i4 >= strArr4.length) {
                    break;
                }
                String str5 = strArr4[i4];
                if (str5 != null) {
                    zzdujVar.zzg(20, str5);
                }
                i4++;
            }
        }
        String[] strArr5 = this.zzhvv;
        if (strArr5 != null && strArr5.length > 0) {
            while (true) {
                String[] strArr6 = this.zzhvv;
                if (i >= strArr6.length) {
                    break;
                }
                String str6 = strArr6[i];
                if (str6 != null) {
                    zzdujVar.zzg(21, str6);
                }
                i++;
            }
        }
        super.zza(zzdujVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdul, com.google.android.gms.internal.ads.zzdus
    public final int zznx() {
        int zznx = super.zznx();
        String str = this.url;
        if (str != null) {
            zznx += zzduj.zzh(1, str);
        }
        String str2 = this.zzhvh;
        if (str2 != null) {
            zznx += zzduj.zzh(2, str2);
        }
        zzdvh[] zzdvhVarArr = this.zzhvk;
        int i = 0;
        if (zzdvhVarArr != null && zzdvhVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzdvh[] zzdvhVarArr2 = this.zzhvk;
                if (i2 >= zzdvhVarArr2.length) {
                    break;
                }
                zzdvh zzdvhVar = zzdvhVarArr2[i2];
                if (zzdvhVar != null) {
                    zznx += zzduj.zzb(4, zzdvhVar);
                }
                i2++;
            }
        }
        String[] strArr = this.zzhvo;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.zzhvo;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str3 = strArr2[i3];
                if (str3 != null) {
                    i5++;
                    i4 += zzduj.zzhj(str3);
                }
                i3++;
            }
            zznx = zznx + i4 + (i5 * 1);
        }
        zzdut.zzb.zzg zzgVar = this.zzhvf;
        if (zzgVar != null && zzgVar != null) {
            zznx += zzduj.zzae(10, zzgVar.zzab());
        }
        zzdut.zzb.C0013zzb c0013zzb = this.zzhvj;
        if (c0013zzb != null) {
            zznx += zzdqf.zzc(12, c0013zzb);
        }
        String str4 = this.zzhvl;
        if (str4 != null) {
            zznx += zzduj.zzh(13, str4);
        }
        zzdvi zzdviVar = this.zzhvm;
        if (zzdviVar != null) {
            zznx += zzduj.zzb(14, zzdviVar);
        }
        zzdut.zzb.zzi zziVar = this.zzhvt;
        if (zziVar != null) {
            zznx += zzdqf.zzc(17, zziVar);
        }
        String[] strArr3 = this.zzhvu;
        if (strArr3 != null && strArr3.length > 0) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                String[] strArr4 = this.zzhvu;
                if (i6 >= strArr4.length) {
                    break;
                }
                String str5 = strArr4[i6];
                if (str5 != null) {
                    i8++;
                    i7 += zzduj.zzhj(str5);
                }
                i6++;
            }
            zznx = zznx + i7 + (i8 * 2);
        }
        String[] strArr5 = this.zzhvv;
        if (strArr5 == null || strArr5.length <= 0) {
            return zznx;
        }
        int i9 = 0;
        int i10 = 0;
        while (true) {
            String[] strArr6 = this.zzhvv;
            if (i >= strArr6.length) {
                return zznx + i9 + (i10 * 2);
            }
            String str6 = strArr6[i];
            if (str6 != null) {
                i10++;
                i9 += zzduj.zzhj(str6);
            }
            i++;
        }
    }
}
