package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzafk implements zzdcj<zzafj, ParcelFileDescriptor> {
    private final /* synthetic */ zzafd zzcyk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafk(zzafl zzaflVar, zzafd zzafdVar) {
        this.zzcyk = zzafdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final /* synthetic */ zzddi<ParcelFileDescriptor> zzf(zzafj zzafjVar) throws Exception {
        zzaxv zzaxvVar = new zzaxv();
        zzafjVar.zza(this.zzcyk, new zzafn(this, zzaxvVar));
        return zzaxvVar;
    }
}
