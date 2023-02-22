package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzlv implements zzlu {
    private final zzlu[] zzbbf;
    private final ArrayList<zzlu> zzbbg;
    private zzlt zzbbh;
    private zzgy zzbbi;
    private Object zzbbj;
    private zzlx zzbbl;
    private final zzhd zzacv = new zzhd();
    private int zzbbk = -1;

    public zzlv(zzlu... zzluVarArr) {
        this.zzbbf = zzluVarArr;
        this.zzbbg = new ArrayList<>(Arrays.asList(zzluVarArr));
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    public final void zza(zzgc zzgcVar, boolean z, zzlt zzltVar) {
        this.zzbbh = zzltVar;
        int i = 0;
        while (true) {
            zzlu[] zzluVarArr = this.zzbbf;
            if (i >= zzluVarArr.length) {
                return;
            }
            zzluVarArr[i].zza(zzgcVar, false, new zzly(this, i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    public final void zzhl() throws IOException {
        zzlx zzlxVar = this.zzbbl;
        if (zzlxVar != null) {
            throw zzlxVar;
        }
        for (zzlu zzluVar : this.zzbbf) {
            zzluVar.zzhl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    public final zzls zza(int i, zznc zzncVar) {
        int length = this.zzbbf.length;
        zzls[] zzlsVarArr = new zzls[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzlsVarArr[i2] = this.zzbbf[i2].zza(i, zzncVar);
        }
        return new zzlw(zzlsVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    public final void zzb(zzls zzlsVar) {
        zzlw zzlwVar = (zzlw) zzlsVar;
        int i = 0;
        while (true) {
            zzlu[] zzluVarArr = this.zzbbf;
            if (i >= zzluVarArr.length) {
                return;
            }
            zzluVarArr[i].zzb(zzlwVar.zzbbm[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    public final void zzhm() {
        for (zzlu zzluVar : this.zzbbf) {
            zzluVar.zzhm();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i, zzgy zzgyVar, Object obj) {
        zzlx zzlxVar;
        if (this.zzbbl == null) {
            int zzep = zzgyVar.zzep();
            int i2 = 0;
            while (true) {
                if (i2 < zzep) {
                    if (zzgyVar.zza(i2, this.zzacv, false).zzagt) {
                        zzlxVar = new zzlx(0);
                        break;
                    }
                    i2++;
                } else {
                    if (this.zzbbk == -1) {
                        this.zzbbk = zzgyVar.zzeq();
                    } else if (zzgyVar.zzeq() != this.zzbbk) {
                        zzlxVar = new zzlx(1);
                    }
                    zzlxVar = null;
                }
            }
            this.zzbbl = zzlxVar;
        }
        if (this.zzbbl != null) {
            return;
        }
        this.zzbbg.remove(this.zzbbf[i]);
        if (i == 0) {
            this.zzbbi = zzgyVar;
            this.zzbbj = obj;
        }
        if (this.zzbbg.isEmpty()) {
            this.zzbbh.zzb(this.zzbbi, this.zzbbj);
        }
    }
}
