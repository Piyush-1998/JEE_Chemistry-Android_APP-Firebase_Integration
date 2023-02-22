package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzmn extends zzms {
    private static final int[] zzbdh = new int[0];
    private final zzmw zzbdi;
    private final AtomicReference<zzmq> zzbdj;

    public zzmn() {
        this(null);
    }

    private static int zzd(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        } else if (i2 == -1) {
            return 1;
        } else {
            return i - i2;
        }
    }

    private static boolean zze(int i, boolean z) {
        int i2 = i & 3;
        if (i2 != 3) {
            return z && i2 == 2;
        }
        return true;
    }

    private zzmn(zzmw zzmwVar) {
        this.zzbdi = null;
        this.zzbdj = new AtomicReference<>(new zzmq());
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0184, code lost:
        if (r10.zzaey <= r12) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b4  */
    @Override // com.google.android.gms.internal.ads.zzms
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.google.android.gms.internal.ads.zzmt[] zza(com.google.android.gms.internal.ads.zzgw[] r36, com.google.android.gms.internal.ads.zzmk[] r37, int[][][] r38) throws com.google.android.gms.internal.ads.zzgd {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmn.zza(com.google.android.gms.internal.ads.zzgw[], com.google.android.gms.internal.ads.zzmk[], int[][][]):com.google.android.gms.internal.ads.zzmt[]");
    }

    private static boolean zza(zzgo zzgoVar, String str) {
        return str != null && TextUtils.equals(str, zzof.zzbg(zzgoVar.zzaft));
    }
}
