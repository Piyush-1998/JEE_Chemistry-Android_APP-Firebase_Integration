package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdjn;
import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdfj extends zzdem<zzdof, zzdgx, zzdha> {
    public zzdfj() {
        super(zzdof.class, zzdgx.class, zzdha.class, "type.googleapis.com/google.crypto.tink.AesCtrKey");
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final int getVersion() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final zzdjn.zzb zzapp() {
        return zzdjn.zzb.SYMMETRIC;
    }

    private static void zza(zzdhb zzdhbVar) throws GeneralSecurityException {
        if (zzdhbVar.zzaqz() < 12 || zzdhbVar.zzaqz() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ zzdha zzt(zzdpm zzdpmVar) throws zzdrg {
        return zzdha.zzac(zzdpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ zzdgx zzs(zzdpm zzdpmVar) throws zzdrg {
        return zzdgx.zzaa(zzdpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final /* synthetic */ zzdgx zzg(zzdha zzdhaVar) throws GeneralSecurityException {
        zzdha zzdhaVar2 = zzdhaVar;
        return (zzdgx) ((zzdqw) zzdgx.zzaqu().zzc(zzdhaVar2.zzaqt()).zzab(zzdpm.zzy(zzdoj.zzff(zzdhaVar2.getKeySize()))).zzdw(0).zzazr());
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final /* synthetic */ zzdof zze(zzdgx zzdgxVar) throws GeneralSecurityException {
        zzdgx zzdgxVar2 = zzdgxVar;
        return new zzdmg(zzdgxVar2.zzaqj().toByteArray(), zzdgxVar2.zzaqt().zzaqz());
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ void zzd(zzdha zzdhaVar) throws GeneralSecurityException {
        zzdha zzdhaVar2 = zzdhaVar;
        zzdou.zzfg(zzdhaVar2.getKeySize());
        zza(zzdhaVar2.zzaqt());
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ void zzc(zzdgx zzdgxVar) throws GeneralSecurityException {
        zzdgx zzdgxVar2 = zzdgxVar;
        zzdou.zzx(zzdgxVar2.getVersion(), 0);
        zzdou.zzfg(zzdgxVar2.zzaqj().size());
        zza(zzdgxVar2.zzaqt());
    }
}
