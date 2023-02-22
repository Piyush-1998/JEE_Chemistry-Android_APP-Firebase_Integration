package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzatt extends zzauc {
    private final /* synthetic */ zzatr zzdrb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzatt(zzatr zzatrVar) {
        this.zzdrb = zzatrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzauc
    public final void zzsx() {
        Context context;
        zzaxl zzaxlVar;
        Object obj;
        zzzr zzzrVar;
        context = this.zzdrb.zzlk;
        zzaxlVar = this.zzdrb.zzblk;
        zzzo zzzoVar = new zzzo(context, zzaxlVar.zzblz);
        obj = this.zzdrb.lock;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.zzq.zzks();
                zzzrVar = this.zzdrb.zzdqo;
                zzzt.zza(zzzrVar, zzzoVar);
            } catch (IllegalArgumentException e) {
                zzaug.zzd("Cannot config CSI reporter.", e);
            }
        }
    }
}
