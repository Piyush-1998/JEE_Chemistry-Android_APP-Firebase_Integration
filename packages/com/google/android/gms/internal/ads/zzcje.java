package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcje implements zzdcz<T> {
    private final /* synthetic */ String zzfze;
    private final /* synthetic */ long zzfzf;
    private final /* synthetic */ zzcjf zzfzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcje(zzcjf zzcjfVar, String str, long j) {
        this.zzfzg = zzcjfVar;
        this.zzfze = str;
        this.zzfzf = j;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void onSuccess(T t) {
        Clock clock;
        clock = this.zzfzg.zzbmp;
        this.zzfzg.zza(this.zzfze, 0, clock.elapsedRealtime() - this.zzfzf);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzb(Throwable th) {
        Clock clock;
        clock = this.zzfzg.zzbmp;
        long elapsedRealtime = clock.elapsedRealtime();
        int i = 3;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (!(th instanceof zzciv)) {
            if (th instanceof CancellationException) {
                i = 4;
            } else {
                i = ((th instanceof zzccu) && ((zzccu) th).getErrorCode() == 3) ? 1 : 6;
            }
        }
        this.zzfzg.zza(this.zzfze, i, elapsedRealtime - this.zzfzf);
    }
}
