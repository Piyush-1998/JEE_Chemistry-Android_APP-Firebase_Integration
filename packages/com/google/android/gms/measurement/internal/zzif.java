package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzif extends zzaa {
    private final /* synthetic */ zzhv zzrd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzif(zzhv zzhvVar, zzgh zzghVar) {
        super(zzghVar);
        this.zzrd = zzhvVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaa
    public final void run() {
        this.zzrd.zzab().zzgn().zzao("Tasks have been queued for a long time");
    }
}
