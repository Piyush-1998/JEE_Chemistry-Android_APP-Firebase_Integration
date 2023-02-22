package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzli implements zziy, zzls, zzme, zzno<zzll> {
    private final Uri uri;
    private final Handler zzacs;
    private boolean zzadu;
    private boolean zzaei;
    private long zzagh;
    private final zzne zzamo;
    private final int zzazt;
    private final zzlp zzazu;
    private final zzlt zzazv;
    private final zznc zzazw;
    private final String zzazx;
    private final long zzazy;
    private final zzlo zzbaa;
    private zzlr zzbaf;
    private zzjb zzbag;
    private boolean zzbah;
    private boolean zzbai;
    private boolean zzbaj;
    private int zzbak;
    private zzmk zzbal;
    private boolean[] zzbam;
    private boolean[] zzban;
    private boolean zzbao;
    private long zzbap;
    private int zzbar;
    private boolean zzbas;
    private final zznl zzazz = new zznl("Loader:ExtractorMediaPeriod");
    private final zznt zzbab = new zznt();
    private final Runnable zzbac = new zzlh(this);
    private final Runnable zzbad = new zzlk(this);
    private final Handler handler = new Handler();
    private long zzbaq = -9223372036854775807L;
    private final SparseArray<zzmc> zzbae = new SparseArray<>();
    private long zzcb = -1;

    public zzli(Uri uri, zzne zzneVar, zziw[] zziwVarArr, int i, Handler handler, zzlp zzlpVar, zzlt zzltVar, zznc zzncVar, String str, int i2) {
        this.uri = uri;
        this.zzamo = zzneVar;
        this.zzazt = i;
        this.zzacs = handler;
        this.zzazu = zzlpVar;
        this.zzazv = zzltVar;
        this.zzazw = zzncVar;
        this.zzazx = str;
        this.zzazy = i2;
        this.zzbaa = new zzlo(zziwVarArr, this);
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzdz(long j) {
    }

    public final void release() {
        this.zzazz.zza(new zzlj(this, this.zzbaa));
        this.handler.removeCallbacksAndMessages(null);
        this.zzaei = true;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zza(zzlr zzlrVar, long j) {
        this.zzbaf = zzlrVar;
        this.zzbab.open();
        startLoading();
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzha() throws IOException {
        this.zzazz.zzbb(Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final zzmk zzhb() {
        return this.zzbal;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final long zza(zzmt[] zzmtVarArr, boolean[] zArr, zzmd[] zzmdVarArr, boolean[] zArr2, long j) {
        int i;
        zznr.checkState(this.zzadu);
        for (int i2 = 0; i2 < zzmtVarArr.length; i2++) {
            if (zzmdVarArr[i2] != null && (zzmtVarArr[i2] == null || !zArr[i2])) {
                i = ((zzln) zzmdVarArr[i2]).track;
                zznr.checkState(this.zzbam[i]);
                this.zzbak--;
                this.zzbam[i] = false;
                this.zzbae.valueAt(i).disable();
                zzmdVarArr[i2] = null;
            }
        }
        boolean z = false;
        for (int i3 = 0; i3 < zzmtVarArr.length; i3++) {
            if (zzmdVarArr[i3] == null && zzmtVarArr[i3] != null) {
                zzmt zzmtVar = zzmtVarArr[i3];
                zznr.checkState(zzmtVar.length() == 1);
                zznr.checkState(zzmtVar.zzaw(0) == 0);
                int zza = this.zzbal.zza(zzmtVar.zzhx());
                zznr.checkState(!this.zzbam[zza]);
                this.zzbak++;
                this.zzbam[zza] = true;
                zzmdVarArr[i3] = new zzln(this, zza);
                zArr2[i3] = true;
                z = true;
            }
        }
        if (!this.zzbai) {
            int size = this.zzbae.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.zzbam[i4]) {
                    this.zzbae.valueAt(i4).disable();
                }
            }
        }
        if (this.zzbak == 0) {
            this.zzbaj = false;
            if (this.zzazz.isLoading()) {
                this.zzazz.zzie();
            }
        } else if (!this.zzbai ? j != 0 : z) {
            j = zzea(j);
            for (int i5 = 0; i5 < zzmdVarArr.length; i5++) {
                if (zzmdVarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.zzbai = true;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzls, com.google.android.gms.internal.ads.zzmg
    public final boolean zzdy(long j) {
        if (this.zzbas) {
            return false;
        }
        if (this.zzadu && this.zzbak == 0) {
            return false;
        }
        boolean open = this.zzbab.open();
        if (this.zzazz.isLoading()) {
            return open;
        }
        startLoading();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzls, com.google.android.gms.internal.ads.zzmg
    public final long zzgz() {
        if (this.zzbak == 0) {
            return Long.MIN_VALUE;
        }
        return zzhd();
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final long zzhc() {
        if (this.zzbaj) {
            this.zzbaj = false;
            return this.zzbap;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final long zzhd() {
        long zzhh;
        if (this.zzbas) {
            return Long.MIN_VALUE;
        }
        if (zzhi()) {
            return this.zzbaq;
        }
        if (this.zzbao) {
            zzhh = Long.MAX_VALUE;
            int size = this.zzbae.size();
            for (int i = 0; i < size; i++) {
                if (this.zzban[i]) {
                    zzhh = Math.min(zzhh, this.zzbae.valueAt(i).zzhh());
                }
            }
        } else {
            zzhh = zzhh();
        }
        return zzhh == Long.MIN_VALUE ? this.zzbap : zzhh;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final long zzea(long j) {
        if (!this.zzbag.zzgc()) {
            j = 0;
        }
        this.zzbap = j;
        int size = this.zzbae.size();
        boolean z = !zzhi();
        for (int i = 0; z && i < size; i++) {
            if (this.zzbam[i]) {
                z = this.zzbae.valueAt(i).zze(j, false);
            }
        }
        if (!z) {
            this.zzbaq = j;
            this.zzbas = false;
            if (this.zzazz.isLoading()) {
                this.zzazz.zzie();
            } else {
                for (int i2 = 0; i2 < size; i2++) {
                    this.zzbae.valueAt(i2).zzj(this.zzbam[i2]);
                }
            }
        }
        this.zzbaj = false;
        return j;
    }

    public final boolean zzas(int i) {
        if (this.zzbas) {
            return true;
        }
        return !zzhi() && this.zzbae.valueAt(i).zzhq();
    }

    public final void zzhe() throws IOException {
        this.zzazz.zzbb(Integer.MIN_VALUE);
    }

    public final int zza(int i, zzgq zzgqVar, zzik zzikVar, boolean z) {
        if (this.zzbaj || zzhi()) {
            return -3;
        }
        return this.zzbae.valueAt(i).zza(zzgqVar, zzikVar, z, this.zzbas, this.zzbap);
    }

    public final void zzd(int i, long j) {
        zzmc valueAt = this.zzbae.valueAt(i);
        if (this.zzbas && j > valueAt.zzhh()) {
            valueAt.zzhu();
        } else {
            valueAt.zze(j, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final zzjd zzb(int i, int i2) {
        zzmc zzmcVar = this.zzbae.get(i);
        if (zzmcVar == null) {
            zzmc zzmcVar2 = new zzmc(this.zzazw);
            zzmcVar2.zza(this);
            this.zzbae.put(i, zzmcVar2);
            return zzmcVar2;
        }
        return zzmcVar;
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final void zzge() {
        this.zzbah = true;
        this.handler.post(this.zzbac);
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final void zza(zzjb zzjbVar) {
        this.zzbag = zzjbVar;
        this.handler.post(this.zzbac);
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final void zzf(zzgo zzgoVar) {
        this.handler.post(this.zzbac);
    }

    public final void zzhf() {
        if (this.zzaei || this.zzadu || this.zzbag == null || !this.zzbah) {
            return;
        }
        int size = this.zzbae.size();
        for (int i = 0; i < size; i++) {
            if (this.zzbae.valueAt(i).zzhr() == null) {
                return;
            }
        }
        this.zzbab.zzig();
        zzmh[] zzmhVarArr = new zzmh[size];
        this.zzban = new boolean[size];
        this.zzbam = new boolean[size];
        this.zzagh = this.zzbag.getDurationUs();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 < size) {
                zzgo zzhr = this.zzbae.valueAt(i2).zzhr();
                zzmhVarArr[i2] = new zzmh(zzhr);
                String str = zzhr.zzafc;
                if (!zzny.zzbd(str) && !zzny.zzbc(str)) {
                    z = false;
                }
                this.zzban[i2] = z;
                this.zzbao = z | this.zzbao;
                i2++;
            } else {
                this.zzbal = new zzmk(zzmhVarArr);
                this.zzadu = true;
                this.zzazv.zzb(new zzmi(this.zzagh, this.zzbag.zzgc()), null);
                this.zzbaf.zza((zzls) this);
                return;
            }
        }
    }

    private final void zza(zzll zzllVar) {
        long j;
        if (this.zzcb == -1) {
            j = zzllVar.zzcb;
            this.zzcb = j;
        }
    }

    private final void startLoading() {
        zzjb zzjbVar;
        zzll zzllVar = new zzll(this, this.uri, this.zzamo, this.zzbaa, this.zzbab);
        if (this.zzadu) {
            zznr.checkState(zzhi());
            long j = this.zzagh;
            if (j != -9223372036854775807L && this.zzbaq >= j) {
                this.zzbas = true;
                this.zzbaq = -9223372036854775807L;
                return;
            }
            zzllVar.zze(this.zzbag.zzdt(this.zzbaq), this.zzbaq);
            this.zzbaq = -9223372036854775807L;
        }
        this.zzbar = zzhg();
        int i = this.zzazt;
        if (i == -1) {
            i = (this.zzadu && this.zzcb == -1 && ((zzjbVar = this.zzbag) == null || zzjbVar.getDurationUs() == -9223372036854775807L)) ? 6 : 3;
        }
        this.zzazz.zza(zzllVar, this, i);
    }

    private final int zzhg() {
        int size = this.zzbae.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.zzbae.valueAt(i2).zzhp();
        }
        return i;
    }

    private final long zzhh() {
        int size = this.zzbae.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, this.zzbae.valueAt(i).zzhh());
        }
        return j;
    }

    private final boolean zzhi() {
        return this.zzbaq != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final /* synthetic */ int zza(zzll zzllVar, long j, long j2, IOException iOException) {
        zzjb zzjbVar;
        zzll zzllVar2 = zzllVar;
        zza(zzllVar2);
        Handler handler = this.zzacs;
        if (handler != null && this.zzazu != null) {
            handler.post(new zzlm(this, iOException));
        }
        if (iOException instanceof zzmj) {
            return 3;
        }
        boolean z = zzhg() > this.zzbar;
        if (this.zzcb == -1 && ((zzjbVar = this.zzbag) == null || zzjbVar.getDurationUs() == -9223372036854775807L)) {
            this.zzbap = 0L;
            this.zzbaj = this.zzadu;
            int size = this.zzbae.size();
            for (int i = 0; i < size; i++) {
                this.zzbae.valueAt(i).zzj(!this.zzadu || this.zzbam[i]);
            }
            zzllVar2.zze(0L, 0L);
        }
        this.zzbar = zzhg();
        return z ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final /* synthetic */ void zza(zzll zzllVar, long j, long j2, boolean z) {
        zza(zzllVar);
        if (z || this.zzbak <= 0) {
            return;
        }
        int size = this.zzbae.size();
        for (int i = 0; i < size; i++) {
            this.zzbae.valueAt(i).zzj(this.zzbam[i]);
        }
        this.zzbaf.zza((zzlr) this);
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final /* synthetic */ void zza(zzll zzllVar, long j, long j2) {
        zza(zzllVar);
        this.zzbas = true;
        if (this.zzagh == -9223372036854775807L) {
            long zzhh = zzhh();
            this.zzagh = zzhh == Long.MIN_VALUE ? 0L : zzhh + 10000;
            this.zzazv.zzb(new zzmi(this.zzagh, this.zzbag.zzgc()), null);
        }
        this.zzbaf.zza((zzlr) this);
    }
}
