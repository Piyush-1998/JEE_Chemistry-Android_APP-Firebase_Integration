package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdjn;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzdfi extends zzdem<zzdec, zzdhe, zzdhf> {
    public zzdfi() {
        super(zzdec.class, zzdhe.class, zzdhf.class, "type.googleapis.com/google.crypto.tink.AesEaxKey");
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
    protected final /* synthetic */ zzdhf zzt(zzdpm zzdpmVar) throws zzdrg {
        return zzdhf.zzae(zzdpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ zzdhe zzs(zzdpm zzdpmVar) throws zzdrg {
        return zzdhe.zzad(zzdpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final /* synthetic */ zzdhe zzg(zzdhf zzdhfVar) throws GeneralSecurityException {
        zzdhf zzdhfVar2 = zzdhfVar;
        return (zzdhe) ((zzdqw) zzdhe.zzard().zzaf(zzdpm.zzy(zzdoj.zzff(zzdhfVar2.getKeySize()))).zzb(zzdhfVar2.zzarc()).zzdx(0).zzazr());
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final /* synthetic */ zzdec zze(zzdhe zzdheVar) throws GeneralSecurityException {
        zzdhe zzdheVar2 = zzdheVar;
        return new zzdmf(zzdheVar2.zzaqj().toByteArray(), zzdheVar2.zzarc().zzaqz());
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ void zzd(zzdhf zzdhfVar) throws GeneralSecurityException {
        zzdhf zzdhfVar2 = zzdhfVar;
        zzdou.zzfg(zzdhfVar2.getKeySize());
        if (zzdhfVar2.zzarc().zzaqz() != 12 && zzdhfVar2.zzarc().zzaqz() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ void zzc(zzdhe zzdheVar) throws GeneralSecurityException {
        zzdhe zzdheVar2 = zzdheVar;
        zzdou.zzx(zzdheVar2.getVersion(), 0);
        zzdou.zzfg(zzdheVar2.zzaqj().size());
        if (zzdheVar2.zzarc().zzaqz() != 12 && zzdheVar2.zzarc().zzaqz() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
