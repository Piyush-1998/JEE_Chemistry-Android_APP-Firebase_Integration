package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbaw extends zzauc {
    final zzazj zzdya;
    private final String zzdym;
    private final String[] zzdyn;
    final zzbax zzede;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbaw(zzazj zzazjVar, zzbax zzbaxVar, String str, String[] strArr) {
        this.zzdya = zzazjVar;
        this.zzede = zzbaxVar;
        this.zzdym = str;
        this.zzdyn = strArr;
        com.google.android.gms.ads.internal.zzq.zzlf().zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzauc
    public final void zzsx() {
        try {
            this.zzede.zze(this.zzdym, this.zzdyn);
        } finally {
            zzaul.zzdsu.post(new zzbav(this));
        }
    }
}
