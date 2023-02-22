package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdep {
    private zzdjx zzgsp;

    private zzdep(zzdjx zzdjxVar) {
        this.zzgsp = zzdjxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final zzdep zza(zzdjx zzdjxVar) throws GeneralSecurityException {
        if (zzdjxVar == null || zzdjxVar.zzauk() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzdep(zzdjxVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzdjx zzapq() {
        return this.zzgsp;
    }

    public final String toString() {
        return zzdfb.zzc(this.zzgsp).toString();
    }
}
