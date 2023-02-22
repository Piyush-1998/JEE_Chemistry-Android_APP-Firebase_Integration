package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@Deprecated
/* loaded from: classes.dex */
public final class zzdes {
    @Deprecated
    public static final zzdep zzj(byte[] bArr) throws GeneralSecurityException {
        try {
            zzdjx zzm = zzdjx.zzm(bArr);
            zzb(zzm);
            return zzdep.zza(zzm);
        } catch (zzdrg unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    public static final zzdep zza(zzdeo zzdeoVar) throws GeneralSecurityException, IOException {
        zzdjx zzapn = zzdeoVar.zzapn();
        zzb(zzapn);
        return zzdep.zza(zzapn);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzb(com.google.android.gms.internal.ads.zzdjx r3) throws java.security.GeneralSecurityException {
        /*
            java.util.List r3 = r3.zzauj()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r0 = r3.next()
            com.google.android.gms.internal.ads.zzdjx$zza r0 = (com.google.android.gms.internal.ads.zzdjx.zza) r0
            com.google.android.gms.internal.ads.zzdjn r1 = r0.zzauo()
            com.google.android.gms.internal.ads.zzdjn$zzb r1 = r1.zzatw()
            com.google.android.gms.internal.ads.zzdjn$zzb r2 = com.google.android.gms.internal.ads.zzdjn.zzb.UNKNOWN_KEYMATERIAL
            if (r1 == r2) goto L39
            com.google.android.gms.internal.ads.zzdjn r1 = r0.zzauo()
            com.google.android.gms.internal.ads.zzdjn$zzb r1 = r1.zzatw()
            com.google.android.gms.internal.ads.zzdjn$zzb r2 = com.google.android.gms.internal.ads.zzdjn.zzb.SYMMETRIC
            if (r1 == r2) goto L39
            com.google.android.gms.internal.ads.zzdjn r0 = r0.zzauo()
            com.google.android.gms.internal.ads.zzdjn$zzb r0 = r0.zzatw()
            com.google.android.gms.internal.ads.zzdjn$zzb r1 = com.google.android.gms.internal.ads.zzdjn.zzb.ASYMMETRIC_PRIVATE
            if (r0 == r1) goto L39
            goto L8
        L39:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "keyset contains secret key material"
            r3.<init>(r0)
            throw r3
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdes.zzb(com.google.android.gms.internal.ads.zzdjx):void");
    }
}
