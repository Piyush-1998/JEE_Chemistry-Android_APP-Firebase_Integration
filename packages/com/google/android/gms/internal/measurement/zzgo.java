package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzgo<T> implements zzgx<T> {
    private final zzgi zzakn;
    private final boolean zzako;
    private final zzhp<?, ?> zzakx;
    private final zzen<?> zzaky;

    private zzgo(zzhp<?, ?> zzhpVar, zzen<?> zzenVar, zzgi zzgiVar) {
        this.zzakx = zzhpVar;
        this.zzako = zzenVar.zze(zzgiVar);
        this.zzaky = zzenVar;
        this.zzakn = zzgiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzgo<T> zza(zzhp<?, ?> zzhpVar, zzen<?> zzenVar, zzgi zzgiVar) {
        return new zzgo<>(zzhpVar, zzenVar, zzgiVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final T newInstance() {
        return (T) this.zzakn.zzup().zzuf();
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final boolean equals(T t, T t2) {
        if (this.zzakx.zzx(t).equals(this.zzakx.zzx(t2))) {
            if (this.zzako) {
                return this.zzaky.zzh(t).equals(this.zzaky.zzh(t2));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final int hashCode(T t) {
        int hashCode = this.zzakx.zzx(t).hashCode();
        return this.zzako ? (hashCode * 53) + this.zzaky.zzh(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final void zzc(T t, T t2) {
        zzgz.zza(this.zzakx, t, t2);
        if (this.zzako) {
            zzgz.zza(this.zzaky, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final void zza(T t, zzim zzimVar) throws IOException {
        Iterator<Map.Entry<?, Object>> it = this.zzaky.zzh(t).iterator();
        while (it.hasNext()) {
            Map.Entry<?, Object> next = it.next();
            zzeq zzeqVar = (zzeq) next.getKey();
            if (zzeqVar.zztx() != zzij.MESSAGE || zzeqVar.zzty() || zzeqVar.zztz()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof zzfl) {
                zzimVar.zza(zzeqVar.zzlg(), (Object) ((zzfl) next).zzve().zzrs());
            } else {
                zzimVar.zza(zzeqVar.zzlg(), next.getValue());
            }
        }
        zzhp<?, ?> zzhpVar = this.zzakx;
        zzhpVar.zzc(zzhpVar.zzx(t), zzimVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099 A[EDGE_INSN: B:58:0x0099->B:34:0x0099 ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzgx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.measurement.zzdk r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.measurement.zzey r0 = (com.google.android.gms.internal.measurement.zzey) r0
            com.google.android.gms.internal.measurement.zzhs r1 = r0.zzahz
            com.google.android.gms.internal.measurement.zzhs r2 = com.google.android.gms.internal.measurement.zzhs.zzwq()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.measurement.zzhs r1 = com.google.android.gms.internal.measurement.zzhs.zzwr()
            r0.zzahz = r1
        L11:
            com.google.android.gms.internal.measurement.zzey$zzb r10 = (com.google.android.gms.internal.measurement.zzey.zzb) r10
            r10.zzuq()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.measurement.zzdl.zza(r11, r12, r14)
            int r2 = r14.zzada
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            com.google.android.gms.internal.measurement.zzen<?> r12 = r9.zzaky
            com.google.android.gms.internal.measurement.zzel r0 = r14.zzadd
            com.google.android.gms.internal.measurement.zzgi r3 = r9.zzakn
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.measurement.zzey$zze r0 = (com.google.android.gms.internal.measurement.zzey.zze) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.measurement.zzdl.zza(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            com.google.android.gms.internal.measurement.zzgt.zzvy()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.measurement.zzdl.zza(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.measurement.zzdl.zza(r11, r4, r14)
            int r5 = r14.zzada
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.measurement.zzdl.zze(r11, r4, r14)
            java.lang.Object r2 = r14.zzadc
            com.google.android.gms.internal.measurement.zzdp r2 = (com.google.android.gms.internal.measurement.zzdp) r2
            goto L53
        L72:
            com.google.android.gms.internal.measurement.zzgt.zzvy()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.measurement.zzdl.zza(r11, r4, r14)
            int r12 = r14.zzada
            com.google.android.gms.internal.measurement.zzen<?> r0 = r9.zzaky
            com.google.android.gms.internal.measurement.zzel r5 = r14.zzadd
            com.google.android.gms.internal.measurement.zzgi r6 = r9.zzakn
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.measurement.zzey$zze r0 = (com.google.android.gms.internal.measurement.zzey.zze) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.measurement.zzdl.zza(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zzb(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.measurement.zzfi r10 = com.google.android.gms.internal.measurement.zzfi.zzva()
            goto Lad
        Lac:
            throw r10
        Lad:
            goto Lac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgo.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzdk):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final void zza(T t, zzgy zzgyVar, zzel zzelVar) throws IOException {
        boolean z;
        zzhp<?, ?> zzhpVar = this.zzakx;
        zzen<?> zzenVar = this.zzaky;
        Object zzy = zzhpVar.zzy(t);
        zzeo<?> zzi = zzenVar.zzi(t);
        do {
            try {
                if (zzgyVar.zzsy() == Integer.MAX_VALUE) {
                    return;
                }
                int tag = zzgyVar.getTag();
                if (tag == 11) {
                    int i = 0;
                    Object obj = null;
                    zzdp zzdpVar = null;
                    while (zzgyVar.zzsy() != Integer.MAX_VALUE) {
                        int tag2 = zzgyVar.getTag();
                        if (tag2 == 16) {
                            i = zzgyVar.zzsp();
                            obj = zzenVar.zza(zzelVar, this.zzakn, i);
                        } else if (tag2 == 26) {
                            if (obj != null) {
                                zzenVar.zza(zzgyVar, obj, zzelVar, zzi);
                            } else {
                                zzdpVar = zzgyVar.zzso();
                            }
                        } else if (!zzgyVar.zzsz()) {
                            break;
                        }
                    }
                    if (zzgyVar.getTag() != 12) {
                        throw zzfi.zzux();
                    } else if (zzdpVar != null) {
                        if (obj != null) {
                            zzenVar.zza(zzdpVar, obj, zzelVar, zzi);
                        } else {
                            zzhpVar.zza((zzhp<?, ?>) zzy, i, zzdpVar);
                        }
                    }
                } else if ((tag & 7) == 2) {
                    Object zza = zzenVar.zza(zzelVar, this.zzakn, tag >>> 3);
                    if (zza != null) {
                        zzenVar.zza(zzgyVar, zza, zzelVar, zzi);
                    } else {
                        z = zzhpVar.zza((zzhp<?, ?>) zzy, zzgyVar);
                        continue;
                    }
                } else {
                    z = zzgyVar.zzsz();
                    continue;
                }
                z = true;
                continue;
            } finally {
                zzhpVar.zzf(t, zzy);
            }
        } while (z);
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final void zzj(T t) {
        this.zzakx.zzj(t);
        this.zzaky.zzj(t);
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final boolean zzv(T t) {
        return this.zzaky.zzh(t).isInitialized();
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final int zzt(T t) {
        zzhp<?, ?> zzhpVar = this.zzakx;
        int zzz = zzhpVar.zzz(zzhpVar.zzx(t)) + 0;
        return this.zzako ? zzz + this.zzaky.zzh(t).zzts() : zzz;
    }
}
