package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
final class zzdpj {
    private static final Class<?> zzhft = zzhg("libcore.io.Memory");
    private static final boolean zzhfu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzaxl() {
        return (zzhft == null || zzhfu) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> zzaxm() {
        return zzhft;
    }

    private static <T> Class<T> zzhg(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        zzhfu = zzhg("org.robolectric.Robolectric") != null;
    }
}
