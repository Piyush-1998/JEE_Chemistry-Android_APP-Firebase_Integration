package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbk;
import com.google.android.gms.internal.ads.zzbo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdg extends zzdd {
    public static zzdg zza(String str, Context context, boolean z) {
        zza(context, z);
        return new zzdg(context, str, z);
    }

    private zzdg(Context context, String str, boolean z) {
        super(context, str, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdd
    public final List<Callable<Void>> zza(zzdx zzdxVar, Context context, zzbo.zza.zzb zzbVar, zzbk.zza zzaVar) {
        if (zzdxVar.zzce() == null || !this.zzwo) {
            return super.zza(zzdxVar, context, zzbVar, zzaVar);
        }
        int zzbz = zzdxVar.zzbz();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.zza(zzdxVar, context, zzbVar, zzaVar));
        arrayList.add(new zzet(zzdxVar, "1ZdlqvbjLHrlsj3y/9QBfBegKjUOs/o1A88UhYHQ4Jmy6BR/w0ghZ+Zr+YvoOH1m", "dIiWdqkuIrENjYXIlbMEe8d+ulqMtIBUuOR2KqmaBXc=", zzbVar, zzbz, 24));
        return arrayList;
    }
}
