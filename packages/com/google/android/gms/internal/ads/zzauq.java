package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzauq implements zzawz {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzdtb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzauq(zzaul zzaulVar, Context context, String str) {
        this.val$context = context;
        this.zzdtb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzei(String str) {
        com.google.android.gms.ads.internal.zzq.zzkj();
        zzaul.zzb(this.val$context, this.zzdtb, str);
    }
}
