package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
abstract class zzfs {
    private static final zzfs zzajt = new zzfu();
    private static final zzfs zzaju = new zzft();

    private zzfs() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> zza(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void zza(Object obj, Object obj2, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfs zzvh() {
        return zzajt;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfs zzvi() {
        return zzaju;
    }
}
