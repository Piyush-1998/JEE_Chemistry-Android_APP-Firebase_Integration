package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbty implements zzdwb<zzbuv> {
    private final zzdwo<zzbuu> zzetv;
    private final zzbtx zzfkj;

    public zzbty(zzbtx zzbtxVar, zzdwo<zzbuu> zzdwoVar) {
        this.zzfkj = zzbtxVar;
        this.zzetv = zzdwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzbuv) zzdwh.zza(this.zzetv.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
