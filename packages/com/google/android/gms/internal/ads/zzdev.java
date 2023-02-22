package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdjx;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdev<P> {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final Class<P> zzgsl;
    private ConcurrentMap<String, List<zzdeu<P>>> zzgsv = new ConcurrentHashMap();
    private zzdeu<P> zzgsw;

    public final zzdeu<P> zzapv() {
        return this.zzgsw;
    }

    private zzdev(Class<P> cls) {
        this.zzgsl = cls;
    }

    public static <P> zzdev<P> zza(Class<P> cls) {
        return new zzdev<>(cls);
    }

    public final void zza(zzdeu<P> zzdeuVar) {
        if (zzdeuVar == null) {
            throw new IllegalArgumentException("the primary entry must be non-null");
        }
        if (zzdeuVar.zzaps() != zzdjr.ENABLED) {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        }
        List<zzdeu<P>> list = this.zzgsv.get(new String(zzdeuVar.zzapu(), UTF_8));
        if (list == null) {
            list = Collections.emptyList();
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
        this.zzgsw = zzdeuVar;
    }

    public final zzdeu<P> zza(P p, zzdjx.zza zzaVar) throws GeneralSecurityException {
        byte[] array;
        if (zzaVar.zzaps() != zzdjr.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        int i = zzdeg.zzgsh[zzaVar.zzapt().ordinal()];
        if (i == 1 || i == 2) {
            array = ByteBuffer.allocate(5).put((byte) 0).putInt(zzaVar.zzaup()).array();
        } else if (i == 3) {
            array = ByteBuffer.allocate(5).put((byte) 1).putInt(zzaVar.zzaup()).array();
        } else if (i == 4) {
            array = zzdeh.zzgsi;
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        zzdeu<P> zzdeuVar = new zzdeu<>(p, array, zzaVar.zzaps(), zzaVar.zzapt());
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzdeuVar);
        String str = new String(zzdeuVar.zzapu(), UTF_8);
        List<zzdeu<P>> put = this.zzgsv.put(str, Collections.unmodifiableList(arrayList));
        if (put != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(put);
            arrayList2.add(zzdeuVar);
            this.zzgsv.put(str, Collections.unmodifiableList(arrayList2));
        }
        return zzdeuVar;
    }

    public final Class<P> zzapo() {
        return this.zzgsl;
    }
}
