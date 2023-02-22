package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcdt extends zzcdr {
    private static final Pattern zzfur = Pattern.compile("Received error HTTP response code: (.*)");
    private final ScheduledExecutorService zzffn;
    private final zzcwe zzfga;
    private final zzddl zzfoa;
    private final zzccx zzfup;
    private final zzcfp zzfuq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdt(zzbox zzboxVar, zzcwe zzcweVar, zzccx zzccxVar, zzddl zzddlVar, ScheduledExecutorService scheduledExecutorService, zzcfp zzcfpVar) {
        super(zzboxVar);
        this.zzfga = zzcweVar;
        this.zzfup = zzccxVar;
        this.zzfoa = zzddlVar;
        this.zzffn = scheduledExecutorService;
        this.zzfuq = zzcfpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final zzddi<zzcvz> zze(zzape zzapeVar) throws zzccu {
        zzddi<zzcvz> zzb = zzdcy.zzb(this.zzfup.zzc(zzapeVar), new zzdcj(this) { // from class: com.google.android.gms.internal.ads.zzcds
            private final zzcdt zzfuo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfuo = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                return this.zzfuo.zzd((InputStream) obj);
            }
        }, this.zzfoa);
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcrp)).booleanValue()) {
            zzb = zzdcy.zzb(zzdcy.zza(zzb, ((Integer) zzuv.zzon().zzd(zzza.zzcrq)).intValue(), TimeUnit.SECONDS, this.zzffn), TimeoutException.class, zzcdv.zzbkv, zzaxn.zzdwn);
        }
        zzdcy.zza(zzb, new zzcdu(this), zzaxn.zzdwn);
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzddi zzd(InputStream inputStream) throws Exception {
        return zzdcy.zzah(new zzcvz(new zzcvy(this.zzfga), zzcvx.zza(new InputStreamReader(inputStream))));
    }
}
