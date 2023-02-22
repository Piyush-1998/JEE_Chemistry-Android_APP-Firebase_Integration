package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcaz implements zzdwb<Set<zzbqs<zzcym>>> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<Executor> zzfck;
    private final zzdwo<String> zzfrp;
    private final zzdwo<Map<zzcyd, zzcba>> zzfrq;

    public zzcaz(zzdwo<String> zzdwoVar, zzdwo<Context> zzdwoVar2, zzdwo<Executor> zzdwoVar3, zzdwo<Map<zzcyd, zzcba>> zzdwoVar4) {
        this.zzfrp = zzdwoVar;
        this.zzejy = zzdwoVar2;
        this.zzfck = zzdwoVar3;
        this.zzfrq = zzdwoVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        Set emptySet;
        final String str = this.zzfrp.get();
        Context context = this.zzejy.get();
        Executor executor = this.zzfck.get();
        Map<zzcyd, zzcba> map = this.zzfrq.get();
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcql)).booleanValue()) {
            zzsd zzsdVar = new zzsd(new zzsi(context));
            zzsdVar.zza(new zzsg(str) { // from class: com.google.android.gms.internal.ads.zzcbb
                private final String zzczh;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzczh = str;
                }

                @Override // com.google.android.gms.internal.ads.zzsg
                public final void zza(zztl zztlVar) {
                    zztlVar.zzcap = this.zzczh;
                }
            });
            emptySet = Collections.singleton(new zzbqs(new zzcay(zzsdVar, map), executor));
        } else {
            emptySet = Collections.emptySet();
        }
        return (Set) zzdwh.zza(emptySet, "Cannot return null from a non-@Nullable @Provides method");
    }
}
