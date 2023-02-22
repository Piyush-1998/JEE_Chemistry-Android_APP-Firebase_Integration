package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaoi implements Thread.UncaughtExceptionHandler {
    private final /* synthetic */ zzaod zzdiq;
    private final /* synthetic */ Thread.UncaughtExceptionHandler zzdis;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaoi(zzaod zzaodVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zzdiq = zzaodVar;
        this.zzdis = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.zzdiq.zza(thread, th);
            } catch (Throwable unused) {
                zzaxi.zzes("AdMob exception reporter failed reporting the exception.");
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.zzdis;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        } finally {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.zzdis;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
        }
    }
}
