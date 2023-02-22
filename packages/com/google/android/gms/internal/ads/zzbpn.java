package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.common.util.Clock;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzbpn {
    private final Set<zzbqs<zztp>> zzfhk;
    private final Set<zzbqs<zzbna>> zzfhl;
    private final Set<zzbqs<zzbnj>> zzfhm;
    private final Set<zzbqs<zzbol>> zzfhn;
    private final Set<zzbqs<zzbog>> zzfho;
    private final Set<zzbqs<zzbnb>> zzfhp;
    private final Set<zzbqs<zzbnf>> zzfhq;
    private final Set<zzbqs<AdMetadataListener>> zzfhr;
    private final Set<zzbqs<AppEventListener>> zzfhs;
    private zzbmz zzfht;
    private zzcjf zzfhu;

    private zzbpn(zza zzaVar) {
        this.zzfhk = zzaVar.zzfhk;
        this.zzfhm = zzaVar.zzfhm;
        this.zzfhn = zzaVar.zzfhn;
        this.zzfhl = zzaVar.zzfhl;
        this.zzfho = zzaVar.zzfho;
        this.zzfhp = zzaVar.zzfhp;
        this.zzfhq = zzaVar.zzfhq;
        this.zzfhr = zzaVar.zzfhr;
        this.zzfhs = zzaVar.zzfhs;
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static class zza {
        private Set<zzbqs<zztp>> zzfhk = new HashSet();
        private Set<zzbqs<zzbna>> zzfhl = new HashSet();
        private Set<zzbqs<zzbnj>> zzfhm = new HashSet();
        private Set<zzbqs<zzbol>> zzfhn = new HashSet();
        private Set<zzbqs<zzbog>> zzfho = new HashSet();
        private Set<zzbqs<zzbnb>> zzfhp = new HashSet();
        private Set<zzbqs<AdMetadataListener>> zzfhr = new HashSet();
        private Set<zzbqs<AppEventListener>> zzfhs = new HashSet();
        private Set<zzbqs<zzbnf>> zzfhq = new HashSet();

        public final zza zza(zzbna zzbnaVar, Executor executor) {
            this.zzfhl.add(new zzbqs<>(zzbnaVar, executor));
            return this;
        }

        public final zza zza(zzbog zzbogVar, Executor executor) {
            this.zzfho.add(new zzbqs<>(zzbogVar, executor));
            return this;
        }

        public final zza zza(zzbnb zzbnbVar, Executor executor) {
            this.zzfhp.add(new zzbqs<>(zzbnbVar, executor));
            return this;
        }

        public final zza zza(zzbnf zzbnfVar, Executor executor) {
            this.zzfhq.add(new zzbqs<>(zzbnfVar, executor));
            return this;
        }

        public final zza zza(AdMetadataListener adMetadataListener, Executor executor) {
            this.zzfhr.add(new zzbqs<>(adMetadataListener, executor));
            return this;
        }

        public final zza zza(AppEventListener appEventListener, Executor executor) {
            this.zzfhs.add(new zzbqs<>(appEventListener, executor));
            return this;
        }

        public final zza zza(zzvt zzvtVar, Executor executor) {
            if (this.zzfhs != null) {
                zzcml zzcmlVar = new zzcml();
                zzcmlVar.zzb(zzvtVar);
                this.zzfhs.add(new zzbqs<>(zzcmlVar, executor));
            }
            return this;
        }

        public final zza zza(zztp zztpVar, Executor executor) {
            this.zzfhk.add(new zzbqs<>(zztpVar, executor));
            return this;
        }

        public final zza zza(zzbnj zzbnjVar, Executor executor) {
            this.zzfhm.add(new zzbqs<>(zzbnjVar, executor));
            return this;
        }

        public final zza zza(zzbol zzbolVar, Executor executor) {
            this.zzfhn.add(new zzbqs<>(zzbolVar, executor));
            return this;
        }

        public final zzbpn zzagm() {
            return new zzbpn(this);
        }
    }

    public final Set<zzbqs<zzbna>> zzagd() {
        return this.zzfhl;
    }

    public final Set<zzbqs<zzbog>> zzage() {
        return this.zzfho;
    }

    public final Set<zzbqs<zzbnb>> zzagf() {
        return this.zzfhp;
    }

    public final Set<zzbqs<zzbnf>> zzagg() {
        return this.zzfhq;
    }

    public final Set<zzbqs<AdMetadataListener>> zzagh() {
        return this.zzfhr;
    }

    public final Set<zzbqs<AppEventListener>> zzagi() {
        return this.zzfhs;
    }

    public final Set<zzbqs<zztp>> zzagj() {
        return this.zzfhk;
    }

    public final Set<zzbqs<zzbnj>> zzagk() {
        return this.zzfhm;
    }

    public final Set<zzbqs<zzbol>> zzagl() {
        return this.zzfhn;
    }

    public final zzbmz zzc(Set<zzbqs<zzbnb>> set) {
        if (this.zzfht == null) {
            this.zzfht = new zzbmz(set);
        }
        return this.zzfht;
    }

    public final zzcjf zza(Clock clock) {
        if (this.zzfhu == null) {
            this.zzfhu = new zzcjf(clock);
        }
        return this.zzfhu;
    }
}
