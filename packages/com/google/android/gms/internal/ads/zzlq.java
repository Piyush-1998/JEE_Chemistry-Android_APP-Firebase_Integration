package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzlq implements zzlt, zzlu {
    private final Uri uri;
    private final Handler zzacs;
    private zzgy zzadd;
    private final int zzazt;
    private final zzlp zzazu;
    private zzlt zzazv;
    private final zznd zzbbb;
    private final zzix zzbbc;
    private final int zzbbd;
    private boolean zzbbe;
    private final String zzazx = null;
    private final zzha zzacw = new zzha();

    public zzlq(Uri uri, zznd zzndVar, zzix zzixVar, int i, Handler handler, zzlp zzlpVar, String str, int i2) {
        this.uri = uri;
        this.zzbbb = zzndVar;
        this.zzbbc = zzixVar;
        this.zzazt = i;
        this.zzacs = handler;
        this.zzazu = zzlpVar;
        this.zzbbd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    public final void zzhl() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    public final void zza(zzgc zzgcVar, boolean z, zzlt zzltVar) {
        this.zzazv = zzltVar;
        zzmi zzmiVar = new zzmi(-9223372036854775807L, false);
        this.zzadd = zzmiVar;
        zzltVar.zzb(zzmiVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    public final zzls zza(int i, zznc zzncVar) {
        zznr.checkArgument(i == 0);
        return new zzli(this.uri, this.zzbbb.zzib(), this.zzbbc.zzgd(), this.zzazt, this.zzacs, this.zzazu, this, zzncVar, null, this.zzbbd);
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    public final void zzb(zzls zzlsVar) {
        ((zzli) zzlsVar).release();
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    public final void zzhm() {
        this.zzazv = null;
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zzb(zzgy zzgyVar, Object obj) {
        boolean z = zzgyVar.zza(0, this.zzacw, false).zzagh != -9223372036854775807L;
        if (!this.zzbbe || z) {
            this.zzadd = zzgyVar;
            this.zzbbe = z;
            this.zzazv.zzb(zzgyVar, null);
        }
    }
}
