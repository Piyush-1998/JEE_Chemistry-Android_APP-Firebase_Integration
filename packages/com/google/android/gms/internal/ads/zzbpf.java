package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbpf extends zzbpm<AppEventListener> implements zzady {
    public zzbpf(Set<zzbqs<AppEventListener>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzady
    public final synchronized void onAppEvent(final String str, final String str2) {
        zza(new zzbpo(str, str2) { // from class: com.google.android.gms.internal.ads.zzbpi
            private final String zzcyz;
            private final String zzczh;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzczh = str;
                this.zzcyz = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzbpo
            public final void zzp(Object obj) {
                ((AppEventListener) obj).onAppEvent(this.zzczh, this.zzcyz);
            }
        });
    }
}
