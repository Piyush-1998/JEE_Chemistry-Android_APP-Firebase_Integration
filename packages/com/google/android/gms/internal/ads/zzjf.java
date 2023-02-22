package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Stack;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzjf implements zzjk {
    private final byte[] zzana = new byte[8];
    private final Stack<zzjh> zzanb = new Stack<>();
    private final zzjp zzanc = new zzjp();
    private zzjj zzand;
    private int zzane;
    private int zzanf;
    private long zzang;

    @Override // com.google.android.gms.internal.ads.zzjk
    public final void zza(zzjj zzjjVar) {
        this.zzand = zzjjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjk
    public final void reset() {
        this.zzane = 0;
        this.zzanb.clear();
        this.zzanc.reset();
    }

    @Override // com.google.android.gms.internal.ads.zzjk
    public final boolean zzb(zziv zzivVar) throws IOException, InterruptedException {
        String str;
        double longBitsToDouble;
        int zzaj;
        int zza;
        long j;
        int i;
        zznr.checkState(this.zzand != null);
        while (true) {
            if (!this.zzanb.isEmpty()) {
                long position = zzivVar.getPosition();
                j = this.zzanb.peek().zzanj;
                if (position >= j) {
                    zzjj zzjjVar = this.zzand;
                    i = this.zzanb.pop().zzanf;
                    zzjjVar.zzai(i);
                    return true;
                }
            }
            if (this.zzane == 0) {
                long zza2 = this.zzanc.zza(zzivVar, true, false, 4);
                if (zza2 == -2) {
                    zzivVar.zzgb();
                    while (true) {
                        zzivVar.zza(this.zzana, 0, 4);
                        zzaj = zzjp.zzaj(this.zzana[0]);
                        if (zzaj != -1 && zzaj <= 4) {
                            zza = (int) zzjp.zza(this.zzana, zzaj, false);
                            if (this.zzand.zzah(zza)) {
                                break;
                            }
                        }
                        zzivVar.zzab(1);
                    }
                    zzivVar.zzab(zzaj);
                    zza2 = zza;
                }
                if (zza2 == -1) {
                    return false;
                }
                this.zzanf = (int) zza2;
                this.zzane = 1;
            }
            if (this.zzane == 1) {
                this.zzang = this.zzanc.zza(zzivVar, false, true, 8);
                this.zzane = 2;
            }
            int zzag = this.zzand.zzag(this.zzanf);
            if (zzag != 0) {
                if (zzag == 1) {
                    long position2 = zzivVar.getPosition();
                    this.zzanb.add(new zzjh(this.zzanf, this.zzang + position2));
                    this.zzand.zzd(this.zzanf, position2, this.zzang);
                    this.zzane = 0;
                    return true;
                } else if (zzag == 2) {
                    long j2 = this.zzang;
                    if (j2 > 8) {
                        long j3 = this.zzang;
                        StringBuilder sb = new StringBuilder(42);
                        sb.append("Invalid integer size: ");
                        sb.append(j3);
                        throw new zzgv(sb.toString());
                    }
                    this.zzand.zzc(this.zzanf, zza(zzivVar, (int) j2));
                    this.zzane = 0;
                    return true;
                } else if (zzag == 3) {
                    long j4 = this.zzang;
                    if (j4 > 2147483647L) {
                        long j5 = this.zzang;
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("String element size: ");
                        sb2.append(j5);
                        throw new zzgv(sb2.toString());
                    }
                    zzjj zzjjVar2 = this.zzand;
                    int i2 = this.zzanf;
                    int i3 = (int) j4;
                    if (i3 == 0) {
                        str = "";
                    } else {
                        byte[] bArr = new byte[i3];
                        zzivVar.readFully(bArr, 0, i3);
                        str = new String(bArr);
                    }
                    zzjjVar2.zza(i2, str);
                    this.zzane = 0;
                    return true;
                } else if (zzag == 4) {
                    this.zzand.zza(this.zzanf, (int) this.zzang, zzivVar);
                    this.zzane = 0;
                    return true;
                } else if (zzag == 5) {
                    long j6 = this.zzang;
                    if (j6 != 4 && j6 != 8) {
                        long j7 = this.zzang;
                        StringBuilder sb3 = new StringBuilder(40);
                        sb3.append("Invalid float size: ");
                        sb3.append(j7);
                        throw new zzgv(sb3.toString());
                    }
                    zzjj zzjjVar3 = this.zzand;
                    int i4 = this.zzanf;
                    int i5 = (int) this.zzang;
                    long zza3 = zza(zzivVar, i5);
                    if (i5 == 4) {
                        longBitsToDouble = Float.intBitsToFloat((int) zza3);
                    } else {
                        longBitsToDouble = Double.longBitsToDouble(zza3);
                    }
                    zzjjVar3.zza(i4, longBitsToDouble);
                    this.zzane = 0;
                    return true;
                } else {
                    StringBuilder sb4 = new StringBuilder(32);
                    sb4.append("Invalid element type ");
                    sb4.append(zzag);
                    throw new zzgv(sb4.toString());
                }
            }
            zzivVar.zzab((int) this.zzang);
            this.zzane = 0;
        }
    }

    private final long zza(zziv zzivVar, int i) throws IOException, InterruptedException {
        zzivVar.readFully(this.zzana, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.zzana[i2] & 255);
        }
        return j;
    }
}
