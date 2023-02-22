package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzjq {
    private final zzoc zzant = new zzoc(8);
    private int zzaqt;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(com.google.android.gms.internal.ads.zziv r18) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            long r2 = r18.getLength()
            r4 = 1024(0x400, double:5.06E-321)
            r6 = -1
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L16
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L15
            goto L16
        L15:
            r4 = r2
        L16:
            int r5 = (int) r4
            com.google.android.gms.internal.ads.zzoc r4 = r0.zzant
            byte[] r4 = r4.data
            r8 = 0
            r9 = 4
            r1.zza(r4, r8, r9)
            com.google.android.gms.internal.ads.zzoc r4 = r0.zzant
            long r10 = r4.zzio()
            r0.zzaqt = r9
        L28:
            r12 = 440786851(0x1a45dfa3, double:2.1777764E-315)
            r4 = 1
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 == 0) goto L52
            int r9 = r0.zzaqt
            int r9 = r9 + r4
            r0.zzaqt = r9
            if (r9 != r5) goto L38
            return r8
        L38:
            com.google.android.gms.internal.ads.zzoc r9 = r0.zzant
            byte[] r9 = r9.data
            r1.zza(r9, r8, r4)
            r4 = 8
            long r9 = r10 << r4
            r11 = -256(0xffffffffffffff00, double:NaN)
            long r9 = r9 & r11
            com.google.android.gms.internal.ads.zzoc r4 = r0.zzant
            byte[] r4 = r4.data
            r4 = r4[r8]
            r4 = r4 & 255(0xff, float:3.57E-43)
            long r11 = (long) r4
            long r9 = r9 | r11
            r10 = r9
            goto L28
        L52:
            long r9 = r17.zzc(r18)
            int r5 = r0.zzaqt
            long r11 = (long) r5
            r13 = -9223372036854775808
            int r5 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r5 == 0) goto La5
            int r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r5 == 0) goto L6a
            long r5 = r11 + r9
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 < 0) goto L6a
            goto La5
        L6a:
            int r2 = r0.zzaqt
            long r5 = (long) r2
            long r15 = r11 + r9
            int r3 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r3 >= 0) goto L9f
            long r2 = r17.zzc(r18)
            int r5 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r5 != 0) goto L7c
            return r8
        L7c:
            long r2 = r17.zzc(r18)
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 < 0) goto L9e
            r15 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r7 <= 0) goto L8e
            goto L9e
        L8e:
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 == 0) goto L6a
            int r5 = (int) r2
            r1.zzac(r5)
            int r5 = r0.zzaqt
            long r5 = (long) r5
            long r5 = r5 + r2
            int r2 = (int) r5
            r0.zzaqt = r2
            goto L6a
        L9e:
            return r8
        L9f:
            long r1 = (long) r2
            int r3 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r3 != 0) goto La5
            return r4
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjq.zza(com.google.android.gms.internal.ads.zziv):boolean");
    }

    private final long zzc(zziv zzivVar) throws IOException, InterruptedException {
        int i = 0;
        zzivVar.zza(this.zzant.data, 0, 1);
        int i2 = this.zzant.data[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (i3 ^ (-1));
        zzivVar.zza(this.zzant.data, 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.zzant.data[i] & 255) + (i5 << 8);
        }
        this.zzaqt += i4 + 1;
        return i5;
    }
}
