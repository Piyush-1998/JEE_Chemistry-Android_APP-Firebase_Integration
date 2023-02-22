package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzato implements Runnable {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzaxv zzdqa;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzato(zzatl zzatlVar, Context context, zzaxv zzaxvVar) {
        this.val$context = context;
        this.zzdqa = zzaxvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzdqa.set(AdvertisingIdClient.getAdvertisingIdInfo(this.val$context));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.zzdqa.setException(e);
            zzaxi.zzc("Exception while getting advertising Id info", e);
        }
    }
}
