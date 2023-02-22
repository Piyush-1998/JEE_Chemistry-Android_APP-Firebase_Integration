package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzzr {
    private File file;
    private String zzblz;
    private String zzcub;
    private BlockingQueue<zzaab> zzcue = new ArrayBlockingQueue(100);
    private LinkedHashMap<String, String> zzcuf = new LinkedHashMap<>();
    private Map<String, zzzv> zzcug = new HashMap();
    private final HashSet<String> zzcuh = new HashSet<>(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));
    private AtomicBoolean zzcui;
    private Context zzlk;

    public final void zza(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.zzlk = context;
        this.zzblz = str;
        this.zzcub = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzcui = atomicBoolean;
        atomicBoolean.set(((Boolean) zzuv.zzon().zzd(zzza.zzcim)).booleanValue());
        if (this.zzcui.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.file = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.zzcuf.put(entry.getKey(), entry.getValue());
        }
        zzaxn.zzdwi.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzzq
            private final zzzr zzcud;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcud = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzcud.zzpx();
            }
        });
        this.zzcug.put("action", zzzv.zzcuk);
        this.zzcug.put("ad_format", zzzv.zzcuk);
        this.zzcug.put("e", zzzv.zzcul);
    }

    public final boolean zza(zzaab zzaabVar) {
        return this.zzcue.offer(zzaabVar);
    }

    private final void zza(Map<String, String> map, String str) {
        Uri.Builder buildUpon = Uri.parse(this.zzcub).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        StringBuilder sb = new StringBuilder(buildUpon.build().toString());
        if (!TextUtils.isEmpty(str)) {
            sb.append("&it=");
            sb.append(str);
        }
        String sb2 = sb.toString();
        if (this.zzcui.get()) {
            File file = this.file;
            if (file != null) {
                FileOutputStream fileOutputStream = null;
                try {
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                        try {
                            fileOutputStream2.write(sb2.getBytes());
                            fileOutputStream2.write(10);
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e) {
                                zzaug.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", e);
                            }
                        } catch (IOException e2) {
                            e = e2;
                            fileOutputStream = fileOutputStream2;
                            zzaug.zzd("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e3) {
                                    zzaug.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", e3);
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e4) {
                                    zzaug.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e5) {
                    e = e5;
                }
            } else {
                zzaug.zzeu("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
            }
        } else {
            com.google.android.gms.ads.internal.zzq.zzkj();
            zzaul.zzb(this.zzlk, this.zzblz, sb2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<String, String> zza(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String str = (String) linkedHashMap.get(key);
            linkedHashMap.put(key, zzcl(key).zzi(str, entry.getValue()));
        }
        return linkedHashMap;
    }

    public final zzzv zzcl(String str) {
        zzzv zzzvVar = this.zzcug.get(str);
        return zzzvVar != null ? zzzvVar : zzzv.zzcuj;
    }

    public final void zzcm(String str) {
        if (this.zzcuh.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.zzblz);
        linkedHashMap.put("ue", str);
        zza(zza(this.zzcuf, linkedHashMap), "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzpx() {
        while (true) {
            try {
                zzaab take = this.zzcue.take();
                String zzqc = take.zzqc();
                if (!TextUtils.isEmpty(zzqc)) {
                    zza(zza(this.zzcuf, take.zzqd()), zzqc);
                }
            } catch (InterruptedException e) {
                zzaug.zzd("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }
}
