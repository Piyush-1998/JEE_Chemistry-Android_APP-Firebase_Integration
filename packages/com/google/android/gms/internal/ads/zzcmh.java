package com.google.android.gms.internal.ads;

import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcmh implements zzdcz<zzbio> {
    private final /* synthetic */ zzbjn zzgck;
    private final /* synthetic */ zzcme zzgcl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcmh(zzcme zzcmeVar, zzbjn zzbjnVar) {
        this.zzgcl = zzcmeVar;
        this.zzgck = zzbjnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzb(Throwable th) {
        zzbou zzbouVar;
        synchronized (this.zzgcl) {
            this.zzgcl.zzgbz = null;
            this.zzgck.zzacb().onAdFailedToLoad(zzccu.zzd(th));
            zzbouVar = this.zzgcl.zzgcf;
            zzbouVar.zzdd(60);
            zzcwj.zzc(th, "BannerAdManagerShim.onFailure");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final /* synthetic */ void onSuccess(zzbio zzbioVar) {
        zzbio zzbioVar2;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        zzbou zzbouVar;
        zzbio zzbioVar3;
        zzbio zzbioVar4 = zzbioVar;
        synchronized (this.zzgcl) {
            this.zzgcl.zzgbz = null;
            zzbioVar2 = this.zzgcl.zzgbk;
            if (zzbioVar2 != null) {
                zzbioVar3 = this.zzgcl.zzgbk;
                zzbioVar3.destroy();
            }
            this.zzgcl.zzgbk = zzbioVar4;
            viewGroup = this.zzgcl.zzfdl;
            viewGroup.removeAllViews();
            viewGroup2 = this.zzgcl.zzfdl;
            viewGroup2.addView(zzbioVar4.zzaeu());
            zzbioVar4.zzafa();
            zzbouVar = this.zzgcl.zzgcf;
            zzbouVar.zzdd(zzbioVar4.zzaez());
        }
    }
}
