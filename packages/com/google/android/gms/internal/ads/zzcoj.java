package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzcoj implements zzdal {
    static final zzdal zzdos = new zzcoj();

    private zzcoj() {
    }

    @Override // com.google.android.gms.internal.ads.zzdal
    public final Object apply(Object obj) {
        final ArrayList arrayList = (ArrayList) obj;
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzcrr(arrayList) { // from class: com.google.android.gms.internal.ads.zzcom
            private final ArrayList zzgei;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgei = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzcrr
            public final void zzr(Object obj2) {
                ((Bundle) obj2).putStringArrayList("android_permissions", this.zzgei);
            }
        };
    }
}
