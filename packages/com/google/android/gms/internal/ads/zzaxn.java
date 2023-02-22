package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaxn {
    public static final zzddl zzdwi = zza(new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), zzex("Default")));
    public static final zzddl zzdwj;
    public static final zzddl zzdwk;
    public static final ScheduledExecutorService zzdwl;
    public static final zzddl zzdwm;
    public static final zzddl zzdwn;

    private static ThreadFactory zzex(String str) {
        return new zzaxq(str);
    }

    private static zzddl zza(Executor executor) {
        return new zzaxs(executor, null);
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzex("Loader"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        zzdwj = zza(threadPoolExecutor);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzex("Activeview"));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        zzdwk = zza(threadPoolExecutor2);
        zzdwl = new ScheduledThreadPoolExecutor(3, zzex("Schedule"));
        zzdwm = zza(new zzaxp());
        zzdwn = zza(zzddk.zzapk());
    }
}
