package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzpw {
    private int zzbpa;
    private final Object lock = new Object();
    private List<zzpt> zzbpb = new LinkedList();

    public final zzpt zzn(boolean z) {
        synchronized (this.lock) {
            zzpt zzptVar = null;
            if (this.zzbpb.size() == 0) {
                zzaug.zzdv("Queue empty");
                return null;
            }
            int i = 0;
            if (this.zzbpb.size() >= 2) {
                int i2 = Integer.MIN_VALUE;
                int i3 = 0;
                for (zzpt zzptVar2 : this.zzbpb) {
                    int score = zzptVar2.getScore();
                    if (score > i2) {
                        i = i3;
                        zzptVar = zzptVar2;
                        i2 = score;
                    }
                    i3++;
                }
                this.zzbpb.remove(i);
                return zzptVar;
            }
            zzpt zzptVar3 = this.zzbpb.get(0);
            if (z) {
                this.zzbpb.remove(0);
            } else {
                zzptVar3.zzlo();
            }
            return zzptVar3;
        }
    }

    public final boolean zza(zzpt zzptVar) {
        synchronized (this.lock) {
            return this.zzbpb.contains(zzptVar);
        }
    }

    public final boolean zzb(zzpt zzptVar) {
        synchronized (this.lock) {
            Iterator<zzpt> it = this.zzbpb.iterator();
            while (it.hasNext()) {
                zzpt next = it.next();
                if (!com.google.android.gms.ads.internal.zzq.zzkn().zzuh().zzuy()) {
                    if (zzptVar != next && next.zzll().equals(zzptVar.zzll())) {
                        it.remove();
                        return true;
                    }
                } else if (!com.google.android.gms.ads.internal.zzq.zzkn().zzuh().zzva() && zzptVar != next && next.zzln().equals(zzptVar.zzln())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void zzc(zzpt zzptVar) {
        synchronized (this.lock) {
            if (this.zzbpb.size() >= 10) {
                int size = this.zzbpb.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                zzaug.zzdv(sb.toString());
                this.zzbpb.remove(0);
            }
            int i = this.zzbpa;
            this.zzbpa = i + 1;
            zzptVar.zzbo(i);
            zzptVar.zzlr();
            this.zzbpb.add(zzptVar);
        }
    }
}
