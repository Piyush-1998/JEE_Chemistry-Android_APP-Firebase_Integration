package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
final class zzdtb extends zzdth {
    private final /* synthetic */ zzdta zzhoh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzdtb(zzdta zzdtaVar) {
        super(zzdtaVar, null);
        this.zzhoh = zzdtaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdth, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new zzdtc(this.zzhoh, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdtb(zzdta zzdtaVar, zzdsz zzdszVar) {
        this(zzdtaVar);
    }
}
