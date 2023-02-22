package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbhk implements com.google.android.gms.ads.internal.overlay.zzo, zzbnj, zzbnm, zzpj {
    private final Clock zzbmp;
    private final zzbhf zzfbt;
    private final zzbhi zzfbu;
    private final zzajj<JSONObject, JSONObject> zzfbw;
    private final Executor zzfbx;
    private final Set<zzbbw> zzfbv = new HashSet();
    private final AtomicBoolean zzfby = new AtomicBoolean(false);
    private final zzbhm zzfbz = new zzbhm();
    private boolean zzfca = false;
    private WeakReference<?> zzfcb = new WeakReference<>(this);

    public zzbhk(zzajc zzajcVar, zzbhi zzbhiVar, Executor executor, zzbhf zzbhfVar, Clock clock) {
        this.zzfbt = zzbhfVar;
        this.zzfbw = zzajcVar.zzb("google.afma.activeView.handleUpdate", zzais.zzday, zzais.zzday);
        this.zzfbu = zzbhiVar;
        this.zzfbx = executor;
        this.zzbmp = clock;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzsi() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzsj() {
    }

    public final synchronized void zzaei() {
        if (!(this.zzfcb.get() != null)) {
            zzaek();
            return;
        }
        if (!this.zzfca && this.zzfby.get()) {
            try {
                this.zzfbz.timestamp = this.zzbmp.elapsedRealtime();
                final JSONObject zzj = this.zzfbu.zzj(this.zzfbz);
                for (final zzbbw zzbbwVar : this.zzfbv) {
                    this.zzfbx.execute(new Runnable(zzbbwVar, zzj) { // from class: com.google.android.gms.internal.ads.zzbhn
                        private final zzbbw zzehv;
                        private final JSONObject zzfch;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzehv = zzbbwVar;
                            this.zzfch = zzj;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzehv.zza("AFMA_updateActiveView", this.zzfch);
                        }
                    });
                }
                zzaxr.zzb(this.zzfbw.zzf(zzj), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e) {
                zzaug.zza("Failed to call ActiveViewJS", e);
            }
        }
    }

    private final void zzaej() {
        for (zzbbw zzbbwVar : this.zzfbv) {
            this.zzfbt.zze(zzbbwVar);
        }
        this.zzfbt.zzaeh();
    }

    public final synchronized void zzaek() {
        zzaej();
        this.zzfca = true;
    }

    public final synchronized void zzf(zzbbw zzbbwVar) {
        this.zzfbv.add(zzbbwVar);
        this.zzfbt.zzd(zzbbwVar);
    }

    public final void zzo(Object obj) {
        this.zzfcb = new WeakReference<>(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzpj
    public final synchronized void zza(zzpk zzpkVar) {
        this.zzfbz.zzbnp = zzpkVar.zzbnp;
        this.zzfbz.zzfcg = zzpkVar;
        zzaei();
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final synchronized void zzbu(Context context) {
        this.zzfbz.zzfcd = true;
        zzaei();
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final synchronized void zzbv(Context context) {
        this.zzfbz.zzfcd = false;
        zzaei();
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final synchronized void zzbw(Context context) {
        this.zzfbz.zzfcf = "u";
        zzaei();
        zzaej();
        this.zzfca = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void onPause() {
        this.zzfbz.zzfcd = true;
        zzaei();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void onResume() {
        this.zzfbz.zzfcd = false;
        zzaei();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final synchronized void onAdImpression() {
        if (this.zzfby.compareAndSet(false, true)) {
            this.zzfbt.zza(this);
            zzaei();
        }
    }
}
