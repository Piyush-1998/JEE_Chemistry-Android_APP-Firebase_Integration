package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzcob implements zzcru<zzcrr<Bundle>> {
    private final Set<String> zzgef;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcob(Set<String> set) {
        this.zzgef = set;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<zzcrr<Bundle>> zzalv() {
        final ArrayList arrayList = new ArrayList();
        for (String str : this.zzgef) {
            arrayList.add(str);
        }
        return zzdcy.zzah(new zzcrr(arrayList) { // from class: com.google.android.gms.internal.ads.zzcoe
            private final ArrayList zzgei;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgei = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzcrr
            public final void zzr(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", this.zzgei);
            }
        });
    }
}
