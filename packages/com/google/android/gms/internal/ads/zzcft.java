package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzsp;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcft {
    private static final SparseArray<zzsp.zzj.zzc> zzfwu;
    private final zzcfp zzfuq;
    private final zzddi<Bundle> zzfwq;
    private final TelephonyManager zzfwr;
    private final zzcfj zzfws;
    private zzsv zzfwt;
    private final Context zzlk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcft(Context context, zzddi<Bundle> zzddiVar, zzcfp zzcfpVar, zzcfj zzcfjVar) {
        this.zzlk = context;
        this.zzfwq = zzddiVar;
        this.zzfuq = zzcfpVar;
        this.zzfws = zzcfjVar;
        this.zzfwr = (TelephonyManager) context.getSystemService("phone");
    }

    private static zzsv zzba(boolean z) {
        return z ? zzsv.ENUM_TRUE : zzsv.ENUM_FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzsp.zzh zzj(Bundle bundle) {
        zzsp.zzh.zza zzaVar;
        zzsp.zzh.zzb zzna = zzsp.zzh.zzna();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        if (i == -1) {
            this.zzfwt = zzsv.ENUM_TRUE;
        } else {
            this.zzfwt = zzsv.ENUM_FALSE;
            if (i == 0) {
                zzna.zzb(zzsp.zzh.zzc.CELL);
            } else if (i == 1) {
                zzna.zzb(zzsp.zzh.zzc.WIFI);
            } else {
                zzna.zzb(zzsp.zzh.zzc.NETWORKTYPE_UNSPECIFIED);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzaVar = zzsp.zzh.zza.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzaVar = zzsp.zzh.zza.THREE_G;
                    break;
                case 13:
                    zzaVar = zzsp.zzh.zza.LTE;
                    break;
                default:
                    zzaVar = zzsp.zzh.zza.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zzna.zzb(zzaVar);
        }
        return (zzsp.zzh) ((zzdqw) zzna.zzazr());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzsp.zzj.zzc zzk(Bundle bundle) {
        return zzfwu.get(zzcwk.zza(zzcwk.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzsp.zzj.zzc.UNSPECIFIED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList<com.google.android.gms.internal.ads.zzsp.zzb.zza> zzl(android.os.Bundle r7) {
        /*
            java.lang.String r0 = "ad_types"
            java.lang.Object r7 = r7.get(r0)
            boolean r0 = r7 instanceof java.util.List
            if (r0 == 0) goto Ld
            java.util.List r7 = (java.util.List) r7
            goto L17
        Ld:
            boolean r0 = r7 instanceof java.lang.String[]
            if (r0 == 0) goto L3d
            java.lang.String[] r7 = (java.lang.String[]) r7
            java.util.List r7 = java.util.Arrays.asList(r7)
        L17:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.size()
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L24:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r7.next()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L24
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            goto L24
        L38:
            java.util.List r7 = java.util.Collections.unmodifiableList(r0)
            goto L41
        L3d:
            java.util.List r7 = java.util.Collections.emptyList()
        L41:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L4a:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto La3
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = -1
            int r3 = r1.hashCode()
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r3) {
                case -1396342996: goto L80;
                case -1052618729: goto L76;
                case -239580146: goto L6c;
                case 604727084: goto L62;
                default: goto L61;
            }
        L61:
            goto L89
        L62:
            java.lang.String r3 = "interstitial"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
            r2 = 1
            goto L89
        L6c:
            java.lang.String r3 = "rewarded"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
            r2 = 3
            goto L89
        L76:
            java.lang.String r3 = "native"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
            r2 = 2
            goto L89
        L80:
            java.lang.String r3 = "banner"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
            r2 = 0
        L89:
            if (r2 == 0) goto L9d
            if (r2 == r6) goto L9a
            if (r2 == r5) goto L97
            if (r2 == r4) goto L94
            com.google.android.gms.internal.ads.zzsp$zzb$zza r1 = com.google.android.gms.internal.ads.zzsp.zzb.zza.AD_FORMAT_TYPE_UNSPECIFIED
            goto L9f
        L94:
            com.google.android.gms.internal.ads.zzsp$zzb$zza r1 = com.google.android.gms.internal.ads.zzsp.zzb.zza.REWARD_BASED_VIDEO_AD
            goto L9f
        L97:
            com.google.android.gms.internal.ads.zzsp$zzb$zza r1 = com.google.android.gms.internal.ads.zzsp.zzb.zza.NATIVE_APP_INSTALL
            goto L9f
        L9a:
            com.google.android.gms.internal.ads.zzsp$zzb$zza r1 = com.google.android.gms.internal.ads.zzsp.zzb.zza.INTERSTITIAL
            goto L9f
        L9d:
            com.google.android.gms.internal.ads.zzsp$zzb$zza r1 = com.google.android.gms.internal.ads.zzsp.zzb.zza.BANNER
        L9f:
            r0.add(r1)
            goto L4a
        La3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcft.zzl(android.os.Bundle):java.util.ArrayList");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] zza(boolean z, ArrayList<zzsp.zzb.zza> arrayList, zzsp.zzh zzhVar, zzsp.zzj.zzc zzcVar) {
        return ((zzsp.zzj.zza) ((zzdqw) zzsp.zzj.zza.zzng().zzd(arrayList).zzh(zzba(com.google.android.gms.ads.internal.zzq.zzkl().zzb(this.zzlk.getContentResolver()) != 0)).zzi(com.google.android.gms.ads.internal.zzq.zzkl().zza(this.zzlk, this.zzfwr)).zzep(this.zzfuq.zzako()).zzeq(this.zzfuq.zzakq()).zzcb(this.zzfuq.getResponseCode()).zzb(zzcVar).zzb(zzhVar).zzj(this.zzfwt).zzf(zzba(z)).zzeo(com.google.android.gms.ads.internal.zzq.zzkq().currentTimeMillis()).zzg(zzba(com.google.android.gms.ads.internal.zzq.zzkl().zza(this.zzlk.getContentResolver()) != 0)).zzazr())).toByteArray();
    }

    public final void zzbb(boolean z) {
        zzdcy.zza(this.zzfwq, new zzcfs(this, z), zzaxn.zzdwn);
    }

    static {
        SparseArray<zzsp.zzj.zzc> sparseArray = new SparseArray<>();
        zzfwu = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzsp.zzj.zzc.CONNECTED);
        zzfwu.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), zzsp.zzj.zzc.CONNECTING);
        zzfwu.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzsp.zzj.zzc.CONNECTING);
        zzfwu.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzsp.zzj.zzc.CONNECTING);
        zzfwu.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzsp.zzj.zzc.DISCONNECTING);
        zzfwu.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), zzsp.zzj.zzc.DISCONNECTED);
        zzfwu.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzsp.zzj.zzc.DISCONNECTED);
        zzfwu.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzsp.zzj.zzc.DISCONNECTED);
        zzfwu.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzsp.zzj.zzc.DISCONNECTED);
        zzfwu.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzsp.zzj.zzc.DISCONNECTED);
        zzfwu.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzsp.zzj.zzc.SUSPENDED);
        if (Build.VERSION.SDK_INT >= 17) {
            zzfwu.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzsp.zzj.zzc.CONNECTING);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            zzfwu.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzsp.zzj.zzc.CONNECTING);
        }
    }
}
