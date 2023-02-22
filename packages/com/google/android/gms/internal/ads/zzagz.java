package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Predicate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class zzagz<ReferenceT> implements zzagw {
    private final Map<String, CopyOnWriteArrayList<zzaer<? super ReferenceT>>> zzczf = new HashMap();
    private ReferenceT zzczg;

    public final void zzg(ReferenceT referencet) {
        this.zzczg = referencet;
    }

    @Override // com.google.android.gms.internal.ads.zzagw
    public final boolean zzcx(String str) {
        return str != null && zzg(Uri.parse(str));
    }

    public final boolean zzg(Uri uri) {
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            zzh(uri);
            return true;
        }
        return false;
    }

    public final void zzh(Uri uri) {
        String path = uri.getPath();
        com.google.android.gms.ads.internal.zzq.zzkj();
        zzb(path, zzaul.zzi(uri));
    }

    private final synchronized void zzb(final String str, final Map<String, String> map) {
        if (zzaug.isLoggable(2)) {
            String valueOf = String.valueOf(str);
            zzaug.zzdy(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                zzaug.zzdy(sb.toString());
            }
        }
        CopyOnWriteArrayList<zzaer<? super ReferenceT>> copyOnWriteArrayList = this.zzczf.get(str);
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            Iterator<zzaer<? super ReferenceT>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                final zzaer<? super ReferenceT> next = it.next();
                zzaxn.zzdwm.execute(new Runnable(this, next, map) { // from class: com.google.android.gms.internal.ads.zzagy
                    private final zzagz zzczc;
                    private final zzaer zzczd;
                    private final Map zzcze;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzczc = this;
                        this.zzczd = next;
                        this.zzcze = map;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzczc.zza(this.zzczd, this.zzcze);
                    }
                });
            }
            return;
        }
        if (((Boolean) zzuv.zzon().zzd(zzza.zzctw)).booleanValue() && com.google.android.gms.ads.internal.zzq.zzkn().zzub() != null) {
            zzaxn.zzdwi.execute(new Runnable(str) { // from class: com.google.android.gms.internal.ads.zzahb
                private final String zzczh;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzczh = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.ads.internal.zzq.zzkn().zzub().zzcm(this.zzczh.substring(1));
                }
            });
        }
    }

    public final synchronized void zza(String str, zzaer<? super ReferenceT> zzaerVar) {
        CopyOnWriteArrayList<zzaer<? super ReferenceT>> copyOnWriteArrayList = this.zzczf.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.zzczf.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(zzaerVar);
    }

    public final synchronized void zzb(String str, zzaer<? super ReferenceT> zzaerVar) {
        CopyOnWriteArrayList<zzaer<? super ReferenceT>> copyOnWriteArrayList = this.zzczf.get(str);
        if (copyOnWriteArrayList == null) {
            return;
        }
        copyOnWriteArrayList.remove(zzaerVar);
    }

    public final synchronized void zza(String str, Predicate<zzaer<? super ReferenceT>> predicate) {
        CopyOnWriteArrayList<zzaer<? super ReferenceT>> copyOnWriteArrayList = this.zzczf.get(str);
        if (copyOnWriteArrayList == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<zzaer<? super ReferenceT>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzaer<? super ReferenceT> next = it.next();
            if (predicate.apply(next)) {
                arrayList.add(next);
            }
        }
        copyOnWriteArrayList.removeAll(arrayList);
    }

    public final synchronized void reset() {
        this.zzczf.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzaer zzaerVar, Map map) {
        zzaerVar.zza(this.zzczg, map);
    }
}
