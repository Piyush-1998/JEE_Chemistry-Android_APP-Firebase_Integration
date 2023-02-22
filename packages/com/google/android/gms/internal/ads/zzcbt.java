package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcbt {
    private List<Map<String, String>> zzfsk = new ArrayList();
    private boolean zzfsl = false;
    private boolean zzfsm = false;
    private String zzfsn;
    private zzcbo zzfso;

    public zzcbt(String str, zzcbo zzcboVar) {
        this.zzfsn = str;
        this.zzfso = zzcboVar;
    }

    public final synchronized void zzfy(String str) {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcmt)).booleanValue()) {
            Map<String, String> zzajz = zzajz();
            zzajz.put("action", "adapter_init_started");
            zzajz.put("ancn", str);
            this.zzfsk.add(zzajz);
        }
    }

    public final synchronized void zzfz(String str) {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcmt)).booleanValue()) {
            Map<String, String> zzajz = zzajz();
            zzajz.put("action", "adapter_init_finished");
            zzajz.put("ancn", str);
            this.zzfsk.add(zzajz);
        }
    }

    public final synchronized void zzr(String str, String str2) {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcmt)).booleanValue()) {
            Map<String, String> zzajz = zzajz();
            zzajz.put("action", "adapter_init_finished");
            zzajz.put("ancn", str);
            zzajz.put("rqe", str2);
            this.zzfsk.add(zzajz);
        }
    }

    public final synchronized void zzajx() {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcmt)).booleanValue()) {
            if (!this.zzfsl) {
                Map<String, String> zzajz = zzajz();
                zzajz.put("action", "init_started");
                this.zzfsk.add(zzajz);
                this.zzfsl = true;
            }
        }
    }

    public final synchronized void zzajy() {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcmt)).booleanValue()) {
            if (!this.zzfsm) {
                Map<String, String> zzajz = zzajz();
                zzajz.put("action", "init_finished");
                this.zzfsk.add(zzajz);
                for (Map<String, String> map : this.zzfsk) {
                    this.zzfso.zzm(map);
                }
                this.zzfsm = true;
            }
        }
    }

    private final Map<String, String> zzajz() {
        Map<String, String> zzajv = this.zzfso.zzajv();
        zzajv.put("tms", Long.toString(com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime(), 10));
        zzajv.put("tid", this.zzfsn);
        return zzajv;
    }
}
