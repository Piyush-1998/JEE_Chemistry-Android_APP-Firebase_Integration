package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbyl implements zzdcz<zzbbw> {
    private final /* synthetic */ String zzfpt;
    private final /* synthetic */ zzaer zzfpu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbyl(zzbyh zzbyhVar, String str, zzaer zzaerVar) {
        this.zzfpt = str;
        this.zzfpu = zzaerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzb(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final /* synthetic */ void onSuccess(zzbbw zzbbwVar) {
        zzbbwVar.zza(this.zzfpt, this.zzfpu);
    }
}
