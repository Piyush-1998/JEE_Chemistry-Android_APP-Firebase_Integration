package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbvm implements View.OnClickListener {
    private final Clock zzbmp;
    private final zzbyh zzfnd;
    private zzadf zzfne;
    private zzaer<Object> zzfnf;
    String zzfng;
    Long zzfnh;
    WeakReference<View> zzfni;

    public zzbvm(zzbyh zzbyhVar, Clock clock) {
        this.zzfnd = zzbyhVar;
        this.zzbmp = clock;
    }

    public final void zza(final zzadf zzadfVar) {
        this.zzfne = zzadfVar;
        zzaer<Object> zzaerVar = this.zzfnf;
        if (zzaerVar != null) {
            this.zzfnd.zzb("/unconfirmedClick", zzaerVar);
        }
        zzaer<Object> zzaerVar2 = new zzaer(this, zzadfVar) { // from class: com.google.android.gms.internal.ads.zzbvp
            private final zzbvm zzfnj;
            private final zzadf zzfnk;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfnj = this;
                this.zzfnk = zzadfVar;
            }

            @Override // com.google.android.gms.internal.ads.zzaer
            public final void zza(Object obj, Map map) {
                zzbvm zzbvmVar = this.zzfnj;
                zzadf zzadfVar2 = this.zzfnk;
                try {
                    zzbvmVar.zzfnh = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    zzaug.zzes("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzbvmVar.zzfng = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (zzadfVar2 == null) {
                    zzaug.zzdv("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    zzadfVar2.onUnconfirmedClickReceived(str);
                } catch (RemoteException e) {
                    zzaxi.zze("#007 Could not call remote method.", e);
                }
            }
        };
        this.zzfnf = zzaerVar2;
        this.zzfnd.zza("/unconfirmedClick", zzaerVar2);
    }

    public final zzadf zzaiw() {
        return this.zzfne;
    }

    public final void cancelUnconfirmedClick() {
        if (this.zzfne == null || this.zzfnh == null) {
            return;
        }
        zzaix();
        try {
            this.zzfne.onUnconfirmedClickCancelled();
        } catch (RemoteException e) {
            zzaxi.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference<View> weakReference = this.zzfni;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zzfng != null && this.zzfnh != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.zzfng);
            hashMap.put("time_interval", String.valueOf(this.zzbmp.currentTimeMillis() - this.zzfnh.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.zzfnd.zza("sendMessageToNativeJs", hashMap);
        }
        zzaix();
    }

    private final void zzaix() {
        View view;
        this.zzfng = null;
        this.zzfnh = null;
        WeakReference<View> weakReference = this.zzfni;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzfni = null;
    }
}
