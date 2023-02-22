package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzsp;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzth extends zzdul<zzth> {
    public Integer zzbzs = null;
    private zzsv zzbzt = null;
    private zzsp.zzc zzbzu = null;
    public zztg zzbzv = null;
    private zzsp.zzb[] zzbzw = new zzsp.zzb[0];
    private zzsp.zzd zzbzx = null;
    private zzsp.zzk zzbzy = null;
    private zzsp.zzi zzbzz = null;
    private zzsp.zzf zzcaa = null;
    private zzsp.zzg zzcab = null;
    private zztn[] zzcac = zztn.zzny();

    public zzth() {
        this.zzhqy = null;
        this.zzhrh = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdul, com.google.android.gms.internal.ads.zzdus
    public final void zza(zzduj zzdujVar) throws IOException {
        Integer num = this.zzbzs;
        if (num != null) {
            zzdujVar.zzaa(7, num.intValue());
        }
        zztg zztgVar = this.zzbzv;
        if (zztgVar != null) {
            zzdujVar.zza(10, zztgVar);
        }
        zzsp.zzb[] zzbVarArr = this.zzbzw;
        int i = 0;
        if (zzbVarArr != null && zzbVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzsp.zzb[] zzbVarArr2 = this.zzbzw;
                if (i2 >= zzbVarArr2.length) {
                    break;
                }
                zzsp.zzb zzbVar = zzbVarArr2[i2];
                if (zzbVar != null) {
                    zzdujVar.zze(11, zzbVar);
                }
                i2++;
            }
        }
        zztn[] zztnVarArr = this.zzcac;
        if (zztnVarArr != null && zztnVarArr.length > 0) {
            while (true) {
                zztn[] zztnVarArr2 = this.zzcac;
                if (i >= zztnVarArr2.length) {
                    break;
                }
                zztn zztnVar = zztnVarArr2[i];
                if (zztnVar != null) {
                    zzdujVar.zza(17, zztnVar);
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
        Integer num = this.zzbzs;
        if (num != null) {
            zznx += zzduj.zzae(7, num.intValue());
        }
        zztg zztgVar = this.zzbzv;
        if (zztgVar != null) {
            zznx += zzduj.zzb(10, zztgVar);
        }
        zzsp.zzb[] zzbVarArr = this.zzbzw;
        int i = 0;
        if (zzbVarArr != null && zzbVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzsp.zzb[] zzbVarArr2 = this.zzbzw;
                if (i2 >= zzbVarArr2.length) {
                    break;
                }
                zzsp.zzb zzbVar = zzbVarArr2[i2];
                if (zzbVar != null) {
                    zznx += zzdqf.zzc(11, zzbVar);
                }
                i2++;
            }
        }
        zztn[] zztnVarArr = this.zzcac;
        if (zztnVarArr != null && zztnVarArr.length > 0) {
            while (true) {
                zztn[] zztnVarArr2 = this.zzcac;
                if (i >= zztnVarArr2.length) {
                    break;
                }
                zztn zztnVar = zztnVarArr2[i];
                if (zztnVar != null) {
                    zznx += zzduj.zzb(17, zztnVar);
                }
                i++;
            }
        }
        return zznx;
    }
}
