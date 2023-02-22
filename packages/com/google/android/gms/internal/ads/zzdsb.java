package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
final class zzdsb {
    private static final zzdrz zzhmx = zzbax();
    private static final zzdrz zzhmy = new zzdsc();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdrz zzbav() {
        return zzhmx;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdrz zzbaw() {
        return zzhmy;
    }

    private static zzdrz zzbax() {
        try {
            return (zzdrz) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
