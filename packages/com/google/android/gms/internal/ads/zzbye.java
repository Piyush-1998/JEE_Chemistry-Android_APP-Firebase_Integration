package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbye implements zzaer<Object> {
    private final zzdvv<zzbyb> zzfkw;
    private final zzbyh zzfnd;
    private final zzaco zzfpn;

    public zzbye(zzbuy zzbuyVar, zzbur zzburVar, zzbyh zzbyhVar, zzdvv<zzbyb> zzdvvVar) {
        this.zzfpn = zzbuyVar.zzfv(zzburVar.getCustomTemplateId());
        this.zzfnd = zzbyhVar;
        this.zzfkw = zzdvvVar;
    }

    public final void zzajf() {
        if (this.zzfpn == null) {
            return;
        }
        this.zzfnd.zza("/nativeAdCustomClick", this);
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("asset");
        try {
            this.zzfpn.zza(this.zzfkw.get(), str);
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            zzaug.zzd(sb.toString(), e);
        }
    }
}
