package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzaf {
    final String name;
    private final String origin;
    final long timestamp;
    final String zzce;
    final long zzfp;
    final zzah zzfq;

    private zzaf(zzfj zzfjVar, String str, String str2, String str3, long j, long j2, zzah zzahVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzahVar);
        this.zzce = str2;
        this.name = str3;
        this.origin = TextUtils.isEmpty(str) ? null : str;
        this.timestamp = j;
        this.zzfp = j2;
        if (j2 != 0 && j2 > j) {
            zzfjVar.zzab().zzgn().zza("Event created with reverse previous/current timestamps. appId, name", zzef.zzam(str2), zzef.zzam(str3));
        }
        this.zzfq = zzahVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaf(zzfj zzfjVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzah zzahVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.zzce = str2;
        this.name = str3;
        this.origin = TextUtils.isEmpty(str) ? null : str;
        this.timestamp = j;
        this.zzfp = j2;
        if (j2 != 0 && j2 > j) {
            zzfjVar.zzab().zzgn().zza("Event created with reverse previous/current timestamps. appId", zzef.zzam(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzfjVar.zzab().zzgk().zzao("Param name can't be null");
                    it.remove();
                } else {
                    Object zzb = zzfjVar.zzz().zzb(next, bundle2.get(next));
                    if (zzb == null) {
                        zzfjVar.zzab().zzgn().zza("Param value can't be null", zzfjVar.zzy().zzak(next));
                        it.remove();
                    } else {
                        zzfjVar.zzz().zza(bundle2, next, zzb);
                    }
                }
            }
            zzahVar = new zzah(bundle2);
        } else {
            zzahVar = new zzah(new Bundle());
        }
        this.zzfq = zzahVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzaf zza(zzfj zzfjVar, long j) {
        return new zzaf(zzfjVar, this.origin, this.zzce, this.name, this.timestamp, j, this.zzfq);
    }

    public final String toString() {
        String str = this.zzce;
        String str2 = this.name;
        String valueOf = String.valueOf(this.zzfq);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
