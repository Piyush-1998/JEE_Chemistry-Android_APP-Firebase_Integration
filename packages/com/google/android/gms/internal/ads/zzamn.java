package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
final class zzamn implements MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> {
    private final /* synthetic */ zzakd zzdew;
    private final /* synthetic */ zzami zzdex;
    private final /* synthetic */ zzaly zzdfa;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamn(zzami zzamiVar, zzaly zzalyVar, zzakd zzakdVar) {
        this.zzdex = zzamiVar;
        this.zzdfa = zzalyVar;
        this.zzdew = zzakdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* renamed from: zza */
    public final MediationRewardedAdCallback onSuccess(MediationRewardedAd mediationRewardedAd) {
        if (mediationRewardedAd == null) {
            zzaxi.zzeu("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zzdfa.zzdg("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                zzaxi.zzc("", e);
                return null;
            }
        }
        try {
            this.zzdex.zzddz = mediationRewardedAd;
            this.zzdfa.zzsf();
        } catch (RemoteException e2) {
            zzaxi.zzc("", e2);
        }
        return new zzamo(this.zzdew);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        try {
            this.zzdfa.zzdg(str);
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
        }
    }
}
