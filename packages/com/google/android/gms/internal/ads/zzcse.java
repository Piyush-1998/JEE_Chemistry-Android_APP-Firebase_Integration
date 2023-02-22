package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcse implements zzcru<zzcsb> {
    private final zzddl zzfoa;
    private final Context zzlk;

    public zzcse(zzddl zzddlVar, Context context) {
        this.zzfoa = zzddlVar;
        this.zzlk = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<zzcsb> zzalv() {
        return this.zzfoa.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcsd
            private final zzcse zzggq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzggq = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzggq.zzamj();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcsb zzamj() throws Exception {
        int i;
        boolean z;
        int i2;
        int i3;
        TelephonyManager telephonyManager = (TelephonyManager) this.zzlk.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int networkType = telephonyManager.getNetworkType();
        int phoneType = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzq.zzkj();
        int i4 = -1;
        if (zzaul.zzq(this.zzlk, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.zzlk.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                i4 = activeNetworkInfo.getType();
                i3 = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                i3 = -1;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                i = i4;
                i2 = i3;
                z = connectivityManager.isActiveNetworkMetered();
            } else {
                i = i4;
                i2 = i3;
                z = false;
            }
        } else {
            i = -2;
            z = false;
            i2 = -1;
        }
        return new zzcsb(networkOperator, i, networkType, phoneType, z, i2);
    }
}
