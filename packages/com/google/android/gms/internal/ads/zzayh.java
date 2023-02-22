package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzayh extends zzayu implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {
    private static final Map<Integer, String> zzdxa = new HashMap();
    private final zzazm zzdxb;
    private final boolean zzdxc;
    private int zzdxd;
    private int zzdxe;
    private MediaPlayer zzdxf;
    private Uri zzdxg;
    private int zzdxh;
    private int zzdxi;
    private int zzdxj;
    private int zzdxk;
    private int zzdxl;
    private zzazh zzdxm;
    private boolean zzdxn;
    private int zzdxo;
    private zzayr zzdxp;

    public zzayh(Context context, boolean z, boolean z2, zzazk zzazkVar, zzazm zzazmVar) {
        super(context);
        this.zzdxd = 0;
        this.zzdxe = 0;
        setSurfaceTextureListener(this);
        this.zzdxb = zzazmVar;
        this.zzdxn = z;
        this.zzdxc = z2;
        zzazmVar.zzb(this);
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final String zzwq() {
        String str = this.zzdxn ? " spherical" : "";
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void zza(zzayr zzayrVar) {
        this.zzdxp = zzayrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        zzrp zze = zzrp.zze(parse);
        if (zze == null || zze.url != null) {
            if (zze != null) {
                parse = Uri.parse(zze.url);
            }
            this.zzdxg = parse;
            this.zzdxo = 0;
            zzwr();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void stop() {
        zzaug.zzdy("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzdxf;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzdxf.release();
            this.zzdxf = null;
            zzcq(0);
            this.zzdxe = 0;
        }
        this.zzdxb.onStop();
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        zzaug.zzdy(sb.toString());
        this.zzdxh = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.zzdxi = videoHeight;
        if (this.zzdxh == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        zzaug.zzdy("AdMediaPlayerView prepared");
        zzcq(2);
        this.zzdxb.zzel();
        zzaul.zzdsu.post(new zzayj(this));
        this.zzdxh = mediaPlayer.getVideoWidth();
        this.zzdxi = mediaPlayer.getVideoHeight();
        int i = this.zzdxo;
        if (i != 0) {
            seekTo(i);
        }
        zzws();
        int i2 = this.zzdxh;
        int i3 = this.zzdxi;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        zzaug.zzet(sb.toString());
        if (this.zzdxe == 3) {
            play();
        }
        zzwu();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        zzaug.zzdy("AdMediaPlayerView completion");
        zzcq(5);
        this.zzdxe = 5;
        zzaul.zzdsu.post(new zzaym(this));
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = zzdxa.get(Integer.valueOf(i));
        String str2 = zzdxa.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        zzaug.zzdy(sb.toString());
        return true;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = zzdxa.get(Integer.valueOf(i));
        String str2 = zzdxa.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        zzaug.zzeu(sb.toString());
        zzcq(-1);
        this.zzdxe = -1;
        zzaul.zzdsu.post(new zzayl(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.zzdxj = i;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzaug.zzdy("AdMediaPlayerView surface created");
        zzwr();
        zzaul.zzdsu.post(new zzayo(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzaug.zzdy("AdMediaPlayerView surface changed");
        boolean z = true;
        boolean z2 = this.zzdxe == 3;
        z = (this.zzdxh == i && this.zzdxi == i2) ? false : false;
        if (this.zzdxf != null && z2 && z) {
            int i3 = this.zzdxo;
            if (i3 != 0) {
                seekTo(i3);
            }
            play();
        }
        zzazh zzazhVar = this.zzdxm;
        if (zzazhVar != null) {
            zzazhVar.zzl(i, i2);
        }
        zzaul.zzdsu.post(new zzayn(this, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzaug.zzdy("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zzdxf;
        if (mediaPlayer != null && this.zzdxo == 0) {
            this.zzdxo = mediaPlayer.getCurrentPosition();
        }
        zzazh zzazhVar = this.zzdxm;
        if (zzazhVar != null) {
            zzazhVar.zzxh();
        }
        zzaul.zzdsu.post(new zzayq(this));
        zzam(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzdxb.zzc(this);
        this.zzdxx.zza(surfaceTexture, this.zzdxp);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        zzaug.zzdy(sb.toString());
        zzaul.zzdsu.post(new Runnable(this, i) { // from class: com.google.android.gms.internal.ads.zzayk
            private final int zzdtk;
            private final zzayh zzdxs;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdxs = this;
                this.zzdtk = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzdxs.zzcr(this.zzdtk);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int defaultSize = getDefaultSize(this.zzdxh, i);
        int defaultSize2 = getDefaultSize(this.zzdxi, i2);
        if (this.zzdxh > 0 && this.zzdxi > 0 && this.zzdxm == null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                int i4 = this.zzdxh;
                int i5 = i4 * size2;
                int i6 = this.zzdxi;
                if (i5 < size * i6) {
                    defaultSize = (i4 * size2) / i6;
                    defaultSize2 = size2;
                } else {
                    if (i4 * size2 > size * i6) {
                        defaultSize2 = (i6 * size) / i4;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                }
            } else if (mode == 1073741824) {
                int i7 = (this.zzdxi * size) / this.zzdxh;
                if (mode2 != Integer.MIN_VALUE || i7 <= size2) {
                    defaultSize2 = i7;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else if (mode2 == 1073741824) {
                int i8 = (this.zzdxh * size2) / this.zzdxi;
                if (mode != Integer.MIN_VALUE || i8 <= size) {
                    defaultSize = i8;
                    defaultSize2 = size2;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                int i9 = this.zzdxh;
                int i10 = this.zzdxi;
                if (mode2 != Integer.MIN_VALUE || i10 <= size2) {
                    defaultSize2 = i10;
                } else {
                    i9 = (i9 * size2) / i10;
                    defaultSize2 = size2;
                }
                if (mode != Integer.MIN_VALUE || i9 <= size) {
                    defaultSize = i9;
                } else {
                    defaultSize2 = (this.zzdxi * size) / this.zzdxh;
                    defaultSize = size;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        zzazh zzazhVar = this.zzdxm;
        if (zzazhVar != null) {
            zzazhVar.zzl(defaultSize, defaultSize2);
        }
        if (Build.VERSION.SDK_INT == 16) {
            int i11 = this.zzdxk;
            if ((i11 > 0 && i11 != defaultSize) || ((i3 = this.zzdxl) > 0 && i3 != defaultSize2)) {
                zzws();
            }
            this.zzdxk = defaultSize;
            this.zzdxl = defaultSize2;
        }
    }

    @Override // android.view.View
    public final String toString() {
        String name = getClass().getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    private final void zzwr() {
        zzaug.zzdy("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzdxg == null || surfaceTexture == null) {
            return;
        }
        zzam(false);
        try {
            com.google.android.gms.ads.internal.zzq.zzkz();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.zzdxf = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.zzdxf.setOnCompletionListener(this);
            this.zzdxf.setOnErrorListener(this);
            this.zzdxf.setOnInfoListener(this);
            this.zzdxf.setOnPreparedListener(this);
            this.zzdxf.setOnVideoSizeChangedListener(this);
            this.zzdxj = 0;
            if (this.zzdxn) {
                zzazh zzazhVar = new zzazh(getContext());
                this.zzdxm = zzazhVar;
                zzazhVar.zza(surfaceTexture, getWidth(), getHeight());
                this.zzdxm.start();
                SurfaceTexture zzxi = this.zzdxm.zzxi();
                if (zzxi != null) {
                    surfaceTexture = zzxi;
                } else {
                    this.zzdxm.zzxh();
                    this.zzdxm = null;
                }
            }
            this.zzdxf.setDataSource(getContext(), this.zzdxg);
            com.google.android.gms.ads.internal.zzq.zzla();
            this.zzdxf.setSurface(new Surface(surfaceTexture));
            this.zzdxf.setAudioStreamType(3);
            this.zzdxf.setScreenOnWhilePlaying(true);
            this.zzdxf.prepareAsync();
            zzcq(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e) {
            String valueOf = String.valueOf(this.zzdxg);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
            sb.append("Failed to initialize MediaPlayer at ");
            sb.append(valueOf);
            zzaug.zzd(sb.toString(), e);
            onError(this.zzdxf, 1, 0);
        }
    }

    private final void zzws() {
        if (this.zzdxc && zzwt() && this.zzdxf.getCurrentPosition() > 0 && this.zzdxe != 3) {
            zzaug.zzdy("AdMediaPlayerView nudging MediaPlayer");
            zzd(0.0f);
            this.zzdxf.start();
            int currentPosition = this.zzdxf.getCurrentPosition();
            long currentTimeMillis = com.google.android.gms.ads.internal.zzq.zzkq().currentTimeMillis();
            while (zzwt() && this.zzdxf.getCurrentPosition() == currentPosition && com.google.android.gms.ads.internal.zzq.zzkq().currentTimeMillis() - currentTimeMillis <= 250) {
            }
            this.zzdxf.pause();
            zzwu();
        }
    }

    private final void zzam(boolean z) {
        zzaug.zzdy("AdMediaPlayerView release");
        zzazh zzazhVar = this.zzdxm;
        if (zzazhVar != null) {
            zzazhVar.zzxh();
            this.zzdxm = null;
        }
        MediaPlayer mediaPlayer = this.zzdxf;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zzdxf.release();
            this.zzdxf = null;
            zzcq(0);
            if (z) {
                this.zzdxe = 0;
                this.zzdxe = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void play() {
        zzaug.zzdy("AdMediaPlayerView play");
        if (zzwt()) {
            this.zzdxf.start();
            zzcq(3);
            this.zzdxx.zzww();
            zzaul.zzdsu.post(new zzayp(this));
        }
        this.zzdxe = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void pause() {
        zzaug.zzdy("AdMediaPlayerView pause");
        if (zzwt() && this.zzdxf.isPlaying()) {
            this.zzdxf.pause();
            zzcq(4);
            zzaul.zzdsu.post(new zzays(this));
        }
        this.zzdxe = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final int getDuration() {
        if (zzwt()) {
            return this.zzdxf.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final int getCurrentPosition() {
        if (zzwt()) {
            return this.zzdxf.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void seekTo(int i) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        zzaug.zzdy(sb.toString());
        if (zzwt()) {
            this.zzdxf.seekTo(i);
            this.zzdxo = 0;
            return;
        }
        this.zzdxo = i;
    }

    private final boolean zzwt() {
        int i;
        return (this.zzdxf == null || (i = this.zzdxd) == -1 || i == 0 || i == 1) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void zza(float f, float f2) {
        zzazh zzazhVar = this.zzdxm;
        if (zzazhVar != null) {
            zzazhVar.zzb(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final int getVideoWidth() {
        MediaPlayer mediaPlayer = this.zzdxf;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final int getVideoHeight() {
        MediaPlayer mediaPlayer = this.zzdxf;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzayu, com.google.android.gms.internal.ads.zzazn
    public final void zzwu() {
        zzd(this.zzdxy.getVolume());
    }

    private final void zzd(float f) {
        MediaPlayer mediaPlayer = this.zzdxf;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f, f);
                return;
            } catch (IllegalStateException unused) {
                return;
            }
        }
        zzaug.zzeu("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
    }

    private final void zzcq(int i) {
        if (i == 3) {
            this.zzdxb.zzxw();
            this.zzdxy.zzxw();
        } else if (this.zzdxd == 3) {
            this.zzdxb.zzxx();
            this.zzdxy.zzxx();
        }
        this.zzdxd = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzcr(int i) {
        zzayr zzayrVar = this.zzdxp;
        if (zzayrVar != null) {
            zzayrVar.onWindowVisibilityChanged(i);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            zzdxa.put(-1004, "MEDIA_ERROR_IO");
            zzdxa.put(-1007, "MEDIA_ERROR_MALFORMED");
            zzdxa.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            zzdxa.put(-110, "MEDIA_ERROR_TIMED_OUT");
            zzdxa.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        zzdxa.put(100, "MEDIA_ERROR_SERVER_DIED");
        zzdxa.put(1, "MEDIA_ERROR_UNKNOWN");
        zzdxa.put(1, "MEDIA_INFO_UNKNOWN");
        zzdxa.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        zzdxa.put(701, "MEDIA_INFO_BUFFERING_START");
        zzdxa.put(702, "MEDIA_INFO_BUFFERING_END");
        zzdxa.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        zzdxa.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        zzdxa.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (Build.VERSION.SDK_INT >= 19) {
            zzdxa.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            zzdxa.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }
}
