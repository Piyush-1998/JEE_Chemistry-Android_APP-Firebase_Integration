package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzmb implements zzdb<zzme> {
    private static zzmb zzatl = new zzmb();
    private final zzdb<zzme> zzapj;

    public static boolean zzaai() {
        return ((zzme) zzatl.get()).zzaai();
    }

    public static boolean zzaaj() {
        return ((zzme) zzatl.get()).zzaaj();
    }

    public static boolean zzaak() {
        return ((zzme) zzatl.get()).zzaak();
    }

    public static boolean zzaal() {
        return ((zzme) zzatl.get()).zzaal();
    }

    private zzmb(zzdb<zzme> zzdbVar) {
        this.zzapj = zzda.zza(zzdbVar);
    }

    public zzmb() {
        this(zzda.zzg(new zzmd()));
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final /* synthetic */ zzme get() {
        return this.zzapj.get();
    }
}
