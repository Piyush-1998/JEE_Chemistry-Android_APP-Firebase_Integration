package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzbmk {
    private final zzcwe zzfga;
    private Bundle zzfgs;
    private final String zzfgt;
    private final zzcwc zzfgu;
    private final Context zzlk;

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static class zza {
        private zzcwe zzfga;
        private Bundle zzfgs;
        private String zzfgt;
        private zzcwc zzfgu;
        private Context zzlk;

        public final zza zzby(Context context) {
            this.zzlk = context;
            return this;
        }

        public final zza zza(zzcwe zzcweVar) {
            this.zzfga = zzcweVar;
            return this;
        }

        public final zza zze(Bundle bundle) {
            this.zzfgs = bundle;
            return this;
        }

        public final zza zzfn(String str) {
            this.zzfgt = str;
            return this;
        }

        public final zzbmk zzafy() {
            return new zzbmk(this);
        }

        public final zza zza(zzcwc zzcwcVar) {
            this.zzfgu = zzcwcVar;
            return this;
        }
    }

    private zzbmk(zza zzaVar) {
        this.zzlk = zzaVar.zzlk;
        this.zzfga = zzaVar.zzfga;
        this.zzfgs = zzaVar.zzfgs;
        this.zzfgt = zzaVar.zzfgt;
        this.zzfgu = zzaVar.zzfgu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zza zzaft() {
        return new zza().zzby(this.zzlk).zza(this.zzfga).zzfn(this.zzfgt).zze(this.zzfgs);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzcwe zzafu() {
        return this.zzfga;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzcwc zzafv() {
        return this.zzfgu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle zzafw() {
        return this.zzfgs;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzafx() {
        return this.zzfgt;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context zzbx(Context context) {
        return this.zzfgt != null ? context : this.zzlk;
    }
}
