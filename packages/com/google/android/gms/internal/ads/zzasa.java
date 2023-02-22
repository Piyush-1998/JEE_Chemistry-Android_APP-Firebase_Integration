package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import com.google.android.gms.internal.ads.zzdut;
import java.io.ByteArrayOutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzasa implements Runnable {
    private final /* synthetic */ Bitmap val$bitmap;
    private final /* synthetic */ zzarv zzdov;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzasa(zzarv zzarvVar, Bitmap bitmap) {
        this.zzdov = zzarvVar;
        this.val$bitmap = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        zzdve zzdveVar;
        zzdve zzdveVar2;
        zzdve zzdveVar3;
        zzdve zzdveVar4;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.val$bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        obj = this.zzdov.lock;
        synchronized (obj) {
            zzdveVar = this.zzdov.zzdoh;
            zzdveVar.zzhvm = new zzdvi();
            zzdveVar2 = this.zzdov.zzdoh;
            zzdveVar2.zzhvm.zzhwl = byteArrayOutputStream.toByteArray();
            zzdveVar3 = this.zzdov.zzdoh;
            zzdveVar3.zzhvm.mimeType = "image/png";
            zzdveVar4 = this.zzdov.zzdoh;
            zzdveVar4.zzhvm.zzhwk = zzdut.zzb.zzf.EnumC0016zzb.TYPE_CREATIVE;
        }
    }
}
