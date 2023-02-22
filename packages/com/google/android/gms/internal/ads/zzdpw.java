package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public class zzdpw extends zzdpx {
    protected final byte[] zzhgi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdpw(byte[] bArr) {
        if (bArr == null) {
            throw null;
        }
        this.zzhgi = bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int zzaxr() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdpm
    public byte zzfm(int i) {
        return this.zzhgi[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdpm
    public byte zzfn(int i) {
        return this.zzhgi[i];
    }

    @Override // com.google.android.gms.internal.ads.zzdpm
    public int size() {
        return this.zzhgi.length;
    }

    @Override // com.google.android.gms.internal.ads.zzdpm
    public final zzdpm zzy(int i, int i2) {
        int zzh = zzh(0, i2, size());
        if (zzh == 0) {
            return zzdpm.zzhgb;
        }
        return new zzdpt(this.zzhgi, zzaxr(), zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzdpm
    protected void zza(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzhgi, 0, bArr, 0, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdpm
    public final void zza(zzdpn zzdpnVar) throws IOException {
        zzdpnVar.zzi(this.zzhgi, zzaxr(), size());
    }

    @Override // com.google.android.gms.internal.ads.zzdpm
    protected final String zza(Charset charset) {
        return new String(this.zzhgi, zzaxr(), size(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzdpm
    public final boolean zzaxo() {
        int zzaxr = zzaxr();
        return zzdtw.zzl(this.zzhgi, zzaxr, size() + zzaxr);
    }

    @Override // com.google.android.gms.internal.ads.zzdpm
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzdpm) && size() == ((zzdpm) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (obj instanceof zzdpw) {
                zzdpw zzdpwVar = (zzdpw) obj;
                int zzaxq = zzaxq();
                int zzaxq2 = zzdpwVar.zzaxq();
                if (zzaxq == 0 || zzaxq2 == 0 || zzaxq == zzaxq2) {
                    return zza(zzdpwVar, 0, size());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdpx
    final boolean zza(zzdpm zzdpmVar, int i, int i2) {
        if (i2 > zzdpmVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > zzdpmVar.size()) {
            int size2 = zzdpmVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (zzdpmVar instanceof zzdpw) {
            zzdpw zzdpwVar = (zzdpw) zzdpmVar;
            byte[] bArr = this.zzhgi;
            byte[] bArr2 = zzdpwVar.zzhgi;
            int zzaxr = zzaxr() + i2;
            int zzaxr2 = zzaxr();
            int zzaxr3 = zzdpwVar.zzaxr();
            while (zzaxr2 < zzaxr) {
                if (bArr[zzaxr2] != bArr2[zzaxr3]) {
                    return false;
                }
                zzaxr2++;
                zzaxr3++;
            }
            return true;
        } else {
            return zzdpmVar.zzy(0, i2).equals(zzy(0, i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpm
    protected final int zzg(int i, int i2, int i3) {
        return zzdqx.zza(i, this.zzhgi, zzaxr(), i3);
    }

    @Override // com.google.android.gms.internal.ads.zzdpm
    public final zzdpy zzaxp() {
        return zzdpy.zzc(this.zzhgi, zzaxr(), size(), true);
    }
}
