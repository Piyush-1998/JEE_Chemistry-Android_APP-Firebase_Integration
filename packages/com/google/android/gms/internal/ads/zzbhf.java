package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbhf {
    private final Executor executor;
    private final String zzbly;
    private final zzajc zzfbm;
    private zzbhk zzfbn;
    private final zzaer<Object> zzfbo = new zzbhe(this);
    private final zzaer<Object> zzfbp = new zzbhg(this);

    public zzbhf(String str, zzajc zzajcVar, Executor executor) {
        this.zzbly = str;
        this.zzfbm = zzajcVar;
        this.executor = executor;
    }

    public final void zza(zzbhk zzbhkVar) {
        this.zzfbm.zzc("/updateActiveView", this.zzfbo);
        this.zzfbm.zzc("/untrackActiveViewUnit", this.zzfbp);
        this.zzfbn = zzbhkVar;
    }

    public final void zzd(zzbbw zzbbwVar) {
        zzbbwVar.zza("/updateActiveView", this.zzfbo);
        zzbbwVar.zza("/untrackActiveViewUnit", this.zzfbp);
    }

    public final void zze(zzbbw zzbbwVar) {
        zzbbwVar.zzb("/updateActiveView", this.zzfbo);
        zzbbwVar.zzb("/untrackActiveViewUnit", this.zzfbp);
    }

    public final void zzaeh() {
        this.zzfbm.zzd("/updateActiveView", this.zzfbo);
        this.zzfbm.zzd("/untrackActiveViewUnit", this.zzfbp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzl(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.zzbly);
    }
}
