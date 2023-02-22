package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzbwt implements zzdal {
    static final zzdal zzdos = new zzbwt();

    private zzbwt() {
    }

    @Override // com.google.android.gms.internal.ads.zzdal
    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzaau zzaauVar : (List) obj) {
            if (zzaauVar != null) {
                arrayList.add(zzaauVar);
            }
        }
        return arrayList;
    }
}
