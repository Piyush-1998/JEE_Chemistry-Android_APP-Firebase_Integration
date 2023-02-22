package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzavu {
    private final String[] zzdtx;
    private final double[] zzdty;
    private final double[] zzdtz;
    private final int[] zzdua;
    private int zzdub;

    private zzavu(zzavv zzavvVar) {
        List list;
        List list2;
        List list3;
        List list4;
        list = zzavvVar.zzdud;
        int size = list.size();
        list2 = zzavvVar.zzduc;
        this.zzdtx = (String[]) list2.toArray(new String[size]);
        list3 = zzavvVar.zzdud;
        this.zzdty = zze(list3);
        list4 = zzavvVar.zzdue;
        this.zzdtz = zze(list4);
        this.zzdua = new int[size];
        this.zzdub = 0;
    }

    private static double[] zze(List<Double> list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = list.get(i).doubleValue();
        }
        return dArr;
    }

    public final void zza(double d) {
        this.zzdub++;
        int i = 0;
        while (true) {
            double[] dArr = this.zzdtz;
            if (i >= dArr.length) {
                return;
            }
            if (dArr[i] <= d && d < this.zzdty[i]) {
                int[] iArr = this.zzdua;
                iArr[i] = iArr[i] + 1;
            }
            if (d < this.zzdtz[i]) {
                return;
            }
            i++;
        }
    }

    public final List<zzavw> zzwb() {
        ArrayList arrayList = new ArrayList(this.zzdtx.length);
        for (int i = 0; i < this.zzdtx.length; i++) {
            String str = this.zzdtx[i];
            double d = this.zzdtz[i];
            double d2 = this.zzdty[i];
            int[] iArr = this.zzdua;
            double d3 = iArr[i];
            double d4 = this.zzdub;
            Double.isNaN(d3);
            Double.isNaN(d4);
            arrayList.add(new zzavw(str, d, d2, d3 / d4, iArr[i]));
        }
        return arrayList;
    }
}
