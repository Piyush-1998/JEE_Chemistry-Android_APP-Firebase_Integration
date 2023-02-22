package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzkl extends zzgb {
    private static final byte[] zzaxm = zzof.zzbj("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private zzgo zzafx;
    private ByteBuffer[] zzajd;
    private final zzkn zzaxn;
    private final zzis<Object> zzaxo;
    private final boolean zzaxp;
    private final zzik zzaxq;
    private final zzik zzaxr;
    private final zzgq zzaxs;
    private final List<Long> zzaxt;
    private final MediaCodec.BufferInfo zzaxu;
    private zziq<Object> zzaxv;
    private zziq<Object> zzaxw;
    private MediaCodec zzaxx;
    private zzkm zzaxy;
    private boolean zzaxz;
    private boolean zzaya;
    private boolean zzayb;
    private boolean zzayc;
    private boolean zzayd;
    private boolean zzaye;
    private boolean zzayf;
    private boolean zzayg;
    private boolean zzayh;
    private ByteBuffer[] zzayi;
    private long zzayj;
    private int zzayk;
    private int zzayl;
    private boolean zzaym;
    private boolean zzayn;
    private int zzayo;
    private int zzayp;
    private boolean zzayq;
    private boolean zzayr;
    private boolean zzays;
    private boolean zzayt;
    private boolean zzayu;
    private boolean zzayv;
    protected zzil zzayw;

    public zzkl(int i, zzkn zzknVar, zzis<Object> zzisVar, boolean z) {
        super(i);
        zznr.checkState(zzof.SDK_INT >= 16);
        this.zzaxn = (zzkn) zznr.checkNotNull(zzknVar);
        this.zzaxo = zzisVar;
        this.zzaxp = z;
        this.zzaxq = new zzik(0);
        this.zzaxr = new zzik(0);
        this.zzaxs = new zzgq();
        this.zzaxt = new ArrayList();
        this.zzaxu = new MediaCodec.BufferInfo();
        this.zzayo = 0;
        this.zzayp = 0;
    }

    protected void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzgd {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgb
    public void onStarted() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgb
    public void onStopped() {
    }

    protected abstract int zza(zzkn zzknVar, zzgo zzgoVar) throws zzkt;

    protected void zza(zzik zzikVar) {
    }

    protected abstract void zza(zzkm zzkmVar, MediaCodec mediaCodec, zzgo zzgoVar, MediaCrypto mediaCrypto) throws zzkt;

    protected abstract boolean zza(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzgd;

    protected boolean zza(MediaCodec mediaCodec, boolean z, zzgo zzgoVar, zzgo zzgoVar2) {
        return false;
    }

    protected boolean zza(zzkm zzkmVar) {
        return true;
    }

    protected void zzc(String str, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzgb, com.google.android.gms.internal.ads.zzgw
    public final int zzdq() {
        return 4;
    }

    protected void zzfo() throws zzgd {
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final int zza(zzgo zzgoVar) throws zzgd {
        try {
            return zza(this.zzaxn, zzgoVar);
        } catch (zzkt e) {
            throw zzgd.zza(e, getIndex());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public zzkm zza(zzkn zzknVar, zzgo zzgoVar, boolean z) throws zzkt {
        return zzknVar.zzc(zzgoVar.zzafc, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzgo() throws zzgd {
        zzgo zzgoVar;
        if (this.zzaxx != null || (zzgoVar = this.zzafx) == null) {
            return;
        }
        this.zzaxv = this.zzaxw;
        String str = zzgoVar.zzafc;
        zziq<Object> zziqVar = this.zzaxv;
        if (zziqVar != null) {
            int state = zziqVar.getState();
            if (state == 0) {
                throw zzgd.zza(this.zzaxv.zzga(), getIndex());
            }
            if (state == 3 || state == 4) {
                this.zzaxv.zzfz();
                throw new NoSuchMethodError();
            }
            return;
        }
        if (this.zzaxy == null) {
            try {
                this.zzaxy = zza(this.zzaxn, this.zzafx, false);
            } catch (zzkt e) {
                zza(new zzko(this.zzafx, (Throwable) e, false, -49998));
            }
            if (this.zzaxy == null) {
                zza(new zzko(this.zzafx, (Throwable) null, false, -49999));
            }
        }
        if (zza(this.zzaxy)) {
            String str2 = this.zzaxy.name;
            this.zzaxz = zzof.SDK_INT < 21 && this.zzafx.zzafe.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
            this.zzaya = zzof.SDK_INT < 18 || (zzof.SDK_INT == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (zzof.SDK_INT == 19 && zzof.MODEL.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
            this.zzayb = zzof.SDK_INT < 24 && ("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2)) && ("flounder".equals(zzof.DEVICE) || "flounder_lte".equals(zzof.DEVICE) || "grouper".equals(zzof.DEVICE) || "tilapia".equals(zzof.DEVICE));
            this.zzayc = zzof.SDK_INT <= 17 && ("OMX.rk.video_decoder.avc".equals(str2) || "OMX.allwinner.video.decoder.avc".equals(str2));
            this.zzayd = (zzof.SDK_INT <= 23 && "OMX.google.vorbis.decoder".equals(str2)) || (zzof.SDK_INT <= 19 && "hb2000".equals(zzof.DEVICE) && ("OMX.amlogic.avc.decoder.awesome".equals(str2) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str2)));
            this.zzaye = zzof.SDK_INT == 21 && "OMX.google.aac.decoder".equals(str2);
            this.zzayf = zzof.SDK_INT <= 18 && this.zzafx.zzafm == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                String valueOf = String.valueOf(str2);
                zzog.beginSection(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
                this.zzaxx = MediaCodec.createByCodecName(str2);
                zzog.endSection();
                zzog.beginSection("configureCodec");
                zza(this.zzaxy, this.zzaxx, this.zzafx, (MediaCrypto) null);
                zzog.endSection();
                zzog.beginSection("startCodec");
                this.zzaxx.start();
                zzog.endSection();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                zzc(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                this.zzayi = this.zzaxx.getInputBuffers();
                this.zzajd = this.zzaxx.getOutputBuffers();
            } catch (Exception e2) {
                zza(new zzko(this.zzafx, (Throwable) e2, false, str2));
            }
            this.zzayj = getState() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
            this.zzayk = -1;
            this.zzayl = -1;
            this.zzayv = true;
            this.zzayw.zzamd++;
        }
    }

    private final void zza(zzko zzkoVar) throws zzgd {
        throw zzgd.zza(zzkoVar, getIndex());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final MediaCodec zzgp() {
        return this.zzaxx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzkm zzgq() {
        return this.zzaxy;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgb
    public void zzd(boolean z) throws zzgd {
        this.zzayw = new zzil();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgb
    public void zza(long j, boolean z) throws zzgd {
        this.zzays = false;
        this.zzayt = false;
        if (this.zzaxx != null) {
            this.zzayj = -9223372036854775807L;
            this.zzayk = -1;
            this.zzayl = -1;
            this.zzayv = true;
            this.zzayu = false;
            this.zzaym = false;
            this.zzaxt.clear();
            this.zzayg = false;
            this.zzayh = false;
            if (this.zzaya || (this.zzayd && this.zzayr)) {
                zzgr();
                zzgo();
            } else if (this.zzayp != 0) {
                zzgr();
                zzgo();
            } else {
                this.zzaxx.flush();
                this.zzayq = false;
            }
            if (!this.zzayn || this.zzafx == null) {
                return;
            }
            this.zzayo = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgb
    public void zzdr() {
        this.zzafx = null;
        try {
            zzgr();
            try {
                if (this.zzaxv != null) {
                    this.zzaxo.zza(this.zzaxv);
                }
                try {
                    if (this.zzaxw != null && this.zzaxw != this.zzaxv) {
                        this.zzaxo.zza(this.zzaxw);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    if (this.zzaxw != null && this.zzaxw != this.zzaxv) {
                        this.zzaxo.zza(this.zzaxw);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.zzaxv != null) {
                    this.zzaxo.zza(this.zzaxv);
                }
                try {
                    if (this.zzaxw != null && this.zzaxw != this.zzaxv) {
                        this.zzaxo.zza(this.zzaxw);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    if (this.zzaxw != null && this.zzaxw != this.zzaxv) {
                        this.zzaxo.zza(this.zzaxw);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzgr() {
        this.zzayj = -9223372036854775807L;
        this.zzayk = -1;
        this.zzayl = -1;
        this.zzayu = false;
        this.zzaym = false;
        this.zzaxt.clear();
        this.zzayi = null;
        this.zzajd = null;
        this.zzaxy = null;
        this.zzayn = false;
        this.zzayq = false;
        this.zzaxz = false;
        this.zzaya = false;
        this.zzayb = false;
        this.zzayc = false;
        this.zzayd = false;
        this.zzayf = false;
        this.zzayg = false;
        this.zzayh = false;
        this.zzayr = false;
        this.zzayo = 0;
        this.zzayp = 0;
        this.zzaxq.zzcq = null;
        if (this.zzaxx != null) {
            this.zzayw.zzame++;
            try {
                this.zzaxx.stop();
                try {
                    this.zzaxx.release();
                    this.zzaxx = null;
                    zziq<Object> zziqVar = this.zzaxv;
                    if (zziqVar == null || this.zzaxw == zziqVar) {
                        return;
                    }
                    try {
                        this.zzaxo.zza(zziqVar);
                    } finally {
                    }
                } catch (Throwable th) {
                    this.zzaxx = null;
                    zziq<Object> zziqVar2 = this.zzaxv;
                    if (zziqVar2 != null && this.zzaxw != zziqVar2) {
                        try {
                            this.zzaxo.zza(zziqVar2);
                        } finally {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.zzaxx.release();
                    this.zzaxx = null;
                    zziq<Object> zziqVar3 = this.zzaxv;
                    if (zziqVar3 != null && this.zzaxw != zziqVar3) {
                        try {
                            this.zzaxo.zza(zziqVar3);
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.zzaxx = null;
                    zziq<Object> zziqVar4 = this.zzaxv;
                    if (zziqVar4 != null && this.zzaxw != zziqVar4) {
                        try {
                            this.zzaxo.zza(zziqVar4);
                        } finally {
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgx
    public final void zzb(long j, long j2) throws zzgd {
        if (this.zzayt) {
            zzfo();
            return;
        }
        if (this.zzafx == null) {
            this.zzaxr.clear();
            int zza = zza(this.zzaxs, this.zzaxr, true);
            if (zza != -5) {
                if (zza == -4) {
                    zznr.checkState(this.zzaxr.zzfv());
                    this.zzays = true;
                    zzgt();
                    return;
                }
                return;
            }
            zzd(this.zzaxs.zzafx);
        }
        zzgo();
        if (this.zzaxx != null) {
            zzog.beginSection("drainAndFeed");
            do {
            } while (zzd(j, j2));
            do {
            } while (zzgs());
            zzog.endSection();
        } else {
            zzdj(j);
            this.zzaxr.clear();
            int zza2 = zza(this.zzaxs, this.zzaxr, false);
            if (zza2 == -5) {
                zzd(this.zzaxs.zzafx);
            } else if (zza2 == -4) {
                zznr.checkState(this.zzaxr.zzfv());
                this.zzays = true;
                zzgt();
            }
        }
        this.zzayw.zzfy();
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0149 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzgs() throws com.google.android.gms.internal.ads.zzgd {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkl.zzgs():boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzd(zzgo zzgoVar) throws zzgd {
        MediaCodec mediaCodec;
        zzgo zzgoVar2 = this.zzafx;
        this.zzafx = zzgoVar;
        boolean z = true;
        if (!zzof.zza(zzgoVar.zzaff, zzgoVar2 == null ? null : zzgoVar2.zzaff)) {
            if (this.zzafx.zzaff != null) {
                zzis<Object> zzisVar = this.zzaxo;
                if (zzisVar == null) {
                    throw zzgd.zza(new IllegalStateException("Media requires a DrmSessionManager"), getIndex());
                }
                zziq<Object> zza = zzisVar.zza(Looper.myLooper(), this.zzafx.zzaff);
                this.zzaxw = zza;
                if (zza == this.zzaxv) {
                    this.zzaxo.zza(zza);
                }
            } else {
                this.zzaxw = null;
            }
        }
        if (this.zzaxw == this.zzaxv && (mediaCodec = this.zzaxx) != null && zza(mediaCodec, this.zzaxy.zzayx, zzgoVar2, this.zzafx)) {
            this.zzayn = true;
            this.zzayo = 1;
            this.zzayg = (this.zzayb && this.zzafx.width == zzgoVar2.width && this.zzafx.height == zzgoVar2.height) ? false : false;
        } else if (this.zzayq) {
            this.zzayp = 1;
        } else {
            zzgr();
            zzgo();
        }
    }

    public boolean zzeo() {
        return this.zzayt;
    }

    public boolean isReady() {
        if (this.zzafx == null || this.zzayu) {
            return false;
        }
        if (zzdt() || this.zzayl >= 0) {
            return true;
        }
        return this.zzayj != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzayj;
    }

    private final boolean zzd(long j, long j2) throws zzgd {
        boolean zza;
        boolean z;
        if (this.zzayl < 0) {
            if (this.zzaye && this.zzayr) {
                try {
                    this.zzayl = this.zzaxx.dequeueOutputBuffer(this.zzaxu, 0L);
                } catch (IllegalStateException unused) {
                    zzgt();
                    if (this.zzayt) {
                        zzgr();
                    }
                    return false;
                }
            } else {
                this.zzayl = this.zzaxx.dequeueOutputBuffer(this.zzaxu, 0L);
            }
            int i = this.zzayl;
            if (i < 0) {
                if (i != -2) {
                    if (i == -3) {
                        this.zzajd = this.zzaxx.getOutputBuffers();
                        return true;
                    }
                    if (this.zzayc && (this.zzays || this.zzayp == 2)) {
                        zzgt();
                    }
                    return false;
                }
                MediaFormat outputFormat = this.zzaxx.getOutputFormat();
                if (this.zzayb && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.zzayh = true;
                } else {
                    if (this.zzayf) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    onOutputFormatChanged(this.zzaxx, outputFormat);
                }
                return true;
            } else if (this.zzayh) {
                this.zzayh = false;
                this.zzaxx.releaseOutputBuffer(i, false);
                this.zzayl = -1;
                return true;
            } else if ((this.zzaxu.flags & 4) != 0) {
                zzgt();
                this.zzayl = -1;
                return false;
            } else {
                ByteBuffer byteBuffer = this.zzajd[this.zzayl];
                if (byteBuffer != null) {
                    byteBuffer.position(this.zzaxu.offset);
                    byteBuffer.limit(this.zzaxu.offset + this.zzaxu.size);
                }
                long j3 = this.zzaxu.presentationTimeUs;
                int size = this.zzaxt.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    } else if (this.zzaxt.get(i2).longValue() == j3) {
                        this.zzaxt.remove(i2);
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                this.zzaym = z;
            }
        }
        if (this.zzaye && this.zzayr) {
            try {
                zza = zza(j, j2, this.zzaxx, this.zzajd[this.zzayl], this.zzayl, this.zzaxu.flags, this.zzaxu.presentationTimeUs, this.zzaym);
            } catch (IllegalStateException unused2) {
                zzgt();
                if (this.zzayt) {
                    zzgr();
                }
                return false;
            }
        } else {
            MediaCodec mediaCodec = this.zzaxx;
            ByteBuffer[] byteBufferArr = this.zzajd;
            int i3 = this.zzayl;
            zza = zza(j, j2, mediaCodec, byteBufferArr[i3], i3, this.zzaxu.flags, this.zzaxu.presentationTimeUs, this.zzaym);
        }
        if (zza) {
            long j4 = this.zzaxu.presentationTimeUs;
            this.zzayl = -1;
            return true;
        }
        return false;
    }

    private final void zzgt() throws zzgd {
        if (this.zzayp == 2) {
            zzgr();
            zzgo();
            return;
        }
        this.zzayt = true;
        zzfo();
    }
}
