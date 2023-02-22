package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzin;
import com.google.firebase.FirebaseError;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzjm implements zziw {
    private static final zzix zzank = new zzjl();
    private static final byte[] zzanl = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzanm = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    private static final UUID zzann = new UUID(72057594037932032L, -9223371306706625679L);
    private long zzagh;
    private final zzjp zzanc;
    private final zzjk zzano;
    private final SparseArray<zzjn> zzanp;
    private final boolean zzanq;
    private final zzoc zzanr;
    private final zzoc zzans;
    private final zzoc zzant;
    private final zzoc zzanu;
    private final zzoc zzanv;
    private final zzoc zzanw;
    private final zzoc zzanx;
    private final zzoc zzany;
    private final zzoc zzanz;
    private ByteBuffer zzaoa;
    private long zzaob;
    private long zzaoc;
    private long zzaod;
    private long zzaoe;
    private zzjn zzaof;
    private boolean zzaog;
    private int zzaoh;
    private long zzaoi;
    private boolean zzaoj;
    private long zzaok;
    private long zzaol;
    private long zzaom;
    private zznw zzaon;
    private zznw zzaoo;
    private boolean zzaop;
    private int zzaoq;
    private long zzaor;
    private long zzaos;
    private int zzaot;
    private int zzaou;
    private int[] zzaov;
    private int zzaow;
    private int zzaox;
    private int zzaoy;
    private int zzaoz;
    private boolean zzapa;
    private boolean zzapb;
    private boolean zzapc;
    private boolean zzapd;
    private byte zzape;
    private int zzapf;
    private int zzapg;
    private int zzaph;
    private boolean zzapi;
    private boolean zzapj;
    private zziy zzapk;

    public zzjm() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzag(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzah(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void release() {
    }

    private zzjm(int i) {
        this(new zzjf(), 0);
    }

    private zzjm(zzjk zzjkVar, int i) {
        this.zzaoc = -1L;
        this.zzaod = -9223372036854775807L;
        this.zzaoe = -9223372036854775807L;
        this.zzagh = -9223372036854775807L;
        this.zzaok = -1L;
        this.zzaol = -1L;
        this.zzaom = -9223372036854775807L;
        this.zzano = zzjkVar;
        zzjkVar.zza(new zzjo(this, null));
        this.zzanq = true;
        this.zzanc = new zzjp();
        this.zzanp = new SparseArray<>();
        this.zzant = new zzoc(4);
        this.zzanu = new zzoc(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzanv = new zzoc(4);
        this.zzanr = new zzoc(zznx.zzbfz);
        this.zzans = new zzoc(4);
        this.zzanw = new zzoc();
        this.zzanx = new zzoc();
        this.zzany = new zzoc(8);
        this.zzanz = new zzoc();
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final boolean zza(zziv zzivVar) throws IOException, InterruptedException {
        return new zzjq().zza(zzivVar);
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zza(zziy zziyVar) {
        this.zzapk = zziyVar;
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zzc(long j, long j2) {
        this.zzaom = -9223372036854775807L;
        this.zzaoq = 0;
        this.zzano.reset();
        this.zzanc.reset();
        zzgg();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0005 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zziw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zziv r9, com.google.android.gms.internal.ads.zzjc r10) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            r0 = 0
            r8.zzapi = r0
            r1 = 1
            r2 = 1
        L5:
            if (r2 == 0) goto L3a
            boolean r3 = r8.zzapi
            if (r3 != 0) goto L3a
            com.google.android.gms.internal.ads.zzjk r2 = r8.zzano
            boolean r2 = r2.zzb(r9)
            if (r2 == 0) goto L5
            long r3 = r9.getPosition()
            boolean r5 = r8.zzaoj
            if (r5 == 0) goto L25
            r8.zzaol = r3
            long r3 = r8.zzaok
            r10.zzamq = r3
            r8.zzaoj = r0
        L23:
            r3 = 1
            goto L37
        L25:
            boolean r3 = r8.zzaog
            if (r3 == 0) goto L36
            long r3 = r8.zzaol
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L36
            r10.zzamq = r3
            r8.zzaol = r5
            goto L23
        L36:
            r3 = 0
        L37:
            if (r3 == 0) goto L5
            return r1
        L3a:
            if (r2 == 0) goto L3d
            return r0
        L3d:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjm.zza(com.google.android.gms.internal.ads.zziv, com.google.android.gms.internal.ads.zzjc):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(int i, long j, long j2) throws zzgv {
        if (i == 160) {
            this.zzapj = false;
        } else if (i == 174) {
            this.zzaof = new zzjn(null);
        } else if (i == 187) {
            this.zzaop = false;
        } else if (i == 19899) {
            this.zzaoh = -1;
            this.zzaoi = -1L;
        } else if (i == 20533) {
            this.zzaof.zzapn = true;
        } else if (i == 21968) {
            this.zzaof.zzapu = true;
        } else if (i == 408125543) {
            long j3 = this.zzaoc;
            if (j3 != -1 && j3 != j) {
                throw new zzgv("Multiple Segment elements not supported");
            }
            this.zzaoc = j;
            this.zzaob = j2;
        } else if (i == 475249515) {
            this.zzaon = new zznw();
            this.zzaoo = new zznw();
        } else if (i == 524531317 && !this.zzaog) {
            if (this.zzanq && this.zzaok != -1) {
                this.zzaoj = true;
                return;
            }
            this.zzapk.zza(new zzje(this.zzagh));
            this.zzaog = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzai(int i) throws zzgv {
        zzjb zzjeVar;
        zznw zznwVar;
        zznw zznwVar2;
        int i2;
        int i3 = 0;
        if (i == 160) {
            if (this.zzaoq != 2) {
                return;
            }
            if (!this.zzapj) {
                this.zzaoy |= 1;
            }
            zza(this.zzanp.get(this.zzaow), this.zzaor);
            this.zzaoq = 0;
        } else if (i == 174) {
            String str = this.zzaof.zzapl;
            if ((("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) ? 1 : 1) != 0) {
                zzjn zzjnVar = this.zzaof;
                zzjnVar.zza(this.zzapk, zzjnVar.number);
                this.zzanp.put(this.zzaof.number, this.zzaof);
            }
            this.zzaof = null;
        } else if (i == 19899) {
            int i4 = this.zzaoh;
            if (i4 != -1) {
                long j = this.zzaoi;
                if (j != -1) {
                    if (i4 == 475249515) {
                        this.zzaok = j;
                        return;
                    }
                    return;
                }
            }
            throw new zzgv("Mandatory element SeekID or SeekPosition not found");
        } else if (i == 25152) {
            if (this.zzaof.zzapn) {
                if (this.zzaof.zzapp == null) {
                    throw new zzgv("Encrypted Track found but ContentEncKeyID was not found");
                }
                this.zzaof.zzaff = new zzin(new zzin.zza(zzga.zzaca, "video/webm", this.zzaof.zzapp.zzani));
            }
        } else if (i == 28032) {
            if (this.zzaof.zzapn && this.zzaof.zzapo != null) {
                throw new zzgv("Combining encryption and compression is not supported");
            }
        } else if (i == 357149030) {
            if (this.zzaod == -9223372036854775807L) {
                this.zzaod = 1000000L;
            }
            long j2 = this.zzaoe;
            if (j2 != -9223372036854775807L) {
                this.zzagh = zzdu(j2);
            }
        } else if (i != 374648427) {
            if (i == 475249515 && !this.zzaog) {
                zziy zziyVar = this.zzapk;
                if (this.zzaoc == -1 || this.zzagh == -9223372036854775807L || (zznwVar = this.zzaon) == null || zznwVar.size() == 0 || (zznwVar2 = this.zzaoo) == null || zznwVar2.size() != this.zzaon.size()) {
                    this.zzaon = null;
                    this.zzaoo = null;
                    zzjeVar = new zzje(this.zzagh);
                } else {
                    int size = this.zzaon.size();
                    int[] iArr = new int[size];
                    long[] jArr = new long[size];
                    long[] jArr2 = new long[size];
                    long[] jArr3 = new long[size];
                    for (int i5 = 0; i5 < size; i5++) {
                        jArr3[i5] = this.zzaon.get(i5);
                        jArr[i5] = this.zzaoc + this.zzaoo.get(i5);
                    }
                    while (true) {
                        i2 = size - 1;
                        if (i3 >= i2) {
                            break;
                        }
                        int i6 = i3 + 1;
                        iArr[i3] = (int) (jArr[i6] - jArr[i3]);
                        jArr2[i3] = jArr3[i6] - jArr3[i3];
                        i3 = i6;
                    }
                    iArr[i2] = (int) ((this.zzaoc + this.zzaob) - jArr[i2]);
                    jArr2[i2] = this.zzagh - jArr3[i2];
                    this.zzaon = null;
                    this.zzaoo = null;
                    zzjeVar = new zziu(iArr, jArr, jArr2, jArr3);
                }
                zziyVar.zza(zzjeVar);
                this.zzaog = true;
            }
        } else if (this.zzanp.size() == 0) {
            throw new zzgv("No valid tracks were found");
        } else {
            this.zzapk.zzge();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(int i, long j) throws zzgv {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("ContentEncodingOrder ");
            sb.append(j);
            sb.append(" not supported");
            throw new zzgv(sb.toString());
        } else if (i == 20530) {
            if (j == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingScope ");
            sb2.append(j);
            sb2.append(" not supported");
            throw new zzgv(sb2.toString());
        } else {
            switch (i) {
                case 131:
                    this.zzaof.type = (int) j;
                    return;
                case 136:
                    this.zzaof.zzaqn = j == 1;
                    return;
                case 155:
                    this.zzaos = zzdu(j);
                    return;
                case 159:
                    this.zzaof.zzafm = (int) j;
                    return;
                case 176:
                    this.zzaof.width = (int) j;
                    return;
                case 179:
                    this.zzaon.add(zzdu(j));
                    return;
                case 186:
                    this.zzaof.height = (int) j;
                    return;
                case 215:
                    this.zzaof.number = (int) j;
                    return;
                case 231:
                    this.zzaom = zzdu(j);
                    return;
                case 241:
                    if (this.zzaop) {
                        return;
                    }
                    this.zzaoo.add(j);
                    this.zzaop = true;
                    return;
                case 251:
                    this.zzapj = true;
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    StringBuilder sb3 = new StringBuilder(50);
                    sb3.append("ContentCompAlgo ");
                    sb3.append(j);
                    sb3.append(" not supported");
                    throw new zzgv(sb3.toString());
                case 17029:
                    if (j < 1 || j > 2) {
                        StringBuilder sb4 = new StringBuilder(53);
                        sb4.append("DocTypeReadVersion ");
                        sb4.append(j);
                        sb4.append(" not supported");
                        throw new zzgv(sb4.toString());
                    }
                    return;
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    StringBuilder sb5 = new StringBuilder(50);
                    sb5.append("EBMLReadVersion ");
                    sb5.append(j);
                    sb5.append(" not supported");
                    throw new zzgv(sb5.toString());
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    StringBuilder sb6 = new StringBuilder(49);
                    sb6.append("ContentEncAlgo ");
                    sb6.append(j);
                    sb6.append(" not supported");
                    throw new zzgv(sb6.toString());
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    StringBuilder sb7 = new StringBuilder(56);
                    sb7.append("AESSettingsCipherMode ");
                    sb7.append(j);
                    sb7.append(" not supported");
                    throw new zzgv(sb7.toString());
                case 21420:
                    this.zzaoi = j + this.zzaoc;
                    return;
                case 21432:
                    int i2 = (int) j;
                    if (i2 == 0) {
                        this.zzaof.zzafj = 0;
                        return;
                    } else if (i2 == 1) {
                        this.zzaof.zzafj = 2;
                        return;
                    } else if (i2 == 3) {
                        this.zzaof.zzafj = 1;
                        return;
                    } else if (i2 != 15) {
                        return;
                    } else {
                        this.zzaof.zzafj = 3;
                        return;
                    }
                case 21680:
                    this.zzaof.zzapr = (int) j;
                    return;
                case 21682:
                    this.zzaof.zzapt = (int) j;
                    return;
                case 21690:
                    this.zzaof.zzaps = (int) j;
                    return;
                case 21930:
                    this.zzaof.zzaqo = j == 1;
                    return;
                case 22186:
                    this.zzaof.zzaql = j;
                    return;
                case 22203:
                    this.zzaof.zzaqm = j;
                    return;
                case 25188:
                    this.zzaof.zzaqk = (int) j;
                    return;
                case 2352003:
                    this.zzaof.zzapm = (int) j;
                    return;
                case 2807729:
                    this.zzaod = j;
                    return;
                default:
                    switch (i) {
                        case 21945:
                            int i3 = (int) j;
                            if (i3 == 1) {
                                this.zzaof.zzapx = 2;
                                return;
                            } else if (i3 != 2) {
                                return;
                            } else {
                                this.zzaof.zzapx = 1;
                                return;
                            }
                        case 21946:
                            int i4 = (int) j;
                            if (i4 != 1) {
                                if (i4 == 16) {
                                    this.zzaof.zzapw = 6;
                                    return;
                                } else if (i4 == 18) {
                                    this.zzaof.zzapw = 7;
                                    return;
                                } else if (i4 != 6 && i4 != 7) {
                                    return;
                                }
                            }
                            this.zzaof.zzapw = 3;
                            return;
                        case 21947:
                            this.zzaof.zzapu = true;
                            int i5 = (int) j;
                            if (i5 == 1) {
                                this.zzaof.zzapv = 1;
                                return;
                            } else if (i5 == 9) {
                                this.zzaof.zzapv = 6;
                                return;
                            } else if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                this.zzaof.zzapv = 2;
                                return;
                            } else {
                                return;
                            }
                        case 21948:
                            this.zzaof.zzapy = (int) j;
                            return;
                        case 21949:
                            this.zzaof.zzapz = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(int i, double d) {
        if (i == 181) {
            this.zzaof.zzafn = (int) d;
        } else if (i == 17545) {
            this.zzaoe = (long) d;
        } else {
            switch (i) {
                case 21969:
                    this.zzaof.zzaqa = (float) d;
                    return;
                case 21970:
                    this.zzaof.zzaqb = (float) d;
                    return;
                case 21971:
                    this.zzaof.zzaqc = (float) d;
                    return;
                case 21972:
                    this.zzaof.zzaqd = (float) d;
                    return;
                case 21973:
                    this.zzaof.zzaqe = (float) d;
                    return;
                case 21974:
                    this.zzaof.zzaqf = (float) d;
                    return;
                case 21975:
                    this.zzaof.zzaqg = (float) d;
                    return;
                case 21976:
                    this.zzaof.zzaqh = (float) d;
                    return;
                case 21977:
                    this.zzaof.zzaqi = (float) d;
                    return;
                case 21978:
                    this.zzaof.zzaqj = (float) d;
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(int i, String str) throws zzgv {
        if (i == 134) {
            this.zzaof.zzapl = str;
        } else if (i != 17026) {
            if (i != 2274716) {
                return;
            }
            zzjn.zza(this.zzaof, str);
        } else if ("webm".equals(str) || "matroska".equals(str)) {
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new zzgv(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01fd, code lost:
        throw new com.google.android.gms.internal.ads.zzgv("EBML lacing sample size out of range.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(int r20, int r21, com.google.android.gms.internal.ads.zziv r22) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 695
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjm.zza(int, int, com.google.android.gms.internal.ads.zziv):void");
    }

    private final void zza(zzjn zzjnVar, long j) {
        int i;
        byte[] zzbh;
        if ("S_TEXT/UTF8".equals(zzjnVar.zzapl)) {
            byte[] bArr = this.zzanx.data;
            long j2 = this.zzaos;
            if (j2 == -9223372036854775807L) {
                zzbh = zzanm;
            } else {
                int i2 = (int) (j2 / 3600000000L);
                long j3 = j2 - (i2 * 3600000000L);
                int i3 = (int) (j3 / 60000000);
                long j4 = j3 - (60000000 * i3);
                zzbh = zzof.zzbh(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) (j4 / 1000000)), Integer.valueOf((int) ((j4 - (1000000 * i)) / 1000))));
            }
            System.arraycopy(zzbh, 0, bArr, 19, 12);
            zzjd zzjdVar = zzjnVar.zzaqp;
            zzoc zzocVar = this.zzanx;
            zzjdVar.zza(zzocVar, zzocVar.limit());
            this.zzaph += this.zzanx.limit();
        }
        zzjnVar.zzaqp.zza(j, this.zzaoy, this.zzaph, 0, zzjnVar.zzapp);
        this.zzapi = true;
        zzgg();
    }

    private final void zzgg() {
        this.zzaoz = 0;
        this.zzaph = 0;
        this.zzapg = 0;
        this.zzapa = false;
        this.zzapb = false;
        this.zzapd = false;
        this.zzapf = 0;
        this.zzape = (byte) 0;
        this.zzapc = false;
        this.zzanw.reset();
    }

    private final void zzb(zziv zzivVar, int i) throws IOException, InterruptedException {
        if (this.zzant.limit() >= i) {
            return;
        }
        if (this.zzant.capacity() < i) {
            zzoc zzocVar = this.zzant;
            zzocVar.zzb(Arrays.copyOf(zzocVar.data, Math.max(this.zzant.data.length << 1, i)), this.zzant.limit());
        }
        zzivVar.readFully(this.zzant.data, this.zzant.limit(), i - this.zzant.limit());
        this.zzant.zzbf(i);
    }

    private final void zza(zziv zzivVar, zzjn zzjnVar, int i) throws IOException, InterruptedException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzjnVar.zzapl)) {
            int length = zzanl.length + i;
            if (this.zzanx.capacity() < length) {
                this.zzanx.data = Arrays.copyOf(zzanl, length + i);
            }
            zzivVar.readFully(this.zzanx.data, zzanl.length, i);
            this.zzanx.zzbg(0);
            this.zzanx.zzbf(length);
            return;
        }
        zzjd zzjdVar = zzjnVar.zzaqp;
        if (!this.zzapa) {
            if (zzjnVar.zzapn) {
                this.zzaoy &= -1073741825;
                if (!this.zzapb) {
                    zzivVar.readFully(this.zzant.data, 0, 1);
                    this.zzaoz++;
                    if ((this.zzant.data[0] & 128) == 128) {
                        throw new zzgv("Extension bit is set in signal byte");
                    }
                    this.zzape = this.zzant.data[0];
                    this.zzapb = true;
                }
                byte b = this.zzape;
                if ((b & 1) == 1) {
                    boolean z = (b & 2) == 2;
                    this.zzaoy |= 1073741824;
                    if (!this.zzapc) {
                        zzivVar.readFully(this.zzany.data, 0, 8);
                        this.zzaoz += 8;
                        this.zzapc = true;
                        this.zzant.data[0] = (byte) ((z ? 128 : 0) | 8);
                        this.zzant.zzbg(0);
                        zzjdVar.zza(this.zzant, 1);
                        this.zzaph++;
                        this.zzany.zzbg(0);
                        zzjdVar.zza(this.zzany, 8);
                        this.zzaph += 8;
                    }
                    if (z) {
                        if (!this.zzapd) {
                            zzivVar.readFully(this.zzant.data, 0, 1);
                            this.zzaoz++;
                            this.zzant.zzbg(0);
                            this.zzapf = this.zzant.readUnsignedByte();
                            this.zzapd = true;
                        }
                        int i3 = this.zzapf << 2;
                        this.zzant.reset(i3);
                        zzivVar.readFully(this.zzant.data, 0, i3);
                        this.zzaoz += i3;
                        short s = (short) ((this.zzapf / 2) + 1);
                        int i4 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.zzaoa;
                        if (byteBuffer == null || byteBuffer.capacity() < i4) {
                            this.zzaoa = ByteBuffer.allocate(i4);
                        }
                        this.zzaoa.position(0);
                        this.zzaoa.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i2 = this.zzapf;
                            if (i5 >= i2) {
                                break;
                            }
                            int zzir = this.zzant.zzir();
                            if (i5 % 2 == 0) {
                                this.zzaoa.putShort((short) (zzir - i6));
                            } else {
                                this.zzaoa.putInt(zzir - i6);
                            }
                            i5++;
                            i6 = zzir;
                        }
                        int i7 = (i - this.zzaoz) - i6;
                        if (i2 % 2 == 1) {
                            this.zzaoa.putInt(i7);
                        } else {
                            this.zzaoa.putShort((short) i7);
                            this.zzaoa.putInt(0);
                        }
                        this.zzanz.zzb(this.zzaoa.array(), i4);
                        zzjdVar.zza(this.zzanz, i4);
                        this.zzaph += i4;
                    }
                }
            } else if (zzjnVar.zzapo != null) {
                this.zzanw.zzb(zzjnVar.zzapo, zzjnVar.zzapo.length);
            }
            this.zzapa = true;
        }
        int limit = i + this.zzanw.limit();
        if (!"V_MPEG4/ISO/AVC".equals(zzjnVar.zzapl) && !"V_MPEGH/ISO/HEVC".equals(zzjnVar.zzapl)) {
            while (true) {
                int i8 = this.zzaoz;
                if (i8 >= limit) {
                    break;
                }
                zza(zzivVar, zzjdVar, limit - i8);
            }
        } else {
            byte[] bArr = this.zzans.data;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i9 = zzjnVar.zzaqq;
            int i10 = 4 - zzjnVar.zzaqq;
            while (this.zzaoz < limit) {
                int i11 = this.zzapg;
                if (i11 == 0) {
                    int min = Math.min(i9, this.zzanw.zzim());
                    zzivVar.readFully(bArr, i10 + min, i9 - min);
                    if (min > 0) {
                        this.zzanw.zze(bArr, i10, min);
                    }
                    this.zzaoz += i9;
                    this.zzans.zzbg(0);
                    this.zzapg = this.zzans.zzir();
                    this.zzanr.zzbg(0);
                    zzjdVar.zza(this.zzanr, 4);
                    this.zzaph += 4;
                } else {
                    this.zzapg = i11 - zza(zzivVar, zzjdVar, i11);
                }
            }
        }
        if ("A_VORBIS".equals(zzjnVar.zzapl)) {
            this.zzanu.zzbg(0);
            zzjdVar.zza(this.zzanu, 4);
            this.zzaph += 4;
        }
    }

    private final int zza(zziv zzivVar, zzjd zzjdVar, int i) throws IOException, InterruptedException {
        int zza;
        int zzim = this.zzanw.zzim();
        if (zzim > 0) {
            zza = Math.min(i, zzim);
            zzjdVar.zza(this.zzanw, zza);
        } else {
            zza = zzjdVar.zza(zzivVar, i, false);
        }
        this.zzaoz += zza;
        this.zzaph += zza;
        return zza;
    }

    private final long zzdu(long j) throws zzgv {
        long j2 = this.zzaod;
        if (j2 == -9223372036854775807L) {
            throw new zzgv("Can't scale timecode prior to timecodeScale being set.");
        }
        return zzof.zza(j, j2, 1000L);
    }

    private static int[] zza(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return iArr.length >= i ? iArr : new int[Math.max(iArr.length << 1, i)];
    }
}
