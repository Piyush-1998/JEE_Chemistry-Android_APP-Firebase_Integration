package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzcld implements com.google.android.gms.ads.internal.zze {
    private final /* synthetic */ zzcvz zzfzu;
    private final /* synthetic */ zzcvr zzfzv;
    private final /* synthetic */ zzaxv zzgaw;
    private final /* synthetic */ zzclj zzgax;
    private final /* synthetic */ zzclb zzgay;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcld(zzclb zzclbVar, zzaxv zzaxvVar, zzcvz zzcvzVar, zzcvr zzcvrVar, zzclj zzcljVar) {
        this.zzgay = zzclbVar;
        this.zzgaw = zzaxvVar;
        this.zzfzu = zzcvzVar;
        this.zzfzv = zzcvrVar;
        this.zzgax = zzcljVar;
    }

    @Override // com.google.android.gms.ads.internal.zze
    public final void zzjl() {
    }

    @Override // com.google.android.gms.ads.internal.zze
    public final void zzjm() {
    }

    @Override // com.google.android.gms.ads.internal.zze
    public final void zzg(View view) {
        zzclc zzclcVar;
        zzaxv zzaxvVar = this.zzgaw;
        zzclcVar = this.zzgay.zzgav;
        zzaxvVar.set(zzclcVar.zza(this.zzfzu, this.zzfzv, view, this.zzgax));
    }
}
