package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaab {
    private zzaab zzcuw;
    private final List<zzzz> zzcuu = new LinkedList();
    private final Map<String, String> zzcuv = new LinkedHashMap();
    private final Object lock = new Object();
    boolean zzcut = true;

    public zzaab(boolean z, String str, String str2) {
        this.zzcuv.put("action", str);
        this.zzcuv.put("ad_format", str2);
    }

    public final void zzc(zzaab zzaabVar) {
        synchronized (this.lock) {
            this.zzcuw = zzaabVar;
        }
    }

    public final zzzz zzer(long j) {
        if (this.zzcut) {
            return new zzzz(j, null, null);
        }
        return null;
    }

    public final boolean zza(zzzz zzzzVar, long j, String... strArr) {
        synchronized (this.lock) {
            for (String str : strArr) {
                this.zzcuu.add(new zzzz(j, str, zzzzVar));
            }
        }
        return true;
    }

    public final String zzqc() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.lock) {
            for (zzzz zzzzVar : this.zzcuu) {
                long time = zzzzVar.getTime();
                String zzpz = zzzzVar.zzpz();
                zzzz zzqa = zzzzVar.zzqa();
                if (zzqa != null && time > 0) {
                    sb2.append(zzpz);
                    sb2.append('.');
                    sb2.append(time - zzqa.getTime());
                    sb2.append(',');
                }
            }
            this.zzcuu.clear();
            if (!TextUtils.isEmpty(null)) {
                sb2.append((String) null);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            sb = sb2.toString();
        }
        return sb;
    }

    public final void zzj(String str, String str2) {
        zzzr zzub;
        if (!this.zzcut || TextUtils.isEmpty(str2) || (zzub = com.google.android.gms.ads.internal.zzq.zzkn().zzub()) == null) {
            return;
        }
        synchronized (this.lock) {
            zzzv zzcl = zzub.zzcl(str);
            Map<String, String> map = this.zzcuv;
            map.put(str, zzcl.zzi(map.get(str), str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<String, String> zzqd() {
        synchronized (this.lock) {
            zzzr zzub = com.google.android.gms.ads.internal.zzq.zzkn().zzub();
            if (zzub != null && this.zzcuw != null) {
                return zzub.zza(this.zzcuv, this.zzcuw.zzqd());
            }
            return this.zzcuv;
        }
    }
}
