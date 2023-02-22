package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdut;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdvg extends zzdul<zzdvg> {
    private zzdut.zzb.zzd.C0014zzb zzhvw = null;
    public zzdut.zzb.zzc[] zzhvx = new zzdut.zzb.zzc[0];
    private byte[] zzhvy = null;
    private byte[] zzhvz = null;
    private Integer zzhwa = null;

    public zzdvg() {
        this.zzhqy = null;
        this.zzhrh = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdul, com.google.android.gms.internal.ads.zzdus
    public final void zza(zzduj zzdujVar) throws IOException {
        zzdut.zzb.zzc[] zzcVarArr = this.zzhvx;
        if (zzcVarArr != null && zzcVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzdut.zzb.zzc[] zzcVarArr2 = this.zzhvx;
                if (i >= zzcVarArr2.length) {
                    break;
                }
                zzdut.zzb.zzc zzcVar = zzcVarArr2[i];
                if (zzcVar != null) {
                    zzdujVar.zze(2, zzcVar);
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
        zzdut.zzb.zzc[] zzcVarArr = this.zzhvx;
        if (zzcVarArr != null && zzcVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzdut.zzb.zzc[] zzcVarArr2 = this.zzhvx;
                if (i >= zzcVarArr2.length) {
                    break;
                }
                zzdut.zzb.zzc zzcVar = zzcVarArr2[i];
                if (zzcVar != null) {
                    zznx += zzdqf.zzc(2, zzcVar);
                }
                i++;
            }
        }
        return zznx;
    }
}
