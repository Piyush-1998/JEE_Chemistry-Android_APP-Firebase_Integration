package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzco extends zzcm<Boolean> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzco(zzct zzctVar, String str, Boolean bool) {
        super(zzctVar, str, bool, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcm
    final /* synthetic */ Boolean zzc(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzbz.zzzw.matcher(str).matches()) {
                return true;
            }
            if (zzbz.zzzx.matcher(str).matches()) {
                return false;
            }
        }
        String zzrm = super.zzrm();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(zzrm).length() + 28 + String.valueOf(valueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(zzrm);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
