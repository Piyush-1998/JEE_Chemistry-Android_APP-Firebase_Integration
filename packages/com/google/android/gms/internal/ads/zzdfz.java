package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
class zzdfz implements zzdex<zzdei> {
    private static final Logger logger = Logger.getLogger(zzdfz.class.getName());

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    static class zza implements zzdei {
        private final zzdev<zzdei> zzgtj;

        public zza(zzdev<zzdei> zzdevVar) {
            this.zzgtj = zzdevVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final Class<zzdei> zzapo() {
        return zzdei.class;
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final /* synthetic */ zzdei zza(zzdev<zzdei> zzdevVar) throws GeneralSecurityException {
        return new zza(zzdevVar);
    }
}
