package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcw;
import com.google.android.gms.internal.ads.zzbda;
import com.google.android.gms.internal.ads.zzbdb;
import com.google.android.gms.internal.ads.zzbdd;
import java.net.URISyntaxException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaev<T extends zzbct & zzbcw & zzbda & zzbdb & zzbdd> implements zzaer<T> {
    private final com.google.android.gms.ads.internal.zzc zzcyb;
    private final zzamz zzcyc;

    public zzaev(com.google.android.gms.ads.internal.zzc zzcVar, zzamz zzamzVar) {
        this.zzcyb = zzcVar;
        this.zzcyc = zzamzVar;
    }

    private static boolean zzd(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int zze(Map<String, String> map) {
        String str = map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                com.google.android.gms.ads.internal.zzq.zzkl();
                return 7;
            } else if ("l".equalsIgnoreCase(str)) {
                com.google.android.gms.ads.internal.zzq.zzkl();
                return 6;
            } else if ("c".equalsIgnoreCase(str)) {
                return com.google.android.gms.ads.internal.zzq.zzkl().zzvq();
            } else {
                return -1;
            }
        }
        return -1;
    }

    private final void zzu(boolean z) {
        zzamz zzamzVar = this.zzcyc;
        if (zzamzVar != null) {
            zzamzVar.zzv(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(Context context, zzdf zzdfVar, String str, View view, Activity activity) {
        if (zzdfVar == null) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            if (zzdfVar.zzd(parse)) {
                parse = zzdfVar.zza(parse, context, view, activity);
            }
            return parse.toString();
        } catch (zzdi unused) {
            return str;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzq.zzkn().zza(e, "OpenGmsgHandler.maybeAddClickSignalsToUrl");
            return str;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzbct zzbctVar = (zzbct) obj;
        String zzd = zzate.zzd((String) map.get("u"), zzbctVar.getContext(), true);
        String str = (String) map.get("a");
        if (str == null) {
            zzaug.zzeu("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzc zzcVar = this.zzcyb;
        if (zzcVar != null && !zzcVar.zzjk()) {
            this.zzcyb.zzbl(zzd);
        } else if ("expand".equalsIgnoreCase(str)) {
            if (((zzbcw) zzbctVar).zzzu()) {
                zzaug.zzeu("Cannot expand WebView that is already expanded.");
                return;
            }
            zzu(false);
            ((zzbda) zzbctVar).zzb(zzd(map), zze(map));
        } else if ("webapp".equalsIgnoreCase(str)) {
            zzu(false);
            if (zzd != null) {
                ((zzbda) zzbctVar).zza(zzd(map), zze(map), zzd);
            } else {
                ((zzbda) zzbctVar).zza(zzd(map), zze(map), (String) map.get("html"), (String) map.get("baseurl"));
            }
        } else if ("app".equalsIgnoreCase(str) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzu(true);
            if (TextUtils.isEmpty(zzd)) {
                zzaug.zzeu("Destination url cannot be empty.");
                return;
            }
            try {
                ((zzbda) zzbctVar).zza(new com.google.android.gms.ads.internal.overlay.zzd(new zzaeu(zzbctVar.getContext(), ((zzbdb) zzbctVar).zzzs(), ((zzbdd) zzbctVar).getView()).zzc(map)));
            } catch (ActivityNotFoundException e) {
                zzaug.zzeu(e.getMessage());
            }
        } else {
            zzu(true);
            String str2 = (String) map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    intent = Intent.parseUri(str2, 0);
                } catch (URISyntaxException e2) {
                    String valueOf = String.valueOf(str2);
                    zzaug.zzc(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e2);
                }
            }
            if (intent != null && intent.getData() != null) {
                Uri data = intent.getData();
                String uri = data.toString();
                if (!TextUtils.isEmpty(uri)) {
                    try {
                        uri = zza(zzbctVar.getContext(), ((zzbdb) zzbctVar).zzzs(), uri, ((zzbdd) zzbctVar).getView(), zzbctVar.zzxn());
                    } catch (Exception e3) {
                        zzaug.zzc("Error occurred while adding signals.", e3);
                        com.google.android.gms.ads.internal.zzq.zzkn().zza(e3, "OpenGmsgHandler.onGmsg");
                    }
                    try {
                        data = Uri.parse(uri);
                    } catch (Exception e4) {
                        String valueOf2 = String.valueOf(uri);
                        zzaug.zzc(valueOf2.length() != 0 ? "Error parsing the uri: ".concat(valueOf2) : new String("Error parsing the uri: "), e4);
                        com.google.android.gms.ads.internal.zzq.zzkn().zza(e4, "OpenGmsgHandler.onGmsg");
                    }
                }
                intent.setData(data);
            }
            if (intent != null) {
                ((zzbda) zzbctVar).zza(new com.google.android.gms.ads.internal.overlay.zzd(intent));
                return;
            }
            if (!TextUtils.isEmpty(zzd)) {
                zzd = zza(zzbctVar.getContext(), ((zzbdb) zzbctVar).zzzs(), zzd, ((zzbdd) zzbctVar).getView(), zzbctVar.zzxn());
            }
            ((zzbda) zzbctVar).zza(new com.google.android.gms.ads.internal.overlay.zzd((String) map.get("i"), zzd, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
        }
    }
}
