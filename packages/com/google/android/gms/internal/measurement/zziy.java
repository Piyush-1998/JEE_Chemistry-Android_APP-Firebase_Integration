package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* loaded from: classes.dex */
final class zziy {
    final int tag;
    final byte[] zzado;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziy(int i, byte[] bArr) {
        this.tag = i;
        this.zzado = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zziy) {
            zziy zziyVar = (zziy) obj;
            return this.tag == zziyVar.tag && Arrays.equals(this.zzado, zziyVar.zzado);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.tag + 527) * 31) + Arrays.hashCode(this.zzado);
    }
}
