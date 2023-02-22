package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbsb implements zzdwb<zzbqs<zzbog>> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzaxl> zzfan;
    private final zzdwo<zzcvr> zzfcp;
    private final zzdwo<zzcwe> zzfef;
    private final zzbrx zzfin;

    private zzbsb(zzbrx zzbrxVar, zzdwo<Context> zzdwoVar, zzdwo<zzaxl> zzdwoVar2, zzdwo<zzcvr> zzdwoVar3, zzdwo<zzcwe> zzdwoVar4) {
        this.zzfin = zzbrxVar;
        this.zzejy = zzdwoVar;
        this.zzfan = zzdwoVar2;
        this.zzfcp = zzdwoVar3;
        this.zzfef = zzdwoVar4;
    }

    public static zzbsb zza(zzbrx zzbrxVar, zzdwo<Context> zzdwoVar, zzdwo<zzaxl> zzdwoVar2, zzdwo<zzcvr> zzdwoVar3, zzdwo<zzcwe> zzdwoVar4) {
        return new zzbsb(zzbrxVar, zzdwoVar, zzdwoVar2, zzdwoVar3, zzdwoVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        final Context context = this.zzejy.get();
        final zzaxl zzaxlVar = this.zzfan.get();
        final zzcvr zzcvrVar = this.zzfcp.get();
        final zzcwe zzcweVar = this.zzfef.get();
        return (zzbqs) zzdwh.zza(new zzbqs(new zzbog(context, zzaxlVar, zzcvrVar, zzcweVar) { // from class: com.google.android.gms.internal.ads.zzbrw
            private final Context zzdpy;
            private final zzaxl zzfdz;
            private final zzcvr zzfea;
            private final zzcwe zzfeb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdpy = context;
                this.zzfdz = zzaxlVar;
                this.zzfea = zzcvrVar;
                this.zzfeb = zzcweVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbog
            public final void onAdLoaded() {
                com.google.android.gms.ads.internal.zzq.zzkt().zzb(this.zzdpy, this.zzfdz.zzblz, this.zzfea.zzgjj.toString(), this.zzfeb.zzgkh);
            }
        }, zzaxn.zzdwn), "Cannot return null from a non-@Nullable @Provides method");
    }
}
