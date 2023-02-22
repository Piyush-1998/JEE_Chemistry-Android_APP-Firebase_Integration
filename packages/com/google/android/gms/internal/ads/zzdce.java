package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdby;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzdce<InputT, OutputT> extends zzdby.zzj<OutputT> {
    private static final Logger logger = Logger.getLogger(zzdce.class.getName());
    @NullableDecl
    private zza zzgqv;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdby
    public final void afterDone() {
        super.afterDone();
        zza zzaVar = this.zzgqv;
        if (zzaVar != null) {
            this.zzgqv = null;
            zzday zzdayVar = zzaVar.zzgqr;
            boolean wasInterrupted = wasInterrupted();
            if (wasInterrupted) {
                zzaVar.interruptTask();
            }
            if (isCancelled() && (zzdayVar != null)) {
                zzdbu zzdbuVar = (zzdbu) zzdayVar.iterator();
                while (zzdbuVar.hasNext()) {
                    ((zzddi) zzdbuVar.next()).cancel(wasInterrupted);
                }
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    abstract class zza extends zzdcf implements Runnable {
        private zzday<? extends zzddi<? extends InputT>> zzgqr;
        private final boolean zzgqs;
        private final boolean zzgqt;

        /* JADX INFO: Access modifiers changed from: package-private */
        public zza(zzday<? extends zzddi<? extends InputT>> zzdayVar, boolean z, boolean z2) {
            super(zzdayVar.size());
            this.zzgqr = (zzday) zzdaq.checkNotNull(zzdayVar);
            this.zzgqs = z;
            this.zzgqt = z2;
        }

        void interruptTask() {
        }

        abstract void zza(boolean z, int i, @NullableDecl InputT inputt);

        abstract void zzapc();

        @Override // java.lang.Runnable
        public final void run() {
            zzapa();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzaoz() {
            if (this.zzgqr.isEmpty()) {
                zzapc();
            } else if (this.zzgqs) {
                int i = 0;
                zzdbu zzdbuVar = (zzdbu) this.zzgqr.iterator();
                while (zzdbuVar.hasNext()) {
                    zzddi zzddiVar = (zzddi) zzdbuVar.next();
                    zzddiVar.addListener(new zzdcg(this, i, zzddiVar), zzdcq.INSTANCE);
                    i++;
                }
            } else {
                zzdbu zzdbuVar2 = (zzdbu) this.zzgqr.iterator();
                while (zzdbuVar2.hasNext()) {
                    ((zzddi) zzdbuVar2.next()).addListener(this, zzdcq.INSTANCE);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void zzh(java.lang.Throwable r8) {
            /*
                r7 = this;
                com.google.android.gms.internal.ads.zzdaq.checkNotNull(r8)
                boolean r0 = r7.zzgqs
                r1 = 1
                if (r0 == 0) goto L1d
                com.google.android.gms.internal.ads.zzdce r0 = com.google.android.gms.internal.ads.zzdce.this
                boolean r0 = r0.setException(r8)
                if (r0 == 0) goto L14
                r7.zzapb()
                goto L1e
            L14:
                java.util.Set r2 = r7.zzape()
                boolean r2 = com.google.android.gms.internal.ads.zzdce.zzb(r2, r8)
                goto L1f
            L1d:
                r0 = 0
            L1e:
                r2 = 1
            L1f:
                boolean r3 = r8 instanceof java.lang.Error
                boolean r4 = r7.zzgqs
                r0 = r0 ^ r1
                r0 = r0 & r4
                r0 = r0 & r2
                r0 = r0 | r3
                if (r0 == 0) goto L3f
                if (r3 == 0) goto L2e
                java.lang.String r0 = "Input Future failed with Error"
                goto L30
            L2e:
                java.lang.String r0 = "Got more than one input Future failure. Logging failures after the first"
            L30:
                r5 = r0
                java.util.logging.Logger r1 = com.google.android.gms.internal.ads.zzdce.zzapd()
                java.util.logging.Level r2 = java.util.logging.Level.SEVERE
                java.lang.String r3 = "com.google.common.util.concurrent.AggregateFuture$RunningState"
                java.lang.String r4 = "handleException"
                r6 = r8
                r1.logp(r2, r3, r4, r5, r6)
            L3f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdce.zza.zzh(java.lang.Throwable):void");
        }

        @Override // com.google.android.gms.internal.ads.zzdcf
        final void zzg(Set<Throwable> set) {
            if (zzdce.this.isCancelled()) {
                return;
            }
            zzdce.zza(set, zzdce.this.zzaow());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final void zza(int i, Future<? extends InputT> future) {
            zzdaq.checkState(this.zzgqs || !zzdce.this.isDone() || zzdce.this.isCancelled(), "Future was done before all dependencies completed");
            try {
                zzdaq.checkState(future.isDone(), "Tried to set value from future which is not done");
                if (this.zzgqs) {
                    if (future.isCancelled()) {
                        zzdce.this.zzgqv = null;
                        zzdce.this.cancel(false);
                        return;
                    }
                    Object zzb = zzdcy.zzb(future);
                    if (this.zzgqt) {
                        zza(this.zzgqs, i, (int) zzb);
                    }
                } else if (!this.zzgqt || future.isCancelled()) {
                } else {
                    zza(this.zzgqs, i, (int) zzdcy.zzb(future));
                }
            } catch (ExecutionException e) {
                zzh(e.getCause());
            } catch (Throwable th) {
                zzh(th);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzapa() {
            int zzapf = zzapf();
            int i = 0;
            zzdaq.checkState(zzapf >= 0, "Less than 0 remaining futures");
            if (zzapf == 0) {
                if (this.zzgqt & (true ^ this.zzgqs)) {
                    zzdbu zzdbuVar = (zzdbu) this.zzgqr.iterator();
                    while (zzdbuVar.hasNext()) {
                        zza(i, (zzddi) zzdbuVar.next());
                        i++;
                    }
                }
                zzapc();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void zzapb() {
            this.zzgqr = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdby
    public final String pendingToString() {
        zzday zzdayVar;
        zza zzaVar = this.zzgqv;
        if (zzaVar == null || (zzdayVar = zzaVar.zzgqr) == null) {
            return null;
        }
        String valueOf = String.valueOf(zzdayVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
        sb.append("futures=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(zza zzaVar) {
        this.zzgqv = zzaVar;
        zzaVar.zzaoz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zza(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }
}
