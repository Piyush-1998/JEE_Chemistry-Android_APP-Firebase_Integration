package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdnc {
    private final zzdog zzhcj;
    private final zzdog zzhck;

    public zzdnc(byte[] bArr, byte[] bArr2) {
        this.zzhcj = zzdog.zzu(bArr);
        this.zzhck = zzdog.zzu(bArr2);
    }

    public final byte[] zzaww() {
        zzdog zzdogVar = this.zzhcj;
        if (zzdogVar == null) {
            return null;
        }
        return zzdogVar.getBytes();
    }

    public final byte[] zzawx() {
        zzdog zzdogVar = this.zzhck;
        if (zzdogVar == null) {
            return null;
        }
        return zzdogVar.getBytes();
    }
}
