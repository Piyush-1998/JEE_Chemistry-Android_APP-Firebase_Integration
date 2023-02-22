package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdo extends zzdq {
    private final int limit;
    private int position = 0;
    private final /* synthetic */ zzdp zzadg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdo(zzdp zzdpVar) {
        this.zzadg = zzdpVar;
        this.limit = this.zzadg.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.position < this.limit;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final byte nextByte() {
        int i = this.position;
        if (i >= this.limit) {
            throw new NoSuchElementException();
        }
        this.position = i + 1;
        return this.zzadg.zzar(i);
    }
}
