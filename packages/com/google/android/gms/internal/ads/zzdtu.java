package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
final class zzdtu implements Iterator<String> {
    private final /* synthetic */ zzdts zzhos;
    private Iterator<String> zzhpo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdtu(zzdts zzdtsVar) {
        zzdrn zzdrnVar;
        this.zzhos = zzdtsVar;
        zzdrnVar = this.zzhos.zzhot;
        this.zzhpo = zzdrnVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzhpo.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zzhpo.next();
    }
}
