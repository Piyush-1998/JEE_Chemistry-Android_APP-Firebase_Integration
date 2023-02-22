package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfe implements Thread.UncaughtExceptionHandler {
    private final String zzns;
    private final /* synthetic */ zzfc zznt;

    public zzfe(zzfc zzfcVar, String str) {
        this.zznt = zzfcVar;
        Preconditions.checkNotNull(str);
        this.zzns = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.zznt.zzab().zzgk().zza(this.zzns, th);
    }
}
