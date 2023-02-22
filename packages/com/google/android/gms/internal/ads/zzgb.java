package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzgb implements zzgw, zzgx {
    private int index;
    private int state;
    private final int zzace;
    private zzgz zzacf;
    private zzmd zzacg;
    private long zzach;
    private boolean zzaci = true;
    private boolean zzacj;

    public zzgb(int i) {
        this.zzace = i;
    }

    protected void onStarted() throws zzgd {
    }

    protected void onStopped() throws zzgd {
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public void zza(int i, Object obj) throws zzgd {
    }

    protected void zza(long j, boolean z) throws zzgd {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zza(zzgo[] zzgoVarArr, long j) throws zzgd {
    }

    protected void zzd(boolean z) throws zzgd {
    }

    @Override // com.google.android.gms.internal.ads.zzgx
    public final zzgw zzdj() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgx
    public zznv zzdk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public int zzdq() throws zzgd {
        return 0;
    }

    protected void zzdr() {
    }

    @Override // com.google.android.gms.internal.ads.zzgw, com.google.android.gms.internal.ads.zzgx
    public final int getTrackType() {
        return this.zzace;
    }

    @Override // com.google.android.gms.internal.ads.zzgx
    public final void setIndex(int i) {
        this.index = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgx
    public final int getState() {
        return this.state;
    }

    @Override // com.google.android.gms.internal.ads.zzgx
    public final void zza(zzgz zzgzVar, zzgo[] zzgoVarArr, zzmd zzmdVar, long j, boolean z, long j2) throws zzgd {
        zznr.checkState(this.state == 0);
        this.zzacf = zzgzVar;
        this.state = 1;
        zzd(z);
        zza(zzgoVarArr, zzmdVar, j2);
        zza(j, z);
    }

    @Override // com.google.android.gms.internal.ads.zzgx
    public final void start() throws zzgd {
        zznr.checkState(this.state == 1);
        this.state = 2;
        onStarted();
    }

    @Override // com.google.android.gms.internal.ads.zzgx
    public final void zza(zzgo[] zzgoVarArr, zzmd zzmdVar, long j) throws zzgd {
        zznr.checkState(!this.zzacj);
        this.zzacg = zzmdVar;
        this.zzaci = false;
        this.zzach = j;
        zza(zzgoVarArr, j);
    }

    @Override // com.google.android.gms.internal.ads.zzgx
    public final zzmd zzdl() {
        return this.zzacg;
    }

    @Override // com.google.android.gms.internal.ads.zzgx
    public final boolean zzdm() {
        return this.zzaci;
    }

    @Override // com.google.android.gms.internal.ads.zzgx
    public final void zzdn() {
        this.zzacj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzgx
    public final boolean zzdo() {
        return this.zzacj;
    }

    @Override // com.google.android.gms.internal.ads.zzgx
    public final void zzdp() throws IOException {
        this.zzacg.zzhe();
    }

    @Override // com.google.android.gms.internal.ads.zzgx
    public final void zzdi(long j) throws zzgd {
        this.zzacj = false;
        this.zzaci = false;
        zza(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzgx
    public final void stop() throws zzgd {
        zznr.checkState(this.state == 2);
        this.state = 1;
        onStopped();
    }

    @Override // com.google.android.gms.internal.ads.zzgx
    public final void disable() {
        zznr.checkState(this.state == 1);
        this.state = 0;
        this.zzacg = null;
        this.zzacj = false;
        zzdr();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzgz zzds() {
        return this.zzacf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zza(zzgq zzgqVar, zzik zzikVar, boolean z) {
        int zzb = this.zzacg.zzb(zzgqVar, zzikVar, z);
        if (zzb == -4) {
            if (zzikVar.zzfv()) {
                this.zzaci = true;
                return this.zzacj ? -4 : -3;
            }
            zzikVar.zzamb += this.zzach;
        } else if (zzb == -5) {
            zzgo zzgoVar = zzgqVar.zzafx;
            if (zzgoVar.zzafr != Long.MAX_VALUE) {
                zzgqVar.zzafx = zzgoVar.zzdm(zzgoVar.zzafr + this.zzach);
            }
        }
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzdj(long j) {
        this.zzacg.zzeb(j - this.zzach);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzdt() {
        return this.zzaci ? this.zzacj : this.zzacg.isReady();
    }
}
