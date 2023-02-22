package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzmk {
    public static final zzmk zzbdc = new zzmk(new zzmh[0]);
    public final int length;
    private int zzafv;
    private final zzmh[] zzbdd;

    public zzmk(zzmh... zzmhVarArr) {
        this.zzbdd = zzmhVarArr;
        this.length = zzmhVarArr.length;
    }

    public final zzmh zzav(int i) {
        return this.zzbdd[i];
    }

    public final int zza(zzmh zzmhVar) {
        for (int i = 0; i < this.length; i++) {
            if (this.zzbdd[i] == zzmhVar) {
                return i;
            }
        }
        return -1;
    }

    public final int hashCode() {
        if (this.zzafv == 0) {
            this.zzafv = Arrays.hashCode(this.zzbdd);
        }
        return this.zzafv;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzmk zzmkVar = (zzmk) obj;
            if (this.length == zzmkVar.length && Arrays.equals(this.zzbdd, zzmkVar.zzbdd)) {
                return true;
            }
        }
        return false;
    }
}
