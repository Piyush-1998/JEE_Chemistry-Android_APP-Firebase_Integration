package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzanm extends RemoteCreator<zzanp> {
    public zzanm() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public final zzano zzc(Activity activity) {
        try {
            IBinder zzah = getRemoteCreatorInstance(activity).zzah(ObjectWrapper.wrap(activity));
            if (zzah == null) {
                return null;
            }
            IInterface queryLocalInterface = zzah.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof zzano) {
                return (zzano) queryLocalInterface;
            }
            return new zzanq(zzah);
        } catch (RemoteException e) {
            zzaxi.zzd("Could not create remote AdOverlay.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            zzaxi.zzd("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ zzanp getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof zzanp) {
            return (zzanp) queryLocalInterface;
        }
        return new zzans(iBinder);
    }
}
