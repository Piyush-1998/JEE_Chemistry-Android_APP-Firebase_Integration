package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbbm extends zzbax implements zzbao {
    private String zzdym;
    private boolean zzedu;
    private zzbag zzeed;
    private Exception zzeee;
    private boolean zzeef;

    public zzbbm(zzazj zzazjVar, zzazk zzazkVar) {
        super(zzazjVar);
        zzbag zzbagVar = new zzbag(zzazjVar.getContext(), zzazkVar);
        this.zzeed = zzbagVar;
        zzbagVar.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbao
    public final void zzcx(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbao
    public final void zzm(int i, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbao
    public final void zzb(final boolean z, final long j) {
        final zzazj zzazjVar = this.zzedf.get();
        if (zzazjVar != null) {
            zzaxn.zzdwm.execute(new Runnable(zzazjVar, z, j) { // from class: com.google.android.gms.internal.ads.zzbbl
                private final boolean zzdyt;
                private final long zzebv;
                private final zzazj zzeec;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzeec = zzazjVar;
                    this.zzdyt = z;
                    this.zzebv = j;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzeec.zza(this.zzdyt, this.zzebv);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbao
    public final void zza(String str, Exception exc) {
        String str2 = (String) zzuv.zzon().zzd(zzza.zzchd);
        if (str2 != null) {
            List asList = Arrays.asList(str2.split(","));
            if (asList.contains("all") || asList.contains(exc.getClass().getCanonicalName())) {
                return;
            }
        }
        this.zzeee = exc;
        zzaug.zzd("Precache error", exc);
        zzfg(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final void zzct(int i) {
        this.zzeed.zzyr().zzda(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final void zzcs(int i) {
        this.zzeed.zzyr().zzcz(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final void zzcu(int i) {
        this.zzeed.zzyr().zzcu(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final void zzcv(int i) {
        this.zzeed.zzyr().zzcv(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbax, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzbag zzbagVar = this.zzeed;
        if (zzbagVar != null) {
            zzbagVar.zza((zzbao) null);
            this.zzeed.release();
        }
        super.release();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbax
    public final String zzfe(String str) {
        String valueOf = String.valueOf(super.zzfe(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final boolean zzfd(String str) {
        return zze(str, new String[]{str});
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final boolean zze(String str, String[] strArr) {
        String str2;
        long j;
        long j2;
        long j3;
        String str3;
        long j4;
        long j5;
        this.zzdym = str;
        String zzfe = zzfe(str);
        String str4 = "error";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                try {
                    uriArr[i] = Uri.parse(strArr[i]);
                } catch (Exception e) {
                    e = e;
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
                    sb.append("Failed to preload url ");
                    sb.append(str);
                    sb.append(" Exception: ");
                    sb.append(message);
                    zzaug.zzeu(sb.toString());
                    release();
                    zza(str, zzfe, str4, zzb(str4, e));
                    return false;
                }
            }
            this.zzeed.zza(uriArr, this.zzdvd);
            zzazj zzazjVar = this.zzedf.get();
            if (zzazjVar != null) {
                zzazjVar.zza(zzfe, this);
            }
            Clock zzkq = com.google.android.gms.ads.internal.zzq.zzkq();
            long currentTimeMillis = zzkq.currentTimeMillis();
            long longValue = ((Long) zzuv.zzon().zzd(zzza.zzchk)).longValue();
            long longValue2 = ((Long) zzuv.zzon().zzd(zzza.zzchj)).longValue() * 1000;
            long intValue = ((Integer) zzuv.zzon().zzd(zzza.zzchi)).intValue();
            long j6 = -1;
            while (true) {
                try {
                    synchronized (this) {
                        try {
                            if (zzkq.currentTimeMillis() - currentTimeMillis > longValue2) {
                                long j7 = longValue2;
                                StringBuilder sb2 = new StringBuilder(47);
                                sb2.append("Timeout reached. Limit: ");
                                sb2.append(j7);
                                sb2.append(" ms");
                                throw new IOException(sb2.toString());
                            } else if (this.zzedu) {
                                if (this.zzeee != null) {
                                    throw this.zzeee;
                                }
                                throw new IOException("Abort requested before buffering finished. ");
                            } else if (!this.zzeef) {
                                zzgc zzyo = this.zzeed.zzyo();
                                if (zzyo == null) {
                                    throw new IOException("ExoPlayer was released during preloading.");
                                }
                                str2 = str4;
                                try {
                                    long duration = zzyo.getDuration();
                                    if (duration > 0) {
                                        long bufferedPosition = zzyo.getBufferedPosition();
                                        if (bufferedPosition != j6) {
                                            j = intValue;
                                            j2 = longValue2;
                                            j4 = longValue;
                                            zza(str, zzfe, bufferedPosition, duration, bufferedPosition > 0, zzbag.zzyp(), zzbag.zzyq());
                                            j5 = bufferedPosition;
                                        } else {
                                            j = intValue;
                                            j2 = longValue2;
                                            j4 = longValue;
                                            j5 = j6;
                                        }
                                        if (bufferedPosition >= duration) {
                                            zzb(str, zzfe, duration);
                                        } else if (this.zzeed.getBytesTransferred() < j || bufferedPosition <= 0) {
                                            j3 = j4;
                                            str3 = j5;
                                        }
                                    } else {
                                        j = intValue;
                                        j2 = longValue2;
                                        j3 = longValue;
                                        str3 = j6;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    str4 = str2;
                                }
                                try {
                                    try {
                                        wait(j3);
                                    } catch (InterruptedException unused) {
                                        throw new IOException("Wait interrupted.");
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    str4 = str3;
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    longValue = j3;
                    str4 = str2;
                    intValue = j;
                    longValue2 = j2;
                    j6 = str3;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            return true;
        } catch (Exception e2) {
            e = e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final void abort() {
        zzfg(null);
    }

    private final void zzfg(String str) {
        synchronized (this) {
            this.zzedu = true;
            notify();
            release();
        }
        String str2 = this.zzdym;
        if (str2 != null) {
            String zzfe = zzfe(str2);
            Exception exc = this.zzeee;
            if (exc != null) {
                zza(this.zzdym, zzfe, "badUrl", zzb(str, exc));
            } else {
                zza(this.zzdym, zzfe, "externalAbort", "Programmatic precache abort.");
            }
        }
    }

    public final zzbag zzyu() {
        synchronized (this) {
            this.zzeef = true;
            notify();
        }
        this.zzeed.zza((zzbao) null);
        zzbag zzbagVar = this.zzeed;
        this.zzeed = null;
        return zzbagVar;
    }

    private static String zzb(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }
}
