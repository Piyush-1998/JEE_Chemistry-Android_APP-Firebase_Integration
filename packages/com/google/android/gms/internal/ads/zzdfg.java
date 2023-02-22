package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
class zzdfg implements zzdex<zzdec> {
    private static final Logger logger = Logger.getLogger(zzdfg.class.getName());

    @Override // com.google.android.gms.internal.ads.zzdex
    public final Class<zzdec> zzapo() {
        return zzdec.class;
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    static class zza implements zzdec {
        private final zzdev<zzdec> zzgtf;

        private zza(zzdev<zzdec> zzdevVar) {
            this.zzgtf = zzdevVar;
        }

        @Override // com.google.android.gms.internal.ads.zzdec
        public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            return zzdmn.zza(this.zzgtf.zzapv().zzapu(), this.zzgtf.zzapv().zzapr().zzc(bArr, bArr2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final /* synthetic */ zzdec zza(zzdev<zzdec> zzdevVar) throws GeneralSecurityException {
        return new zza(zzdevVar);
    }
}
