package com.google.android.gms.internal.ads;

import java.lang.reflect.Type;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public enum zzdqr {
    DOUBLE(0, zzdqt.SCALAR, zzdri.DOUBLE),
    FLOAT(1, zzdqt.SCALAR, zzdri.FLOAT),
    INT64(2, zzdqt.SCALAR, zzdri.LONG),
    UINT64(3, zzdqt.SCALAR, zzdri.LONG),
    INT32(4, zzdqt.SCALAR, zzdri.INT),
    FIXED64(5, zzdqt.SCALAR, zzdri.LONG),
    FIXED32(6, zzdqt.SCALAR, zzdri.INT),
    BOOL(7, zzdqt.SCALAR, zzdri.BOOLEAN),
    STRING(8, zzdqt.SCALAR, zzdri.STRING),
    MESSAGE(9, zzdqt.SCALAR, zzdri.MESSAGE),
    BYTES(10, zzdqt.SCALAR, zzdri.BYTE_STRING),
    UINT32(11, zzdqt.SCALAR, zzdri.INT),
    ENUM(12, zzdqt.SCALAR, zzdri.ENUM),
    SFIXED32(13, zzdqt.SCALAR, zzdri.INT),
    SFIXED64(14, zzdqt.SCALAR, zzdri.LONG),
    SINT32(15, zzdqt.SCALAR, zzdri.INT),
    SINT64(16, zzdqt.SCALAR, zzdri.LONG),
    GROUP(17, zzdqt.SCALAR, zzdri.MESSAGE),
    DOUBLE_LIST(18, zzdqt.VECTOR, zzdri.DOUBLE),
    FLOAT_LIST(19, zzdqt.VECTOR, zzdri.FLOAT),
    INT64_LIST(20, zzdqt.VECTOR, zzdri.LONG),
    UINT64_LIST(21, zzdqt.VECTOR, zzdri.LONG),
    INT32_LIST(22, zzdqt.VECTOR, zzdri.INT),
    FIXED64_LIST(23, zzdqt.VECTOR, zzdri.LONG),
    FIXED32_LIST(24, zzdqt.VECTOR, zzdri.INT),
    BOOL_LIST(25, zzdqt.VECTOR, zzdri.BOOLEAN),
    STRING_LIST(26, zzdqt.VECTOR, zzdri.STRING),
    MESSAGE_LIST(27, zzdqt.VECTOR, zzdri.MESSAGE),
    BYTES_LIST(28, zzdqt.VECTOR, zzdri.BYTE_STRING),
    UINT32_LIST(29, zzdqt.VECTOR, zzdri.INT),
    ENUM_LIST(30, zzdqt.VECTOR, zzdri.ENUM),
    SFIXED32_LIST(31, zzdqt.VECTOR, zzdri.INT),
    SFIXED64_LIST(32, zzdqt.VECTOR, zzdri.LONG),
    SINT32_LIST(33, zzdqt.VECTOR, zzdri.INT),
    SINT64_LIST(34, zzdqt.VECTOR, zzdri.LONG),
    DOUBLE_LIST_PACKED(35, zzdqt.PACKED_VECTOR, zzdri.DOUBLE),
    FLOAT_LIST_PACKED(36, zzdqt.PACKED_VECTOR, zzdri.FLOAT),
    INT64_LIST_PACKED(37, zzdqt.PACKED_VECTOR, zzdri.LONG),
    UINT64_LIST_PACKED(38, zzdqt.PACKED_VECTOR, zzdri.LONG),
    INT32_LIST_PACKED(39, zzdqt.PACKED_VECTOR, zzdri.INT),
    FIXED64_LIST_PACKED(40, zzdqt.PACKED_VECTOR, zzdri.LONG),
    FIXED32_LIST_PACKED(41, zzdqt.PACKED_VECTOR, zzdri.INT),
    BOOL_LIST_PACKED(42, zzdqt.PACKED_VECTOR, zzdri.BOOLEAN),
    UINT32_LIST_PACKED(43, zzdqt.PACKED_VECTOR, zzdri.INT),
    ENUM_LIST_PACKED(44, zzdqt.PACKED_VECTOR, zzdri.ENUM),
    SFIXED32_LIST_PACKED(45, zzdqt.PACKED_VECTOR, zzdri.INT),
    SFIXED64_LIST_PACKED(46, zzdqt.PACKED_VECTOR, zzdri.LONG),
    SINT32_LIST_PACKED(47, zzdqt.PACKED_VECTOR, zzdri.INT),
    SINT64_LIST_PACKED(48, zzdqt.PACKED_VECTOR, zzdri.LONG),
    GROUP_LIST(49, zzdqt.VECTOR, zzdri.MESSAGE),
    MAP(50, zzdqt.MAP, zzdri.VOID);
    
    private static final zzdqr[] zzhkb;
    private static final Type[] zzhkc = new Type[0];
    private final int id;
    private final zzdri zzhjx;
    private final zzdqt zzhjy;
    private final Class<?> zzhjz;
    private final boolean zzhka;

    zzdqr(int i, zzdqt zzdqtVar, zzdri zzdriVar) {
        int i2;
        this.id = i;
        this.zzhjy = zzdqtVar;
        this.zzhjx = zzdriVar;
        int i3 = zzdqq.zzhhw[zzdqtVar.ordinal()];
        boolean z = true;
        if (i3 == 1) {
            this.zzhjz = zzdriVar.zzbal();
        } else if (i3 == 2) {
            this.zzhjz = zzdriVar.zzbal();
        } else {
            this.zzhjz = null;
        }
        this.zzhka = (zzdqtVar != zzdqt.SCALAR || (i2 = zzdqq.zzhhx[zzdriVar.ordinal()]) == 1 || i2 == 2 || i2 == 3) ? false : false;
    }

    public final int id() {
        return this.id;
    }

    static {
        zzdqr[] values = values();
        zzhkb = new zzdqr[values.length];
        for (zzdqr zzdqrVar : values) {
            zzhkb[zzdqrVar.id] = zzdqrVar;
        }
    }
}
