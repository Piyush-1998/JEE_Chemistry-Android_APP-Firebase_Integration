package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaie extends zzayc<zzaha> {
    private zzavr<zzaha> zzczv;
    private final Object lock = new Object();
    private boolean zzdam = false;
    private int zzdan = 0;

    public zzaie(zzavr<zzaha> zzavrVar) {
        this.zzczv = zzavrVar;
    }

    public final zzaia zzrg() {
        zzaia zzaiaVar = new zzaia(this);
        synchronized (this.lock) {
            zza(new zzaih(this, zzaiaVar), new zzaig(this, zzaiaVar));
            Preconditions.checkState(this.zzdan >= 0);
            this.zzdan++;
        }
        return zzaiaVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzrh() {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzdan > 0);
            zzaug.zzdy("Releasing 1 reference for JS Engine");
            this.zzdan--;
            zzrj();
        }
    }

    public final void zzri() {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzdan >= 0);
            zzaug.zzdy("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzdam = true;
            zzrj();
        }
    }

    private final void zzrj() {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzdan >= 0);
            if (this.zzdam && this.zzdan == 0) {
                zzaug.zzdy("No reference is left (including root). Cleaning up engine.");
                zza(new zzaij(this), new zzaya());
            } else {
                zzaug.zzdy("There are still references to the engine. Not destroying.");
            }
        }
    }
}
