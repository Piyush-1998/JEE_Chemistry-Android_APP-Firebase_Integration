package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdf {
    private static final String[] zzwy = {"/aclk", "/pcs/click", "/dbm/clk"};
    private String zzwu = "googleads.g.doubleclick.net";
    private String zzwv = "/pagead/ads";
    private String zzww = "ad.doubleclick.net";
    private String[] zzwx = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private zzdc zzwz;

    public zzdf(zzdc zzdcVar) {
        this.zzwz = zzdcVar;
    }

    public final void zzb(String str, String str2) {
        this.zzwu = str;
        this.zzwv = str2;
    }

    public final boolean zza(Uri uri) {
        if (uri == null) {
            throw null;
        }
        try {
            if (uri.getHost().equals(this.zzwu)) {
                if (uri.getPath().equals(this.zzwv)) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    private final boolean zzb(Uri uri) {
        if (uri == null) {
            throw null;
        }
        try {
            return uri.getHost().equals(this.zzww);
        } catch (NullPointerException unused) {
            return false;
        }
    }

    public final boolean zzc(Uri uri) {
        if (uri != null) {
            try {
                String host = uri.getHost();
                for (String str : this.zzwx) {
                    if (host.endsWith(str)) {
                        return true;
                    }
                }
            } catch (NullPointerException unused) {
            }
            return false;
        }
        throw null;
    }

    public final void zzap(String str) {
        this.zzwx = str.split(",");
    }

    public final zzdc zzcd() {
        return this.zzwz;
    }

    public final Uri zza(Uri uri, Context context) throws zzdi {
        return zza(uri, this.zzwz.zza(context));
    }

    public final void zzb(MotionEvent motionEvent) {
        this.zzwz.zzb(motionEvent);
    }

    @Deprecated
    public final Uri zzb(Uri uri, Context context) throws zzdi {
        return zza(uri, context, null, null);
    }

    public final Uri zza(Uri uri, Context context, View view, Activity activity) throws zzdi {
        try {
            return zza(uri, this.zzwz.zza(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzdi("Provided Uri is not in a valid state");
        }
    }

    public final boolean zzd(Uri uri) {
        if (zzc(uri)) {
            for (String str : zzwy) {
                if (uri.getPath().endsWith(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final Uri zza(Uri uri, String str) throws zzdi {
        try {
            boolean zzb = zzb(uri);
            if (zzb) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new zzdi("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new zzdi("Query parameter already exists: ms");
            }
            if (zzb) {
                String uri2 = uri.toString();
                int indexOf = uri2.indexOf(";adurl");
                if (indexOf != -1) {
                    int i = indexOf + 1;
                    return Uri.parse(uri2.substring(0, i) + "dc_ms=" + str + ";" + uri2.substring(i));
                }
                String encodedPath = uri.getEncodedPath();
                int indexOf2 = uri2.indexOf(encodedPath);
                return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
            }
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 != -1) {
                int i2 = indexOf3 + 1;
                return Uri.parse(uri3.substring(0, i2) + "ms=" + str + "&" + uri3.substring(i2));
            }
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        } catch (UnsupportedOperationException unused) {
            throw new zzdi("Provided Uri is not in a valid state");
        }
    }
}
