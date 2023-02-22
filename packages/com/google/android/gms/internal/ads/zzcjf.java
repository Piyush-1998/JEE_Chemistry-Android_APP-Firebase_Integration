package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcjf {
    private final Clock zzbmp;
    private final List<String> zzfzh = Collections.synchronizedList(new ArrayList());

    public zzcjf(Clock clock) {
        this.zzbmp = clock;
    }

    public final <T> zzddi<T> zza(zzcvr zzcvrVar, zzddi<T> zzddiVar) {
        long elapsedRealtime = this.zzbmp.elapsedRealtime();
        String str = zzcvrVar.zzdcu;
        if (str != null) {
            zzdcy.zza(zzddiVar, new zzcje(this, str, elapsedRealtime), zzaxn.zzdwn);
        }
        return zzddiVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(String str, int i, long j) {
        List<String> list = this.zzfzh;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
        sb.append(str);
        sb.append(".");
        sb.append(i);
        sb.append(".");
        sb.append(j);
        list.add(sb.toString());
    }

    public final String zzakw() {
        return TextUtils.join("_", this.zzfzh);
    }
}
