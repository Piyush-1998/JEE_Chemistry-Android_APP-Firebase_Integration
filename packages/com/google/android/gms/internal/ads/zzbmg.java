package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbmg implements zzdwb<zzdal<zzcvr, zzavd>> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzaxl> zzfan;
    private final zzdwo<zzcwe> zzfef;

    public zzbmg(zzdwo<Context> zzdwoVar, zzdwo<zzaxl> zzdwoVar2, zzdwo<zzcwe> zzdwoVar3) {
        this.zzejy = zzdwoVar;
        this.zzfan = zzdwoVar2;
        this.zzfef = zzdwoVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        final Context context = this.zzejy.get();
        final zzaxl zzaxlVar = this.zzfan.get();
        final zzcwe zzcweVar = this.zzfef.get();
        return (zzdal) zzdwh.zza(new zzdal(context, zzaxlVar, zzcweVar) { // from class: com.google.android.gms.internal.ads.zzbmh
            private final Context zzdpy;
            private final zzaxl zzfdz;
            private final zzcwe zzfgq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdpy = context;
                this.zzfdz = zzaxlVar;
                this.zzfgq = zzcweVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdal
            public final Object apply(Object obj) {
                Context context2 = this.zzdpy;
                zzaxl zzaxlVar2 = this.zzfdz;
                zzcwe zzcweVar2 = this.zzfgq;
                zzcvr zzcvrVar = (zzcvr) obj;
                zzavd zzavdVar = new zzavd(context2);
                zzavdVar.zzej(zzcvrVar.zzdkv);
                zzavdVar.zzek(zzcvrVar.zzgjj.toString());
                zzavdVar.zzr(zzaxlVar2.zzblz);
                zzavdVar.setAdUnitId(zzcweVar2.zzgkh);
                return zzavdVar;
            }
        }, "Cannot return null from a non-@Nullable @Provides method");
    }
}
