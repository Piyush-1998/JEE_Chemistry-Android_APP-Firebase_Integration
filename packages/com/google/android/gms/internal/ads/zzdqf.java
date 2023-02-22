package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzdqf extends zzdpn {
    private static final Logger logger = Logger.getLogger(zzdqf.class.getName());
    private static final boolean zzhgx = zzdtt.zzbca();
    zzdqg zzhgy;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzb {
        private final ByteBuffer zzhgz;
        private int zzhha;

        zza(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.zzhgz = byteBuffer;
            this.zzhha = byteBuffer.position();
        }

        @Override // com.google.android.gms.internal.ads.zzdqf.zzb, com.google.android.gms.internal.ads.zzdqf
        public final void flush() {
            this.zzhgz.position(this.zzhha + zzayx());
        }
    }

    public static zzdqf zzaa(byte[] bArr) {
        return new zzb(bArr, 0, bArr.length);
    }

    public static int zzbi(boolean z) {
        return 1;
    }

    public static int zzc(double d) {
        return 8;
    }

    public static int zzfe(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int zzfg(long j) {
        return 8;
    }

    public static int zzfh(long j) {
        return 8;
    }

    private static long zzfi(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zzg(float f) {
        return 4;
    }

    public static int zzgf(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzgh(int i) {
        return 4;
    }

    public static int zzgi(int i) {
        return 4;
    }

    private static int zzgk(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract void flush() throws IOException;

    public abstract void write(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zza(int i, zzdpm zzdpmVar) throws IOException;

    public abstract void zza(int i, zzdsg zzdsgVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(int i, zzdsg zzdsgVar, zzdsv zzdsvVar) throws IOException;

    abstract void zza(zzdsg zzdsgVar, zzdsv zzdsvVar) throws IOException;

    public abstract void zzaa(int i, int i2) throws IOException;

    public abstract void zzab(int i, int i2) throws IOException;

    public abstract void zzad(int i, int i2) throws IOException;

    public abstract int zzayu();

    public abstract void zzb(int i, zzdpm zzdpmVar) throws IOException;

    public abstract void zzb(int i, zzdsg zzdsgVar) throws IOException;

    public abstract void zzcz(zzdpm zzdpmVar) throws IOException;

    public abstract void zzd(byte b) throws IOException;

    public abstract void zzfa(long j) throws IOException;

    public abstract void zzfc(long j) throws IOException;

    public abstract void zzfz(int i) throws IOException;

    public abstract void zzg(int i, long j) throws IOException;

    public abstract void zzg(int i, String str) throws IOException;

    public abstract void zzg(int i, boolean z) throws IOException;

    public abstract void zzga(int i) throws IOException;

    public abstract void zzgc(int i) throws IOException;

    public abstract void zzhi(String str) throws IOException;

    public abstract void zzi(int i, long j) throws IOException;

    public abstract void zzj(zzdsg zzdsgVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzk(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzz(int i, int i2) throws IOException;

    /* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
    /* loaded from: classes.dex */
    public static class zzd extends IOException {
        zzd() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        zzd(java.lang.String r3) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L11
                java.lang.String r3 = r1.concat(r3)
                goto L16
            L11:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L16:
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdqf.zzd.<init>(java.lang.String):void");
        }

        zzd(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        zzd(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L11
                java.lang.String r3 = r1.concat(r3)
                goto L16
            L11:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L16:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdqf.zzd.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    public static zzdqf zzm(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new zza(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (zzdtt.zzbcb()) {
                return new zze(byteBuffer);
            }
            return new zzc(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzc extends zzdqf {
        private final ByteBuffer zzakm;
        private final int zzhha;
        private final ByteBuffer zzhhb;

        zzc(ByteBuffer byteBuffer) {
            super();
            this.zzhhb = byteBuffer;
            this.zzakm = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.zzhha = byteBuffer.position();
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzz(int i, int i2) throws IOException {
            zzga((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzaa(int i, int i2) throws IOException {
            zzz(i, 0);
            zzfz(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzab(int i, int i2) throws IOException {
            zzz(i, 0);
            zzga(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzad(int i, int i2) throws IOException {
            zzz(i, 5);
            zzgc(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzg(int i, long j) throws IOException {
            zzz(i, 0);
            zzfa(j);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzi(int i, long j) throws IOException {
            zzz(i, 1);
            zzfc(j);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzg(int i, boolean z) throws IOException {
            zzz(i, 0);
            zzd(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzg(int i, String str) throws IOException {
            zzz(i, 2);
            zzhi(str);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zza(int i, zzdpm zzdpmVar) throws IOException {
            zzz(i, 2);
            zzcz(zzdpmVar);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zza(int i, zzdsg zzdsgVar) throws IOException {
            zzz(i, 2);
            zzj(zzdsgVar);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        final void zza(int i, zzdsg zzdsgVar, zzdsv zzdsvVar) throws IOException {
            zzz(i, 2);
            zza(zzdsgVar, zzdsvVar);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzb(int i, zzdsg zzdsgVar) throws IOException {
            zzz(1, 3);
            zzab(2, i);
            zza(3, zzdsgVar);
            zzz(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzb(int i, zzdpm zzdpmVar) throws IOException {
            zzz(1, 3);
            zzab(2, i);
            zza(3, zzdpmVar);
            zzz(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzj(zzdsg zzdsgVar) throws IOException {
            zzga(zzdsgVar.zzazu());
            zzdsgVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        final void zza(zzdsg zzdsgVar, zzdsv zzdsvVar) throws IOException {
            zzdpf zzdpfVar = (zzdpf) zzdsgVar;
            int zzaxh = zzdpfVar.zzaxh();
            if (zzaxh == -1) {
                zzaxh = zzdsvVar.zzau(zzdpfVar);
                zzdpfVar.zzfi(zzaxh);
            }
            zzga(zzaxh);
            zzdsvVar.zza(zzdsgVar, this.zzhgy);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzd(byte b) throws IOException {
            try {
                this.zzakm.put(b);
            } catch (BufferOverflowException e) {
                throw new zzd(e);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzcz(zzdpm zzdpmVar) throws IOException {
            zzga(zzdpmVar.size());
            zzdpmVar.zza(this);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzk(byte[] bArr, int i, int i2) throws IOException {
            zzga(i2);
            write(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzfz(int i) throws IOException {
            if (i >= 0) {
                zzga(i);
            } else {
                zzfa(i);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzga(int i) throws IOException {
            while ((i & (-128)) != 0) {
                try {
                    this.zzakm.put((byte) ((i & 127) | 128));
                    i >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new zzd(e);
                }
            }
            this.zzakm.put((byte) i);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzgc(int i) throws IOException {
            try {
                this.zzakm.putInt(i);
            } catch (BufferOverflowException e) {
                throw new zzd(e);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzfa(long j) throws IOException {
            while (((-128) & j) != 0) {
                try {
                    this.zzakm.put((byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new zzd(e);
                }
            }
            this.zzakm.put((byte) j);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzfc(long j) throws IOException {
            try {
                this.zzakm.putLong(j);
            } catch (BufferOverflowException e) {
                throw new zzd(e);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.zzakm.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new zzd(e);
            } catch (BufferOverflowException e2) {
                throw new zzd(e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdpn
        public final void zzi(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzhi(String str) throws IOException {
            int position = this.zzakm.position();
            try {
                int zzgf = zzgf(str.length() * 3);
                int zzgf2 = zzgf(str.length());
                if (zzgf2 == zzgf) {
                    int position2 = this.zzakm.position() + zzgf2;
                    this.zzakm.position(position2);
                    zzhk(str);
                    int position3 = this.zzakm.position();
                    this.zzakm.position(position);
                    zzga(position3 - position2);
                    this.zzakm.position(position3);
                    return;
                }
                zzga(zzdtw.zza(str));
                zzhk(str);
            } catch (zzdtz e) {
                this.zzakm.position(position);
                zza(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzd(e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void flush() {
            this.zzhhb.position(this.zzakm.position());
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final int zzayu() {
            return this.zzakm.remaining();
        }

        private final void zzhk(String str) throws IOException {
            try {
                zzdtw.zza(str, this.zzakm);
            } catch (IndexOutOfBoundsException e) {
                throw new zzd(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zze extends zzdqf {
        private final ByteBuffer zzakm;
        private long zzamq;
        private final ByteBuffer zzhhb;
        private final long zzhhc;
        private final long zzhhd;
        private final long zzhhe;
        private final long zzhhf;

        zze(ByteBuffer byteBuffer) {
            super();
            this.zzhhb = byteBuffer;
            this.zzakm = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long zzn = zzdtt.zzn(byteBuffer);
            this.zzhhc = zzn;
            this.zzhhd = zzn + byteBuffer.position();
            long limit = this.zzhhc + byteBuffer.limit();
            this.zzhhe = limit;
            this.zzhhf = limit - 10;
            this.zzamq = this.zzhhd;
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzz(int i, int i2) throws IOException {
            zzga((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzaa(int i, int i2) throws IOException {
            zzz(i, 0);
            zzfz(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzab(int i, int i2) throws IOException {
            zzz(i, 0);
            zzga(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzad(int i, int i2) throws IOException {
            zzz(i, 5);
            zzgc(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzg(int i, long j) throws IOException {
            zzz(i, 0);
            zzfa(j);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzi(int i, long j) throws IOException {
            zzz(i, 1);
            zzfc(j);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzg(int i, boolean z) throws IOException {
            zzz(i, 0);
            zzd(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzg(int i, String str) throws IOException {
            zzz(i, 2);
            zzhi(str);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zza(int i, zzdpm zzdpmVar) throws IOException {
            zzz(i, 2);
            zzcz(zzdpmVar);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zza(int i, zzdsg zzdsgVar) throws IOException {
            zzz(i, 2);
            zzj(zzdsgVar);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        final void zza(int i, zzdsg zzdsgVar, zzdsv zzdsvVar) throws IOException {
            zzz(i, 2);
            zza(zzdsgVar, zzdsvVar);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzb(int i, zzdsg zzdsgVar) throws IOException {
            zzz(1, 3);
            zzab(2, i);
            zza(3, zzdsgVar);
            zzz(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzb(int i, zzdpm zzdpmVar) throws IOException {
            zzz(1, 3);
            zzab(2, i);
            zza(3, zzdpmVar);
            zzz(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzj(zzdsg zzdsgVar) throws IOException {
            zzga(zzdsgVar.zzazu());
            zzdsgVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        final void zza(zzdsg zzdsgVar, zzdsv zzdsvVar) throws IOException {
            zzdpf zzdpfVar = (zzdpf) zzdsgVar;
            int zzaxh = zzdpfVar.zzaxh();
            if (zzaxh == -1) {
                zzaxh = zzdsvVar.zzau(zzdpfVar);
                zzdpfVar.zzfi(zzaxh);
            }
            zzga(zzaxh);
            zzdsvVar.zza(zzdsgVar, this.zzhgy);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzd(byte b) throws IOException {
            long j = this.zzamq;
            if (j >= this.zzhhe) {
                throw new zzd(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.zzamq), Long.valueOf(this.zzhhe), 1));
            }
            this.zzamq = 1 + j;
            zzdtt.zza(j, b);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzcz(zzdpm zzdpmVar) throws IOException {
            zzga(zzdpmVar.size());
            zzdpmVar.zza(this);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzk(byte[] bArr, int i, int i2) throws IOException {
            zzga(i2);
            write(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzfz(int i) throws IOException {
            if (i >= 0) {
                zzga(i);
            } else {
                zzfa(i);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzga(int i) throws IOException {
            if (this.zzamq <= this.zzhhf) {
                while ((i & (-128)) != 0) {
                    long j = this.zzamq;
                    this.zzamq = j + 1;
                    zzdtt.zza(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                long j2 = this.zzamq;
                this.zzamq = 1 + j2;
                zzdtt.zza(j2, (byte) i);
                return;
            }
            while (true) {
                long j3 = this.zzamq;
                if (j3 >= this.zzhhe) {
                    throw new zzd(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.zzamq), Long.valueOf(this.zzhhe), 1));
                }
                if ((i & (-128)) == 0) {
                    this.zzamq = 1 + j3;
                    zzdtt.zza(j3, (byte) i);
                    return;
                }
                this.zzamq = j3 + 1;
                zzdtt.zza(j3, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzgc(int i) throws IOException {
            this.zzakm.putInt((int) (this.zzamq - this.zzhhc), i);
            this.zzamq += 4;
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzfa(long j) throws IOException {
            if (this.zzamq <= this.zzhhf) {
                while ((j & (-128)) != 0) {
                    long j2 = this.zzamq;
                    this.zzamq = j2 + 1;
                    zzdtt.zza(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j3 = this.zzamq;
                this.zzamq = 1 + j3;
                zzdtt.zza(j3, (byte) j);
                return;
            }
            while (true) {
                long j4 = this.zzamq;
                if (j4 >= this.zzhhe) {
                    throw new zzd(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.zzamq), Long.valueOf(this.zzhhe), 1));
                }
                if ((j & (-128)) == 0) {
                    this.zzamq = 1 + j4;
                    zzdtt.zza(j4, (byte) j);
                    return;
                }
                this.zzamq = j4 + 1;
                zzdtt.zza(j4, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzfc(long j) throws IOException {
            this.zzakm.putLong((int) (this.zzamq - this.zzhhc), j);
            this.zzamq += 8;
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = i2;
                long j2 = this.zzamq;
                if (this.zzhhe - j >= j2) {
                    zzdtt.zza(bArr, i, j2, j);
                    this.zzamq += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            }
            throw new zzd(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.zzamq), Long.valueOf(this.zzhhe), Integer.valueOf(i2)));
        }

        @Override // com.google.android.gms.internal.ads.zzdpn
        public final void zzi(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzhi(String str) throws IOException {
            long j = this.zzamq;
            try {
                int zzgf = zzgf(str.length() * 3);
                int zzgf2 = zzgf(str.length());
                if (zzgf2 == zzgf) {
                    int i = ((int) (this.zzamq - this.zzhhc)) + zzgf2;
                    this.zzakm.position(i);
                    zzdtw.zza(str, this.zzakm);
                    int position = this.zzakm.position() - i;
                    zzga(position);
                    this.zzamq += position;
                    return;
                }
                int zza = zzdtw.zza(str);
                zzga(zza);
                zzfj(this.zzamq);
                zzdtw.zza(str, this.zzakm);
                this.zzamq += zza;
            } catch (zzdtz e) {
                this.zzamq = j;
                zzfj(j);
                zza(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzd(e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzd(e3);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void flush() {
            this.zzhhb.position((int) (this.zzamq - this.zzhhc));
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final int zzayu() {
            return (int) (this.zzhhe - this.zzamq);
        }

        private final void zzfj(long j) {
            this.zzakm.position((int) (j - this.zzhhc));
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
    /* loaded from: classes.dex */
    static class zzb extends zzdqf {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        zzb(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.buffer = bArr;
            this.offset = i;
            this.position = i;
            this.limit = i3;
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public void flush() {
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzz(int i, int i2) throws IOException {
            zzga((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzaa(int i, int i2) throws IOException {
            zzz(i, 0);
            zzfz(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzab(int i, int i2) throws IOException {
            zzz(i, 0);
            zzga(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzad(int i, int i2) throws IOException {
            zzz(i, 5);
            zzgc(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzg(int i, long j) throws IOException {
            zzz(i, 0);
            zzfa(j);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzi(int i, long j) throws IOException {
            zzz(i, 1);
            zzfc(j);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzg(int i, boolean z) throws IOException {
            zzz(i, 0);
            zzd(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzg(int i, String str) throws IOException {
            zzz(i, 2);
            zzhi(str);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zza(int i, zzdpm zzdpmVar) throws IOException {
            zzz(i, 2);
            zzcz(zzdpmVar);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzcz(zzdpm zzdpmVar) throws IOException {
            zzga(zzdpmVar.size());
            zzdpmVar.zza(this);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzk(byte[] bArr, int i, int i2) throws IOException {
            zzga(i2);
            write(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zza(int i, zzdsg zzdsgVar) throws IOException {
            zzz(i, 2);
            zzj(zzdsgVar);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        final void zza(int i, zzdsg zzdsgVar, zzdsv zzdsvVar) throws IOException {
            zzz(i, 2);
            zzdpf zzdpfVar = (zzdpf) zzdsgVar;
            int zzaxh = zzdpfVar.zzaxh();
            if (zzaxh == -1) {
                zzaxh = zzdsvVar.zzau(zzdpfVar);
                zzdpfVar.zzfi(zzaxh);
            }
            zzga(zzaxh);
            zzdsvVar.zza(zzdsgVar, this.zzhgy);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzb(int i, zzdsg zzdsgVar) throws IOException {
            zzz(1, 3);
            zzab(2, i);
            zza(3, zzdsgVar);
            zzz(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzb(int i, zzdpm zzdpmVar) throws IOException {
            zzz(1, 3);
            zzab(2, i);
            zza(3, zzdpmVar);
            zzz(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzj(zzdsg zzdsgVar) throws IOException {
            zzga(zzdsgVar.zzazu());
            zzdsgVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        final void zza(zzdsg zzdsgVar, zzdsv zzdsvVar) throws IOException {
            zzdpf zzdpfVar = (zzdpf) zzdsgVar;
            int zzaxh = zzdpfVar.zzaxh();
            if (zzaxh == -1) {
                zzaxh = zzdsvVar.zzau(zzdpfVar);
                zzdpfVar.zzfi(zzaxh);
            }
            zzga(zzaxh);
            zzdsvVar.zza(zzdsgVar, this.zzhgy);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzd(byte b) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzfz(int i) throws IOException {
            if (i >= 0) {
                zzga(i);
            } else {
                zzfa(i);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzga(int i) throws IOException {
            if (!zzdqf.zzhgx || zzdpj.zzaxl() || zzayu() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        byte[] bArr = this.buffer;
                        int i2 = this.position;
                        this.position = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new zzd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                    }
                }
                byte[] bArr2 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                bArr2[i3] = (byte) i;
            } else if ((i & (-128)) == 0) {
                byte[] bArr3 = this.buffer;
                int i4 = this.position;
                this.position = i4 + 1;
                zzdtt.zza(bArr3, i4, (byte) i);
            } else {
                byte[] bArr4 = this.buffer;
                int i5 = this.position;
                this.position = i5 + 1;
                zzdtt.zza(bArr4, i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & (-128)) == 0) {
                    byte[] bArr5 = this.buffer;
                    int i7 = this.position;
                    this.position = i7 + 1;
                    zzdtt.zza(bArr5, i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.buffer;
                int i8 = this.position;
                this.position = i8 + 1;
                zzdtt.zza(bArr6, i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & (-128)) == 0) {
                    byte[] bArr7 = this.buffer;
                    int i10 = this.position;
                    this.position = i10 + 1;
                    zzdtt.zza(bArr7, i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.buffer;
                int i11 = this.position;
                this.position = i11 + 1;
                zzdtt.zza(bArr8, i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & (-128)) == 0) {
                    byte[] bArr9 = this.buffer;
                    int i13 = this.position;
                    this.position = i13 + 1;
                    zzdtt.zza(bArr9, i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.buffer;
                int i14 = this.position;
                this.position = i14 + 1;
                zzdtt.zza(bArr10, i14, (byte) (i12 | 128));
                byte[] bArr11 = this.buffer;
                int i15 = this.position;
                this.position = i15 + 1;
                zzdtt.zza(bArr11, i15, (byte) (i12 >>> 7));
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzgc(int i) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                int i3 = i2 + 1;
                this.position = i3;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.buffer;
                int i4 = i3 + 1;
                this.position = i4;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.buffer;
                int i5 = i4 + 1;
                this.position = i5;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.buffer;
                this.position = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzfa(long j) throws IOException {
            if (zzdqf.zzhgx && zzayu() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    zzdtt.zza(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                zzdtt.zza(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i3 = this.position;
                    this.position = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                }
            }
            byte[] bArr4 = this.buffer;
            int i4 = this.position;
            this.position = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzfc(long j) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                int i2 = i + 1;
                this.position = i2;
                bArr[i] = (byte) j;
                byte[] bArr2 = this.buffer;
                int i3 = i2 + 1;
                this.position = i3;
                bArr2[i2] = (byte) (j >> 8);
                byte[] bArr3 = this.buffer;
                int i4 = i3 + 1;
                this.position = i4;
                bArr3[i3] = (byte) (j >> 16);
                byte[] bArr4 = this.buffer;
                int i5 = i4 + 1;
                this.position = i5;
                bArr4[i4] = (byte) (j >> 24);
                byte[] bArr5 = this.buffer;
                int i6 = i5 + 1;
                this.position = i6;
                bArr5[i5] = (byte) (j >> 32);
                byte[] bArr6 = this.buffer;
                int i7 = i6 + 1;
                this.position = i7;
                bArr6[i6] = (byte) (j >> 40);
                byte[] bArr7 = this.buffer;
                int i8 = i7 + 1;
                this.position = i8;
                bArr7[i7] = (byte) (j >> 48);
                byte[] bArr8 = this.buffer;
                this.position = i8 + 1;
                bArr8[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdpn
        public final void zzi(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final void zzhi(String str) throws IOException {
            int i = this.position;
            try {
                int zzgf = zzgf(str.length() * 3);
                int zzgf2 = zzgf(str.length());
                if (zzgf2 == zzgf) {
                    int i2 = i + zzgf2;
                    this.position = i2;
                    int zza = zzdtw.zza(str, this.buffer, i2, zzayu());
                    this.position = i;
                    zzga((zza - i) - zzgf2);
                    this.position = zza;
                    return;
                }
                zzga(zzdtw.zza(str));
                this.position = zzdtw.zza(str, this.buffer, this.position, zzayu());
            } catch (zzdtz e) {
                this.position = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzd(e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdqf
        public final int zzayu() {
            return this.limit - this.position;
        }

        public final int zzayx() {
            return this.position - this.offset;
        }
    }

    private zzdqf() {
    }

    public final void zzac(int i, int i2) throws IOException {
        zzab(i, zzgk(i2));
    }

    public final void zzh(int i, long j) throws IOException {
        zzg(i, zzfi(j));
    }

    public final void zza(int i, float f) throws IOException {
        zzad(i, Float.floatToRawIntBits(f));
    }

    public final void zzb(int i, double d) throws IOException {
        zzi(i, Double.doubleToRawLongBits(d));
    }

    public final void zzgb(int i) throws IOException {
        zzga(zzgk(i));
    }

    public final void zzfb(long j) throws IOException {
        zzfa(zzfi(j));
    }

    public final void zzf(float f) throws IOException {
        zzgc(Float.floatToRawIntBits(f));
    }

    public final void zzb(double d) throws IOException {
        zzfc(Double.doubleToRawLongBits(d));
    }

    public final void zzbh(boolean z) throws IOException {
        zzd(z ? (byte) 1 : (byte) 0);
    }

    public static int zzae(int i, int i2) {
        return zzgd(i) + zzge(i2);
    }

    public static int zzaf(int i, int i2) {
        return zzgd(i) + zzgf(i2);
    }

    public static int zzag(int i, int i2) {
        return zzgd(i) + zzgf(zzgk(i2));
    }

    public static int zzah(int i, int i2) {
        return zzgd(i) + 4;
    }

    public static int zzai(int i, int i2) {
        return zzgd(i) + 4;
    }

    public static int zzj(int i, long j) {
        return zzgd(i) + zzfe(j);
    }

    public static int zzk(int i, long j) {
        return zzgd(i) + zzfe(j);
    }

    public static int zzl(int i, long j) {
        return zzgd(i) + zzfe(zzfi(j));
    }

    public static int zzm(int i, long j) {
        return zzgd(i) + 8;
    }

    public static int zzn(int i, long j) {
        return zzgd(i) + 8;
    }

    public static int zzb(int i, float f) {
        return zzgd(i) + 4;
    }

    public static int zzc(int i, double d) {
        return zzgd(i) + 8;
    }

    public static int zzh(int i, boolean z) {
        return zzgd(i) + 1;
    }

    public static int zzaj(int i, int i2) {
        return zzgd(i) + zzge(i2);
    }

    public static int zzh(int i, String str) {
        return zzgd(i) + zzhj(str);
    }

    public static int zzc(int i, zzdpm zzdpmVar) {
        int zzgd = zzgd(i);
        int size = zzdpmVar.size();
        return zzgd + zzgf(size) + size;
    }

    public static int zza(int i, zzdrl zzdrlVar) {
        int zzgd = zzgd(i);
        int zzazu = zzdrlVar.zzazu();
        return zzgd + zzgf(zzazu) + zzazu;
    }

    public static int zzc(int i, zzdsg zzdsgVar) {
        return zzgd(i) + zzk(zzdsgVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, zzdsg zzdsgVar, zzdsv zzdsvVar) {
        return zzgd(i) + zzb(zzdsgVar, zzdsvVar);
    }

    public static int zzd(int i, zzdsg zzdsgVar) {
        return (zzgd(1) << 1) + zzaf(2, i) + zzc(3, zzdsgVar);
    }

    public static int zzd(int i, zzdpm zzdpmVar) {
        return (zzgd(1) << 1) + zzaf(2, i) + zzc(3, zzdpmVar);
    }

    public static int zzb(int i, zzdrl zzdrlVar) {
        return (zzgd(1) << 1) + zzaf(2, i) + zza(3, zzdrlVar);
    }

    public static int zzgd(int i) {
        return zzgf(i << 3);
    }

    public static int zzge(int i) {
        if (i >= 0) {
            return zzgf(i);
        }
        return 10;
    }

    public static int zzgg(int i) {
        return zzgf(zzgk(i));
    }

    public static int zzfd(long j) {
        return zzfe(j);
    }

    public static int zzff(long j) {
        return zzfe(zzfi(j));
    }

    public static int zzgj(int i) {
        return zzge(i);
    }

    public static int zzhj(String str) {
        int length;
        try {
            length = zzdtw.zza(str);
        } catch (zzdtz unused) {
            length = str.getBytes(zzdqx.UTF_8).length;
        }
        return zzgf(length) + length;
    }

    public static int zza(zzdrl zzdrlVar) {
        int zzazu = zzdrlVar.zzazu();
        return zzgf(zzazu) + zzazu;
    }

    public static int zzda(zzdpm zzdpmVar) {
        int size = zzdpmVar.size();
        return zzgf(size) + size;
    }

    public static int zzab(byte[] bArr) {
        int length = bArr.length;
        return zzgf(length) + length;
    }

    public static int zzk(zzdsg zzdsgVar) {
        int zzazu = zzdsgVar.zzazu();
        return zzgf(zzazu) + zzazu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(zzdsg zzdsgVar, zzdsv zzdsvVar) {
        zzdpf zzdpfVar = (zzdpf) zzdsgVar;
        int zzaxh = zzdpfVar.zzaxh();
        if (zzaxh == -1) {
            zzaxh = zzdsvVar.zzau(zzdpfVar);
            zzdpfVar.zzfi(zzaxh);
        }
        return zzgf(zzaxh) + zzaxh;
    }

    public final void zzayv() {
        if (zzayu() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zza(String str, zzdtz zzdtzVar) throws IOException {
        logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzdtzVar);
        byte[] bytes = str.getBytes(zzdqx.UTF_8);
        try {
            zzga(bytes.length);
            zzi(bytes, 0, bytes.length);
        } catch (zzd e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzd(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int zzc(int i, zzdsg zzdsgVar, zzdsv zzdsvVar) {
        int zzgd = zzgd(i) << 1;
        zzdpf zzdpfVar = (zzdpf) zzdsgVar;
        int zzaxh = zzdpfVar.zzaxh();
        if (zzaxh == -1) {
            zzaxh = zzdsvVar.zzau(zzdpfVar);
            zzdpfVar.zzfi(zzaxh);
        }
        return zzgd + zzaxh;
    }

    @Deprecated
    public static int zzl(zzdsg zzdsgVar) {
        return zzdsgVar.zzazu();
    }

    @Deprecated
    public static int zzgl(int i) {
        return zzgf(i);
    }
}
