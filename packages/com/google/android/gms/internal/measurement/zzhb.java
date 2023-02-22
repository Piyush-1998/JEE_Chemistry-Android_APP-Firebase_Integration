package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhb extends zzhc<FieldDescriptorType, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhb(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzhc
    public final void zzry() {
        if (!isImmutable()) {
            for (int i = 0; i < zzwh(); i++) {
                Map.Entry<FieldDescriptorType, Object> zzcf = zzcf(i);
                if (((zzeq) zzcf.getKey()).zzty()) {
                    zzcf.setValue(Collections.unmodifiableList((List) zzcf.getValue()));
                }
            }
            Iterator it = zzwi().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((zzeq) entry.getKey()).zzty()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzry();
    }
}
