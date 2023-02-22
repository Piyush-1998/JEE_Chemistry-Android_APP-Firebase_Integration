package com.google.android.gms.internal.ads;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
final class zzdoz extends WeakReference<Throwable> {
    private final int zzhfj;

    public zzdoz(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.zzhfj = System.identityHashCode(th);
    }

    public final int hashCode() {
        return this.zzhfj;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            zzdoz zzdozVar = (zzdoz) obj;
            if (this.zzhfj == zzdozVar.zzhfj && get() == zzdozVar.get()) {
                return true;
            }
        }
        return false;
    }
}
