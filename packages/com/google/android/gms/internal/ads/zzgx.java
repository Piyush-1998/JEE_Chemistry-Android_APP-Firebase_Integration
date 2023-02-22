package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public interface zzgx extends zzge {
    void disable();

    int getState();

    int getTrackType();

    boolean isReady();

    void setIndex(int i);

    void start() throws zzgd;

    void stop() throws zzgd;

    void zza(zzgz zzgzVar, zzgo[] zzgoVarArr, zzmd zzmdVar, long j, boolean z, long j2) throws zzgd;

    void zza(zzgo[] zzgoVarArr, zzmd zzmdVar, long j) throws zzgd;

    void zzb(long j, long j2) throws zzgd;

    void zzdi(long j) throws zzgd;

    zzgw zzdj();

    zznv zzdk();

    zzmd zzdl();

    boolean zzdm();

    void zzdn();

    boolean zzdo();

    void zzdp() throws IOException;

    boolean zzeo();
}
