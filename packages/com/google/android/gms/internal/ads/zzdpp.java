package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdpp extends zzdpr {
    private final int limit;
    private int position = 0;
    private final /* synthetic */ zzdpm zzhge;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdpp(zzdpm zzdpmVar) {
        this.zzhge = zzdpmVar;
        this.limit = this.zzhge.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.position < this.limit;
    }

    @Override // com.google.android.gms.internal.ads.zzdpv
    public final byte nextByte() {
        int i = this.position;
        if (i >= this.limit) {
            throw new NoSuchElementException();
        }
        this.position = i + 1;
        return this.zzhge.zzfn(i);
    }
}
