package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzlo {
    private final zziy zzapk;
    private final zziw[] zzbaz;
    private zziw zzbba;

    public zzlo(zziw[] zziwVarArr, zziy zziyVar) {
        this.zzbaz = zziwVarArr;
        this.zzapk = zziyVar;
    }

    public final zziw zza(zziv zzivVar, Uri uri) throws IOException, InterruptedException {
        zziw zziwVar = this.zzbba;
        if (zziwVar != null) {
            return zziwVar;
        }
        zziw[] zziwVarArr = this.zzbaz;
        int length = zziwVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            zziw zziwVar2 = zziwVarArr[i];
            try {
            } catch (EOFException unused) {
            } finally {
                zzivVar.zzgb();
            }
            if (zziwVar2.zza(zzivVar)) {
                this.zzbba = zziwVar2;
                break;
            }
            i++;
        }
        zziw zziwVar3 = this.zzbba;
        if (zziwVar3 == null) {
            String zza = zzof.zza(this.zzbaz);
            StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 58);
            sb.append("None of the available extractors (");
            sb.append(zza);
            sb.append(") could read the stream.");
            throw new zzmj(sb.toString(), uri);
        }
        zziwVar3.zza(this.zzapk);
        return this.zzbba;
    }

    public final void release() {
        zziw zziwVar = this.zzbba;
        if (zziwVar != null) {
            zziwVar.release();
            this.zzbba = null;
        }
    }
}
