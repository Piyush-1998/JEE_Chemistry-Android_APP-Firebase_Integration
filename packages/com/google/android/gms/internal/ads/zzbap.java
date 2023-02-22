package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbap {
    private long zzcu;

    public final long zzl(ByteBuffer byteBuffer) {
        zzbg zzbgVar;
        zzbd zzbdVar;
        long j = this.zzcu;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator<zzbb> it = new zzaz(new zzbaq(duplicate), zzbar.zzedb).zzbdc().iterator();
            while (true) {
                zzbgVar = null;
                if (!it.hasNext()) {
                    zzbdVar = null;
                    break;
                }
                zzbb next = it.next();
                if (next instanceof zzbd) {
                    zzbdVar = (zzbd) next;
                    break;
                }
            }
            Iterator<zzbb> it2 = zzbdVar.zzbdc().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzbb next2 = it2.next();
                if (next2 instanceof zzbg) {
                    zzbgVar = (zzbg) next2;
                    break;
                }
            }
            long duration = (zzbgVar.getDuration() * 1000) / zzbgVar.zzq();
            this.zzcu = duration;
            return duration;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
