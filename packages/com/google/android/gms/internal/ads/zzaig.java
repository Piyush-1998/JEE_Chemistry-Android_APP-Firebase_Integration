package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaig implements zzaxx {
    private final /* synthetic */ zzaia zzdao;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaig(zzaie zzaieVar, zzaia zzaiaVar) {
        this.zzdao = zzaiaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    public final void run() {
        zzaug.zzdy("Rejecting reference for JS Engine.");
        this.zzdao.reject();
    }
}
