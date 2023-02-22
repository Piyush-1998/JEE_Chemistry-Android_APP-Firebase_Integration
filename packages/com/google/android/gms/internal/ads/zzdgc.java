package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzdgc implements zzdel {
    private final zzdev<zzdel> zzgtj;

    public zzdgc(zzdev<zzdel> zzdevVar) {
        this.zzgtj = zzdevVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzdmn.zza(this.zzgtj.zzapv().zzapu(), this.zzgtj.zzapv().zzapr().zzc(bArr, bArr2));
    }
}
