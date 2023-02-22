package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzbba implements Runnable {
    private final /* synthetic */ String zzduo;
    private final /* synthetic */ String zzedh;
    private final /* synthetic */ boolean zzedk = false;
    private final /* synthetic */ zzbax zzedn;
    private final /* synthetic */ int zzedo;
    private final /* synthetic */ int zzedp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbba(zzbax zzbaxVar, String str, String str2, int i, int i2, boolean z) {
        this.zzedn = zzbaxVar;
        this.zzduo = str;
        this.zzedh = str2;
        this.zzedo = i;
        this.zzedp = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        hashMap.put("src", this.zzduo);
        hashMap.put("cachedSrc", this.zzedh);
        hashMap.put("bytesLoaded", Integer.toString(this.zzedo));
        hashMap.put("totalBytes", Integer.toString(this.zzedp));
        hashMap.put("cacheReady", this.zzedk ? "1" : "0");
        this.zzedn.zza("onPrecacheEvent", hashMap);
    }
}
