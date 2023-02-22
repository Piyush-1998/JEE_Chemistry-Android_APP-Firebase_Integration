package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
final class zzdqn {
    private static final zzdql<?> zzhht = new zzdqk();
    private static final zzdql<?> zzhhu = zzaze();

    private static zzdql<?> zzaze() {
        try {
            return (zzdql) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdql<?> zzazf() {
        return zzhht;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdql<?> zzazg() {
        zzdql<?> zzdqlVar = zzhhu;
        if (zzdqlVar != null) {
            return zzdqlVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
