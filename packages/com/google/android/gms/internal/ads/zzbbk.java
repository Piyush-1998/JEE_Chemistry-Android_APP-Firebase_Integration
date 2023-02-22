package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzbbk {
    private final ArrayList<zznh> zzeea = new ArrayList<>();
    private long zzeeb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zzyt() {
        Iterator<zznh> it = this.zzeea.iterator();
        while (it.hasNext()) {
            Map<String, List<String>> responseHeaders = it.next().getResponseHeaders();
            if (responseHeaders != null) {
                for (Map.Entry<String, List<String>> entry : responseHeaders.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase(entry.getKey())) {
                            this.zzeeb = Math.max(this.zzeeb, Long.parseLong(entry.getValue().get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.zzeeb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zznh zznhVar) {
        this.zzeea.add(zznhVar);
    }
}
