package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.ads.zzczh;
import com.google.android.gms.internal.ads.zzczl;

/* compiled from: com.google.android.gms:play-services-gass@@18.2.0 */
/* loaded from: classes.dex */
public final class zzczf {
    private final Looper zzgnn;
    private final Context zzlk;

    public zzczf(Context context, Looper looper) {
        this.zzlk = context;
        this.zzgnn = looper;
    }

    public final void zzgl(String str) {
        new zzcze(this.zzlk, this.zzgnn, (zzczl) ((zzdqw) zzczl.zzanz().zzgo(this.zzlk.getPackageName()).zzb(zzczl.zzb.BLOCKED_IMPRESSION).zzb(zzczh.zzanx().zzgn(str).zzb(zzczh.zza.BLOCKED_REASON_BACKGROUND)).zzazr())).zzanw();
    }
}
