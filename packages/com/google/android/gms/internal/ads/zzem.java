package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbk;
import com.google.android.gms.internal.ads.zzbo;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzem extends zzfl {
    private static final zzfk<zzcf> zzzt = new zzfk<>();
    private final Context zzzu;
    private zzbk.zza zzzv;

    public zzem(zzdx zzdxVar, String str, String str2, zzbo.zza.zzb zzbVar, int i, int i2, Context context, zzbk.zza zzaVar) {
        super(zzdxVar, str, str2, zzbVar, i, 27);
        this.zzzv = null;
        this.zzzu = context;
        this.zzzv = zzaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[Catch: all -> 0x011e, TryCatch #1 {, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001f, B:10:0x0029, B:16:0x0039, B:18:0x0045, B:34:0x0082, B:37:0x0091, B:39:0x00b7, B:49:0x00e7, B:41:0x00c1, B:45:0x00ce, B:47:0x00d8, B:48:0x00db, B:19:0x0048, B:22:0x0056, B:24:0x005c, B:28:0x006b, B:30:0x0075, B:32:0x007d, B:33:0x0080, B:50:0x00ea, B:51:0x00f0), top: B:66:0x000d }] */
    @Override // com.google.android.gms.internal.ads.zzfl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void zzcu() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzem.zzcu():void");
    }

    private static String zza(zzbk.zza zzaVar) {
        if (zzaVar == null || !zzaVar.zzv() || zzee.zzat(zzaVar.zzw().zzad())) {
            return null;
        }
        return zzaVar.zzw().zzad();
    }

    private final String zzcv() {
        try {
            if (this.zzvo.zzcn() != null) {
                this.zzvo.zzcn().get();
            }
            zzbo.zza zzcm = this.zzvo.zzcm();
            if (zzcm == null || !zzcm.zzah()) {
                return null;
            }
            return zzcm.zzad();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }
}
