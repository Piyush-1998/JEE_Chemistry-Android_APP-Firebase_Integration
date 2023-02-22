package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbga extends zzwa {
    private final zzaxl zzblk;
    private final zzasl zzbnf;
    private final zzchm zzfah;
    private final zzcge<zzcwm, zzchn> zzfai;
    private final zzclr zzfaj;
    private final zzccj zzfak;
    private final Context zzlk;
    private boolean zzye = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbga(Context context, zzaxl zzaxlVar, zzchm zzchmVar, zzcge<zzcwm, zzchn> zzcgeVar, zzclr zzclrVar, zzccj zzccjVar, zzasl zzaslVar) {
        this.zzlk = context;
        this.zzblk = zzaxlVar;
        this.zzfah = zzchmVar;
        this.zzfai = zzcgeVar;
        this.zzfaj = zzclrVar;
        this.zzfak = zzccjVar;
        this.zzbnf = zzaslVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final synchronized void initialize() {
        if (this.zzye) {
            zzaug.zzeu("Mobile ads is initialized already.");
            return;
        }
        zzza.initialize(this.zzlk);
        com.google.android.gms.ads.internal.zzq.zzkn().zzd(this.zzlk, this.zzblk);
        com.google.android.gms.ads.internal.zzq.zzkp().initialize(this.zzlk);
        this.zzye = true;
        this.zzfak.zzaka();
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcmj)).booleanValue()) {
            this.zzfaj.zzaky();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final synchronized void setAppVolume(float f) {
        com.google.android.gms.ads.internal.zzq.zzko().setAppVolume(f);
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final synchronized float zzos() {
        return com.google.android.gms.ads.internal.zzq.zzko().zzos();
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final synchronized void setAppMuted(boolean z) {
        com.google.android.gms.ads.internal.zzq.zzko().setAppMuted(z);
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final synchronized boolean zzot() {
        return com.google.android.gms.ads.internal.zzq.zzko().zzot();
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final synchronized void zzby(String str) {
        zzza.initialize(this.zzlk);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) zzuv.zzon().zzd(zzza.zzcow)).booleanValue()) {
                com.google.android.gms.ads.internal.zzq.zzkr().zza(this.zzlk, this.zzblk, str, (Runnable) null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final void zzc(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            zzaug.zzes("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            zzaug.zzes("Context is null. Failed to open debug menu.");
            return;
        }
        zzavd zzavdVar = new zzavd(context);
        zzavdVar.setAdUnitId(str);
        zzavdVar.zzr(this.zzblk.zzblz);
        zzavdVar.showDialog();
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final void zzb(String str, IObjectWrapper iObjectWrapper) {
        zzza.initialize(this.zzlk);
        String zzadu = ((Boolean) zzuv.zzon().zzd(zzza.zzcox)).booleanValue() ? zzadu() : "";
        if (!TextUtils.isEmpty(zzadu)) {
            str = zzadu;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean booleanValue = ((Boolean) zzuv.zzon().zzd(zzza.zzcow)).booleanValue() | ((Boolean) zzuv.zzon().zzd(zzza.zzckj)).booleanValue();
        Runnable runnable = null;
        if (((Boolean) zzuv.zzon().zzd(zzza.zzckj)).booleanValue()) {
            booleanValue = true;
            final Runnable runnable2 = (Runnable) ObjectWrapper.unwrap(iObjectWrapper);
            runnable = new Runnable(this, runnable2) { // from class: com.google.android.gms.internal.ads.zzbgd
                private final zzbga zzfal;
                private final Runnable zzfam;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfal = this;
                    this.zzfam = runnable2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzaxn.zzdwm.execute(new Runnable(this.zzfal, this.zzfam) { // from class: com.google.android.gms.internal.ads.zzbgc
                        private final zzbga zzfal;
                        private final Runnable zzfam;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzfal = r1;
                            this.zzfam = r2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzfal.zzd(this.zzfam);
                        }
                    });
                }
            };
        }
        if (booleanValue) {
            com.google.android.gms.ads.internal.zzq.zzkr().zza(this.zzlk, this.zzblk, str, runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final String getVersionString() {
        return this.zzblk.zzblz;
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final void zzbz(String str) {
        this.zzfaj.zzgd(str);
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final void zza(zzajx zzajxVar) throws RemoteException {
        this.zzfah.zzb(zzajxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final void zza(zzafu zzafuVar) throws RemoteException {
        this.zzfak.zzb(zzafuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final List<zzafr> zzou() throws RemoteException {
        return this.zzfak.zzakb();
    }

    private final String zzadu() {
        Context applicationContext = this.zzlk.getApplicationContext() == null ? this.zzlk : this.zzlk.getApplicationContext();
        try {
            String string = Wrappers.packageManager(applicationContext).getApplicationInfo(applicationContext.getPackageName(), 128).metaData.getString("com.google.android.gms.ads.APPLICATION_ID");
            return TextUtils.isEmpty(string) ? "" : (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            zzaug.zza("Error getting metadata", e);
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final void zza(zzyd zzydVar) throws RemoteException {
        this.zzbnf.zza(this.zzlk, zzydVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map<String, zzajs> zzup = com.google.android.gms.ads.internal.zzq.zzkn().zzuh().zzve().zzup();
        if (zzup == null || zzup.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                zzaug.zzd("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzfah.zzakt()) {
            HashMap hashMap = new HashMap();
            for (zzajs zzajsVar : zzup.values()) {
                for (zzajt zzajtVar : zzajsVar.zzdbw) {
                    String str = zzajtVar.zzddb;
                    for (String str2 : zzajtVar.zzdct) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((Collection) hashMap.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzcgf<zzcwm, zzchn> zzd = this.zzfai.zzd(str3, jSONObject);
                    if (zzd != null) {
                        zzcwm zzcwmVar = zzd.zzddv;
                        if (!zzcwmVar.isInitialized() && zzcwmVar.zzrt()) {
                            zzcwmVar.zza(this.zzlk, zzd.zzfxg, (List) entry.getValue());
                            String valueOf = String.valueOf(str3);
                            zzaug.zzdv(valueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(valueOf) : new String("Initialized rewarded video mediation adapter "));
                        }
                    }
                } catch (zzcwh e) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 56);
                    sb.append("Failed to initialize rewarded video mediation adapter \"");
                    sb.append(str3);
                    sb.append("\"");
                    zzaug.zzd(sb.toString(), e);
                }
            }
        }
    }
}
