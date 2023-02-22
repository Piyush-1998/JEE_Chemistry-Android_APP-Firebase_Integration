package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzazh extends Thread implements SurfaceTexture.OnFrameAvailableListener, zzazi {
    private static final float[] zzdzj = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private int height;
    private int width;
    private final float[] zzdzg;
    private final zzazg zzdzk;
    private final float[] zzdzl;
    private final float[] zzdzm;
    private final float[] zzdzn;
    private final float[] zzdzo;
    private final float[] zzdzp;
    private final float[] zzdzq;
    private float zzdzr;
    private float zzdzs;
    private float zzdzt;
    private SurfaceTexture zzdzu;
    private SurfaceTexture zzdzv;
    private int zzdzw;
    private int zzdzx;
    private int zzdzy;
    private FloatBuffer zzdzz;
    private final CountDownLatch zzeaa;
    private final Object zzeab;
    private EGL10 zzeac;
    private EGLDisplay zzead;
    private EGLContext zzeae;
    private EGLSurface zzeaf;
    private volatile boolean zzeag;
    private volatile boolean zzeah;

    public zzazh(Context context) {
        super("SphericalVideoProcessor");
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(zzdzj.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.zzdzz = asFloatBuffer;
        asFloatBuffer.put(zzdzj).position(0);
        this.zzdzg = new float[9];
        this.zzdzl = new float[9];
        this.zzdzm = new float[9];
        this.zzdzn = new float[9];
        this.zzdzo = new float[9];
        this.zzdzp = new float[9];
        this.zzdzq = new float[9];
        this.zzdzr = Float.NaN;
        zzazg zzazgVar = new zzazg(context);
        this.zzdzk = zzazgVar;
        zzazgVar.zza(this);
        this.zzeaa = new CountDownLatch(1);
        this.zzeab = new Object();
    }

    public final void zza(SurfaceTexture surfaceTexture, int i, int i2) {
        this.width = i;
        this.height = i2;
        this.zzdzv = surfaceTexture;
    }

    public final void zzl(int i, int i2) {
        synchronized (this.zzeab) {
            this.width = i;
            this.height = i2;
            this.zzeag = true;
            this.zzeab.notifyAll();
        }
    }

    public final void zzxh() {
        synchronized (this.zzeab) {
            this.zzeah = true;
            this.zzdzv = null;
            this.zzeab.notifyAll();
        }
    }

    public final SurfaceTexture zzxi() {
        if (this.zzdzv == null) {
            return null;
        }
        try {
            this.zzeaa.await();
        } catch (InterruptedException unused) {
        }
        return this.zzdzu;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.zzdzy++;
        synchronized (this.zzeab) {
            this.zzeab.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final void zzst() {
        synchronized (this.zzeab) {
            this.zzeab.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.SurfaceTexture, android.graphics.SurfaceTexture$OnFrameAvailableListener] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazh.run():void");
    }

    public final void zzb(float f, float f2) {
        float f3;
        float f4;
        float f5;
        int i = this.width;
        int i2 = this.height;
        if (i > i2) {
            f3 = (f * 1.7453293f) / i;
            f4 = f2 * 1.7453293f;
            f5 = i;
        } else {
            f3 = (f * 1.7453293f) / i2;
            f4 = f2 * 1.7453293f;
            f5 = i2;
        }
        this.zzdzs -= f3;
        float f6 = this.zzdzt - (f4 / f5);
        this.zzdzt = f6;
        if (f6 < -1.5707964f) {
            this.zzdzt = -1.5707964f;
        }
        if (this.zzdzt > 1.5707964f) {
            this.zzdzt = 1.5707964f;
        }
    }

    private static void zza(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    private static void zza(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    private static void zzb(float[] fArr, float f) {
        double d = f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static int zzd(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        zzey("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            zzey("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            zzey("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            zzey("getShaderiv");
            if (iArr[0] == 0) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Could not compile shader ");
                sb.append(i);
                sb.append(":");
                Log.e("SphericalVideoRenderer", sb.toString());
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                zzey("deleteShader");
                return 0;
            }
            return glCreateShader;
        }
        return glCreateShader;
    }

    private final boolean zzxj() {
        EGLSurface eGLSurface = this.zzeaf;
        boolean z = false;
        if (eGLSurface != null && eGLSurface != EGL10.EGL_NO_SURFACE) {
            z = this.zzeac.eglDestroySurface(this.zzead, this.zzeaf) | this.zzeac.eglMakeCurrent(this.zzead, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT) | false;
            this.zzeaf = null;
        }
        EGLContext eGLContext = this.zzeae;
        if (eGLContext != null) {
            z |= this.zzeac.eglDestroyContext(this.zzead, eGLContext);
            this.zzeae = null;
        }
        EGLDisplay eGLDisplay = this.zzead;
        if (eGLDisplay != null) {
            boolean eglTerminate = z | this.zzeac.eglTerminate(eGLDisplay);
            this.zzead = null;
            return eglTerminate;
        }
        return z;
    }

    private static void zzey(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }
}
