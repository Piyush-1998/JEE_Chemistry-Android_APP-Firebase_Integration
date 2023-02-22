package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbqv extends zzbpm<zzpj> implements zzpj {
    private final zzcvr zzfet;
    private Map<View, zzpf> zzfib;
    private final Context zzlk;

    public zzbqv(Context context, Set<zzbqs<zzpj>> set, zzcvr zzcvrVar) {
        super(set);
        this.zzfib = new WeakHashMap(1);
        this.zzlk = context;
        this.zzfet = zzcvrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpj
    public final synchronized void zza(final zzpk zzpkVar) {
        zza(new zzbpo(zzpkVar) { // from class: com.google.android.gms.internal.ads.zzbqu
            private final zzpk zzfia;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfia = zzpkVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbpo
            public final void zzp(Object obj) {
                ((zzpj) obj).zza(this.zzfia);
            }
        });
    }

    public final synchronized void zzq(View view) {
        zzpf zzpfVar = this.zzfib.get(view);
        if (zzpfVar == null) {
            zzpfVar = new zzpf(this.zzlk, view);
            zzpfVar.zza(this);
            this.zzfib.put(view, zzpfVar);
        }
        if (this.zzfet != null && this.zzfet.zzdls) {
            if (((Boolean) zzuv.zzon().zzd(zzza.zzclz)).booleanValue()) {
                zzpfVar.zzeh(((Long) zzuv.zzon().zzd(zzza.zzcly)).longValue());
                return;
            }
        }
        zzpfVar.zzli();
    }

    public final synchronized void zzr(View view) {
        if (this.zzfib.containsKey(view)) {
            this.zzfib.get(view).zzb(this);
            this.zzfib.remove(view);
        }
    }
}
