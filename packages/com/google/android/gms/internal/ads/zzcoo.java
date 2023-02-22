package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcoo implements zzcru<Object> {
    private static final Object lock = new Object();
    private final String zzcdr;
    private final String zzdix;
    private final zzcwe zzfga;
    private final zzblr zzgem;
    private final zzcwu zzgen;

    public zzcoo(String str, String str2, zzblr zzblrVar, zzcwu zzcwuVar, zzcwe zzcweVar) {
        this.zzdix = str;
        this.zzcdr = str2;
        this.zzgem = zzblrVar;
        this.zzgen = zzcwuVar;
        this.zzfga = zzcweVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<Object> zzalv() {
        final Bundle bundle = new Bundle();
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcrv)).booleanValue()) {
            this.zzgem.zzf(this.zzfga.zzgkg);
            bundle.putAll(this.zzgen.zzang());
        }
        return zzdcy.zzah(new zzcrr(this, bundle) { // from class: com.google.android.gms.internal.ads.zzcon
            private final Bundle zzdpx;
            private final zzcoo zzgel;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgel = this;
                this.zzdpx = bundle;
            }

            @Override // com.google.android.gms.internal.ads.zzcrr
            public final void zzr(Object obj) {
                this.zzgel.zzb(this.zzdpx, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Bundle bundle, Bundle bundle2) {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcrv)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) zzuv.zzon().zzd(zzza.zzcru)).booleanValue()) {
                synchronized (lock) {
                    this.zzgem.zzf(this.zzfga.zzgkg);
                    bundle2.putBundle("quality_signals", this.zzgen.zzang());
                }
            } else {
                this.zzgem.zzf(this.zzfga.zzgkg);
                bundle2.putBundle("quality_signals", this.zzgen.zzang());
            }
        }
        bundle2.putString("seq_num", this.zzdix);
        bundle2.putString("session_id", this.zzcdr);
    }
}
