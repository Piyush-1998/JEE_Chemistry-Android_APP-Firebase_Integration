package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzdf;
import com.google.android.gms.internal.ads.zzuv;
import com.google.android.gms.internal.ads.zzza;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzp extends AsyncTask<Void, Void, String> {
    private final /* synthetic */ zzl zzblj;

    private zzp(zzl zzlVar) {
        this.zzblj = zzlVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public final String doInBackground(Void... voidArr) {
        Future future;
        try {
            zzl zzlVar = this.zzblj;
            future = this.zzblj.zzblm;
            zzlVar.zzblq = (zzdf) future.get(((Long) zzuv.zzon().zzd(zzza.zzcpf)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzaxi.zzd("", e);
        }
        return this.zzblj.zzjx();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(String str) {
        WebView webView;
        WebView webView2;
        String str2 = str;
        webView = this.zzblj.zzblo;
        if (webView == null || str2 == null) {
            return;
        }
        webView2 = this.zzblj.zzblo;
        webView2.loadUrl(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzp(zzl zzlVar, zzk zzkVar) {
        this(zzlVar);
    }
}
