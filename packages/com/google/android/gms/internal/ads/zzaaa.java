package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaaa extends zzaaf {
    private final com.google.android.gms.ads.internal.zze zzcuq;
    private final String zzcur;
    private final String zzcus;

    public zzaaa(com.google.android.gms.ads.internal.zze zzeVar, String str, String str2) {
        this.zzcuq = zzeVar;
        this.zzcur = str;
        this.zzcus = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaac
    public final String zzqb() {
        return this.zzcur;
    }

    @Override // com.google.android.gms.internal.ads.zzaac
    public final String getContent() {
        return this.zzcus;
    }

    @Override // com.google.android.gms.internal.ads.zzaac
    public final void zzs(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return;
        }
        this.zzcuq.zzg((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzaac
    public final void recordClick() {
        this.zzcuq.zzjl();
    }

    @Override // com.google.android.gms.internal.ads.zzaac
    public final void recordImpression() {
        this.zzcuq.zzjm();
    }
}
