package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzll implements zznq {
    private final Uri uri;
    private final zzne zzamo;
    private final /* synthetic */ zzli zzazs;
    private final zzlo zzbaa;
    private final zznt zzbab;
    private volatile boolean zzbav;
    private long zzbax;
    private final zzjc zzbau = new zzjc();
    private boolean zzbaw = true;
    private long zzcb = -1;

    public zzll(zzli zzliVar, Uri uri, zzne zzneVar, zzlo zzloVar, zznt zzntVar) {
        this.zzazs = zzliVar;
        this.uri = (Uri) zznr.checkNotNull(uri);
        this.zzamo = (zzne) zznr.checkNotNull(zzneVar);
        this.zzbaa = (zzlo) zznr.checkNotNull(zzloVar);
        this.zzbab = zzntVar;
    }

    public final void zze(long j, long j2) {
        this.zzbau.zzamq = j;
        this.zzbax = j2;
        this.zzbaw = true;
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void cancelLoad() {
        this.zzbav = true;
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final boolean zzhj() {
        return this.zzbav;
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzhk() throws IOException, InterruptedException {
        int i = 0;
        while (i == 0 && !this.zzbav) {
            zzit zzitVar = null;
            try {
                long j = this.zzbau.zzamq;
                long zza = this.zzamo.zza(new zznf(this.uri, j, -1L, zzli.zzf(this.zzazs)));
                this.zzcb = zza;
                if (zza != -1) {
                    this.zzcb = zza + j;
                }
                zzit zzitVar2 = new zzit(this.zzamo, j, this.zzcb);
                try {
                    zziw zza2 = this.zzbaa.zza(zzitVar2, this.zzamo.getUri());
                    if (this.zzbaw) {
                        zza2.zzc(j, this.zzbax);
                        this.zzbaw = false;
                    }
                    while (i == 0 && !this.zzbav) {
                        this.zzbab.block();
                        i = zza2.zza(zzitVar2, this.zzbau);
                        if (zzitVar2.getPosition() > zzli.zzg(this.zzazs) + j) {
                            j = zzitVar2.getPosition();
                            this.zzbab.zzig();
                            zzli.zzi(this.zzazs).post(zzli.zzh(this.zzazs));
                        }
                    }
                    if (i == 1) {
                        i = 0;
                    } else {
                        this.zzbau.zzamq = zzitVar2.getPosition();
                    }
                    zzof.zza(this.zzamo);
                } catch (Throwable th) {
                    th = th;
                    zzitVar = zzitVar2;
                    if (i != 1 && zzitVar != null) {
                        this.zzbau.zzamq = zzitVar.getPosition();
                    }
                    zzof.zza(this.zzamo);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
