package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdcm<V> extends zzdce<Object, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdcm(zzday<? extends zzddi<?>> zzdayVar, boolean z, Executor executor, Callable<V> callable) {
        zzd(new zzdcr(this, zzdayVar, z, new zzdcp(this, callable, executor)));
    }
}
