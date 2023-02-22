package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
final class zzasj {
    private static final Map<String, String> zzdpe;
    private final List<String> zzdpf;
    private final zzarv zzdpg;
    private final Context zzlk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzasj(Context context, List<String> list, zzarv zzarvVar) {
        this.zzlk = context;
        this.zzdpf = list;
        this.zzdpg = zzarvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<String> zzb(String[] strArr) {
        boolean z;
        boolean z2;
        String valueOf;
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Iterator<String> it = this.zzdpf.iterator();
            do {
                z = true;
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                String next = it.next();
                if (next.equals(str)) {
                    break;
                }
                valueOf = String.valueOf(next);
            } while (!(valueOf.length() != 0 ? "android.webkit.resource.".concat(valueOf) : new String("android.webkit.resource.")).equals(str));
            z2 = true;
            if (z2) {
                if (zzdpe.containsKey(str)) {
                    com.google.android.gms.ads.internal.zzq.zzkj();
                    if (!zzaul.zzq(this.zzlk, zzdpe.get(str))) {
                        z = false;
                    }
                }
                if (z) {
                    arrayList.add(str);
                } else {
                    this.zzdpg.zzds(str);
                }
            } else {
                this.zzdpg.zzdr(str);
            }
        }
        return arrayList;
    }

    static {
        HashMap hashMap = new HashMap();
        if (PlatformVersion.isAtLeastLollipop()) {
            hashMap.put("android.webkit.resource.AUDIO_CAPTURE", "android.permission.RECORD_AUDIO");
            hashMap.put("android.webkit.resource.VIDEO_CAPTURE", "android.permission.CAMERA");
        }
        zzdpe = hashMap;
    }
}
