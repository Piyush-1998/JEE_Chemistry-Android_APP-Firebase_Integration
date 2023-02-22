package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzon {
    public final List<byte[]> zzafe;
    public final int zzaqq;

    public static zzon zzh(zzoc zzocVar) throws zzgv {
        try {
            zzocVar.zzbh(21);
            int readUnsignedByte = zzocVar.readUnsignedByte() & 3;
            int readUnsignedByte2 = zzocVar.readUnsignedByte();
            int position = zzocVar.getPosition();
            int i = 0;
            for (int i2 = 0; i2 < readUnsignedByte2; i2++) {
                zzocVar.zzbh(1);
                int readUnsignedShort = zzocVar.readUnsignedShort();
                for (int i3 = 0; i3 < readUnsignedShort; i3++) {
                    int readUnsignedShort2 = zzocVar.readUnsignedShort();
                    i += readUnsignedShort2 + 4;
                    zzocVar.zzbh(readUnsignedShort2);
                }
            }
            zzocVar.zzbg(position);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < readUnsignedByte2; i5++) {
                zzocVar.zzbh(1);
                int readUnsignedShort3 = zzocVar.readUnsignedShort();
                for (int i6 = 0; i6 < readUnsignedShort3; i6++) {
                    int readUnsignedShort4 = zzocVar.readUnsignedShort();
                    System.arraycopy(zznx.zzbfz, 0, bArr, i4, zznx.zzbfz.length);
                    int length = i4 + zznx.zzbfz.length;
                    System.arraycopy(zzocVar.data, zzocVar.getPosition(), bArr, length, readUnsignedShort4);
                    i4 = length + readUnsignedShort4;
                    zzocVar.zzbh(readUnsignedShort4);
                }
            }
            return new zzon(i == 0 ? null : Collections.singletonList(bArr), readUnsignedByte + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzgv("Error parsing HEVC config", e);
        }
    }

    private zzon(List<byte[]> list, int i) {
        this.zzafe = list;
        this.zzaqq = i;
    }
}
