package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
final class zzdsm<T> implements zzdsv<T> {
    private final zzdsg zzhne;
    private final boolean zzhnf;
    private final zzdtn<?, ?> zzhno;
    private final zzdql<?> zzhnp;

    private zzdsm(zzdtn<?, ?> zzdtnVar, zzdql<?> zzdqlVar, zzdsg zzdsgVar) {
        this.zzhno = zzdtnVar;
        this.zzhnf = zzdqlVar.zzm(zzdsgVar);
        this.zzhnp = zzdqlVar;
        this.zzhne = zzdsgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzdsm<T> zza(zzdtn<?, ?> zzdtnVar, zzdql<?> zzdqlVar, zzdsg zzdsgVar) {
        return new zzdsm<>(zzdtnVar, zzdqlVar, zzdsgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdsv
    public final T newInstance() {
        return (T) this.zzhne.zzazy().zzazq();
    }

    @Override // com.google.android.gms.internal.ads.zzdsv
    public final boolean equals(T t, T t2) {
        if (this.zzhno.zzay(t).equals(this.zzhno.zzay(t2))) {
            if (this.zzhnf) {
                return this.zzhnp.zzai(t).equals(this.zzhnp.zzai(t2));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdsv
    public final int hashCode(T t) {
        int hashCode = this.zzhno.zzay(t).hashCode();
        return this.zzhnf ? (hashCode * 53) + this.zzhnp.zzai(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzdsv
    public final void zzf(T t, T t2) {
        zzdsx.zza(this.zzhno, t, t2);
        if (this.zzhnf) {
            zzdsx.zza(this.zzhnp, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsv
    public final void zza(T t, zzduk zzdukVar) throws IOException {
        Iterator<Map.Entry<?, Object>> it = this.zzhnp.zzai(t).iterator();
        while (it.hasNext()) {
            Map.Entry<?, Object> next = it.next();
            zzdqo zzdqoVar = (zzdqo) next.getKey();
            if (zzdqoVar.zzazi() != zzduh.MESSAGE || zzdqoVar.zzazj() || zzdqoVar.zzazk()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof zzdrj) {
                zzdukVar.zzb(zzdqoVar.zzab(), ((zzdrj) next).zzbam().zzaxg());
            } else {
                zzdukVar.zzb(zzdqoVar.zzab(), next.getValue());
            }
        }
        zzdtn<?, ?> zzdtnVar = this.zzhno;
        zzdtnVar.zzc(zzdtnVar.zzay(t), zzdukVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099 A[EDGE_INSN: B:58:0x0099->B:34:0x0099 ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzdsv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.ads.zzdpl r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.ads.zzdqw r0 = (com.google.android.gms.internal.ads.zzdqw) r0
            com.google.android.gms.internal.ads.zzdtq r1 = r0.zzhkr
            com.google.android.gms.internal.ads.zzdtq r2 = com.google.android.gms.internal.ads.zzdtq.zzbbx()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.ads.zzdtq r1 = com.google.android.gms.internal.ads.zzdtq.zzbby()
            r0.zzhkr = r1
        L11:
            com.google.android.gms.internal.ads.zzdqw$zzb r10 = (com.google.android.gms.internal.ads.zzdqw.zzb) r10
            r10.zzazz()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.ads.zzdpi.zza(r11, r12, r14)
            int r2 = r14.zzhfx
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            com.google.android.gms.internal.ads.zzdql<?> r12 = r9.zzhnp
            com.google.android.gms.internal.ads.zzdqj r0 = r14.zzhga
            com.google.android.gms.internal.ads.zzdsg r3 = r9.zzhne
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.ads.zzdqw$zze r0 = (com.google.android.gms.internal.ads.zzdqw.zze) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.ads.zzdpi.zza(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            com.google.android.gms.internal.ads.zzdsr.zzbbf()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.ads.zzdpi.zza(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.ads.zzdpi.zza(r11, r4, r14)
            int r5 = r14.zzhfx
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.ads.zzdpi.zze(r11, r4, r14)
            java.lang.Object r2 = r14.zzhfz
            com.google.android.gms.internal.ads.zzdpm r2 = (com.google.android.gms.internal.ads.zzdpm) r2
            goto L53
        L72:
            com.google.android.gms.internal.ads.zzdsr.zzbbf()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.ads.zzdpi.zza(r11, r4, r14)
            int r12 = r14.zzhfx
            com.google.android.gms.internal.ads.zzdql<?> r0 = r9.zzhnp
            com.google.android.gms.internal.ads.zzdqj r5 = r14.zzhga
            com.google.android.gms.internal.ads.zzdsg r6 = r9.zzhne
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.ads.zzdqw$zze r0 = (com.google.android.gms.internal.ads.zzdqw.zze) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.ads.zzdpi.zza(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zzc(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.ads.zzdrg r10 = com.google.android.gms.internal.ads.zzdrg.zzbai()
            goto Lad
        Lac:
            throw r10
        Lad:
            goto Lac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdsm.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.zzdpl):void");
    }

    @Override // com.google.android.gms.internal.ads.zzdsv
    public final void zza(T t, zzdsw zzdswVar, zzdqj zzdqjVar) throws IOException {
        boolean z;
        zzdtn<?, ?> zzdtnVar = this.zzhno;
        zzdql<?> zzdqlVar = this.zzhnp;
        Object zzaz = zzdtnVar.zzaz(t);
        zzdqm<?> zzaj = zzdqlVar.zzaj(t);
        do {
            try {
                if (zzdswVar.zzays() == Integer.MAX_VALUE) {
                    return;
                }
                int tag = zzdswVar.getTag();
                if (tag == 11) {
                    int i = 0;
                    Object obj = null;
                    zzdpm zzdpmVar = null;
                    while (zzdswVar.zzays() != Integer.MAX_VALUE) {
                        int tag2 = zzdswVar.getTag();
                        if (tag2 == 16) {
                            i = zzdswVar.zzayd();
                            obj = zzdqlVar.zza(zzdqjVar, this.zzhne, i);
                        } else if (tag2 == 26) {
                            if (obj != null) {
                                zzdqlVar.zza(zzdswVar, obj, zzdqjVar, zzaj);
                            } else {
                                zzdpmVar = zzdswVar.zzayc();
                            }
                        } else if (!zzdswVar.zzayt()) {
                            break;
                        }
                    }
                    if (zzdswVar.getTag() != 12) {
                        throw zzdrg.zzbag();
                    } else if (zzdpmVar != null) {
                        if (obj != null) {
                            zzdqlVar.zza(zzdpmVar, obj, zzdqjVar, zzaj);
                        } else {
                            zzdtnVar.zza((zzdtn<?, ?>) zzaz, i, zzdpmVar);
                        }
                    }
                } else if ((tag & 7) == 2) {
                    Object zza = zzdqlVar.zza(zzdqjVar, this.zzhne, tag >>> 3);
                    if (zza != null) {
                        zzdqlVar.zza(zzdswVar, zza, zzdqjVar, zzaj);
                    } else {
                        z = zzdtnVar.zza((zzdtn<?, ?>) zzaz, zzdswVar);
                        continue;
                    }
                } else {
                    z = zzdswVar.zzayt();
                    continue;
                }
                z = true;
                continue;
            } finally {
                zzdtnVar.zzi(t, zzaz);
            }
        } while (z);
    }

    @Override // com.google.android.gms.internal.ads.zzdsv
    public final void zzak(T t) {
        this.zzhno.zzak(t);
        this.zzhnp.zzak(t);
    }

    @Override // com.google.android.gms.internal.ads.zzdsv
    public final boolean zzaw(T t) {
        return this.zzhnp.zzai(t).isInitialized();
    }

    @Override // com.google.android.gms.internal.ads.zzdsv
    public final int zzau(T t) {
        zzdtn<?, ?> zzdtnVar = this.zzhno;
        int zzba = zzdtnVar.zzba(zzdtnVar.zzay(t)) + 0;
        return this.zzhnf ? zzba + this.zzhnp.zzai(t).zzazd() : zzba;
    }
}
