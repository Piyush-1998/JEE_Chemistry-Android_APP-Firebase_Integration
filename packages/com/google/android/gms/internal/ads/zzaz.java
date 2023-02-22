package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzaz extends zzdvl implements Closeable {
    private static zzdvt zzcp = zzdvt.zzn(zzaz.class);

    public zzaz(zzdvn zzdvnVar, zzba zzbaVar) throws IOException {
        zza(zzdvnVar, zzdvnVar.size(), zzbaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdvl, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.zzhwt.close();
    }

    @Override // com.google.android.gms.internal.ads.zzdvl
    public String toString() {
        String obj = this.zzhwt.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
