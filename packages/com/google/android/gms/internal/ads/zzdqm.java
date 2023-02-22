package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdqm<FieldDescriptorType extends zzdqo<FieldDescriptorType>> {
    private static final zzdqm zzhhs = new zzdqm(true);
    private boolean zzhhq;
    private boolean zzhhr = false;
    final zzdta<FieldDescriptorType, Object> zzhhp = zzdta.zzgy(16);

    private zzdqm() {
    }

    private zzdqm(boolean z) {
        zzaxj();
    }

    public static <T extends zzdqo<T>> zzdqm<T> zzazc() {
        return zzhhs;
    }

    public final void zzaxj() {
        if (this.zzhhq) {
            return;
        }
        this.zzhhp.zzaxj();
        this.zzhhq = true;
    }

    public final boolean isImmutable() {
        return this.zzhhq;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzdqm) {
            return this.zzhhp.equals(((zzdqm) obj).zzhhp);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzhhp.hashCode();
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator() {
        if (this.zzhhr) {
            return new zzdrm(this.zzhhp.entrySet().iterator());
        }
        return this.zzhhp.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> descendingIterator() {
        if (this.zzhhr) {
            return new zzdrm(this.zzhhp.zzbbq().iterator());
        }
        return this.zzhhp.zzbbq().iterator();
    }

    private final Object zza(FieldDescriptorType fielddescriptortype) {
        Object obj = this.zzhhp.get(fielddescriptortype);
        return obj instanceof zzdrh ? zzdrh.zzbak() : obj;
    }

    private final void zza(FieldDescriptorType fielddescriptortype, Object obj) {
        if (fielddescriptortype.zzazj()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                zza(fielddescriptortype.zzazh(), obj2);
            }
            obj = arrayList;
        } else {
            zza(fielddescriptortype.zzazh(), obj);
        }
        if (obj instanceof zzdrh) {
            this.zzhhr = true;
        }
        this.zzhhp.zza((zzdta<FieldDescriptorType, Object>) fielddescriptortype, (FieldDescriptorType) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.zzdra) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
        if ((r3 instanceof byte[]) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.zzdrh) == false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zza(com.google.android.gms.internal.ads.zzdue r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.zzdqx.checkNotNull(r3)
            int[] r0 = com.google.android.gms.internal.ads.zzdqp.zzhhv
            com.google.android.gms.internal.ads.zzduh r2 = r2.zzbcg()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L41;
                case 2: goto L3e;
                case 3: goto L3b;
                case 4: goto L38;
                case 5: goto L35;
                case 6: goto L32;
                case 7: goto L29;
                case 8: goto L20;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L44
        L15:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzdsg
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzdrh
            if (r2 == 0) goto L1e
            goto L43
        L1e:
            r0 = 0
            goto L43
        L20:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzdra
            if (r2 == 0) goto L1e
            goto L43
        L29:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzdpm
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L1e
            goto L43
        L32:
            boolean r0 = r3 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r3 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r3 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r3 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r3 instanceof java.lang.Integer
        L43:
            r1 = r0
        L44:
            if (r1 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            goto L50
        L4f:
            throw r2
        L50:
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdqm.zza(com.google.android.gms.internal.ads.zzdue, java.lang.Object):void");
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zzhhp.zzbbo(); i++) {
            if (!zzb(this.zzhhp.zzgz(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zzhhp.zzbbp()) {
            if (!zzb(entry)) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzb(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.zzazi() == zzduh.MESSAGE) {
            if (key.zzazj()) {
                for (zzdsg zzdsgVar : (List) entry.getValue()) {
                    if (!zzdsgVar.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzdsg) {
                    if (!((zzdsg) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof zzdrh) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void zza(zzdqm<FieldDescriptorType> zzdqmVar) {
        for (int i = 0; i < zzdqmVar.zzhhp.zzbbo(); i++) {
            zzc(zzdqmVar.zzhhp.zzgz(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : zzdqmVar.zzhhp.zzbbp()) {
            zzc(entry);
        }
    }

    private static Object zzal(Object obj) {
        if (obj instanceof zzdsl) {
            return ((zzdsl) obj).zzbbb();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    private final void zzc(Map.Entry<FieldDescriptorType, Object> entry) {
        zzdsg zzazr;
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzdrh) {
            value = zzdrh.zzbak();
        }
        if (key.zzazj()) {
            Object zza = zza((zzdqm<FieldDescriptorType>) key);
            if (zza == null) {
                zza = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) zza).add(zzal(obj));
            }
            this.zzhhp.zza((zzdta<FieldDescriptorType, Object>) key, (FieldDescriptorType) zza);
        } else if (key.zzazi() == zzduh.MESSAGE) {
            Object zza2 = zza((zzdqm<FieldDescriptorType>) key);
            if (zza2 == null) {
                this.zzhhp.zza((zzdta<FieldDescriptorType, Object>) key, (FieldDescriptorType) zzal(value));
                return;
            }
            if (zza2 instanceof zzdsl) {
                zzazr = key.zza((zzdsl) zza2, (zzdsl) value);
            } else {
                zzazr = key.zza(((zzdsg) zza2).zzazx(), (zzdsg) value).zzazr();
            }
            this.zzhhp.zza((zzdta<FieldDescriptorType, Object>) key, (FieldDescriptorType) zzazr);
        } else {
            this.zzhhp.zza((zzdta<FieldDescriptorType, Object>) key, (FieldDescriptorType) zzal(value));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(zzdqf zzdqfVar, zzdue zzdueVar, int i, Object obj) throws IOException {
        if (zzdueVar == zzdue.zzhqa) {
            zzdsg zzdsgVar = (zzdsg) obj;
            zzdqx.zzn(zzdsgVar);
            zzdqfVar.zzz(i, 3);
            zzdsgVar.zzb(zzdqfVar);
            zzdqfVar.zzz(i, 4);
            return;
        }
        zzdqfVar.zzz(i, zzdueVar.zzbch());
        switch (zzdqp.zzhgt[zzdueVar.ordinal()]) {
            case 1:
                zzdqfVar.zzb(((Double) obj).doubleValue());
                return;
            case 2:
                zzdqfVar.zzf(((Float) obj).floatValue());
                return;
            case 3:
                zzdqfVar.zzfa(((Long) obj).longValue());
                return;
            case 4:
                zzdqfVar.zzfa(((Long) obj).longValue());
                return;
            case 5:
                zzdqfVar.zzfz(((Integer) obj).intValue());
                return;
            case 6:
                zzdqfVar.zzfc(((Long) obj).longValue());
                return;
            case 7:
                zzdqfVar.zzgc(((Integer) obj).intValue());
                return;
            case 8:
                zzdqfVar.zzbh(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzdsg) obj).zzb(zzdqfVar);
                return;
            case 10:
                zzdqfVar.zzj((zzdsg) obj);
                return;
            case 11:
                if (obj instanceof zzdpm) {
                    zzdqfVar.zzcz((zzdpm) obj);
                    return;
                } else {
                    zzdqfVar.zzhi((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzdpm) {
                    zzdqfVar.zzcz((zzdpm) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzdqfVar.zzk(bArr, 0, bArr.length);
                return;
            case 13:
                zzdqfVar.zzga(((Integer) obj).intValue());
                return;
            case 14:
                zzdqfVar.zzgc(((Integer) obj).intValue());
                return;
            case 15:
                zzdqfVar.zzfc(((Long) obj).longValue());
                return;
            case 16:
                zzdqfVar.zzgb(((Integer) obj).intValue());
                return;
            case 17:
                zzdqfVar.zzfb(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzdra) {
                    zzdqfVar.zzfz(((zzdra) obj).zzab());
                    return;
                } else {
                    zzdqfVar.zzfz(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public final int zzazd() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzhhp.zzbbo(); i2++) {
            i += zzd(this.zzhhp.zzgz(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zzhhp.zzbbp()) {
            i += zzd(entry);
        }
        return i;
    }

    private static int zzd(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzazi() == zzduh.MESSAGE && !key.zzazj() && !key.zzazk()) {
            if (value instanceof zzdrh) {
                return zzdqf.zzb(entry.getKey().zzab(), (zzdrh) value);
            }
            return zzdqf.zzd(entry.getKey().zzab(), (zzdsg) value);
        }
        return zzb((zzdqo<?>) key, value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzdue zzdueVar, int i, Object obj) {
        int zzgd = zzdqf.zzgd(i);
        if (zzdueVar == zzdue.zzhqa) {
            zzdqx.zzn((zzdsg) obj);
            zzgd <<= 1;
        }
        return zzgd + zzb(zzdueVar, obj);
    }

    private static int zzb(zzdue zzdueVar, Object obj) {
        switch (zzdqp.zzhgt[zzdueVar.ordinal()]) {
            case 1:
                return zzdqf.zzc(((Double) obj).doubleValue());
            case 2:
                return zzdqf.zzg(((Float) obj).floatValue());
            case 3:
                return zzdqf.zzfd(((Long) obj).longValue());
            case 4:
                return zzdqf.zzfe(((Long) obj).longValue());
            case 5:
                return zzdqf.zzge(((Integer) obj).intValue());
            case 6:
                return zzdqf.zzfg(((Long) obj).longValue());
            case 7:
                return zzdqf.zzgh(((Integer) obj).intValue());
            case 8:
                return zzdqf.zzbi(((Boolean) obj).booleanValue());
            case 9:
                return zzdqf.zzl((zzdsg) obj);
            case 10:
                if (obj instanceof zzdrh) {
                    return zzdqf.zza((zzdrh) obj);
                }
                return zzdqf.zzk((zzdsg) obj);
            case 11:
                if (obj instanceof zzdpm) {
                    return zzdqf.zzda((zzdpm) obj);
                }
                return zzdqf.zzhj((String) obj);
            case 12:
                if (obj instanceof zzdpm) {
                    return zzdqf.zzda((zzdpm) obj);
                }
                return zzdqf.zzab((byte[]) obj);
            case 13:
                return zzdqf.zzgf(((Integer) obj).intValue());
            case 14:
                return zzdqf.zzgi(((Integer) obj).intValue());
            case 15:
                return zzdqf.zzfh(((Long) obj).longValue());
            case 16:
                return zzdqf.zzgg(((Integer) obj).intValue());
            case 17:
                return zzdqf.zzff(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzdra) {
                    return zzdqf.zzgj(((zzdra) obj).zzab());
                }
                return zzdqf.zzgj(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zzb(zzdqo<?> zzdqoVar, Object obj) {
        zzdue zzazh = zzdqoVar.zzazh();
        int zzab = zzdqoVar.zzab();
        if (zzdqoVar.zzazj()) {
            int i = 0;
            if (zzdqoVar.zzazk()) {
                for (Object obj2 : (List) obj) {
                    i += zzb(zzazh, obj2);
                }
                return zzdqf.zzgd(zzab) + i + zzdqf.zzgl(i);
            }
            for (Object obj3 : (List) obj) {
                i += zza(zzazh, zzab, obj3);
            }
            return i;
        }
        return zza(zzazh, zzab, obj);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzdqm zzdqmVar = new zzdqm();
        for (int i = 0; i < this.zzhhp.zzbbo(); i++) {
            Map.Entry<FieldDescriptorType, Object> zzgz = this.zzhhp.zzgz(i);
            zzdqmVar.zza((zzdqm) zzgz.getKey(), zzgz.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zzhhp.zzbbp()) {
            zzdqmVar.zza((zzdqm) entry.getKey(), entry.getValue());
        }
        zzdqmVar.zzhhr = this.zzhhr;
        return zzdqmVar;
    }
}
