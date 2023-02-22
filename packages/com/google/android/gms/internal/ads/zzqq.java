package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzqq extends zzqf {
    private MessageDigest zzbql;
    private final int zzbqs;
    private final int zzbqt;

    public zzqq(int i) {
        int i2 = i / 8;
        this.zzbqs = i % 8 > 0 ? i2 + 1 : i2;
        this.zzbqt = i;
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final byte[] zzbq(String str) {
        synchronized (this.mLock) {
            MessageDigest zzlz = zzlz();
            this.zzbql = zzlz;
            if (zzlz == null) {
                return new byte[0];
            }
            zzlz.reset();
            this.zzbql.update(str.getBytes(Charset.forName("UTF-8")));
            byte[] digest = this.zzbql.digest();
            int length = digest.length > this.zzbqs ? this.zzbqs : digest.length;
            byte[] bArr = new byte[length];
            System.arraycopy(digest, 0, bArr, 0, length);
            if (this.zzbqt % 8 > 0) {
                long j = 0;
                for (int i = 0; i < length; i++) {
                    if (i > 0) {
                        j <<= 8;
                    }
                    j += bArr[i] & 255;
                }
                long j2 = j >>> (8 - (this.zzbqt % 8));
                for (int i2 = this.zzbqs - 1; i2 >= 0; i2--) {
                    bArr[i2] = (byte) (255 & j2);
                    j2 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
