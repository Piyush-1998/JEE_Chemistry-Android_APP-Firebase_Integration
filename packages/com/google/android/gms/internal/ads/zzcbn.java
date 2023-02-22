package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcbn implements zzcym {
    private final Clock zzbmp;
    private final zzcbl zzfsc;
    private final Map<zzcyd, Long> zzfsb = new HashMap();
    private final Map<zzcyd, zzcbm> zzfsd = new HashMap();

    public zzcbn(zzcbl zzcblVar, Set<zzcbm> set, Clock clock) {
        zzcyd zzcydVar;
        this.zzfsc = zzcblVar;
        for (zzcbm zzcbmVar : set) {
            Map<zzcyd, zzcbm> map = this.zzfsd;
            zzcydVar = zzcbmVar.zzfsa;
            map.put(zzcydVar, zzcbmVar);
        }
        this.zzbmp = clock;
    }

    @Override // com.google.android.gms.internal.ads.zzcym
    public final void zza(zzcyd zzcydVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzcym
    public final void zzb(zzcyd zzcydVar, String str) {
        this.zzfsb.put(zzcydVar, Long.valueOf(this.zzbmp.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzcym
    public final void zza(zzcyd zzcydVar, String str, Throwable th) {
        if (this.zzfsb.containsKey(zzcydVar)) {
            long elapsedRealtime = this.zzbmp.elapsedRealtime() - this.zzfsb.get(zzcydVar).longValue();
            Map<String, String> zzqd = this.zzfsc.zzqd();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(elapsedRealtime));
            zzqd.put(concat, valueOf2.length() != 0 ? "f.".concat(valueOf2) : new String("f."));
        }
        if (this.zzfsd.containsKey(zzcydVar)) {
            zza(zzcydVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcym
    public final void zzc(zzcyd zzcydVar, String str) {
        if (this.zzfsb.containsKey(zzcydVar)) {
            long elapsedRealtime = this.zzbmp.elapsedRealtime() - this.zzfsb.get(zzcydVar).longValue();
            Map<String, String> zzqd = this.zzfsc.zzqd();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(elapsedRealtime));
            zzqd.put(concat, valueOf2.length() != 0 ? "s.".concat(valueOf2) : new String("s."));
        }
        if (this.zzfsd.containsKey(zzcydVar)) {
            zza(zzcydVar, true);
        }
    }

    private final void zza(zzcyd zzcydVar, boolean z) {
        zzcyd zzcydVar2;
        String str;
        zzcydVar2 = this.zzfsd.get(zzcydVar).zzfrz;
        String str2 = z ? "s." : "f.";
        if (this.zzfsb.containsKey(zzcydVar2)) {
            long elapsedRealtime = this.zzbmp.elapsedRealtime() - this.zzfsb.get(zzcydVar2).longValue();
            Map<String, String> zzqd = this.zzfsc.zzqd();
            str = this.zzfsd.get(zzcydVar).label;
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "label.".concat(valueOf) : new String("label.");
            String valueOf2 = String.valueOf(Long.toString(elapsedRealtime));
            zzqd.put(concat, valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
        }
    }
}
