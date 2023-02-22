package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzctx implements zzdwb<zzcrt<JSONObject>> {
    public static zzcrt<JSONObject> zza(Object obj, zzcso zzcsoVar, zzctf zzctfVar, zzdvv<zzcsi> zzdvvVar, zzdvv<zzcss> zzdvvVar2, zzdvv<zzcsw> zzdvvVar3, zzdvv<zzctb> zzdvvVar4, zzdvv<zzctk> zzdvvVar5, zzdvv<zzcto> zzdvvVar6, zzdvv<zzctz> zzdvvVar7, Executor executor) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzcsx) obj);
        hashSet.add(zzcsoVar);
        hashSet.add(zzctfVar);
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcsa)).booleanValue()) {
            hashSet.add(zzdvvVar.get());
        }
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcsb)).booleanValue()) {
            hashSet.add(zzdvvVar2.get());
        }
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcsc)).booleanValue()) {
            hashSet.add(zzdvvVar3.get());
        }
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcsd)).booleanValue()) {
            hashSet.add(zzdvvVar4.get());
        }
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcsg)).booleanValue()) {
            hashSet.add(zzdvvVar5.get());
        }
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcsi)).booleanValue()) {
            hashSet.add(zzdvvVar6.get());
        }
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcsj)).booleanValue()) {
            hashSet.add(zzdvvVar7.get());
        }
        return (zzcrt) zzdwh.zza(new zzcrt(executor, hashSet), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        throw new NoSuchMethodError();
    }
}
