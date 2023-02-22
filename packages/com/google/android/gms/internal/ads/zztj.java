package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzsp;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zztj extends zzdul<zztj> {
    public String zzcad = null;
    private zzsp.zzo zzcae = null;
    private Integer zzcaf = null;
    public zztk zzcag = null;
    private Integer zzcah = null;
    private zzsv zzcai = null;
    private zzsv zzcaj = null;
    private zzsv zzcak = null;

    public zztj() {
        this.zzhqy = null;
        this.zzhrh = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdul, com.google.android.gms.internal.ads.zzdus
    public final void zza(zzduj zzdujVar) throws IOException {
        String str = this.zzcad;
        if (str != null) {
            zzdujVar.zzg(1, str);
        }
        zztk zztkVar = this.zzcag;
        if (zztkVar != null) {
            zzdujVar.zza(4, zztkVar);
        }
        super.zza(zzdujVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdul, com.google.android.gms.internal.ads.zzdus
    public final int zznx() {
        int zznx = super.zznx();
        String str = this.zzcad;
        if (str != null) {
            zznx += zzduj.zzh(1, str);
        }
        zztk zztkVar = this.zzcag;
        return zztkVar != null ? zznx + zzduj.zzb(4, zztkVar) : zznx;
    }
}
