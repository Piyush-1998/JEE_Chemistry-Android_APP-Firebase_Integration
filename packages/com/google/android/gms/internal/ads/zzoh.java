package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzoh {
    private final int height;
    private final int width;
    public final List<byte[]> zzafe;
    public final int zzaqq;
    public final float zzbgk;

    public static zzoh zzf(zzoc zzocVar) throws zzgv {
        int i;
        int i2;
        float f;
        try {
            zzocVar.zzbh(4);
            int readUnsignedByte = (zzocVar.readUnsignedByte() & 3) + 1;
            if (readUnsignedByte == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int readUnsignedByte2 = zzocVar.readUnsignedByte() & 31;
            for (int i3 = 0; i3 < readUnsignedByte2; i3++) {
                arrayList.add(zzg(zzocVar));
            }
            int readUnsignedByte3 = zzocVar.readUnsignedByte();
            for (int i4 = 0; i4 < readUnsignedByte3; i4++) {
                arrayList.add(zzg(zzocVar));
            }
            if (readUnsignedByte2 > 0) {
                zzoa zzd = zznx.zzd((byte[]) arrayList.get(0), readUnsignedByte, ((byte[]) arrayList.get(0)).length);
                int i5 = zzd.width;
                int i6 = zzd.height;
                f = zzd.zzbgk;
                i = i5;
                i2 = i6;
            } else {
                i = -1;
                i2 = -1;
                f = 1.0f;
            }
            return new zzoh(arrayList, readUnsignedByte, i, i2, f);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzgv("Error parsing AVC config", e);
        }
    }

    private zzoh(List<byte[]> list, int i, int i2, int i3, float f) {
        this.zzafe = list;
        this.zzaqq = i;
        this.width = i2;
        this.height = i3;
        this.zzbgk = f;
    }

    private static byte[] zzg(zzoc zzocVar) {
        int readUnsignedShort = zzocVar.readUnsignedShort();
        int position = zzocVar.getPosition();
        zzocVar.zzbh(readUnsignedShort);
        return zznu.zzc(zzocVar.data, position, readUnsignedShort);
    }
}
