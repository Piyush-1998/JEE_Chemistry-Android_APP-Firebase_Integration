package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbmk;
import com.google.android.gms.internal.ads.zzbpn;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcme extends zzvk implements zzboy {
    private final ViewGroup zzfdl;
    private final zzbei zzfza;
    private zzbio zzgbk;
    private final Context zzgbp;
    private zzddi<zzbio> zzgbz;
    private final zzbou zzgcf;
    private zzaah zzgcg;
    private final zzcmi zzgcc = new zzcmi();
    private final zzcmj zzgcd = new zzcmj();
    private final zzcml zzgce = new zzcml();
    private final zzcwg zzgbq = new zzcwg();

    public zzcme(zzbei zzbeiVar, Context context, zzua zzuaVar, String str) {
        this.zzfdl = new FrameLayout(context);
        this.zzfza = zzbeiVar;
        this.zzgbp = context;
        this.zzgbq.zzd(zzuaVar).zzgf(str);
        zzbou zzabf = zzbeiVar.zzabf();
        this.zzgcf = zzabf;
        zzabf.zza(this, this.zzfza.zzabb());
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final boolean isReady() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void setImmersiveMode(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void setUserId(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void showInterstitial() {
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
    public final void zza(zzaqi zzaqiVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzqx zzqxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzuf zzufVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzwx zzwxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zzbm(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final IObjectWrapper zzjr() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzfdl);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized boolean zza(zztx zztxVar) {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        if (this.zzgbz != null) {
            return false;
        }
        zzcwj.zze(this.zzgbp, zztxVar.zzcca);
        zzcwe zzane = this.zzgbq.zzg(zztxVar).zzane();
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcqw)).booleanValue() && this.zzgbq.zzjt().zzccq && this.zzgcc != null) {
            this.zzgcc.onAdFailedToLoad(1);
            return false;
        }
        zzbjn zzc = zzc(zzane);
        zzddi<zzbio> zzafs = zzc.zzaca().zzafs();
        this.zzgbz = zzafs;
        zzdcy.zza(zzafs, new zzcmh(this, zzc), this.zzfza.zzabb());
        return true;
    }

    private final synchronized zzbjn zzc(zzcwe zzcweVar) {
        return this.zzfza.zzabi().zzc(new zzbmk.zza().zzby(this.zzgbp).zza(zzcweVar).zzafy()).zzc(new zzbpn.zza().zza((zztp) this.zzgcc, this.zzfza.zzabb()).zza(this.zzgcd, this.zzfza.zzabb()).zza((zzbna) this.zzgcc, this.zzfza.zzabb()).zza((zzbog) this.zzgcc, this.zzfza.zzabb()).zza((zzbnb) this.zzgcc, this.zzfza.zzabb()).zza(this.zzgce, this.zzfza.zzabb()).zzagm()).zza(new zzcle(this.zzgcg)).zzb(new zzbth(zzbuy.zzfmf, null)).zza(new zzbkh(this.zzgcf)).zzb(new zzbin(this.zzfdl)).zzacz();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized void destroy() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        if (this.zzgbk != null) {
            this.zzgbk.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized void pause() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzgbk != null) {
            this.zzgbk.zzafm().zzbu(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized void resume() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzgbk != null) {
            this.zzgbk.zzafm().zzbv(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzuy zzuyVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzgcc.zzc(zzuyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final zzuy zzjw() {
        return this.zzgcc.zzalh();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzvt zzvtVar) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzgce.zzb(zzvtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final zzvt zzjv() {
        return this.zzgce.zzalj();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized void zzjs() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        if (this.zzgbk != null) {
            this.zzgbk.zzjs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized zzua zzjt() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        if (this.zzgbk != null) {
            return zzcwi.zza(this.zzgbp, Collections.singletonList(this.zzgbk.zzaet()));
        }
        return this.zzgbq.zzjt();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized void zza(zzua zzuaVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzgbq.zzd(zzuaVar);
        if (this.zzgbk != null) {
            this.zzgbk.zza(this.zzfdl, zzuaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized String getMediationAdapterClassName() {
        if (this.zzgbk == null) {
            return null;
        }
        return this.zzgbk.getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized String zzju() {
        if (this.zzgbk == null) {
            return null;
        }
        return this.zzgbk.zzju();
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
    public final synchronized zzwr getVideoController() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        if (this.zzgbk != null) {
            return this.zzgbk.getVideoController();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized String getAdUnitId() {
        return this.zzgbq.zzand();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized void zza(zzyj zzyjVar) {
        Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
        this.zzgbq.zzc(zzyjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzux zzuxVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzgcd.zzb(zzuxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final synchronized void zza(zzaah zzaahVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzgcg = zzaahVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboy
    public final synchronized void zzagc() {
        boolean zza;
        ViewParent parent = this.zzfdl.getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            zza = com.google.android.gms.ads.internal.zzq.zzkj().zza(view, view.getContext());
        } else {
            zza = false;
        }
        if (zza) {
            zza(this.zzgbq.zzanc());
        } else {
            this.zzgcf.zzdd(60);
        }
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
}
