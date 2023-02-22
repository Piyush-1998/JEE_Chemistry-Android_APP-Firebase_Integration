package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbyq<T> implements zzaer<Object> {
    private final WeakReference<T> zzfqa;
    private final String zzfqb;
    private final zzaer<T> zzfqc;
    private final /* synthetic */ zzbyh zzfqd;

    private zzbyq(zzbyh zzbyhVar, WeakReference<T> weakReference, String str, zzaer<T> zzaerVar) {
        this.zzfqd = zzbyhVar;
        this.zzfqa = weakReference;
        this.zzfqb = str;
        this.zzfqc = zzaerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zza(Object obj, Map<String, String> map) {
        T t = this.zzfqa.get();
        if (t == null) {
            this.zzfqd.zzb(this.zzfqb, this);
        } else {
            this.zzfqc.zza(t, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbyq(zzbyh zzbyhVar, WeakReference weakReference, String str, zzaer zzaerVar, zzbyi zzbyiVar) {
        this(zzbyhVar, weakReference, str, zzaerVar);
    }
}
