package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzajp {
    private static zzajp zzdbu;
    private AtomicBoolean zzdbv = new AtomicBoolean(false);

    public static zzajp zzrn() {
        if (zzdbu == null) {
            zzdbu = new zzajp();
        }
        return zzdbu;
    }

    zzajp() {
    }

    public final Thread zzc(final Context context, final String str) {
        if (this.zzdbv.compareAndSet(false, true)) {
            Thread thread = new Thread(new Runnable(this, context, str) { // from class: com.google.android.gms.internal.ads.zzajo
                private final Context zzcfb;
                private final zzajp zzdbs;
                private final String zzdbt;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdbs = this;
                    this.zzcfb = context;
                    this.zzdbt = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzajp.zzd(this.zzcfb, this.zzdbt);
                }
            });
            thread.start();
            return thread;
        }
        return null;
    }

    public final Thread zzm(final Context context) {
        if (this.zzdbv.compareAndSet(false, true)) {
            Thread thread = new Thread(new Runnable(this, context) { // from class: com.google.android.gms.internal.ads.zzajr
                private final Context zzcfb;
                private final zzajp zzdbs;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdbs = this;
                    this.zzcfb = context;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzajp.zzo(this.zzcfb);
                }
            });
            thread.start();
            return thread;
        }
        return null;
    }

    private static void zza(Context context, AppMeasurementSdk appMeasurementSdk) {
        try {
            ((zzbed) zzaxh.zza(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", zzajq.zzbty)).zza(ObjectWrapper.wrap(context), new zzajm(appMeasurementSdk));
        } catch (RemoteException | zzaxj | NullPointerException e) {
            zzaxi.zze("#007 Could not call remote method.", e);
        }
    }

    private static boolean zzn(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzo(Context context) {
        zzza.initialize(context);
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcjr)).booleanValue() && zzn(context)) {
            zza(context, AppMeasurementSdk.getInstance(context));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(Context context, String str) {
        boolean z;
        zzza.initialize(context);
        if (!((Boolean) zzuv.zzon().zzd(zzza.zzcjn)).booleanValue()) {
            if (!((Boolean) zzuv.zzon().zzd(zzza.zzcjm)).booleanValue()) {
                z = false;
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", z);
                zza(context, AppMeasurementSdk.getInstance(context, "FA-Ads", "am", str, bundle));
            }
        }
        z = true;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("measurementEnabled", z);
        zza(context, AppMeasurementSdk.getInstance(context, "FA-Ads", "am", str, bundle2));
    }
}
