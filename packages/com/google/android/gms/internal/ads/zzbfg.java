package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzbfg extends zzcsm {
    private zzdwo<String> zzemc;
    private zzdwo<zzcba> zzems;
    private zzdwo<Map<zzcyd, zzcba>> zzemu;
    private zzdwo<Set<zzbqs<zzcym>>> zzemw;
    private zzdwo<Set<zzbqs<zzcym>>> zzend;
    private zzdwo zzene;
    private zzdwo<zzcyg> zzenf;
    private zzdwo<ApplicationInfo> zzeng;
    private final /* synthetic */ zzbfa zzerq;
    private final zzctp zzeuq;
    private zzdwo<zzcsi> zzeur;
    private zzdwo<String> zzeus;
    private zzdwo<zzcss> zzeut;
    private zzdwo<zzcsw> zzeuu;
    private zzdwo<zzctb> zzeuv;
    private zzdwo<Boolean> zzeuw;
    private zzdwo<zzctk> zzeux;
    private zzdwo<zzcto> zzeuy;
    private zzdwo<zzctz> zzeuz;
    private zzdwo<zzcba> zzeva;
    private zzdwo<zzcba> zzevb;
    private zzdwo<zzcba> zzevc;

    private zzbfg(zzbfa zzbfaVar, zzctp zzctpVar) {
        zzdwo zzdwoVar;
        zzdwo zzdwoVar2;
        zzdwo zzdwoVar3;
        zzdwo zzdwoVar4;
        zzdwo zzdwoVar5;
        zzdwo zzdwoVar6;
        zzdwo zzdwoVar7;
        zzdwo zzdwoVar8;
        zzdwo zzdwoVar9;
        this.zzerq = zzbfaVar;
        this.zzeuq = zzctpVar;
        zzbgo zzaed = zzbgo.zzaed();
        zzdwoVar = this.zzerq.zzeki;
        zzdwoVar2 = this.zzerq.zzeke;
        this.zzeur = new zzcsj(zzaed, zzdwoVar, zzdwoVar2, zzcxk.zzanm());
        this.zzeus = new zzcts(zzctpVar);
        zzbew zzabt = zzbew.zzabt();
        zzdwoVar3 = this.zzerq.zzeki;
        this.zzeut = new zzcsu(zzabt, zzdwoVar3, this.zzeus, zzcxk.zzanm());
        zzbgk zzadw = zzbgk.zzadw();
        zzcxk zzanm = zzcxk.zzanm();
        zzdwoVar4 = this.zzerq.zzeki;
        this.zzeuu = new zzcsy(zzadw, zzanm, zzdwoVar4);
        this.zzeuv = new zzctd(zzbgn.zzaeb(), zzcxk.zzanm(), this.zzeus);
        this.zzeuw = new zzctu(zzctpVar);
        this.zzeng = new zzctr(zzctpVar);
        zzbgm zzadz = zzbgm.zzadz();
        zzdwoVar5 = this.zzerq.zzeke;
        this.zzeux = new zzctm(zzadz, zzdwoVar5, this.zzeuw, this.zzeng);
        zzbgp zzaef = zzbgp.zzaef();
        zzdwoVar6 = this.zzerq.zzeke;
        zzdwoVar7 = this.zzerq.zzeki;
        this.zzeuy = new zzctq(zzaef, zzdwoVar6, zzdwoVar7);
        this.zzeuz = new zzcub(zzcxk.zzanm());
        this.zzemc = new zzctt(zzctpVar);
        this.zzems = zzdwc.zzan(zzcau.zzajq());
        this.zzeva = zzdwc.zzan(zzcav.zzajr());
        this.zzevb = zzdwc.zzan(zzcax.zzajt());
        this.zzevc = zzdwc.zzan(zzcaw.zzajs());
        this.zzemu = ((zzdwf) ((zzdwf) ((zzdwf) ((zzdwf) zzdwd.zzho(4).zza(zzcyd.GMS_SIGNALS, this.zzems)).zza(zzcyd.BUILD_URL, this.zzeva)).zza(zzcyd.HTTP, this.zzevb)).zza(zzcyd.PRE_PROCESS, this.zzevc)).zzbdf();
        zzdwo<String> zzdwoVar10 = this.zzemc;
        zzdwoVar8 = this.zzerq.zzeki;
        this.zzemw = zzdwc.zzan(new zzcaz(zzdwoVar10, zzdwoVar8, zzcxk.zzanm(), this.zzemu));
        zzdwk zzbdg = zzdwk.zzaq(0, 1).zzaq(this.zzemw).zzbdg();
        this.zzend = zzbdg;
        this.zzene = zzcyo.zzam(zzbdg);
        zzcxk zzanm2 = zzcxk.zzanm();
        zzdwoVar9 = this.zzerq.zzeke;
        this.zzenf = zzdwc.zzan(zzcyl.zzs(zzanm2, zzdwoVar9, this.zzene));
    }

    private final zzctf zzacq() {
        return new zzctf(zzbgl.zzady(), zzcxk.zzann(), (List) zzdwh.zza(this.zzeuq.zzamp(), "Cannot return null from a non-@Nullable @Provides method"));
    }

    private final zzcso zzacr() {
        return new zzcso(zzbgo.zzaee(), zzcxk.zzann(), (String) zzdwh.zza(this.zzeuq.zzamm(), "Cannot return null from a non-@Nullable @Provides method"), this.zzeuq.zzamn());
    }

    @Override // com.google.android.gms.internal.ads.zzcsm
    public final zzcrt<JSONObject> zzacs() {
        zzdwo zzdwoVar;
        zzdwo zzdwoVar2;
        zzdwo zzdwoVar3;
        zzdwo zzdwoVar4;
        zzbel zzbelVar;
        zzdwo zzdwoVar5;
        zzbel zzbelVar2;
        zzdwo zzdwoVar6;
        zzdwo zzdwoVar7;
        zzdwo zzdwoVar8;
        zzbel zzbelVar3;
        zzbel zzbelVar4;
        zzdwo zzdwoVar9;
        zzddl zzann = zzcxk.zzann();
        zzctb zzctbVar = new zzctb(zzbgn.zzaec(), zzcxk.zzann(), zzcts.zzc(this.zzeuq));
        zzdwoVar = this.zzerq.zzeke;
        zzcru zzcruVar = (zzcru) zzdwh.zza(new zzcqq(zzctbVar, 0L, (ScheduledExecutorService) zzdwoVar.get()), "Cannot return null from a non-@Nullable @Provides method");
        zzajn zzaea = zzbgm.zzaea();
        zzdwoVar2 = this.zzerq.zzeke;
        zzctk zzctkVar = new zzctk(zzaea, (ScheduledExecutorService) zzdwoVar2.get(), this.zzeuq.zzamo(), zzctr.zzb(this.zzeuq));
        zzdwoVar3 = this.zzerq.zzeke;
        zzcru zzcruVar2 = (zzcru) zzdwh.zza(new zzcqq(zzctkVar, ((Long) zzuv.zzon().zzd(zzza.zzcor)).longValue(), (ScheduledExecutorService) zzdwoVar3.get()), "Cannot return null from a non-@Nullable @Provides method");
        zzanr zzaeg = zzbgp.zzaeg();
        zzdwoVar4 = this.zzerq.zzeke;
        zzbelVar = this.zzerq.zzekb;
        zzcto zzctoVar = new zzcto(zzaeg, (ScheduledExecutorService) zzdwoVar4.get(), zzbeo.zza(zzbelVar));
        zzdwoVar5 = this.zzerq.zzeke;
        zzcru zzcruVar3 = (zzcru) zzdwh.zza(new zzcqq(zzctoVar, ((Long) zzuv.zzon().zzd(zzza.zzcpg)).longValue(), (ScheduledExecutorService) zzdwoVar5.get()), "Cannot return null from a non-@Nullable @Provides method");
        zzatn zzaee = zzbgo.zzaee();
        zzbelVar2 = this.zzerq.zzekb;
        Context zza = zzbeo.zza(zzbelVar2);
        zzdwoVar6 = this.zzerq.zzeke;
        zzcsi zzcsiVar = new zzcsi(zzaee, zza, (ScheduledExecutorService) zzdwoVar6.get(), zzcxk.zzann());
        zzdwoVar7 = this.zzerq.zzeke;
        zzcru zzcruVar4 = (zzcru) zzdwh.zza(new zzcqq(zzcsiVar, 0L, (ScheduledExecutorService) zzdwoVar7.get()), "Cannot return null from a non-@Nullable @Provides method");
        zzctz zzctzVar = new zzctz(zzcxk.zzann());
        zzdwoVar8 = this.zzerq.zzeke;
        zzcru zzcruVar5 = (zzcru) zzdwh.zza(new zzcqq(zzctzVar, 0L, (ScheduledExecutorService) zzdwoVar8.get()), "Cannot return null from a non-@Nullable @Provides method");
        zzcru<? extends zzcrr<JSONObject>> zzams = zzcty.zzams();
        zzbelVar3 = this.zzerq.zzekb;
        zzrw zzadx = zzbgk.zzadx();
        zzddl zzann2 = zzcxk.zzann();
        zzbelVar4 = this.zzerq.zzekb;
        zzdwoVar9 = this.zzerq.zzekw;
        return new zzcrt<>(zzann, zzdbg.zza(zzcruVar, zzcruVar2, zzcruVar3, zzcruVar4, zzcruVar5, zzams, new zzcss(null, zzbeo.zza(zzbelVar3), zzcts.zzc(this.zzeuq), zzcxk.zzann()), new zzcsw(zzadx, zzann2, zzbeo.zza(zzbelVar4)), zzacq(), zzacr(), (zzcru) zzdwoVar9.get()));
    }

    @Override // com.google.android.gms.internal.ads.zzcsm
    public final zzcrt<JSONObject> zzact() {
        zzdwo zzdwoVar;
        zzdwoVar = this.zzerq.zzekw;
        return zzctx.zza(zzdwoVar.get(), zzacr(), zzacq(), zzdwc.zzao(this.zzeur), zzdwc.zzao(this.zzeut), zzdwc.zzao(this.zzeuu), zzdwc.zzao(this.zzeuv), zzdwc.zzao(this.zzeux), zzdwc.zzao(this.zzeuy), zzdwc.zzao(this.zzeuz), zzcxk.zzann());
    }

    @Override // com.google.android.gms.internal.ads.zzcsm
    public final zzcyg zzacu() {
        return this.zzenf.get();
    }
}
