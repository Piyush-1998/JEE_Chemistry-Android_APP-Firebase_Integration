package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdme implements zzdet {
    private final int zzhao;
    private final SecretKey zzhau;
    private byte[] zzhav;
    private byte[] zzhaw;

    private static Cipher zzawu() throws GeneralSecurityException {
        return zzdnu.zzhdz.zzhf("AES/ECB/NoPadding");
    }

    public zzdme(byte[] bArr, int i) throws GeneralSecurityException {
        zzdou.zzfg(bArr.length);
        this.zzhau = new SecretKeySpec(bArr, "AES");
        this.zzhao = 16;
        Cipher zzawu = zzawu();
        zzawu.init(1, this.zzhau);
        byte[] zzp = zzdmj.zzp(zzawu.doFinal(new byte[16]));
        this.zzhav = zzp;
        this.zzhaw = zzdmj.zzp(zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzdet
    public final byte[] zzk(byte[] bArr) throws GeneralSecurityException {
        byte[] zzd;
        Cipher zzawu = zzawu();
        zzawu.init(1, this.zzhau);
        double length = bArr.length;
        Double.isNaN(length);
        int max = Math.max(1, (int) Math.ceil(length / 16.0d));
        if ((max << 4) == bArr.length) {
            zzd = zzdmn.zza(bArr, (max - 1) << 4, this.zzhav, 0, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) << 4, bArr.length);
            if (copyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[copyOfRange.length] = Byte.MIN_VALUE;
            zzd = zzdmn.zzd(copyOf, this.zzhaw);
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < max - 1; i++) {
            bArr2 = zzawu.doFinal(zzdmn.zza(bArr2, 0, bArr, i << 4, 16));
        }
        byte[] zzd2 = zzdmn.zzd(zzd, bArr2);
        byte[] bArr3 = new byte[this.zzhao];
        System.arraycopy(zzawu.doFinal(zzd2), 0, bArr3, 0, this.zzhao);
        return bArr3;
    }
}
