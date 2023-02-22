package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
final class zzdsc implements zzdrz {
    @Override // com.google.android.gms.internal.ads.zzdrz
    public final Map<?, ?> zzan(Object obj) {
        return (zzdsa) obj;
    }

    @Override // com.google.android.gms.internal.ads.zzdrz
    public final zzdrx<?, ?> zzas(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.zzdrz
    public final Map<?, ?> zzao(Object obj) {
        return (zzdsa) obj;
    }

    @Override // com.google.android.gms.internal.ads.zzdrz
    public final boolean zzap(Object obj) {
        return !((zzdsa) obj).isMutable();
    }

    @Override // com.google.android.gms.internal.ads.zzdrz
    public final Object zzaq(Object obj) {
        ((zzdsa) obj).zzaxj();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzdrz
    public final Object zzar(Object obj) {
        return zzdsa.zzbas().zzbat();
    }

    @Override // com.google.android.gms.internal.ads.zzdrz
    public final Object zze(Object obj, Object obj2) {
        zzdsa zzdsaVar = (zzdsa) obj;
        zzdsa zzdsaVar2 = (zzdsa) obj2;
        if (!zzdsaVar2.isEmpty()) {
            if (!zzdsaVar.isMutable()) {
                zzdsaVar = zzdsaVar.zzbat();
            }
            zzdsaVar.zza(zzdsaVar2);
        }
        return zzdsaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdrz
    public final int zzb(int i, Object obj, Object obj2) {
        zzdsa zzdsaVar = (zzdsa) obj;
        if (zzdsaVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzdsaVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
        return 0;
    }
}
