package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.util.Log;
import androidx.core.content.PermissionChecker;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcj implements zzce {
    static zzcj zzaau;
    private final Context zzob;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzcj zzp(Context context) {
        zzcj zzcjVar;
        synchronized (zzcj.class) {
            if (zzaau == null) {
                zzaau = PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzcj(context) : new zzcj();
            }
            zzcjVar = zzaau;
        }
        return zzcjVar;
    }

    private zzcj(Context context) {
        this.zzob = context;
        context.getContentResolver().registerContentObserver(zzbz.CONTENT_URI, true, new zzcl(this, null));
    }

    private zzcj() {
        this.zzob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzce
    /* renamed from: zzde */
    public final String zzdd(final String str) {
        if (this.zzob == null) {
            return null;
        }
        try {
            return (String) zzch.zza(new zzcg(this, str) { // from class: com.google.android.gms.internal.measurement.zzci
                private final zzcj zzaas;
                private final String zzaat;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzaas = this;
                    this.zzaat = str;
                }

                @Override // com.google.android.gms.internal.measurement.zzcg
                public final Object zzrj() {
                    return this.zzaas.zzdf(this.zzaat);
                }
            });
        } catch (SecurityException e) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zzdf(String str) {
        return zzbz.zza(this.zzob.getContentResolver(), str, (String) null);
    }
}
