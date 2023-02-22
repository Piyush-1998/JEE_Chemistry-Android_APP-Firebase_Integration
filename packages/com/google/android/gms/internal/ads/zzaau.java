package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaau extends zzabl {
    private final int height;
    private final Uri uri;
    private final int width;
    private final Drawable zzcvx;
    private final double zzcvy;

    public zzaau(Drawable drawable, Uri uri, double d, int i, int i2) {
        this.zzcvx = drawable;
        this.uri = uri;
        this.zzcvy = d;
        this.width = i;
        this.height = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzabi
    public final IObjectWrapper zzqi() throws RemoteException {
        return ObjectWrapper.wrap(this.zzcvx);
    }

    @Override // com.google.android.gms.internal.ads.zzabi
    public final Uri getUri() throws RemoteException {
        return this.uri;
    }

    @Override // com.google.android.gms.internal.ads.zzabi
    public final double getScale() {
        return this.zzcvy;
    }

    @Override // com.google.android.gms.internal.ads.zzabi
    public final int getWidth() {
        return this.width;
    }

    @Override // com.google.android.gms.internal.ads.zzabi
    public final int getHeight() {
        return this.height;
    }
}
