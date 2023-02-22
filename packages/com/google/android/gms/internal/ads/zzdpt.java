package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
final class zzdpt extends zzdpw {
    private final int zzhgf;
    private final int zzhgg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdpt(byte[] bArr, int i, int i2) {
        super(bArr);
        zzh(i, i + i2, bArr.length);
        this.zzhgf = i;
        this.zzhgg = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzdpw, com.google.android.gms.internal.ads.zzdpm
    public final byte zzfm(int i) {
        int size = size();
        if (((size - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(22);
                sb.append("Index < 0: ");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Index > length: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(size);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        return this.zzhgi[this.zzhgf + i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdpw, com.google.android.gms.internal.ads.zzdpm
    public final byte zzfn(int i) {
        return this.zzhgi[this.zzhgf + i];
    }

    @Override // com.google.android.gms.internal.ads.zzdpw, com.google.android.gms.internal.ads.zzdpm
    public final int size() {
        return this.zzhgg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdpw
    public final int zzaxr() {
        return this.zzhgf;
    }

    @Override // com.google.android.gms.internal.ads.zzdpw, com.google.android.gms.internal.ads.zzdpm
    protected final void zza(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzhgi, zzaxr(), bArr, 0, i3);
    }
}
