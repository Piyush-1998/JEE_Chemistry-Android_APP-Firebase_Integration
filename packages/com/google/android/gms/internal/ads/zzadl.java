package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzadl extends UnifiedNativeAd {
    private final zzabn zzcwh;
    private final NativeAd.AdChoicesInfo zzcwi;
    private final zzadg zzcwq;
    private final List<NativeAd.Image> zzcwg = new ArrayList();
    private final VideoController zzcen = new VideoController();
    private final List<MuteThisAdReason> zzcwr = new ArrayList();

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|2|3|(2:5|(5:8|(1:22)(2:12|(1:14)(1:21))|(3:16|17|18)(1:20)|19|6))|(3:24|25|(2:27|(5:30|(1:32)(1:39)|(3:34|35|36)(1:38)|37|28)))|(2:41|42)|(7:44|45|46|47|(2:49|50)|52|53)|58|45|46|47|(0)|52|53) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bb, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bc, code lost:
        com.google.android.gms.internal.ads.zzaxi.zzc("", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ae A[Catch: RemoteException -> 0x00bb, TRY_LEAVE, TryCatch #2 {RemoteException -> 0x00bb, blocks: (B:44:0x00a6, B:46:0x00ae), top: B:56:0x00a6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzadl(com.google.android.gms.internal.ads.zzadg r6) {
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
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zzcwr = r1
            r5.zzcwq = r6
            r1 = 0
            java.util.List r6 = r6.getImages()     // Catch: android.os.RemoteException -> L5a
            if (r6 == 0) goto L5e
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L5a
        L27:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L5a
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L5a
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L5a
            if (r3 == 0) goto L4c
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L5a
            if (r2 == 0) goto L4c
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch: android.os.RemoteException -> L5a
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.zzabi     // Catch: android.os.RemoteException -> L5a
            if (r4 == 0) goto L46
            com.google.android.gms.internal.ads.zzabi r3 = (com.google.android.gms.internal.ads.zzabi) r3     // Catch: android.os.RemoteException -> L5a
            goto L4d
        L46:
            com.google.android.gms.internal.ads.zzabk r3 = new com.google.android.gms.internal.ads.zzabk     // Catch: android.os.RemoteException -> L5a
            r3.<init>(r2)     // Catch: android.os.RemoteException -> L5a
            goto L4d
        L4c:
            r3 = r1
        L4d:
            if (r3 == 0) goto L27
            java.util.List<com.google.android.gms.ads.formats.NativeAd$Image> r2 = r5.zzcwg     // Catch: android.os.RemoteException -> L5a
            com.google.android.gms.internal.ads.zzabn r4 = new com.google.android.gms.internal.ads.zzabn     // Catch: android.os.RemoteException -> L5a
            r4.<init>(r3)     // Catch: android.os.RemoteException -> L5a
            r2.add(r4)     // Catch: android.os.RemoteException -> L5a
            goto L27
        L5a:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzaxi.zzc(r0, r6)
        L5e:
            com.google.android.gms.internal.ads.zzadg r6 = r5.zzcwq     // Catch: android.os.RemoteException -> L8d
            java.util.List r6 = r6.getMuteThisAdReasons()     // Catch: android.os.RemoteException -> L8d
            if (r6 == 0) goto L91
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L8d
        L6a:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L8d
            if (r2 == 0) goto L91
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L8d
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L8d
            if (r3 == 0) goto L7f
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L8d
            com.google.android.gms.internal.ads.zzwi r2 = com.google.android.gms.internal.ads.zzwl.zzg(r2)     // Catch: android.os.RemoteException -> L8d
            goto L80
        L7f:
            r2 = r1
        L80:
            if (r2 == 0) goto L6a
            java.util.List<com.google.android.gms.ads.MuteThisAdReason> r3 = r5.zzcwr     // Catch: android.os.RemoteException -> L8d
            com.google.android.gms.internal.ads.zzwn r4 = new com.google.android.gms.internal.ads.zzwn     // Catch: android.os.RemoteException -> L8d
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L8d
            r3.add(r4)     // Catch: android.os.RemoteException -> L8d
            goto L6a
        L8d:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzaxi.zzc(r0, r6)
        L91:
            com.google.android.gms.internal.ads.zzadg r6 = r5.zzcwq     // Catch: android.os.RemoteException -> L9f
            com.google.android.gms.internal.ads.zzabi r6 = r6.zzqn()     // Catch: android.os.RemoteException -> L9f
            if (r6 == 0) goto La3
            com.google.android.gms.internal.ads.zzabn r2 = new com.google.android.gms.internal.ads.zzabn     // Catch: android.os.RemoteException -> L9f
            r2.<init>(r6)     // Catch: android.os.RemoteException -> L9f
            goto La4
        L9f:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzaxi.zzc(r0, r6)
        La3:
            r2 = r1
        La4:
            r5.zzcwh = r2
            com.google.android.gms.internal.ads.zzadg r6 = r5.zzcwq     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzaba r6 = r6.zzqo()     // Catch: android.os.RemoteException -> Lbb
            if (r6 == 0) goto Lbf
            com.google.android.gms.internal.ads.zzabf r6 = new com.google.android.gms.internal.ads.zzabf     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzadg r2 = r5.zzcwq     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzaba r2 = r2.zzqo()     // Catch: android.os.RemoteException -> Lbb
            r6.<init>(r2)     // Catch: android.os.RemoteException -> Lbb
            r1 = r6
            goto Lbf
        Lbb:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzaxi.zzc(r0, r6)
        Lbf:
            r5.zzcwi = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadl.<init>(com.google.android.gms.internal.ads.zzadg):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    /* renamed from: zzqm */
    public final IObjectWrapper zzjd() {
        try {
            return this.zzcwq.zzqm();
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Object zzji() {
        try {
            IObjectWrapper zzqp = this.zzcwq.zzqp();
            if (zzqp != null) {
                return ObjectWrapper.unwrap(zzqp);
            }
            return null;
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.zzcwq.performClick(bundle);
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zzcwq.recordImpression(bundle);
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zzcwq.reportTouchEvent(bundle);
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getHeadline() {
        try {
            return this.zzcwq.getHeadline();
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List<NativeAd.Image> getImages() {
        return this.zzcwg;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getBody() {
        try {
            return this.zzcwq.getBody();
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.Image getIcon() {
        return this.zzcwh;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getCallToAction() {
        try {
            return this.zzcwq.getCallToAction();
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Double getStarRating() {
        try {
            double starRating = this.zzcwq.getStarRating();
            if (starRating == -1.0d) {
                return null;
            }
            return Double.valueOf(starRating);
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getStore() {
        try {
            return this.zzcwq.getStore();
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getPrice() {
        try {
            return this.zzcwq.getPrice();
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController getVideoController() {
        try {
            if (this.zzcwq.getVideoController() != null) {
                this.zzcen.zza(this.zzcwq.getVideoController());
            }
        } catch (RemoteException e) {
            zzaxi.zzc("Exception occurred while getting video controller", e);
        }
        return this.zzcen;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.zzcwi;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getMediationAdapterClassName() {
        try {
            return this.zzcwq.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Bundle getExtras() {
        try {
            Bundle extras = this.zzcwq.getExtras();
            if (extras != null) {
                return extras;
            }
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void enableCustomClickGesture() {
        try {
            this.zzcwq.zzqw();
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.zzcwq.isCustomClickGestureEnabled();
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void recordCustomClickGesture() {
        try {
            this.zzcwq.recordCustomClickGesture();
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.zzcwr;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.zzcwq.isCustomMuteThisAdEnabled();
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void destroy() {
        try {
            this.zzcwq.destroy();
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setUnconfirmedClickListener(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.zzcwq.zza(new zzadu(unconfirmedClickListener));
        } catch (RemoteException e) {
            zzaxi.zzc("Failed to setUnconfirmedClickListener", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            if (!isCustomMuteThisAdEnabled()) {
                zzaxi.zzes("Ad is not custom mute enabled");
            } else if (muteThisAdReason == null) {
                this.zzcwq.zza((zzwi) null);
            } else if (muteThisAdReason instanceof zzwn) {
                this.zzcwq.zza(((zzwn) muteThisAdReason).zzow());
            } else {
                zzaxi.zzes("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
            }
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.zzcwq.zza(new zzwj(muteThisAdListener));
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.zzcwq.cancelUnconfirmedClick();
        } catch (RemoteException e) {
            zzaxi.zzc("Failed to cancelUnconfirmedClick", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getAdvertiser() {
        try {
            return this.zzcwq.getAdvertiser();
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final UnifiedNativeAd.MediaContent getMediaContent() {
        try {
            if (this.zzcwq.zzqx() != null) {
                return new zzadk(this.zzcwq.zzqx());
            }
            return null;
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            return null;
        }
    }
}
