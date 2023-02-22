package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzana extends zzanj {
    private final Map<String, String> zzcuv;
    private final Context zzlk;

    public zzana(zzbbw zzbbwVar, Map<String, String> map) {
        super(zzbbwVar, "storePicture");
        this.zzcuv = map;
        this.zzlk = zzbbwVar.zzxn();
    }

    public final void execute() {
        if (this.zzlk == null) {
            zzdn("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzq.zzkj();
        if (!zzaul.zzas(this.zzlk).zzpo()) {
            zzdn("Feature is not supported by the device.");
            return;
        }
        String str = this.zzcuv.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzdn("Image url cannot be empty.");
        } else if (!URLUtil.isValidUrl(str)) {
            String valueOf = String.valueOf(str);
            zzdn(valueOf.length() != 0 ? "Invalid image url: ".concat(valueOf) : new String("Invalid image url: "));
        } else {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            com.google.android.gms.ads.internal.zzq.zzkj();
            if (!zzaul.zzee(lastPathSegment)) {
                String valueOf2 = String.valueOf(lastPathSegment);
                zzdn(valueOf2.length() != 0 ? "Image type not recognized: ".concat(valueOf2) : new String("Image type not recognized: "));
                return;
            }
            Resources resources = com.google.android.gms.ads.internal.zzq.zzkn().getResources();
            com.google.android.gms.ads.internal.zzq.zzkj();
            AlertDialog.Builder zzar = zzaul.zzar(this.zzlk);
            zzar.setTitle(resources != null ? resources.getString(R.string.s1) : "Save image");
            zzar.setMessage(resources != null ? resources.getString(R.string.s2) : "Allow Ad to store image in Picture gallery?");
            zzar.setPositiveButton(resources != null ? resources.getString(R.string.s3) : "Accept", new zzand(this, str, lastPathSegment));
            zzar.setNegativeButton(resources != null ? resources.getString(R.string.s4) : "Decline", new zzanc(this));
            zzar.create().show();
        }
    }
}
