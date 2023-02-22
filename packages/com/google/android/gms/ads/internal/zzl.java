package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaah;
import com.google.android.gms.internal.ads.zzant;
import com.google.android.gms.internal.ads.zzanz;
import com.google.android.gms.internal.ads.zzaqi;
import com.google.android.gms.internal.ads.zzaug;
import com.google.android.gms.internal.ads.zzawy;
import com.google.android.gms.internal.ads.zzaxl;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzdf;
import com.google.android.gms.internal.ads.zzdi;
import com.google.android.gms.internal.ads.zzqx;
import com.google.android.gms.internal.ads.zztx;
import com.google.android.gms.internal.ads.zzua;
import com.google.android.gms.internal.ads.zzuf;
import com.google.android.gms.internal.ads.zzuv;
import com.google.android.gms.internal.ads.zzux;
import com.google.android.gms.internal.ads.zzuy;
import com.google.android.gms.internal.ads.zzvk;
import com.google.android.gms.internal.ads.zzvo;
import com.google.android.gms.internal.ads.zzvt;
import com.google.android.gms.internal.ads.zzvz;
import com.google.android.gms.internal.ads.zzwr;
import com.google.android.gms.internal.ads.zzwx;
import com.google.android.gms.internal.ads.zzyj;
import com.google.android.gms.internal.ads.zzza;
import java.util.Map;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzl extends zzvk {
    private final zzaxl zzblk;
    private final zzua zzbll;
    private final Future<zzdf> zzblm = zzaxn.zzdwi.zzd(new zzm(this));
    private final zzo zzbln;
    private WebView zzblo;
    private zzuy zzblp;
    private zzdf zzblq;
    private AsyncTask<Void, Void, String> zzblr;
    private final Context zzlk;

    public zzl(Context context, zzua zzuaVar, String str, zzaxl zzaxlVar) {
        this.zzlk = context;
        this.zzblk = zzaxlVar;
        this.zzbll = zzuaVar;
        this.zzblo = new WebView(this.zzlk);
        this.zzbln = new zzo(str);
        zzbl(0);
        this.zzblo.setVerticalScrollBarEnabled(false);
        this.zzblo.getSettings().setJavaScriptEnabled(true);
        this.zzblo.setWebViewClient(new zzk(this));
        this.zzblo.setOnTouchListener(new zzn(this));
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final zzwr getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final boolean isLoading() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final boolean isReady() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void setManualImpressionsEnabled(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void stopLoading() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final String zzju() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final IObjectWrapper zzjr() throws RemoteException {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzblo);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void destroy() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzblr.cancel(true);
        this.zzblm.cancel(true);
        this.zzblo.destroy();
        this.zzblo = null;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final boolean zza(zztx zztxVar) throws RemoteException {
        Preconditions.checkNotNull(this.zzblo, "This Search Ad has already been torn down");
        this.zzbln.zza(zztxVar, this.zzblk);
        this.zzblr = new zzp(this, null).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void pause() throws RemoteException {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void resume() throws RemoteException {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzuy zzuyVar) throws RemoteException {
        this.zzblp = zzuyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzvt zzvtVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzvo zzvoVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final Bundle getAdMetadata() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void showInterstitial() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zzjs() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final zzua zzjt() throws RemoteException {
        return this.zzbll;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzua zzuaVar) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzant zzantVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzanz zzanzVar, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final String getAdUnitId() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final zzvt zzjv() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final zzuy zzjw() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzaah zzaahVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzux zzuxVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzvz zzvzVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzaqi zzaqiVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void setUserId(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zzbm(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzyj zzyjVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzwx zzwxVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzuf zzufVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzqx zzqxVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void setImmersiveMode(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzbn(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            zzuv.zzoj();
            return zzawy.zza(this.zzlk, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzbl(int i) {
        if (this.zzblo == null) {
            return;
        }
        this.zzblo.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzjx() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) zzuv.zzon().zzd(zzza.zzcpd));
        builder.appendQueryParameter(SearchIntents.EXTRA_QUERY, this.zzbln.getQuery());
        builder.appendQueryParameter("pubId", this.zzbln.zzka());
        Map<String, String> zzkb = this.zzbln.zzkb();
        for (String str : zzkb.keySet()) {
            builder.appendQueryParameter(str, zzkb.get(str));
        }
        Uri build = builder.build();
        zzdf zzdfVar = this.zzblq;
        if (zzdfVar != null) {
            try {
                build = zzdfVar.zza(build, this.zzlk);
            } catch (zzdi e) {
                zzaug.zzd("Unable to process ad data", e);
            }
        }
        String zzjy = zzjy();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder sb = new StringBuilder(String.valueOf(zzjy).length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(zzjy);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzjy() {
        String zzjz = this.zzbln.zzjz();
        if (TextUtils.isEmpty(zzjz)) {
            zzjz = "www.google.com";
        }
        String str = (String) zzuv.zzon().zzd(zzza.zzcpd);
        StringBuilder sb = new StringBuilder(String.valueOf(zzjz).length() + 8 + String.valueOf(str).length());
        sb.append("https://");
        sb.append(zzjz);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzbo(String str) {
        if (this.zzblq == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.zzblq.zzb(parse, this.zzlk);
        } catch (zzdi e) {
            zzaug.zzd("Unable to process ad data", e);
        }
        return parse.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbp(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.zzlk.startActivity(intent);
    }
}
