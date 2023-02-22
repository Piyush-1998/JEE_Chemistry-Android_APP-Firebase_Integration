package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdjn;
import com.google.android.gms.internal.ads.zzdsg;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzdem<P, KeyProto extends zzdsg, KeyFormatProto extends zzdsg> implements zzden<P> {
    private final Class<P> zzgsl;
    private final Class<KeyProto> zzgsm;
    private final Class<KeyFormatProto> zzgsn;
    private final String zzgso;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdem(Class<P> cls, Class<KeyProto> cls2, Class<KeyFormatProto> cls3, String str) {
        this.zzgsl = cls;
        this.zzgsm = cls2;
        this.zzgsn = cls3;
        this.zzgso = str;
    }

    protected abstract zzdjn.zzb zzapp();

    protected abstract void zzc(KeyProto keyproto) throws GeneralSecurityException;

    protected abstract void zzd(KeyFormatProto keyformatproto) throws GeneralSecurityException;

    protected abstract P zze(KeyProto keyproto) throws GeneralSecurityException;

    protected abstract KeyProto zzg(KeyFormatProto keyformatproto) throws GeneralSecurityException;

    protected abstract KeyProto zzs(zzdpm zzdpmVar) throws zzdrg;

    protected abstract KeyFormatProto zzt(zzdpm zzdpmVar) throws zzdrg;

    /* JADX WARN: Multi-variable type inference failed */
    private static <Casted> Casted zza(Object obj, String str, Class<Casted> cls) throws GeneralSecurityException {
        if (cls.isInstance(obj)) {
            return obj;
        }
        throw new GeneralSecurityException(str);
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final P zzp(zzdpm zzdpmVar) throws GeneralSecurityException {
        try {
            return zzf(zzs(zzdpmVar));
        } catch (zzdrg e) {
            String valueOf = String.valueOf(this.zzgsm.getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzden
    public final P zza(zzdsg zzdsgVar) throws GeneralSecurityException {
        String valueOf = String.valueOf(this.zzgsm.getName());
        return (P) zzf((zzdsg) zza(zzdsgVar, valueOf.length() != 0 ? "Expected proto of type ".concat(valueOf) : new String("Expected proto of type "), this.zzgsm));
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdsg zzq(zzdpm zzdpmVar) throws GeneralSecurityException {
        try {
            return zzh(zzt(zzdpmVar));
        } catch (zzdrg e) {
            String valueOf = String.valueOf(this.zzgsn.getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdsg zzb(zzdsg zzdsgVar) throws GeneralSecurityException {
        String valueOf = String.valueOf(this.zzgsn.getName());
        return zzh((zzdsg) zza(zzdsgVar, valueOf.length() != 0 ? "Expected proto of type ".concat(valueOf) : new String("Expected proto of type "), this.zzgsn));
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final String getKeyType() {
        return this.zzgso;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdjn zzr(zzdpm zzdpmVar) throws GeneralSecurityException {
        try {
            return (zzdjn) ((zzdqw) zzdjn.zzatx().zzgw(this.zzgso).zzbo(zzh(zzt(zzdpmVar)).zzaxg()).zzb(zzapp()).zzazr());
        } catch (zzdrg e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final Class<P> zzapo() {
        return this.zzgsl;
    }

    private final P zzf(KeyProto keyproto) throws GeneralSecurityException {
        zzc(keyproto);
        return zze(keyproto);
    }

    private final KeyProto zzh(KeyFormatProto keyformatproto) throws GeneralSecurityException {
        zzd(keyformatproto);
        KeyProto zzg = zzg(keyformatproto);
        zzc(zzg);
        return zzg;
    }
}
