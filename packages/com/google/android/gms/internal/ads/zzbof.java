package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbof extends zzbpm<AdMetadataListener> implements zzadw {
    private Bundle zzfhd;

    public zzbof(Set<zzbqs<AdMetadataListener>> set) {
        super(set);
        this.zzfhd = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzadw
    public final synchronized void zza(String str, Bundle bundle) {
        this.zzfhd.putAll(bundle);
        zza(zzboi.zzfgz);
    }

    public final synchronized Bundle getAdMetadata() {
        return new Bundle(this.zzfhd);
    }
}
