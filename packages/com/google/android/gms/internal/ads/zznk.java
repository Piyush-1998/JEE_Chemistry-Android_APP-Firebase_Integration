package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zznk extends IOException {
    private final int type;
    private final zznf zzbew;

    public zznk(String str, zznf zznfVar, int i) {
        super(str);
        this.zzbew = zznfVar;
        this.type = 1;
    }

    public zznk(IOException iOException, zznf zznfVar, int i) {
        super(iOException);
        this.zzbew = zznfVar;
        this.type = i;
    }

    public zznk(String str, IOException iOException, zznf zznfVar, int i) {
        super(str, iOException);
        this.zzbew = zznfVar;
        this.type = 1;
    }
}
