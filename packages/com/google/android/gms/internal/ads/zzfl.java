package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzfl implements Callable {
    private final String TAG = getClass().getSimpleName();
    private final String className;
    protected final zzbo.zza.zzb zzaaa;
    private final String zzaaj;
    protected Method zzaal;
    private final int zzaap;
    private final int zzaaq;
    protected final zzdx zzvo;

    public zzfl(zzdx zzdxVar, String str, String str2, zzbo.zza.zzb zzbVar, int i, int i2) {
        this.zzvo = zzdxVar;
        this.className = str;
        this.zzaaj = str2;
        this.zzaaa = zzbVar;
        this.zzaap = i;
        this.zzaaq = i2;
    }

    protected abstract void zzcu() throws IllegalAccessException, InvocationTargetException;

    @Override // java.util.concurrent.Callable
    /* renamed from: zzcw */
    public Void call() throws Exception {
        long nanoTime;
        Method zzc;
        try {
            nanoTime = System.nanoTime();
            zzc = this.zzvo.zzc(this.className, this.zzaaj);
            this.zzaal = zzc;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (zzc == null) {
            return null;
        }
        zzcu();
        zzda zzcj = this.zzvo.zzcj();
        if (zzcj != null && this.zzaap != Integer.MIN_VALUE) {
            zzcj.zza(this.zzaaq, this.zzaap, (System.nanoTime() - nanoTime) / 1000);
        }
        return null;
    }
}
