package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
final class zzdpo implements Comparator<zzdpm> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzdpm zzdpmVar, zzdpm zzdpmVar2) {
        int zzb;
        int zzb2;
        zzdpm zzdpmVar3 = zzdpmVar;
        zzdpm zzdpmVar4 = zzdpmVar2;
        zzdpv zzdpvVar = (zzdpv) zzdpmVar3.iterator();
        zzdpv zzdpvVar2 = (zzdpv) zzdpmVar4.iterator();
        while (zzdpvVar.hasNext() && zzdpvVar2.hasNext()) {
            zzb = zzdpm.zzb(zzdpvVar.nextByte());
            zzb2 = zzdpm.zzb(zzdpvVar2.nextByte());
            int compare = Integer.compare(zzb, zzb2);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzdpmVar3.size(), zzdpmVar4.size());
    }
}
