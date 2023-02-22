package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzct {
    private final String zzabg;
    private final Uri zzabh;
    private final String zzabi;
    private final String zzabj;
    private final boolean zzabk;
    private final boolean zzabl;
    private final boolean zzabm;
    private final boolean zzabn;
    @Nullable
    private final zzcx<Context, Boolean> zzabo;

    public zzct(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private zzct(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, @Nullable zzcx<Context, Boolean> zzcxVar) {
        this.zzabg = null;
        this.zzabh = uri;
        this.zzabi = str2;
        this.zzabj = str3;
        this.zzabk = false;
        this.zzabl = false;
        this.zzabm = false;
        this.zzabn = false;
        this.zzabo = null;
    }

    public final zzcm<Long> zze(String str, long j) {
        return zzcm.zzb(this, str, j);
    }

    public final zzcm<Boolean> zzb(String str, boolean z) {
        return zzcm.zzb(this, str, z);
    }

    public final zzcm<Double> zza(String str, double d) {
        return zzcm.zzb(this, str, -3.0d);
    }

    public final zzcm<String> zzt(String str, String str2) {
        return zzcm.zzb(this, str, str2);
    }
}
