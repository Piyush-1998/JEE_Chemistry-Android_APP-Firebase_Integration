package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzarz implements zzdcz<Void> {
    private final /* synthetic */ zzddi zzdou;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzarz(zzarv zzarvVar, zzddi zzddiVar) {
        this.zzdou = zzddiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzb(Throwable th) {
        List list;
        list = zzarv.zzdog;
        list.remove(this.zzdou);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final /* synthetic */ void onSuccess(Void r2) {
        List list;
        list = zzarv.zzdog;
        list.remove(this.zzdou);
    }
}
