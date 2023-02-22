package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdwk<T> implements zzdwb<Set<T>> {
    private static final zzdwb<Set<Object>> zzhxs = zzdwe.zzbb(Collections.emptySet());
    private final List<zzdwo<T>> zzhxt;
    private final List<zzdwo<Collection<T>>> zzhxu;

    public static <T> zzdwm<T> zzaq(int i, int i2) {
        return new zzdwm<>(i, i2);
    }

    private zzdwk(List<zzdwo<T>> list, List<zzdwo<Collection<T>>> list2) {
        this.zzhxt = list;
        this.zzhxu = list2;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        int size = this.zzhxt.size();
        ArrayList arrayList = new ArrayList(this.zzhxu.size());
        int size2 = this.zzhxu.size();
        for (int i = 0; i < size2; i++) {
            Collection<T> collection = this.zzhxu.get(i).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet zzhl = zzdwa.zzhl(size);
        int size3 = this.zzhxt.size();
        for (int i2 = 0; i2 < size3; i2++) {
            zzhl.add(zzdwh.checkNotNull(this.zzhxt.get(i2).get()));
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                zzhl.add(zzdwh.checkNotNull(obj));
            }
        }
        return Collections.unmodifiableSet(zzhl);
    }
}
