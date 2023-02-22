package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzfj {
    private static final String TAG = zzfj.class.getSimpleName();
    private final String className;
    private final String zzaaj;
    private final Class<?>[] zzaam;
    private final zzdx zzvo;
    private final int zzaak = 2;
    private volatile Method zzaal = null;
    private CountDownLatch zzaan = new CountDownLatch(1);

    public zzfj(zzdx zzdxVar, String str, String str2, Class<?>... clsArr) {
        this.zzvo = zzdxVar;
        this.className = str;
        this.zzaaj = str2;
        this.zzaam = clsArr;
        zzdxVar.zzce().submit(new zzfi(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzcy() {
        try {
            Class loadClass = this.zzvo.zzcf().loadClass(zzb(this.zzvo.zzch(), this.className));
            if (loadClass == null) {
                return;
            }
            this.zzaal = loadClass.getMethod(zzb(this.zzvo.zzch(), this.zzaaj), this.zzaam);
            if (this.zzaal == null) {
            }
        } catch (zzdk unused) {
        } catch (UnsupportedEncodingException unused2) {
        } catch (ClassNotFoundException unused3) {
        } catch (NoSuchMethodException unused4) {
        } catch (NullPointerException unused5) {
        } finally {
            this.zzaan.countDown();
        }
    }

    private final String zzb(byte[] bArr, String str) throws zzdk, UnsupportedEncodingException {
        return new String(this.zzvo.zzcg().zza(bArr, str), "UTF-8");
    }

    public final Method zzcz() {
        if (this.zzaal != null) {
            return this.zzaal;
        }
        try {
            if (this.zzaan.await(2L, TimeUnit.SECONDS)) {
                return this.zzaal;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
