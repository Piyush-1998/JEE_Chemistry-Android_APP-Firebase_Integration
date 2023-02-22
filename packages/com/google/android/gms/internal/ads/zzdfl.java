package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdjn;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzdfl extends zzdem<zzdec, zzdhq, zzdhr> {
    public zzdfl() {
        super(zzdec.class, zzdhq.class, zzdhr.class, "type.googleapis.com/google.crypto.tink.AesGcmKey");
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
    protected final /* synthetic */ zzdhr zzt(zzdpm zzdpmVar) throws zzdrg {
        return zzdhr.zzak(zzdpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ zzdhq zzs(zzdpm zzdpmVar) throws zzdrg {
        return zzdhq.zzaj(zzdpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ zzdhq zzg(zzdhr zzdhrVar) throws GeneralSecurityException {
        return (zzdhq) ((zzdqw) zzdhq.zzaro().zzal(zzdpm.zzy(zzdoj.zzff(zzdhrVar.getKeySize()))).zzdz(0).zzazr());
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ zzdec zze(zzdhq zzdhqVar) throws GeneralSecurityException {
        return new zzdmh(zzdhqVar.zzaqj().toByteArray());
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ void zzd(zzdhr zzdhrVar) throws GeneralSecurityException {
        zzdou.zzfg(zzdhrVar.getKeySize());
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ void zzc(zzdhq zzdhqVar) throws GeneralSecurityException {
        zzdhq zzdhqVar2 = zzdhqVar;
        zzdou.zzx(zzdhqVar2.getVersion(), 0);
        zzdou.zzfg(zzdhqVar2.zzaqj().size());
    }
}
