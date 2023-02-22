package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzmh {
    public final int length;
    private int zzafv;
    private final zzgo[] zzbby;

    public zzmh(zzgo... zzgoVarArr) {
        zznr.checkState(zzgoVarArr.length > 0);
        this.zzbby = zzgoVarArr;
        this.length = zzgoVarArr.length;
    }

    public final zzgo zzau(int i) {
        return this.zzbby[i];
    }

    public final int zzh(zzgo zzgoVar) {
        int i = 0;
        while (true) {
            zzgo[] zzgoVarArr = this.zzbby;
            if (i >= zzgoVarArr.length) {
                return -1;
            }
            if (zzgoVar == zzgoVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final int hashCode() {
        if (this.zzafv == 0) {
            this.zzafv = Arrays.hashCode(this.zzbby) + 527;
        }
        return this.zzafv;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzmh zzmhVar = (zzmh) obj;
            if (this.length == zzmhVar.length && Arrays.equals(this.zzbby, zzmhVar.zzbby)) {
                return true;
            }
        }
        return false;
    }
}
