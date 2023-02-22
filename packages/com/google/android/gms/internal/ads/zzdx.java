package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzbo;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzdx {
    private static final String TAG = zzdx.class.getSimpleName();
    protected Context zzlk;
    private ExecutorService zzxr;
    private DexClassLoader zzxs;
    private zzdh zzxt;
    private byte[] zzxu;
    private boolean zzxx;
    private zzda zzya;
    private Map<Pair<String, String>, zzfj> zzyd;
    private volatile AdvertisingIdClient zzxv = null;
    private volatile boolean zzwo = false;
    private Future zzxw = null;
    private volatile zzbo.zza zzxy = null;
    private Future zzxz = null;
    protected boolean zzyb = false;
    private boolean zzyc = false;
    private boolean zzye = false;
    private boolean zzyf = true;
    private boolean zzyg = false;

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    final class zza extends BroadcastReceiver {
        private zza() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!"android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    zzdx.this.zzyf = false;
                    return;
                }
                return;
            }
            zzdx.this.zzyf = true;
        }

        /* synthetic */ zza(zzdx zzdxVar, zzea zzeaVar) {
            this();
        }
    }

    public static zzdx zza(Context context, String str, String str2, boolean z) {
        zzdx zzdxVar = new zzdx(context);
        try {
            zzdxVar.zzxr = Executors.newCachedThreadPool(new zzea());
            zzdxVar.zzwo = z;
            if (z) {
                zzdxVar.zzxw = zzdxVar.zzxr.submit(new zzdz(zzdxVar));
            }
            zzdxVar.zzxr.execute(new zzeb(zzdxVar));
            try {
                GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
                zzdxVar.zzyb = googleApiAvailabilityLight.getApkVersion(zzdxVar.zzlk) > 0;
                zzdxVar.zzyc = googleApiAvailabilityLight.isGooglePlayServicesAvailable(zzdxVar.zzlk) == 0;
            } catch (Throwable unused) {
            }
            zzdxVar.zza(0, true);
            if (zzee.isMainThread() && ((Boolean) zzuv.zzon().zzd(zzza.zzcnj)).booleanValue()) {
                throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
            }
            zzdh zzdhVar = new zzdh(null);
            zzdxVar.zzxt = zzdhVar;
            try {
                zzdxVar.zzxu = zzdhVar.zzaq(str);
                try {
                    try {
                        try {
                            File cacheDir = zzdxVar.zzlk.getCacheDir();
                            if (cacheDir == null && (cacheDir = zzdxVar.zzlk.getDir("dex", 0)) == null) {
                                throw new zzdw();
                            }
                            File file = new File(String.format("%s/%s.jar", cacheDir, "1561154238473"));
                            if (!file.exists()) {
                                byte[] zza2 = zzdxVar.zzxt.zza(zzdxVar.zzxu, str2);
                                file.createNewFile();
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                fileOutputStream.write(zza2, 0, zza2.length);
                                fileOutputStream.close();
                            }
                            zzdxVar.zzb(cacheDir, "1561154238473");
                            try {
                                zzdxVar.zzxs = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), null, zzdxVar.zzlk.getClassLoader());
                                zzb(file);
                                zzdxVar.zza(cacheDir, "1561154238473");
                                zzar(String.format("%s/%s.dex", cacheDir, "1561154238473"));
                                if (!zzdxVar.zzyg) {
                                    IntentFilter intentFilter = new IntentFilter();
                                    intentFilter.addAction("android.intent.action.USER_PRESENT");
                                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                                    zzdxVar.zzlk.registerReceiver(new zza(zzdxVar, null), intentFilter);
                                    zzdxVar.zzyg = true;
                                }
                                zzdxVar.zzya = new zzda(zzdxVar);
                                zzdxVar.zzye = true;
                            } catch (Throwable th) {
                                zzb(file);
                                zzdxVar.zza(cacheDir, "1561154238473");
                                zzar(String.format("%s/%s.dex", cacheDir, "1561154238473"));
                                throw th;
                            }
                        } catch (zzdk e) {
                            throw new zzdw(e);
                        } catch (NullPointerException e2) {
                            throw new zzdw(e2);
                        }
                    } catch (IOException e3) {
                        throw new zzdw(e3);
                    }
                } catch (FileNotFoundException e4) {
                    throw new zzdw(e4);
                }
            } catch (zzdk e5) {
                throw new zzdw(e5);
            }
        } catch (zzdw unused2) {
        }
        return zzdxVar;
    }

    public final Context getContext() {
        return this.zzlk;
    }

    public final boolean isInitialized() {
        return this.zzye;
    }

    public final ExecutorService zzce() {
        return this.zzxr;
    }

    public final DexClassLoader zzcf() {
        return this.zzxs;
    }

    public final zzdh zzcg() {
        return this.zzxt;
    }

    public final byte[] zzch() {
        return this.zzxu;
    }

    public final boolean zzci() {
        return this.zzyb;
    }

    public final zzda zzcj() {
        return this.zzya;
    }

    public final boolean zzck() {
        return this.zzyc;
    }

    public final boolean zzcl() {
        return this.zzyf;
    }

    public final zzbo.zza zzcm() {
        return this.zzxy;
    }

    public final Future zzcn() {
        return this.zzxz;
    }

    private zzdx(Context context) {
        Context applicationContext = context.getApplicationContext();
        boolean z = applicationContext != null;
        this.zzxx = z;
        this.zzlk = z ? applicationContext : context;
        this.zzyd = new HashMap();
    }

    private final void zza(File file, String str) {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, str));
        if (file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, str));
        if (!file3.exists()) {
            return;
        }
        long length = file3.length();
        if (length <= 0) {
            return;
        }
        byte[] bArr = new byte[(int) length];
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file3);
            try {
                if (fileInputStream2.read(bArr) <= 0) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused) {
                    }
                    zzb(file3);
                    return;
                }
                System.out.print("test");
                System.out.print("test");
                System.out.print("test");
                zzbo.zzd.zza zzk = zzbo.zzd.zzbb().zzl(zzdpm.zzy(Build.VERSION.SDK.getBytes())).zzk(zzdpm.zzy(str.getBytes()));
                byte[] bytes = this.zzxt.zzb(this.zzxu, bArr).getBytes();
                zzk.zzi(zzdpm.zzy(bytes)).zzj(zzdpm.zzy(zzci.zzb(bytes)));
                file2.createNewFile();
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] byteArray = ((zzbo.zzd) ((zzdqw) zzk.zzazr())).toByteArray();
                    fileOutputStream.write(byteArray, 0, byteArray.length);
                    fileOutputStream.close();
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused2) {
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                    }
                    zzb(file3);
                } catch (zzdk | IOException | NoSuchAlgorithmException unused4) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    zzb(file3);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused7) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused8) {
                        }
                    }
                    zzb(file3);
                    throw th;
                }
            } catch (zzdk | IOException | NoSuchAlgorithmException unused9) {
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (zzdk | IOException | NoSuchAlgorithmException unused10) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    private static void zzar(String str) {
        zzb(new File(str));
    }

    private static void zzb(File file) {
        if (!file.exists()) {
            Log.d(TAG, String.format("File %s not found. No need for deletion", file.getAbsolutePath()));
        } else {
            file.delete();
        }
    }

    private final boolean zzb(File file, String str) {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, str));
        if (!file2.exists()) {
            return false;
        }
        File file3 = new File(String.format("%s/%s.dex", file, str));
        if (file3.exists()) {
            return false;
        }
        FileInputStream fileInputStream = null;
        try {
            long length = file2.length();
            if (length <= 0) {
                zzb(file2);
                return false;
            }
            byte[] bArr = new byte[(int) length];
            FileInputStream fileInputStream2 = new FileInputStream(file2);
            try {
                if (fileInputStream2.read(bArr) <= 0) {
                    Log.d(TAG, "Cannot read the cache data.");
                    zzb(file2);
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return false;
                }
                zzbo.zzd zzc = zzbo.zzd.zzc(bArr, zzdqj.zzazb());
                if (str.equals(new String(zzc.zzaz().toByteArray())) && Arrays.equals(zzc.zzay().toByteArray(), zzci.zzb(zzc.zzax().toByteArray())) && Arrays.equals(zzc.zzba().toByteArray(), Build.VERSION.SDK.getBytes())) {
                    byte[] zza2 = this.zzxt.zza(this.zzxu, new String(zzc.zzax().toByteArray()));
                    file3.createNewFile();
                    fileOutputStream = new FileOutputStream(file3);
                    try {
                        fileOutputStream.write(zza2, 0, zza2.length);
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused2) {
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                        return true;
                    } catch (zzdk | IOException | NoSuchAlgorithmException unused4) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused5) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused6) {
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused7) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused8) {
                            }
                        }
                        throw th;
                    }
                }
                zzb(file2);
                try {
                    fileInputStream2.close();
                } catch (IOException unused9) {
                }
                return false;
            } catch (zzdk | IOException | NoSuchAlgorithmException unused10) {
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (zzdk | IOException | NoSuchAlgorithmException unused11) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public final boolean zza(String str, String str2, Class<?>... clsArr) {
        if (this.zzyd.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.zzyd.put(new Pair<>(str, str2), new zzfj(this, str, str2, clsArr));
        return true;
    }

    public final Method zzc(String str, String str2) {
        zzfj zzfjVar = this.zzyd.get(new Pair(str, str2));
        if (zzfjVar == null) {
            return null;
        }
        return zzfjVar.zzcz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzco() {
        try {
            if (this.zzxv == null && this.zzxx) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.zzlk);
                advertisingIdClient.start();
                this.zzxv = advertisingIdClient;
            }
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
            this.zzxv = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(int i, boolean z) {
        if (this.zzyc) {
            Future<?> submit = this.zzxr.submit(new zzec(this, i, z));
            if (i == 0) {
                this.zzxz = submit;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzbo.zza zzb(int i, boolean z) {
        if (i > 0 && z) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        return zzcp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zza(int i, zzbo.zza zzaVar) {
        if (i < 4) {
            return zzaVar == null || !zzaVar.zzah() || zzaVar.zzad().equals("0000000000000000000000000000000000000000000000000000000000000000") || !zzaVar.zzaj() || !zzaVar.zzak().zzbd() || zzaVar.zzak().zzbe() == -2;
        }
        return false;
    }

    private final zzbo.zza zzcp() {
        try {
            return zzczd.zzj(this.zzlk, this.zzlk.getPackageName(), Integer.toString(this.zzlk.getPackageManager().getPackageInfo(this.zzlk.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final AdvertisingIdClient zzcq() {
        if (this.zzwo) {
            if (this.zzxv != null) {
                return this.zzxv;
            }
            Future future = this.zzxw;
            if (future != null) {
                try {
                    future.get(2000L, TimeUnit.MILLISECONDS);
                    this.zzxw = null;
                } catch (InterruptedException | ExecutionException unused) {
                } catch (TimeoutException unused2) {
                    this.zzxw.cancel(true);
                }
            }
            return this.zzxv;
        }
        return null;
    }

    public final int zzbz() {
        if (this.zzya != null) {
            return zzda.zzbz();
        }
        return Integer.MIN_VALUE;
    }
}
