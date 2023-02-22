package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzctb implements zzcru<zzctc> {
    private String packageName;
    private zzddl zzfoa;
    private zzatj zzghg;

    public zzctb(zzatj zzatjVar, zzddl zzddlVar, String str) {
        this.zzghg = zzatjVar;
        this.zzfoa = zzddlVar;
        this.packageName = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<zzctc> zzalv() {
        new zzaxv();
        final zzddi<String> zzah = zzdcy.zzah(null);
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcse)).booleanValue()) {
            zzah = this.zzghg.zzdw(this.packageName);
        }
        final zzddi<String> zzdx = this.zzghg.zzdx(this.packageName);
        return zzdcy.zza(zzah, zzdx).zza(new Callable(zzah, zzdx) { // from class: com.google.android.gms.internal.ads.zzcte
            private final zzddi zzfoe;
            private final zzddi zzfov;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfov = zzah;
                this.zzfoe = zzdx;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzctc((String) this.zzfov.get(), (String) this.zzfoe.get());
            }
        }, zzaxn.zzdwi);
    }
}
