package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzpm implements Application.ActivityLifecycleCallbacks {
    private final Application zzxh;
    private final WeakReference<Application.ActivityLifecycleCallbacks> zzxi;
    private boolean zzxj = false;

    public zzpm(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzxi = new WeakReference<>(activityLifecycleCallbacks);
        this.zzxh = application;
    }

    private final void zza(zzpu zzpuVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.zzxi.get();
            if (activityLifecycleCallbacks != null) {
                zzpuVar.zza(activityLifecycleCallbacks);
            } else if (this.zzxj) {
            } else {
                this.zzxh.unregisterActivityLifecycleCallbacks(this);
                this.zzxj = true;
            }
        } catch (Exception e) {
            zzaug.zzc("Error while dispatching lifecycle callback.", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new zzpl(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zza(new zzpo(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zza(new zzpn(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zza(new zzpq(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zza(new zzpp(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new zzps(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zza(new zzpr(this, activity));
    }
}
