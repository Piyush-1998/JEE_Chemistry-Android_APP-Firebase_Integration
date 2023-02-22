package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdjn;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzdfn extends zzdem<zzdec, zzdkb, zzdkc> {
    public zzdfn() {
        super(zzdec.class, zzdkb.class, zzdkc.class, "type.googleapis.com/google.crypto.tink.KmsAeadKey");
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final int getVersion() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* bridge */ /* synthetic */ void zzd(zzdkc zzdkcVar) throws GeneralSecurityException {
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final zzdjn.zzb zzapp() {
        return zzdjn.zzb.REMOTE;
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ zzdkc zzt(zzdpm zzdpmVar) throws zzdrg {
        return zzdkc.zzbq(zzdpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ zzdkb zzs(zzdpm zzdpmVar) throws zzdrg {
        return zzdkb.zzbp(zzdpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final /* synthetic */ zzdkb zzg(zzdkc zzdkcVar) throws GeneralSecurityException {
        return (zzdkb) ((zzdqw) zzdkb.zzaux().zzb(zzdkcVar).zzex(0).zzazr());
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final /* synthetic */ zzdec zze(zzdkb zzdkbVar) throws GeneralSecurityException {
        String zzauz = zzdkbVar.zzauw().zzauz();
        return zzdeq.zzgp(zzauz).zzgr(zzauz);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ void zzc(zzdkb zzdkbVar) throws GeneralSecurityException {
        zzdou.zzx(zzdkbVar.getVersion(), 0);
    }
}
