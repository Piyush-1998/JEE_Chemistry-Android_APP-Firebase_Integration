package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes.dex */
final class zzcc extends ContentObserver {
    private final /* synthetic */ zzca zzaaq;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcc(zzca zzcaVar, Handler handler) {
        super(null);
        this.zzaaq = zzcaVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zzaaq.zzrf();
    }
}
