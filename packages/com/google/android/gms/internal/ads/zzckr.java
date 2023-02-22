package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzckr implements zzboc {
    private final /* synthetic */ zzcgf zzfzw;
    private final /* synthetic */ zzaxv zzgak;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzckr(zzckm zzckmVar, zzaxv zzaxvVar, zzcgf zzcgfVar) {
        this.zzgak = zzaxvVar;
        this.zzfzw = zzcgfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final synchronized void onAdFailedToLoad(int i) {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcrm)).booleanValue()) {
            i = 3;
        }
        zzaxv zzaxvVar = this.zzgak;
        String str = this.zzfzw.zzffi;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("adapter ");
        sb.append(str);
        sb.append(" failed to load");
        zzaxvVar.setException(new zzcjh(sb.toString(), i));
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final synchronized void onAdLoaded() {
        this.zzgak.set(null);
    }
}
