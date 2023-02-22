package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdjn;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzdfp extends zzdem<zzdec, zzdkf, zzdkg> {
    public zzdfp() {
        super(zzdec.class, zzdkf.class, zzdkg.class, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final int getVersion() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* bridge */ /* synthetic */ void zzd(zzdkg zzdkgVar) throws GeneralSecurityException {
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final zzdjn.zzb zzapp() {
        return zzdjn.zzb.REMOTE;
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ zzdkg zzt(zzdpm zzdpmVar) throws zzdrg {
        return zzdkg.zzbs(zzdpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ zzdkf zzs(zzdpm zzdpmVar) throws zzdrg {
        return zzdkf.zzbr(zzdpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final /* synthetic */ zzdkf zzg(zzdkg zzdkgVar) throws GeneralSecurityException {
        return (zzdkf) ((zzdqw) zzdkf.zzavd().zzb(zzdkgVar).zzey(0).zzazr());
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final /* synthetic */ zzdec zze(zzdkf zzdkfVar) throws GeneralSecurityException {
        zzdkf zzdkfVar2 = zzdkfVar;
        String zzavf = zzdkfVar2.zzavc().zzavf();
        return new zzdfm(zzdkfVar2.zzavc().zzavg(), zzdeq.zzgp(zzavf).zzgr(zzavf));
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ void zzc(zzdkf zzdkfVar) throws GeneralSecurityException {
        zzdou.zzx(zzdkfVar.getVersion(), 0);
    }
}
