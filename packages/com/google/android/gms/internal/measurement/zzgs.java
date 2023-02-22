package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzgs {
    private static final zzgq zzala = zzvx();
    private static final zzgq zzalb = new zzgp();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgq zzvv() {
        return zzala;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgq zzvw() {
        return zzalb;
    }

    private static zzgq zzvx() {
        try {
            return (zzgq) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
