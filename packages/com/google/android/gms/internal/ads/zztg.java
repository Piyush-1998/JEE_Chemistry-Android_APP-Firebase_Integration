package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzsp;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zztg extends zzdul<zztg> {
    public String zzbzn = null;
    private zzsp.zzb[] zzbzo = new zzsp.zzb[0];
    private zzsv zzbzp = null;
    private zzsv zzbzq = null;
    private zzsv zzbzr = null;

    public zztg() {
        this.zzhqy = null;
        this.zzhrh = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdul, com.google.android.gms.internal.ads.zzdus
    public final void zza(zzduj zzdujVar) throws IOException {
        String str = this.zzbzn;
        if (str != null) {
            zzdujVar.zzg(1, str);
        }
        zzsp.zzb[] zzbVarArr = this.zzbzo;
        if (zzbVarArr != null && zzbVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzsp.zzb[] zzbVarArr2 = this.zzbzo;
                if (i >= zzbVarArr2.length) {
                    break;
                }
                zzsp.zzb zzbVar = zzbVarArr2[i];
                if (zzbVar != null) {
                    zzdujVar.zze(2, zzbVar);
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
        String str = this.zzbzn;
        if (str != null) {
            zznx += zzduj.zzh(1, str);
        }
        zzsp.zzb[] zzbVarArr = this.zzbzo;
        if (zzbVarArr != null && zzbVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzsp.zzb[] zzbVarArr2 = this.zzbzo;
                if (i >= zzbVarArr2.length) {
                    break;
                }
                zzsp.zzb zzbVar = zzbVarArr2[i];
                if (zzbVar != null) {
                    zznx += zzdqf.zzc(2, zzbVar);
                }
                i++;
            }
        }
        return zznx;
    }
}
