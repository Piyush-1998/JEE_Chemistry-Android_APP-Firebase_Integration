package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
final class zzdtj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzdc(zzdpm zzdpmVar) {
        zzdtm zzdtmVar = new zzdtm(zzdpmVar);
        StringBuilder sb = new StringBuilder(zzdtmVar.size());
        for (int i = 0; i < zzdtmVar.size(); i++) {
            byte zzfm = zzdtmVar.zzfm(i);
            if (zzfm == 34) {
                sb.append("\\\"");
            } else if (zzfm == 39) {
                sb.append("\\'");
            } else if (zzfm != 92) {
                switch (zzfm) {
                    case 7:
                        sb.append("\\a");
                        continue;
                    case 8:
                        sb.append("\\b");
                        continue;
                    case 9:
                        sb.append("\\t");
                        continue;
                    case 10:
                        sb.append("\\n");
                        continue;
                    case 11:
                        sb.append("\\v");
                        continue;
                    case 12:
                        sb.append("\\f");
                        continue;
                    case 13:
                        sb.append("\\r");
                        continue;
                    default:
                        if (zzfm >= 32 && zzfm <= 126) {
                            sb.append((char) zzfm);
                            continue;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((zzfm >>> 6) & 3) + 48));
                            sb.append((char) (((zzfm >>> 3) & 7) + 48));
                            sb.append((char) ((zzfm & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
