package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdjn;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzdfv extends zzdem<zzdel, zzdit, zzdjc> {
    public zzdfv() {
        super(zzdel.class, zzdit.class, zzdjc.class, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
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
        return zzdjn.zzb.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ zzdjc zzt(zzdpm zzdpmVar) throws zzdrg {
        return zzdjc.zzbj(zzdpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ zzdit zzs(zzdpm zzdpmVar) throws zzdrg {
        return zzdit.zzbb(zzdpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final /* synthetic */ zzdit zzg(zzdjc zzdjcVar) throws GeneralSecurityException {
        throw new GeneralSecurityException("Not implemented.");
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ zzdel zze(zzdit zzditVar) throws GeneralSecurityException {
        zzdit zzditVar2 = zzditVar;
        zzdip zzaso = zzditVar2.zzaso();
        zzdiw zzasq = zzaso.zzasq();
        return new zzdmx(zzdno.zza(zzdgf.zza(zzasq.zzatb()), zzditVar2.zzasg().toByteArray(), zzditVar2.zzash().toByteArray()), zzasq.zzatc().toByteArray(), zzdgf.zza(zzasq.zzaqp()), zzdgf.zza(zzaso.zzass()), new zzdgh(zzaso.zzasr().zzasl()));
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ void zzc(zzdit zzditVar) throws GeneralSecurityException {
        zzdit zzditVar2 = zzditVar;
        zzdou.zzx(zzditVar2.getVersion(), 0);
        zzdgf.zza(zzditVar2.zzaso());
    }
}
