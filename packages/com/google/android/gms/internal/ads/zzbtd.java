package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbtd implements zzbna, zzbqk {
    private final View view;
    private final zzasl zzbnf;
    private final zzasm zzfff;
    private final int zzfis;
    private String zzfiy;
    private final Context zzlk;

    public zzbtd(zzasm zzasmVar, Context context, zzasl zzaslVar, View view, int i) {
        this.zzfff = zzasmVar;
        this.zzlk = context;
        this.zzbnf = zzaslVar;
        this.view = view;
        this.zzfis = i;
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onRewardedVideoStarted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onAdOpened() {
        View view = this.view;
        if (view != null && this.zzfiy != null) {
            this.zzbnf.zzg(view.getContext(), this.zzfiy);
        }
        this.zzfff.zzaf(true);
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onAdClosed() {
        this.zzfff.zzaf(false);
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zzagn() {
        String zzad = this.zzbnf.zzad(this.zzlk);
        this.zzfiy = zzad;
        String valueOf = String.valueOf(zzad);
        String str = this.zzfis == 7 ? "/Rewarded" : "/Interstitial";
        this.zzfiy = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    @ParametersAreNonnullByDefault
    public final void zzb(zzapy zzapyVar, String str, String str2) {
        if (this.zzbnf.zzab(this.zzlk)) {
            try {
                this.zzbnf.zza(this.zzlk, this.zzbnf.zzag(this.zzlk), this.zzfff.getAdUnitId(), zzapyVar.getType(), zzapyVar.getAmount());
            } catch (RemoteException e) {
                zzaug.zzd("Remote Exception to get reward item.", e);
            }
        }
    }
}
