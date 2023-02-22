package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzib extends zzkl implements zznv {
    private int zzafm;
    private int zzafo;
    private final zzhj zzako;
    private final zzho zzakp;
    private boolean zzakq;
    private boolean zzakr;
    private MediaFormat zzaks;
    private long zzakt;
    private boolean zzaku;

    public zzib(zzkn zzknVar) {
        this(zzknVar, null, true);
    }

    public static void zza(int i, long j, long j2) {
    }

    public static void zzfn() {
    }

    public static void zzq(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzgb, com.google.android.gms.internal.ads.zzgx
    public final zznv zzdk() {
        return this;
    }

    private zzib(zzkn zzknVar, zzis<Object> zzisVar, boolean z) {
        this(zzknVar, null, true, null, null);
    }

    private zzib(zzkn zzknVar, zzis<Object> zzisVar, boolean z, Handler handler, zzhg zzhgVar) {
        this(zzknVar, null, true, null, null, null, new zzhe[0]);
    }

    private zzib(zzkn zzknVar, zzis<Object> zzisVar, boolean z, Handler handler, zzhg zzhgVar, zzhf zzhfVar, zzhe... zzheVarArr) {
        super(1, zzknVar, zzisVar, z);
        this.zzakp = new zzho(null, zzheVarArr, new zzid(this));
        this.zzako = new zzhj(null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    protected final int zza(zzkn zzknVar, zzgo zzgoVar) throws zzkt {
        String str = zzgoVar.zzafc;
        boolean z = false;
        if (zzny.zzbc(str)) {
            int i = zzof.SDK_INT >= 21 ? 16 : 0;
            if (!zzax(str) || zzknVar.zzgv() == null) {
                zzkm zzc = zzknVar.zzc(str, false);
                if (zzc == null) {
                    return 1;
                }
                if (zzof.SDK_INT < 21 || ((zzgoVar.zzafn == -1 || zzc.zzap(zzgoVar.zzafn)) && (zzgoVar.zzafm == -1 || zzc.zzaq(zzgoVar.zzafm)))) {
                    z = true;
                }
                return i | 4 | (z ? 3 : 2);
            }
            return i | 4 | 3;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzkl
    public final zzkm zza(zzkn zzknVar, zzgo zzgoVar, boolean z) throws zzkt {
        zzkm zzgv;
        if (zzax(zzgoVar.zzafc) && (zzgv = zzknVar.zzgv()) != null) {
            this.zzakq = true;
            return zzgv;
        }
        this.zzakq = false;
        return super.zza(zzknVar, zzgoVar, z);
    }

    private final boolean zzax(String str) {
        return this.zzakp.zzav(str);
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    protected final void zza(zzkm zzkmVar, MediaCodec mediaCodec, zzgo zzgoVar, MediaCrypto mediaCrypto) {
        this.zzakr = zzof.SDK_INT < 24 && "OMX.SEC.aac.dec".equals(zzkmVar.name) && "samsung".equals(zzof.MANUFACTURER) && (zzof.DEVICE.startsWith("zeroflte") || zzof.DEVICE.startsWith("herolte") || zzof.DEVICE.startsWith("heroqlte"));
        if (this.zzakq) {
            MediaFormat zzek = zzgoVar.zzek();
            this.zzaks = zzek;
            zzek.setString("mime", "audio/raw");
            mediaCodec.configure(this.zzaks, (Surface) null, (MediaCrypto) null, 0);
            this.zzaks.setString("mime", zzgoVar.zzafc);
            return;
        }
        mediaCodec.configure(zzgoVar.zzek(), (Surface) null, (MediaCrypto) null, 0);
        this.zzaks = null;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    protected final void zzc(String str, long j, long j2) {
        this.zzako.zzb(str, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzd(zzgo zzgoVar) throws zzgd {
        super.zzd(zzgoVar);
        this.zzako.zzc(zzgoVar);
        this.zzafo = "audio/raw".equals(zzgoVar.zzafc) ? zzgoVar.zzafo : 2;
        this.zzafm = zzgoVar.zzafm;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    protected final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzgd {
        int[] iArr;
        int i;
        boolean z = this.zzaks != null;
        String string = z ? this.zzaks.getString("mime") : "audio/raw";
        if (z) {
            mediaFormat = this.zzaks;
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.zzakr && integer == 6 && (i = this.zzafm) < 6) {
            iArr = new int[i];
            for (int i2 = 0; i2 < this.zzafm; i2++) {
                iArr[i2] = i2;
            }
        } else {
            iArr = null;
        }
        try {
            this.zzakp.zza(string, integer, integer2, this.zzafo, 0, iArr);
        } catch (zzhs e) {
            throw zzgd.zza(e, getIndex());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzkl, com.google.android.gms.internal.ads.zzgb
    public final void zzd(boolean z) throws zzgd {
        super.zzd(z);
        this.zzako.zzc(this.zzayw);
        int i = zzds().zzagf;
        if (i != 0) {
            this.zzakp.zzs(i);
        } else {
            this.zzakp.zzfd();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzkl, com.google.android.gms.internal.ads.zzgb
    public final void zza(long j, boolean z) throws zzgd {
        super.zza(j, z);
        this.zzakp.reset();
        this.zzakt = j;
        this.zzaku = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzkl, com.google.android.gms.internal.ads.zzgb
    public final void onStarted() {
        super.onStarted();
        this.zzakp.play();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzkl, com.google.android.gms.internal.ads.zzgb
    public final void onStopped() {
        this.zzakp.pause();
        super.onStopped();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzkl, com.google.android.gms.internal.ads.zzgb
    public final void zzdr() {
        try {
            this.zzakp.release();
            try {
                super.zzdr();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.zzdr();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkl, com.google.android.gms.internal.ads.zzgx
    public final boolean zzeo() {
        return super.zzeo() && this.zzakp.zzeo();
    }

    @Override // com.google.android.gms.internal.ads.zzkl, com.google.android.gms.internal.ads.zzgx
    public final boolean isReady() {
        return this.zzakp.zzfb() || super.isReady();
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final long zzfj() {
        long zzi = this.zzakp.zzi(zzeo());
        if (zzi != Long.MIN_VALUE) {
            if (!this.zzaku) {
                zzi = Math.max(this.zzakt, zzi);
            }
            this.zzakt = zzi;
            this.zzaku = false;
        }
        return this.zzakt;
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final zzgu zzb(zzgu zzguVar) {
        return this.zzakp.zzb(zzguVar);
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final zzgu zzfc() {
        return this.zzakp.zzfc();
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    protected final boolean zza(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzgd {
        if (this.zzakq && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.zzayw.zzamh++;
            this.zzakp.zzey();
            return true;
        } else {
            try {
                if (this.zzakp.zza(byteBuffer, j3)) {
                    mediaCodec.releaseOutputBuffer(i, false);
                    this.zzayw.zzamg++;
                    return true;
                }
                return false;
            } catch (zzhv | zzhw e) {
                throw zzgd.zza(e, getIndex());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    protected final void zzfo() throws zzgd {
        try {
            this.zzakp.zzez();
        } catch (zzhw e) {
            throw zzgd.zza(e, getIndex());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgb, com.google.android.gms.internal.ads.zzge
    public final void zza(int i, Object obj) throws zzgd {
        if (i == 2) {
            this.zzakp.setVolume(((Float) obj).floatValue());
        } else if (i == 3) {
            this.zzakp.setStreamType(((Integer) obj).intValue());
        } else {
            super.zza(i, obj);
        }
    }
}
