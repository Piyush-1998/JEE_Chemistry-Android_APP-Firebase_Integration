package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbbd implements Runnable {
    private final /* synthetic */ String val$message;
    private final /* synthetic */ String zzduo;
    private final /* synthetic */ String zzedh;
    private final /* synthetic */ zzbax zzedn;
    private final /* synthetic */ String zzedq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbd(zzbax zzbaxVar, String str, String str2, String str3, String str4) {
        this.zzedn = zzbaxVar;
        this.zzduo = str;
        this.zzedh = str2;
        this.zzedq = str3;
        this.val$message = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String zzff;
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheCanceled");
        hashMap.put("src", this.zzduo);
        if (!TextUtils.isEmpty(this.zzedh)) {
            hashMap.put("cachedSrc", this.zzedh);
        }
        zzbax zzbaxVar = this.zzedn;
        zzff = zzbax.zzff(this.zzedq);
        hashMap.put("type", zzff);
        hashMap.put("reason", this.zzedq);
        if (!TextUtils.isEmpty(this.val$message)) {
            hashMap.put("message", this.val$message);
        }
        this.zzedn.zza("onPrecacheEvent", hashMap);
    }
}
