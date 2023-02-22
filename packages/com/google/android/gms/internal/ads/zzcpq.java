package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcpq implements zzcru<zzcpn> {
    private final zzddl zzfoa;
    private final Context zzlk;

    public zzcpq(Context context, zzddl zzddlVar) {
        this.zzlk = context;
        this.zzfoa = zzddlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<zzcpn> zzalv() {
        return this.zzfoa.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcpp
            private final zzcpq zzgfg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgfg = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String zzuz;
                String zzvb;
                String str;
                com.google.android.gms.ads.internal.zzq.zzkj();
                zzpz zzux = com.google.android.gms.ads.internal.zzq.zzkn().zzuh().zzux();
                Bundle bundle = null;
                if (zzux != null && zzux != null && (!com.google.android.gms.ads.internal.zzq.zzkn().zzuh().zzuy() || !com.google.android.gms.ads.internal.zzq.zzkn().zzuh().zzva())) {
                    if (zzux.zzly()) {
                        zzux.wakeup();
                    }
                    zzpt zzlw = zzux.zzlw();
                    if (zzlw != null) {
                        zzuz = zzlw.zzll();
                        str = zzlw.zzlm();
                        zzvb = zzlw.zzln();
                        if (zzuz != null) {
                            com.google.android.gms.ads.internal.zzq.zzkn().zzuh().zzdz(zzuz);
                        }
                        if (zzvb != null) {
                            com.google.android.gms.ads.internal.zzq.zzkn().zzuh().zzea(zzvb);
                        }
                    } else {
                        zzuz = com.google.android.gms.ads.internal.zzq.zzkn().zzuh().zzuz();
                        zzvb = com.google.android.gms.ads.internal.zzq.zzkn().zzuh().zzvb();
                        str = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!com.google.android.gms.ads.internal.zzq.zzkn().zzuh().zzva()) {
                        if (zzvb != null && !TextUtils.isEmpty(zzvb)) {
                            bundle2.putString("v_fp_vertical", zzvb);
                        } else {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        }
                    }
                    if (zzuz != null && !com.google.android.gms.ads.internal.zzq.zzkn().zzuh().zzuy()) {
                        bundle2.putString("fingerprint", zzuz);
                        if (!zzuz.equals(str)) {
                            bundle2.putString("v_fp", str);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new zzcpn(bundle);
            }
        });
    }
}
