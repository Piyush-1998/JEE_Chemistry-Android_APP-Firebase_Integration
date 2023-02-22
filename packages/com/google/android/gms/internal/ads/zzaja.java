package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaja implements zzaxx {
    private final /* synthetic */ zzaxv zzcyd;
    private final /* synthetic */ zzaia zzdbh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaja(zzaiy zzaiyVar, zzaxv zzaxvVar, zzaia zzaiaVar) {
        this.zzcyd = zzaxvVar;
        this.zzdbh = zzaiaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    public final void run() {
        this.zzcyd.setException(new zzaim("Unable to obtain a JavascriptEngine."));
        this.zzdbh.release();
    }
}
