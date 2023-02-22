package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import com.google.android.gms.internal.ads.zzbi;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzda {
    private static final ConditionVariable zzvp = new ConditionVariable();
    protected static volatile zzsi zzvq = null;
    private static volatile Random zzvs = null;
    private zzdx zzvo;
    protected volatile Boolean zzvr;

    public zzda(zzdx zzdxVar) {
        this.zzvo = zzdxVar;
        zzdxVar.zzce().execute(new zzcz(this));
    }

    public final void zza(int i, int i2, long j) {
        zza(i, i2, j, null, null);
    }

    public final void zza(int i, int i2, long j, String str) {
        zza(i, -1, j, str, null);
    }

    public final void zza(int i, int i2, long j, String str, Exception exc) {
        try {
            zzvp.block();
            if (!this.zzvr.booleanValue() || zzvq == null) {
                return;
            }
            zzbi.zza.C0005zza zzc = zzbi.zza.zzr().zzi(this.zzvo.zzlk.getPackageName()).zzc(j);
            if (str != null) {
                zzc.zzl(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                zzdoy.zza(exc, new PrintWriter(stringWriter));
                zzc.zzj(stringWriter.toString()).zzk(exc.getClass().getName());
            }
            zzsm zzf = zzvq.zzf(((zzbi.zza) ((zzdqw) zzc.zzazr())).toByteArray());
            zzf.zzbq(i);
            if (i2 != -1) {
                zzf.zzbp(i2);
            }
            zzf.zzdh();
        } catch (Exception unused) {
        }
    }

    public static int zzbz() {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return ThreadLocalRandom.current().nextInt();
            }
            return zzca().nextInt();
        } catch (RuntimeException unused) {
            return zzca().nextInt();
        }
    }

    private static Random zzca() {
        if (zzvs == null) {
            synchronized (zzda.class) {
                if (zzvs == null) {
                    zzvs = new Random();
                }
            }
        }
        return zzvs;
    }
}
