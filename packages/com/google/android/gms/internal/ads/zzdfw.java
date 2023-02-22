package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdjn;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzdfw extends zzdem<zzdei, zzdis, zzdio> implements zzden<zzdei> {
    public zzdfw() {
        super(zzdei.class, zzdis.class, zzdio.class, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final int getVersion() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final zzdjn.zzb zzapp() {
        return zzdjn.zzb.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ zzdio zzt(zzdpm zzdpmVar) throws zzdrg {
        return zzdio.zzaz(zzdpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ zzdis zzs(zzdpm zzdpmVar) throws zzdrg {
        return zzdis.zzba(zzdpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final /* synthetic */ zzdis zzg(zzdio zzdioVar) throws GeneralSecurityException {
        zzdio zzdioVar2 = zzdioVar;
        KeyPair zza = zzdno.zza(zzdno.zza(zzdgf.zza(zzdioVar2.zzaso().zzasq().zzatb())));
        ECPoint w = ((ECPublicKey) zza.getPublic()).getW();
        return (zzdis) ((zzdqw) zzdis.zzasw().zzeg(0).zzb((zzdit) ((zzdqw) zzdit.zzasy().zzeh(0).zzc(zzdioVar2.zzaso()).zzbd(zzdpm.zzy(w.getAffineX().toByteArray())).zzbe(zzdpm.zzy(w.getAffineY().toByteArray())).zzazr())).zzbc(zzdpm.zzy(((ECPrivateKey) zza.getPrivate()).getS().toByteArray())).zzazr());
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final /* synthetic */ zzdei zze(zzdis zzdisVar) throws GeneralSecurityException {
        zzdis zzdisVar2 = zzdisVar;
        zzdip zzaso = zzdisVar2.zzasv().zzaso();
        zzdiw zzasq = zzaso.zzasq();
        return new zzdmy(zzdno.zza(zzdgf.zza(zzasq.zzatb()), zzdisVar2.zzaqj().toByteArray()), zzasq.zzatc().toByteArray(), zzdgf.zza(zzasq.zzaqp()), zzdgf.zza(zzaso.zzass()), new zzdgh(zzaso.zzasr().zzasl()));
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ void zzd(zzdio zzdioVar) throws GeneralSecurityException {
        zzdgf.zza(zzdioVar.zzaso());
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ void zzc(zzdis zzdisVar) throws GeneralSecurityException {
        zzdis zzdisVar2 = zzdisVar;
        if (zzdisVar2.zzaqj().size() == 0) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        zzdou.zzx(zzdisVar2.getVersion(), 0);
        zzdgf.zza(zzdisVar2.zzasv().zzaso());
    }
}
