package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbxn {
    private final Executor zzfbx;
    private final zzbqv zzfjq;
    private final zzbhx zzfpf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbxn(Executor executor, zzbhx zzbhxVar, zzbqv zzbqvVar) {
        this.zzfbx = executor;
        this.zzfjq = zzbqvVar;
        this.zzfpf = zzbhxVar;
    }

    public final void zzl(final zzbbw zzbbwVar) {
        if (zzbbwVar == null) {
            return;
        }
        this.zzfjq.zzq(zzbbwVar.getView());
        this.zzfjq.zza(new zzpj(zzbbwVar) { // from class: com.google.android.gms.internal.ads.zzbxm
            private final zzbbw zzehv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzehv = zzbbwVar;
            }

            @Override // com.google.android.gms.internal.ads.zzpj
            public final void zza(zzpk zzpkVar) {
                this.zzehv.zzzp().zza(zzpkVar.zzboa.left, zzpkVar.zzboa.top, false);
            }
        }, this.zzfbx);
        this.zzfjq.zza(new zzpj(zzbbwVar) { // from class: com.google.android.gms.internal.ads.zzbxp
            private final zzbbw zzehv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzehv = zzbbwVar;
            }

            @Override // com.google.android.gms.internal.ads.zzpj
            public final void zza(zzpk zzpkVar) {
                zzbbw zzbbwVar2 = this.zzehv;
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", zzpkVar.zzbnp ? "1" : "0");
                zzbbwVar2.zza("onAdVisibilityChanged", hashMap);
            }
        }, this.zzfbx);
        this.zzfjq.zza(this.zzfpf, this.zzfbx);
        this.zzfpf.zzg(zzbbwVar);
        zzbbwVar.zza("/trackActiveViewUnit", new zzaer(this) { // from class: com.google.android.gms.internal.ads.zzbxo
            private final zzbxn zzfpg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfpg = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaer
            public final void zza(Object obj, Map map) {
                this.zzfpg.zzf((zzbbw) obj, map);
            }
        });
        zzbbwVar.zza("/untrackActiveViewUnit", new zzaer(this) { // from class: com.google.android.gms.internal.ads.zzbxr
            private final zzbxn zzfpg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfpg = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaer
            public final void zza(Object obj, Map map) {
                this.zzfpg.zze((zzbbw) obj, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzbbw zzbbwVar, Map map) {
        this.zzfpf.disable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzbbw zzbbwVar, Map map) {
        this.zzfpf.enable();
    }
}
