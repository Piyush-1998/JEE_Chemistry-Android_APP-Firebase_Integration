package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzawr implements Callable<String> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ Context zzdve;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawr(zzawp zzawpVar, Context context, Context context2) {
        this.zzdve = context;
        this.val$context = context2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (this.zzdve != null) {
            zzaug.zzdy("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.zzdve.getSharedPreferences("admob_user_agent", 0);
        } else {
            zzaug.zzdy("Attempting to read user agent from local cache.");
            sharedPreferences = this.val$context.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            zzaug.zzdy("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.val$context);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                zzaug.zzdy("Persisting user agent.");
            }
        }
        return string;
    }
}
