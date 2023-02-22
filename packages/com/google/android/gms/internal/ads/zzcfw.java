package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.internal.ads.zzsf;
import com.google.android.gms.internal.ads.zzsp;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcfw {
    private zzaxl zzdio;
    private zzcfj zzfws;
    private zzsd zzfxa;
    private Context zzlk;

    public zzcfw(Context context, zzaxl zzaxlVar, zzsd zzsdVar, zzcfj zzcfjVar) {
        this.zzlk = context;
        this.zzdio = zzaxlVar;
        this.zzfxa = zzsdVar;
        this.zzfws = zzcfjVar;
    }

    public final void zzakr() {
        try {
            this.zzfws.zza(new zzcxn(this) { // from class: com.google.android.gms.internal.ads.zzcfz
                private final zzcfw zzfxc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfxc = this;
                }

                @Override // com.google.android.gms.internal.ads.zzcxn
                public final Object apply(Object obj) {
                    return this.zzfxc.zza((SQLiteDatabase) obj);
                }
            });
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            zzaug.zzes(valueOf.length() != 0 ? "Error in offline signals database startup: ".concat(valueOf) : new String("Error in offline signals database startup: "));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Void zza(SQLiteDatabase sQLiteDatabase) throws Exception {
        ArrayList<zzsp.zzj.zza> zzb = zzcfx.zzb(sQLiteDatabase);
        final zzsp.zzj zzjVar = (zzsp.zzj) ((zzdqw) zzsp.zzj.zznd().zzbv(this.zzlk.getPackageName()).zzbw(Build.MODEL).zzbz(zzcfx.zza(sQLiteDatabase, 0)).zzc(zzb).zzca(zzcfx.zza(sQLiteDatabase, 1)).zzem(com.google.android.gms.ads.internal.zzq.zzkq().currentTimeMillis()).zzen(zzcfx.zzb(sQLiteDatabase, 2)).zzazr());
        ArrayList<zzsp.zzj.zza> arrayList = zzb;
        int size = arrayList.size();
        long j = 0;
        int i = 0;
        while (i < size) {
            zzsp.zzj.zza zzaVar = arrayList.get(i);
            i++;
            zzsp.zzj.zza zzaVar2 = zzaVar;
            if (zzaVar2.zznf() == zzsv.ENUM_TRUE && zzaVar2.getTimestamp() > j) {
                j = zzaVar2.getTimestamp();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(j));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
        this.zzfxa.zza(new zzsg(zzjVar) { // from class: com.google.android.gms.internal.ads.zzcfy
            private final zzsp.zzj zzfxb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxb = zzjVar;
            }

            @Override // com.google.android.gms.internal.ads.zzsg
            public final void zza(zztl zztlVar) {
                zztlVar.zzcay = this.zzfxb;
            }
        });
        final zztk zztkVar = new zztk();
        zztkVar.zzcal = Integer.valueOf(this.zzdio.zzdwe);
        zztkVar.zzcam = Integer.valueOf(this.zzdio.zzdwf);
        zztkVar.zzcan = Integer.valueOf(this.zzdio.zzdwg ? 0 : 2);
        this.zzfxa.zza(new zzsg(zztkVar) { // from class: com.google.android.gms.internal.ads.zzcgb
            private final zztk zzfxd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxd = zztkVar;
            }

            @Override // com.google.android.gms.internal.ads.zzsg
            public final void zza(zztl zztlVar) {
                zztlVar.zzcau.zzcag = this.zzfxd;
            }
        });
        this.zzfxa.zza(zzsf.zza.EnumC0018zza.OFFLINE_UPLOAD);
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"failed_requests"});
        ContentValues contentValues3 = new ContentValues();
        contentValues3.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues3, "statistic_name = ?", new String[]{"total_requests"});
        return null;
    }
}
