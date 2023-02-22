package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class zzqf {
    private static MessageDigest zzbqd;
    protected Object mLock = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte[] zzbq(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public final MessageDigest zzlz() {
        synchronized (this.mLock) {
            if (zzbqd != null) {
                return zzbqd;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    zzbqd = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return zzbqd;
        }
    }
}
