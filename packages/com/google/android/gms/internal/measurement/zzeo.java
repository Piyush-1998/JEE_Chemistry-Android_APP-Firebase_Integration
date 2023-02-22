package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzeq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzeo<FieldDescriptorType extends zzeq<FieldDescriptorType>> {
    private static final zzeo zzafa = new zzeo(true);
    private boolean zzaey;
    private boolean zzaez = false;
    final zzhc<FieldDescriptorType, Object> zzaex = zzhc.zzce(16);

    private zzeo() {
    }

    private zzeo(boolean z) {
        zzry();
    }

    public static <T extends zzeq<T>> zzeo<T> zztr() {
        return zzafa;
    }

    public final void zzry() {
        if (this.zzaey) {
            return;
        }
        this.zzaex.zzry();
        this.zzaey = true;
    }

    public final boolean isImmutable() {
        return this.zzaey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzeo) {
            return this.zzaex.equals(((zzeo) obj).zzaex);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzaex.hashCode();
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator() {
        if (this.zzaez) {
            return new zzfo(this.zzaex.entrySet().iterator());
        }
        return this.zzaex.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> descendingIterator() {
        if (this.zzaez) {
            return new zzfo(this.zzaex.zzwj().iterator());
        }
        return this.zzaex.zzwj().iterator();
    }

    private final Object zza(FieldDescriptorType fielddescriptortype) {
        Object obj = this.zzaex.get(fielddescriptortype);
        return obj instanceof zzfj ? zzfj.zzvc() : obj;
    }

    private final void zza(FieldDescriptorType fielddescriptortype, Object obj) {
        if (fielddescriptortype.zzty()) {
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
                zza(fielddescriptortype.zztw(), obj2);
            }
            obj = arrayList;
        } else {
            zza(fielddescriptortype.zztw(), obj);
        }
        if (obj instanceof zzfj) {
            this.zzaez = true;
        }
        this.zzaex.zza((zzhc<FieldDescriptorType, Object>) fielddescriptortype, (FieldDescriptorType) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzfc) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
        if ((r3 instanceof byte[]) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzfj) == false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zza(com.google.android.gms.internal.measurement.zzig r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.zzez.checkNotNull(r3)
            int[] r0 = com.google.android.gms.internal.measurement.zzer.zzafd
            com.google.android.gms.internal.measurement.zzij r2 = r2.zzwz()
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
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzgi
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzfj
            if (r2 == 0) goto L1e
            goto L43
        L1e:
            r0 = 0
            goto L43
        L20:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzfc
            if (r2 == 0) goto L1e
            goto L43
        L29:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzdp
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzeo.zza(com.google.android.gms.internal.measurement.zzig, java.lang.Object):void");
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zzaex.zzwh(); i++) {
            if (!zzb(this.zzaex.zzcf(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zzaex.zzwi()) {
            if (!zzb(entry)) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzb(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.zztx() == zzij.MESSAGE) {
            if (key.zzty()) {
                for (zzgi zzgiVar : (List) entry.getValue()) {
                    if (!zzgiVar.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzgi) {
                    if (!((zzgi) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof zzfj) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void zza(zzeo<FieldDescriptorType> zzeoVar) {
        for (int i = 0; i < zzeoVar.zzaex.zzwh(); i++) {
            zzc(zzeoVar.zzaex.zzcf(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : zzeoVar.zzaex.zzwi()) {
            zzc(entry);
        }
    }

    private static Object zzk(Object obj) {
        if (obj instanceof zzgn) {
            return ((zzgn) obj).zzvu();
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
        zzgi zzug;
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzfj) {
            value = zzfj.zzvc();
        }
        if (key.zzty()) {
            Object zza = zza((zzeo<FieldDescriptorType>) key);
            if (zza == null) {
                zza = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) zza).add(zzk(obj));
            }
            this.zzaex.zza((zzhc<FieldDescriptorType, Object>) key, (FieldDescriptorType) zza);
        } else if (key.zztx() == zzij.MESSAGE) {
            Object zza2 = zza((zzeo<FieldDescriptorType>) key);
            if (zza2 == null) {
                this.zzaex.zza((zzhc<FieldDescriptorType, Object>) key, (FieldDescriptorType) zzk(value));
                return;
            }
            if (zza2 instanceof zzgn) {
                zzug = key.zza((zzgn) zza2, (zzgn) value);
            } else {
                zzug = key.zza(((zzgi) zza2).zzuo(), (zzgi) value).zzug();
            }
            this.zzaex.zza((zzhc<FieldDescriptorType, Object>) key, (FieldDescriptorType) zzug);
        } else {
            this.zzaex.zza((zzhc<FieldDescriptorType, Object>) key, (FieldDescriptorType) zzk(value));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(zzee zzeeVar, zzig zzigVar, int i, Object obj) throws IOException {
        if (zzigVar == zzig.zzank) {
            zzgi zzgiVar = (zzgi) obj;
            zzez.zzf(zzgiVar);
            zzeeVar.zzb(i, 3);
            zzgiVar.zzb(zzeeVar);
            zzeeVar.zzb(i, 4);
            return;
        }
        zzeeVar.zzb(i, zzigVar.zzxa());
        switch (zzer.zzaee[zzigVar.ordinal()]) {
            case 1:
                zzeeVar.zzd(((Double) obj).doubleValue());
                return;
            case 2:
                zzeeVar.zza(((Float) obj).floatValue());
                return;
            case 3:
                zzeeVar.zzbn(((Long) obj).longValue());
                return;
            case 4:
                zzeeVar.zzbn(((Long) obj).longValue());
                return;
            case 5:
                zzeeVar.zzbe(((Integer) obj).intValue());
                return;
            case 6:
                zzeeVar.zzbp(((Long) obj).longValue());
                return;
            case 7:
                zzeeVar.zzbh(((Integer) obj).intValue());
                return;
            case 8:
                zzeeVar.zzq(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzgi) obj).zzb(zzeeVar);
                return;
            case 10:
                zzeeVar.zzb((zzgi) obj);
                return;
            case 11:
                if (obj instanceof zzdp) {
                    zzeeVar.zza((zzdp) obj);
                    return;
                } else {
                    zzeeVar.zzdr((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzdp) {
                    zzeeVar.zza((zzdp) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzeeVar.zze(bArr, 0, bArr.length);
                return;
            case 13:
                zzeeVar.zzbf(((Integer) obj).intValue());
                return;
            case 14:
                zzeeVar.zzbh(((Integer) obj).intValue());
                return;
            case 15:
                zzeeVar.zzbp(((Long) obj).longValue());
                return;
            case 16:
                zzeeVar.zzbg(((Integer) obj).intValue());
                return;
            case 17:
                zzeeVar.zzbo(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzfc) {
                    zzeeVar.zzbe(((zzfc) obj).zzlg());
                    return;
                } else {
                    zzeeVar.zzbe(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public final int zzts() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzaex.zzwh(); i2++) {
            i += zzd(this.zzaex.zzcf(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zzaex.zzwi()) {
            i += zzd(entry);
        }
        return i;
    }

    private static int zzd(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (key.zztx() == zzij.MESSAGE && !key.zzty() && !key.zztz()) {
            if (value instanceof zzfj) {
                return zzee.zzb(entry.getKey().zzlg(), (zzfj) value);
            }
            return zzee.zzd(entry.getKey().zzlg(), (zzgi) value);
        }
        return zzb((zzeq<?>) key, value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzig zzigVar, int i, Object obj) {
        int zzbi = zzee.zzbi(i);
        if (zzigVar == zzig.zzank) {
            zzez.zzf((zzgi) obj);
            zzbi <<= 1;
        }
        return zzbi + zzb(zzigVar, obj);
    }

    private static int zzb(zzig zzigVar, Object obj) {
        switch (zzer.zzaee[zzigVar.ordinal()]) {
            case 1:
                return zzee.zze(((Double) obj).doubleValue());
            case 2:
                return zzee.zzb(((Float) obj).floatValue());
            case 3:
                return zzee.zzbq(((Long) obj).longValue());
            case 4:
                return zzee.zzbr(((Long) obj).longValue());
            case 5:
                return zzee.zzbj(((Integer) obj).intValue());
            case 6:
                return zzee.zzbt(((Long) obj).longValue());
            case 7:
                return zzee.zzbm(((Integer) obj).intValue());
            case 8:
                return zzee.zzr(((Boolean) obj).booleanValue());
            case 9:
                return zzee.zzd((zzgi) obj);
            case 10:
                if (obj instanceof zzfj) {
                    return zzee.zza((zzfj) obj);
                }
                return zzee.zzc((zzgi) obj);
            case 11:
                if (obj instanceof zzdp) {
                    return zzee.zzb((zzdp) obj);
                }
                return zzee.zzds((String) obj);
            case 12:
                if (obj instanceof zzdp) {
                    return zzee.zzb((zzdp) obj);
                }
                return zzee.zzg((byte[]) obj);
            case 13:
                return zzee.zzbk(((Integer) obj).intValue());
            case 14:
                return zzee.zzbn(((Integer) obj).intValue());
            case 15:
                return zzee.zzbu(((Long) obj).longValue());
            case 16:
                return zzee.zzbl(((Integer) obj).intValue());
            case 17:
                return zzee.zzbs(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzfc) {
                    return zzee.zzbo(((zzfc) obj).zzlg());
                }
                return zzee.zzbo(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zzb(zzeq<?> zzeqVar, Object obj) {
        zzig zztw = zzeqVar.zztw();
        int zzlg = zzeqVar.zzlg();
        if (zzeqVar.zzty()) {
            int i = 0;
            if (zzeqVar.zztz()) {
                for (Object obj2 : (List) obj) {
                    i += zzb(zztw, obj2);
                }
                return zzee.zzbi(zzlg) + i + zzee.zzbq(i);
            }
            for (Object obj3 : (List) obj) {
                i += zza(zztw, zzlg, obj3);
            }
            return i;
        }
        return zza(zztw, zzlg, obj);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzeo zzeoVar = new zzeo();
        for (int i = 0; i < this.zzaex.zzwh(); i++) {
            Map.Entry<FieldDescriptorType, Object> zzcf = this.zzaex.zzcf(i);
            zzeoVar.zza((zzeo) zzcf.getKey(), zzcf.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zzaex.zzwi()) {
            zzeoVar.zza((zzeo) entry.getKey(), entry.getValue());
        }
        zzeoVar.zzaez = this.zzaez;
        return zzeoVar;
    }
}
