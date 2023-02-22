package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdoj {
    private static final ThreadLocal<SecureRandom> zzhew = new zzdom();

    /* JADX INFO: Access modifiers changed from: private */
    public static SecureRandom zzaxb() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] zzff(int i) {
        byte[] bArr = new byte[i];
        zzhew.get().nextBytes(bArr);
        return bArr;
    }
}
