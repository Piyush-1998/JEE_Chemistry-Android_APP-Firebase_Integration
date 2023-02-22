package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcrl implements zzcru<zzcrm> {
    private final zzaxl zzblk;
    private final zzddl zzfoa;
    private final Context zzlk;

    public zzcrl(zzddl zzddlVar, Context context, zzaxl zzaxlVar) {
        this.zzfoa = zzddlVar;
        this.zzlk = context;
        this.zzblk = zzaxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<zzcrm> zzalv() {
        return this.zzfoa.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcro
            private final zzcrl zzgge;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgge = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgge.zzamh();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcrm zzamh() throws Exception {
        boolean isCallerInstantApp = Wrappers.packageManager(this.zzlk).isCallerInstantApp();
        com.google.android.gms.ads.internal.zzq.zzkj();
        boolean zzay = zzaul.zzay(this.zzlk);
        String str = this.zzblk.zzblz;
        com.google.android.gms.ads.internal.zzq.zzkl();
        boolean zzvs = zzaur.zzvs();
        com.google.android.gms.ads.internal.zzq.zzkj();
        return new zzcrm(isCallerInstantApp, zzay, str, zzvs, zzaul.zzav(this.zzlk), DynamiteModule.getRemoteVersion(this.zzlk, ModuleDescriptor.MODULE_ID), DynamiteModule.getLocalVersion(this.zzlk, ModuleDescriptor.MODULE_ID));
    }
}
