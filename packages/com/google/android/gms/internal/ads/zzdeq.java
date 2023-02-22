package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdeq {
    private static final CopyOnWriteArrayList<zzder> zzgsq = new CopyOnWriteArrayList<>();

    public static zzder zzgp(String str) throws GeneralSecurityException {
        Iterator<zzder> it = zzgsq.iterator();
        while (it.hasNext()) {
            zzder next = it.next();
            if (next.zzgq(str)) {
                return next;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
