package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbjv extends zzbio {
    private final Executor zzfbx;
    private final zzada zzfeo;
    private final Runnable zzfep;

    public zzbjv(zzbkn zzbknVar, zzada zzadaVar, Runnable runnable, Executor executor) {
        super(zzbknVar);
        this.zzfeo = zzadaVar;
        this.zzfep = runnable;
        this.zzfbx = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final zzwr getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zza(ViewGroup viewGroup, zzua zzuaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final zzcvu zzaet() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final View zzaeu() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final int zzaez() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zzjs() {
    }

    @Override // com.google.android.gms.internal.ads.zzbkk
    public final void zzafa() {
        final AtomicReference atomicReference = new AtomicReference(this.zzfep);
        final Runnable runnable = new Runnable(atomicReference) { // from class: com.google.android.gms.internal.ads.zzbju
            private final AtomicReference zzfen;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfen = atomicReference;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = (Runnable) this.zzfen.getAndSet(null);
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        };
        this.zzfbx.execute(new Runnable(this, runnable) { // from class: com.google.android.gms.internal.ads.zzbjx
            private final Runnable zzfam;
            private final zzbjv zzfeq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfeq = this;
                this.zzfam = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfeq.zze(this.zzfam);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(Runnable runnable) {
        try {
            if (this.zzfeo.zzq(ObjectWrapper.wrap(runnable))) {
                return;
            }
            runnable.run();
        } catch (RemoteException unused) {
            runnable.run();
        }
    }
}
