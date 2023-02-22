package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdjn;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzdfo extends zzdem<zzdec, zzdlc, zzdjc> {
    public zzdfo() {
        super(zzdec.class, zzdlc.class, zzdjc.class, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final int getVersion() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* bridge */ /* synthetic */ void zzd(zzdjc zzdjcVar) throws GeneralSecurityException {
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final zzdjn.zzb zzapp() {
        return zzdjn.zzb.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ zzdjc zzt(zzdpm zzdpmVar) throws zzdrg {
        return zzdjc.zzbj(zzdpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ zzdlc zzs(zzdpm zzdpmVar) throws zzdrg {
        return zzdlc.zzcv(zzdpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ zzdlc zzg(zzdjc zzdjcVar) throws GeneralSecurityException {
        return (zzdlc) ((zzdqw) zzdlc.zzaws().zzfe(0).zzcy(zzdpm.zzy(zzdoj.zzff(32))).zzazr());
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final /* synthetic */ zzdec zze(zzdlc zzdlcVar) throws GeneralSecurityException {
        return new zzdov(zzdlcVar.zzaqj().toByteArray());
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ void zzc(zzdlc zzdlcVar) throws GeneralSecurityException {
        zzdlc zzdlcVar2 = zzdlcVar;
        zzdou.zzx(zzdlcVar2.getVersion(), 0);
        if (zzdlcVar2.zzaqj().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
