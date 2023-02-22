package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzcs implements zzce {
    static final Map<String, zzcs> zzabd = new HashMap();
    private volatile Map<String, ?> zzaak;
    private final SharedPreferences zzabe;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzabf = new SharedPreferences.OnSharedPreferenceChangeListener(this) { // from class: com.google.android.gms.internal.measurement.zzcv
        private final zzcs zzabq;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.zzabq = this;
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            this.zzabq.zza(sharedPreferences, str);
        }
    };
    private final Object zzaaj = new Object();
    private final List<zzcf> zzaal = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzcs zze(Context context, String str) {
        zzcs zzcsVar;
        SharedPreferences sharedPreferences;
        if ((!zzcb.zzri() || str.startsWith("direct_boot:")) ? true : zzcb.isUserUnlocked(context)) {
            synchronized (zzcs.class) {
                zzcsVar = zzabd.get(str);
                if (zzcsVar == null) {
                    if (str.startsWith("direct_boot:")) {
                        if (zzcb.zzri()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        sharedPreferences = context.getSharedPreferences(str.substring(12), 0);
                    } else {
                        sharedPreferences = context.getSharedPreferences(str, 0);
                    }
                    zzcsVar = new zzcs(sharedPreferences);
                    zzabd.put(str, zzcsVar);
                }
            }
            return zzcsVar;
        }
        return null;
    }

    private zzcs(SharedPreferences sharedPreferences) {
        this.zzabe = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.zzabf);
    }

    @Override // com.google.android.gms.internal.measurement.zzce
    public final Object zzdd(String str) {
        Map<String, ?> map = this.zzaak;
        if (map == null) {
            synchronized (this.zzaaj) {
                map = this.zzaak;
                if (map == null) {
                    map = this.zzabe.getAll();
                    this.zzaak = map;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zzaaj) {
            this.zzaak = null;
            zzcm.zzrl();
        }
        synchronized (this) {
            for (zzcf zzcfVar : this.zzaal) {
                zzcfVar.zzrk();
            }
        }
    }
}
