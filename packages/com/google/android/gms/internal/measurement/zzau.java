package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzz;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzau extends zzz.zzb {
    private final /* synthetic */ zzz zzaa;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzgn zzbk;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzau(zzz zzzVar, com.google.android.gms.measurement.internal.zzgn zzgnVar) {
        super(zzzVar);
        this.zzaa = zzzVar;
        this.zzbk = zzgnVar;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000b */
    @Override // com.google.android.gms.internal.measurement.zzz.zzb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void zzf() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 0
        L1:
            com.google.android.gms.internal.measurement.zzz r1 = r4.zzaa
            java.util.List r1 = com.google.android.gms.internal.measurement.zzz.zzd(r1)
            int r1 = r1.size()
            if (r0 >= r1) goto L32
            com.google.android.gms.measurement.internal.zzgn r1 = r4.zzbk
            com.google.android.gms.internal.measurement.zzz r2 = r4.zzaa
            java.util.List r2 = com.google.android.gms.internal.measurement.zzz.zzd(r2)
            java.lang.Object r2 = r2.get(r0)
            android.util.Pair r2 = (android.util.Pair) r2
            java.lang.Object r2 = r2.first
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2f
            com.google.android.gms.internal.measurement.zzz r0 = r4.zzaa
            java.lang.String r0 = com.google.android.gms.internal.measurement.zzz.zzb(r0)
            java.lang.String r1 = "OnEventListener already registered."
            android.util.Log.w(r0, r1)
            return
        L2f:
            int r0 = r0 + 1
            goto L1
        L32:
            com.google.android.gms.internal.measurement.zzz$zzd r0 = new com.google.android.gms.internal.measurement.zzz$zzd
            com.google.android.gms.measurement.internal.zzgn r1 = r4.zzbk
            r0.<init>(r1)
            com.google.android.gms.internal.measurement.zzz r1 = r4.zzaa
            java.util.List r1 = com.google.android.gms.internal.measurement.zzz.zzd(r1)
            android.util.Pair r2 = new android.util.Pair
            com.google.android.gms.measurement.internal.zzgn r3 = r4.zzbk
            r2.<init>(r3, r0)
            r1.add(r2)
            com.google.android.gms.internal.measurement.zzz r1 = r4.zzaa
            com.google.android.gms.internal.measurement.zzk r1 = com.google.android.gms.internal.measurement.zzz.zzc(r1)
            r1.registerOnMeasurementEventListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzau.zzf():void");
    }
}
