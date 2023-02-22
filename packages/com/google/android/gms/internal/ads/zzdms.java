package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdms extends zzdmr {
    public zzdms(byte[] bArr) throws InvalidKeyException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzdmr
    final zzdmp zzd(byte[] bArr, int i) throws InvalidKeyException {
        return new zzdmq(bArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzdmr, com.google.android.gms.internal.ads.zzdec
    public final /* bridge */ /* synthetic */ byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return super.zzc(bArr, bArr2);
    }
}
