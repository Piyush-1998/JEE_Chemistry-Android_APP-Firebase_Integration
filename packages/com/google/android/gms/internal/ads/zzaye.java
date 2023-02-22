package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaye implements zzdcz<T> {
    private final /* synthetic */ zzaxz zzdwx;
    private final /* synthetic */ zzaxx zzdwy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaye(zzayc zzaycVar, zzaxz zzaxzVar, zzaxx zzaxxVar) {
        this.zzdwx = zzaxzVar;
        this.zzdwy = zzaxxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void onSuccess(T t) {
        this.zzdwx.zzh(t);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzb(Throwable th) {
        this.zzdwy.run();
    }
}
