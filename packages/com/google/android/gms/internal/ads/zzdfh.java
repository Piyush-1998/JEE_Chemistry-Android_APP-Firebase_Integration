package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdjn;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzdfh extends zzdem<zzdec, zzdgo, zzdgp> {
    public zzdfh() throws GeneralSecurityException {
        super(zzdec.class, zzdgo.class, zzdgp.class, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzdey.zza(new zzdfj());
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final int getVersion() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final zzdjn.zzb zzapp() {
        return zzdjn.zzb.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ zzdgp zzt(zzdpm zzdpmVar) throws zzdrg {
        return zzdgp.zzv(zzdpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ zzdgo zzs(zzdpm zzdpmVar) throws zzdrg {
        return zzdgo.zzu(zzdpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final /* synthetic */ zzdgo zzg(zzdgp zzdgpVar) throws GeneralSecurityException {
        zzdgp zzdgpVar2 = zzdgpVar;
        return (zzdgo) ((zzdqw) zzdgo.zzaqd().zzb((zzdgx) zzdey.zza("type.googleapis.com/google.crypto.tink.AesCtrKey", zzdgpVar2.zzaqf())).zzb((zzdji) zzdey.zza("type.googleapis.com/google.crypto.tink.HmacKey", zzdgpVar2.zzaqg())).zzdu(0).zzazr());
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final /* synthetic */ zzdec zze(zzdgo zzdgoVar) throws GeneralSecurityException {
        zzdgo zzdgoVar2 = zzdgoVar;
        return new zzdnr((zzdof) zzdey.zza("type.googleapis.com/google.crypto.tink.AesCtrKey", zzdgoVar2.zzaqb(), zzdof.class), (zzdet) zzdey.zza("type.googleapis.com/google.crypto.tink.HmacKey", zzdgoVar2.zzaqc(), zzdet.class), zzdgoVar2.zzaqc().zzatk().zzatr());
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ void zzd(zzdgp zzdgpVar) throws GeneralSecurityException {
        zzdou.zzfg(zzdgpVar.zzaqf().getKeySize());
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ void zzc(zzdgo zzdgoVar) throws GeneralSecurityException {
        zzdou.zzx(zzdgoVar.getVersion(), 0);
    }
}
