package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzho {
    private static boolean zzahn = false;
    private static boolean zzaho = false;
    private int streamType;
    private zzgu zzadh;
    private int zzafn;
    private final zzhz zzahq;
    private final zzie zzahr;
    private final zzhe[] zzahs;
    private final zzhu zzaht;
    private final long[] zzahv;
    private final zzhq zzahw;
    private final LinkedList<zzhx> zzahx;
    private AudioTrack zzahy;
    private int zzahz;
    private int zzaia;
    private int zzaib;
    private boolean zzaic;
    private int zzaid;
    private long zzaie;
    private zzgu zzaif;
    private long zzaig;
    private long zzaih;
    private ByteBuffer zzaii;
    private int zzaij;
    private int zzaik;
    private int zzail;
    private long zzaim;
    private long zzain;
    private boolean zzaio;
    private long zzaip;
    private Method zzaiq;
    private int zzair;
    private long zzais;
    private long zzait;
    private int zzaiu;
    private long zzaiv;
    private long zzaiw;
    private int zzaix;
    private int zzaiy;
    private long zzaiz;
    private long zzaja;
    private long zzajb;
    private zzhe[] zzajc;
    private ByteBuffer[] zzajd;
    private ByteBuffer zzaje;
    private ByteBuffer zzajf;
    private byte[] zzajg;
    private int zzajh;
    private int zzaji;
    private boolean zzajj;
    private boolean zzajk;
    private int zzajl;
    private boolean zzajm;
    private boolean zzajn;
    private long zzajo;
    private float zzcw;
    private final zzhf zzahp = null;
    private final ConditionVariable zzahu = new ConditionVariable(true);

    public zzho(zzhf zzhfVar, zzhe[] zzheVarArr, zzhu zzhuVar) {
        this.zzaht = zzhuVar;
        if (zzof.SDK_INT >= 18) {
            try {
                this.zzaiq = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzof.SDK_INT >= 19) {
            this.zzahw = new zzht();
        } else {
            this.zzahw = new zzhq(null);
        }
        this.zzahq = new zzhz();
        this.zzahr = new zzie();
        zzhe[] zzheVarArr2 = new zzhe[zzheVarArr.length + 3];
        this.zzahs = zzheVarArr2;
        zzheVarArr2[0] = new zzic();
        zzhe[] zzheVarArr3 = this.zzahs;
        zzheVarArr3[1] = this.zzahq;
        System.arraycopy(zzheVarArr, 0, zzheVarArr3, 2, zzheVarArr.length);
        this.zzahs[zzheVarArr.length + 2] = this.zzahr;
        this.zzahv = new long[10];
        this.zzcw = 1.0f;
        this.zzaiy = 0;
        this.streamType = 3;
        this.zzajl = 0;
        this.zzadh = zzgu.zzafz;
        this.zzaji = -1;
        this.zzajc = new zzhe[0];
        this.zzajd = new ByteBuffer[0];
        this.zzahx = new LinkedList<>();
    }

    public final boolean zzav(String str) {
        zzhf zzhfVar = this.zzahp;
        return zzhfVar != null && zzhfVar.zzp(zzaw(str));
    }

    public final long zzi(boolean z) {
        long j;
        long j2;
        long j3;
        long j4;
        Method method;
        if (isInitialized() && this.zzaiy != 0) {
            if (this.zzahy.getPlayState() == 3) {
                long zzfj = this.zzahw.zzfj();
                if (zzfj != 0) {
                    long nanoTime = System.nanoTime() / 1000;
                    if (nanoTime - this.zzain >= 30000) {
                        long[] jArr = this.zzahv;
                        int i = this.zzaik;
                        jArr[i] = zzfj - nanoTime;
                        this.zzaik = (i + 1) % 10;
                        int i2 = this.zzail;
                        if (i2 < 10) {
                            this.zzail = i2 + 1;
                        }
                        this.zzain = nanoTime;
                        this.zzaim = 0L;
                        int i3 = 0;
                        while (true) {
                            int i4 = this.zzail;
                            if (i3 >= i4) {
                                break;
                            }
                            this.zzaim += this.zzahv[i3] / i4;
                            i3++;
                        }
                    }
                    if (!zzfh() && nanoTime - this.zzaip >= 500000) {
                        boolean zzfk = this.zzahw.zzfk();
                        this.zzaio = zzfk;
                        if (zzfk) {
                            long zzfl = this.zzahw.zzfl() / 1000;
                            long zzfm = this.zzahw.zzfm();
                            if (zzfl < this.zzaja) {
                                this.zzaio = false;
                            } else if (Math.abs(zzfl - nanoTime) > 5000000) {
                                StringBuilder sb = new StringBuilder(136);
                                sb.append("Spurious audio timestamp (system clock mismatch): ");
                                sb.append(zzfm);
                                sb.append(", ");
                                sb.append(zzfl);
                                sb.append(", ");
                                sb.append(nanoTime);
                                sb.append(", ");
                                sb.append(zzfj);
                                Log.w("AudioTrack", sb.toString());
                                this.zzaio = false;
                            } else if (Math.abs(zzdq(zzfm) - zzfj) > 5000000) {
                                StringBuilder sb2 = new StringBuilder(138);
                                sb2.append("Spurious audio timestamp (frame position mismatch): ");
                                sb2.append(zzfm);
                                sb2.append(", ");
                                sb2.append(zzfl);
                                sb2.append(", ");
                                sb2.append(nanoTime);
                                sb2.append(", ");
                                sb2.append(zzfj);
                                Log.w("AudioTrack", sb2.toString());
                                this.zzaio = false;
                            }
                        }
                        if (this.zzaiq != null && !this.zzaic) {
                            try {
                                long intValue = (((Integer) method.invoke(this.zzahy, null)).intValue() * 1000) - this.zzaie;
                                this.zzajb = intValue;
                                long max = Math.max(intValue, 0L);
                                this.zzajb = max;
                                if (max > 5000000) {
                                    StringBuilder sb3 = new StringBuilder(61);
                                    sb3.append("Ignoring impossibly large audio latency: ");
                                    sb3.append(max);
                                    Log.w("AudioTrack", sb3.toString());
                                    this.zzajb = 0L;
                                }
                            } catch (Exception unused) {
                                this.zzaiq = null;
                            }
                        }
                        this.zzaip = nanoTime;
                    }
                }
            }
            long nanoTime2 = System.nanoTime() / 1000;
            if (this.zzaio) {
                j = zzdq(this.zzahw.zzfm() + zzdr(nanoTime2 - (this.zzahw.zzfl() / 1000)));
            } else {
                if (this.zzail == 0) {
                    j = this.zzahw.zzfj();
                } else {
                    j = nanoTime2 + this.zzaim;
                }
                if (!z) {
                    j -= this.zzajb;
                }
            }
            long j5 = this.zzaiz;
            while (!this.zzahx.isEmpty() && j >= zzhx.zzb(this.zzahx.getFirst())) {
                zzhx remove = this.zzahx.remove();
                this.zzadh = zzhx.zza(remove);
                this.zzaih = zzhx.zzb(remove);
                this.zzaig = zzhx.zzc(remove) - this.zzaiz;
            }
            if (this.zzadh.zzaga == 1.0f) {
                j4 = (j + this.zzaig) - this.zzaih;
            } else {
                if (this.zzahx.isEmpty() && this.zzahr.zzfq() >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                    j2 = this.zzaig;
                    j3 = zzof.zza(j - this.zzaih, this.zzahr.zzfp(), this.zzahr.zzfq());
                } else {
                    j2 = this.zzaig;
                    double d = this.zzadh.zzaga;
                    double d2 = j - this.zzaih;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    j3 = (long) (d * d2);
                }
                j4 = j3 + j2;
            }
            return j5 + j4;
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.lang.String r8, int r9, int r10, int r11, int r12, int[] r13) throws com.google.android.gms.internal.ads.zzhs {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzho.zza(java.lang.String, int, int, int, int, int[]):void");
    }

    private final void zzex() {
        zzhe[] zzheVarArr;
        ArrayList arrayList = new ArrayList();
        for (zzhe zzheVar : this.zzahs) {
            if (zzheVar.isActive()) {
                arrayList.add(zzheVar);
            } else {
                zzheVar.flush();
            }
        }
        int size = arrayList.size();
        this.zzajc = (zzhe[]) arrayList.toArray(new zzhe[size]);
        this.zzajd = new ByteBuffer[size];
        for (int i = 0; i < size; i++) {
            zzhe zzheVar2 = this.zzajc[i];
            zzheVar2.flush();
            this.zzajd[i] = zzheVar2.zzew();
        }
    }

    public final void play() {
        this.zzajk = true;
        if (isInitialized()) {
            this.zzaja = System.nanoTime() / 1000;
            this.zzahy.play();
        }
    }

    public final void zzey() {
        if (this.zzaiy == 1) {
            this.zzaiy = 2;
        }
    }

    public final boolean zza(ByteBuffer byteBuffer, long j) throws zzhv, zzhw {
        int i;
        int zzj;
        ByteBuffer byteBuffer2 = this.zzaje;
        zznr.checkArgument(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!isInitialized()) {
            this.zzahu.block();
            if (this.zzajm) {
                this.zzahy = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.zzahz).setEncoding(this.zzaib).setSampleRate(this.zzafn).build(), this.zzaid, 1, this.zzajl);
            } else if (this.zzajl == 0) {
                this.zzahy = new AudioTrack(this.streamType, this.zzafn, this.zzahz, this.zzaib, this.zzaid, 1);
            } else {
                this.zzahy = new AudioTrack(this.streamType, this.zzafn, this.zzahz, this.zzaib, this.zzaid, 1, this.zzajl);
            }
            int state = this.zzahy.getState();
            if (state != 1) {
                try {
                    this.zzahy.release();
                } catch (Exception unused) {
                } finally {
                    this.zzahy = null;
                }
                throw new zzhv(state, this.zzafn, this.zzahz, this.zzaid);
            }
            int audioSessionId = this.zzahy.getAudioSessionId();
            if (this.zzajl != audioSessionId) {
                this.zzajl = audioSessionId;
                this.zzaht.zzq(audioSessionId);
            }
            this.zzahw.zza(this.zzahy, zzfh());
            zzfe();
            this.zzajn = false;
            if (this.zzajk) {
                play();
            }
        }
        if (zzfh()) {
            if (this.zzahy.getPlayState() == 2) {
                this.zzajn = false;
                return false;
            } else if (this.zzahy.getPlayState() == 1 && this.zzahw.zzfi() != 0) {
                return false;
            }
        }
        boolean z = this.zzajn;
        boolean zzfb = zzfb();
        this.zzajn = zzfb;
        if (z && !zzfb && this.zzahy.getPlayState() != 1) {
            this.zzaht.zzc(this.zzaid, zzga.zzdg(this.zzaie), SystemClock.elapsedRealtime() - this.zzajo);
        }
        if (this.zzaje == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.zzaic && this.zzaix == 0) {
                int i2 = this.zzaib;
                if (i2 == 7 || i2 == 8) {
                    zzj = zzhy.zzj(byteBuffer);
                } else if (i2 == 5) {
                    zzj = zzhc.zzes();
                } else if (i2 == 6) {
                    zzj = zzhc.zzh(byteBuffer);
                } else {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unexpected audio encoding: ");
                    sb.append(i2);
                    throw new IllegalStateException(sb.toString());
                }
                this.zzaix = zzj;
            }
            if (this.zzaif != null) {
                if (!zzfa()) {
                    return false;
                }
                this.zzahx.add(new zzhx(this.zzaif, Math.max(0L, j), zzdq(zzff()), null));
                this.zzaif = null;
                zzex();
            }
            if (this.zzaiy == 0) {
                this.zzaiz = Math.max(0L, j);
                this.zzaiy = 1;
            } else {
                long zzdq = this.zzaiz + zzdq(this.zzaic ? this.zzait : this.zzais / this.zzair);
                if (this.zzaiy != 1 || Math.abs(zzdq - j) <= 200000) {
                    i = 2;
                } else {
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Discontinuity detected [expected ");
                    sb2.append(zzdq);
                    sb2.append(", got ");
                    sb2.append(j);
                    sb2.append("]");
                    Log.e("AudioTrack", sb2.toString());
                    i = 2;
                    this.zzaiy = 2;
                }
                if (this.zzaiy == i) {
                    this.zzaiz += j - zzdq;
                    this.zzaiy = 1;
                    this.zzaht.zzdx();
                }
            }
            if (this.zzaic) {
                this.zzait += this.zzaix;
            } else {
                this.zzais += byteBuffer.remaining();
            }
            this.zzaje = byteBuffer;
        }
        if (this.zzaic) {
            zzb(this.zzaje, j);
        } else {
            zzdp(j);
        }
        if (this.zzaje.hasRemaining()) {
            return false;
        }
        this.zzaje = null;
        return true;
    }

    private final void zzdp(long j) throws zzhw {
        ByteBuffer byteBuffer;
        int length = this.zzajc.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.zzajd[i - 1];
            } else {
                byteBuffer = this.zzaje;
                if (byteBuffer == null) {
                    byteBuffer = zzhe.zzagy;
                }
            }
            if (i == length) {
                zzb(byteBuffer, j);
            } else {
                zzhe zzheVar = this.zzajc[i];
                zzheVar.zzi(byteBuffer);
                ByteBuffer zzew = zzheVar.zzew();
                this.zzajd[i] = zzew;
                if (zzew.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i--;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
        if (r11 < r10) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzb(java.nio.ByteBuffer r9, long r10) throws com.google.android.gms.internal.ads.zzhw {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzho.zzb(java.nio.ByteBuffer, long):boolean");
    }

    public final void zzez() throws zzhw {
        if (!this.zzajj && isInitialized() && zzfa()) {
            this.zzahw.zzds(zzff());
            this.zzaij = 0;
            this.zzajj = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0032 -> B:9:0x0012). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzfa() throws com.google.android.gms.internal.ads.zzhw {
        /*
            r9 = this;
            int r0 = r9.zzaji
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L14
            boolean r0 = r9.zzaic
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.ads.zzhe[] r0 = r9.zzajc
            int r0 = r0.length
            goto L10
        Lf:
            r0 = 0
        L10:
            r9.zzaji = r0
        L12:
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            int r4 = r9.zzaji
            com.google.android.gms.internal.ads.zzhe[] r5 = r9.zzajc
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.zzev()
        L28:
            r9.zzdp(r7)
            boolean r0 = r4.zzeo()
            if (r0 != 0) goto L32
            return r3
        L32:
            int r0 = r9.zzaji
            int r0 = r0 + r2
            r9.zzaji = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.zzajf
            if (r0 == 0) goto L44
            r9.zzb(r0, r7)
            java.nio.ByteBuffer r0 = r9.zzajf
            if (r0 == 0) goto L44
            return r3
        L44:
            r9.zzaji = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzho.zzfa():boolean");
    }

    public final boolean zzeo() {
        if (isInitialized()) {
            return this.zzajj && !zzfb();
        }
        return true;
    }

    public final boolean zzfb() {
        if (isInitialized()) {
            if (zzff() <= this.zzahw.zzfi()) {
                if (zzfh() && this.zzahy.getPlayState() == 2 && this.zzahy.getPlaybackHeadPosition() == 0) {
                }
            }
            return true;
        }
        return false;
    }

    public final zzgu zzb(zzgu zzguVar) {
        if (this.zzaic) {
            zzgu zzguVar2 = zzgu.zzafz;
            this.zzadh = zzguVar2;
            return zzguVar2;
        }
        zzgu zzguVar3 = new zzgu(this.zzahr.zza(zzguVar.zzaga), this.zzahr.zzb(zzguVar.zzagb));
        zzgu zzguVar4 = this.zzaif;
        if (zzguVar4 == null) {
            if (!this.zzahx.isEmpty()) {
                zzguVar4 = zzhx.zza(this.zzahx.getLast());
            } else {
                zzguVar4 = this.zzadh;
            }
        }
        if (!zzguVar3.equals(zzguVar4)) {
            if (isInitialized()) {
                this.zzaif = zzguVar3;
            } else {
                this.zzadh = zzguVar3;
            }
        }
        return this.zzadh;
    }

    public final zzgu zzfc() {
        return this.zzadh;
    }

    public final void setStreamType(int i) {
        if (this.streamType == i) {
            return;
        }
        this.streamType = i;
        if (this.zzajm) {
            return;
        }
        reset();
        this.zzajl = 0;
    }

    public final void zzs(int i) {
        zznr.checkState(zzof.SDK_INT >= 21);
        if (this.zzajm && this.zzajl == i) {
            return;
        }
        this.zzajm = true;
        this.zzajl = i;
        reset();
    }

    public final void zzfd() {
        if (this.zzajm) {
            this.zzajm = false;
            this.zzajl = 0;
            reset();
        }
    }

    public final void setVolume(float f) {
        if (this.zzcw != f) {
            this.zzcw = f;
            zzfe();
        }
    }

    private final void zzfe() {
        if (isInitialized()) {
            if (zzof.SDK_INT >= 21) {
                this.zzahy.setVolume(this.zzcw);
                return;
            }
            AudioTrack audioTrack = this.zzahy;
            float f = this.zzcw;
            audioTrack.setStereoVolume(f, f);
        }
    }

    public final void pause() {
        this.zzajk = false;
        if (isInitialized()) {
            zzfg();
            this.zzahw.pause();
        }
    }

    public final void reset() {
        if (isInitialized()) {
            this.zzais = 0L;
            this.zzait = 0L;
            this.zzaiv = 0L;
            this.zzaiw = 0L;
            this.zzaix = 0;
            zzgu zzguVar = this.zzaif;
            if (zzguVar != null) {
                this.zzadh = zzguVar;
                this.zzaif = null;
            } else if (!this.zzahx.isEmpty()) {
                this.zzadh = zzhx.zza(this.zzahx.getLast());
            }
            this.zzahx.clear();
            this.zzaig = 0L;
            this.zzaih = 0L;
            this.zzaje = null;
            this.zzajf = null;
            int i = 0;
            while (true) {
                zzhe[] zzheVarArr = this.zzajc;
                if (i >= zzheVarArr.length) {
                    break;
                }
                zzhe zzheVar = zzheVarArr[i];
                zzheVar.flush();
                this.zzajd[i] = zzheVar.zzew();
                i++;
            }
            this.zzajj = false;
            this.zzaji = -1;
            this.zzaii = null;
            this.zzaij = 0;
            this.zzaiy = 0;
            this.zzajb = 0L;
            zzfg();
            if (this.zzahy.getPlayState() == 3) {
                this.zzahy.pause();
            }
            AudioTrack audioTrack = this.zzahy;
            this.zzahy = null;
            this.zzahw.zza(null, false);
            this.zzahu.close();
            new zzhr(this, audioTrack).start();
        }
    }

    public final void release() {
        reset();
        for (zzhe zzheVar : this.zzahs) {
            zzheVar.reset();
        }
        this.zzajl = 0;
        this.zzajk = false;
    }

    private final boolean isInitialized() {
        return this.zzahy != null;
    }

    private final long zzdq(long j) {
        return (j * 1000000) / this.zzafn;
    }

    private final long zzdr(long j) {
        return (j * this.zzafn) / 1000000;
    }

    private final long zzff() {
        return this.zzaic ? this.zzaiw : this.zzaiv / this.zzaiu;
    }

    private final void zzfg() {
        this.zzaim = 0L;
        this.zzail = 0;
        this.zzaik = 0;
        this.zzain = 0L;
        this.zzaio = false;
        this.zzaip = 0L;
    }

    private final boolean zzfh() {
        if (zzof.SDK_INT < 23) {
            int i = this.zzaib;
            return i == 5 || i == 6;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int zzaw(String str) {
        char c;
        switch (str.hashCode()) {
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return c != 3 ? 0 : 8;
                }
                return 7;
            }
            return 6;
        }
        return 5;
    }
}
