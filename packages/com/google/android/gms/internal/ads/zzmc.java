package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzmc implements zzjd {
    private final zznc zzazw;
    private final int zzbcl;
    private zzmb zzbcp;
    private zzmb zzbcq;
    private zzgo zzbcr;
    private boolean zzbcs;
    private zzgo zzbct;
    private long zzbcu;
    private int zzbcv;
    private zzme zzbcw;
    private final zzma zzbcm = new zzma();
    private final zzlz zzbcn = new zzlz();
    private final zzoc zzant = new zzoc(32);
    private final AtomicInteger zzbco = new AtomicInteger();

    public zzmc(zznc zzncVar) {
        this.zzazw = zzncVar;
        this.zzbcl = zzncVar.zzia();
        this.zzbcv = this.zzbcl;
        zzmb zzmbVar = new zzmb(0L, this.zzbcl);
        this.zzbcp = zzmbVar;
        this.zzbcq = zzmbVar;
    }

    public final void zzj(boolean z) {
        int andSet = this.zzbco.getAndSet(z ? 0 : 2);
        zzhn();
        this.zzbcm.zzho();
        if (andSet == 2) {
            this.zzbcr = null;
        }
    }

    public final int zzhp() {
        return this.zzbcm.zzhp();
    }

    public final void disable() {
        if (this.zzbco.getAndSet(2) == 0) {
            zzhn();
        }
    }

    public final boolean zzhq() {
        return this.zzbcm.zzhq();
    }

    public final zzgo zzhr() {
        return this.zzbcm.zzhr();
    }

    public final long zzhh() {
        return this.zzbcm.zzhh();
    }

    public final void zzhu() {
        long zzhs = this.zzbcm.zzhs();
        if (zzhs != -1) {
            zzed(zzhs);
        }
    }

    public final boolean zze(long j, boolean z) {
        long zzd = this.zzbcm.zzd(j, z);
        if (zzd == -1) {
            return false;
        }
        zzed(zzd);
        return true;
    }

    public final int zza(zzgq zzgqVar, zzik zzikVar, boolean z, boolean z2, long j) {
        int i;
        int zza = this.zzbcm.zza(zzgqVar, zzikVar, z, z2, this.zzbcr, this.zzbcn);
        if (zza == -5) {
            this.zzbcr = zzgqVar.zzafx;
            return -5;
        } else if (zza == -4) {
            if (!zzikVar.zzfv()) {
                if (zzikVar.zzamb < j) {
                    zzikVar.zzv(Integer.MIN_VALUE);
                }
                if (zzikVar.zzfx()) {
                    zzlz zzlzVar = this.zzbcn;
                    long j2 = zzlzVar.zzauv;
                    this.zzant.reset(1);
                    zza(j2, this.zzant.data, 1);
                    long j3 = j2 + 1;
                    byte b = this.zzant.data[0];
                    boolean z3 = (b & 128) != 0;
                    int i2 = b & Byte.MAX_VALUE;
                    if (zzikVar.zzama.iv == null) {
                        zzikVar.zzama.iv = new byte[16];
                    }
                    zza(j3, zzikVar.zzama.iv, i2);
                    long j4 = j3 + i2;
                    if (z3) {
                        this.zzant.reset(2);
                        zza(j4, this.zzant.data, 2);
                        j4 += 2;
                        i = this.zzant.readUnsignedShort();
                    } else {
                        i = 1;
                    }
                    int[] iArr = zzikVar.zzama.numBytesOfClearData;
                    if (iArr == null || iArr.length < i) {
                        iArr = new int[i];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = zzikVar.zzama.numBytesOfEncryptedData;
                    if (iArr3 == null || iArr3.length < i) {
                        iArr3 = new int[i];
                    }
                    int[] iArr4 = iArr3;
                    if (z3) {
                        int i3 = i * 6;
                        this.zzant.reset(i3);
                        zza(j4, this.zzant.data, i3);
                        j4 += i3;
                        this.zzant.zzbg(0);
                        for (int i4 = 0; i4 < i; i4++) {
                            iArr2[i4] = this.zzant.readUnsignedShort();
                            iArr4[i4] = this.zzant.zzir();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = zzlzVar.size - ((int) (j4 - zzlzVar.zzauv));
                    }
                    zzjg zzjgVar = zzlzVar.zzapp;
                    zzikVar.zzama.set(i, iArr2, iArr4, zzjgVar.zzani, zzikVar.zzama.iv, zzjgVar.zzanh);
                    int i5 = (int) (j4 - zzlzVar.zzauv);
                    zzlzVar.zzauv += i5;
                    zzlzVar.size -= i5;
                }
                zzikVar.zzx(this.zzbcn.size);
                long j5 = this.zzbcn.zzauv;
                ByteBuffer byteBuffer = zzikVar.zzcq;
                int i6 = this.zzbcn.size;
                zzed(j5);
                while (i6 > 0) {
                    int i7 = (int) (j5 - this.zzbcp.zzbch);
                    int min = Math.min(i6, this.zzbcl - i7);
                    zzmz zzmzVar = this.zzbcp.zzbcj;
                    byteBuffer.put(zzmzVar.data, zzmzVar.zzay(i7), min);
                    j5 += min;
                    i6 -= min;
                    if (j5 == this.zzbcp.zzaqu) {
                        this.zzazw.zza(zzmzVar);
                        this.zzbcp = this.zzbcp.zzht();
                    }
                }
                zzed(this.zzbcn.zzbbu);
            }
            return -4;
        } else {
            if (zza == -3) {
                return -3;
            }
            throw new IllegalStateException();
        }
    }

    private final void zza(long j, byte[] bArr, int i) {
        zzed(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.zzbcp.zzbch);
            int min = Math.min(i - i2, this.zzbcl - i3);
            zzmz zzmzVar = this.zzbcp.zzbcj;
            System.arraycopy(zzmzVar.data, zzmzVar.zzay(i3), bArr, i2, min);
            j += min;
            i2 += min;
            if (j == this.zzbcp.zzaqu) {
                this.zzazw.zza(zzmzVar);
                this.zzbcp = this.zzbcp.zzht();
            }
        }
    }

    private final void zzed(long j) {
        while (j >= this.zzbcp.zzaqu) {
            this.zzazw.zza(this.zzbcp.zzbcj);
            this.zzbcp = this.zzbcp.zzht();
        }
    }

    public final void zza(zzme zzmeVar) {
        this.zzbcw = zzmeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjd
    public final void zze(zzgo zzgoVar) {
        zzgo zzgoVar2 = zzgoVar == null ? null : zzgoVar;
        boolean zzg = this.zzbcm.zzg(zzgoVar2);
        this.zzbct = zzgoVar;
        this.zzbcs = false;
        zzme zzmeVar = this.zzbcw;
        if (zzmeVar == null || !zzg) {
            return;
        }
        zzmeVar.zzf(zzgoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzjd
    public final int zza(zziv zzivVar, int i, boolean z) throws IOException, InterruptedException {
        if (!zzhv()) {
            int zzaa = zzivVar.zzaa(i);
            if (zzaa != -1) {
                return zzaa;
            }
            throw new EOFException();
        }
        try {
            int zzat = zzat(i);
            zzmz zzmzVar = this.zzbcq.zzbcj;
            int read = zzivVar.read(zzmzVar.data, zzmzVar.zzay(this.zzbcv), zzat);
            if (read == -1) {
                throw new EOFException();
            }
            this.zzbcv += read;
            this.zzbcu += read;
            return read;
        } finally {
            zzhw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjd
    public final void zza(zzoc zzocVar, int i) {
        if (!zzhv()) {
            zzocVar.zzbh(i);
            return;
        }
        while (i > 0) {
            int zzat = zzat(i);
            zzmz zzmzVar = this.zzbcq.zzbcj;
            zzocVar.zze(zzmzVar.data, zzmzVar.zzay(this.zzbcv), zzat);
            this.zzbcv += zzat;
            this.zzbcu += zzat;
            i -= zzat;
        }
        zzhw();
    }

    @Override // com.google.android.gms.internal.ads.zzjd
    public final void zza(long j, int i, int i2, int i3, zzjg zzjgVar) {
        if (!zzhv()) {
            this.zzbcm.zzec(j);
            return;
        }
        try {
            this.zzbcm.zza(j, i, this.zzbcu - i2, i2, zzjgVar);
        } finally {
            zzhw();
        }
    }

    private final boolean zzhv() {
        return this.zzbco.compareAndSet(0, 1);
    }

    private final void zzhw() {
        if (this.zzbco.compareAndSet(1, 0)) {
            return;
        }
        zzhn();
    }

    private final void zzhn() {
        this.zzbcm.zzhn();
        zzmb zzmbVar = this.zzbcp;
        if (zzmbVar.zzbci) {
            int i = (this.zzbcq.zzbci ? 1 : 0) + (((int) (this.zzbcq.zzbch - zzmbVar.zzbch)) / this.zzbcl);
            zzmz[] zzmzVarArr = new zzmz[i];
            for (int i2 = 0; i2 < i; i2++) {
                zzmzVarArr[i2] = zzmbVar.zzbcj;
                zzmbVar = zzmbVar.zzht();
            }
            this.zzazw.zza(zzmzVarArr);
        }
        zzmb zzmbVar2 = new zzmb(0L, this.zzbcl);
        this.zzbcp = zzmbVar2;
        this.zzbcq = zzmbVar2;
        this.zzbcu = 0L;
        this.zzbcv = this.zzbcl;
        this.zzazw.zzm();
    }

    private final int zzat(int i) {
        if (this.zzbcv == this.zzbcl) {
            this.zzbcv = 0;
            if (this.zzbcq.zzbci) {
                this.zzbcq = this.zzbcq.zzbck;
            }
            zzmb zzmbVar = this.zzbcq;
            zzmz zzhz = this.zzazw.zzhz();
            zzmb zzmbVar2 = new zzmb(this.zzbcq.zzaqu, this.zzbcl);
            zzmbVar.zzbcj = zzhz;
            zzmbVar.zzbck = zzmbVar2;
            zzmbVar.zzbci = true;
        }
        return Math.min(i, this.zzbcl - this.zzbcv);
    }
}
