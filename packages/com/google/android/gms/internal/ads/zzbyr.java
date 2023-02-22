package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbyr implements Callable<zzbyh> {
    private final zzbcb zzbmi;
    private final zzaxl zzdio;
    private final zzdf zzegb;
    private final Executor zzfbx;
    private final com.google.android.gms.ads.internal.zza zzfop;
    private final Context zzlk;

    public zzbyr(Context context, Executor executor, zzdf zzdfVar, zzaxl zzaxlVar, com.google.android.gms.ads.internal.zza zzaVar, zzbcb zzbcbVar) {
        this.zzlk = context;
        this.zzfbx = executor;
        this.zzegb = zzdfVar;
        this.zzdio = zzaxlVar;
        this.zzfop = zzaVar;
        this.zzbmi = zzbcbVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ zzbyh call() throws Exception {
        zzbyh zzbyhVar = new zzbyh(this);
        zzbyhVar.zzajg();
        return zzbyhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Context zza(zzbyr zzbyrVar) {
        return zzbyrVar.zzlk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Executor zzb(zzbyr zzbyrVar) {
        return zzbyrVar.zzfbx;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzdf zzc(zzbyr zzbyrVar) {
        return zzbyrVar.zzegb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzaxl zzd(zzbyr zzbyrVar) {
        return zzbyrVar.zzdio;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ com.google.android.gms.ads.internal.zza zze(zzbyr zzbyrVar) {
        return zzbyrVar.zzfop;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzbcb zzf(zzbyr zzbyrVar) {
        return zzbyrVar.zzbmi;
    }
}
