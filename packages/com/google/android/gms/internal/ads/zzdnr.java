package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdnr implements zzdec {
    private final zzdof zzhdr;
    private final zzdet zzhds;
    private final int zzhdt;

    public zzdnr(zzdof zzdofVar, zzdet zzdetVar, int i) {
        this.zzhdr = zzdofVar;
        this.zzhds = zzdetVar;
        this.zzhdt = i;
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzo = this.zzhdr.zzo(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return zzdmn.zza(zzo, this.zzhds.zzk(zzdmn.zza(bArr2, zzo, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }
}
