package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbzk implements com.google.android.gms.ads.internal.zzi {
    private final /* synthetic */ zzbzl zzfqm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbzk(zzbzl zzbzlVar) {
        this.zzfqm = zzbzlVar;
    }

    @Override // com.google.android.gms.ads.internal.zzi
    public final void zzjp() {
        zzbou zzbouVar;
        zzbouVar = this.zzfqm.zzfqn;
        zzbouVar.onPause();
    }

    @Override // com.google.android.gms.ads.internal.zzi
    public final void zzjq() {
        zzbou zzbouVar;
        zzbouVar = this.zzfqm.zzfqn;
        zzbouVar.onResume();
    }
}
