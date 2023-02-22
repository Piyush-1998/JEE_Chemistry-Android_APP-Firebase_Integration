package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfg extends Thread {
    private final /* synthetic */ zzfc zznt;
    private final Object zznu;
    private final BlockingQueue<zzfh<?>> zznv;

    public zzfg(zzfc zzfcVar, String str, BlockingQueue<zzfh<?>> blockingQueue) {
        this.zznt = zzfcVar;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.zznu = new Object();
        this.zznv = blockingQueue;
        setName(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        zzfg zzfgVar;
        zzfg zzfgVar2;
        Object obj3;
        Object obj4;
        Semaphore semaphore2;
        Object obj5;
        zzfg zzfgVar3;
        zzfg zzfgVar4;
        boolean z;
        Semaphore semaphore3;
        boolean z2 = false;
        while (!z2) {
            try {
                semaphore3 = this.zznt.zznh;
                semaphore3.acquire();
                z2 = true;
            } catch (InterruptedException e) {
                zza(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                zzfh<?> poll = this.zznv.poll();
                if (poll != null) {
                    Process.setThreadPriority(poll.zznx ? threadPriority : 10);
                    poll.run();
                } else {
                    synchronized (this.zznu) {
                        if (this.zznv.peek() == null) {
                            z = this.zznt.zzni;
                            if (!z) {
                                try {
                                    this.zznu.wait(30000L);
                                } catch (InterruptedException e2) {
                                    zza(e2);
                                }
                            }
                        }
                    }
                    obj3 = this.zznt.zzng;
                    synchronized (obj3) {
                        if (this.zznv.peek() == null) {
                            break;
                        }
                    }
                }
            }
            obj4 = this.zznt.zzng;
            synchronized (obj4) {
                semaphore2 = this.zznt.zznh;
                semaphore2.release();
                obj5 = this.zznt.zzng;
                obj5.notifyAll();
                zzfgVar3 = this.zznt.zzna;
                if (this == zzfgVar3) {
                    this.zznt.zzna = null;
                } else {
                    zzfgVar4 = this.zznt.zznb;
                    if (this != zzfgVar4) {
                        this.zznt.zzab().zzgk().zzao("Current scheduler thread is neither worker nor network");
                    } else {
                        this.zznt.zznb = null;
                    }
                }
            }
        } catch (Throwable th) {
            obj = this.zznt.zzng;
            synchronized (obj) {
                semaphore = this.zznt.zznh;
                semaphore.release();
                obj2 = this.zznt.zzng;
                obj2.notifyAll();
                zzfgVar = this.zznt.zzna;
                if (this == zzfgVar) {
                    this.zznt.zzna = null;
                } else {
                    zzfgVar2 = this.zznt.zznb;
                    if (this != zzfgVar2) {
                        this.zznt.zzab().zzgk().zzao("Current scheduler thread is neither worker nor network");
                    } else {
                        this.zznt.zznb = null;
                    }
                }
                throw th;
            }
        }
    }

    public final void zzhr() {
        synchronized (this.zznu) {
            this.zznu.notifyAll();
        }
    }

    private final void zza(InterruptedException interruptedException) {
        this.zznt.zzab().zzgn().zza(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }
}
