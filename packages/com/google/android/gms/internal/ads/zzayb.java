package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzayb implements zzdcz<T> {
    private final /* synthetic */ zzayc zzdwu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayb(zzayc zzaycVar) {
        this.zzdwu = zzaycVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void onSuccess(T t) {
        AtomicInteger atomicInteger;
        atomicInteger = this.zzdwu.zzdww;
        atomicInteger.set(1);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzb(Throwable th) {
        AtomicInteger atomicInteger;
        atomicInteger = this.zzdwu.zzdww;
        atomicInteger.set(-1);
    }
}
