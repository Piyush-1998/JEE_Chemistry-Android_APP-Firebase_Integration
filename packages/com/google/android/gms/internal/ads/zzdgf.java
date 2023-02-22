package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzdgf {
    public static void zza(zzdip zzdipVar) throws GeneralSecurityException {
        zzdno.zza(zza(zzdipVar.zzasq().zzatb()));
        zza(zzdipVar.zzasq().zzaqp());
        if (zzdipVar.zzass() == zzdhz.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        zzdey.zza(zzdipVar.zzasr().zzasl());
    }

    public static String zza(zzdjg zzdjgVar) throws NoSuchAlgorithmException {
        int i = zzdge.zzgtk[zzdjgVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "HmacSha512";
                }
                String valueOf = String.valueOf(zzdjgVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                sb.append("hash unsupported for HMAC: ");
                sb.append(valueOf);
                throw new NoSuchAlgorithmException(sb.toString());
            }
            return "HmacSha256";
        }
        return "HmacSha1";
    }

    public static zzdnq zza(zzdjb zzdjbVar) throws GeneralSecurityException {
        int i = zzdge.zzgtl[zzdjbVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return zzdnq.NIST_P521;
                }
                String valueOf = String.valueOf(zzdjbVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("unknown curve type: ");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
            }
            return zzdnq.NIST_P384;
        }
        return zzdnq.NIST_P256;
    }

    public static zzdns zza(zzdhz zzdhzVar) throws GeneralSecurityException {
        int i = zzdge.zzgtm[zzdhzVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return zzdns.COMPRESSED;
                }
                String valueOf = String.valueOf(zzdhzVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("unknown point format: ");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
            }
            return zzdns.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        return zzdns.UNCOMPRESSED;
    }
}
