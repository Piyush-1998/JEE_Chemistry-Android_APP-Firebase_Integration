package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcjg<AdT> implements zzdcj<zzcvz, AdT> {
    private final Executor executor;
    private final zzcyp zzfbe;
    private final ScheduledExecutorService zzfcx;
    private final zzcyg zzfgb;
    private final zzbmz zzfht;
    private final zzbkp<AdT> zzfzi;
    private final zzcjf zzfzj;

    public zzcjg(zzcyg zzcygVar, zzcjf zzcjfVar, zzbmz zzbmzVar, zzcyp zzcypVar, zzbkp<AdT> zzbkpVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zzfgb = zzcygVar;
        this.zzfzj = zzcjfVar;
        this.zzfht = zzbmzVar;
        this.zzfbe = zzcypVar;
        this.zzfzi = zzbkpVar;
        this.executor = executor;
        this.zzfcx = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final /* synthetic */ zzddi zzf(zzcvz zzcvzVar) throws Exception {
        final zzcvz zzcvzVar2 = zzcvzVar;
        zzcxp zzant = this.zzfgb.zzu(zzcyd.RENDER_CONFIG_INIT).zzb(zzdcy.zzi(new zzcjh("No ad configs", 3))).zzant();
        this.zzfht.zza(new zzbha(zzcvzVar2, this.zzfbe), this.executor);
        int i = 0;
        for (final zzcvr zzcvrVar : zzcvzVar2.zzgkb.zzgjx) {
            Iterator<String> it = zzcvrVar.zzgiy.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                final zzcga<AdT> zze = this.zzfzi.zze(zzcvrVar.zzfis, next);
                if (zze != null && zze.zza(zzcvzVar2, zzcvrVar)) {
                    zzcxy<I> zza = this.zzfgb.zza((zzcyg) zzcyd.RENDER_CONFIG_WATERFALL, (zzddi) zzant);
                    StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 26);
                    sb.append("render-config-");
                    sb.append(i);
                    sb.append("-");
                    sb.append(next);
                    zzant = zza.zzgi(sb.toString()).zza(Throwable.class, new zzdcj(this, zzcvrVar, zze, zzcvzVar2) { // from class: com.google.android.gms.internal.ads.zzcjj
                        private final zzcvr zzfym;
                        private final zzcvz zzfyo;
                        private final zzcjg zzfzk;
                        private final zzcga zzfzl;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzfzk = this;
                            this.zzfym = zzcvrVar;
                            this.zzfzl = zze;
                            this.zzfyo = zzcvzVar2;
                        }

                        @Override // com.google.android.gms.internal.ads.zzdcj
                        public final zzddi zzf(Object obj) {
                            return this.zzfzk.zza(this.zzfym, this.zzfzl, this.zzfyo, (Throwable) obj);
                        }
                    }).zzant();
                    break;
                }
            }
            i++;
        }
        return zzant;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzddi zza(zzcvr zzcvrVar, zzcga zzcgaVar, zzcvz zzcvzVar, Throwable th) throws Exception {
        return this.zzfzj.zza(zzcvrVar, zzdcy.zza(zzcgaVar.zzb(zzcvzVar, zzcvrVar), zzcvrVar.zzgjn, TimeUnit.MILLISECONDS, this.zzfcx));
    }
}
