package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdce;
import java.util.Collection;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
abstract class zzdcl extends zzdce.zza {
    private List<zzdar<V>> zzgrc;
    private final /* synthetic */ zzdci zzgrd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdcl(zzdci zzdciVar, zzday<? extends zzddi<? extends V>> zzdayVar, boolean z) {
        super(zzdayVar, z, true);
        List zzdt;
        this.zzgrd = zzdciVar;
        if (zzdayVar.isEmpty()) {
            zzdt = zzdbd.zzaop();
        } else {
            zzdt = zzdbl.zzdt(zzdayVar.size());
        }
        this.zzgrc = zzdt;
        for (int i = 0; i < zzdayVar.size(); i++) {
            this.zzgrc.add(null);
        }
    }

    abstract C zzj(List<zzdar<V>> list);

    @Override // com.google.android.gms.internal.ads.zzdce.zza
    final void zza(boolean z, int i, @NullableDecl V v) {
        List<zzdar<V>> list = this.zzgrc;
        if (list != 0) {
            list.set(i, zzdar.zzz(v));
        } else {
            zzdaq.checkState(z || this.zzgrd.isCancelled(), "Future was done before all dependencies completed");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdce.zza
    final void zzapc() {
        Collection collection = this.zzgrc;
        if (collection != null) {
            this.zzgrd.set(zzj(collection));
        } else {
            zzdaq.checkState(this.zzgrd.isDone());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdce.zza
    public final void zzapb() {
        super.zzapb();
        this.zzgrc = null;
    }
}
