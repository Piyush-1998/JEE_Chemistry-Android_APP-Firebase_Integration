package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzoi implements ThreadFactory {
    private final /* synthetic */ String zzbgy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzoi(String str) {
        this.zzbgy = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.zzbgy);
    }
}
