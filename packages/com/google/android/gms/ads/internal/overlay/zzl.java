package com.google.android.gms.ads.internal.overlay;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.ads.zzauc;
import com.google.android.gms.internal.ads.zzaul;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzl extends zzauc {
    final /* synthetic */ zzc zzdhw;

    private zzl(zzc zzcVar) {
        this.zzdhw = zzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzauc
    public final void zzsx() {
        Bitmap zza = com.google.android.gms.ads.internal.zzq.zzlc().zza(Integer.valueOf(this.zzdhw.zzdgv.zzdif.zzblb));
        if (zza != null) {
            final Drawable zza2 = com.google.android.gms.ads.internal.zzq.zzkl().zza(this.zzdhw.zzzr, zza, this.zzdhw.zzdgv.zzdif.zzbkz, this.zzdhw.zzdgv.zzdif.zzbla);
            zzaul.zzdsu.post(new Runnable(this, zza2) { // from class: com.google.android.gms.ads.internal.overlay.zzk
                private final zzl zzdhu;
                private final Drawable zzdhv;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdhu = this;
                    this.zzdhv = zza2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzl zzlVar = this.zzdhu;
                    zzlVar.zzdhw.zzzr.getWindow().setBackgroundDrawable(this.zzdhv);
                }
            });
        }
    }
}
