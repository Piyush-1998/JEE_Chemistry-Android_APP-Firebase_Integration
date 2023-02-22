package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzahv implements zzaer<zzail> {
    private final /* synthetic */ zzaha zzdab;
    private final /* synthetic */ zzahn zzdac;
    private final /* synthetic */ zzdf zzdae;
    private final /* synthetic */ zzawn zzdaf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzahv(zzahn zzahnVar, zzdf zzdfVar, zzaha zzahaVar, zzawn zzawnVar) {
        this.zzdac = zzahnVar;
        this.zzdae = zzdfVar;
        this.zzdab = zzahaVar;
        this.zzdaf = zzawnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final /* synthetic */ void zza(zzail zzailVar, Map map) {
        Object obj;
        int i;
        obj = this.zzdac.lock;
        synchronized (obj) {
            zzaug.zzet("JS Engine is requesting an update");
            i = this.zzdac.status;
            if (i == 0) {
                zzaug.zzet("Starting reload.");
                this.zzdac.status = 2;
                this.zzdac.zza(this.zzdae);
            }
            this.zzdab.zzb("/requestReload", (zzaer) this.zzdaf.get());
        }
    }
}
