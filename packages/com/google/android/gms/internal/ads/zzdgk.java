package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
class zzdgk implements zzdex<zzdet> {
    private static final Logger logger = Logger.getLogger(zzdgk.class.getName());

    @Override // com.google.android.gms.internal.ads.zzdex
    public final Class<zzdet> zzapo() {
        return zzdet.class;
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    static class zza implements zzdet {
        private final zzdev<zzdet> zzgtj;
        private final byte[] zzgts;

        private zza(zzdev<zzdet> zzdevVar) {
            this.zzgts = new byte[]{0};
            this.zzgtj = zzdevVar;
        }

        @Override // com.google.android.gms.internal.ads.zzdet
        public final byte[] zzk(byte[] bArr) throws GeneralSecurityException {
            if (this.zzgtj.zzapv().zzapt().equals(zzdkj.LEGACY)) {
                return zzdmn.zza(this.zzgtj.zzapv().zzapu(), this.zzgtj.zzapv().zzapr().zzk(zzdmn.zza(bArr, this.zzgts)));
            }
            return zzdmn.zza(this.zzgtj.zzapv().zzapu(), this.zzgtj.zzapv().zzapr().zzk(bArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final /* synthetic */ zzdet zza(zzdev<zzdet> zzdevVar) throws GeneralSecurityException {
        return new zza(zzdevVar);
    }
}
