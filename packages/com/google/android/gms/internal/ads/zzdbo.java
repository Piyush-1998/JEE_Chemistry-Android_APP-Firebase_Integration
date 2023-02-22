package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzdbo extends zzdbd<Map.Entry<K, V>> {
    private final /* synthetic */ zzdbp zzgpr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdbo(zzdbp zzdbpVar) {
        this.zzgpr = zzdbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final boolean zzaoo() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zzgpr.size;
        return i;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zzgpr.size;
        zzdaq.zzr(i, i2);
        objArr = this.zzgpr.zzgpo;
        int i3 = i * 2;
        zzdbp zzdbpVar = this.zzgpr;
        Object obj = objArr[i3];
        objArr2 = zzdbpVar.zzgpo;
        return new AbstractMap.SimpleImmutableEntry(obj, objArr2[i3 + 1]);
    }
}
