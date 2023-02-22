package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdsz extends zzdta<FieldDescriptorType, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdsz(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdta
    public final void zzaxj() {
        if (!isImmutable()) {
            for (int i = 0; i < zzbbo(); i++) {
                Map.Entry<FieldDescriptorType, Object> zzgz = zzgz(i);
                if (((zzdqo) zzgz.getKey()).zzazj()) {
                    zzgz.setValue(Collections.unmodifiableList((List) zzgz.getValue()));
                }
            }
            Iterator it = zzbbp().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((zzdqo) entry.getKey()).zzazj()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzaxj();
    }
}
