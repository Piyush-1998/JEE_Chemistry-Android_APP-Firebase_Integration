package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbo;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzen extends zzfl {
    private static zzfk<String> zzzw = new zzfk<>();
    private final Context zzzu;

    public zzen(zzdx zzdxVar, String str, String str2, zzbo.zza.zzb zzbVar, int i, int i2, Context context) {
        super(zzdxVar, str, str2, zzbVar, i, 29);
        this.zzzu = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfl
    protected final void zzcu() throws IllegalAccessException, InvocationTargetException {
        this.zzaaa.zzac("E");
        AtomicReference<String> zzau = zzzw.zzau(this.zzzu.getPackageName());
        if (zzau.get() == null) {
            synchronized (zzau) {
                if (zzau.get() == null) {
                    zzau.set((String) this.zzaal.invoke(null, this.zzzu));
                }
            }
        }
        String str = zzau.get();
        synchronized (this.zzaaa) {
            this.zzaaa.zzac(zzcg.zza(str.getBytes(), true));
        }
    }
}
