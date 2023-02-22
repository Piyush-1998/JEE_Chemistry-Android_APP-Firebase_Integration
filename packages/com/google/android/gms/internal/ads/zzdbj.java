package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdbj<E> extends zzdbb<E> {
    private int zzafv;
    @NullableDecl
    private Object[] zzgpl;

    public zzdbj() {
        super(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdbj(int i) {
        super(i);
        this.zzgpl = new Object[zzdbg.zzdr(i)];
    }

    public final zzdbg<E> zzaov() {
        zzdbg<E> zza;
        boolean zzu;
        int i = this.size;
        if (i != 0) {
            if (i == 1) {
                return zzdbg.zzae(this.zzgoz[0]);
            }
            if (this.zzgpl != null && zzdbg.zzdr(this.size) == this.zzgpl.length) {
                zzu = zzdbg.zzu(this.size, this.zzgoz.length);
                Object[] copyOf = zzu ? Arrays.copyOf(this.zzgoz, this.size) : this.zzgoz;
                int i2 = this.zzafv;
                Object[] objArr = this.zzgpl;
                zza = new zzdbt<>(copyOf, i2, objArr, objArr.length - 1, this.size);
            } else {
                zza = zzdbg.zza(this.size, this.zzgoz);
                this.size = zza.size();
            }
            this.zzgpa = true;
            this.zzgpl = null;
            return zza;
        }
        return zzdbt.zzgpu;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdbb, com.google.android.gms.internal.ads.zzdba
    public final /* synthetic */ zzdba zze(Iterable iterable) {
        zzdaq.checkNotNull(iterable);
        if (this.zzgpl != null) {
            for (Object obj : iterable) {
                zzab(obj);
            }
        } else {
            super.zze(iterable);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdbb
    public final /* synthetic */ zzdbb zzac(Object obj) {
        return (zzdbj) zzab(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdba
    public final /* synthetic */ zzdba zza(Iterator it) {
        zzdaq.checkNotNull(it);
        while (it.hasNext()) {
            zzab(it.next());
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdbb, com.google.android.gms.internal.ads.zzdba
    public final /* synthetic */ zzdba zzab(Object obj) {
        zzdaq.checkNotNull(obj);
        if (this.zzgpl != null) {
            int zzdr = zzdbg.zzdr(this.size);
            Object[] objArr = this.zzgpl;
            if (zzdr <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int zzdp = zzdaz.zzdp(hashCode);
                while (true) {
                    int i = zzdp & length;
                    Object[] objArr2 = this.zzgpl;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.zzafv += hashCode;
                        super.zzab(obj);
                        break;
                    } else if (obj2.equals(obj)) {
                        break;
                    } else {
                        zzdp = i + 1;
                    }
                }
                return this;
            }
        }
        this.zzgpl = null;
        super.zzab(obj);
        return this;
    }
}
