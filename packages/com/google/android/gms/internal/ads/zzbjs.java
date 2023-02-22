package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbjs implements zzdwb<Boolean> {
    private final zzdwo<zzcwe> zzfef;

    public zzbjs(zzdwo<zzcwe> zzdwoVar) {
        this.zzfef = zzdwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        boolean booleanValue;
        if (this.zzfef.get().zzana() != null) {
            booleanValue = ((Boolean) zzuv.zzon().zzd(zzza.zzclc)).booleanValue();
        } else {
            booleanValue = ((Boolean) zzuv.zzon().zzd(zzza.zzcrt)).booleanValue();
        }
        return Boolean.valueOf(booleanValue);
    }
}
