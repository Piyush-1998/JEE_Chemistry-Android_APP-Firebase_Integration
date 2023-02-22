package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzcdu implements zzdcz<zzcvz> {
    private final /* synthetic */ zzcdt zzfus;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdu(zzcdt zzcdtVar) {
        this.zzfus = zzcdtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzb(Throwable th) {
        Pattern pattern;
        zzcfp zzcfpVar;
        if (((Boolean) zzuv.zzon().zzd(zzza.zzctc)).booleanValue()) {
            pattern = zzcdt.zzfur;
            Matcher matcher = pattern.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzcfpVar = this.zzfus.zzfuq;
                zzcfpVar.zzdh(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final /* synthetic */ void onSuccess(zzcvz zzcvzVar) {
        zzcfp zzcfpVar;
        zzcfp zzcfpVar2;
        zzcvz zzcvzVar2 = zzcvzVar;
        if (((Boolean) zzuv.zzon().zzd(zzza.zzctc)).booleanValue()) {
            zzcfpVar = this.zzfus.zzfuq;
            zzcfpVar.zzdh(zzcvzVar2.zzgkb.zzgjy.responseCode);
            zzcfpVar2 = this.zzfus.zzfuq;
            zzcfpVar2.zzek(zzcvzVar2.zzgkb.zzgjy.zzfvu);
        }
    }
}
