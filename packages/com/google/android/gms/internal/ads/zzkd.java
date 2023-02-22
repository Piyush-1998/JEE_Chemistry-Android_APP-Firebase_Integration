package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzkd implements zziw, zzjb {
    private static final zzix zzank = new zzkg();
    private static final int zzavl = zzof.zzbi("qt  ");
    private long zzagh;
    private int zzapg;
    private int zzaph;
    private zziy zzapk;
    private int zzavo;
    private int zzavp;
    private long zzavq;
    private int zzavr;
    private zzoc zzavs;
    private zzkf[] zzavt;
    private boolean zzavu;
    private final zzoc zzavm = new zzoc(16);
    private final Stack<zzjr> zzavn = new Stack<>();
    private final zzoc zzanr = new zzoc(zznx.zzbfz);
    private final zzoc zzans = new zzoc(4);

    @Override // com.google.android.gms.internal.ads.zziw
    public final void release() {
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final boolean zzgc() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final boolean zza(zziv zzivVar) throws IOException, InterruptedException {
        return zzki.zzd(zzivVar);
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zza(zziy zziyVar) {
        this.zzapk = zziyVar;
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zzc(long j, long j2) {
        this.zzavn.clear();
        this.zzavr = 0;
        this.zzaph = 0;
        this.zzapg = 0;
        if (j == 0) {
            zzgn();
            return;
        }
        zzkf[] zzkfVarArr = this.zzavt;
        if (zzkfVarArr != null) {
            for (zzkf zzkfVar : zzkfVarArr) {
                zzkj zzkjVar = zzkfVar.zzaxa;
                int zzdw = zzkjVar.zzdw(j2);
                if (zzdw == -1) {
                    zzdw = zzkjVar.zzdx(j2);
                }
                zzkfVar.zzavg = zzdw;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0006 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zziw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zziv r24, com.google.android.gms.internal.ads.zzjc r25) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkd.zza(com.google.android.gms.internal.ads.zziv, com.google.android.gms.internal.ads.zzjc):int");
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final long getDurationUs() {
        return this.zzagh;
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final long zzdt(long j) {
        long j2 = Long.MAX_VALUE;
        for (zzkf zzkfVar : this.zzavt) {
            zzkj zzkjVar = zzkfVar.zzaxa;
            int zzdw = zzkjVar.zzdw(j);
            if (zzdw == -1) {
                zzdw = zzkjVar.zzdx(j);
            }
            long j3 = zzkjVar.zzamv[zzdw];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    private final void zzgn() {
        this.zzavo = 0;
        this.zzavr = 0;
    }

    private final void zzdv(long j) throws zzgv {
        zzkx zzkxVar;
        zzja zzjaVar;
        zzkh zza;
        while (!this.zzavn.isEmpty() && this.zzavn.peek().zzaqu == j) {
            zzjr pop = this.zzavn.pop();
            if (pop.type == zzjs.zzary) {
                long j2 = -9223372036854775807L;
                ArrayList arrayList = new ArrayList();
                long j3 = Long.MAX_VALUE;
                zzkx zzkxVar2 = null;
                zzja zzjaVar2 = new zzja();
                zzju zzak = pop.zzak(zzjs.zzatx);
                if (zzak != null && (zzkxVar2 = zzjt.zza(zzak, this.zzavu)) != null) {
                    zzjaVar2.zzb(zzkxVar2);
                }
                int i = 0;
                while (i < pop.zzaqw.size()) {
                    zzjr zzjrVar = pop.zzaqw.get(i);
                    if (zzjrVar.type == zzjs.zzasa && (zza = zzjt.zza(zzjrVar, pop.zzak(zzjs.zzarz), -9223372036854775807L, (zzin) null, this.zzavu)) != null) {
                        zzkj zza2 = zzjt.zza(zza, zzjrVar.zzal(zzjs.zzasb).zzal(zzjs.zzasc).zzal(zzjs.zzasd), zzjaVar2);
                        if (zza2.zzavc != 0) {
                            zzkf zzkfVar = new zzkf(zza, zza2, this.zzapk.zzb(i, zza.type));
                            zzgo zzo = zza.zzafx.zzo(zza2.zzavi + 30);
                            if (zza.type == 1) {
                                if (zzjaVar2.zzgf()) {
                                    zzo = zzo.zza(zzjaVar2.zzafp, zzjaVar2.zzafq);
                                }
                                if (zzkxVar2 != null) {
                                    zzo = zzo.zza(zzkxVar2);
                                }
                            }
                            zzkfVar.zzaxb.zze(zzo);
                            zzkxVar = zzkxVar2;
                            zzjaVar = zzjaVar2;
                            j2 = Math.max(j2, zza.zzagh);
                            arrayList.add(zzkfVar);
                            long j4 = zza2.zzamv[0];
                            if (j4 < j3) {
                                j3 = j4;
                            }
                            i++;
                            zzjaVar2 = zzjaVar;
                            zzkxVar2 = zzkxVar;
                        }
                    }
                    zzkxVar = zzkxVar2;
                    zzjaVar = zzjaVar2;
                    i++;
                    zzjaVar2 = zzjaVar;
                    zzkxVar2 = zzkxVar;
                }
                this.zzagh = j2;
                this.zzavt = (zzkf[]) arrayList.toArray(new zzkf[arrayList.size()]);
                this.zzapk.zzge();
                this.zzapk.zza(this);
                this.zzavn.clear();
                this.zzavo = 2;
            } else if (!this.zzavn.isEmpty()) {
                this.zzavn.peek().zzaqw.add(pop);
            }
        }
        if (this.zzavo != 2) {
            zzgn();
        }
    }
}
