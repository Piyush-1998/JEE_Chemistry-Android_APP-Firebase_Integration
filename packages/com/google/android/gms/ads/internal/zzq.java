package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzagk;
import com.google.android.gms.internal.ads.zzagx;
import com.google.android.gms.internal.ads.zzaio;
import com.google.android.gms.internal.ads.zzajv;
import com.google.android.gms.internal.ads.zzanl;
import com.google.android.gms.internal.ads.zzaoe;
import com.google.android.gms.internal.ads.zzaoj;
import com.google.android.gms.internal.ads.zzapl;
import com.google.android.gms.internal.ads.zzasl;
import com.google.android.gms.internal.ads.zzatr;
import com.google.android.gms.internal.ads.zzaul;
import com.google.android.gms.internal.ads.zzaur;
import com.google.android.gms.internal.ads.zzave;
import com.google.android.gms.internal.ads.zzavm;
import com.google.android.gms.internal.ads.zzawj;
import com.google.android.gms.internal.ads.zzawk;
import com.google.android.gms.internal.ads.zzawu;
import com.google.android.gms.internal.ads.zzaxy;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbcb;
import com.google.android.gms.internal.ads.zzpv;
import com.google.android.gms.internal.ads.zzrh;
import com.google.android.gms.internal.ads.zzri;
import com.google.android.gms.internal.ads.zzse;
import com.google.android.gms.internal.ads.zzzt;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzq {
    private static zzq zzbmc = new zzq();
    private final com.google.android.gms.ads.internal.overlay.zzb zzbmd;
    private final zzaoj zzbme;
    private final com.google.android.gms.ads.internal.overlay.zzn zzbmf;
    private final zzaoe zzbmg;
    private final zzaul zzbmh;
    private final zzbcb zzbmi;
    private final zzaur zzbmj;
    private final zzpv zzbmk;
    private final zzatr zzbml;
    private final zzave zzbmm;
    private final zzri zzbmn;
    private final zzrh zzbmo;
    private final Clock zzbmp;
    private final zzd zzbmq;
    private final zzzt zzbmr;
    private final zzavm zzbms;
    private final zzapl zzbmt;
    private final zzagx zzbmu;
    private final zzaxy zzbmv;
    private final zzagk zzbmw;
    private final zzaio zzbmx;
    private final zzawk zzbmy;
    private final zzw zzbmz;
    private final zzv zzbna;
    private final zzajv zzbnb;
    private final zzawj zzbnc;
    private final zzanl zzbnd;
    private final zzse zzbne;
    private final zzasl zzbnf;
    private final zzawu zzbng;
    private final zzbay zzbnh;
    private final zzayd zzbni;

    protected zzq() {
        this(new com.google.android.gms.ads.internal.overlay.zzb(), new zzaoj(), new com.google.android.gms.ads.internal.overlay.zzn(), new zzaoe(), new zzaul(), new zzbcb(), zzaur.zzco(Build.VERSION.SDK_INT), new zzpv(), new zzatr(), new zzave(), new zzri(), new zzrh(), DefaultClock.getInstance(), new zzd(), new zzzt(), new zzavm(), new zzapl(), new zzagx(), new zzaxy(), new zzaio(), new zzawk(), new zzw(), new zzv(), new zzajv(), new zzawj(), new zzanl(), new zzse(), new zzasl(), new zzawu(), new zzbay(), new zzayd());
    }

    private zzq(com.google.android.gms.ads.internal.overlay.zzb zzbVar, zzaoj zzaojVar, com.google.android.gms.ads.internal.overlay.zzn zznVar, zzaoe zzaoeVar, zzaul zzaulVar, zzbcb zzbcbVar, zzaur zzaurVar, zzpv zzpvVar, zzatr zzatrVar, zzave zzaveVar, zzri zzriVar, zzrh zzrhVar, Clock clock, zzd zzdVar, zzzt zzztVar, zzavm zzavmVar, zzapl zzaplVar, zzagx zzagxVar, zzaxy zzaxyVar, zzaio zzaioVar, zzawk zzawkVar, zzw zzwVar, zzv zzvVar, zzajv zzajvVar, zzawj zzawjVar, zzanl zzanlVar, zzse zzseVar, zzasl zzaslVar, zzawu zzawuVar, zzbay zzbayVar, zzayd zzaydVar) {
        this.zzbmd = zzbVar;
        this.zzbme = zzaojVar;
        this.zzbmf = zznVar;
        this.zzbmg = zzaoeVar;
        this.zzbmh = zzaulVar;
        this.zzbmi = zzbcbVar;
        this.zzbmj = zzaurVar;
        this.zzbmk = zzpvVar;
        this.zzbml = zzatrVar;
        this.zzbmm = zzaveVar;
        this.zzbmn = zzriVar;
        this.zzbmo = zzrhVar;
        this.zzbmp = clock;
        this.zzbmq = zzdVar;
        this.zzbmr = zzztVar;
        this.zzbms = zzavmVar;
        this.zzbmt = zzaplVar;
        this.zzbmu = zzagxVar;
        this.zzbmv = zzaxyVar;
        this.zzbmw = new zzagk();
        this.zzbmx = zzaioVar;
        this.zzbmy = zzawkVar;
        this.zzbmz = zzwVar;
        this.zzbna = zzvVar;
        this.zzbnb = zzajvVar;
        this.zzbnc = zzawjVar;
        this.zzbnd = zzanlVar;
        this.zzbne = zzseVar;
        this.zzbnf = zzaslVar;
        this.zzbng = zzawuVar;
        this.zzbnh = zzbayVar;
        this.zzbni = zzaydVar;
    }

    public static com.google.android.gms.ads.internal.overlay.zzb zzkh() {
        return zzbmc.zzbmd;
    }

    public static com.google.android.gms.ads.internal.overlay.zzn zzki() {
        return zzbmc.zzbmf;
    }

    public static zzaul zzkj() {
        return zzbmc.zzbmh;
    }

    public static zzbcb zzkk() {
        return zzbmc.zzbmi;
    }

    public static zzaur zzkl() {
        return zzbmc.zzbmj;
    }

    public static zzpv zzkm() {
        return zzbmc.zzbmk;
    }

    public static zzatr zzkn() {
        return zzbmc.zzbml;
    }

    public static zzave zzko() {
        return zzbmc.zzbmm;
    }

    public static zzrh zzkp() {
        return zzbmc.zzbmo;
    }

    public static Clock zzkq() {
        return zzbmc.zzbmp;
    }

    public static zzd zzkr() {
        return zzbmc.zzbmq;
    }

    public static zzzt zzks() {
        return zzbmc.zzbmr;
    }

    public static zzavm zzkt() {
        return zzbmc.zzbms;
    }

    public static zzapl zzku() {
        return zzbmc.zzbmt;
    }

    public static zzaxy zzkv() {
        return zzbmc.zzbmv;
    }

    public static zzaio zzkw() {
        return zzbmc.zzbmx;
    }

    public static zzawk zzkx() {
        return zzbmc.zzbmy;
    }

    public static zzanl zzky() {
        return zzbmc.zzbnd;
    }

    public static zzw zzkz() {
        return zzbmc.zzbmz;
    }

    public static zzv zzla() {
        return zzbmc.zzbna;
    }

    public static zzajv zzlb() {
        return zzbmc.zzbnb;
    }

    public static zzawj zzlc() {
        return zzbmc.zzbnc;
    }

    public static zzse zzld() {
        return zzbmc.zzbne;
    }

    public static zzawu zzle() {
        return zzbmc.zzbng;
    }

    public static zzbay zzlf() {
        return zzbmc.zzbnh;
    }

    public static zzayd zzlg() {
        return zzbmc.zzbni;
    }

    public static zzasl zzlh() {
        return zzbmc.zzbnf;
    }
}
