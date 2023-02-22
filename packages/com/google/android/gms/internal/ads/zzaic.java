package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaic implements zzaxz<zzail> {
    private final /* synthetic */ zzaia zzdal;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaic(zzaia zzaiaVar) {
        this.zzdal = zzaiaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxz
    public final /* synthetic */ void zzh(zzail zzailVar) {
        zzaie zzaieVar;
        zzaug.zzdy("Releasing engine reference.");
        zzaieVar = this.zzdal.zzdaj;
        zzaieVar.zzrh();
    }
}
