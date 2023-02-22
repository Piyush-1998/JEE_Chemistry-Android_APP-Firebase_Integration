package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzhf {
    private static final zzhf zzagz = new zzhf(new int[]{2}, 2);
    private final int[] zzaha;
    private final int zzahb;

    private zzhf(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.zzaha = copyOf;
        Arrays.sort(copyOf);
        this.zzahb = 2;
    }

    public final boolean zzp(int i) {
        return Arrays.binarySearch(this.zzaha, i) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzhf) {
            zzhf zzhfVar = (zzhf) obj;
            return Arrays.equals(this.zzaha, zzhfVar.zzaha) && this.zzahb == zzhfVar.zzahb;
        }
        return false;
    }

    public final int hashCode() {
        return this.zzahb + (Arrays.hashCode(this.zzaha) * 31);
    }

    public final String toString() {
        int i = this.zzahb;
        String arrays = Arrays.toString(this.zzaha);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
