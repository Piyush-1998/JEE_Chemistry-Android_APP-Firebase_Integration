package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.internal.ads.zzsf;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzsd {
    private final zzsi zzbsa;
    private final zztl zzbsb;
    private final boolean zzbsc;

    public static zzsd zzmm() {
        return new zzsd();
    }

    public zzsd(zzsi zzsiVar) {
        this.zzbsa = zzsiVar;
        this.zzbsc = ((Boolean) zzuv.zzon().zzd(zzza.zzcql)).booleanValue();
        this.zzbsb = new zztl();
        zzmn();
    }

    private zzsd() {
        this.zzbsc = false;
        this.zzbsa = new zzsi();
        this.zzbsb = new zztl();
        zzmn();
    }

    public final synchronized void zza(zzsf.zza.EnumC0018zza enumC0018zza) {
        if (this.zzbsc) {
            if (((Boolean) zzuv.zzon().zzd(zzza.zzcqm)).booleanValue()) {
                zzc(enumC0018zza);
            } else {
                zzb(enumC0018zza);
            }
        }
    }

    private final synchronized void zzb(zzsf.zza.EnumC0018zza enumC0018zza) {
        this.zzbsb.zzcat = zzmo();
        this.zzbsa.zzf(zzdus.zzb(this.zzbsb)).zzbq(enumC0018zza.zzab()).zzdh();
        String valueOf = String.valueOf(Integer.toString(enumC0018zza.zzab(), 10));
        zzaug.zzdy(valueOf.length() != 0 ? "Logging Event with event code : ".concat(valueOf) : new String("Logging Event with event code : "));
    }

    private final synchronized void zzc(zzsf.zza.EnumC0018zza enumC0018zza) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(zzd(enumC0018zza).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        zzaug.zzdy("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    zzaug.zzdy("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        zzaug.zzdy("Could not close Clearcut output stream.");
                    }
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    zzaug.zzdy("Could not close Clearcut output stream.");
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            zzaug.zzdy("Could not find file for Clearcut");
        }
    }

    private final synchronized String zzd(zzsf.zza.EnumC0018zza enumC0018zza) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.zzbsb.zzcap, Long.valueOf(com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime()), Integer.valueOf(enumC0018zza.zzab()), Base64.encodeToString(zzdus.zzb(this.zzbsb), 3));
    }

    public final synchronized void zza(zzsg zzsgVar) {
        if (this.zzbsc) {
            try {
                zzsgVar.zza(this.zzbsb);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.zzq.zzkn().zza(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    private final synchronized void zzmn() {
        this.zzbsb.zzcax = new zzth();
        this.zzbsb.zzcax.zzbzv = new zztg();
        this.zzbsb.zzcau = new zztj();
    }

    private static long[] zzmo() {
        int i;
        List<String> zzps = zzza.zzps();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = zzps.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String[] split = it.next().split(",");
            int length = split.length;
            while (i < length) {
                try {
                    arrayList.add(Long.valueOf(split[i]));
                } catch (NumberFormatException unused) {
                    zzaug.zzdy("Experiment ID is not a number");
                }
                i++;
            }
        }
        long[] jArr = new long[arrayList.size()];
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            jArr[i2] = ((Long) obj).longValue();
            i2++;
        }
        return jArr;
    }
}
