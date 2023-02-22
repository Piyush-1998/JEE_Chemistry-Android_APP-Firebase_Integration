package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbhd implements zzbna, zzbnj, zzbog, zztp {
    private final zzcvz zzfbd;
    private final zzcyp zzfbe;
    private final zzcvr zzfbi;
    private boolean zzfbj;
    private boolean zzfbk;

    public zzbhd(zzcvz zzcvzVar, zzcvr zzcvrVar, zzcyp zzcypVar) {
        this.zzfbd = zzcvzVar;
        this.zzfbi = zzcvrVar;
        this.zzfbe = zzcypVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onAdClosed() {
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onAdOpened() {
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final synchronized void onAdLoaded() {
        if (this.zzfbj) {
            ArrayList arrayList = new ArrayList(this.zzfbi.zzdbz);
            arrayList.addAll(this.zzfbi.zzgja);
            this.zzfbe.zza(this.zzfbd, this.zzfbi, true, (List<String>) arrayList);
        } else {
            this.zzfbe.zza(this.zzfbd, this.zzfbi, this.zzfbi.zzgjc);
            this.zzfbe.zza(this.zzfbd, this.zzfbi, this.zzfbi.zzgja);
        }
        this.zzfbj = true;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void onAdClicked() {
        zzcyp zzcypVar = this.zzfbe;
        zzcvz zzcvzVar = this.zzfbd;
        zzcvr zzcvrVar = this.zzfbi;
        zzcypVar.zza(zzcvzVar, zzcvrVar, zzcvrVar.zzdby);
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final synchronized void onAdImpression() {
        if (!this.zzfbk) {
            this.zzfbe.zza(this.zzfbd, this.zzfbi, this.zzfbi.zzdbz);
            this.zzfbk = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void zzb(zzapy zzapyVar, String str, String str2) {
        zzcyp zzcypVar = this.zzfbe;
        zzcvz zzcvzVar = this.zzfbd;
        zzcvr zzcvrVar = this.zzfbi;
        zzcypVar.zza(zzcvzVar, zzcvrVar, zzcvrVar.zzdlg, zzapyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onRewardedVideoStarted() {
        zzcyp zzcypVar = this.zzfbe;
        zzcvz zzcvzVar = this.zzfbd;
        zzcvr zzcvrVar = this.zzfbi;
        zzcypVar.zza(zzcvzVar, zzcvrVar, zzcvrVar.zzdlf);
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onRewardedVideoCompleted() {
        zzcyp zzcypVar = this.zzfbe;
        zzcvz zzcvzVar = this.zzfbd;
        zzcvr zzcvrVar = this.zzfbi;
        zzcypVar.zza(zzcvzVar, zzcvrVar, zzcvrVar.zzgjb);
    }
}
