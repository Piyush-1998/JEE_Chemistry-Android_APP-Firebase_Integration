package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
final class zzdrv implements zzdsd {
    private zzdsd[] zzhms;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdrv(zzdsd... zzdsdVarArr) {
        this.zzhms = zzdsdVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzdsd
    public final boolean zzc(Class<?> cls) {
        for (zzdsd zzdsdVar : this.zzhms) {
            if (zzdsdVar.zzc(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdsd
    public final zzdse zzd(Class<?> cls) {
        zzdsd[] zzdsdVarArr;
        for (zzdsd zzdsdVar : this.zzhms) {
            if (zzdsdVar.zzc(cls)) {
                return zzdsdVar.zzd(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
