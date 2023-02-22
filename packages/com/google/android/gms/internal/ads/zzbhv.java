package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbhv implements zzdwb<Set<zzbqs<zzpj>>> {
    private final zzdwo<Executor> zzfck;
    private final zzdwo<zzbhk> zzfcs;
    private final zzdwo<JSONObject> zzfct;

    private zzbhv(zzdwo<zzbhk> zzdwoVar, zzdwo<Executor> zzdwoVar2, zzdwo<JSONObject> zzdwoVar3) {
        this.zzfcs = zzdwoVar;
        this.zzfck = zzdwoVar2;
        this.zzfct = zzdwoVar3;
    }

    public static zzbhv zzf(zzdwo<zzbhk> zzdwoVar, zzdwo<Executor> zzdwoVar2, zzdwo<JSONObject> zzdwoVar3) {
        return new zzbhv(zzdwoVar, zzdwoVar2, zzdwoVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        Set singleton;
        zzbhk zzbhkVar = this.zzfcs.get();
        Executor executor = this.zzfck.get();
        if (this.zzfct.get() == null) {
            singleton = Collections.emptySet();
        } else {
            singleton = Collections.singleton(new zzbqs(zzbhkVar, executor));
        }
        return (Set) zzdwh.zza(singleton, "Cannot return null from a non-@Nullable @Provides method");
    }
}
