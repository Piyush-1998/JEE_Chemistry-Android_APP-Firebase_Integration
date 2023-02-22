package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdoi implements zzdet {
    private final Mac zzhes;
    private final int zzhet;
    private final String zzheu;
    private final Key zzhev;

    public zzdoi(String str, Key key, int i) throws GeneralSecurityException {
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1823053428) {
            if (hashCode != 392315118) {
                if (hashCode == 392317873 && str.equals("HMACSHA512")) {
                    c = 2;
                }
            } else if (str.equals("HMACSHA256")) {
                c = 1;
            }
        } else if (str.equals("HMACSHA1")) {
            c = 0;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    String valueOf = String.valueOf(str);
                    throw new NoSuchAlgorithmException(valueOf.length() != 0 ? "unknown Hmac algorithm: ".concat(valueOf) : new String("unknown Hmac algorithm: "));
                } else if (i > 64) {
                    throw new InvalidAlgorithmParameterException("tag size too big");
                }
            } else if (i > 32) {
                throw new InvalidAlgorithmParameterException("tag size too big");
            }
        } else if (i > 20) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.zzheu = str;
        this.zzhet = i;
        this.zzhev = key;
        Mac zzhf = zzdnu.zzhea.zzhf(str);
        this.zzhes = zzhf;
        zzhf.init(key);
    }

    @Override // com.google.android.gms.internal.ads.zzdet
    public final byte[] zzk(byte[] bArr) throws GeneralSecurityException {
        Mac zzhf;
        try {
            zzhf = (Mac) this.zzhes.clone();
        } catch (CloneNotSupportedException unused) {
            zzhf = zzdnu.zzhea.zzhf(this.zzheu);
            zzhf.init(this.zzhev);
        }
        zzhf.update(bArr);
        byte[] bArr2 = new byte[this.zzhet];
        System.arraycopy(zzhf.doFinal(), 0, bArr2, 0, this.zzhet);
        return bArr2;
    }
}
