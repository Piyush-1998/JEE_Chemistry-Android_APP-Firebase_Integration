package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzrx implements BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ zzrp zzbrq;
    private final /* synthetic */ zzaxv zzbrr;
    final /* synthetic */ zzrv zzbrs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzrx(zzrv zzrvVar, zzrp zzrpVar, zzaxv zzaxvVar) {
        this.zzbrs = zzrvVar;
        this.zzbrq = zzrpVar;
        this.zzbrr = zzaxvVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        boolean z;
        final zzrq zzrqVar;
        obj = this.zzbrs.lock;
        synchronized (obj) {
            z = this.zzbrs.zzbrp;
            if (z) {
                return;
            }
            this.zzbrs.zzbrp = true;
            zzrqVar = this.zzbrs.zzbrc;
            if (zzrqVar == null) {
                return;
            }
            zzddl zzddlVar = zzaxn.zzdwi;
            final zzrp zzrpVar = this.zzbrq;
            final zzaxv zzaxvVar = this.zzbrr;
            final zzddi<?> zzf = zzddlVar.zzf(new Runnable(this, zzrqVar, zzrpVar, zzaxvVar) { // from class: com.google.android.gms.internal.ads.zzsa
                private final zzrx zzbrv;
                private final zzrq zzbrw;
                private final zzrp zzbrx;
                private final zzaxv zzbry;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzbrv = this;
                    this.zzbrw = zzrqVar;
                    this.zzbrx = zzrpVar;
                    this.zzbry = zzaxvVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzrx zzrxVar = this.zzbrv;
                    zzrq zzrqVar2 = this.zzbrw;
                    zzrp zzrpVar2 = this.zzbrx;
                    zzaxv zzaxvVar2 = this.zzbry;
                    try {
                        zzro zza = zzrqVar2.zzml().zza(zzrpVar2);
                        if (!zza.zzmi()) {
                            zzaxvVar2.setException(new RuntimeException("No entry contents."));
                            zzrxVar.zzbrs.disconnect();
                            return;
                        }
                        zzsc zzscVar = new zzsc(zzrxVar, zza.zzmj(), 1);
                        int read = zzscVar.read();
                        if (read == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        zzscVar.unread(read);
                        zzaxvVar2.set(zzscVar);
                    } catch (RemoteException | IOException e) {
                        zzaug.zzc("Unable to obtain a cache service instance.", e);
                        zzaxvVar2.setException(e);
                        zzrxVar.zzbrs.disconnect();
                    }
                }
            });
            zzaxv zzaxvVar2 = this.zzbrr;
            final zzaxv zzaxvVar3 = this.zzbrr;
            zzaxvVar2.addListener(new Runnable(zzaxvVar3, zzf) { // from class: com.google.android.gms.internal.ads.zzrz
                private final zzaxv zzbrt;
                private final Future zzbru;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzbrt = zzaxvVar3;
                    this.zzbru = zzf;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzaxv zzaxvVar4 = this.zzbrt;
                    Future future = this.zzbru;
                    if (zzaxvVar4.isCancelled()) {
                        future.cancel(true);
                    }
                }
            }, zzaxn.zzdwn);
        }
    }
}
