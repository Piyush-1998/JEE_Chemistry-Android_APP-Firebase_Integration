package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzawe extends zzq<zzo> {
    private final Map<String, String> zzab;
    private final zzaxv<zzo> zzdur;
    private final zzaxc zzdus;

    public zzawe(String str, zzaxv<zzo> zzaxvVar) {
        this(str, null, zzaxvVar);
    }

    private zzawe(String str, Map<String, String> map, zzaxv<zzo> zzaxvVar) {
        super(0, str, new zzawd(zzaxvVar));
        this.zzab = null;
        this.zzdur = zzaxvVar;
        zzaxc zzaxcVar = new zzaxc();
        this.zzdus = zzaxcVar;
        zzaxcVar.zza(str, "GET", null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.internal.ads.zzq
    public final zzz<zzo> zza(zzo zzoVar) {
        return zzz.zza(zzoVar, zzaq.zzb(zzoVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzq
    public final /* synthetic */ void zza(zzo zzoVar) {
        zzo zzoVar2 = zzoVar;
        this.zzdus.zza(zzoVar2.zzab, zzoVar2.statusCode);
        zzaxc zzaxcVar = this.zzdus;
        byte[] bArr = zzoVar2.data;
        if (zzaxc.isEnabled() && bArr != null) {
            zzaxcVar.zzi(bArr);
        }
        this.zzdur.set(zzoVar2);
    }
}
