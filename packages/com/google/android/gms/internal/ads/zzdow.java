package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzdow extends zzdmp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdow(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdmp
    public final int zzawv() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.zzdmp
    final int[] zzb(int[] iArr, int i) {
        if (iArr.length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length << 5)));
        }
        int[] iArr2 = new int[16];
        zzdmp.zza(r0, this.zzhbp);
        int[] iArr3 = {0, 0, 0, 0, iArr3[12], iArr3[13], iArr3[14], iArr3[15], 0, 0, 0, 0, iArr[0], iArr[1], iArr[2], iArr[3]};
        zzdmp.zzc(iArr3);
        zzdmp.zza(iArr2, Arrays.copyOf(iArr3, 8));
        iArr2[12] = i;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
