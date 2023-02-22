package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzchh implements zzcga<zzbio> {
    private final ScheduledExecutorService zzffn;
    private final zzbmz zzfht;
    private final zzddl zzfoa;
    private final zzbjn zzfyb;
    private final zzcgn zzfyc;

    public zzchh(zzbjn zzbjnVar, zzcgn zzcgnVar, zzbmz zzbmzVar, ScheduledExecutorService scheduledExecutorService, zzddl zzddlVar) {
        this.zzfyb = zzbjnVar;
        this.zzfyc = zzcgnVar;
        this.zzfht = zzbmzVar;
        this.zzffn = scheduledExecutorService;
        this.zzfoa = zzddlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final boolean zza(zzcvz zzcvzVar, zzcvr zzcvrVar) {
        return zzcvzVar.zzgka.zzfga.zzana() != null && this.zzfyc.zza(zzcvzVar, zzcvrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final zzddi<zzbio> zzb(final zzcvz zzcvzVar, final zzcvr zzcvrVar) {
        return this.zzfoa.zzd(new Callable(this, zzcvzVar, zzcvrVar) { // from class: com.google.android.gms.internal.ads.zzchg
            private final zzcvr zzfea;
            private final zzcvz zzfom;
            private final zzchh zzfya;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfya = this;
                this.zzfom = zzcvzVar;
                this.zzfea = zzcvrVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzfya.zzc(this.zzfom, this.zzfea);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbio zzc(final zzcvz zzcvzVar, final zzcvr zzcvrVar) throws Exception {
        return this.zzfyb.zza(new zzbla(zzcvzVar, zzcvrVar, null), new zzbjz(zzcvzVar.zzgka.zzfga.zzana(), new Runnable(this, zzcvzVar, zzcvrVar) { // from class: com.google.android.gms.internal.ads.zzchj
            private final zzcvr zzfea;
            private final zzcvz zzfom;
            private final zzchh zzfya;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfya = this;
                this.zzfom = zzcvzVar;
                this.zzfea = zzcvrVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfya.zzd(this.zzfom, this.zzfea);
            }
        })).zzada();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzcvz zzcvzVar, zzcvr zzcvrVar) {
        zzdcy.zza(zzdcy.zza(this.zzfyc.zzb(zzcvzVar, zzcvrVar), zzcvrVar.zzgjn, TimeUnit.SECONDS, this.zzffn), new zzchi(this), this.zzfoa);
    }
}
