package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzej {
    private static final Class<?> zzaeq = zztl();

    private static Class<?> zztl() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zzel zztm() {
        if (zzaeq != null) {
            try {
                return zzdu("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return zzel.zzaev;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.measurement.zzel zztn() {
        /*
            java.lang.Class<?> r0 = com.google.android.gms.internal.measurement.zzej.zzaeq
            if (r0 == 0) goto Lb
            java.lang.String r0 = "loadGeneratedRegistry"
            com.google.android.gms.internal.measurement.zzel r0 = zzdu(r0)     // Catch: java.lang.Exception -> Lb
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L12
            com.google.android.gms.internal.measurement.zzel r0 = com.google.android.gms.internal.measurement.zzel.zztn()
        L12:
            if (r0 != 0) goto L18
            com.google.android.gms.internal.measurement.zzel r0 = zztm()
        L18:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzej.zztn():com.google.android.gms.internal.measurement.zzel");
    }

    private static final zzel zzdu(String str) throws Exception {
        return (zzel) zzaeq.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}
