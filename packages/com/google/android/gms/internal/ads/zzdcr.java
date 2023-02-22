package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdce;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzdcr extends zzdce.zza {
    private final /* synthetic */ zzdcm zzgrg;
    private zzdco zzgrk;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdcr(zzdcm zzdcmVar, zzday<? extends zzddi<?>> zzdayVar, boolean z, zzdco zzdcoVar) {
        super(zzdayVar, z, false);
        this.zzgrg = zzdcmVar;
        this.zzgrk = zzdcoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdce.zza
    final void zza(boolean z, int i, @NullableDecl Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzdce.zza
    final void zzapc() {
        zzdco zzdcoVar = this.zzgrk;
        if (zzdcoVar != null) {
            zzdcoVar.execute();
        } else {
            zzdaq.checkState(this.zzgrg.isDone());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdce.zza
    public final void zzapb() {
        super.zzapb();
        this.zzgrk = null;
    }

    @Override // com.google.android.gms.internal.ads.zzdce.zza
    final void interruptTask() {
        zzdco zzdcoVar = this.zzgrk;
        if (zzdcoVar != null) {
            zzdcoVar.interruptTask();
        }
    }
}
