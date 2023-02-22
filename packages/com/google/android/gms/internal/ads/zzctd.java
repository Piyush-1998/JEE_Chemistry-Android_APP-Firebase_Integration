package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzctd implements zzdwb<zzctb> {
    private final zzdwo<zzatj> zzeqj;
    private final zzdwo<zzddl> zzfck;
    private final zzdwo<String> zzfrb;

    public zzctd(zzdwo<zzatj> zzdwoVar, zzdwo<zzddl> zzdwoVar2, zzdwo<String> zzdwoVar3) {
        this.zzeqj = zzdwoVar;
        this.zzfck = zzdwoVar2;
        this.zzfrb = zzdwoVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzctb(this.zzeqj.get(), this.zzfck.get(), this.zzfrb.get());
    }
}
