package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdjn;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzdgg extends zzdem<zzdet, zzdji, zzdjj> {
    public zzdgg() {
        super(zzdet.class, zzdji.class, zzdjj.class, "type.googleapis.com/google.crypto.tink.HmacKey");
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final int getVersion() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final zzdjn.zzb zzapp() {
        return zzdjn.zzb.SYMMETRIC;
    }

    private static void zza(zzdjm zzdjmVar) throws GeneralSecurityException {
        if (zzdjmVar.zzatr() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i = zzdgj.zzgtk[zzdjmVar.zzatq().ordinal()];
        if (i == 1) {
            if (zzdjmVar.zzatr() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i == 2) {
            if (zzdjmVar.zzatr() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i == 3) {
            if (zzdjmVar.zzatr() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("unknown hash type");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ zzdjj zzt(zzdpm zzdpmVar) throws zzdrg {
        return zzdjj.zzbl(zzdpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ zzdji zzs(zzdpm zzdpmVar) throws zzdrg {
        return zzdji.zzbk(zzdpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final /* synthetic */ zzdji zzg(zzdjj zzdjjVar) throws GeneralSecurityException {
        zzdjj zzdjjVar2 = zzdjjVar;
        return (zzdji) ((zzdqw) zzdji.zzatl().zzem(0).zzc(zzdjjVar2.zzatk()).zzbm(zzdpm.zzy(zzdoj.zzff(zzdjjVar2.getKeySize()))).zzazr());
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final /* synthetic */ zzdet zze(zzdji zzdjiVar) throws GeneralSecurityException {
        zzdji zzdjiVar2 = zzdjiVar;
        zzdjg zzatq = zzdjiVar2.zzatk().zzatq();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzdjiVar2.zzaqj().toByteArray(), "HMAC");
        int zzatr = zzdjiVar2.zzatk().zzatr();
        int i = zzdgj.zzgtk[zzatq.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new zzdoi("HMACSHA512", secretKeySpec, zzatr);
                }
                throw new GeneralSecurityException("unknown hash");
            }
            return new zzdoi("HMACSHA256", secretKeySpec, zzatr);
        }
        return new zzdoi("HMACSHA1", secretKeySpec, zzatr);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ void zzd(zzdjj zzdjjVar) throws GeneralSecurityException {
        zzdjj zzdjjVar2 = zzdjjVar;
        if (zzdjjVar2.getKeySize() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zza(zzdjjVar2.zzatk());
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    protected final /* synthetic */ void zzc(zzdji zzdjiVar) throws GeneralSecurityException {
        zzdji zzdjiVar2 = zzdjiVar;
        zzdou.zzx(zzdjiVar2.getVersion(), 0);
        if (zzdjiVar2.zzaqj().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zza(zzdjiVar2.zzatk());
    }
}
