package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
abstract class zzdrq {
    private static final zzdrq zzhml = new zzdrs();
    private static final zzdrq zzhmm = new zzdrr();

    private zzdrq() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> zza(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void zza(Object obj, Object obj2, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdrq zzbap() {
        return zzhml;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdrq zzbaq() {
        return zzhmm;
    }
}
