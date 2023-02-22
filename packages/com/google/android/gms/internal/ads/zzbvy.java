package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbvy implements zzbnj {
    private final zzbur zzfjl;
    private final zzbuv zzfkr;

    public zzbvy(zzbur zzburVar, zzbuv zzbuvVar) {
        this.zzfjl = zzburVar;
        this.zzfkr = zzbuvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void onAdImpression() {
        if (this.zzfjl.zzahw() == null) {
            return;
        }
        zzbbw zzahv = this.zzfjl.zzahv();
        zzbbw zzahu = this.zzfjl.zzahu();
        if (zzahv == null) {
            zzahv = zzahu != null ? zzahu : null;
        }
        if (!this.zzfkr.zzahl() || zzahv == null) {
            return;
        }
        zzahv.zza("onSdkImpression", new ArrayMap());
    }
}
