package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzsp;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zztl extends zzdul<zztl> {
    private Integer zzcao = null;
    public String zzcap = null;
    private Integer zzcaq = null;
    private zzsv zzcar = null;
    private zztk zzcas = null;
    public long[] zzcat = zzduu.zzhrm;
    public zztj zzcau = null;
    private zzti zzcav = null;
    private zzsp.zzh zzcaw = null;
    public zzth zzcax = null;
    public zzsp.zzj zzcay = null;
    public zzsp.zzw zzcaz = null;
    private zzsp.zza zzcba = null;

    public zztl() {
        this.zzhqy = null;
        this.zzhrh = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdul, com.google.android.gms.internal.ads.zzdus
    public final void zza(zzduj zzdujVar) throws IOException {
        String str = this.zzcap;
        if (str != null) {
            zzdujVar.zzg(10, str);
        }
        long[] jArr = this.zzcat;
        if (jArr != null && jArr.length > 0) {
            int i = 0;
            while (true) {
                long[] jArr2 = this.zzcat;
                if (i >= jArr2.length) {
                    break;
                }
                long j = jArr2[i];
                zzdujVar.zzz(14, 0);
                zzdujVar.zzfm(j);
                i++;
            }
        }
        zztj zztjVar = this.zzcau;
        if (zztjVar != null) {
            zzdujVar.zza(15, zztjVar);
        }
        zzth zzthVar = this.zzcax;
        if (zzthVar != null) {
            zzdujVar.zza(18, zzthVar);
        }
        zzsp.zzj zzjVar = this.zzcay;
        if (zzjVar != null) {
            zzdujVar.zze(19, zzjVar);
        }
        zzsp.zzw zzwVar = this.zzcaz;
        if (zzwVar != null) {
            zzdujVar.zze(20, zzwVar);
        }
        super.zza(zzdujVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdul, com.google.android.gms.internal.ads.zzdus
    public final int zznx() {
        long[] jArr;
        int zznx = super.zznx();
        String str = this.zzcap;
        if (str != null) {
            zznx += zzduj.zzh(10, str);
        }
        long[] jArr2 = this.zzcat;
        if (jArr2 != null && jArr2.length > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                jArr = this.zzcat;
                int i3 = 1;
                if (i >= jArr.length) {
                    break;
                }
                long j = jArr[i];
                if (((-128) & j) != 0) {
                    i3 = ((-16384) & j) == 0 ? 2 : ((-2097152) & j) == 0 ? 3 : ((-268435456) & j) == 0 ? 4 : ((-34359738368L) & j) == 0 ? 5 : ((-4398046511104L) & j) == 0 ? 6 : ((-562949953421312L) & j) == 0 ? 7 : ((-72057594037927936L) & j) == 0 ? 8 : (Long.MIN_VALUE & j) == 0 ? 9 : 10;
                }
                i2 += i3;
                i++;
            }
            zznx = zznx + i2 + (jArr.length * 1);
        }
        zztj zztjVar = this.zzcau;
        if (zztjVar != null) {
            zznx += zzduj.zzb(15, zztjVar);
        }
        zzth zzthVar = this.zzcax;
        if (zzthVar != null) {
            zznx += zzduj.zzb(18, zzthVar);
        }
        zzsp.zzj zzjVar = this.zzcay;
        if (zzjVar != null) {
            zznx += zzdqf.zzc(19, zzjVar);
        }
        zzsp.zzw zzwVar = this.zzcaz;
        return zzwVar != null ? zznx + zzdqf.zzc(20, zzwVar) : zznx;
    }
}
