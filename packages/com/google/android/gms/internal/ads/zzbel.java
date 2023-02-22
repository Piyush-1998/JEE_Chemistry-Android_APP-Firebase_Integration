package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzbel {
    private final zzaxl zzblh;
    private final WeakReference<Context> zzeju;
    private final Context zzlk;

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static class zza {
        private zzaxl zzblh;
        private WeakReference<Context> zzeju;
        private Context zzzc;

        public final zza zza(zzaxl zzaxlVar) {
            this.zzblh = zzaxlVar;
            return this;
        }

        public final zza zzbs(Context context) {
            this.zzeju = new WeakReference<>(context);
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.zzzc = context;
            return this;
        }
    }

    private zzbel(zza zzaVar) {
        this.zzblh = zzaVar.zzblh;
        this.zzlk = zzaVar.zzzc;
        this.zzeju = zzaVar.zzeju;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context zzabp() {
        return this.zzlk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final WeakReference<Context> zzabq() {
        return this.zzeju;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzaxl zzabr() {
        return this.zzblh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzabs() {
        return com.google.android.gms.ads.internal.zzq.zzkj().zzr(this.zzlk, this.zzblh.zzblz);
    }
}
