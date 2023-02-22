package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdut;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdvi extends zzdul<zzdvi> {
    public zzdut.zzb.zzf.EnumC0016zzb zzhwk = null;
    public String mimeType = null;
    public byte[] zzhwl = null;

    public zzdvi() {
        this.zzhqy = null;
        this.zzhrh = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdul, com.google.android.gms.internal.ads.zzdus
    public final void zza(zzduj zzdujVar) throws IOException {
        zzdut.zzb.zzf.EnumC0016zzb enumC0016zzb = this.zzhwk;
        if (enumC0016zzb != null && enumC0016zzb != null) {
            zzdujVar.zzaa(1, enumC0016zzb.zzab());
        }
        String str = this.mimeType;
        if (str != null) {
            zzdujVar.zzg(2, str);
        }
        byte[] bArr = this.zzhwl;
        if (bArr != null) {
            zzdujVar.zza(3, bArr);
        }
        super.zza(zzdujVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdul, com.google.android.gms.internal.ads.zzdus
    public final int zznx() {
        int zznx = super.zznx();
        zzdut.zzb.zzf.EnumC0016zzb enumC0016zzb = this.zzhwk;
        if (enumC0016zzb != null && enumC0016zzb != null) {
            zznx += zzduj.zzae(1, enumC0016zzb.zzab());
        }
        String str = this.mimeType;
        if (str != null) {
            zznx += zzduj.zzh(2, str);
        }
        byte[] bArr = this.zzhwl;
        return bArr != null ? zznx + zzduj.zzgd(3) + zzduj.zzgl(bArr.length) + bArr.length : zznx;
    }
}
