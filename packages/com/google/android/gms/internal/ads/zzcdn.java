package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcdn implements zzdwb<List<String>> {
    private static final zzcdn zzful = new zzcdn();

    public static zzcdn zzakg() {
        return zzful;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (List) zzdwh.zza(zzza.zzpr(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
