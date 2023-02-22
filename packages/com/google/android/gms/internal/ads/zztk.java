package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zztk extends zzdul<zztk> {
    public Integer zzcal = null;
    public Integer zzcam = null;
    public Integer zzcan = null;

    public zztk() {
        this.zzhqy = null;
        this.zzhrh = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdul, com.google.android.gms.internal.ads.zzdus
    public final void zza(zzduj zzdujVar) throws IOException {
        Integer num = this.zzcal;
        if (num != null) {
            zzdujVar.zzaa(1, num.intValue());
        }
        Integer num2 = this.zzcam;
        if (num2 != null) {
            zzdujVar.zzaa(2, num2.intValue());
        }
        Integer num3 = this.zzcan;
        if (num3 != null) {
            zzdujVar.zzaa(3, num3.intValue());
        }
        super.zza(zzdujVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdul, com.google.android.gms.internal.ads.zzdus
    public final int zznx() {
        int zznx = super.zznx();
        Integer num = this.zzcal;
        if (num != null) {
            zznx += zzduj.zzae(1, num.intValue());
        }
        Integer num2 = this.zzcam;
        if (num2 != null) {
            zznx += zzduj.zzae(2, num2.intValue());
        }
        Integer num3 = this.zzcan;
        return num3 != null ? zznx + zzduj.zzae(3, num3.intValue()) : zznx;
    }
}
