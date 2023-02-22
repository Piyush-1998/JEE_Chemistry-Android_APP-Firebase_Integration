package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzdpm implements Serializable, Iterable<Byte> {
    public static final zzdpm zzhgb = new zzdpw(zzdqx.zzhlj);
    private static final zzdps zzhgc;
    private static final Comparator<zzdpm> zzhgd;
    private int zzhfj = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzb(byte b) {
        return b & 255;
    }

    public abstract boolean equals(Object obj);

    public abstract int size();

    protected abstract String zza(Charset charset);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(zzdpn zzdpnVar) throws IOException;

    protected abstract void zza(byte[] bArr, int i, int i2, int i3);

    public abstract boolean zzaxo();

    public abstract zzdpy zzaxp();

    public abstract byte zzfm(int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte zzfn(int i);

    protected abstract int zzg(int i, int i2, int i3);

    public abstract zzdpm zzy(int i, int i2);

    public static zzdpm zzh(byte[] bArr, int i, int i2) {
        zzh(i, i + i2, bArr.length);
        return new zzdpw(zzhgc.zzj(bArr, i, i2));
    }

    public static zzdpm zzy(byte[] bArr) {
        return zzh(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdpm zzz(byte[] bArr) {
        return new zzdpw(bArr);
    }

    public static zzdpm zzhh(String str) {
        return new zzdpw(str.getBytes(zzdqx.UTF_8));
    }

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return zzdqx.zzhlj;
        }
        byte[] bArr = new byte[size];
        zza(bArr, 0, 0, size);
        return bArr;
    }

    public final String zzaxn() {
        return size() == 0 ? "" : zza(zzdqx.UTF_8);
    }

    public final int hashCode() {
        int i = this.zzhfj;
        if (i == 0) {
            int size = size();
            i = zzg(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.zzhfj = i;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdpu zzfo(int i) {
        return new zzdpu(i, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzaxq() {
        return this.zzhfj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Beginning index: ");
                sb.append(i);
                sb.append(" < 0");
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i2 < i) {
                StringBuilder sb2 = new StringBuilder(66);
                sb2.append("Beginning index larger than ending index: ");
                sb2.append(i);
                sb2.append(", ");
                sb2.append(i2);
                throw new IndexOutOfBoundsException(sb2.toString());
            } else {
                StringBuilder sb3 = new StringBuilder(37);
                sb3.append("End index: ");
                sb3.append(i2);
                sb3.append(" >= ");
                sb3.append(i3);
                throw new IndexOutOfBoundsException(sb3.toString());
            }
        }
        return i4;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzdpp(this);
    }

    static {
        zzhgc = zzdpj.zzaxl() ? new zzdpz(null) : new zzdpq(null);
        zzhgd = new zzdpo();
    }
}
