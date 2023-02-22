package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcqy implements zzcru<zzcrr<Bundle>> {
    private final String zzfgt;
    private final Context zzlk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcqy(Context context, String str) {
        this.zzlk = context;
        this.zzfgt = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<zzcrr<Bundle>> zzalv() {
        return zzdcy.zzah(this.zzfgt == null ? null : new zzcrr(this) { // from class: com.google.android.gms.internal.ads.zzcqx
            private final zzcqy zzgfq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgfq = this;
            }

            @Override // com.google.android.gms.internal.ads.zzcrr
            public final void zzr(Object obj) {
                this.zzgfq.zzo((Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(Bundle bundle) {
        bundle.putString("rewarded_sku_package", this.zzlk.getPackageName());
    }
}
