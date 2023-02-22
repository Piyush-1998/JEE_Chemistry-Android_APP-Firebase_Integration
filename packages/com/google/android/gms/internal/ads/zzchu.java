package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzchu implements zzbsu {
    private final zzaxl zzblh;
    private final zzcvr zzflx;
    private final zzddi<zzbru> zzfyq;
    private final zzbbw zzfyr;
    private final Context zzlk;

    private zzchu(Context context, zzaxl zzaxlVar, zzddi<zzbru> zzddiVar, zzcvr zzcvrVar, zzbbw zzbbwVar) {
        this.zzlk = context;
        this.zzblh = zzaxlVar;
        this.zzfyq = zzddiVar;
        this.zzflx = zzcvrVar;
        this.zzfyr = zzbbwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void zza(boolean z, Context context) {
        this.zzfyr.zzas(true);
        com.google.android.gms.ads.internal.zzq.zzkj();
        com.google.android.gms.ads.internal.zzg zzgVar = new com.google.android.gms.ads.internal.zzg(false, zzaul.zzbb(this.zzlk), false, 0.0f, -1, z, this.zzflx.zzgjl, false);
        com.google.android.gms.ads.internal.zzq.zzki();
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((zztp) null, ((zzbru) zzdcy.zzc(this.zzfyq)).zzadj(), (com.google.android.gms.ads.internal.overlay.zzt) null, this.zzfyr, this.zzflx.zzgjm, this.zzblh, this.zzflx.zzdkv, zzgVar, this.zzflx.zzgje.zzdhz, this.zzflx.zzgje.zzdib), true);
    }
}
