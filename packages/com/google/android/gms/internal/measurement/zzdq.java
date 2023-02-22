package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
abstract class zzdq implements zzdu {
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public /* synthetic */ Byte next() {
        return Byte.valueOf(nextByte());
    }
}
