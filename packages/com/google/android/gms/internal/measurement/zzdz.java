package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzdz extends zzdw {
    protected final byte[] zzado;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdz(byte[] bArr) {
        if (bArr == null) {
            throw null;
        }
        this.zzado = bArr;
    }

    protected int zzsd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzdp
    public byte zzaq(int i) {
        return this.zzado[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzdp
    public byte zzar(int i) {
        return this.zzado[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzdp
    public int size() {
        return this.zzado.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzdp
    public final zzdp zza(int i, int i2) {
        int zzb = zzb(0, i2, size());
        if (zzb == 0) {
            return zzdp.zzadh;
        }
        return new zzds(this.zzado, zzsd(), zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzdp
    public final void zza(zzdm zzdmVar) throws IOException {
        zzdmVar.zza(this.zzado, zzsd(), size());
    }

    @Override // com.google.android.gms.internal.measurement.zzdp
    protected final String zza(Charset charset) {
        return new String(this.zzado, zzsd(), size(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzdp
    public final boolean zzsb() {
        int zzsd = zzsd();
        return zzhy.zzf(this.zzado, zzsd, size() + zzsd);
    }

    @Override // com.google.android.gms.internal.measurement.zzdp
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzdp) && size() == ((zzdp) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (obj instanceof zzdz) {
                zzdz zzdzVar = (zzdz) obj;
                int zzsc = zzsc();
                int zzsc2 = zzdzVar.zzsc();
                if (zzsc == 0 || zzsc2 == 0 || zzsc == zzsc2) {
                    return zza(zzdzVar, 0, size());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzdw
    final boolean zza(zzdp zzdpVar, int i, int i2) {
        if (i2 > zzdpVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > zzdpVar.size()) {
            int size2 = zzdpVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (zzdpVar instanceof zzdz) {
            zzdz zzdzVar = (zzdz) zzdpVar;
            byte[] bArr = this.zzado;
            byte[] bArr2 = zzdzVar.zzado;
            int zzsd = zzsd() + i2;
            int zzsd2 = zzsd();
            int zzsd3 = zzdzVar.zzsd();
            while (zzsd2 < zzsd) {
                if (bArr[zzsd2] != bArr2[zzsd3]) {
                    return false;
                }
                zzsd2++;
                zzsd3++;
            }
            return true;
        } else {
            return zzdpVar.zza(0, i2).equals(zza(0, i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdp
    protected final int zza(int i, int i2, int i3) {
        return zzez.zza(i, this.zzado, zzsd(), i3);
    }
}
