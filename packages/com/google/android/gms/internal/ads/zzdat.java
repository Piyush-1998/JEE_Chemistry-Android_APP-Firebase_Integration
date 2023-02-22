package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdat<T> extends zzdar<T> {
    private final T zzczg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdat(T t) {
        this.zzczg = t;
    }

    @Override // com.google.android.gms.internal.ads.zzdar
    public final T zzaof() {
        return this.zzczg;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof zzdat) {
            return this.zzczg.equals(((zzdat) obj).zzczg);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzczg.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzczg);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
