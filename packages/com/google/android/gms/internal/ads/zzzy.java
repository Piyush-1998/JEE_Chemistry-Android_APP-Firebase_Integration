package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzzy {
    private final Map<String, zzzz> zzcum = new HashMap();
    private final zzaab zzcun;

    public zzzy(zzaab zzaabVar) {
        this.zzcun = zzaabVar;
    }

    public final void zza(String str, zzzz zzzzVar) {
        this.zzcum.put(str, zzzzVar);
    }

    public final void zza(String str, String str2, long j) {
        zzaab zzaabVar = this.zzcun;
        zzzz zzzzVar = this.zzcum.get(str2);
        String[] strArr = {str};
        if (zzaabVar != null && zzzzVar != null) {
            zzaabVar.zza(zzzzVar, j, strArr);
        }
        Map<String, zzzz> map = this.zzcum;
        zzaab zzaabVar2 = this.zzcun;
        map.put(str, zzaabVar2 == null ? null : zzaabVar2.zzer(j));
    }

    public final zzaab zzpy() {
        return this.zzcun;
    }
}
