package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcyp {
    private final Executor executor;
    private final String zzblz;
    private final Clock zzbmp;
    private final String zzcdr;
    private final String zzdix;
    private final zzcwc zzfgu;
    private final zzcjf zzfhu;
    private final zzaxm zzgmx;
    private final Context zzlk;

    public zzcyp(Executor executor, zzaxm zzaxmVar, zzcjf zzcjfVar, zzaxl zzaxlVar, String str, String str2, Context context, zzcwc zzcwcVar, Clock clock) {
        this.executor = executor;
        this.zzgmx = zzaxmVar;
        this.zzfhu = zzcjfVar;
        this.zzblz = zzaxlVar.zzblz;
        this.zzdix = str;
        this.zzcdr = str2;
        this.zzlk = context;
        this.zzfgu = zzcwcVar;
        this.zzbmp = clock;
    }

    public final void zza(zzcvz zzcvzVar, zzcvr zzcvrVar, List<String> list) {
        zza(zzcvzVar, zzcvrVar, false, list);
    }

    public final void zza(zzcvz zzcvzVar, zzcvr zzcvrVar, boolean z, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String str = z ? "1" : "0";
        for (String str2 : list) {
            String zzc = zzc(zzc(zzc(str2, "@gw_adlocid@", zzcvzVar.zzgka.zzfga.zzgkh), "@gw_adnetrefresh@", str), "@gw_sdkver@", this.zzblz);
            if (zzcvrVar != null) {
                zzc = zzate.zzd(zzc(zzc(zzc(zzc, "@gw_qdata@", zzcvrVar.zzdce), "@gw_adnetid@", zzcvrVar.zzaex), "@gw_allocid@", zzcvrVar.zzdcu), this.zzlk, zzcvrVar.zzdlr);
            }
            arrayList.add(zzc(zzc(zzc(zzc, "@gw_adnetstatus@", this.zzfhu.zzakw()), "@gw_seqnum@", this.zzdix), "@gw_sessid@", this.zzcdr));
        }
        zzi(arrayList);
    }

    public final void zza(zzcvz zzcvzVar, zzcvr zzcvrVar, List<String> list, zzapy zzapyVar) {
        long currentTimeMillis = this.zzbmp.currentTimeMillis();
        try {
            String type = zzapyVar.getType();
            String num = Integer.toString(zzapyVar.getAmount());
            ArrayList arrayList = new ArrayList();
            zzcwc zzcwcVar = this.zzfgu;
            String zzgj = zzcwcVar == null ? "" : zzgj(zzcwcVar.zzdnz);
            zzcwc zzcwcVar2 = this.zzfgu;
            String zzgj2 = zzcwcVar2 != null ? zzgj(zzcwcVar2.zzdoa) : "";
            for (String str : list) {
                arrayList.add(zzate.zzd(zzc(zzc(zzc(zzc(zzc(zzc(str, "@gw_rwd_userid@", Uri.encode(zzgj)), "@gw_rwd_custom_data@", Uri.encode(zzgj2)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(type)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.zzblz), this.zzlk, zzcvrVar.zzdlr));
            }
            zzi(arrayList);
        } catch (RemoteException unused) {
        }
    }

    public final void zzi(List<String> list) {
        for (String str : list) {
            zzei(str);
        }
    }

    public final void zzei(final String str) {
        this.executor.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzcys
            private final String zzcyz;
            private final zzcyp zzgna;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgna = this;
                this.zzcyz = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgna.zzgk(this.zzcyz);
            }
        });
    }

    private static String zzc(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    private static String zzgj(String str) {
        return (TextUtils.isEmpty(str) || !zzaxc.isEnabled()) ? str : "fakeForAdDebugLog";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzgk(String str) {
        this.zzgmx.zzei(str);
    }
}
