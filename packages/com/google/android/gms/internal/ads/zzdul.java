package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdul;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzdul<M extends zzdul<M>> extends zzdus {
    protected zzdun zzhqy;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdus
    public int zznx() {
        if (this.zzhqy != null) {
            for (int i = 0; i < this.zzhqy.size(); i++) {
                this.zzhqy.zzhf(i).zznx();
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdus
    public void zza(zzduj zzdujVar) throws IOException {
        if (this.zzhqy == null) {
            return;
        }
        for (int i = 0; i < this.zzhqy.size(); i++) {
            this.zzhqy.zzhf(i).zza(zzdujVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdus
    public final /* synthetic */ zzdus zzbci() throws CloneNotSupportedException {
        return (zzdul) clone();
    }

    @Override // com.google.android.gms.internal.ads.zzdus
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzdul zzdulVar = (zzdul) super.clone();
        zzdup.zza(this, zzdulVar);
        return zzdulVar;
    }
}
