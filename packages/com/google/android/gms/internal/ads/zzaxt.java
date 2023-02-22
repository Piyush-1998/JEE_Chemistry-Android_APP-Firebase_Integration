package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaxt implements zzdcz<Object> {
    private final /* synthetic */ String zzdwr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxt(String str) {
        this.zzdwr = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void onSuccess(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzb(Throwable th) {
        com.google.android.gms.ads.internal.zzq.zzkn().zzb(th, this.zzdwr);
    }
}
