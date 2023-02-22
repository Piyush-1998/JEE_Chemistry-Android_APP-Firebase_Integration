package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzavy {
    private static zzu zzdui;
    private static final Object zzduj = new Object();
    @Deprecated
    private static final zzawc<Void> zzduk = new zzavx();

    public zzavy(Context context) {
        zzbh(context.getApplicationContext() != null ? context.getApplicationContext() : context);
    }

    public static zzddi<zzo> zzel(String str) {
        zzaxv zzaxvVar = new zzaxv();
        zzdui.zze(new zzawe(str, zzaxvVar));
        return zzaxvVar;
    }

    public final zzddi<String> zza(int i, String str, Map<String, String> map, byte[] bArr) {
        zzawb zzawbVar = new zzawb(null);
        zzawa zzawaVar = new zzawa(this, str, zzawbVar);
        zzaxc zzaxcVar = new zzaxc(null);
        zzavz zzavzVar = new zzavz(this, i, str, zzawbVar, zzawaVar, bArr, map, zzaxcVar);
        if (zzaxc.isEnabled()) {
            try {
                zzaxcVar.zza(str, "GET", zzavzVar.getHeaders(), zzavzVar.zzf());
            } catch (zzb e) {
                zzaug.zzeu(e.getMessage());
            }
        }
        zzdui.zze(zzavzVar);
        return zzawbVar;
    }

    public final zzddi<String> zzc(String str, Map<String, String> map) {
        return zza(0, str, map, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027 A[Catch: all -> 0x0054, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0010, B:13:0x0027, B:15:0x004e, B:14:0x002c, B:16:0x0050, B:17:0x0052), top: B:22:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[Catch: all -> 0x0054, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0010, B:13:0x0027, B:15:0x004e, B:14:0x002c, B:16:0x0050, B:17:0x0052), top: B:22:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzu zzbh(android.content.Context r4) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzavy.zzduj
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzu r1 = com.google.android.gms.internal.ads.zzavy.zzdui     // Catch: java.lang.Throwable -> L54
            if (r1 != 0) goto L50
            com.google.android.gms.internal.ads.zzza.initialize(r4)     // Catch: java.lang.Throwable -> L54
            boolean r1 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()     // Catch: java.lang.Throwable -> L54
            if (r1 != 0) goto L24
            com.google.android.gms.internal.ads.zzyp<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.zzza.zzcpv     // Catch: java.lang.Throwable -> L54
            com.google.android.gms.internal.ads.zzyw r2 = com.google.android.gms.internal.ads.zzuv.zzon()     // Catch: java.lang.Throwable -> L54
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L54
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L54
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L54
            if (r1 == 0) goto L24
            r1 = 1
            goto L25
        L24:
            r1 = 0
        L25:
            if (r1 == 0) goto L2c
            com.google.android.gms.internal.ads.zzu r4 = com.google.android.gms.internal.ads.zzavn.zzbg(r4)     // Catch: java.lang.Throwable -> L54
            goto L4e
        L2c:
            com.google.android.gms.internal.ads.zzak r1 = new com.google.android.gms.internal.ads.zzak     // Catch: java.lang.Throwable -> L54
            com.google.android.gms.internal.ads.zzar r2 = new com.google.android.gms.internal.ads.zzar     // Catch: java.lang.Throwable -> L54
            r2.<init>()     // Catch: java.lang.Throwable -> L54
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L54
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L54
            java.io.File r4 = r4.getCacheDir()     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = "volley"
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L54
            com.google.android.gms.internal.ads.zzu r4 = new com.google.android.gms.internal.ads.zzu     // Catch: java.lang.Throwable -> L54
            com.google.android.gms.internal.ads.zzal r3 = new com.google.android.gms.internal.ads.zzal     // Catch: java.lang.Throwable -> L54
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L54
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L54
            r4.start()     // Catch: java.lang.Throwable -> L54
        L4e:
            com.google.android.gms.internal.ads.zzavy.zzdui = r4     // Catch: java.lang.Throwable -> L54
        L50:
            com.google.android.gms.internal.ads.zzu r4 = com.google.android.gms.internal.ads.zzavy.zzdui     // Catch: java.lang.Throwable -> L54
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L54
            return r4
        L54:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L54
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavy.zzbh(android.content.Context):com.google.android.gms.internal.ads.zzu");
    }
}
