package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbmk;
import com.google.android.gms.internal.ads.zzbpn;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcmk extends zzvk {
    private final Executor zzfbx;
    private final zzbei zzfza;
    private final Context zzgbp;
    private final zzcwg zzgbq;
    private zzddi<zzbrs> zzgbz;
    private zzaah zzgcg;
    private zzbrs zzgcp;
    private boolean zzgcq;
    private final zzcmi zzgcc = new zzcmi();
    private final zzcml zzgce = new zzcml();
    private final zzcui zzgco = new zzcui();

    public zzcmk(zzbei zzbeiVar, Context context, zzua zzuaVar, String str) {
        zzcwg zzcwgVar = new zzcwg();
        this.zzgbq = zzcwgVar;
        this.zzgcq = false;
        this.zzfza = zzbeiVar;
        zzcwgVar.zzd(zzuaVar).zzgf(str);
        this.zzfbx = zzbeiVar.zzabb();
        this.zzgbp = context;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final zzwr getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void setUserId(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void stopLoading() {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzant zzantVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzanz zzanzVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzqx zzqxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzua zzuaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzuf zzufVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzux zzuxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzwx zzwxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zzbm(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final IObjectWrapper zzjr() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zzjs() {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final zzua zzjt() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized boolean zza(zztx zztxVar) {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        if (this.zzgbz == null && !zzali()) {
            zzcwj.zze(this.zzgbp, zztxVar.zzcca);
            this.zzgcp = null;
            zzcwe zzane = this.zzgbq.zzg(zztxVar).zzane();
            zzbpn.zza zzaVar = new zzbpn.zza();
            if (this.zzgco != null) {
                zzaVar.zza((zzbna) this.zzgco, this.zzfza.zzabb()).zza((zzbog) this.zzgco, this.zzfza.zzabb()).zza((zzbnb) this.zzgco, this.zzfza.zzabb());
            }
            zzbso zzadf = this.zzfza.zzabk().zzd(new zzbmk.zza().zzby(this.zzgbp).zza(zzane).zzafy()).zzd(zzaVar.zza((zzbna) this.zzgcc, this.zzfza.zzabb()).zza((zzbog) this.zzgcc, this.zzfza.zzabb()).zza((zzbnb) this.zzgcc, this.zzfza.zzabb()).zza((zztp) this.zzgcc, this.zzfza.zzabb()).zza(this.zzgce, this.zzfza.zzabb()).zzagm()).zzb(new zzcle(this.zzgcg)).zzadf();
            zzddi<zzbrs> zzafs = zzadf.zzaca().zzafs();
            this.zzgbz = zzafs;
            zzdcy.zza(zzafs, new zzcmn(this, zzadf), this.zzfbx);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized void destroy() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        if (this.zzgcp != null) {
            this.zzgcp.zzafm().zzbw(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized void pause() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzgcp != null) {
            this.zzgcp.zzafm().zzbu(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized void resume() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzgcp != null) {
            this.zzgcp.zzafm().zzbv(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzuy zzuyVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzgcc.zzc(zzuyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzvt zzvtVar) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzgce.zzb(zzvtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized void showInterstitial() {
        Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        if (this.zzgcp == null) {
            return;
        }
        if (this.zzgcp.zzags()) {
            this.zzgcp.zzay(this.zzgcq);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized String getMediationAdapterClassName() {
        if (this.zzgcp == null) {
            return null;
        }
        return this.zzgcp.getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized String zzju() {
        if (this.zzgcp == null) {
            return null;
        }
        return this.zzgcp.zzju();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized void zza(zzvz zzvzVar) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzgbq.zzc(zzvzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized void setManualImpressionsEnabled(boolean z) {
        Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        this.zzgbq.zzbe(z);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized boolean isLoading() {
        boolean z;
        if (this.zzgbz != null) {
            z = this.zzgbz.isDone() ? false : true;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized boolean isReady() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzali();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized String getAdUnitId() {
        return this.zzgbq.zzand();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final zzvt zzjv() {
        return this.zzgce.zzalj();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final zzuy zzjw() {
        return this.zzgcc.zzalh();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized void setImmersiveMode(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzgcq = z;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized void zza(zzyj zzyjVar) {
        this.zzgbq.zzc(zzyjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized void zza(zzaah zzaahVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzgcg = zzaahVar;
    }

    private final synchronized boolean zzali() {
        boolean z;
        if (this.zzgcp != null) {
            z = this.zzgcp.isClosed() ? false : true;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzvo zzvoVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final Bundle getAdMetadata() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzaqi zzaqiVar) {
        this.zzgco.zzb(zzaqiVar);
    }
}
