package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zaai extends zabf {
    private final /* synthetic */ zaah zafv;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaai(zaah zaahVar, zabd zabdVar) {
        super(zabdVar);
        this.zafv = zaahVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zaan() {
        this.zafv.onConnectionSuspended(1);
    }
}
