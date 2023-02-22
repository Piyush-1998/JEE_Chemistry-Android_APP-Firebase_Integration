package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzcyf extends zzbpm<zzcym> implements zzcye<zzcyd> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcyf(Set<zzbqs<zzcym>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zza(final zzcxp<zzcyd, ?> zzcxpVar) {
        zza(new zzbpo(zzcxpVar) { // from class: com.google.android.gms.internal.ads.zzcyi
            private final zzcxp zzgmv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgmv = zzcxpVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbpo
            public final void zzp(Object obj) {
                zzcxp zzcxpVar2 = this.zzgmv;
                ((zzcym) obj).zza((zzcyd) zzcxpVar2.zzanq(), zzcxpVar2.zzanr());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzb(final zzcxp<zzcyd, ?> zzcxpVar) {
        zza(new zzbpo(zzcxpVar) { // from class: com.google.android.gms.internal.ads.zzcyh
            private final zzcxp zzgmv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgmv = zzcxpVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbpo
            public final void zzp(Object obj) {
                zzcxp zzcxpVar2 = this.zzgmv;
                ((zzcym) obj).zzb((zzcyd) zzcxpVar2.zzanq(), zzcxpVar2.zzanr());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zza(final zzcxp<zzcyd, ?> zzcxpVar, final Throwable th) {
        zza(new zzbpo(zzcxpVar, th) { // from class: com.google.android.gms.internal.ads.zzcyk
            private final zzcxp zzgmv;
            private final Throwable zzgmw;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgmv = zzcxpVar;
                this.zzgmw = th;
            }

            @Override // com.google.android.gms.internal.ads.zzbpo
            public final void zzp(Object obj) {
                zzcxp zzcxpVar2 = this.zzgmv;
                ((zzcym) obj).zza((zzcyd) zzcxpVar2.zzanq(), zzcxpVar2.zzanr(), this.zzgmw);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzc(final zzcxp<zzcyd, ?> zzcxpVar) {
        zza(new zzbpo(zzcxpVar) { // from class: com.google.android.gms.internal.ads.zzcyj
            private final zzcxp zzgmv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgmv = zzcxpVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbpo
            public final void zzp(Object obj) {
                zzcxp zzcxpVar2 = this.zzgmv;
                ((zzcym) obj).zzc((zzcyd) zzcxpVar2.zzanq(), zzcxpVar2.zzanr());
            }
        });
    }
}
