package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public interface zzdsv<T> {
    boolean equals(T t, T t2);

    int hashCode(T t);

    T newInstance();

    void zza(T t, zzdsw zzdswVar, zzdqj zzdqjVar) throws IOException;

    void zza(T t, zzduk zzdukVar) throws IOException;

    void zza(T t, byte[] bArr, int i, int i2, zzdpl zzdplVar) throws IOException;

    void zzak(T t);

    int zzau(T t);

    boolean zzaw(T t);

    void zzf(T t, T t2);
}
