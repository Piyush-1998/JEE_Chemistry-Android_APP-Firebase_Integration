package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzbfx {
    private zza zzezz;

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static abstract class zza {
        public abstract zzbbf zzabu();

        public abstract zzayt zzabv();

        public abstract zzsi zzabw();

        public abstract zzask zzabx();
    }

    public zzbfx(zza zzaVar) {
        this.zzezz = zzaVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.zzasb, com.google.android.gms.internal.ads.zzash] */
    public final com.google.android.gms.ads.internal.zza zzads() {
        zza zzaVar = this.zzezz;
        return new com.google.android.gms.ads.internal.zza(zzaVar.zzabu(), zzaVar.zzabv(), new zzasb(zzaVar.zzabx()), zzaVar.zzabw());
    }

    public final zzask zzabx() {
        return this.zzezz.zzabx();
    }
}
