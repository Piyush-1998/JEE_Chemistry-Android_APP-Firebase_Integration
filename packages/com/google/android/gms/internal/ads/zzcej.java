package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzcej implements zzbpc {
    private final zzasl zzbnf;
    private final Context zzlk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcej(Context context, zzasl zzaslVar) {
        this.zzlk = context;
        this.zzbnf = zzaslVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zzb(zzape zzapeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zza(zzcvz zzcvzVar) {
        if (TextUtils.isEmpty(zzcvzVar.zzgkb.zzgjy.zzdlq)) {
            return;
        }
        this.zzbnf.zza(this.zzlk, zzcvzVar.zzgka.zzfga.zzgkg);
        this.zzbnf.zzj(this.zzlk, zzcvzVar.zzgkb.zzgjy.zzdlq);
    }
}
