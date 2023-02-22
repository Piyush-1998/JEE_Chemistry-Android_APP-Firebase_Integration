package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzsp;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcfs implements zzdcz<Bundle> {
    private final /* synthetic */ boolean zzfwo;
    final /* synthetic */ zzcft zzfwp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcfs(zzcft zzcftVar, boolean z) {
        this.zzfwp = zzcftVar;
        this.zzfwo = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzb(Throwable th) {
        zzaug.zzes("Failed to get signals bundle");
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final /* synthetic */ void onSuccess(Bundle bundle) {
        final ArrayList zzl;
        final zzsp.zzj.zzc zzk;
        final zzsp.zzh zzj;
        zzcfj zzcfjVar;
        Bundle bundle2 = bundle;
        zzcft zzcftVar = this.zzfwp;
        zzl = zzcft.zzl(bundle2);
        zzcft zzcftVar2 = this.zzfwp;
        zzk = zzcft.zzk(bundle2);
        zzj = this.zzfwp.zzj(bundle2);
        zzcfjVar = this.zzfwp.zzfws;
        final boolean z = this.zzfwo;
        zzcfjVar.zza(new zzcxn(this, z, zzl, zzj, zzk) { // from class: com.google.android.gms.internal.ads.zzcfv
            private final boolean zzdyt;
            private final zzcfs zzfww;
            private final ArrayList zzfwx;
            private final zzsp.zzh zzfwy;
            private final zzsp.zzj.zzc zzfwz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfww = this;
                this.zzdyt = z;
                this.zzfwx = zzl;
                this.zzfwy = zzj;
                this.zzfwz = zzk;
            }

            @Override // com.google.android.gms.internal.ads.zzcxn
            public final Object apply(Object obj) {
                byte[] zza;
                zzcfs zzcfsVar = this.zzfww;
                boolean z2 = this.zzdyt;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                zza = zzcfsVar.zzfwp.zza(z2, this.zzfwx, this.zzfwy, this.zzfwz);
                ContentValues contentValues = new ContentValues();
                contentValues.put("timestamp", Long.valueOf(com.google.android.gms.ads.internal.zzq.zzkq().currentTimeMillis()));
                contentValues.put("serialized_proto_data", zza);
                sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
                sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
                if (!z2) {
                    sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
                }
                return null;
            }
        });
    }
}
