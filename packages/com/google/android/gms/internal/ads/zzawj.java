package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzawj {
    private Map<Integer, Bitmap> zzduu = new ConcurrentHashMap();
    private AtomicInteger zzduv = new AtomicInteger(0);

    public final Bitmap zza(Integer num) {
        return this.zzduu.get(num);
    }
}
