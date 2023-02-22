package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzee implements Runnable {
    private final /* synthetic */ int zzka;
    private final /* synthetic */ String zzkb;
    private final /* synthetic */ Object zzkc;
    private final /* synthetic */ Object zzkd;
    private final /* synthetic */ Object zzke;
    private final /* synthetic */ zzef zzkf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzee(zzef zzefVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.zzkf = zzefVar;
        this.zzka = i;
        this.zzkb = str;
        this.zzkc = obj;
        this.zzkd = obj2;
        this.zzke = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        long j;
        char c2;
        long j2;
        zzeo zzac = this.zzkf.zzj.zzac();
        if (!zzac.isInitialized()) {
            this.zzkf.zza(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        c = this.zzkf.zzkg;
        if (c == 0) {
            if (this.zzkf.zzad().zzbn()) {
                zzef zzefVar = this.zzkf;
                zzefVar.zzae();
                zzefVar.zzkg = 'C';
            } else {
                zzef zzefVar2 = this.zzkf;
                zzefVar2.zzae();
                zzefVar2.zzkg = 'c';
            }
        }
        j = this.zzkf.zzr;
        if (j < 0) {
            zzef zzefVar3 = this.zzkf;
            zzefVar3.zzr = zzefVar3.zzad().zzao();
        }
        char charAt = "01VDIWEA?".charAt(this.zzka);
        c2 = this.zzkf.zzkg;
        j2 = this.zzkf.zzr;
        String zza = zzef.zza(true, this.zzkb, this.zzkc, this.zzkd, this.zzke);
        StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 24);
        sb.append("2");
        sb.append(charAt);
        sb.append(c2);
        sb.append(j2);
        sb.append(":");
        sb.append(zza);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = this.zzkb.substring(0, 1024);
        }
        zzac.zzli.zzc(sb2, 1L);
    }
}
