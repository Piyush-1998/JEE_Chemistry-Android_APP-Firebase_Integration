package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzchd implements zzcga<zzbrs> {
    private final zzcvp zzfbb;
    private final Executor zzfbx;
    private final zzbso zzfxy;
    private final Context zzlk;

    public zzchd(Context context, Executor executor, zzbso zzbsoVar, zzcvp zzcvpVar) {
        this.zzlk = context;
        this.zzfxy = zzbsoVar;
        this.zzfbx = executor;
        this.zzfbb = zzcvpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final boolean zza(zzcvz zzcvzVar, zzcvr zzcvrVar) {
        return (this.zzlk instanceof Activity) && PlatformVersion.isAtLeastIceCreamSandwichMR1() && zzaal.zzk(this.zzlk) && !TextUtils.isEmpty(zzc(zzcvrVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final zzddi<zzbrs> zzb(final zzcvz zzcvzVar, final zzcvr zzcvrVar) {
        String zzc = zzc(zzcvrVar);
        final Uri parse = zzc != null ? Uri.parse(zzc) : null;
        return zzdcy.zzb(zzdcy.zzah(null), new zzdcj(this, parse, zzcvzVar, zzcvrVar) { // from class: com.google.android.gms.internal.ads.zzchc
            private final zzchd zzfxu;
            private final Uri zzfxv;
            private final zzcvz zzfxw;
            private final zzcvr zzfxx;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxu = this;
                this.zzfxv = parse;
                this.zzfxw = zzcvzVar;
                this.zzfxx = zzcvrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                return this.zzfxu.zza(this.zzfxv, this.zzfxw, this.zzfxx, obj);
            }
        }, this.zzfbx);
    }

    private static String zzc(zzcvr zzcvrVar) {
        try {
            return zzcvrVar.zzgjh.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzddi zza(Uri uri, zzcvz zzcvzVar, zzcvr zzcvrVar, Object obj) throws Exception {
        try {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            build.intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzd zzdVar = new com.google.android.gms.ads.internal.overlay.zzd(build.intent);
            final zzaxv zzaxvVar = new zzaxv();
            zzbru zza = this.zzfxy.zza(new zzbla(zzcvzVar, zzcvrVar, null), new zzbrx(new zzbsu(zzaxvVar) { // from class: com.google.android.gms.internal.ads.zzchf
                private final zzaxv zzbrt;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzbrt = zzaxvVar;
                }

                @Override // com.google.android.gms.internal.ads.zzbsu
                public final void zza(boolean z, Context context) {
                    zzaxv zzaxvVar2 = this.zzbrt;
                    try {
                        com.google.android.gms.ads.internal.zzq.zzki();
                        com.google.android.gms.ads.internal.overlay.zzn.zza(context, (AdOverlayInfoParcel) zzaxvVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }));
            zzaxvVar.set(new AdOverlayInfoParcel(zzdVar, null, zza.zzadi(), null, new zzaxl(0, 0, false)));
            this.zzfbb.zzud();
            return zzdcy.zzah(zza.zzadh());
        } catch (Throwable th) {
            zzaug.zzc("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
