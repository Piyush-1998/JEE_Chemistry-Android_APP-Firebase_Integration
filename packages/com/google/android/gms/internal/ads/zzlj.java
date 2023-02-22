package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzlj implements Runnable {
    private final /* synthetic */ zzli zzazs;
    private final /* synthetic */ zzlo zzbat;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlj(zzli zzliVar, zzlo zzloVar) {
        this.zzazs = zzliVar;
        this.zzbat = zzloVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        this.zzbat.release();
        sparseArray = this.zzazs.zzbae;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray2 = this.zzazs.zzbae;
            ((zzmc) sparseArray2.valueAt(i)).disable();
        }
    }
}
