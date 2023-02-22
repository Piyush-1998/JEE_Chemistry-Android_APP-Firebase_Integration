package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbva {
    zzacn zzfly;
    zzaci zzflz;
    zzacz zzfma;
    zzacu zzfmb;
    zzagj zzfmc;
    final SimpleArrayMap<String, zzact> zzfmd = new SimpleArrayMap<>();
    final SimpleArrayMap<String, zzaco> zzfme = new SimpleArrayMap<>();

    public final zzbva zzb(zzacn zzacnVar) {
        this.zzfly = zzacnVar;
        return this;
    }

    public final zzbva zzb(zzaci zzaciVar) {
        this.zzflz = zzaciVar;
        return this;
    }

    public final zzbva zzb(zzacz zzaczVar) {
        this.zzfma = zzaczVar;
        return this;
    }

    public final zzbva zza(zzacu zzacuVar) {
        this.zzfmb = zzacuVar;
        return this;
    }

    public final zzbva zzb(zzagj zzagjVar) {
        this.zzfmc = zzagjVar;
        return this;
    }

    public final zzbva zzb(String str, zzact zzactVar, zzaco zzacoVar) {
        this.zzfmd.put(str, zzactVar);
        this.zzfme.put(str, zzacoVar);
        return this;
    }

    public final zzbuy zzail() {
        return new zzbuy(this);
    }
}
