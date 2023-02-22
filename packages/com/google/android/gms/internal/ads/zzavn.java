package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzavn extends zzak {
    private final Context zzlk;

    public static zzu zzbg(Context context) {
        zzu zzuVar = new zzu(new zzal(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzavn(context, new zzar()));
        zzuVar.start();
        return zzuVar;
    }

    private zzavn(Context context, zzah zzahVar) {
        super(zzahVar);
        this.zzlk = context;
    }

    @Override // com.google.android.gms.internal.ads.zzak, com.google.android.gms.internal.ads.zzn
    public final zzo zzc(zzq<?> zzqVar) throws zzae {
        if (zzqVar.zzg() && zzqVar.getMethod() == 0) {
            if (Pattern.matches((String) zzuv.zzon().zzd(zzza.zzcpw), zzqVar.getUrl())) {
                zzuv.zzoj();
                if (zzawy.zzc(this.zzlk, 13400000)) {
                    zzo zzc = new zzafl(this.zzlk).zzc(zzqVar);
                    if (zzc != null) {
                        String valueOf = String.valueOf(zzqVar.getUrl());
                        zzaug.zzdy(valueOf.length() != 0 ? "Got gmscore asset response: ".concat(valueOf) : new String("Got gmscore asset response: "));
                        return zzc;
                    }
                    String valueOf2 = String.valueOf(zzqVar.getUrl());
                    zzaug.zzdy(valueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(valueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.zzc(zzqVar);
    }
}
