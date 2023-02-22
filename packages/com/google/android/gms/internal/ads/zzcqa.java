package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcqa implements zzdwb<zzcpy> {
    private final zzdwo<zzddl> zzfck;

    private zzcqa(zzdwo<zzddl> zzdwoVar) {
        this.zzfck = zzdwoVar;
    }

    public static zzcqa zzak(zzdwo<zzddl> zzdwoVar) {
        return new zzcqa(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcpy(this.zzfck.get());
    }
}
