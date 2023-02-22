package com.google.android.gms.internal.ads;

import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdoy {
    private static final zzdox zzhfh;
    private static final int zzhfi;

    public static void zza(Throwable th, Throwable th2) {
        zzhfh.zza(th, th2);
    }

    /* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
    /* loaded from: classes.dex */
    static final class zza extends zzdox {
        zza() {
        }

        @Override // com.google.android.gms.internal.ads.zzdox
        public final void zza(Throwable th, Throwable th2) {
        }

        @Override // com.google.android.gms.internal.ads.zzdox
        public final void zzj(Throwable th) {
            th.printStackTrace();
        }

        @Override // com.google.android.gms.internal.ads.zzdox
        public final void zza(Throwable th, PrintWriter printWriter) {
            th.printStackTrace(printWriter);
        }
    }

    public static void zzj(Throwable th) {
        zzhfh.zzj(th);
    }

    public static void zza(Throwable th, PrintWriter printWriter) {
        zzhfh.zza(th, printWriter);
    }

    private static Integer zzaxe() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    static {
        /*
            r0 = 1
            java.lang.Integer r1 = zzaxe()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L15
            int r2 = r1.intValue()     // Catch: java.lang.Throwable -> L2a
            r3 = 19
            if (r2 < r3) goto L15
            com.google.android.gms.internal.ads.zzdpd r2 = new com.google.android.gms.internal.ads.zzdpd     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L63
        L15:
            java.lang.String r2 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r2 = java.lang.Boolean.getBoolean(r2)     // Catch: java.lang.Throwable -> L2a
            r2 = r2 ^ r0
            if (r2 == 0) goto L24
            com.google.android.gms.internal.ads.zzdpb r2 = new com.google.android.gms.internal.ads.zzdpb     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L63
        L24:
            com.google.android.gms.internal.ads.zzdoy$zza r2 = new com.google.android.gms.internal.ads.zzdoy$zza     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L63
        L2a:
            r2 = move-exception
            goto L2e
        L2c:
            r2 = move-exception
            r1 = 0
        L2e:
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.Class<com.google.android.gms.internal.ads.zzdoy$zza> r4 = com.google.android.gms.internal.ads.zzdoy.zza.class
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            int r5 = r5 + 133
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = "will be used. The error is: "
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r3.println(r4)
            java.io.PrintStream r3 = java.lang.System.err
            r2.printStackTrace(r3)
            com.google.android.gms.internal.ads.zzdoy$zza r2 = new com.google.android.gms.internal.ads.zzdoy$zza
            r2.<init>()
        L63:
            com.google.android.gms.internal.ads.zzdoy.zzhfh = r2
            if (r1 != 0) goto L68
            goto L6c
        L68:
            int r0 = r1.intValue()
        L6c:
            com.google.android.gms.internal.ads.zzdoy.zzhfi = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdoy.<clinit>():void");
    }
}
