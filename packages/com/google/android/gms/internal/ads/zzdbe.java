package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdbe extends zzdbd<E> {
    private final transient int length;
    private final transient int offset;
    private final /* synthetic */ zzdbd zzgpc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdbe(zzdbd zzdbdVar, int i, int i2) {
        this.zzgpc = zzdbdVar;
        this.offset = i;
        this.length = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzday
    public final boolean zzaoo() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzday
    public final Object[] zzaok() {
        return this.zzgpc.zzaok();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzday
    public final int zzaol() {
        return this.zzgpc.zzaol() + this.offset;
    }

    @Override // com.google.android.gms.internal.ads.zzday
    final int zzaom() {
        return this.zzgpc.zzaol() + this.offset + this.length;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzdaq.zzr(i, this.length);
        return this.zzgpc.get(i + this.offset);
    }

    @Override // com.google.android.gms.internal.ads.zzdbd
    public final zzdbd<E> zzt(int i, int i2) {
        zzdaq.zzf(i, i2, this.length);
        zzdbd zzdbdVar = this.zzgpc;
        int i3 = this.offset;
        return (zzdbd) zzdbdVar.subList(i + i3, i2 + i3);
    }

    @Override // com.google.android.gms.internal.ads.zzdbd, java.util.List
    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
