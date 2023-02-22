package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzawa implements zzy {
    private final /* synthetic */ String zzduo;
    private final /* synthetic */ zzawb zzdup;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawa(zzavy zzavyVar, String str, zzawb zzawbVar) {
        this.zzduo = str;
        this.zzdup = zzawbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzy
    public final void zzc(zzae zzaeVar) {
        String str = this.zzduo;
        String zzaeVar2 = zzaeVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(zzaeVar2).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(zzaeVar2);
        zzaug.zzeu(sb.toString());
        this.zzdup.zzb(null);
    }
}
