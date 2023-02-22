package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzabf extends NativeAd.AdChoicesInfo {
    private String zzazq;
    private final List<NativeAd.Image> zzcvs = new ArrayList();
    private final zzaba zzcwc;

    public zzabf(zzaba zzabaVar) {
        zzabi zzabiVar;
        IBinder iBinder;
        this.zzcwc = zzabaVar;
        try {
            this.zzazq = zzabaVar.getText();
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            this.zzazq = "";
        }
        try {
            for (zzabi zzabiVar2 : zzabaVar.zzqe()) {
                if (!(zzabiVar2 instanceof IBinder) || (iBinder = (IBinder) zzabiVar2) == null) {
                    zzabiVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    if (queryLocalInterface instanceof zzabi) {
                        zzabiVar = (zzabi) queryLocalInterface;
                    } else {
                        zzabiVar = new zzabk(iBinder);
                    }
                }
                if (zzabiVar != null) {
                    this.zzcvs.add(new zzabn(zzabiVar));
                }
            }
        } catch (RemoteException e2) {
            zzaxi.zzc("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzazq;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzcvs;
    }
}
