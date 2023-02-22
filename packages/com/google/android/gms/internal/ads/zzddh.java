package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
abstract class zzddh<T> extends AtomicReference<Runnable> implements Runnable {
    private static final Runnable zzgrq = new zzddj();
    private static final Runnable zzgrr = new zzddj();
    private static final Runnable zzgrs = new zzddj();

    abstract boolean isDone();

    abstract T zzapg() throws Exception;

    abstract String zzaph();

    abstract void zzb(@NullableDecl T t, @NullableDecl Throwable th);

    @Override // java.lang.Runnable
    public final void run() {
        T zzapg;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            boolean z = !isDone();
            if (z) {
                try {
                    zzapg = zzapg();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, zzgrq)) {
                        Runnable runnable = get();
                        boolean z2 = false;
                        int i = 0;
                        while (true) {
                            if (runnable != zzgrr && runnable != zzgrs) {
                                break;
                            }
                            i++;
                            if (i > 1000) {
                                Runnable runnable2 = zzgrs;
                                if (runnable == runnable2 || compareAndSet(zzgrr, runnable2)) {
                                    z2 = Thread.interrupted() || z2;
                                    LockSupport.park(this);
                                }
                            } else {
                                Thread.yield();
                            }
                            runnable = get();
                        }
                        if (z2) {
                            currentThread.interrupt();
                        }
                    }
                    if (z) {
                        zzb(null, th);
                        return;
                    }
                    return;
                }
            } else {
                zzapg = null;
            }
            if (!compareAndSet(currentThread, zzgrq)) {
                Runnable runnable3 = get();
                boolean z3 = false;
                int i2 = 0;
                while (true) {
                    if (runnable3 != zzgrr && runnable3 != zzgrs) {
                        break;
                    }
                    i2++;
                    if (i2 > 1000) {
                        Runnable runnable4 = zzgrs;
                        if (runnable3 == runnable4 || compareAndSet(zzgrr, runnable4)) {
                            z3 = Thread.interrupted() || z3;
                            LockSupport.park(this);
                        }
                    } else {
                        Thread.yield();
                    }
                    runnable3 = get();
                }
                if (z3) {
                    currentThread.interrupt();
                }
            }
            if (z) {
                zzb(zzapg, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void interruptTask() {
        Runnable runnable = get();
        if ((runnable instanceof Thread) && compareAndSet(runnable, zzgrr)) {
            try {
                ((Thread) runnable).interrupt();
            } finally {
                if (getAndSet(zzgrq) == zzgrs) {
                    LockSupport.unpark((Thread) runnable);
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == zzgrq) {
            str = "running=[DONE]";
        } else if (runnable == zzgrr) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String zzaph = zzaph();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(zzaph).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(zzaph);
        return sb2.toString();
    }
}
