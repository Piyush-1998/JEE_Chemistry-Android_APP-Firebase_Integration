package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzcmf implements zzdcz<zzbii> {
    private final /* synthetic */ zzbie zzgch;
    private final /* synthetic */ zzcma zzgci;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcmf(zzcma zzcmaVar, zzbie zzbieVar) {
        this.zzgci = zzcmaVar;
        this.zzgch = zzbieVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzb(Throwable th) {
        synchronized (this.zzgci) {
            this.zzgci.zzgbz = null;
            this.zzgch.zzacb().onAdFailedToLoad(zzccu.zzd(th));
            zzcwj.zzc(th, "AppOpenAdManagerShim.onFailure");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final /* synthetic */ void onSuccess(zzbii zzbiiVar) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        com.google.android.gms.ads.internal.overlay.zzq zza;
        RelativeLayout.LayoutParams zzb;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        zzua zzale;
        ViewGroup viewGroup5;
        zzua zzale2;
        zzqx zzqxVar;
        zzbii zzbiiVar2 = zzbiiVar;
        synchronized (this.zzgci) {
            this.zzgci.zzgbz = null;
            if (this.zzgci.zzgby != null) {
                this.zzgci.zzgby.destroy();
            }
            this.zzgci.zzgby = zzbiiVar2;
            viewGroup = this.zzgci.zzfdl;
            viewGroup.removeAllViews();
            viewGroup2 = this.zzgci.zzfdl;
            viewGroup2.addView(zzbiiVar2.zzaeu(), com.google.android.gms.ads.internal.zzq.zzkl().zzvr());
            zza = this.zzgci.zza(zzbiiVar2);
            zzcma zzcmaVar = this.zzgci;
            zzb = zzcma.zzb(zzbiiVar2);
            zza.zzae(zzbiiVar2.zzaev());
            viewGroup3 = this.zzgci.zzfdl;
            viewGroup3.addView(zza, zzb);
            this.zzgci.zzc(zzbiiVar2);
            viewGroup4 = this.zzgci.zzfdl;
            zzale = this.zzgci.zzale();
            viewGroup4.setMinimumHeight(zzale.heightPixels);
            viewGroup5 = this.zzgci.zzfdl;
            zzale2 = this.zzgci.zzale();
            viewGroup5.setMinimumWidth(zzale2.widthPixels);
            try {
                zzqxVar = this.zzgci.zzgbv;
                zzqxVar.zza(new zzbik(zzbiiVar2, this.zzgci));
            } catch (RemoteException e) {
                zzaug.zzc("RemoteException when onAppOpenAdLoaded is called", e);
            }
            zzbiiVar2.zzafa();
        }
    }
}
