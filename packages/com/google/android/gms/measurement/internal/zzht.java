package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzht implements Runnable {
    private final /* synthetic */ zzhq zzqz;
    private final /* synthetic */ boolean zzra;
    private final /* synthetic */ zzhr zzrb;
    private final /* synthetic */ zzhr zzrc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzht(zzhq zzhqVar, boolean z, zzhr zzhrVar, zzhr zzhrVar2) {
        this.zzqz = zzhqVar;
        this.zzra = z;
        this.zzrb = zzhrVar;
        this.zzrc = zzhrVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2 = false;
        if (this.zzqz.zzad().zzz(this.zzqz.zzr().zzag())) {
            z = this.zzra && this.zzqz.zzqo != null;
            if (z) {
                zzhq zzhqVar = this.zzqz;
                zzhqVar.zza(zzhqVar.zzqo, true);
            }
        } else {
            if (this.zzra && this.zzqz.zzqo != null) {
                zzhq zzhqVar2 = this.zzqz;
                zzhqVar2.zza(zzhqVar2.zzqo, true);
            }
            z = false;
        }
        zzhr zzhrVar = this.zzrb;
        if ((zzhrVar != null && zzhrVar.zzqw == this.zzrc.zzqw && zzjs.zzs(this.zzrb.zzqv, this.zzrc.zzqv) && zzjs.zzs(this.zzrb.zzqu, this.zzrc.zzqu)) ? true : true) {
            Bundle bundle = new Bundle();
            zzhq.zza(this.zzrc, bundle, true);
            zzhr zzhrVar2 = this.zzrb;
            if (zzhrVar2 != null) {
                if (zzhrVar2.zzqu != null) {
                    bundle.putString("_pn", this.zzrb.zzqu);
                }
                bundle.putString("_pc", this.zzrb.zzqv);
                bundle.putLong("_pi", this.zzrb.zzqw);
            }
            if (this.zzqz.zzad().zzz(this.zzqz.zzr().zzag()) && z) {
                long zzjb = this.zzqz.zzv().zzjb();
                if (zzjb > 0) {
                    this.zzqz.zzz().zzb(bundle, zzjb);
                }
            }
            this.zzqz.zzq().zza("auto", "_vs", bundle);
        }
        this.zzqz.zzqo = this.zzrc;
        this.zzqz.zzs().zza(this.zzrc);
    }
}
