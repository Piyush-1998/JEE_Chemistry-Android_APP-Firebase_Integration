package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzhr extends zzhp<zzhs, zzhs> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhp
    public final boolean zza(zzgy zzgyVar) {
        return false;
    }

    private static void zza(Object obj, zzhs zzhsVar) {
        ((zzey) obj).zzahz = zzhsVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhp
    public final void zzj(Object obj) {
        ((zzey) obj).zzahz.zzry();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhp
    public final /* synthetic */ int zzt(zzhs zzhsVar) {
        return zzhsVar.zzuk();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhp
    public final /* synthetic */ int zzz(zzhs zzhsVar) {
        return zzhsVar.zzws();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhp
    public final /* synthetic */ zzhs zzg(zzhs zzhsVar, zzhs zzhsVar2) {
        zzhs zzhsVar3 = zzhsVar;
        zzhs zzhsVar4 = zzhsVar2;
        return zzhsVar4.equals(zzhs.zzwq()) ? zzhsVar3 : zzhs.zza(zzhsVar3, zzhsVar4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhp
    public final /* synthetic */ void zzc(zzhs zzhsVar, zzim zzimVar) throws IOException {
        zzhsVar.zza(zzimVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhp
    public final /* synthetic */ void zza(zzhs zzhsVar, zzim zzimVar) throws IOException {
        zzhsVar.zzb(zzimVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhp
    public final /* synthetic */ void zzf(Object obj, zzhs zzhsVar) {
        zza(obj, zzhsVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhp
    public final /* synthetic */ zzhs zzy(Object obj) {
        zzhs zzhsVar = ((zzey) obj).zzahz;
        if (zzhsVar == zzhs.zzwq()) {
            zzhs zzwr = zzhs.zzwr();
            zza(obj, zzwr);
            return zzwr;
        }
        return zzhsVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhp
    public final /* synthetic */ zzhs zzx(Object obj) {
        return ((zzey) obj).zzahz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhp
    public final /* synthetic */ void zze(Object obj, zzhs zzhsVar) {
        zza(obj, zzhsVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzhp
    final /* synthetic */ zzhs zzp(zzhs zzhsVar) {
        zzhs zzhsVar2 = zzhsVar;
        zzhsVar2.zzry();
        return zzhsVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhp
    public final /* synthetic */ zzhs zzwp() {
        return zzhs.zzwr();
    }

    @Override // com.google.android.gms.internal.measurement.zzhp
    final /* synthetic */ void zza(zzhs zzhsVar, int i, zzhs zzhsVar2) {
        zzhsVar.zzb((i << 3) | 3, zzhsVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhp
    public final /* synthetic */ void zza(zzhs zzhsVar, int i, zzdp zzdpVar) {
        zzhsVar.zzb((i << 3) | 2, zzdpVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzhp
    final /* synthetic */ void zzb(zzhs zzhsVar, int i, long j) {
        zzhsVar.zzb((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.measurement.zzhp
    final /* synthetic */ void zzc(zzhs zzhsVar, int i, int i2) {
        zzhsVar.zzb((i << 3) | 5, Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhp
    public final /* synthetic */ void zza(zzhs zzhsVar, int i, long j) {
        zzhsVar.zzb(i << 3, Long.valueOf(j));
    }
}
