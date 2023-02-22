package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgo;
import com.google.android.gms.internal.ads.zzdgx;
import com.google.android.gms.internal.ads.zzdhq;
import com.google.android.gms.internal.ads.zzdji;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzdgh implements zzdmv {
    private final String zzgtn;
    private final int zzgto;
    private zzdhq zzgtp;
    private zzdgo zzgtq;
    private int zzgtr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdgh(zzdjt zzdjtVar) throws GeneralSecurityException {
        String zzatu = zzdjtVar.zzatu();
        this.zzgtn = zzatu;
        if (zzatu.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzdhr zzak = zzdhr.zzak(zzdjtVar.zzatv());
                this.zzgtp = (zzdhq) zzdey.zzb(zzdjtVar);
                this.zzgto = zzak.getKeySize();
            } catch (zzdrg e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (this.zzgtn.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzdgp zzv = zzdgp.zzv(zzdjtVar.zzatv());
                this.zzgtq = (zzdgo) zzdey.zzb(zzdjtVar);
                this.zzgtr = zzv.zzaqf().getKeySize();
                this.zzgto = this.zzgtr + zzv.zzaqg().getKeySize();
            } catch (zzdrg e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else {
            String valueOf = String.valueOf(this.zzgtn);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmv
    public final int zzaqa() {
        return this.zzgto;
    }

    @Override // com.google.android.gms.internal.ads.zzdmv
    public final zzdec zzl(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.zzgto) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.zzgtn.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            return (zzdec) zzdey.zza(this.zzgtn, (zzdhq) ((zzdqw) zzdhq.zzaro().zza((zzdhq.zza) this.zzgtp).zzal(zzdpm.zzh(bArr, 0, this.zzgto)).zzazr()), zzdec.class);
        } else if (this.zzgtn.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zzgtr);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zzgtr, this.zzgto);
            zzdgo.zza zzb = zzdgo.zzaqd().zzdu(this.zzgtq.getVersion()).zzb((zzdgx) ((zzdqw) zzdgx.zzaqu().zza((zzdgx.zza) this.zzgtq.zzaqb()).zzab(zzdpm.zzy(copyOfRange)).zzazr()));
            return (zzdec) zzdey.zza(this.zzgtn, (zzdgo) ((zzdqw) zzb.zzb((zzdji) ((zzdqw) zzdji.zzatl().zza((zzdji.zza) this.zzgtq.zzaqc()).zzbm(zzdpm.zzy(copyOfRange2)).zzazr())).zzazr()), zzdec.class);
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }
}
