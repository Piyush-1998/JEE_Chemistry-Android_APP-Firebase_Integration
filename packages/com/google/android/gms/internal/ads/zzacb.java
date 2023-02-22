package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzacb extends NativeAppInstallAd {
    private final zzabw zzcwf;
    private final zzabn zzcwh;
    private final NativeAd.AdChoicesInfo zzcwi;
    private final List<NativeAd.Image> zzcwg = new ArrayList();
    private final VideoController zzcen = new VideoController();

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|2|3|(2:5|(5:8|(1:22)(2:12|(1:14)(1:21))|(3:16|17|18)(1:20)|19|6))|24|25|(7:27|28|29|30|(2:32|33)|35|36)|41|28|29|30|(0)|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
        com.google.android.gms.internal.ads.zzaxi.zzc("", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074 A[Catch: RemoteException -> 0x0081, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x0081, blocks: (B:30:0x006c, B:32:0x0074), top: B:38:0x006c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzacb(com.google.android.gms.internal.ads.zzabw r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zzcwg = r1
            com.google.android.gms.ads.VideoController r1 = new com.google.android.gms.ads.VideoController
            r1.<init>()
            r5.zzcen = r1
            r5.zzcwf = r6
            r1 = 0
            java.util.List r6 = r6.getImages()     // Catch: android.os.RemoteException -> L53
            if (r6 == 0) goto L57
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L53
        L20:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L53
            if (r2 == 0) goto L57
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L53
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L53
            if (r3 == 0) goto L45
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L53
            if (r2 == 0) goto L45
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch: android.os.RemoteException -> L53
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.zzabi     // Catch: android.os.RemoteException -> L53
            if (r4 == 0) goto L3f
            com.google.android.gms.internal.ads.zzabi r3 = (com.google.android.gms.internal.ads.zzabi) r3     // Catch: android.os.RemoteException -> L53
            goto L46
        L3f:
            com.google.android.gms.internal.ads.zzabk r3 = new com.google.android.gms.internal.ads.zzabk     // Catch: android.os.RemoteException -> L53
            r3.<init>(r2)     // Catch: android.os.RemoteException -> L53
            goto L46
        L45:
            r3 = r1
        L46:
            if (r3 == 0) goto L20
            java.util.List<com.google.android.gms.ads.formats.NativeAd$Image> r2 = r5.zzcwg     // Catch: android.os.RemoteException -> L53
            com.google.android.gms.internal.ads.zzabn r4 = new com.google.android.gms.internal.ads.zzabn     // Catch: android.os.RemoteException -> L53
            r4.<init>(r3)     // Catch: android.os.RemoteException -> L53
            r2.add(r4)     // Catch: android.os.RemoteException -> L53
            goto L20
        L53:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzaxi.zzc(r0, r6)
        L57:
            com.google.android.gms.internal.ads.zzabw r6 = r5.zzcwf     // Catch: android.os.RemoteException -> L65
            com.google.android.gms.internal.ads.zzabi r6 = r6.zzqn()     // Catch: android.os.RemoteException -> L65
            if (r6 == 0) goto L69
            com.google.android.gms.internal.ads.zzabn r2 = new com.google.android.gms.internal.ads.zzabn     // Catch: android.os.RemoteException -> L65
            r2.<init>(r6)     // Catch: android.os.RemoteException -> L65
            goto L6a
        L65:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzaxi.zzc(r0, r6)
        L69:
            r2 = r1
        L6a:
            r5.zzcwh = r2
            com.google.android.gms.internal.ads.zzabw r6 = r5.zzcwf     // Catch: android.os.RemoteException -> L81
            com.google.android.gms.internal.ads.zzaba r6 = r6.zzqo()     // Catch: android.os.RemoteException -> L81
            if (r6 == 0) goto L85
            com.google.android.gms.internal.ads.zzabf r6 = new com.google.android.gms.internal.ads.zzabf     // Catch: android.os.RemoteException -> L81
            com.google.android.gms.internal.ads.zzabw r2 = r5.zzcwf     // Catch: android.os.RemoteException -> L81
            com.google.android.gms.internal.ads.zzaba r2 = r2.zzqo()     // Catch: android.os.RemoteException -> L81
            r6.<init>(r2)     // Catch: android.os.RemoteException -> L81
            r1 = r6
            goto L85
        L81:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzaxi.zzc(r0, r6)
        L85:
            r5.zzcwi = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacb.<init>(com.google.android.gms.internal.ads.zzabw):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.formats.NativeAd
    /* renamed from: zzqm */
    public final IObjectWrapper zzjd() {
        try {
            return this.zzcwf.zzqm();
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.zzcwf.performClick(bundle);
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zzcwf.recordImpression(bundle);
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zzcwf.reportTouchEvent(bundle);
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getHeadline() {
        try {
            return this.zzcwf.getHeadline();
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final List<NativeAd.Image> getImages() {
        return this.zzcwg;
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getBody() {
        try {
            return this.zzcwf.getBody();
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final NativeAd.Image getIcon() {
        return this.zzcwh;
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getCallToAction() {
        try {
            return this.zzcwf.getCallToAction();
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final Double getStarRating() {
        try {
            double starRating = this.zzcwf.getStarRating();
            if (starRating == -1.0d) {
                return null;
            }
            return Double.valueOf(starRating);
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getStore() {
        try {
            return this.zzcwf.getStore();
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getPrice() {
        try {
            return this.zzcwf.getPrice();
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final VideoController getVideoController() {
        try {
            if (this.zzcwf.getVideoController() != null) {
                this.zzcen.zza(this.zzcwf.getVideoController());
            }
        } catch (RemoteException e) {
            zzaxi.zzc("Exception occurred while getting video controller", e);
        }
        return this.zzcen;
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.zzcwi;
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getMediationAdapterClassName() {
        try {
            return this.zzcwf.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final Bundle getExtras() {
        try {
            return this.zzcwf.getExtras();
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final void destroy() {
        try {
            this.zzcwf.destroy();
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
        }
    }
}
