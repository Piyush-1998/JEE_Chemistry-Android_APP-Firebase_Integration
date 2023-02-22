package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbbh extends zzbax {
    public zzbbh(zzazj zzazjVar) {
        super(zzazjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final void abort() {
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final boolean zzfd(String str) {
        zzazj zzazjVar = this.zzedf.get();
        if (zzazjVar != null) {
            zzazjVar.zza(zzfe(str), this);
        }
        zzaug.zzeu("VideoStreamNoopCache is doing nothing.");
        zza(str, zzfe(str), "noop", "Noop cache is a noop.");
        return false;
    }
}
