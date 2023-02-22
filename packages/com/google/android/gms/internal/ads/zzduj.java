package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzduj {
    private final ByteBuffer zzakm;
    private zzdqf zzhqw;
    private int zzhqx;

    private zzduj(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    public static int zzgl(int i) {
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

    private zzduj(ByteBuffer byteBuffer) {
        this.zzakm = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static zzduj zzae(byte[] bArr) {
        return zzp(bArr, 0, bArr.length);
    }

    public static zzduj zzp(byte[] bArr, int i, int i2) {
        return new zzduj(bArr, 0, i2);
    }

    public final void zzaa(int i, int i2) throws IOException {
        zzz(i, 0);
        if (i2 >= 0) {
            zzhe(i2);
        } else {
            zzfm(i2);
        }
    }

    public final void zzg(int i, String str) throws IOException {
        zzz(i, 2);
        try {
            int zzgl = zzgl(str.length());
            if (zzgl == zzgl(str.length() * 3)) {
                int position = this.zzakm.position();
                if (this.zzakm.remaining() < zzgl) {
                    throw new zzdum(position + zzgl, this.zzakm.limit());
                }
                this.zzakm.position(position + zzgl);
                zzd(str, this.zzakm);
                int position2 = this.zzakm.position();
                this.zzakm.position(position);
                zzhe((position2 - position) - zzgl);
                this.zzakm.position(position2);
                return;
            }
            zzhe(zza(str));
            zzd(str, this.zzakm);
        } catch (BufferOverflowException e) {
            zzdum zzdumVar = new zzdum(this.zzakm.position(), this.zzakm.limit());
            zzdumVar.initCause(e);
            throw zzdumVar;
        }
    }

    public final void zza(int i, zzdus zzdusVar) throws IOException {
        zzz(i, 2);
        if (zzdusVar.zzhrh < 0) {
            zzdusVar.zzazu();
        }
        zzhe(zzdusVar.zzhrh);
        zzdusVar.zza(this);
    }

    public final void zze(int i, zzdsg zzdsgVar) throws IOException {
        if (this.zzhqw == null) {
            this.zzhqw = zzdqf.zzm(this.zzakm);
            this.zzhqx = this.zzakm.position();
        } else if (this.zzhqx != this.zzakm.position()) {
            this.zzhqw.write(this.zzakm.array(), this.zzhqx, this.zzakm.position() - this.zzhqx);
            this.zzhqx = this.zzakm.position();
        }
        zzdqf zzdqfVar = this.zzhqw;
        zzdqfVar.zza(i, zzdsgVar);
        zzdqfVar.flush();
        this.zzhqx = this.zzakm.position();
    }

    public final void zza(int i, byte[] bArr) throws IOException {
        zzz(3, 2);
        zzhe(bArr.length);
        int length = bArr.length;
        if (this.zzakm.remaining() >= length) {
            this.zzakm.put(bArr, 0, length);
            return;
        }
        throw new zzdum(this.zzakm.position(), this.zzakm.limit());
    }

    private static int zza(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(i3 + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    private static void zzd(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        char charAt;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        int i3 = 0;
        if (byteBuffer.hasArray()) {
            try {
                byte[] array = byteBuffer.array();
                int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                int remaining = byteBuffer.remaining();
                int length = charSequence.length();
                int i4 = remaining + arrayOffset;
                while (i3 < length) {
                    int i5 = i3 + arrayOffset;
                    if (i5 >= i4 || (charAt = charSequence.charAt(i3)) >= 128) {
                        break;
                    }
                    array[i5] = (byte) charAt;
                    i3++;
                }
                if (i3 == length) {
                    i = arrayOffset + length;
                } else {
                    i = arrayOffset + i3;
                    while (i3 < length) {
                        char charAt2 = charSequence.charAt(i3);
                        if (charAt2 >= 128 || i >= i4) {
                            if (charAt2 < 2048 && i <= i4 - 2) {
                                int i6 = i + 1;
                                array[i] = (byte) ((charAt2 >>> 6) | 960);
                                i = i6 + 1;
                                array[i6] = (byte) ((charAt2 & '?') | 128);
                            } else if ((charAt2 >= 55296 && 57343 >= charAt2) || i > i4 - 3) {
                                if (i <= i4 - 4) {
                                    int i7 = i3 + 1;
                                    if (i7 != charSequence.length()) {
                                        char charAt3 = charSequence.charAt(i7);
                                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                                            int i8 = i + 1;
                                            array[i] = (byte) ((codePoint >>> 18) | 240);
                                            int i9 = i8 + 1;
                                            array[i8] = (byte) (((codePoint >>> 12) & 63) | 128);
                                            int i10 = i9 + 1;
                                            array[i9] = (byte) (((codePoint >>> 6) & 63) | 128);
                                            i = i10 + 1;
                                            array[i10] = (byte) ((codePoint & 63) | 128);
                                            i3 = i7;
                                        } else {
                                            i3 = i7;
                                        }
                                    }
                                    StringBuilder sb = new StringBuilder(39);
                                    sb.append("Unpaired surrogate at index ");
                                    sb.append(i3 - 1);
                                    throw new IllegalArgumentException(sb.toString());
                                }
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt2);
                                sb2.append(" at index ");
                                sb2.append(i);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            } else {
                                int i11 = i + 1;
                                array[i] = (byte) ((charAt2 >>> '\f') | 480);
                                int i12 = i11 + 1;
                                array[i11] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i2 = i12 + 1;
                                array[i12] = (byte) ((charAt2 & '?') | 128);
                            }
                            i3++;
                        } else {
                            i2 = i + 1;
                            array[i] = (byte) charAt2;
                        }
                        i = i2;
                        i3++;
                    }
                }
                byteBuffer.position(i - byteBuffer.arrayOffset());
                return;
            } catch (ArrayIndexOutOfBoundsException e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        }
        int length2 = charSequence.length();
        while (i3 < length2) {
            char charAt4 = charSequence.charAt(i3);
            if (charAt4 < 128) {
                byteBuffer.put((byte) charAt4);
            } else if (charAt4 < 2048) {
                byteBuffer.put((byte) ((charAt4 >>> 6) | 960));
                byteBuffer.put((byte) ((charAt4 & '?') | 128));
            } else if (charAt4 < 55296 || 57343 < charAt4) {
                byteBuffer.put((byte) ((charAt4 >>> '\f') | 480));
                byteBuffer.put((byte) (((charAt4 >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((charAt4 & '?') | 128));
            } else {
                int i13 = i3 + 1;
                if (i13 != charSequence.length()) {
                    char charAt5 = charSequence.charAt(i13);
                    if (Character.isSurrogatePair(charAt4, charAt5)) {
                        int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                        byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                        byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                        byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                        i3 = i13;
                    } else {
                        i3 = i13;
                    }
                }
                StringBuilder sb3 = new StringBuilder(39);
                sb3.append("Unpaired surrogate at index ");
                sb3.append(i3 - 1);
                throw new IllegalArgumentException(sb3.toString());
            }
            i3++;
        }
    }

    public static int zzae(int i, int i2) {
        return zzgd(i) + zzge(i2);
    }

    public static int zzh(int i, String str) {
        return zzgd(i) + zzhj(str);
    }

    public static int zzb(int i, zzdus zzdusVar) {
        int zzgd = zzgd(i);
        int zzazu = zzdusVar.zzazu();
        return zzgd + zzgl(zzazu) + zzazu;
    }

    public static int zzge(int i) {
        if (i >= 0) {
            return zzgl(i);
        }
        return 10;
    }

    public static int zzhj(String str) {
        int zza = zza(str);
        return zzgl(zza) + zza;
    }

    public final void zzayv() {
        if (this.zzakm.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", Integer.valueOf(this.zzakm.remaining())));
        }
    }

    private final void zzhd(int i) throws IOException {
        byte b = (byte) i;
        if (!this.zzakm.hasRemaining()) {
            throw new zzdum(this.zzakm.position(), this.zzakm.limit());
        }
        this.zzakm.put(b);
    }

    public final void zzz(int i, int i2) throws IOException {
        zzhe((i << 3) | i2);
    }

    public static int zzgd(int i) {
        return zzgl(i << 3);
    }

    private final void zzhe(int i) throws IOException {
        while ((i & (-128)) != 0) {
            zzhd((i & 127) | 128);
            i >>>= 7;
        }
        zzhd(i);
    }

    public final void zzfm(long j) throws IOException {
        while (((-128) & j) != 0) {
            zzhd((((int) j) & 127) | 128);
            j >>>= 7;
        }
        zzhd((int) j);
    }
}
