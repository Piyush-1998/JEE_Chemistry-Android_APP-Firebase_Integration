package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaua {
    private BigInteger zzdrw = BigInteger.ONE;
    private String zzdix = "0";

    public final synchronized String zzur() {
        String bigInteger;
        bigInteger = this.zzdrw.toString();
        this.zzdrw = this.zzdrw.add(BigInteger.ONE);
        this.zzdix = bigInteger;
        return bigInteger;
    }

    public final synchronized String zzus() {
        return this.zzdix;
    }
}
