package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdda<V> implements Runnable {
    private final Future<V> zzgrm;
    private final zzdcz<? super V> zzgrn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdda(Future<V> future, zzdcz<? super V> zzdczVar) {
        this.zzgrm = future;
        this.zzgrn = zzdczVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzgrn.onSuccess(zzdcy.zzb(this.zzgrm));
        } catch (Error e) {
            e = e;
            this.zzgrn.zzb(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.zzgrn.zzb(e);
        } catch (ExecutionException e3) {
            this.zzgrn.zzb(e3.getCause());
        }
    }

    public final String toString() {
        return zzdak.zzx(this).zzy(this.zzgrn).toString();
    }
}
