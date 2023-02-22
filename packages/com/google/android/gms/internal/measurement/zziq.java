package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zziq;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class zziq<M extends zziq<M>> extends zziw {
    protected zzis zzaoo;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.zziw
    public int zzqy() {
        if (this.zzaoo != null) {
            int i = 0;
            for (int i2 = 0; i2 < this.zzaoo.size(); i2++) {
                i += this.zzaoo.zzcm(i2).zzqy();
            }
            return i;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public void zza(zzio zzioVar) throws IOException {
        if (this.zzaoo == null) {
            return;
        }
        for (int i = 0; i < this.zzaoo.size(); i++) {
            this.zzaoo.zzcm(i).zza(zzioVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zza(zzil zzilVar, int i) throws IOException {
        int position = zzilVar.getPosition();
        if (zzilVar.zzau(i)) {
            int i2 = i >>> 3;
            zziy zziyVar = new zziy(i, zzilVar.zzt(position, zzilVar.getPosition() - position));
            zzir zzirVar = null;
            zzis zzisVar = this.zzaoo;
            if (zzisVar == null) {
                this.zzaoo = new zzis();
            } else {
                zzirVar = zzisVar.zzcl(i2);
            }
            if (zzirVar == null) {
                zzirVar = new zzir();
                this.zzaoo.zza(i2, zzirVar);
            }
            zzirVar.zza(zziyVar);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final /* synthetic */ zziw zzxb() throws CloneNotSupportedException {
        return (zziq) clone();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        zziq zziqVar = (zziq) super.clone();
        zziu.zza(this, zziqVar);
        return zziqVar;
    }
}
