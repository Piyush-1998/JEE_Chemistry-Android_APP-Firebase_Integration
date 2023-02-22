package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcdj implements zzdwb<zzddi<String>> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzdf> zzfui;
    private final zzdwo<zzddl> zzfuj;

    private zzcdj(zzdwo<zzdf> zzdwoVar, zzdwo<Context> zzdwoVar2, zzdwo<zzddl> zzdwoVar3) {
        this.zzfui = zzdwoVar;
        this.zzejy = zzdwoVar2;
        this.zzfuj = zzdwoVar3;
    }

    public static zzcdj zzn(zzdwo<zzdf> zzdwoVar, zzdwo<Context> zzdwoVar2, zzdwo<zzddl> zzdwoVar3) {
        return new zzcdj(zzdwoVar, zzdwoVar2, zzdwoVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        final zzdf zzdfVar = this.zzfui.get();
        final Context context = this.zzejy.get();
        return (zzddi) zzdwh.zza(this.zzfuj.get().zzd(new Callable(zzdfVar, context) { // from class: com.google.android.gms.internal.ads.zzcdf
            private final Context zzcfb;
            private final zzdf zzfub;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfub = zzdfVar;
                this.zzcfb = context;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdf zzdfVar2 = this.zzfub;
                return zzdfVar2.zzcd().zza(this.zzcfb);
            }
        }), "Cannot return null from a non-@Nullable @Provides method");
    }
}
