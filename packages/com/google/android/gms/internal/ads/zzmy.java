package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzmy {
    private zzmx zzbed;

    public abstract zzna zza(zzgw[] zzgwVarArr, zzmk zzmkVar) throws zzgd;

    public abstract void zzd(Object obj);

    public final void zza(zzmx zzmxVar) {
        this.zzbed = zzmxVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void invalidate() {
        zzmx zzmxVar = this.zzbed;
        if (zzmxVar != null) {
            zzmxVar.zzec();
        }
    }
}
