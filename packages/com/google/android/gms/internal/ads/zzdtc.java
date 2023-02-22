package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
final class zzdtc implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private final /* synthetic */ zzdta zzhoh;
    private Iterator<Map.Entry<K, V>> zzhoi;

    private zzdtc(zzdta zzdtaVar) {
        List list;
        this.zzhoh = zzdtaVar;
        list = this.zzhoh.zzhoc;
        this.pos = list.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i = this.pos;
        if (i > 0) {
            list = this.zzhoh.zzhoc;
            if (i <= list.size()) {
                return true;
            }
        }
        return zzbbt().hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final Iterator<Map.Entry<K, V>> zzbbt() {
        Map map;
        if (this.zzhoi == null) {
            map = this.zzhoh.zzhof;
            this.zzhoi = map.entrySet().iterator();
        }
        return this.zzhoi;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        if (zzbbt().hasNext()) {
            return (Map.Entry) zzbbt().next();
        }
        list = this.zzhoh.zzhoc;
        int i = this.pos - 1;
        this.pos = i;
        return (Map.Entry) list.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdtc(zzdta zzdtaVar, zzdsz zzdszVar) {
        this(zzdtaVar);
    }
}
