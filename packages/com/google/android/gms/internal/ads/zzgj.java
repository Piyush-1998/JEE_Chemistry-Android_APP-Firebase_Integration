package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzgj implements zzgc {
    private int repeatMode;
    private final zzgx[] zzacp;
    private final zzmy zzacq;
    private final zzmv zzacr;
    private final Handler zzacs;
    private final zzgl zzact;
    private final CopyOnWriteArraySet<zzgf> zzacu;
    private final zzhd zzacv;
    private final zzha zzacw;
    private boolean zzacx;
    private boolean zzacy;
    private int zzacz;
    private int zzada;
    private int zzadb;
    private boolean zzadc;
    private zzgy zzadd;
    private Object zzade;
    private zzmk zzadf;
    private zzmv zzadg;
    private zzgu zzadh;
    private zzgn zzadi;
    private int zzadj;
    private int zzadk;
    private long zzadl;

    public zzgj(zzgx[] zzgxVarArr, zzmy zzmyVar, zzgs zzgsVar) {
        String str = zzof.zzbgt;
        StringBuilder sb = new StringBuilder("Init ExoPlayerLib/2.4.2 [".length() + 1 + String.valueOf(str).length());
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        zznr.checkState(zzgxVarArr.length > 0);
        this.zzacp = (zzgx[]) zznr.checkNotNull(zzgxVarArr);
        this.zzacq = (zzmy) zznr.checkNotNull(zzmyVar);
        this.zzacy = false;
        this.repeatMode = 0;
        this.zzacz = 1;
        this.zzacu = new CopyOnWriteArraySet<>();
        this.zzacr = new zzmv(new zzmt[zzgxVarArr.length]);
        this.zzadd = zzgy.zzagd;
        this.zzacv = new zzhd();
        this.zzacw = new zzha();
        this.zzadf = zzmk.zzbdc;
        this.zzadg = this.zzacr;
        this.zzadh = zzgu.zzafz;
        this.zzacs = new zzgi(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.zzadi = new zzgn(0, 0L);
        this.zzact = new zzgl(zzgxVarArr, zzmyVar, zzgsVar, this.zzacy, 0, this.zzacs, this.zzadi, this);
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    public final void zza(zzgf zzgfVar) {
        this.zzacu.add(zzgfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    public final void zzb(zzgf zzgfVar) {
        this.zzacu.remove(zzgfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    public final int getPlaybackState() {
        return this.zzacz;
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    public final void zza(zzlu zzluVar) {
        if (!this.zzadd.isEmpty() || this.zzade != null) {
            this.zzadd = zzgy.zzagd;
            this.zzade = null;
            Iterator<zzgf> it = this.zzacu.iterator();
            while (it.hasNext()) {
                it.next().zza(this.zzadd, this.zzade);
            }
        }
        if (this.zzacx) {
            this.zzacx = false;
            this.zzadf = zzmk.zzbdc;
            this.zzadg = this.zzacr;
            this.zzacq.zzd(null);
            Iterator<zzgf> it2 = this.zzacu.iterator();
            while (it2.hasNext()) {
                it2.next().zza(this.zzadf, this.zzadg);
            }
        }
        this.zzadb++;
        this.zzact.zza(zzluVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    public final void zze(boolean z) {
        if (this.zzacy != z) {
            this.zzacy = z;
            this.zzact.zze(z);
            Iterator<zzgf> it = this.zzacu.iterator();
            while (it.hasNext()) {
                it.next().zza(z, this.zzacz);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    public final boolean zzdu() {
        return this.zzacy;
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    public final void seekTo(long j) {
        long zzdh;
        int zzdy = zzdy();
        if (zzdy < 0 || (!this.zzadd.isEmpty() && zzdy >= this.zzadd.zzep())) {
            throw new zzgt(this.zzadd, zzdy, j);
        }
        this.zzada++;
        this.zzadj = zzdy;
        if (!this.zzadd.isEmpty()) {
            this.zzadd.zza(zzdy, this.zzacv, false);
            if (j == -9223372036854775807L) {
                zzdh = this.zzacv.zzagw;
            } else {
                zzdh = zzga.zzdh(j);
            }
            long j2 = this.zzacv.zzagx + zzdh;
            long j3 = this.zzadd.zza(0, this.zzacw, false).zzagh;
            if (j3 != -9223372036854775807L) {
                int i = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
            }
        }
        this.zzadk = 0;
        if (j == -9223372036854775807L) {
            this.zzadl = 0L;
            this.zzact.zza(this.zzadd, zzdy, -9223372036854775807L);
            return;
        }
        this.zzadl = j;
        this.zzact.zza(this.zzadd, zzdy, zzga.zzdh(j));
        Iterator<zzgf> it = this.zzacu.iterator();
        while (it.hasNext()) {
            it.next().zzdx();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    public final void stop() {
        this.zzact.stop();
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    public final void release() {
        this.zzact.release();
        this.zzacs.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    public final void zza(zzgh... zzghVarArr) {
        this.zzact.zza(zzghVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    public final void zzb(zzgh... zzghVarArr) {
        this.zzact.zzb(zzghVarArr);
    }

    private final int zzdy() {
        if (this.zzadd.isEmpty() || this.zzada > 0) {
            return this.zzadj;
        }
        this.zzadd.zza(this.zzadi.zzadr, this.zzacw, false);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    public final long getDuration() {
        if (this.zzadd.isEmpty()) {
            return -9223372036854775807L;
        }
        return zzga.zzdg(this.zzadd.zza(zzdy(), this.zzacv, false).zzagh);
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    public final long zzdw() {
        if (this.zzadd.isEmpty() || this.zzada > 0) {
            return this.zzadl;
        }
        this.zzadd.zza(this.zzadi.zzadr, this.zzacw, false);
        return this.zzacw.zzer() + zzga.zzdg(this.zzadi.zzaev);
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    public final long getBufferedPosition() {
        if (this.zzadd.isEmpty() || this.zzada > 0) {
            return this.zzadl;
        }
        this.zzadd.zza(this.zzadi.zzadr, this.zzacw, false);
        return this.zzacw.zzer() + zzga.zzdg(this.zzadi.zzaew);
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    public final int zzdv() {
        return this.zzacp.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(Message message) {
        switch (message.what) {
            case 0:
                this.zzadb--;
                return;
            case 1:
                this.zzacz = message.arg1;
                Iterator<zzgf> it = this.zzacu.iterator();
                while (it.hasNext()) {
                    it.next().zza(this.zzacy, this.zzacz);
                }
                return;
            case 2:
                this.zzadc = message.arg1 != 0;
                Iterator<zzgf> it2 = this.zzacu.iterator();
                while (it2.hasNext()) {
                    it2.next().zzf(this.zzadc);
                }
                return;
            case 3:
                if (this.zzadb == 0) {
                    zzna zznaVar = (zzna) message.obj;
                    this.zzacx = true;
                    this.zzadf = zznaVar.zzbee;
                    this.zzadg = zznaVar.zzbef;
                    this.zzacq.zzd(zznaVar.zzbeg);
                    Iterator<zzgf> it3 = this.zzacu.iterator();
                    while (it3.hasNext()) {
                        it3.next().zza(this.zzadf, this.zzadg);
                    }
                    return;
                }
                return;
            case 4:
                int i = this.zzada - 1;
                this.zzada = i;
                if (i == 0) {
                    this.zzadi = (zzgn) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<zzgf> it4 = this.zzacu.iterator();
                        while (it4.hasNext()) {
                            it4.next().zzdx();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.zzada == 0) {
                    this.zzadi = (zzgn) message.obj;
                    Iterator<zzgf> it5 = this.zzacu.iterator();
                    while (it5.hasNext()) {
                        it5.next().zzdx();
                    }
                    return;
                }
                return;
            case 6:
                zzgp zzgpVar = (zzgp) message.obj;
                this.zzada -= zzgpVar.zzafw;
                if (this.zzadb == 0) {
                    this.zzadd = zzgpVar.zzadd;
                    this.zzade = zzgpVar.zzade;
                    this.zzadi = zzgpVar.zzadi;
                    Iterator<zzgf> it6 = this.zzacu.iterator();
                    while (it6.hasNext()) {
                        it6.next().zza(this.zzadd, this.zzade);
                    }
                    return;
                }
                return;
            case 7:
                zzgu zzguVar = (zzgu) message.obj;
                if (this.zzadh.equals(zzguVar)) {
                    return;
                }
                this.zzadh = zzguVar;
                Iterator<zzgf> it7 = this.zzacu.iterator();
                while (it7.hasNext()) {
                    it7.next().zza(zzguVar);
                }
                return;
            case 8:
                zzgd zzgdVar = (zzgd) message.obj;
                Iterator<zzgf> it8 = this.zzacu.iterator();
                while (it8.hasNext()) {
                    it8.next().zza(zzgdVar);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
