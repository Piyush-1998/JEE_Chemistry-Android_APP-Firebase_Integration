package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzck implements Runnable {
    private zzck() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzci.zza(MessageDigest.getInstance("MD5"));
        } catch (NoSuchAlgorithmException unused) {
        } finally {
            zzci.zznx.countDown();
        }
    }
}
