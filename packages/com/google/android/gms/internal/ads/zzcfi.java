package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzcfi implements Callable {
    private final zzcfh zzfvv;

    private zzcfi(zzcfh zzcfhVar) {
        this.zzfvv = zzcfhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Callable zza(zzcfh zzcfhVar) {
        return new zzcfi(zzcfhVar);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.zzfvv.getWritableDatabase();
    }
}
