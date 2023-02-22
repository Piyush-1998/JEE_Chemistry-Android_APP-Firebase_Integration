package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzavz extends zzav {
    private final /* synthetic */ byte[] zzdul;
    private final /* synthetic */ Map zzdum;
    private final /* synthetic */ zzaxc zzdun;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzavz(zzavy zzavyVar, int i, String str, zzab zzabVar, zzy zzyVar, byte[] bArr, Map map, zzaxc zzaxcVar) {
        super(i, str, zzabVar, zzyVar);
        this.zzdul = bArr;
        this.zzdum = map;
        this.zzdun = zzaxcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzq
    public final byte[] zzf() throws zzb {
        byte[] bArr = this.zzdul;
        return bArr == null ? super.zzf() : bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzq
    public final Map<String, String> getHeaders() throws zzb {
        Map<String, String> map = this.zzdum;
        return map == null ? super.getHeaders() : map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzav
    public final void zzh(String str) {
        this.zzdun.zzep(str);
        super.zza(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzav, com.google.android.gms.internal.ads.zzq
    public final /* synthetic */ void zza(String str) {
        zza(str);
    }
}
