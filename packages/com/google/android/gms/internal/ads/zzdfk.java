package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdjn;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzdfk extends zzdem<zzdec, zzdhy, zzdjc> {
    public zzdfk() {
        super(zzdec.class, zzdhy.class, zzdjc.class, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
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
    protected final /* synthetic */ zzdhy zzs(zzdpm zzdpmVar) throws zzdrg {
        return zzdhy.zzap(zzdpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ zzdhy zzg(zzdjc zzdjcVar) throws GeneralSecurityException {
        return (zzdhy) ((zzdqw) zzdhy.zzaru().zzec(0).zzaq(zzdpm.zzy(zzdoj.zzff(32))).zzazr());
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final /* synthetic */ zzdec zze(zzdhy zzdhyVar) throws GeneralSecurityException {
        return new zzdms(zzdhyVar.zzaqj().toByteArray());
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ void zzc(zzdhy zzdhyVar) throws GeneralSecurityException {
        zzdhy zzdhyVar2 = zzdhyVar;
        zzdou.zzx(zzdhyVar2.getVersion(), 0);
        if (zzdhyVar2.zzaqj().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
