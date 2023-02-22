package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzrj implements zzqa {
    private final /* synthetic */ zzrh zzbrg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzrj(zzrh zzrhVar) {
        this.zzbrg = zzrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzo(boolean z) {
        if (!z) {
            this.zzbrg.disconnect();
        } else {
            this.zzbrg.connect();
        }
    }
}
