package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzbkk {
    protected final zzcvz zzfbd;
    protected final zzcvr zzfet;
    private final zzbnl zzffg;
    private final zzbob zzffh;
    private final String zzffi;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbkk(zzbkn zzbknVar) {
        this.zzfbd = zzbkn.zza(zzbknVar);
        this.zzfet = zzbkn.zzb(zzbknVar);
        this.zzffg = zzbkn.zzc(zzbknVar);
        this.zzffh = zzbkn.zzd(zzbknVar);
        this.zzffi = zzbkn.zze(zzbknVar);
    }

    public final zzbnl zzafm() {
        return this.zzffg;
    }

    public void zzafa() {
        this.zzffh.onAdLoaded();
    }

    public final String getMediationAdapterClassName() {
        return this.zzffi;
    }

    public final String zzju() {
        String zzb = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(this.zzffi) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(this.zzffi) ? zzb(this.zzfet) : null;
        return zzb == null ? this.zzffi : zzb;
    }

    public void destroy() {
        this.zzffg.zzbw(null);
    }

    private static String zzb(zzcvr zzcvrVar) {
        try {
            return zzcvrVar.zzgjh.getString("class_name");
        } catch (JSONException unused) {
            return null;
        }
    }
}
