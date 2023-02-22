package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbni extends zzbpm<zzbnj> {
    private boolean zzfha;

    public zzbni(Set<zzbqs<zzbnj>> set) {
        super(set);
        this.zzfha = false;
    }

    public final synchronized void onAdImpression() {
        if (!this.zzfha) {
            zza(zzbnh.zzfgz);
            this.zzfha = true;
        }
    }
}
