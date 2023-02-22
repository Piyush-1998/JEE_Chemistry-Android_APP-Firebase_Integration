package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zznl {
    private final ExecutorService zzbfm;
    private zznn<? extends zznq> zzbfn;
    private IOException zzbfo;

    public zznl(String str) {
        this.zzbfm = zzof.zzbf(str);
    }

    public final <T extends zznq> long zza(T t, zzno<T> zznoVar, int i) {
        Looper myLooper = Looper.myLooper();
        zznr.checkState(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zznn(this, myLooper, t, zznoVar, i, elapsedRealtime).zzee(0L);
        return elapsedRealtime;
    }

    public final boolean isLoading() {
        return this.zzbfn != null;
    }

    public final void zzie() {
        this.zzbfn.zzk(false);
    }

    public final void zza(Runnable runnable) {
        zznn<? extends zznq> zznnVar = this.zzbfn;
        if (zznnVar != null) {
            zznnVar.zzk(true);
        }
        this.zzbfm.execute(runnable);
        this.zzbfm.shutdown();
    }

    public final void zzbb(int i) throws IOException {
        IOException iOException = this.zzbfo;
        if (iOException != null) {
            throw iOException;
        }
        zznn<? extends zznq> zznnVar = this.zzbfn;
        if (zznnVar != null) {
            zznnVar.zzbb(zznnVar.zzbft);
        }
    }
}
