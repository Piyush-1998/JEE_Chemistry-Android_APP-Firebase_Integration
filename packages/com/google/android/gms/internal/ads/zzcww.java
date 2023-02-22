package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcww {
    private final zzaxl zzblh;
    private final zzatr zzbml;
    private final Map<String, zzcwy> zzgkx = new HashMap();
    private final zzdf zzgky;
    private final Context zzzc;

    public zzcww(Context context, zzaxl zzaxlVar, zzatr zzatrVar) {
        this.zzzc = context;
        this.zzblh = zzaxlVar;
        this.zzbml = zzatrVar;
        this.zzgky = new zzdf(new com.google.android.gms.ads.internal.zzh(context, zzaxlVar));
    }

    public final zzcwy zzgg(String str) {
        if (str == null) {
            return zzanh();
        }
        if (this.zzgkx.containsKey(str)) {
            return this.zzgkx.get(str);
        }
        zzcwy zzgh = zzgh(str);
        this.zzgkx.put(str, zzgh);
        return zzgh;
    }

    private final zzcwy zzanh() {
        return new zzcwy(this.zzzc, this.zzbml.zzuh(), this.zzbml.zzuj(), this.zzgky);
    }

    private final zzcwy zzgh(String str) {
        zzapv zzz = zzapv.zzz(this.zzzc);
        try {
            zzz.setAppPackageName(str);
            zzauh zzauhVar = new zzauh();
            zzauhVar.zza(this.zzzc, str, false);
            zzaum zzaumVar = new zzaum(this.zzbml.zzuh(), zzauhVar);
            return new zzcwy(zzz, zzaumVar, new zzatz(zzawy.zzwl(), zzaumVar), new zzdf(new com.google.android.gms.ads.internal.zzh(this.zzzc, this.zzblh)));
        } catch (PackageManager.NameNotFoundException unused) {
            return zzanh();
        }
    }
}
