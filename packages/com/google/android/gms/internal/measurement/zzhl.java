package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzhl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzd(zzdp zzdpVar) {
        zzho zzhoVar = new zzho(zzdpVar);
        StringBuilder sb = new StringBuilder(zzhoVar.size());
        for (int i = 0; i < zzhoVar.size(); i++) {
            byte zzaq = zzhoVar.zzaq(i);
            if (zzaq == 34) {
                sb.append("\\\"");
            } else if (zzaq == 39) {
                sb.append("\\'");
            } else if (zzaq != 92) {
                switch (zzaq) {
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
                        if (zzaq >= 32 && zzaq <= 126) {
                            sb.append((char) zzaq);
                            continue;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((zzaq >>> 6) & 3) + 48));
                            sb.append((char) (((zzaq >>> 3) & 7) + 48));
                            sb.append((char) ((zzaq & 7) + 48));
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
