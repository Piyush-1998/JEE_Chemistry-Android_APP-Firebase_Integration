package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
final class zzdtp extends zzdtn<zzdtq, zzdtq> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtn
    public final boolean zza(zzdsw zzdswVar) {
        return false;
    }

    private static void zza(Object obj, zzdtq zzdtqVar) {
        ((zzdqw) obj).zzhkr = zzdtqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtn
    public final void zzak(Object obj) {
        ((zzdqw) obj).zzhkr.zzaxj();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtn
    public final /* synthetic */ int zzau(zzdtq zzdtqVar) {
        return zzdtqVar.zzazu();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtn
    public final /* synthetic */ int zzba(zzdtq zzdtqVar) {
        return zzdtqVar.zzbbz();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtn
    public final /* synthetic */ zzdtq zzj(zzdtq zzdtqVar, zzdtq zzdtqVar2) {
        zzdtq zzdtqVar3 = zzdtqVar;
        zzdtq zzdtqVar4 = zzdtqVar2;
        return zzdtqVar4.equals(zzdtq.zzbbx()) ? zzdtqVar3 : zzdtq.zza(zzdtqVar3, zzdtqVar4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtn
    public final /* synthetic */ void zzc(zzdtq zzdtqVar, zzduk zzdukVar) throws IOException {
        zzdtqVar.zza(zzdukVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtn
    public final /* synthetic */ void zza(zzdtq zzdtqVar, zzduk zzdukVar) throws IOException {
        zzdtqVar.zzb(zzdukVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtn
    public final /* synthetic */ void zzi(Object obj, zzdtq zzdtqVar) {
        zza(obj, zzdtqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtn
    public final /* synthetic */ zzdtq zzaz(Object obj) {
        zzdtq zzdtqVar = ((zzdqw) obj).zzhkr;
        if (zzdtqVar == zzdtq.zzbbx()) {
            zzdtq zzbby = zzdtq.zzbby();
            zza(obj, zzbby);
            return zzbby;
        }
        return zzdtqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtn
    public final /* synthetic */ zzdtq zzay(Object obj) {
        return ((zzdqw) obj).zzhkr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtn
    public final /* synthetic */ void zzh(Object obj, zzdtq zzdtqVar) {
        zza(obj, zzdtqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtn
    final /* synthetic */ zzdtq zzaq(zzdtq zzdtqVar) {
        zzdtq zzdtqVar2 = zzdtqVar;
        zzdtqVar2.zzaxj();
        return zzdtqVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtn
    public final /* synthetic */ zzdtq zzbbw() {
        return zzdtq.zzbby();
    }

    @Override // com.google.android.gms.internal.ads.zzdtn
    final /* synthetic */ void zza(zzdtq zzdtqVar, int i, zzdtq zzdtqVar2) {
        zzdtqVar.zzc((i << 3) | 3, zzdtqVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtn
    public final /* synthetic */ void zza(zzdtq zzdtqVar, int i, zzdpm zzdpmVar) {
        zzdtqVar.zzc((i << 3) | 2, zzdpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtn
    final /* synthetic */ void zzb(zzdtq zzdtqVar, int i, long j) {
        zzdtqVar.zzc((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzdtn
    final /* synthetic */ void zzc(zzdtq zzdtqVar, int i, int i2) {
        zzdtqVar.zzc((i << 3) | 5, Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtn
    public final /* synthetic */ void zza(zzdtq zzdtqVar, int i, long j) {
        zzdtqVar.zzc(i << 3, Long.valueOf(j));
    }
}
