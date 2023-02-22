package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
final class zzdqg implements zzduk {
    private final zzdqf zzhgh;

    public static zzdqg zza(zzdqf zzdqfVar) {
        if (zzdqfVar.zzhgy != null) {
            return zzdqfVar.zzhgy;
        }
        return new zzdqg(zzdqfVar);
    }

    private zzdqg(zzdqf zzdqfVar) {
        zzdqf zzdqfVar2 = (zzdqf) zzdqx.zza(zzdqfVar, "output");
        this.zzhgh = zzdqfVar2;
        zzdqfVar2.zzhgy = this;
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final int zzayy() {
        return zzdqw.zzd.zzhlg;
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzak(int i, int i2) throws IOException {
        this.zzhgh.zzad(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzo(int i, long j) throws IOException {
        this.zzhgh.zzg(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzp(int i, long j) throws IOException {
        this.zzhgh.zzi(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zza(int i, float f) throws IOException {
        this.zzhgh.zza(i, f);
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzb(int i, double d) throws IOException {
        this.zzhgh.zzb(i, d);
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzal(int i, int i2) throws IOException {
        this.zzhgh.zzaa(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzg(int i, long j) throws IOException {
        this.zzhgh.zzg(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzaa(int i, int i2) throws IOException {
        this.zzhgh.zzaa(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzi(int i, long j) throws IOException {
        this.zzhgh.zzi(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzad(int i, int i2) throws IOException {
        this.zzhgh.zzad(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzg(int i, boolean z) throws IOException {
        this.zzhgh.zzg(i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzg(int i, String str) throws IOException {
        this.zzhgh.zzg(i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zza(int i, zzdpm zzdpmVar) throws IOException {
        this.zzhgh.zza(i, zzdpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzab(int i, int i2) throws IOException {
        this.zzhgh.zzab(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzac(int i, int i2) throws IOException {
        this.zzhgh.zzac(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzh(int i, long j) throws IOException {
        this.zzhgh.zzh(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zza(int i, Object obj, zzdsv zzdsvVar) throws IOException {
        this.zzhgh.zza(i, (zzdsg) obj, zzdsvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzb(int i, Object obj, zzdsv zzdsvVar) throws IOException {
        zzdqf zzdqfVar = this.zzhgh;
        zzdqfVar.zzz(i, 3);
        zzdsvVar.zza((zzdsg) obj, zzdqfVar.zzhgy);
        zzdqfVar.zzz(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzgm(int i) throws IOException {
        this.zzhgh.zzz(i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzgn(int i) throws IOException {
        this.zzhgh.zzz(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzb(int i, Object obj) throws IOException {
        if (obj instanceof zzdpm) {
            this.zzhgh.zzb(i, (zzdpm) obj);
        } else {
            this.zzhgh.zzb(i, (zzdsg) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zza(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhgh.zzz(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdqf.zzge(list.get(i4).intValue());
            }
            this.zzhgh.zzga(i3);
            while (i2 < list.size()) {
                this.zzhgh.zzfz(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhgh.zzaa(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzb(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhgh.zzz(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdqf.zzgh(list.get(i4).intValue());
            }
            this.zzhgh.zzga(i3);
            while (i2 < list.size()) {
                this.zzhgh.zzgc(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhgh.zzad(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzc(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhgh.zzz(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdqf.zzfd(list.get(i4).longValue());
            }
            this.zzhgh.zzga(i3);
            while (i2 < list.size()) {
                this.zzhgh.zzfa(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhgh.zzg(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzd(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhgh.zzz(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdqf.zzfe(list.get(i4).longValue());
            }
            this.zzhgh.zzga(i3);
            while (i2 < list.size()) {
                this.zzhgh.zzfa(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhgh.zzg(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zze(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhgh.zzz(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdqf.zzfg(list.get(i4).longValue());
            }
            this.zzhgh.zzga(i3);
            while (i2 < list.size()) {
                this.zzhgh.zzfc(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhgh.zzi(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzf(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhgh.zzz(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdqf.zzg(list.get(i4).floatValue());
            }
            this.zzhgh.zzga(i3);
            while (i2 < list.size()) {
                this.zzhgh.zzf(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhgh.zza(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzg(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhgh.zzz(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdqf.zzc(list.get(i4).doubleValue());
            }
            this.zzhgh.zzga(i3);
            while (i2 < list.size()) {
                this.zzhgh.zzb(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhgh.zzb(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzh(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhgh.zzz(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdqf.zzgj(list.get(i4).intValue());
            }
            this.zzhgh.zzga(i3);
            while (i2 < list.size()) {
                this.zzhgh.zzfz(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhgh.zzaa(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzi(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhgh.zzz(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdqf.zzbi(list.get(i4).booleanValue());
            }
            this.zzhgh.zzga(i3);
            while (i2 < list.size()) {
                this.zzhgh.zzbh(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhgh.zzg(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zza(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof zzdrn) {
            zzdrn zzdrnVar = (zzdrn) list;
            while (i2 < list.size()) {
                Object zzgq = zzdrnVar.zzgq(i2);
                if (zzgq instanceof String) {
                    this.zzhgh.zzg(i, (String) zzgq);
                } else {
                    this.zzhgh.zza(i, (zzdpm) zzgq);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhgh.zzg(i, list.get(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzb(int i, List<zzdpm> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zzhgh.zza(i, list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzj(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhgh.zzz(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdqf.zzgf(list.get(i4).intValue());
            }
            this.zzhgh.zzga(i3);
            while (i2 < list.size()) {
                this.zzhgh.zzga(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhgh.zzab(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzk(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhgh.zzz(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdqf.zzgi(list.get(i4).intValue());
            }
            this.zzhgh.zzga(i3);
            while (i2 < list.size()) {
                this.zzhgh.zzgc(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhgh.zzad(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzl(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhgh.zzz(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdqf.zzfh(list.get(i4).longValue());
            }
            this.zzhgh.zzga(i3);
            while (i2 < list.size()) {
                this.zzhgh.zzfc(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhgh.zzi(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzm(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhgh.zzz(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdqf.zzgg(list.get(i4).intValue());
            }
            this.zzhgh.zzga(i3);
            while (i2 < list.size()) {
                this.zzhgh.zzgb(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhgh.zzac(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzn(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhgh.zzz(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdqf.zzff(list.get(i4).longValue());
            }
            this.zzhgh.zzga(i3);
            while (i2 < list.size()) {
                this.zzhgh.zzfb(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhgh.zzh(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zza(int i, List<?> list, zzdsv zzdsvVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zza(i, list.get(i2), zzdsvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final void zzb(int i, List<?> list, zzdsv zzdsvVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzb(i, list.get(i2), zzdsvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    public final <K, V> void zza(int i, zzdrx<K, V> zzdrxVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zzhgh.zzz(i, 2);
            this.zzhgh.zzga(zzdry.zza(zzdrxVar, entry.getKey(), entry.getValue()));
            zzdry.zza(this.zzhgh, zzdrxVar, entry.getKey(), entry.getValue());
        }
    }
}
