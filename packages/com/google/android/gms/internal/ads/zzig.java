package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzig {
    public byte[] iv;
    private byte[] key;
    private int mode;
    public int[] numBytesOfClearData;
    public int[] numBytesOfEncryptedData;
    private int numSubSamples;
    private int zzalv;
    private int zzalw;
    private final MediaCodec.CryptoInfo zzalx;
    private final zzii zzaly;

    public zzig() {
        this.zzalx = zzof.SDK_INT >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.zzaly = zzof.SDK_INT >= 24 ? new zzii(this.zzalx) : null;
    }

    public final void set(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.numSubSamples = i;
        this.numBytesOfClearData = iArr;
        this.numBytesOfEncryptedData = iArr2;
        this.key = bArr;
        this.iv = bArr2;
        this.mode = i2;
        this.zzalv = 0;
        this.zzalw = 0;
        if (zzof.SDK_INT >= 16) {
            this.zzalx.numSubSamples = this.numSubSamples;
            this.zzalx.numBytesOfClearData = this.numBytesOfClearData;
            this.zzalx.numBytesOfEncryptedData = this.numBytesOfEncryptedData;
            this.zzalx.key = this.key;
            this.zzalx.iv = this.iv;
            this.zzalx.mode = this.mode;
            if (zzof.SDK_INT >= 24) {
                this.zzaly.set(0, 0);
            }
        }
    }

    public final MediaCodec.CryptoInfo zzft() {
        return this.zzalx;
    }
}
