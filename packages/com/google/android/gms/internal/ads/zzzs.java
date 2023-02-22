package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzzs {
    public static boolean zza(zzaab zzaabVar, zzzz zzzzVar, String... strArr) {
        if (zzaabVar == null || zzzzVar == null || !zzaabVar.zzcut || zzzzVar == null) {
            return false;
        }
        return zzaabVar.zza(zzzzVar, com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime(), strArr);
    }

    public static zzzz zzb(zzaab zzaabVar) {
        if (zzaabVar == null) {
            return null;
        }
        return zzaabVar.zzer(com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime());
    }
}
