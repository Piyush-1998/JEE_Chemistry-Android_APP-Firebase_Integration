package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzbul implements Runnable {
    private final zzbuz zzfla;

    private zzbul(zzbuz zzbuzVar) {
        this.zzfla = zzbuzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzbuz zzbuzVar) {
        return new zzbul(zzbuzVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzfla.zzahf();
    }
}
