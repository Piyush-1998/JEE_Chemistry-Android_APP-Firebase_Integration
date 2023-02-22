package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
final class zzdsq {
    private static final zzdso zzhnr = zzbbe();
    private static final zzdso zzhns = new zzdsn();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdso zzbbc() {
        return zzhnr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdso zzbbd() {
        return zzhns;
    }

    private static zzdso zzbbe() {
        try {
            return (zzdso) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
