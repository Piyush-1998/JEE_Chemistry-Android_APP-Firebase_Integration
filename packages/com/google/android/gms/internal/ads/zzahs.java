package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzahs implements zzaer<zzail> {
    private final /* synthetic */ zzaie zzdaa;
    private final /* synthetic */ zzaha zzdab;
    private final /* synthetic */ zzahn zzdac;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzahs(zzahn zzahnVar, zzaie zzaieVar, zzaha zzahaVar) {
        this.zzdac = zzahnVar;
        this.zzdaa = zzaieVar;
        this.zzdab = zzahaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final /* synthetic */ void zza(zzail zzailVar, Map map) {
        Object obj;
        zzavr zzavrVar;
        obj = this.zzdac.lock;
        synchronized (obj) {
            if (this.zzdaa.getStatus() != -1 && this.zzdaa.getStatus() != 1) {
                this.zzdac.status = 0;
                zzavrVar = this.zzdac.zzczu;
                zzavrVar.zzh(this.zzdab);
                this.zzdaa.zzm(this.zzdab);
                this.zzdac.zzczw = this.zzdaa;
                zzaug.zzdy("Successfully loaded JS Engine.");
            }
        }
    }
}
