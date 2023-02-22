package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzami extends zzamc {
    private MediationRewardedAd zzddz;
    private final RtbAdapter zzdes;
    private MediationInterstitialAd zzdet;
    private String zzdeu = "";

    public zzami(RtbAdapter rtbAdapter) {
        this.zzdes = rtbAdapter;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza(String[] strArr, Bundle[] bundleArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzr(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza(String str, String str2, zztx zztxVar, IObjectWrapper iObjectWrapper, zzalr zzalrVar, zzakd zzakdVar, zzua zzuaVar) throws RemoteException {
        try {
            this.zzdes.loadBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdj(str2), zzd(zztxVar), zzc(zztxVar), zztxVar.zzng, zztxVar.zzabj, zztxVar.zzabk, zza(str2, zztxVar), com.google.android.gms.ads.zzb.zza(zzuaVar.width, zzuaVar.height, zzuaVar.zzabd), this.zzdeu), new zzaml(this, zzalrVar, zzakdVar));
        } catch (Throwable th) {
            zzaxi.zzc("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza(String str, String str2, zztx zztxVar, IObjectWrapper iObjectWrapper, zzals zzalsVar, zzakd zzakdVar) throws RemoteException {
        try {
            this.zzdes.loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdj(str2), zzd(zztxVar), zzc(zztxVar), zztxVar.zzng, zztxVar.zzabj, zztxVar.zzabk, zza(str2, zztxVar), this.zzdeu), new zzamk(this, zzalsVar, zzakdVar));
        } catch (Throwable th) {
            zzaxi.zzc("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza(String str, String str2, zztx zztxVar, IObjectWrapper iObjectWrapper, zzaly zzalyVar, zzakd zzakdVar) throws RemoteException {
        try {
            this.zzdes.loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdj(str2), zzd(zztxVar), zzc(zztxVar), zztxVar.zzng, zztxVar.zzabj, zztxVar.zzabk, zza(str2, zztxVar), this.zzdeu), new zzamn(this, zzalyVar, zzakdVar));
        } catch (Throwable th) {
            zzaxi.zzc("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza(String str, String str2, zztx zztxVar, IObjectWrapper iObjectWrapper, zzalx zzalxVar, zzakd zzakdVar) throws RemoteException {
        try {
            this.zzdes.loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdj(str2), zzd(zztxVar), zzc(zztxVar), zztxVar.zzng, zztxVar.zzabj, zztxVar.zzabk, zza(str2, zztxVar), this.zzdeu), new zzamm(this, zzalxVar, zzakdVar));
        } catch (Throwable th) {
            zzaxi.zzc("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final boolean zzac(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationInterstitialAd mediationInterstitialAd = this.zzdet;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzaxi.zzc("", th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final boolean zzad(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationRewardedAd mediationRewardedAd = this.zzddz;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzaxi.zzc("", th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final zzwr getVideoController() {
        RtbAdapter rtbAdapter = this.zzdes;
        if (rtbAdapter instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) rtbAdapter).getVideoController();
            } catch (Throwable th) {
                zzaxi.zzc("", th);
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzua zzuaVar, zzame zzameVar) throws RemoteException {
        AdFormat adFormat;
        try {
            zzamp zzampVar = new zzamp(this, zzameVar);
            RtbAdapter rtbAdapter = this.zzdes;
            char c = 65535;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c = 3;
                        break;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c = 2;
                        break;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                adFormat = AdFormat.BANNER;
            } else if (c == 1) {
                adFormat = AdFormat.INTERSTITIAL;
            } else if (c == 2) {
                adFormat = AdFormat.REWARDED;
            } else if (c == 3) {
                adFormat = AdFormat.NATIVE;
            } else {
                throw new IllegalArgumentException("Internal Error");
            }
            MediationConfiguration mediationConfiguration = new MediationConfiguration(adFormat, bundle2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(mediationConfiguration);
            rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList, bundle, com.google.android.gms.ads.zzb.zza(zzuaVar.width, zzuaVar.height, zzuaVar.zzabd)), zzampVar);
        } catch (Throwable th) {
            zzaxi.zzc("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final zzamr zzsg() throws RemoteException {
        return zzamr.zza(this.zzdes.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final zzamr zzsh() throws RemoteException {
        return zzamr.zza(this.zzdes.getSDKVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzdh(String str) {
        this.zzdeu = str;
    }

    private static Bundle zzdj(String str) throws RemoteException {
        String valueOf = String.valueOf(str);
        zzaxi.zzeu(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                return bundle2;
            }
            return bundle;
        } catch (JSONException e) {
            zzaxi.zzc("", e);
            throw new RemoteException();
        }
    }

    private static boolean zzc(zztx zztxVar) {
        if (zztxVar.zzcca) {
            return true;
        }
        zzuv.zzoj();
        return zzawy.zzwj();
    }

    private static String zza(String str, zztx zztxVar) {
        String str2 = zztxVar.zzabl;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    private final Bundle zzd(zztx zztxVar) {
        Bundle bundle;
        return (zztxVar.zzcce == null || (bundle = zztxVar.zzcce.getBundle(this.zzdes.getClass().getName())) == null) ? new Bundle() : bundle;
    }
}
