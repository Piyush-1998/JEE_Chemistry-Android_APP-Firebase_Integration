package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzkx;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzja {
    private static final zzlb zzamy = new zziz();
    private static final Pattern zzamz = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zzafp = -1;
    public int zzafq = -1;

    public final boolean zzb(zzkx zzkxVar) {
        for (int i = 0; i < zzkxVar.length(); i++) {
            zzkx.zza zzar = zzkxVar.zzar(i);
            if (zzar instanceof zzkz) {
                zzkz zzkzVar = (zzkz) zzar;
                if (zzd(zzkzVar.description, zzkzVar.zzazq)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean zzd(String str, String str2) {
        if ("iTunSMPB".equals(str)) {
            Matcher matcher = zzamz.matcher(str2);
            if (matcher.find()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1), 16);
                    int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                    if (parseInt > 0 || parseInt2 > 0) {
                        this.zzafp = parseInt;
                        this.zzafq = parseInt2;
                        return true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
            return false;
        }
        return false;
    }

    public final boolean zzgf() {
        return (this.zzafp == -1 || this.zzafq == -1) ? false : true;
    }
}
