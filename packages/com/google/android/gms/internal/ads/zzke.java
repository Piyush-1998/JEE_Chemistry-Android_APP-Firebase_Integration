package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.gms.internal.ads.zzkx;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzke {
    private static final int zzavv = zzof.zzbi("nam");
    private static final int zzavw = zzof.zzbi("trk");
    private static final int zzavx = zzof.zzbi("cmt");
    private static final int zzavy = zzof.zzbi("day");
    private static final int zzavz = zzof.zzbi("ART");
    private static final int zzawa = zzof.zzbi("too");
    private static final int zzawb = zzof.zzbi("alb");
    private static final int zzawc = zzof.zzbi("com");
    private static final int zzawd = zzof.zzbi("wrt");
    private static final int zzawe = zzof.zzbi("lyr");
    private static final int zzawf = zzof.zzbi("gen");
    private static final int zzawg = zzof.zzbi("covr");
    private static final int zzawh = zzof.zzbi("gnre");
    private static final int zzawi = zzof.zzbi("grp");
    private static final int zzawj = zzof.zzbi("disk");
    private static final int zzawk = zzof.zzbi("trkn");
    private static final int zzawl = zzof.zzbi("tmpo");
    private static final int zzawm = zzof.zzbi("cpil");
    private static final int zzawn = zzof.zzbi("aART");
    private static final int zzawo = zzof.zzbi("sonm");
    private static final int zzawp = zzof.zzbi("soal");
    private static final int zzawq = zzof.zzbi("soar");
    private static final int zzawr = zzof.zzbi("soaa");
    private static final int zzaws = zzof.zzbi("soco");
    private static final int zzawt = zzof.zzbi("rtng");
    private static final int zzawu = zzof.zzbi("pgap");
    private static final int zzawv = zzof.zzbi("sosn");
    private static final int zzaww = zzof.zzbi("tvsh");
    private static final int zzawx = zzof.zzbi("----");
    private static final String[] zzawy = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    public static zzkx.zza zzd(zzoc zzocVar) {
        int position = zzocVar.getPosition() + zzocVar.readInt();
        int readInt = zzocVar.readInt();
        int i = readInt >>> 24;
        zzkx.zza zzaVar = null;
        try {
            if (i == 169 || i == 65533) {
                int i2 = 16777215 & readInt;
                if (i2 == zzavx) {
                    int readInt2 = zzocVar.readInt();
                    if (zzocVar.readInt() == zzjs.zzauc) {
                        zzocVar.zzbh(8);
                        String zzbi = zzocVar.zzbi(readInt2 - 16);
                        zzaVar = new zzkz("und", zzbi, zzbi);
                    } else {
                        String valueOf = String.valueOf(zzjs.zzao(readInt));
                        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(valueOf) : new String("Failed to parse comment attribute: "));
                    }
                    return zzaVar;
                }
                if (i2 != zzavv && i2 != zzavw) {
                    if (i2 != zzawc && i2 != zzawd) {
                        if (i2 == zzavy) {
                            return zza(readInt, "TDRC", zzocVar);
                        }
                        if (i2 == zzavz) {
                            return zza(readInt, "TPE1", zzocVar);
                        }
                        if (i2 == zzawa) {
                            return zza(readInt, "TSSE", zzocVar);
                        }
                        if (i2 == zzawb) {
                            return zza(readInt, "TALB", zzocVar);
                        }
                        if (i2 == zzawe) {
                            return zza(readInt, "USLT", zzocVar);
                        }
                        if (i2 == zzawf) {
                            return zza(readInt, "TCON", zzocVar);
                        }
                        if (i2 == zzawi) {
                            return zza(readInt, "TIT1", zzocVar);
                        }
                    }
                    return zza(readInt, "TCOM", zzocVar);
                }
                return zza(readInt, "TIT2", zzocVar);
            } else if (readInt == zzawh) {
                int zze = zze(zzocVar);
                String str = (zze <= 0 || zze > zzawy.length) ? null : zzawy[zze - 1];
                if (str != null) {
                    zzaVar = new zzld("TCON", null, str);
                } else {
                    Log.w("MetadataUtil", "Failed to parse standard genre code");
                }
                return zzaVar;
            } else if (readInt == zzawj) {
                return zzb(readInt, "TPOS", zzocVar);
            } else {
                if (readInt == zzawk) {
                    return zzb(readInt, "TRCK", zzocVar);
                }
                if (readInt == zzawl) {
                    return zza(readInt, "TBPM", zzocVar, true, false);
                }
                if (readInt == zzawm) {
                    return zza(readInt, "TCMP", zzocVar, true, true);
                }
                if (readInt == zzawg) {
                    int readInt3 = zzocVar.readInt();
                    if (zzocVar.readInt() == zzjs.zzauc) {
                        int zzan = zzjs.zzan(zzocVar.readInt());
                        String str2 = zzan == 13 ? "image/jpeg" : zzan == 14 ? "image/png" : null;
                        if (str2 == null) {
                            StringBuilder sb = new StringBuilder(41);
                            sb.append("Unrecognized cover art flags: ");
                            sb.append(zzan);
                            Log.w("MetadataUtil", sb.toString());
                        } else {
                            zzocVar.zzbh(4);
                            int i3 = readInt3 - 16;
                            byte[] bArr = new byte[i3];
                            zzocVar.zze(bArr, 0, i3);
                            zzaVar = new zzky(str2, null, 3, bArr);
                        }
                    } else {
                        Log.w("MetadataUtil", "Failed to parse cover art attribute");
                    }
                    return zzaVar;
                } else if (readInt == zzawn) {
                    return zza(readInt, "TPE2", zzocVar);
                } else {
                    if (readInt == zzawo) {
                        return zza(readInt, "TSOT", zzocVar);
                    }
                    if (readInt == zzawp) {
                        return zza(readInt, "TSO2", zzocVar);
                    }
                    if (readInt == zzawq) {
                        return zza(readInt, "TSOA", zzocVar);
                    }
                    if (readInt == zzawr) {
                        return zza(readInt, "TSOP", zzocVar);
                    }
                    if (readInt == zzaws) {
                        return zza(readInt, "TSOC", zzocVar);
                    }
                    if (readInt == zzawt) {
                        return zza(readInt, "ITUNESADVISORY", zzocVar, false, false);
                    }
                    if (readInt == zzawu) {
                        return zza(readInt, "ITUNESGAPLESS", zzocVar, false, true);
                    }
                    if (readInt == zzawv) {
                        return zza(readInt, "TVSHOWSORT", zzocVar);
                    }
                    if (readInt == zzaww) {
                        return zza(readInt, "TVSHOW", zzocVar);
                    }
                    if (readInt == zzawx) {
                        String str3 = null;
                        String str4 = null;
                        int i4 = -1;
                        int i5 = -1;
                        while (zzocVar.getPosition() < position) {
                            int position2 = zzocVar.getPosition();
                            int readInt4 = zzocVar.readInt();
                            int readInt5 = zzocVar.readInt();
                            zzocVar.zzbh(4);
                            if (readInt5 == zzjs.zzaua) {
                                str3 = zzocVar.zzbi(readInt4 - 12);
                            } else if (readInt5 == zzjs.zzaub) {
                                str4 = zzocVar.zzbi(readInt4 - 12);
                            } else {
                                if (readInt5 == zzjs.zzauc) {
                                    i4 = position2;
                                    i5 = readInt4;
                                }
                                zzocVar.zzbh(readInt4 - 12);
                            }
                        }
                        if ("com.apple.iTunes".equals(str3) && "iTunSMPB".equals(str4) && i4 != -1) {
                            zzocVar.zzbg(i4);
                            zzocVar.zzbh(16);
                            zzaVar = new zzkz("und", str4, zzocVar.zzbi(i5 - 16));
                        }
                        return zzaVar;
                    }
                }
            }
            String valueOf2 = String.valueOf(zzjs.zzao(readInt));
            Log.d("MetadataUtil", valueOf2.length() != 0 ? "Skipped unknown metadata entry: ".concat(valueOf2) : new String("Skipped unknown metadata entry: "));
            return null;
        } finally {
            zzocVar.zzbg(position);
        }
    }

    private static zzld zza(int i, String str, zzoc zzocVar) {
        int readInt = zzocVar.readInt();
        if (zzocVar.readInt() == zzjs.zzauc) {
            zzocVar.zzbh(8);
            return new zzld(str, null, zzocVar.zzbi(readInt - 16));
        }
        String valueOf = String.valueOf(zzjs.zzao(i));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse text attribute: ".concat(valueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    private static zzle zza(int i, String str, zzoc zzocVar, boolean z, boolean z2) {
        int zze = zze(zzocVar);
        if (z2) {
            zze = Math.min(1, zze);
        }
        if (zze >= 0) {
            if (z) {
                return new zzld(str, null, Integer.toString(zze));
            }
            return new zzkz("und", str, Integer.toString(zze));
        }
        String valueOf = String.valueOf(zzjs.zzao(i));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(valueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    private static zzld zzb(int i, String str, zzoc zzocVar) {
        int readInt = zzocVar.readInt();
        if (zzocVar.readInt() == zzjs.zzauc && readInt >= 22) {
            zzocVar.zzbh(10);
            int readUnsignedShort = zzocVar.readUnsignedShort();
            if (readUnsignedShort > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(readUnsignedShort);
                String sb2 = sb.toString();
                int readUnsignedShort2 = zzocVar.readUnsignedShort();
                if (readUnsignedShort2 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(readUnsignedShort2);
                    sb2 = sb3.toString();
                }
                return new zzld(str, null, sb2);
            }
        }
        String valueOf2 = String.valueOf(zzjs.zzao(i));
        Log.w("MetadataUtil", valueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(valueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    private static int zze(zzoc zzocVar) {
        zzocVar.zzbh(4);
        if (zzocVar.readInt() == zzjs.zzauc) {
            zzocVar.zzbh(8);
            return zzocVar.readUnsignedByte();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
