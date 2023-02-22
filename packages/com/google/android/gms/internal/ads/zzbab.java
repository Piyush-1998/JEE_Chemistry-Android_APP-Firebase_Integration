package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbab implements zzne {
    private boolean isOpen;
    private Uri uri;
    private InputStream zzebw;
    private final zzne zzebx;
    private final zzns<zzne> zzeby;
    private final zzbae zzebz;
    private final Context zzlk;

    public zzbab(Context context, zzne zzneVar, zzns<zzne> zznsVar, zzbae zzbaeVar) {
        this.zzlk = context;
        this.zzebx = zzneVar;
        this.zzeby = zznsVar;
        this.zzebz = zzbaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void close() throws IOException {
        if (!this.isOpen) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.isOpen = false;
        this.uri = null;
        InputStream inputStream = this.zzebw;
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
            this.zzebw = null;
        } else {
            this.zzebx.close();
        }
        zzns<zzne> zznsVar = this.zzeby;
        if (zznsVar != null) {
            zznsVar.zze(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final long zza(zznf zznfVar) throws IOException {
        Long l;
        zznf zznfVar2 = zznfVar;
        if (this.isOpen) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.isOpen = true;
        this.uri = zznfVar2.uri;
        zzns<zzne> zznsVar = this.zzeby;
        if (zznsVar != null) {
            zznsVar.zza(this, zznfVar2);
        }
        zzrp zze = zzrp.zze(zznfVar2.uri);
        if (!((Boolean) zzuv.zzon().zzd(zzza.zzcps)).booleanValue()) {
            zzro zzroVar = null;
            if (zze != null) {
                zze.zzbro = zznfVar2.zzamq;
                zzroVar = com.google.android.gms.ads.internal.zzq.zzkp().zza(zze);
            }
            if (zzroVar != null && zzroVar.zzmi()) {
                this.zzebw = zzroVar.zzmj();
                return -1L;
            }
        } else if (zze != null) {
            zze.zzbro = zznfVar2.zzamq;
            if (zze.zzbrn) {
                l = (Long) zzuv.zzon().zzd(zzza.zzcpu);
            } else {
                l = (Long) zzuv.zzon().zzd(zzza.zzcpt);
            }
            long longValue = l.longValue();
            long elapsedRealtime = com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime();
            com.google.android.gms.ads.internal.zzq.zzld();
            Future<InputStream> zza = zzse.zza(this.zzlk, zze);
            try {
                try {
                    this.zzebw = zza.get(longValue, TimeUnit.MILLISECONDS);
                    long elapsedRealtime2 = com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime() - elapsedRealtime;
                    this.zzebz.zzb(true, elapsedRealtime2);
                    StringBuilder sb = new StringBuilder(44);
                    sb.append("Cache connection took ");
                    sb.append(elapsedRealtime2);
                    sb.append("ms");
                    zzaug.zzdy(sb.toString());
                    return -1L;
                } catch (InterruptedException unused) {
                    zza.cancel(true);
                    Thread.currentThread().interrupt();
                    long elapsedRealtime3 = com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime() - elapsedRealtime;
                    this.zzebz.zzb(false, elapsedRealtime3);
                    StringBuilder sb2 = new StringBuilder(44);
                    sb2.append("Cache connection took ");
                    sb2.append(elapsedRealtime3);
                    sb2.append("ms");
                    zzaug.zzdy(sb2.toString());
                } catch (ExecutionException | TimeoutException unused2) {
                    zza.cancel(true);
                    long elapsedRealtime4 = com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime() - elapsedRealtime;
                    this.zzebz.zzb(false, elapsedRealtime4);
                    StringBuilder sb3 = new StringBuilder(44);
                    sb3.append("Cache connection took ");
                    sb3.append(elapsedRealtime4);
                    sb3.append("ms");
                    zzaug.zzdy(sb3.toString());
                }
            } catch (Throwable th) {
                long elapsedRealtime5 = com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime() - elapsedRealtime;
                this.zzebz.zzb(false, elapsedRealtime5);
                StringBuilder sb4 = new StringBuilder(44);
                sb4.append("Cache connection took ");
                sb4.append(elapsedRealtime5);
                sb4.append("ms");
                zzaug.zzdy(sb4.toString());
                throw th;
            }
        }
        if (zze != null) {
            zznfVar2 = new zznf(Uri.parse(zze.url), zznfVar2.zzbek, zznfVar2.zzbel, zznfVar2.zzamq, zznfVar2.zzcb, zznfVar2.zzce, zznfVar2.flags);
        }
        return this.zzebx.zza(zznfVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read;
        if (!this.isOpen) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzebw;
        if (inputStream != null) {
            read = inputStream.read(bArr, i, i2);
        } else {
            read = this.zzebx.read(bArr, i, i2);
        }
        zzns<zzne> zznsVar = this.zzeby;
        if (zznsVar != null) {
            zznsVar.zzc(this, read);
        }
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final Uri getUri() {
        return this.uri;
    }
}
