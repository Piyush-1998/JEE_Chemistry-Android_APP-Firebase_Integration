package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdcn extends zzdcl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdcn(zzdck zzdckVar, zzday<? extends zzddi<? extends V>> zzdayVar, boolean z) {
        super(zzdckVar, zzdayVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final /* synthetic */ Object zzj(List list) {
        ArrayList zzdt = zzdbl.zzdt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzdar zzdarVar = (zzdar) it.next();
            zzdt.add(zzdarVar != null ? zzdarVar.zzaof() : null);
        }
        return Collections.unmodifiableList(zzdt);
    }
}
