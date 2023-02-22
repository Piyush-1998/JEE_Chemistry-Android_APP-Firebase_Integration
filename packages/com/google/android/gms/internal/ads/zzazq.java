package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzazq extends zzayu implements TextureView.SurfaceTextureListener, zzbao {
    private Surface zzbhs;
    private final zzazm zzdxb;
    private final boolean zzdxc;
    private int zzdxh;
    private int zzdxi;
    private int zzdxk;
    private int zzdxl;
    private zzazh zzdxm;
    private final boolean zzdxn;
    private zzayr zzdxp;
    private final zzazj zzdya;
    private String[] zzdyn;
    private final zzazk zzebk;
    private zzbag zzebl;
    private String zzebm;
    private boolean zzebn;
    private int zzebo;
    private boolean zzebp;
    private boolean zzebq;
    private float zzebr;

    public zzazq(Context context, zzazm zzazmVar, zzazj zzazjVar, boolean z, boolean z2, zzazk zzazkVar) {
        super(context);
        this.zzebo = 1;
        this.zzdxc = z2;
        this.zzdya = zzazjVar;
        this.zzdxb = zzazmVar;
        this.zzdxn = z;
        this.zzebk = zzazkVar;
        setSurfaceTextureListener(this);
        this.zzdxb.zzb(this);
    }

    private final zzbag zzxz() {
        return new zzbag(this.zzdya.getContext(), this.zzebk);
    }

    private final String zzya() {
        return com.google.android.gms.ads.internal.zzq.zzkj().zzr(this.zzdya.getContext(), this.zzdya.zzxr().zzblz);
    }

    private final boolean zzyb() {
        return (this.zzebl == null || this.zzebn) ? false : true;
    }

    private final boolean zzyc() {
        return zzyb() && this.zzebo != 1;
    }

    private final void zzyd() {
        String str;
        if (this.zzebl != null || (str = this.zzebm) == null || this.zzbhs == null) {
            return;
        }
        if (str.startsWith("cache:")) {
            zzbax zzez = this.zzdya.zzez(this.zzebm);
            if (zzez instanceof zzbbm) {
                this.zzebl = ((zzbbm) zzez).zzyu();
            } else if (zzez instanceof zzbbj) {
                zzbbj zzbbjVar = (zzbbj) zzez;
                String zzya = zzya();
                ByteBuffer byteBuffer = zzbbjVar.getByteBuffer();
                boolean zzys = zzbbjVar.zzys();
                String url = zzbbjVar.getUrl();
                if (url == null) {
                    zzaug.zzeu("Stream cache URL is null.");
                    return;
                }
                zzbag zzxz = zzxz();
                this.zzebl = zzxz;
                zzxz.zza(new Uri[]{Uri.parse(url)}, zzya, byteBuffer, zzys);
            } else {
                String valueOf = String.valueOf(this.zzebm);
                zzaug.zzeu(valueOf.length() != 0 ? "Stream cache miss: ".concat(valueOf) : new String("Stream cache miss: "));
                return;
            }
        } else {
            this.zzebl = zzxz();
            String zzya2 = zzya();
            Uri[] uriArr = new Uri[this.zzdyn.length];
            int i = 0;
            while (true) {
                String[] strArr = this.zzdyn;
                if (i >= strArr.length) {
                    break;
                }
                uriArr[i] = Uri.parse(strArr[i]);
                i++;
            }
            this.zzebl.zza(uriArr, zzya2);
        }
        this.zzebl.zza(this);
        zza(this.zzbhs, false);
        int playbackState = this.zzebl.zzyo().getPlaybackState();
        this.zzebo = playbackState;
        if (playbackState == 3) {
            zzye();
        }
    }

    private final void zza(Surface surface, boolean z) {
        zzbag zzbagVar = this.zzebl;
        if (zzbagVar != null) {
            zzbagVar.zza(surface, z);
        } else {
            zzaug.zzeu("Trying to set surface before player is initalized.");
        }
    }

    private final void zza(float f, boolean z) {
        zzbag zzbagVar = this.zzebl;
        if (zzbagVar != null) {
            zzbagVar.zzb(f, z);
        } else {
            zzaug.zzeu("Trying to set volume before player is initalized.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayu, com.google.android.gms.internal.ads.zzazn
    public final void zzwu() {
        zza(this.zzdxy.getVolume(), false);
    }

    private final void zzye() {
        if (this.zzebp) {
            return;
        }
        this.zzebp = true;
        zzaul.zzdsu.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzazp
            private final zzazq zzebj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzebj = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzebj.zzyn();
            }
        });
        zzwu();
        this.zzdxb.zzel();
        if (this.zzebq) {
            play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final String zzwq() {
        String str = this.zzdxn ? " spherical" : "";
        return str.length() != 0 ? "ExoPlayer/3".concat(str) : new String("ExoPlayer/3");
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void zza(zzayr zzayrVar) {
        this.zzdxp = zzayrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void setVideoPath(String str) {
        if (str != null) {
            this.zzebm = str;
            this.zzdyn = new String[]{str};
            zzyd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void zzb(String str, String[] strArr) {
        if (str != null) {
            if (strArr == null) {
                setVideoPath(str);
            }
            this.zzebm = str;
            this.zzdyn = (String[]) Arrays.copyOf(strArr, strArr.length);
            zzyd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void play() {
        if (zzyc()) {
            if (this.zzebk.zzeai) {
                zzyg();
            }
            this.zzebl.zzyo().zze(true);
            this.zzdxb.zzxw();
            this.zzdxy.zzxw();
            this.zzdxx.zzww();
            zzaul.zzdsu.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzazu
                private final zzazq zzebj;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzebj = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzebj.zzyl();
                }
            });
            return;
        }
        this.zzebq = true;
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void stop() {
        if (zzyb()) {
            this.zzebl.zzyo().stop();
            if (this.zzebl != null) {
                zza((Surface) null, true);
                zzbag zzbagVar = this.zzebl;
                if (zzbagVar != null) {
                    zzbagVar.zza((zzbao) null);
                    this.zzebl.release();
                    this.zzebl = null;
                }
                this.zzebo = 1;
                this.zzebn = false;
                this.zzebp = false;
                this.zzebq = false;
            }
        }
        this.zzdxb.zzxx();
        this.zzdxy.zzxx();
        this.zzdxb.onStop();
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void pause() {
        if (zzyc()) {
            if (this.zzebk.zzeai) {
                zzyh();
            }
            this.zzebl.zzyo().zze(false);
            this.zzdxb.zzxx();
            this.zzdxy.zzxx();
            zzaul.zzdsu.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzazt
                private final zzazq zzebj;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzebj = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzebj.zzyk();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void seekTo(int i) {
        if (zzyc()) {
            this.zzebl.zzyo().seekTo(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void zzcs(int i) {
        zzbag zzbagVar = this.zzebl;
        if (zzbagVar != null) {
            zzbagVar.zzyr().zzcz(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void zzct(int i) {
        zzbag zzbagVar = this.zzebl;
        if (zzbagVar != null) {
            zzbagVar.zzyr().zzda(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void zzcu(int i) {
        zzbag zzbagVar = this.zzebl;
        if (zzbagVar != null) {
            zzbagVar.zzyr().zzcu(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void zzcv(int i) {
        zzbag zzbagVar = this.zzebl;
        if (zzbagVar != null) {
            zzbagVar.zzyr().zzcv(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void zzcw(int i) {
        zzbag zzbagVar = this.zzebl;
        if (zzbagVar != null) {
            zzbagVar.zzcw(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void zza(float f, float f2) {
        zzazh zzazhVar = this.zzdxm;
        if (zzazhVar != null) {
            zzazhVar.zzb(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final int getCurrentPosition() {
        if (zzyc()) {
            return (int) this.zzebl.zzyo().zzdw();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final int getDuration() {
        if (zzyc()) {
            return (int) this.zzebl.zzyo().getDuration();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final int getVideoWidth() {
        return this.zzdxh;
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final int getVideoHeight() {
        return this.zzdxi;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.zzebr;
        if (f != 0.0f && this.zzdxm == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            float f4 = this.zzebr;
            if (f4 < f3) {
                measuredWidth = (int) (measuredHeight * f4);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzazh zzazhVar = this.zzdxm;
        if (zzazhVar != null) {
            zzazhVar.zzl(measuredWidth, measuredHeight);
        }
        if (Build.VERSION.SDK_INT == 16) {
            int i4 = this.zzdxk;
            if (((i4 > 0 && i4 != measuredWidth) || ((i3 = this.zzdxl) > 0 && i3 != measuredHeight)) && this.zzdxc && zzyb()) {
                zzgc zzyo = this.zzebl.zzyo();
                if (zzyo.zzdw() > 0 && !zzyo.zzdu()) {
                    zza(0.0f, true);
                    zzyo.zze(true);
                    long zzdw = zzyo.zzdw();
                    long currentTimeMillis = com.google.android.gms.ads.internal.zzq.zzkq().currentTimeMillis();
                    while (zzyb() && zzyo.zzdw() == zzdw && com.google.android.gms.ads.internal.zzq.zzkq().currentTimeMillis() - currentTimeMillis <= 250) {
                    }
                    zzyo.zze(false);
                    zzwu();
                }
            }
            this.zzdxk = measuredWidth;
            this.zzdxl = measuredHeight;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.zzdxn) {
            zzazh zzazhVar = new zzazh(getContext());
            this.zzdxm = zzazhVar;
            zzazhVar.zza(surfaceTexture, i, i2);
            this.zzdxm.start();
            SurfaceTexture zzxi = this.zzdxm.zzxi();
            if (zzxi != null) {
                surfaceTexture = zzxi;
            } else {
                this.zzdxm.zzxh();
                this.zzdxm = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzbhs = surface;
        if (this.zzebl == null) {
            zzyd();
        } else {
            zza(surface, true);
            if (!this.zzebk.zzeai) {
                zzyg();
            }
        }
        if (this.zzdxh == 0 || this.zzdxi == 0) {
            zzn(i, i2);
        } else {
            zzyf();
        }
        zzaul.zzdsu.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzazw
            private final zzazq zzebj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzebj = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzebj.zzyj();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        zzazh zzazhVar = this.zzdxm;
        if (zzazhVar != null) {
            zzazhVar.zzl(i, i2);
        }
        zzaul.zzdsu.post(new Runnable(this, i, i2) { // from class: com.google.android.gms.internal.ads.zzazv
            private final int zzdtk;
            private final int zzdtl;
            private final zzazq zzebj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzebj = this;
                this.zzdtk = i;
                this.zzdtl = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzebj.zzo(this.zzdtk, this.zzdtl);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzdxb.zzc(this);
        this.zzdxx.zza(surfaceTexture, this.zzdxp);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        pause();
        zzazh zzazhVar = this.zzdxm;
        if (zzazhVar != null) {
            zzazhVar.zzxh();
            this.zzdxm = null;
        }
        if (this.zzebl != null) {
            zzyh();
            Surface surface = this.zzbhs;
            if (surface != null) {
                surface.release();
            }
            this.zzbhs = null;
            zza((Surface) null, true);
        }
        zzaul.zzdsu.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzazy
            private final zzazq zzebj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzebj = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzebj.zzyi();
            }
        });
        return true;
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        zzaug.zzdy(sb.toString());
        zzaul.zzdsu.post(new Runnable(this, i) { // from class: com.google.android.gms.internal.ads.zzazx
            private final int zzdtk;
            private final zzazq zzebj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzebj = this;
                this.zzdtk = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzebj.zzcy(this.zzdtk);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbao
    public final void zzb(final boolean z, final long j) {
        if (this.zzdya != null) {
            zzaxn.zzdwm.execute(new Runnable(this, z, j) { // from class: com.google.android.gms.internal.ads.zzbaa
                private final boolean zzdyt;
                private final zzazq zzebj;
                private final long zzebv;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzebj = this;
                    this.zzdyt = z;
                    this.zzebv = j;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzebj.zzc(this.zzdyt, this.zzebv);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbao
    public final void zzcx(int i) {
        if (this.zzebo != i) {
            this.zzebo = i;
            if (i == 3) {
                zzye();
            } else if (i != 4) {
            } else {
                if (this.zzebk.zzeai) {
                    zzyh();
                }
                this.zzdxb.zzxx();
                this.zzdxy.zzxx();
                zzaul.zzdsu.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzazs
                    private final zzazq zzebj;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzebj = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzebj.zzym();
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbao
    public final void zzm(int i, int i2) {
        this.zzdxh = i;
        this.zzdxi = i2;
        zzyf();
    }

    @Override // com.google.android.gms.internal.ads.zzbao
    public final void zza(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        final String sb2 = sb.toString();
        String valueOf = String.valueOf(sb2);
        zzaug.zzeu(valueOf.length() != 0 ? "ExoPlayerAdapter error: ".concat(valueOf) : new String("ExoPlayerAdapter error: "));
        this.zzebn = true;
        if (this.zzebk.zzeai) {
            zzyh();
        }
        zzaul.zzdsu.post(new Runnable(this, sb2) { // from class: com.google.android.gms.internal.ads.zzazr
            private final String zzcyz;
            private final zzazq zzebj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzebj = this;
                this.zzcyz = sb2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzebj.zzfa(this.zzcyz);
            }
        });
    }

    private final void zzyf() {
        zzn(this.zzdxh, this.zzdxi);
    }

    private final void zzn(int i, int i2) {
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.zzebr != f) {
            this.zzebr = f;
            requestLayout();
        }
    }

    private final void zzyg() {
        zzbag zzbagVar = this.zzebl;
        if (zzbagVar != null) {
            zzbagVar.zzap(true);
        }
    }

    private final void zzyh() {
        zzbag zzbagVar = this.zzebl;
        if (zzbagVar != null) {
            zzbagVar.zzap(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(boolean z, long j) {
        this.zzdya.zza(z, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzcy(int i) {
        zzayr zzayrVar = this.zzdxp;
        if (zzayrVar != null) {
            zzayrVar.onWindowVisibilityChanged(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzyi() {
        zzayr zzayrVar = this.zzdxp;
        if (zzayrVar != null) {
            zzayrVar.zzwy();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(int i, int i2) {
        zzayr zzayrVar = this.zzdxp;
        if (zzayrVar != null) {
            zzayrVar.zzj(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzyj() {
        zzayr zzayrVar = this.zzdxp;
        if (zzayrVar != null) {
            zzayrVar.zzwv();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzyk() {
        zzayr zzayrVar = this.zzdxp;
        if (zzayrVar != null) {
            zzayrVar.onPaused();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzyl() {
        zzayr zzayrVar = this.zzdxp;
        if (zzayrVar != null) {
            zzayrVar.zzww();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzfa(String str) {
        zzayr zzayrVar = this.zzdxp;
        if (zzayrVar != null) {
            zzayrVar.zzn("ExoPlayerAdapter error", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzym() {
        zzayr zzayrVar = this.zzdxp;
        if (zzayrVar != null) {
            zzayrVar.zzwx();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzyn() {
        zzayr zzayrVar = this.zzdxp;
        if (zzayrVar != null) {
            zzayrVar.zzel();
        }
    }
}
