package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdmm {
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    public static byte[] decode(String str) {
        byte[] bytes = str.getBytes(UTF_8);
        int length = bytes.length;
        zzdmo zzdmoVar = new zzdmo(2, new byte[(length * 3) / 4]);
        if (!zzdmoVar.zzb(bytes, 0, length, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        if (zzdmoVar.zzhbk == zzdmoVar.zzhbj.length) {
            return zzdmoVar.zzhbj;
        }
        byte[] bArr = new byte[zzdmoVar.zzhbk];
        System.arraycopy(zzdmoVar.zzhbj, 0, bArr, 0, zzdmoVar.zzhbk);
        return bArr;
    }
}
