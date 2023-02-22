package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbbj extends zzbax implements zzns<zzne> {
    private String url;
    private ByteBuffer zzakm;
    private final zzazk zzebk;
    private boolean zzedu;
    private final zzbbk zzedv;
    private final zzbap zzedw;
    private boolean zzedx;
    private final Object zzedy;
    private boolean zzedz;

    public zzbbj(zzazj zzazjVar, zzazk zzazkVar) {
        super(zzazjVar);
        this.zzebk = zzazkVar;
        this.zzedv = new zzbbk();
        this.zzedw = new zzbap();
        this.zzedy = new Object();
    }

    @Override // com.google.android.gms.internal.ads.zzns
    public final /* bridge */ /* synthetic */ void zzc(zzne zzneVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzns
    public final /* bridge */ /* synthetic */ void zze(zzne zzneVar) {
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean zzys() {
        return this.zzedz;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbax
    public final String zzfe(String str) {
        String valueOf = String.valueOf(super.zzfe(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    private final void zzxd() {
        int zzyt = (int) this.zzedv.zzyt();
        int zzl = (int) this.zzedw.zzl(this.zzakm);
        int position = this.zzakm.position();
        int round = Math.round(zzl * (position / zzyt));
        boolean z = round > 0;
        int zzyp = zzbag.zzyp();
        int zzyq = zzbag.zzyq();
        String str = this.url;
        zza(str, zzfe(str), position, zzyt, round, zzl, z, zzyp, zzyq);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:? -> B:53:0x013a). Please submit an issue!!! */
    @Override // com.google.android.gms.internal.ads.zzbax
    public final boolean zzfd(String str) {
        String str2;
        this.url = str;
        String zzfe = zzfe(str);
        String str3 = "error";
        int i = 0;
        try {
            zzne zznhVar = new zznh(this.zzdvd, null, this, this.zzebk.zzeal, this.zzebk.zzean, true, null);
            if (this.zzebk.zzear) {
                try {
                    zznhVar = new zzbab(this.mContext, zznhVar, null, null);
                } catch (Exception e) {
                    e = e;
                    String canonicalName = e.getClass().getCanonicalName();
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length());
                    sb.append(canonicalName);
                    sb.append(":");
                    sb.append(message);
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(sb2).length());
                    sb3.append("Failed to preload url ");
                    sb3.append(str);
                    sb3.append(" Exception: ");
                    sb3.append(sb2);
                    zzaug.zzeu(sb3.toString());
                    zza(str, zzfe, str3, sb2);
                    return false;
                }
            }
            zznhVar.zza(new zznf(Uri.parse(str)));
            zzazj zzazjVar = this.zzedf.get();
            if (zzazjVar != null) {
                zzazjVar.zza(zzfe, this);
            }
            Clock zzkq = com.google.android.gms.ads.internal.zzq.zzkq();
            long currentTimeMillis = zzkq.currentTimeMillis();
            long longValue = ((Long) zzuv.zzon().zzd(zzza.zzchk)).longValue();
            long longValue2 = ((Long) zzuv.zzon().zzd(zzza.zzchj)).longValue();
            this.zzakm = ByteBuffer.allocate(this.zzebk.zzeak);
            int i2 = 8192;
            byte[] bArr = new byte[8192];
            long j = currentTimeMillis;
            while (true) {
                int read = zznhVar.read(bArr, i, Math.min(this.zzakm.remaining(), i2));
                if (read == -1) {
                    this.zzedz = true;
                    zzb(str, zzfe, (int) this.zzedw.zzl(this.zzakm));
                    return true;
                }
                synchronized (this.zzedy) {
                    try {
                        if (this.zzedu) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            try {
                                this.zzakm.put(bArr, 0, read);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        try {
                            if (this.zzakm.remaining() <= 0) {
                                zzxd();
                                return true;
                            } else if (this.zzedu) {
                                int limit = this.zzakm.limit();
                                StringBuilder sb4 = new StringBuilder(35);
                                sb4.append("Precache abort at ");
                                sb4.append(limit);
                                sb4.append(" bytes");
                                throw new IOException(sb4.toString());
                            } else {
                                long currentTimeMillis2 = zzkq.currentTimeMillis();
                                if (currentTimeMillis2 - j >= longValue) {
                                    zzxd();
                                    j = currentTimeMillis2;
                                }
                                if (currentTimeMillis2 - currentTimeMillis > 1000 * longValue2) {
                                    StringBuilder sb5 = new StringBuilder(49);
                                    sb5.append("Timeout exceeded. Limit: ");
                                    sb5.append(longValue2);
                                    sb5.append(" sec");
                                    throw new IOException(sb5.toString());
                                }
                                str3 = str2;
                                i2 = 8192;
                                i = 0;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str3 = str2;
                            String canonicalName2 = e.getClass().getCanonicalName();
                            String message2 = e.getMessage();
                            StringBuilder sb6 = new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length());
                            sb6.append(canonicalName2);
                            sb6.append(":");
                            sb6.append(message2);
                            String sb22 = sb6.toString();
                            StringBuilder sb32 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(sb22).length());
                            sb32.append("Failed to preload url ");
                            sb32.append(str);
                            sb32.append(" Exception: ");
                            sb32.append(sb22);
                            zzaug.zzeu(sb32.toString());
                            zza(str, zzfe, str3, sb22);
                            return false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final void abort() {
        this.zzedu = true;
    }

    public final ByteBuffer getByteBuffer() {
        synchronized (this.zzedy) {
            if (this.zzakm != null && !this.zzedx) {
                this.zzakm.flip();
                this.zzedx = true;
            }
            this.zzedu = true;
        }
        return this.zzakm;
    }

    @Override // com.google.android.gms.internal.ads.zzns
    public final /* synthetic */ void zza(zzne zzneVar, zznf zznfVar) {
        zzne zzneVar2 = zzneVar;
        if (zzneVar2 instanceof zznh) {
            this.zzedv.zza((zznh) zzneVar2);
        }
    }
}
