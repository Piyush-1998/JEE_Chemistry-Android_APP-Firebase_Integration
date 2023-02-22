package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
final class zzdti implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private final /* synthetic */ zzdta zzhoh;
    private Iterator<Map.Entry<K, V>> zzhoi;
    private boolean zzhom;

    private zzdti(zzdta zzdtaVar) {
        this.zzhoh = zzdtaVar;
        this.pos = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.pos + 1;
        list = this.zzhoh.zzhoc;
        if (i >= list.size()) {
            map = this.zzhoh.zzhod;
            if (map.isEmpty() || !zzbbt().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.zzhom) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzhom = false;
        this.zzhoh.zzbbr();
        int i = this.pos;
        list = this.zzhoh.zzhoc;
        if (i < list.size()) {
            zzdta zzdtaVar = this.zzhoh;
            int i2 = this.pos;
            this.pos = i2 - 1;
            zzdtaVar.zzha(i2);
            return;
        }
        zzbbt().remove();
    }

    private final Iterator<Map.Entry<K, V>> zzbbt() {
        Map map;
        if (this.zzhoi == null) {
            map = this.zzhoh.zzhod;
            this.zzhoi = map.entrySet().iterator();
        }
        return this.zzhoi;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        List list2;
        this.zzhom = true;
        int i = this.pos + 1;
        this.pos = i;
        list = this.zzhoh.zzhoc;
        if (i >= list.size()) {
            return (Map.Entry) zzbbt().next();
        }
        list2 = this.zzhoh.zzhoc;
        return (Map.Entry) list2.get(this.pos);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdti(zzdta zzdtaVar, zzdsz zzdszVar) {
        this(zzdtaVar);
    }
}
