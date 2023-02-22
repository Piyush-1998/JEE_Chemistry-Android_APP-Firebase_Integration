package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzjn {
    public int height;
    public int number;
    public int type;
    public int width;
    public zzin zzaff;
    public int zzafj;
    public byte[] zzafk;
    public int zzafm;
    public int zzafn;
    private String zzaft;
    public String zzapl;
    public int zzapm;
    public boolean zzapn;
    public byte[] zzapo;
    public zzjg zzapp;
    public byte[] zzapq;
    public int zzapr;
    public int zzaps;
    public int zzapt;
    public boolean zzapu;
    public int zzapv;
    public int zzapw;
    public int zzapx;
    public int zzapy;
    public int zzapz;
    public float zzaqa;
    public float zzaqb;
    public float zzaqc;
    public float zzaqd;
    public float zzaqe;
    public float zzaqf;
    public float zzaqg;
    public float zzaqh;
    public float zzaqi;
    public float zzaqj;
    public int zzaqk;
    public long zzaql;
    public long zzaqm;
    public boolean zzaqn;
    public boolean zzaqo;
    public zzjd zzaqp;
    public int zzaqq;

    private zzjn() {
        this.width = -1;
        this.height = -1;
        this.zzapr = -1;
        this.zzaps = -1;
        this.zzapt = 0;
        this.zzafk = null;
        this.zzafj = -1;
        this.zzapu = false;
        this.zzapv = -1;
        this.zzapw = -1;
        this.zzapx = -1;
        this.zzapy = 1000;
        this.zzapz = 200;
        this.zzaqa = -1.0f;
        this.zzaqb = -1.0f;
        this.zzaqc = -1.0f;
        this.zzaqd = -1.0f;
        this.zzaqe = -1.0f;
        this.zzaqf = -1.0f;
        this.zzaqg = -1.0f;
        this.zzaqh = -1.0f;
        this.zzaqi = -1.0f;
        this.zzaqj = -1.0f;
        this.zzafm = 1;
        this.zzaqk = -1;
        this.zzafn = 8000;
        this.zzaql = 0L;
        this.zzaqm = 0L;
        this.zzaqo = true;
        this.zzaft = "eng";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:364:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x034f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zziy r43, int r44) throws com.google.android.gms.internal.ads.zzgv {
        /*
            Method dump skipped, instructions count: 1422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjn.zza(com.google.android.gms.internal.ads.zziy, int):void");
    }

    private static List<byte[]> zza(zzoc zzocVar) throws zzgv {
        try {
            zzocVar.zzbh(16);
            if (zzocVar.zzip() != 826496599) {
                return null;
            }
            byte[] bArr = zzocVar.data;
            for (int position = zzocVar.getPosition() + 20; position < bArr.length - 4; position++) {
                if (bArr[position] == 0 && bArr[position + 1] == 0 && bArr[position + 2] == 1 && bArr[position + 3] == 15) {
                    return Collections.singletonList(Arrays.copyOfRange(bArr, position, bArr.length));
                }
            }
            throw new zzgv("Failed to find FourCC VC1 initialization data");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzgv("Error parsing FourCC VC1 codec private");
        }
    }

    private static List<byte[]> zzd(byte[] bArr) throws zzgv {
        try {
            if (bArr[0] != 2) {
                throw new zzgv("Error parsing vorbis codec private");
            }
            int i = 1;
            int i2 = 0;
            while (bArr[i] == -1) {
                i2 += 255;
                i++;
            }
            int i3 = i + 1;
            int i4 = i2 + bArr[i];
            int i5 = 0;
            while (bArr[i3] == -1) {
                i5 += 255;
                i3++;
            }
            int i6 = i3 + 1;
            int i7 = i5 + bArr[i3];
            if (bArr[i6] != 1) {
                throw new zzgv("Error parsing vorbis codec private");
            }
            byte[] bArr2 = new byte[i4];
            System.arraycopy(bArr, i6, bArr2, 0, i4);
            int i8 = i6 + i4;
            if (bArr[i8] != 3) {
                throw new zzgv("Error parsing vorbis codec private");
            }
            int i9 = i8 + i7;
            if (bArr[i9] != 5) {
                throw new zzgv("Error parsing vorbis codec private");
            }
            byte[] bArr3 = new byte[bArr.length - i9];
            System.arraycopy(bArr, i9, bArr3, 0, bArr.length - i9);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzgv("Error parsing vorbis codec private");
        }
    }

    private static boolean zzb(zzoc zzocVar) throws zzgv {
        UUID uuid;
        UUID uuid2;
        try {
            int zzin = zzocVar.zzin();
            if (zzin == 1) {
                return true;
            }
            if (zzin == 65534) {
                zzocVar.zzbg(24);
                long readLong = zzocVar.readLong();
                uuid = zzjm.zzann;
                if (readLong == uuid.getMostSignificantBits()) {
                    long readLong2 = zzocVar.readLong();
                    uuid2 = zzjm.zzann;
                    if (readLong2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzgv("Error parsing MS/ACM codec private");
        }
    }

    public /* synthetic */ zzjn(zzjl zzjlVar) {
        this();
    }

    public static /* synthetic */ String zza(zzjn zzjnVar, String str) {
        zzjnVar.zzaft = str;
        return str;
    }
}
