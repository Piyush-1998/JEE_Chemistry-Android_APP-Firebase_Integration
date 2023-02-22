package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzz;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaz extends zzz.zzb {
    private final /* synthetic */ zzz zzaa;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzgn zzbk;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaz(zzz zzzVar, com.google.android.gms.measurement.internal.zzgn zzgnVar) {
        super(zzzVar);
        this.zzaa = zzzVar;
        this.zzbk = zzgnVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzz.zzb
    final void zzf() throws RemoteException {
        List list;
        Pair pair;
        zzk zzkVar;
        List list2;
        String str;
        List list3;
        List list4;
        int i = 0;
        while (true) {
            list = this.zzaa.zzaf;
            if (i >= list.size()) {
                pair = null;
                break;
            }
            com.google.android.gms.measurement.internal.zzgn zzgnVar = this.zzbk;
            list3 = this.zzaa.zzaf;
            if (zzgnVar.equals(((Pair) list3.get(i)).first)) {
                list4 = this.zzaa.zzaf;
                pair = (Pair) list4.get(i);
                break;
            }
            i++;
        }
        if (pair == null) {
            str = this.zzaa.zzu;
            Log.w(str, "OnEventListener had not been registered.");
            return;
        }
        zzkVar = this.zzaa.zzar;
        zzkVar.unregisterOnMeasurementEventListener((zzq) pair.second);
        list2 = this.zzaa.zzaf;
        list2.remove(pair);
    }
}
