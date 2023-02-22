package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzduq implements Cloneable {
    private Object value;
    private zzduo<?, ?> zzhrf;
    private List<Object> zzhrg = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zznx() {
        if (this.value != null) {
            throw new NoSuchMethodError();
        }
        Iterator<Object> it = this.zzhrg.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NoSuchMethodError();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzduj zzdujVar) throws IOException {
        if (this.value != null) {
            throw new NoSuchMethodError();
        }
        Iterator<Object> it = this.zzhrg.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NoSuchMethodError();
        }
    }

    public final boolean equals(Object obj) {
        List<Object> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzduq) {
            zzduq zzduqVar = (zzduq) obj;
            if (this.value != null && zzduqVar.value != null) {
                zzduo<?, ?> zzduoVar = this.zzhrf;
                if (zzduoVar != zzduqVar.zzhrf) {
                    return false;
                }
                if (!zzduoVar.zzhrd.isArray()) {
                    return this.value.equals(zzduqVar.value);
                }
                Object obj2 = this.value;
                if (obj2 instanceof byte[]) {
                    return Arrays.equals((byte[]) obj2, (byte[]) zzduqVar.value);
                }
                if (obj2 instanceof int[]) {
                    return Arrays.equals((int[]) obj2, (int[]) zzduqVar.value);
                }
                if (obj2 instanceof long[]) {
                    return Arrays.equals((long[]) obj2, (long[]) zzduqVar.value);
                }
                if (obj2 instanceof float[]) {
                    return Arrays.equals((float[]) obj2, (float[]) zzduqVar.value);
                }
                if (obj2 instanceof double[]) {
                    return Arrays.equals((double[]) obj2, (double[]) zzduqVar.value);
                }
                if (obj2 instanceof boolean[]) {
                    return Arrays.equals((boolean[]) obj2, (boolean[]) zzduqVar.value);
                }
                return Arrays.deepEquals((Object[]) obj2, (Object[]) zzduqVar.value);
            }
            List<Object> list2 = this.zzhrg;
            if (list2 != null && (list = zzduqVar.zzhrg) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(toByteArray(), zzduqVar.toByteArray());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        return false;
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(toByteArray()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    private final byte[] toByteArray() throws IOException {
        byte[] bArr = new byte[zznx()];
        zza(zzduj.zzae(bArr));
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzbcj */
    public final zzduq clone() {
        zzduq zzduqVar = new zzduq();
        try {
            zzduqVar.zzhrf = this.zzhrf;
            if (this.zzhrg == null) {
                zzduqVar.zzhrg = null;
            } else {
                zzduqVar.zzhrg.addAll(this.zzhrg);
            }
            if (this.value != null) {
                if (this.value instanceof zzdus) {
                    zzduqVar.value = (zzdus) ((zzdus) this.value).clone();
                } else if (this.value instanceof byte[]) {
                    zzduqVar.value = ((byte[]) this.value).clone();
                } else {
                    int i = 0;
                    if (this.value instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.value;
                        byte[][] bArr2 = new byte[bArr.length];
                        zzduqVar.value = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.value instanceof boolean[]) {
                        zzduqVar.value = ((boolean[]) this.value).clone();
                    } else if (this.value instanceof int[]) {
                        zzduqVar.value = ((int[]) this.value).clone();
                    } else if (this.value instanceof long[]) {
                        zzduqVar.value = ((long[]) this.value).clone();
                    } else if (this.value instanceof float[]) {
                        zzduqVar.value = ((float[]) this.value).clone();
                    } else if (this.value instanceof double[]) {
                        zzduqVar.value = ((double[]) this.value).clone();
                    } else if (this.value instanceof zzdus[]) {
                        zzdus[] zzdusVarArr = (zzdus[]) this.value;
                        zzdus[] zzdusVarArr2 = new zzdus[zzdusVarArr.length];
                        zzduqVar.value = zzdusVarArr2;
                        while (i < zzdusVarArr.length) {
                            zzdusVarArr2[i] = (zzdus) zzdusVarArr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return zzduqVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
