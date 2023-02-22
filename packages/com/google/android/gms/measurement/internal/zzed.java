package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzed extends zzge {
    private static final AtomicReference<String[]> zzjx = new AtomicReference<>();
    private static final AtomicReference<String[]> zzjy = new AtomicReference<>();
    private static final AtomicReference<String[]> zzjz = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzed(zzfj zzfjVar) {
        super(zzfjVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzge
    protected final boolean zzbk() {
        return false;
    }

    private final boolean zzgj() {
        zzae();
        return this.zzj.zzhw() && this.zzj.zzab().isLoggable(3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzaj(String str) {
        if (str == null) {
            return null;
        }
        return !zzgj() ? str : zza(str, zzgj.zzpo, zzgj.zzpn, zzjx);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzak(String str) {
        if (str == null) {
            return null;
        }
        return !zzgj() ? str : zza(str, zzgi.zzpm, zzgi.zzpl, zzjy);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzal(String str) {
        if (str == null) {
            return null;
        }
        if (zzgj()) {
            if (str.startsWith("_exp_")) {
                return "experiment_id(" + str + ")";
            }
            return zza(str, zzgl.zzpq, zzgl.zzpp, zzjz);
        }
        return str;
    }

    private static String zza(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (zzjs.zzs(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzb(zzai zzaiVar) {
        if (zzaiVar == null) {
            return null;
        }
        if (!zzgj()) {
            return zzaiVar.toString();
        }
        return "origin=" + zzaiVar.origin + ",name=" + zzaj(zzaiVar.name) + ",params=" + zzb(zzaiVar.zzfq);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zza(zzaf zzafVar) {
        if (zzafVar == null) {
            return null;
        }
        if (!zzgj()) {
            return zzafVar.toString();
        }
        return "Event{appId='" + zzafVar.zzce + "', name='" + zzaj(zzafVar.name) + "', params=" + zzb(zzafVar.zzfq) + "}";
    }

    private final String zzb(zzah zzahVar) {
        if (zzahVar == null) {
            return null;
        }
        if (!zzgj()) {
            return zzahVar.toString();
        }
        return zzc(zzahVar.zzcv());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzc(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!zzgj()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        for (String str : bundle.keySet()) {
            if (sb.length() != 0) {
                sb.append(", ");
            } else {
                sb.append("Bundle[{");
            }
            sb.append(zzak(str));
            sb.append("=");
            sb.append(bundle.get(str));
        }
        sb.append("}]");
        return sb.toString();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ void zzl() {
        super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ void zzm() {
        super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ void zzn() {
        super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ void zzo() {
        super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ zzac zzw() {
        return super.zzw();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf, com.google.android.gms.measurement.internal.zzgh
    public final /* bridge */ /* synthetic */ Clock zzx() {
        return super.zzx();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf, com.google.android.gms.measurement.internal.zzgh
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ zzed zzy() {
        return super.zzy();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ zzjs zzz() {
        return super.zzz();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf, com.google.android.gms.measurement.internal.zzgh
    public final /* bridge */ /* synthetic */ zzfc zzaa() {
        return super.zzaa();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf, com.google.android.gms.measurement.internal.zzgh
    public final /* bridge */ /* synthetic */ zzef zzab() {
        return super.zzab();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ zzeo zzac() {
        return super.zzac();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ zzs zzad() {
        return super.zzad();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf, com.google.android.gms.measurement.internal.zzgh
    public final /* bridge */ /* synthetic */ zzr zzae() {
        return super.zzae();
    }
}
