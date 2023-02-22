package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzafl implements zzn {
    private volatile zzafa zzcyl;
    private final Context zzlk;

    public zzafl(Context context) {
        this.zzlk = context;
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final zzo zzc(zzq<?> zzqVar) throws zzae {
        zzafd zzh = zzafd.zzh(zzqVar);
        long elapsedRealtime = com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime();
        try {
            zzaxv zzaxvVar = new zzaxv();
            this.zzcyl = new zzafa(this.zzlk, com.google.android.gms.ads.internal.zzq.zzkx().zzwd(), new zzafp(this, zzaxvVar), new zzafo(this, zzaxvVar));
            this.zzcyl.checkAvailabilityAndConnect();
            zzddi zza = zzdcy.zza(zzdcy.zzb(zzaxvVar, new zzafk(this, zzh), zzaxn.zzdwi), ((Integer) zzuv.zzon().zzd(zzza.zzcpx)).intValue(), TimeUnit.MILLISECONDS, zzaxn.zzdwl);
            zza.addListener(new zzafm(this), zzaxn.zzdwi);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zza.get();
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime() - elapsedRealtime;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(elapsedRealtime2);
            sb.append("ms");
            zzaug.zzdy(sb.toString());
            zzaff zzaffVar = (zzaff) new zzaoz(parcelFileDescriptor).zza(zzaff.CREATOR);
            if (zzaffVar == null) {
                return null;
            }
            if (zzaffVar.zzcyi) {
                throw new zzae(zzaffVar.zzcyj);
            }
            if (zzaffVar.zzcyg.length != zzaffVar.zzcyh.length) {
                return null;
            }
            HashMap hashMap = new HashMap();
            for (int i = 0; i < zzaffVar.zzcyg.length; i++) {
                hashMap.put(zzaffVar.zzcyg[i], zzaffVar.zzcyh[i]);
            }
            return new zzo(zzaffVar.statusCode, zzaffVar.data, hashMap, zzaffVar.zzac, zzaffVar.zzad);
        } catch (InterruptedException | ExecutionException unused) {
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime() - elapsedRealtime);
            sb2.append("ms");
            zzaug.zzdy(sb2.toString());
            return null;
        } catch (Throwable th) {
            long elapsedRealtime3 = com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime() - elapsedRealtime;
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(elapsedRealtime3);
            sb3.append("ms");
            zzaug.zzdy(sb3.toString());
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disconnect() {
        if (this.zzcyl == null) {
            return;
        }
        this.zzcyl.disconnect();
        Binder.flushPendingCommands();
    }
}
