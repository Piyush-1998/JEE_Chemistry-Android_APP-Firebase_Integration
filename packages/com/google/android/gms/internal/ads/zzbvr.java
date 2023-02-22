package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbvr {
    private final zzbuz zzfkp;
    private final zzbyh zzfnd;
    private final zzbzl zzfnm;
    private final zzbhx zzfnn;
    private final Context zzlk;

    public zzbvr(Context context, zzbzl zzbzlVar, zzbyh zzbyhVar, zzbhx zzbhxVar, zzbuz zzbuzVar) {
        this.zzlk = context;
        this.zzfnm = zzbzlVar;
        this.zzfnd = zzbyhVar;
        this.zzfnn = zzbhxVar;
        this.zzfkp = zzbuzVar;
    }

    public final View zzaiy() throws zzbcf {
        zzbbw zza = this.zzfnm.zza(zzua.zzg(this.zzlk), false);
        zza.getView().setVisibility(8);
        zza.zza("/sendMessageToSdk", new zzaer(this) { // from class: com.google.android.gms.internal.ads.zzbvq
            private final zzbvr zzfnl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfnl = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaer
            public final void zza(Object obj, Map map) {
                this.zzfnl.zzd((zzbbw) obj, map);
            }
        });
        zza.zza("/adMuted", new zzaer(this) { // from class: com.google.android.gms.internal.ads.zzbvt
            private final zzbvr zzfnl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfnl = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaer
            public final void zza(Object obj, Map map) {
                this.zzfnl.zzc((zzbbw) obj, map);
            }
        });
        this.zzfnd.zza(new WeakReference(zza), "/loadHtml", new zzaer(this) { // from class: com.google.android.gms.internal.ads.zzbvs
            private final zzbvr zzfnl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfnl = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaer
            public final void zza(Object obj, final Map map) {
                final zzbvr zzbvrVar = this.zzfnl;
                zzbbw zzbbwVar = (zzbbw) obj;
                zzbbwVar.zzzp().zza(new zzbdf(zzbvrVar, map) { // from class: com.google.android.gms.internal.ads.zzbvx
                    private final Map zzdwd;
                    private final zzbvr zzfnl;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfnl = zzbvrVar;
                        this.zzdwd = map;
                    }

                    @Override // com.google.android.gms.internal.ads.zzbdf
                    public final void zzad(boolean z) {
                        this.zzfnl.zza(this.zzdwd, z);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzbbwVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzbbwVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.zzfnd.zza(new WeakReference(zza), "/showOverlay", new zzaer(this) { // from class: com.google.android.gms.internal.ads.zzbvv
            private final zzbvr zzfnl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfnl = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaer
            public final void zza(Object obj, Map map) {
                this.zzfnl.zzb((zzbbw) obj, map);
            }
        });
        this.zzfnd.zza(new WeakReference(zza), "/hideOverlay", new zzaer(this) { // from class: com.google.android.gms.internal.ads.zzbvu
            private final zzbvr zzfnl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfnl = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaer
            public final void zza(Object obj, Map map) {
                this.zzfnl.zza((zzbbw) obj, map);
            }
        });
        return zza.getView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbbw zzbbwVar, Map map) {
        zzaug.zzet("Hiding native ads overlay.");
        zzbbwVar.getView().setVisibility(8);
        this.zzfnn.zzax(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzbbw zzbbwVar, Map map) {
        zzaug.zzet("Showing native ads overlay.");
        zzbbwVar.getView().setVisibility(0);
        this.zzfnn.zzax(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzfnd.zza("sendMessageToNativeJs", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzbbw zzbbwVar, Map map) {
        this.zzfkp.zzahe();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzbbw zzbbwVar, Map map) {
        this.zzfnd.zza("sendMessageToNativeJs", map);
    }
}
