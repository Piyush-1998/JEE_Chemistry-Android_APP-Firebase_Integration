package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzom extends Surface {
    private static boolean zzbha;
    private static boolean zzbhb;
    private final boolean zzayy;
    private final zzoo zzbhc;
    private boolean zzbhd;

    public static synchronized boolean zzc(Context context) {
        boolean z;
        synchronized (zzom.class) {
            if (!zzbhb) {
                if (zzof.SDK_INT >= 17) {
                    boolean z2 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        if (!(zzof.SDK_INT == 24 && (zzof.MODEL.startsWith("SM-G950") || zzof.MODEL.startsWith("SM-G955")) && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) {
                            z2 = true;
                        }
                    }
                    zzbha = z2;
                }
                zzbhb = true;
            }
            z = zzbha;
        }
        return z;
    }

    public static zzom zzc(Context context, boolean z) {
        if (zzof.SDK_INT < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
        zznr.checkState(!z || zzc(context));
        return new zzoo().zzl(z);
    }

    private zzom(zzoo zzooVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.zzbhc = zzooVar;
        this.zzayy = z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzbhc) {
            if (!this.zzbhd) {
                this.zzbhc.release();
                this.zzbhd = true;
            }
        }
    }
}
