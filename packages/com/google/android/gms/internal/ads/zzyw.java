package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.concurrent.Callable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzyw implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzcfz;
    private final Object lock = new Object();
    private final ConditionVariable zzcfw = new ConditionVariable();
    private volatile boolean zzye = false;
    private volatile boolean zzcfx = false;
    private SharedPreferences zzcfy = null;
    private Bundle metaData = new Bundle();
    private JSONObject zzcga = new JSONObject();

    /* JADX WARN: Type inference failed for: r6v4, types: [com.google.android.gms.internal.ads.zzaao, com.google.android.gms.internal.ads.zzzb] */
    public final void initialize(Context context) {
        if (this.zzye) {
            return;
        }
        synchronized (this.lock) {
            if (this.zzye) {
                return;
            }
            if (!this.zzcfx) {
                this.zzcfx = true;
            }
            Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
            this.zzcfz = applicationContext;
            try {
                this.metaData = Wrappers.packageManager(applicationContext).getApplicationInfo(this.zzcfz.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext == null && context != null) {
                Context applicationContext2 = context.getApplicationContext();
                if (applicationContext2 != null) {
                    context = applicationContext2;
                }
                remoteContext = context;
            }
            if (remoteContext == null) {
                this.zzcfx = false;
                this.zzcfw.open();
                return;
            }
            zzuv.zzol();
            SharedPreferences sharedPreferences = remoteContext.getSharedPreferences("google_ads_flags", 0);
            this.zzcfy = sharedPreferences;
            if (sharedPreferences != null) {
                sharedPreferences.registerOnSharedPreferenceChangeListener(this);
            }
            zzaar.zza(new zzzb(this));
            zzpt();
            this.zzye = true;
            this.zzcfx = false;
            this.zzcfw.open();
        }
    }

    public final <T> T zzd(final zzyp<T> zzypVar) {
        if (!this.zzcfw.block(5000L)) {
            synchronized (this.lock) {
                if (!this.zzcfx) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzye || this.zzcfy == null) {
            synchronized (this.lock) {
                if (this.zzye && this.zzcfy != null) {
                }
                return zzypVar.zzpq();
            }
        }
        if (zzypVar.getSource() == 2) {
            Bundle bundle = this.metaData;
            if (bundle == null) {
                return zzypVar.zzpq();
            }
            return zzypVar.zza(bundle);
        } else if (zzypVar.getSource() == 1 && this.zzcga.has(zzypVar.getKey())) {
            return zzypVar.zza(this.zzcga);
        } else {
            return (T) zzawq.zza(this.zzcfz, new Callable(this, zzypVar) { // from class: com.google.android.gms.internal.ads.zzyz
                private final zzyw zzcgb;
                private final zzyp zzcgc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzcgb = this;
                    this.zzcgc = zzypVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zzcgb.zze(this.zzcgc);
                }
            });
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzpt();
        }
    }

    private final void zzpt() {
        if (this.zzcfy == null) {
            return;
        }
        try {
            this.zzcga = new JSONObject((String) zzawq.zza(this.zzcfz, new Callable(this) { // from class: com.google.android.gms.internal.ads.zzyy
                private final zzyw zzcgb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzcgb = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zzcgb.zzpu();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zzpu() throws Exception {
        return this.zzcfy.getString("flag_configuration", "{}");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zze(zzyp zzypVar) throws Exception {
        return zzypVar.zza(this.zzcfy);
    }
}
