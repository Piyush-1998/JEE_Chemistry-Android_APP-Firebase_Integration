package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbsx implements com.google.android.gms.ads.internal.overlay.zzo, zzbog {
    private final zzaxl zzblk;
    private final zzbbw zzczi;
    private final zzcvr zzfet;
    private IObjectWrapper zzfeu;
    private final int zzfis;
    private final Context zzlk;

    public zzbsx(Context context, zzbbw zzbbwVar, zzcvr zzcvrVar, zzaxl zzaxlVar, int i) {
        this.zzlk = context;
        this.zzczi = zzbbwVar;
        this.zzfet = zzcvrVar;
        this.zzblk = zzaxlVar;
        this.zzfis = i;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onResume() {
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void onAdLoaded() {
        int i = this.zzfis;
        if ((i == 7 || i == 3) && this.zzfet.zzdlo && this.zzczi != null && com.google.android.gms.ads.internal.zzq.zzky().zzp(this.zzlk)) {
            int i2 = this.zzblk.zzdwe;
            int i3 = this.zzblk.zzdwf;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i2);
            sb.append(".");
            sb.append(i3);
            IObjectWrapper zza = com.google.android.gms.ads.internal.zzq.zzky().zza(sb.toString(), this.zzczi.getWebView(), "", "javascript", this.zzfet.zzgjo.optInt("media_type", -1) == 0 ? null : "javascript");
            this.zzfeu = zza;
            if (zza == null || this.zzczi.getView() == null) {
                return;
            }
            com.google.android.gms.ads.internal.zzq.zzky().zza(this.zzfeu, this.zzczi.getView());
            this.zzczi.zzaq(this.zzfeu);
            com.google.android.gms.ads.internal.zzq.zzky().zzae(this.zzfeu);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzsi() {
        this.zzfeu = null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzsj() {
        zzbbw zzbbwVar;
        if (this.zzfeu == null || (zzbbwVar = this.zzczi) == null) {
            return;
        }
        zzbbwVar.zza("onSdkImpression", new HashMap());
    }
}
