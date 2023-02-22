package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
final class zzads implements Runnable {
    private final /* synthetic */ PublisherAdView zzcww;
    private final /* synthetic */ zzvl zzcwx;
    private final /* synthetic */ zzadt zzcwy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzads(zzadt zzadtVar, PublisherAdView publisherAdView, zzvl zzvlVar) {
        this.zzcwy = zzadtVar;
        this.zzcww = publisherAdView;
        this.zzcwx = zzvlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener;
        if (!this.zzcww.zza(this.zzcwx)) {
            zzaxi.zzeu("Could not bind.");
            return;
        }
        onPublisherAdViewLoadedListener = this.zzcwy.zzcwz;
        onPublisherAdViewLoadedListener.onPublisherAdViewLoaded(this.zzcww);
    }
}
