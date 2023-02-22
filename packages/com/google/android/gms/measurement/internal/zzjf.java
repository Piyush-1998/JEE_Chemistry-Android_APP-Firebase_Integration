package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjf extends zzaa {
    private final /* synthetic */ zzjg zzsa;
    private final /* synthetic */ zzjc zzsm;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjf(zzjc zzjcVar, zzgh zzghVar, zzjg zzjgVar) {
        super(zzghVar);
        this.zzsm = zzjcVar;
        this.zzsa = zzjgVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaa
    public final void run() {
        this.zzsm.cancel();
        this.zzsm.zzab().zzgs().zzao("Starting upload from DelayedRunnable");
        this.zzsa.zzjl();
    }
}
