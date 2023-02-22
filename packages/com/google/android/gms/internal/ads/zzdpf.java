package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdpe;
import com.google.android.gms.internal.ads.zzdpf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzdpf<MessageType extends zzdpf<MessageType, BuilderType>, BuilderType extends zzdpe<MessageType, BuilderType>> implements zzdsg {
    protected int zzhfq = 0;

    @Override // com.google.android.gms.internal.ads.zzdsg
    public final zzdpm zzaxg() {
        try {
            zzdpu zzfo = zzdpm.zzfo(zzazu());
            zzb(zzfo.zzaxt());
            return zzfo.zzaxs();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsg
    public final byte[] toByteArray() {
        try {
            byte[] bArr = new byte[zzazu()];
            zzdqf zzaa = zzdqf.zzaa(bArr);
            zzb(zzaa);
            zzaa.zzayv();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zzaxh() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzfi(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzdqx.checkNotNull(iterable);
        if (iterable instanceof zzdrn) {
            List<?> zzban = ((zzdrn) iterable).zzban();
            zzdrn zzdrnVar = (zzdrn) list;
            int size = list.size();
            for (Object obj : zzban) {
                if (obj == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(zzdrnVar.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = zzdrnVar.size() - 1; size2 >= size; size2--) {
                        zzdrnVar.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (obj instanceof zzdpm) {
                    zzdrnVar.zzdb((zzdpm) obj);
                } else {
                    zzdrnVar.add((String) obj);
                }
            }
        } else if (iterable instanceof zzdss) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T t : iterable) {
                if (t == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(list.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(t);
            }
        }
    }
}
