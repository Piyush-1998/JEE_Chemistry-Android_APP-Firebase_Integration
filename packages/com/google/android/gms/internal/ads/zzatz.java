package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzatz implements zzqa {
    private final zzaui zzdrp;
    private final zzaty zzdrt;
    private final Object lock = new Object();
    private final HashSet<zzatq> zzdru = new HashSet<>();
    private final HashSet<Object> zzdrv = new HashSet<>();
    private final zzaua zzdrs = new zzaua();

    public zzatz(String str, zzaui zzauiVar) {
        this.zzdrt = new zzaty(str, zzauiVar);
        this.zzdrp = zzauiVar;
    }

    public final void zzb(zzatq zzatqVar) {
        synchronized (this.lock) {
            this.zzdru.add(zzatqVar);
        }
    }

    public final void zzb(HashSet<zzatq> hashSet) {
        synchronized (this.lock) {
            this.zzdru.addAll(hashSet);
        }
    }

    public final Bundle zza(Context context, zzatx zzatxVar) {
        HashSet<zzatq> hashSet = new HashSet<>();
        synchronized (this.lock) {
            hashSet.addAll(this.zzdru);
            this.zzdru.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.zzdrt.zzo(context, this.zzdrs.zzus()));
        Bundle bundle2 = new Bundle();
        Iterator<Object> it = this.zzdrv.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NoSuchMethodError();
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator<zzatq> it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().toBundle());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        zzatxVar.zza(hashSet);
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzo(boolean z) {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzq.zzkq().currentTimeMillis();
        if (z) {
            if (currentTimeMillis - this.zzdrp.zzvf() > ((Long) zzuv.zzon().zzd(zzza.zzcko)).longValue()) {
                this.zzdrt.zzdrm = -1;
                return;
            }
            this.zzdrt.zzdrm = this.zzdrp.zzvg();
            return;
        }
        this.zzdrp.zzet(currentTimeMillis);
        this.zzdrp.zzcn(this.zzdrt.zzdrm);
    }

    public final void zzty() {
        synchronized (this.lock) {
            this.zzdrt.zzty();
        }
    }

    public final void zztx() {
        synchronized (this.lock) {
            this.zzdrt.zztx();
        }
    }

    public final void zza(zztx zztxVar, long j) {
        synchronized (this.lock) {
            this.zzdrt.zza(zztxVar, j);
        }
    }

    public final zzatq zza(Clock clock, String str) {
        return new zzatq(clock, this, this.zzdrs.zzur(), str);
    }
}
