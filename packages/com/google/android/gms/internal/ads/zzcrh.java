package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcrh implements zzcru<zzcri> {
    private final zzasl zzbnf;
    private final zzddl zzfoa;
    private final Context zzlk;

    public zzcrh(zzasl zzaslVar, zzddl zzddlVar, Context context) {
        this.zzbnf = zzaslVar;
        this.zzfoa = zzddlVar;
        this.zzlk = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<zzcri> zzalv() {
        return this.zzfoa.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcrk
            private final zzcrh zzgga;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgga = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgga.zzamg();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcri zzamg() throws Exception {
        if (!this.zzbnf.zzab(this.zzlk)) {
            return new zzcri(null, null, null, null, null);
        }
        String zzae = this.zzbnf.zzae(this.zzlk);
        String str = zzae == null ? "" : zzae;
        String zzaf = this.zzbnf.zzaf(this.zzlk);
        String str2 = zzaf == null ? "" : zzaf;
        String zzag = this.zzbnf.zzag(this.zzlk);
        String str3 = zzag == null ? "" : zzag;
        String zzah = this.zzbnf.zzah(this.zzlk);
        return new zzcri(str, str2, str3, zzah == null ? "" : zzah, "TIME_OUT".equals(str2) ? (Long) zzuv.zzon().zzd(zzza.zzcjk) : null);
    }
}
