package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbyz extends zzbkk {
    private final zzaqv zzdoe;
    private final WeakReference<zzbbw> zzfif;
    private final zzbqi zzfig;
    private final zzble zzfii;
    private final zzczf zzfij;
    private final zzbsu zzfim;
    private boolean zzfpi;
    private final zzbof zzfpy;
    private final zzbne zzfqi;
    private final Context zzlk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbyz(zzbkn zzbknVar, Context context, zzbbw zzbbwVar, zzbsu zzbsuVar, zzbqi zzbqiVar, zzbne zzbneVar, zzbof zzbofVar, zzble zzbleVar, zzcvr zzcvrVar, zzczf zzczfVar) {
        super(zzbknVar);
        this.zzfpi = false;
        this.zzlk = context;
        this.zzfim = zzbsuVar;
        this.zzfif = new WeakReference<>(zzbbwVar);
        this.zzfig = zzbqiVar;
        this.zzfqi = zzbneVar;
        this.zzfpy = zzbofVar;
        this.zzfii = zzbleVar;
        this.zzfij = zzczfVar;
        this.zzdoe = new zzarw(zzcvrVar.zzdle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Context] */
    public final void zzb(boolean z, Activity activity) {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcjt)).booleanValue()) {
            com.google.android.gms.ads.internal.zzq.zzkj();
            if (zzaul.zzau(this.zzlk)) {
                zzaug.zzeu("Rewarded ad can not be shown when app is not in foreground.");
                this.zzfqi.zzcl(3);
                if (((Boolean) zzuv.zzon().zzd(zzza.zzcju)).booleanValue()) {
                    this.zzfij.zzgl(this.zzfbd.zzgkb.zzgjy.zzbzn);
                    return;
                }
                return;
            }
        }
        if (this.zzfpi) {
            zzaug.zzeu("The rewarded ad have been showed.");
            this.zzfqi.zzcl(1);
            return;
        }
        this.zzfpi = true;
        this.zzfig.zzagn();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zzlk;
        }
        this.zzfim.zza(z, activity2);
    }

    public final boolean zzajh() {
        return this.zzfpi;
    }

    public final zzaqv zzpk() {
        return this.zzdoe;
    }

    public final boolean isClosed() {
        return this.zzfii.isClosed();
    }

    public final boolean zzpl() {
        zzbbw zzbbwVar = this.zzfif.get();
        return (zzbbwVar == null || zzbbwVar.zzaae()) ? false : true;
    }

    public final Bundle getAdMetadata() {
        return this.zzfpy.getAdMetadata();
    }

    public final void finalize() throws Throwable {
        try {
            zzbbw zzbbwVar = this.zzfif.get();
            if (((Boolean) zzuv.zzon().zzd(zzza.zzctv)).booleanValue()) {
                if (!this.zzfpi && zzbbwVar != null) {
                    zzddl zzddlVar = zzaxn.zzdwm;
                    zzbbwVar.getClass();
                    zzddlVar.execute(zzbyy.zzh(zzbbwVar));
                }
            } else if (zzbbwVar != null) {
                zzbbwVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }
}
