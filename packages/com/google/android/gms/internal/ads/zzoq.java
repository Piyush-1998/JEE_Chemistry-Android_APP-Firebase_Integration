package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzoq extends zzkl {
    private static final int[] zzbhj = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private int zzagf;
    private boolean zzajm;
    private final zzou zzbhk;
    private final zzov zzbhl;
    private final long zzbhm;
    private final int zzbhn;
    private final boolean zzbho;
    private final long[] zzbhp;
    private zzgo[] zzbhq;
    private zzos zzbhr;
    private Surface zzbhs;
    private Surface zzbht;
    private int zzbhu;
    private boolean zzbhv;
    private long zzbhw;
    private long zzbhx;
    private int zzbhy;
    private int zzbhz;
    private int zzbia;
    private float zzbib;
    private int zzbic;
    private int zzbid;
    private int zzbie;
    private float zzbif;
    private int zzbig;
    private int zzbih;
    private int zzbii;
    private float zzbij;
    zzor zzbik;
    private long zzbil;
    private int zzbim;
    private final Context zzlk;

    public zzoq(Context context, zzkn zzknVar, long j, Handler handler, zzow zzowVar, int i) {
        this(context, zzknVar, 0L, null, false, handler, zzowVar, -1);
    }

    private static boolean zzeg(long j) {
        return j < -30000;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzoq(Context context, zzkn zzknVar, long j, zzis<Object> zzisVar, boolean z, Handler handler, zzow zzowVar, int i) {
        super(2, zzknVar, null, false);
        boolean z2 = false;
        this.zzbhm = 0L;
        this.zzbhn = -1;
        this.zzlk = context.getApplicationContext();
        this.zzbhk = new zzou(context);
        this.zzbhl = new zzov(handler, zzowVar);
        if (zzof.SDK_INT <= 22 && "foster".equals(zzof.DEVICE) && "NVIDIA".equals(zzof.MANUFACTURER)) {
            z2 = true;
        }
        this.zzbho = z2;
        this.zzbhp = new long[10];
        this.zzbil = -9223372036854775807L;
        this.zzbhw = -9223372036854775807L;
        this.zzbic = -1;
        this.zzbid = -1;
        this.zzbif = -1.0f;
        this.zzbib = -1.0f;
        this.zzbhu = 1;
        zziw();
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    protected final int zza(zzkn zzknVar, zzgo zzgoVar) throws zzkt {
        boolean z;
        String str = zzgoVar.zzafc;
        if (zzny.zzbd(str)) {
            zzin zzinVar = zzgoVar.zzaff;
            if (zzinVar != null) {
                z = false;
                for (int i = 0; i < zzinVar.zzaml; i++) {
                    z |= zzinVar.zzz(i).zzamm;
                }
            } else {
                z = false;
            }
            zzkm zzc = zzknVar.zzc(str, z);
            if (zzc == null) {
                return 1;
            }
            boolean zzaz = zzc.zzaz(zzgoVar.zzaez);
            if (zzaz && zzgoVar.width > 0 && zzgoVar.height > 0) {
                if (zzof.SDK_INT >= 21) {
                    zzaz = zzc.zza(zzgoVar.width, zzgoVar.height, zzgoVar.zzafg);
                } else {
                    boolean z2 = zzgoVar.width * zzgoVar.height <= zzkp.zzgw();
                    if (!z2) {
                        int i2 = zzgoVar.width;
                        int i3 = zzgoVar.height;
                        String str2 = zzof.zzbgt;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                        sb.append("FalseCheck [legacyFrameSize, ");
                        sb.append(i2);
                        sb.append("x");
                        sb.append(i3);
                        sb.append("] [");
                        sb.append(str2);
                        sb.append("]");
                        Log.d("MediaCodecVideoRenderer", sb.toString());
                    }
                    zzaz = z2;
                }
            }
            return (zzaz ? 3 : 2) | (zzc.zzayx ? 8 : 4) | (zzc.zzajm ? 16 : 0);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzkl, com.google.android.gms.internal.ads.zzgb
    public final void zzd(boolean z) throws zzgd {
        super.zzd(z);
        int i = zzds().zzagf;
        this.zzagf = i;
        this.zzajm = i != 0;
        this.zzbhl.zzc(this.zzayw);
        this.zzbhk.enable();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgb
    public final void zza(zzgo[] zzgoVarArr, long j) throws zzgd {
        this.zzbhq = zzgoVarArr;
        if (this.zzbil == -9223372036854775807L) {
            this.zzbil = j;
        } else {
            int i = this.zzbim;
            long[] jArr = this.zzbhp;
            if (i == jArr.length) {
                long j2 = jArr[i - 1];
                StringBuilder sb = new StringBuilder(65);
                sb.append("Too many stream changes, so dropping offset: ");
                sb.append(j2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
            } else {
                this.zzbim = i + 1;
            }
            this.zzbhp[this.zzbim - 1] = j;
        }
        super.zza(zzgoVarArr, j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzkl, com.google.android.gms.internal.ads.zzgb
    public final void zza(long j, boolean z) throws zzgd {
        super.zza(j, z);
        zziu();
        this.zzbhz = 0;
        int i = this.zzbim;
        if (i != 0) {
            this.zzbil = this.zzbhp[i - 1];
            this.zzbim = 0;
        }
        if (z) {
            zzit();
        } else {
            this.zzbhw = -9223372036854775807L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkl, com.google.android.gms.internal.ads.zzgx
    public final boolean isReady() {
        Surface surface;
        if (super.isReady() && (this.zzbhv || (((surface = this.zzbht) != null && this.zzbhs == surface) || zzgp() == null))) {
            this.zzbhw = -9223372036854775807L;
            return true;
        } else if (this.zzbhw == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.zzbhw) {
                return true;
            }
            this.zzbhw = -9223372036854775807L;
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzkl, com.google.android.gms.internal.ads.zzgb
    public final void onStarted() {
        super.onStarted();
        this.zzbhy = 0;
        this.zzbhx = SystemClock.elapsedRealtime();
        this.zzbhw = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzkl, com.google.android.gms.internal.ads.zzgb
    public final void onStopped() {
        zziz();
        super.onStopped();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzkl, com.google.android.gms.internal.ads.zzgb
    public final void zzdr() {
        this.zzbic = -1;
        this.zzbid = -1;
        this.zzbif = -1.0f;
        this.zzbib = -1.0f;
        this.zzbil = -9223372036854775807L;
        this.zzbim = 0;
        zziw();
        zziu();
        this.zzbhk.disable();
        this.zzbik = null;
        this.zzajm = false;
        try {
            super.zzdr();
        } finally {
            this.zzayw.zzfy();
            this.zzbhl.zzd(this.zzayw);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgb, com.google.android.gms.internal.ads.zzge
    public final void zza(int i, Object obj) throws zzgd {
        if (i != 1) {
            if (i == 4) {
                this.zzbhu = ((Integer) obj).intValue();
                MediaCodec zzgp = zzgp();
                if (zzgp != null) {
                    zzgp.setVideoScalingMode(this.zzbhu);
                    return;
                }
                return;
            }
            super.zza(i, obj);
            return;
        }
        Surface surface = (Surface) obj;
        if (surface == null) {
            Surface surface2 = this.zzbht;
            if (surface2 != null) {
                surface = surface2;
            } else {
                zzkm zzgq = zzgq();
                if (zzgq != null && zzm(zzgq.zzayy)) {
                    surface = zzom.zzc(this.zzlk, zzgq.zzayy);
                    this.zzbht = surface;
                }
            }
        }
        if (this.zzbhs != surface) {
            this.zzbhs = surface;
            int state = getState();
            if (state == 1 || state == 2) {
                MediaCodec zzgp2 = zzgp();
                if (zzof.SDK_INT >= 23 && zzgp2 != null && surface != null) {
                    zzgp2.setOutputSurface(surface);
                } else {
                    zzgr();
                    zzgo();
                }
            }
            if (surface != null && surface != this.zzbht) {
                zziy();
                zziu();
                if (state == 2) {
                    zzit();
                    return;
                }
                return;
            }
            zziw();
            zziu();
        } else if (surface == null || surface == this.zzbht) {
        } else {
            zziy();
            if (this.zzbhv) {
                this.zzbhl.zza(this.zzbhs);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    protected final boolean zza(zzkm zzkmVar) {
        return this.zzbhs != null || zzm(zzkmVar.zzayy);
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    protected final void zza(zzkm zzkmVar, MediaCodec mediaCodec, zzgo zzgoVar, MediaCrypto mediaCrypto) throws zzkt {
        zzos zzosVar;
        Point point;
        zzgo[] zzgoVarArr = this.zzbhq;
        int i = zzgoVar.width;
        int i2 = zzgoVar.height;
        int zzi = zzi(zzgoVar);
        if (zzgoVarArr.length == 1) {
            zzosVar = new zzos(i, i2, zzi);
        } else {
            boolean z = false;
            for (zzgo zzgoVar2 : zzgoVarArr) {
                if (zza(zzkmVar.zzayx, zzgoVar, zzgoVar2)) {
                    z |= zzgoVar2.width == -1 || zzgoVar2.height == -1;
                    i = Math.max(i, zzgoVar2.width);
                    i2 = Math.max(i2, zzgoVar2.height);
                    zzi = Math.max(zzi, zzi(zzgoVar2));
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
                boolean z2 = zzgoVar.height > zzgoVar.width;
                int i3 = z2 ? zzgoVar.height : zzgoVar.width;
                int i4 = z2 ? zzgoVar.width : zzgoVar.height;
                float f = i4 / i3;
                int[] iArr = zzbhj;
                int length = iArr.length;
                int i5 = 0;
                while (i5 < length) {
                    int i6 = length;
                    int i7 = iArr[i5];
                    int[] iArr2 = iArr;
                    int i8 = (int) (i7 * f);
                    if (i7 <= i3 || i8 <= i4) {
                        break;
                    }
                    int i9 = i3;
                    int i10 = i4;
                    if (zzof.SDK_INT >= 21) {
                        int i11 = z2 ? i8 : i7;
                        if (!z2) {
                            i7 = i8;
                        }
                        Point zzc = zzkmVar.zzc(i11, i7);
                        if (zzkmVar.zza(zzc.x, zzc.y, zzgoVar.zzafg)) {
                            point = zzc;
                            break;
                        }
                        i5++;
                        length = i6;
                        iArr = iArr2;
                        i3 = i9;
                        i4 = i10;
                    } else {
                        int zze = zzof.zze(i7, 16) << 4;
                        int zze2 = zzof.zze(i8, 16) << 4;
                        if (zze * zze2 <= zzkp.zzgw()) {
                            int i12 = z2 ? zze2 : zze;
                            if (!z2) {
                                zze = zze2;
                            }
                            point = new Point(i12, zze);
                        } else {
                            i5++;
                            length = i6;
                            iArr = iArr2;
                            i3 = i9;
                            i4 = i10;
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i = Math.max(i, point.x);
                    i2 = Math.max(i2, point.y);
                    zzi = Math.max(zzi, zza(zzgoVar.zzafc, i, i2));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i);
                    sb2.append("x");
                    sb2.append(i2);
                    Log.w("MediaCodecVideoRenderer", sb2.toString());
                }
            }
            zzosVar = new zzos(i, i2, zzi);
        }
        this.zzbhr = zzosVar;
        boolean z3 = this.zzbho;
        int i13 = this.zzagf;
        MediaFormat zzek = zzgoVar.zzek();
        zzek.setInteger("max-width", zzosVar.width);
        zzek.setInteger("max-height", zzosVar.height);
        if (zzosVar.zzbio != -1) {
            zzek.setInteger("max-input-size", zzosVar.zzbio);
        }
        if (z3) {
            zzek.setInteger("auto-frc", 0);
        }
        if (i13 != 0) {
            zzek.setFeatureEnabled("tunneled-playback", true);
            zzek.setInteger("audio-session-id", i13);
        }
        if (this.zzbhs == null) {
            zznr.checkState(zzm(zzkmVar.zzayy));
            if (this.zzbht == null) {
                this.zzbht = zzom.zzc(this.zzlk, zzkmVar.zzayy);
            }
            this.zzbhs = this.zzbht;
        }
        mediaCodec.configure(zzek, this.zzbhs, (MediaCrypto) null, 0);
        if (zzof.SDK_INT < 23 || !this.zzajm) {
            return;
        }
        this.zzbik = new zzor(this, mediaCodec);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzgr() {
        try {
            super.zzgr();
        } finally {
            Surface surface = this.zzbht;
            if (surface != null) {
                if (this.zzbhs == surface) {
                    this.zzbhs = null;
                }
                this.zzbht.release();
                this.zzbht = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    protected final void zzc(String str, long j, long j2) {
        this.zzbhl.zzb(str, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzd(zzgo zzgoVar) throws zzgd {
        super.zzd(zzgoVar);
        this.zzbhl.zzc(zzgoVar);
        this.zzbib = zzgoVar.zzafi == -1.0f ? 1.0f : zzgoVar.zzafi;
        this.zzbia = zzj(zzgoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    protected final void zza(zzik zzikVar) {
        if (zzof.SDK_INT >= 23 || !this.zzajm) {
            return;
        }
        zziv();
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    protected final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.zzbic = integer;
        if (z) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.zzbid = integer2;
        this.zzbif = this.zzbib;
        if (zzof.SDK_INT >= 21) {
            int i = this.zzbia;
            if (i == 90 || i == 270) {
                int i2 = this.zzbic;
                this.zzbic = this.zzbid;
                this.zzbid = i2;
                this.zzbif = 1.0f / this.zzbif;
            }
        } else {
            this.zzbie = this.zzbia;
        }
        mediaCodec.setVideoScalingMode(this.zzbhu);
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    protected final boolean zza(MediaCodec mediaCodec, boolean z, zzgo zzgoVar, zzgo zzgoVar2) {
        return zza(z, zzgoVar, zzgoVar2) && zzgoVar2.width <= this.zzbhr.width && zzgoVar2.height <= this.zzbhr.height && zzgoVar2.zzafd <= this.zzbhr.zzbio;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    protected final boolean zza(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        while (true) {
            int i3 = this.zzbim;
            if (i3 == 0) {
                break;
            }
            long[] jArr = this.zzbhp;
            if (j3 < jArr[0]) {
                break;
            }
            this.zzbil = jArr[0];
            int i4 = i3 - 1;
            this.zzbim = i4;
            System.arraycopy(jArr, 1, jArr, 0, i4);
        }
        long j4 = j3 - this.zzbil;
        if (z) {
            zza(mediaCodec, i, j4);
            return true;
        }
        long j5 = j3 - j;
        if (this.zzbhs == this.zzbht) {
            if (zzeg(j5)) {
                zza(mediaCodec, i, j4);
                return true;
            }
            return false;
        } else if (!this.zzbhv) {
            if (zzof.SDK_INT >= 21) {
                zza(mediaCodec, i, j4, System.nanoTime());
            } else {
                zzb(mediaCodec, i, j4);
            }
            return true;
        } else if (getState() != 2) {
            return false;
        } else {
            long elapsedRealtime = j5 - ((SystemClock.elapsedRealtime() * 1000) - j2);
            long nanoTime = System.nanoTime();
            long zzf = this.zzbhk.zzf(j3, (elapsedRealtime * 1000) + nanoTime);
            long j6 = (zzf - nanoTime) / 1000;
            if (zzeg(j6)) {
                zzog.beginSection("dropVideoBuffer");
                mediaCodec.releaseOutputBuffer(i, false);
                zzog.endSection();
                this.zzayw.zzami++;
                this.zzbhy++;
                this.zzbhz++;
                this.zzayw.zzamj = Math.max(this.zzbhz, this.zzayw.zzamj);
                if (this.zzbhy == this.zzbhn) {
                    zziz();
                }
                return true;
            }
            if (zzof.SDK_INT >= 21) {
                if (j6 < 50000) {
                    zza(mediaCodec, i, j4, zzf);
                    return true;
                }
            } else if (j6 < 30000) {
                if (j6 > 11000) {
                    try {
                        Thread.sleep((j6 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                zzb(mediaCodec, i, j4);
                return true;
            }
            return false;
        }
    }

    private final void zza(MediaCodec mediaCodec, int i, long j) {
        zzog.beginSection("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        zzog.endSection();
        this.zzayw.zzamh++;
    }

    private final void zzb(MediaCodec mediaCodec, int i, long j) {
        zzix();
        zzog.beginSection("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        zzog.endSection();
        this.zzayw.zzamg++;
        this.zzbhz = 0;
        zziv();
    }

    private final void zza(MediaCodec mediaCodec, int i, long j, long j2) {
        zzix();
        zzog.beginSection("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        zzog.endSection();
        this.zzayw.zzamg++;
        this.zzbhz = 0;
        zziv();
    }

    private final boolean zzm(boolean z) {
        if (zzof.SDK_INT < 23 || this.zzajm) {
            return false;
        }
        return !z || zzom.zzc(this.zzlk);
    }

    private final void zzit() {
        this.zzbhw = this.zzbhm > 0 ? SystemClock.elapsedRealtime() + this.zzbhm : -9223372036854775807L;
    }

    private final void zziu() {
        MediaCodec zzgp;
        this.zzbhv = false;
        if (zzof.SDK_INT < 23 || !this.zzajm || (zzgp = zzgp()) == null) {
            return;
        }
        this.zzbik = new zzor(this, zzgp);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zziv() {
        if (this.zzbhv) {
            return;
        }
        this.zzbhv = true;
        this.zzbhl.zza(this.zzbhs);
    }

    private final void zziw() {
        this.zzbig = -1;
        this.zzbih = -1;
        this.zzbij = -1.0f;
        this.zzbii = -1;
    }

    private final void zzix() {
        if (this.zzbig == this.zzbic && this.zzbih == this.zzbid && this.zzbii == this.zzbie && this.zzbij == this.zzbif) {
            return;
        }
        this.zzbhl.zza(this.zzbic, this.zzbid, this.zzbie, this.zzbif);
        this.zzbig = this.zzbic;
        this.zzbih = this.zzbid;
        this.zzbii = this.zzbie;
        this.zzbij = this.zzbif;
    }

    private final void zziy() {
        if (this.zzbig == -1 && this.zzbih == -1) {
            return;
        }
        this.zzbhl.zza(this.zzbic, this.zzbid, this.zzbie, this.zzbif);
    }

    private final void zziz() {
        if (this.zzbhy > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzbhl.zze(this.zzbhy, elapsedRealtime - this.zzbhx);
            this.zzbhy = 0;
            this.zzbhx = elapsedRealtime;
        }
    }

    private static int zzi(zzgo zzgoVar) {
        if (zzgoVar.zzafd != -1) {
            return zzgoVar.zzafd;
        }
        return zza(zzgoVar.zzafc, zzgoVar.width, zzgoVar.height);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int zza(String str, int i, int i2) {
        char c;
        int i3;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        int i4 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0 && c != 1) {
            if (c == 2) {
                if ("BRAVIA 4K 2015".equals(zzof.MODEL)) {
                    return -1;
                }
                i3 = ((zzof.zze(i, 16) * zzof.zze(i2, 16)) << 4) << 4;
                i4 = 2;
                return (i3 * 3) / (i4 * 2);
            } else if (c != 3) {
                if (c == 4 || c == 5) {
                    i3 = i * i2;
                    return (i3 * 3) / (i4 * 2);
                }
                return -1;
            }
        }
        i3 = i * i2;
        i4 = 2;
        return (i3 * 3) / (i4 * 2);
    }

    private static boolean zza(boolean z, zzgo zzgoVar, zzgo zzgoVar2) {
        if (zzgoVar.zzafc.equals(zzgoVar2.zzafc) && zzj(zzgoVar) == zzj(zzgoVar2)) {
            if (z) {
                return true;
            }
            return zzgoVar.width == zzgoVar2.width && zzgoVar.height == zzgoVar2.height;
        }
        return false;
    }

    private static int zzj(zzgo zzgoVar) {
        if (zzgoVar.zzafh == -1) {
            return 0;
        }
        return zzgoVar.zzafh;
    }
}
