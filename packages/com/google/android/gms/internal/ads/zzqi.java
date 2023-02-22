package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzqi {
    private final int zzbqg;
    private final zzqf zzbqi = new zzqm();
    private final int zzbqf = 6;
    private final int zzbqh = 0;

    public zzqi(int i) {
        this.zzbqg = i;
    }

    public final String zza(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            String str = arrayList2.get(i);
            i++;
            sb.append(str.toLowerCase(Locale.US));
            sb.append('\n');
        }
        return zzbr(sb.toString());
    }

    private final String zzbr(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        zzqk zzqkVar = new zzqk();
        PriorityQueue priorityQueue = new PriorityQueue(this.zzbqg, new zzqh(this));
        for (String str2 : split) {
            String[] zze = zzqj.zze(str2, false);
            if (zze.length != 0) {
                zzqo.zza(zze, this.zzbqg, this.zzbqf, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzqkVar.write(this.zzbqi.zzbq(((zzqn) it.next()).zzbqm));
            } catch (IOException e) {
                zzaug.zzc("Error while writing hash to byteStream", e);
            }
        }
        return zzqkVar.toString();
    }
}
