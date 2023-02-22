package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class zzgm {
    final Context zzob;
    String zzoc;
    String zzod;
    Boolean zzow;
    com.google.android.gms.internal.measurement.zzx zzpr;
    long zzs;
    boolean zzt;
    String zzv;

    public zzgm(Context context, com.google.android.gms.internal.measurement.zzx zzxVar) {
        this.zzt = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.zzob = applicationContext;
        if (zzxVar != null) {
            this.zzpr = zzxVar;
            this.zzv = zzxVar.zzv;
            this.zzoc = zzxVar.origin;
            this.zzod = zzxVar.zzu;
            this.zzt = zzxVar.zzt;
            this.zzs = zzxVar.zzs;
            if (zzxVar.zzw != null) {
                this.zzow = Boolean.valueOf(zzxVar.zzw.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
