package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdey;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzdfa implements zzdey.zza {
    private final /* synthetic */ zzden zzgtb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdfa(zzden zzdenVar) {
        this.zzgtb = zzdenVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdey.zza
    public final <Q> zzden<Q> zzb(Class<Q> cls) throws GeneralSecurityException {
        if (!this.zzgtb.zzapo().equals(cls)) {
            throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
        }
        return this.zzgtb;
    }

    @Override // com.google.android.gms.internal.ads.zzdey.zza
    public final zzden<?> zzapw() {
        return this.zzgtb;
    }

    @Override // com.google.android.gms.internal.ads.zzdey.zza
    public final Class<?> zzapx() {
        return this.zzgtb.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzdey.zza
    public final Set<Class<?>> zzapy() {
        return Collections.singleton(this.zzgtb.zzapo());
    }
}
