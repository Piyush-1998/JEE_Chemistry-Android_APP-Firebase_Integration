package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.ads.zzbk;
import com.google.android.gms.internal.ads.zzbo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzde extends zzdd {
    private static final String TAG = zzde.class.getSimpleName();
    private AdvertisingIdClient.Info zzwt;

    public static zzde zzb(Context context) {
        zza(context, true);
        return new zzde(context);
    }

    @Override // com.google.android.gms.internal.ads.zzdd, com.google.android.gms.internal.ads.zzdb
    protected final zzbo.zza.zzb zza(Context context, View view, Activity activity) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdd, com.google.android.gms.internal.ads.zzdb
    protected final zzbo.zza.zzb zzb(Context context, View view, Activity activity) {
        return null;
    }

    private zzde(Context context) {
        super(context, "");
    }

    public static String zza(String str, String str2) {
        return zzci.zza(str, str2, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdd
    protected final void zzb(zzdx zzdxVar, Context context, zzbo.zza.zzb zzbVar, zzbk.zza zzaVar) {
        if (zzdxVar.zzyb) {
            AdvertisingIdClient.Info info = this.zzwt;
            if (info != null) {
                String id = info.getId();
                if (!TextUtils.isEmpty(id)) {
                    zzbVar.zzah(zzee.zzas(id));
                    zzbVar.zzb(zzbo.zza.zzc.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                    zzbVar.zzb(this.zzwt.isLimitAdTrackingEnabled());
                }
                this.zzwt = null;
                return;
            }
            return;
        }
        zza(zza(zzdxVar, context, zzbVar, zzaVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdd
    public final List<Callable<Void>> zza(zzdx zzdxVar, Context context, zzbo.zza.zzb zzbVar, zzbk.zza zzaVar) {
        ArrayList arrayList = new ArrayList();
        if (zzdxVar.zzce() == null) {
            return arrayList;
        }
        arrayList.add(new zzet(zzdxVar, "1ZdlqvbjLHrlsj3y/9QBfBegKjUOs/o1A88UhYHQ4Jmy6BR/w0ghZ+Zr+YvoOH1m", "dIiWdqkuIrENjYXIlbMEe8d+ulqMtIBUuOR2KqmaBXc=", zzbVar, zzdxVar.zzbz(), 24));
        return arrayList;
    }

    public final void zza(AdvertisingIdClient.Info info) {
        this.zzwt = info;
    }
}
