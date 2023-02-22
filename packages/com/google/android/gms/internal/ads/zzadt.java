package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzadt extends zzacx {
    private final OnPublisherAdViewLoadedListener zzcwz;

    public zzadt(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener) {
        this.zzcwz = onPublisherAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zza(zzvl zzvlVar, IObjectWrapper iObjectWrapper) {
        if (zzvlVar == null || iObjectWrapper == null) {
            return;
        }
        PublisherAdView publisherAdView = new PublisherAdView((Context) ObjectWrapper.unwrap(iObjectWrapper));
        try {
            if (zzvlVar.zzjw() instanceof zztt) {
                zztt zzttVar = (zztt) zzvlVar.zzjw();
                publisherAdView.setAdListener(zzttVar != null ? zzttVar.getAdListener() : null);
            }
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
        }
        try {
            if (zzvlVar.zzjv() instanceof zzuc) {
                zzuc zzucVar = (zzuc) zzvlVar.zzjv();
                publisherAdView.setAppEventListener(zzucVar != null ? zzucVar.getAppEventListener() : null);
            }
        } catch (RemoteException e2) {
            zzaxi.zzc("", e2);
        }
        zzawy.zzzb.post(new zzads(this, publisherAdView, zzvlVar));
    }
}
