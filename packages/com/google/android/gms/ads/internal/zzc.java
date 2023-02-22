package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzaop;
import com.google.android.gms.internal.ads.zzasi;
import com.google.android.gms.internal.ads.zzaul;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzc {
    private boolean zzbkr;
    private zzasi zzbks;
    private zzaop zzbkt;
    private final Context zzlk;

    public zzc(Context context, zzasi zzasiVar, zzaop zzaopVar) {
        this.zzlk = context;
        this.zzbks = zzasiVar;
        this.zzbkt = null;
        if (0 == 0) {
            this.zzbkt = new zzaop();
        }
    }

    private final boolean zzjj() {
        zzasi zzasiVar = this.zzbks;
        return (zzasiVar != null && zzasiVar.zztm().zzdpb) || this.zzbkt.zzdlt;
    }

    public final void recordClick() {
        this.zzbkr = true;
    }

    public final boolean zzjk() {
        return !zzjj() || this.zzbkr;
    }

    public final void zzbl(String str) {
        if (zzjj()) {
            if (str == null) {
                str = "";
            }
            zzasi zzasiVar = this.zzbks;
            if (zzasiVar != null) {
                zzasiVar.zza(str, null, 3);
            } else if (this.zzbkt.zzdlt && this.zzbkt.zzdlu != null) {
                for (String str2 : this.zzbkt.zzdlu) {
                    if (!TextUtils.isEmpty(str2)) {
                        String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        zzq.zzkj();
                        zzaul.zzb(this.zzlk, "", replace);
                    }
                }
            }
        }
    }
}
