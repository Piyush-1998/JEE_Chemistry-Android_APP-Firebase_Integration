package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbag implements zzgf, zzlp, zzns<zzne>, zzow {
    private static int zzeci;
    private static int zzecj;
    private int bytesTransferred;
    private final zzazk zzebk;
    private final zzgx zzecl;
    private zzgc zzeco;
    private ByteBuffer zzecp;
    private boolean zzecq;
    private zzbao zzecr;
    private final Context zzlk;
    private Set<WeakReference<zzazz>> zzecs = new HashSet();
    private final zzbad zzeck = new zzbad();
    private final zzgx zzecm = new zzib(zzkn.zzaza);
    private final zzms zzecn = new zzmn();

    public zzbag(Context context, zzazk zzazkVar) {
        this.zzlk = context;
        this.zzebk = zzazkVar;
        this.zzecl = new zzoq(this.zzlk, zzkn.zzaza, 0L, zzaul.zzdsu, this, -1);
        if (zzaug.zzuu()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("ExoPlayerAdapter initialize ");
            sb.append(valueOf);
            zzaug.zzdy(sb.toString());
        }
        zzeci++;
        zzgc zza = zzgg.zza(new zzgx[]{this.zzecm, this.zzecl}, this.zzecn, this.zzeck);
        this.zzeco = zza;
        zza.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgf
    public final void zza(zzgu zzguVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzgf
    public final void zza(zzgy zzgyVar, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzgf
    public final void zza(zzmk zzmkVar, zzmv zzmvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzow
    public final void zzb(Surface surface) {
    }

    @Override // com.google.android.gms.internal.ads.zzow
    public final void zzd(String str, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzgf
    public final void zzdx() {
    }

    @Override // com.google.android.gms.internal.ads.zzow
    public final void zze(zzil zzilVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzns
    public final /* bridge */ /* synthetic */ void zze(zzne zzneVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzow
    public final void zzf(int i, long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzow
    public final void zzf(zzil zzilVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzgf
    public final void zzf(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzow
    public final void zzk(zzgo zzgoVar) {
    }

    public final zzgc zzyo() {
        return this.zzeco;
    }

    public static int zzyp() {
        return zzeci;
    }

    public static int zzyq() {
        return zzecj;
    }

    public final void zza(zzbao zzbaoVar) {
        this.zzecr = zzbaoVar;
    }

    public final zzbad zzyr() {
        return this.zzeck;
    }

    public final void zza(Uri[] uriArr, String str) {
        zza(uriArr, str, ByteBuffer.allocate(0), false);
    }

    public final void zza(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzlu zzlvVar;
        if (this.zzeco == null) {
            return;
        }
        this.zzecp = byteBuffer;
        this.zzecq = z;
        if (uriArr.length == 1) {
            zzlvVar = zzb(uriArr[0], str);
        } else {
            zzlu[] zzluVarArr = new zzlu[uriArr.length];
            for (int i = 0; i < uriArr.length; i++) {
                zzluVarArr[i] = zzb(uriArr[i], str);
            }
            zzlvVar = new zzlv(zzluVarArr);
        }
        this.zzeco.zza(zzlvVar);
        zzecj++;
    }

    public final void release() {
        zzgc zzgcVar = this.zzeco;
        if (zzgcVar != null) {
            zzgcVar.zzb(this);
            this.zzeco.release();
            this.zzeco = null;
            zzecj--;
        }
    }

    public final long getBytesTransferred() {
        return this.bytesTransferred;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzb(IOException iOException) {
        zzbao zzbaoVar = this.zzecr;
        if (zzbaoVar != null) {
            zzbaoVar.zza("onLoadError", iOException);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzow
    public final void zzb(int i, int i2, int i3, float f) {
        zzbao zzbaoVar = this.zzecr;
        if (zzbaoVar != null) {
            zzbaoVar.zzm(i, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgf
    public final void zza(boolean z, int i) {
        zzbao zzbaoVar = this.zzecr;
        if (zzbaoVar != null) {
            zzbaoVar.zzcx(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgf
    public final void zza(zzgd zzgdVar) {
        zzbao zzbaoVar = this.zzecr;
        if (zzbaoVar != null) {
            zzbaoVar.zza("onPlayerError", zzgdVar);
        }
    }

    public final void zzcw(int i) {
        for (WeakReference<zzazz> weakReference : this.zzecs) {
            zzazz zzazzVar = weakReference.get();
            if (zzazzVar != null) {
                zzazzVar.setReceiveBufferSize(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(Surface surface, boolean z) {
        if (this.zzeco == null) {
            return;
        }
        zzgh zzghVar = new zzgh(this.zzecl, 1, surface);
        if (z) {
            this.zzeco.zzb(zzghVar);
        } else {
            this.zzeco.zza(zzghVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(float f, boolean z) {
        if (this.zzeco == null) {
            return;
        }
        zzgh zzghVar = new zzgh(this.zzecm, 2, Float.valueOf(f));
        if (z) {
            this.zzeco.zzb(zzghVar);
        } else {
            this.zzeco.zza(zzghVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzap(boolean z) {
        if (this.zzeco == null) {
            return;
        }
        for (int i = 0; i < this.zzeco.zzdv(); i++) {
            this.zzecn.zzf(i, !z);
        }
    }

    private final zzlu zzb(Uri uri, final String str) {
        final zznd zzndVar;
        if (this.zzecq && this.zzecp.limit() > 0) {
            final byte[] bArr = new byte[this.zzecp.limit()];
            this.zzecp.get(bArr);
            zzndVar = new zznd(bArr) { // from class: com.google.android.gms.internal.ads.zzbaf
                private final byte[] zzdwb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdwb = bArr;
                }

                @Override // com.google.android.gms.internal.ads.zznd
                public final zzne zzib() {
                    return new zznb(this.zzdwb);
                }
            };
        } else {
            if (this.zzebk.zzeaq > 0) {
                zzndVar = new zznd(this, str) { // from class: com.google.android.gms.internal.ads.zzbai
                    private final String zzcyz;
                    private final zzbag zzect;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzect = this;
                        this.zzcyz = str;
                    }

                    @Override // com.google.android.gms.internal.ads.zznd
                    public final zzne zzib() {
                        return this.zzect.zzfc(this.zzcyz);
                    }
                };
            } else {
                zzndVar = new zznd(this, str) { // from class: com.google.android.gms.internal.ads.zzbah
                    private final String zzcyz;
                    private final zzbag zzect;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzect = this;
                        this.zzcyz = str;
                    }

                    @Override // com.google.android.gms.internal.ads.zznd
                    public final zzne zzib() {
                        return this.zzect.zzfb(this.zzcyz);
                    }
                };
            }
            if (this.zzebk.zzear) {
                zzndVar = new zznd(this, zzndVar) { // from class: com.google.android.gms.internal.ads.zzbak
                    private final zzbag zzect;
                    private final zznd zzecv;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzect = this;
                        this.zzecv = zzndVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zznd
                    public final zzne zzib() {
                        return this.zzect.zza(this.zzecv);
                    }
                };
            }
            if (this.zzecp.limit() > 0) {
                final byte[] bArr2 = new byte[this.zzecp.limit()];
                this.zzecp.get(bArr2);
                zzndVar = new zznd(zzndVar, bArr2) { // from class: com.google.android.gms.internal.ads.zzbaj
                    private final byte[] zzdlz;
                    private final zznd zzecu;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzecu = zzndVar;
                        this.zzdlz = bArr2;
                    }

                    @Override // com.google.android.gms.internal.ads.zznd
                    public final zzne zzib() {
                        zznd zzndVar2 = this.zzecu;
                        byte[] bArr3 = this.zzdlz;
                        return new zzban(new zznb(bArr3), bArr3.length, zzndVar2.zzib());
                    }
                };
            }
        }
        return new zzlq(uri, zzndVar, zzbam.zzecw, this.zzebk.zzeas, zzaul.zzdsu, this, null, this.zzebk.zzeao);
    }

    public final void finalize() throws Throwable {
        zzeci--;
        if (zzaug.zzuu()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("ExoPlayerAdapter finalize ");
            sb.append(valueOf);
            zzaug.zzdy(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzns
    public final /* synthetic */ void zzc(zzne zzneVar, int i) {
        this.bytesTransferred += i;
    }

    @Override // com.google.android.gms.internal.ads.zzns
    public final /* synthetic */ void zza(zzne zzneVar, zznf zznfVar) {
        this.bytesTransferred = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzne zza(zznd zzndVar) {
        return new zzbab(this.zzlk, zzndVar.zzib(), this, new zzbae(this) { // from class: com.google.android.gms.internal.ads.zzbal
            private final zzbag zzect;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzect = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbae
            public final void zzb(boolean z, long j) {
                this.zzect.zzd(z, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(boolean z, long j) {
        zzbao zzbaoVar = this.zzecr;
        if (zzbaoVar != null) {
            zzbaoVar.zzb(z, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzne zzfb(String str) {
        return new zznh(str, null, this.zzebk.zzear ? null : this, this.zzebk.zzeal, this.zzebk.zzean, true, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzne zzfc(String str) {
        zzazz zzazzVar = new zzazz(str, this.zzebk.zzear ? null : this, this.zzebk.zzeal, this.zzebk.zzean, this.zzebk.zzeaq);
        this.zzecs.add(new WeakReference<>(zzazzVar));
        return zzazzVar;
    }
}
