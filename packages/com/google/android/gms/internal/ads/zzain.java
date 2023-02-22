package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzain implements zzagv, zzaik {
    private final zzail zzdas;
    private final HashSet<AbstractMap.SimpleEntry<String, zzaer<? super zzail>>> zzdat = new HashSet<>();

    public zzain(zzail zzailVar) {
        this.zzdas = zzailVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagn
    public final void zza(String str, Map map) {
        zzagu.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final void zza(String str, JSONObject jSONObject) {
        zzagu.zza(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzagv, com.google.android.gms.internal.ads.zzagn
    public final void zzb(String str, JSONObject jSONObject) {
        zzagu.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzagv
    public final void zzk(String str, String str2) {
        zzagu.zza(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzagv, com.google.android.gms.internal.ads.zzahk
    public final void zzct(String str) {
        this.zzdas.zzct(str);
    }

    @Override // com.google.android.gms.internal.ads.zzail
    public final void zza(String str, zzaer<? super zzail> zzaerVar) {
        this.zzdas.zza(str, zzaerVar);
        this.zzdat.add(new AbstractMap.SimpleEntry<>(str, zzaerVar));
    }

    @Override // com.google.android.gms.internal.ads.zzail
    public final void zzb(String str, zzaer<? super zzail> zzaerVar) {
        this.zzdas.zzb(str, zzaerVar);
        this.zzdat.remove(new AbstractMap.SimpleEntry(str, zzaerVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaik
    public final void zzrk() {
        Iterator<AbstractMap.SimpleEntry<String, zzaer<? super zzail>>> it = this.zzdat.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry<String, zzaer<? super zzail>> next = it.next();
            String valueOf = String.valueOf(next.getValue().toString());
            zzaug.zzdy(valueOf.length() != 0 ? "Unregistering eventhandler: ".concat(valueOf) : new String("Unregistering eventhandler: "));
            this.zzdas.zzb(next.getKey(), next.getValue());
        }
        this.zzdat.clear();
    }
}
