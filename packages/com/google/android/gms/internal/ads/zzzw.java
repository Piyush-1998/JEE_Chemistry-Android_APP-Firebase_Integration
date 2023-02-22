package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzzw extends zzzv {
    @Override // com.google.android.gms.internal.ads.zzzv
    public final String zzi(String str, String str2) {
        String zzcn = zzcn(str);
        String zzcn2 = zzcn(str2);
        if (TextUtils.isEmpty(zzcn)) {
            return zzcn2;
        }
        if (TextUtils.isEmpty(zzcn2)) {
            return zzcn;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(zzcn).length() + 1 + String.valueOf(zzcn2).length());
        sb.append(zzcn);
        sb.append(",");
        sb.append(zzcn2);
        return sb.toString();
    }

    private static String zzcn(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i = 0;
        int length = str.length();
        while (i < str.length() && str.charAt(i) == ',') {
            i++;
        }
        while (length > 0 && str.charAt(length - 1) == ',') {
            length--;
        }
        if (length < i) {
            return null;
        }
        return (i == 0 && length == str.length()) ? str : str.substring(i, length);
    }
}
