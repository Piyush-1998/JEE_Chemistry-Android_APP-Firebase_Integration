package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzji implements zzel {
    private final /* synthetic */ String zztk;
    private final /* synthetic */ zzjg zztl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzji(zzjg zzjgVar, String str) {
        this.zztl = zzjgVar;
        this.zztk = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    public final void zza(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.zztl.zza(i, th, bArr, this.zztk);
    }
}
