package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzalb<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> extends zzakb {
    private final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> zzdel;
    private final NETWORK_EXTRAS zzdem;

    public zzalb(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter, NETWORK_EXTRAS network_extras) {
        this.zzdel = mediationAdapter;
        this.zzdem = network_extras;
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final zzwr getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void setImmersiveMode(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void showVideo() {
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zza(IObjectWrapper iObjectWrapper, zzaft zzaftVar, List<zzagb> list) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zza(IObjectWrapper iObjectWrapper, zzaqp zzaqpVar, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zza(IObjectWrapper iObjectWrapper, zztx zztxVar, String str, zzaqp zzaqpVar, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zza(IObjectWrapper iObjectWrapper, zztx zztxVar, String str, String str2, zzakd zzakdVar, zzaay zzaayVar, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zza(zztx zztxVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zza(zztx zztxVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzb(IObjectWrapper iObjectWrapper, zztx zztxVar, String str, zzakd zzakdVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final zzakg zzrp() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final zzakl zzrq() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final boolean zzrt() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final zzace zzru() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final zzakm zzrv() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzx(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final IObjectWrapper zzro() throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzdel;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzaxi.zzeu(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return ObjectWrapper.wrap(((MediationBannerAdapter) mediationAdapter).getBannerView());
        } catch (Throwable th) {
            zzaxi.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zza(IObjectWrapper iObjectWrapper, zzua zzuaVar, zztx zztxVar, String str, zzakd zzakdVar) throws RemoteException {
        zza(iObjectWrapper, zzuaVar, zztxVar, str, null, zzakdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zza(IObjectWrapper iObjectWrapper, zzua zzuaVar, zztx zztxVar, String str, String str2, zzakd zzakdVar) throws RemoteException {
        AdSize adSize;
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzdel;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzaxi.zzeu(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        zzaxi.zzdv("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.zzdel;
            zzala zzalaVar = new zzala(zzakdVar);
            Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
            SERVER_PARAMETERS zzdf = zzdf(str);
            int i = 0;
            AdSize[] adSizeArr = {AdSize.SMART_BANNER, AdSize.BANNER, AdSize.IAB_MRECT, AdSize.IAB_BANNER, AdSize.IAB_LEADERBOARD, AdSize.IAB_WIDE_SKYSCRAPER};
            while (true) {
                if (i < 6) {
                    if (adSizeArr[i].getWidth() == zzuaVar.width && adSizeArr[i].getHeight() == zzuaVar.height) {
                        adSize = adSizeArr[i];
                        break;
                    }
                    i++;
                } else {
                    adSize = new AdSize(com.google.android.gms.ads.zzb.zza(zzuaVar.width, zzuaVar.height, zzuaVar.zzabd));
                    break;
                }
            }
            mediationBannerAdapter.requestBannerAd(zzalaVar, activity, zzdf, adSize, zzalm.zza(zztxVar, zzc(zztxVar)), this.zzdem);
        } catch (Throwable th) {
            zzaxi.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final Bundle zzrr() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zza(IObjectWrapper iObjectWrapper, zztx zztxVar, String str, zzakd zzakdVar) throws RemoteException {
        zza(iObjectWrapper, zztxVar, str, (String) null, zzakdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zza(IObjectWrapper iObjectWrapper, zztx zztxVar, String str, String str2, zzakd zzakdVar) throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzdel;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzaxi.zzeu(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzaxi.zzdv("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zzdel).requestInterstitialAd(new zzala(zzakdVar), (Activity) ObjectWrapper.unwrap(iObjectWrapper), zzdf(str), zzalm.zza(zztxVar, zzc(zztxVar)), this.zzdem);
        } catch (Throwable th) {
            zzaxi.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final Bundle getInterstitialAdapterInfo() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void showInterstitial() throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzdel;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzaxi.zzeu(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzaxi.zzdv("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zzdel).showInterstitial();
        } catch (Throwable th) {
            zzaxi.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final Bundle zzrs() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void destroy() throws RemoteException {
        try {
            this.zzdel.destroy();
        } catch (Throwable th) {
            zzaxi.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void pause() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void resume() throws RemoteException {
        throw new RemoteException();
    }

    private final SERVER_PARAMETERS zzdf(String str) throws RemoteException {
        HashMap hashMap;
        try {
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } else {
                hashMap = new HashMap(0);
            }
            Class<SERVER_PARAMETERS> serverParametersType = this.zzdel.getServerParametersType();
            if (serverParametersType != null) {
                SERVER_PARAMETERS newInstance = serverParametersType.newInstance();
                newInstance.load(hashMap);
                return newInstance;
            }
            return null;
        } catch (Throwable th) {
            zzaxi.zzc("", th);
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
}
