package com.tencent.mm.ap.a;

public final class ag
{
  private static final int[] iAR = { 31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017 };
  private static final ag[] iAS = aMg();
  private final int iAT;
  private final int[] iAU;
  private final ai[] iAV;
  private final int iAW;

  private ag(int paramInt, int[] paramArrayOfInt, ai[] paramArrayOfai)
  {
    this.iAT = paramInt;
    this.iAU = paramArrayOfInt;
    this.iAV = paramArrayOfai;
    int j = paramArrayOfai[0].aMi();
    ah[] arrayOfah = paramArrayOfai[0].aMl();
    int k = arrayOfah.length;
    int m = 0;
    while (i < k)
    {
      ah localah = arrayOfah[i];
      m += localah.getCount() * (j + localah.aMh());
      i++;
    }
    this.iAW = m;
  }

  private static ag[] aMg()
  {
    ag[] arrayOfag = new ag[40];
    int[] arrayOfInt1 = new int[0];
    ai[] arrayOfai1 = new ai[4];
    ah[] arrayOfah1 = new ah[1];
    arrayOfah1[0] = new ah(1, 19);
    arrayOfai1[0] = new ai(7, arrayOfah1);
    ah[] arrayOfah2 = new ah[1];
    arrayOfah2[0] = new ah(1, 16);
    arrayOfai1[1] = new ai(10, arrayOfah2);
    ah[] arrayOfah3 = new ah[1];
    arrayOfah3[0] = new ah(1, 13);
    arrayOfai1[2] = new ai(13, arrayOfah3);
    ah[] arrayOfah4 = new ah[1];
    arrayOfah4[0] = new ah(1, 9);
    arrayOfai1[3] = new ai(17, arrayOfah4);
    arrayOfag[0] = new ag(1, arrayOfInt1, arrayOfai1);
    int[] arrayOfInt2 = { 6, 18 };
    ai[] arrayOfai2 = new ai[4];
    ah[] arrayOfah5 = new ah[1];
    arrayOfah5[0] = new ah(1, 34);
    arrayOfai2[0] = new ai(10, arrayOfah5);
    ah[] arrayOfah6 = new ah[1];
    arrayOfah6[0] = new ah(1, 28);
    arrayOfai2[1] = new ai(16, arrayOfah6);
    ah[] arrayOfah7 = new ah[1];
    arrayOfah7[0] = new ah(1, 22);
    arrayOfai2[2] = new ai(22, arrayOfah7);
    ah[] arrayOfah8 = new ah[1];
    arrayOfah8[0] = new ah(1, 16);
    arrayOfai2[3] = new ai(28, arrayOfah8);
    arrayOfag[1] = new ag(2, arrayOfInt2, arrayOfai2);
    int[] arrayOfInt3 = { 6, 22 };
    ai[] arrayOfai3 = new ai[4];
    ah[] arrayOfah9 = new ah[1];
    arrayOfah9[0] = new ah(1, 55);
    arrayOfai3[0] = new ai(15, arrayOfah9);
    ah[] arrayOfah10 = new ah[1];
    arrayOfah10[0] = new ah(1, 44);
    arrayOfai3[1] = new ai(26, arrayOfah10);
    ah[] arrayOfah11 = new ah[1];
    arrayOfah11[0] = new ah(2, 17);
    arrayOfai3[2] = new ai(18, arrayOfah11);
    ah[] arrayOfah12 = new ah[1];
    arrayOfah12[0] = new ah(2, 13);
    arrayOfai3[3] = new ai(22, arrayOfah12);
    arrayOfag[2] = new ag(3, arrayOfInt3, arrayOfai3);
    int[] arrayOfInt4 = { 6, 26 };
    ai[] arrayOfai4 = new ai[4];
    ah[] arrayOfah13 = new ah[1];
    arrayOfah13[0] = new ah(1, 80);
    arrayOfai4[0] = new ai(20, arrayOfah13);
    ah[] arrayOfah14 = new ah[1];
    arrayOfah14[0] = new ah(2, 32);
    arrayOfai4[1] = new ai(18, arrayOfah14);
    ah[] arrayOfah15 = new ah[1];
    arrayOfah15[0] = new ah(2, 24);
    arrayOfai4[2] = new ai(26, arrayOfah15);
    ah[] arrayOfah16 = new ah[1];
    arrayOfah16[0] = new ah(4, 9);
    arrayOfai4[3] = new ai(16, arrayOfah16);
    arrayOfag[3] = new ag(4, arrayOfInt4, arrayOfai4);
    int[] arrayOfInt5 = { 6, 30 };
    ai[] arrayOfai5 = new ai[4];
    ah[] arrayOfah17 = new ah[1];
    arrayOfah17[0] = new ah(1, 108);
    arrayOfai5[0] = new ai(26, arrayOfah17);
    ah[] arrayOfah18 = new ah[1];
    arrayOfah18[0] = new ah(2, 43);
    arrayOfai5[1] = new ai(24, arrayOfah18);
    ah[] arrayOfah19 = new ah[2];
    arrayOfah19[0] = new ah(2, 15);
    arrayOfah19[1] = new ah(2, 16);
    arrayOfai5[2] = new ai(18, arrayOfah19);
    ah[] arrayOfah20 = new ah[2];
    arrayOfah20[0] = new ah(2, 11);
    arrayOfah20[1] = new ah(2, 12);
    arrayOfai5[3] = new ai(22, arrayOfah20);
    arrayOfag[4] = new ag(5, arrayOfInt5, arrayOfai5);
    int[] arrayOfInt6 = { 6, 34 };
    ai[] arrayOfai6 = new ai[4];
    ah[] arrayOfah21 = new ah[1];
    arrayOfah21[0] = new ah(2, 68);
    arrayOfai6[0] = new ai(18, arrayOfah21);
    ah[] arrayOfah22 = new ah[1];
    arrayOfah22[0] = new ah(4, 27);
    arrayOfai6[1] = new ai(16, arrayOfah22);
    ah[] arrayOfah23 = new ah[1];
    arrayOfah23[0] = new ah(4, 19);
    arrayOfai6[2] = new ai(24, arrayOfah23);
    ah[] arrayOfah24 = new ah[1];
    arrayOfah24[0] = new ah(4, 15);
    arrayOfai6[3] = new ai(28, arrayOfah24);
    arrayOfag[5] = new ag(6, arrayOfInt6, arrayOfai6);
    int[] arrayOfInt7 = { 6, 22, 38 };
    ai[] arrayOfai7 = new ai[4];
    ah[] arrayOfah25 = new ah[1];
    arrayOfah25[0] = new ah(2, 78);
    arrayOfai7[0] = new ai(20, arrayOfah25);
    ah[] arrayOfah26 = new ah[1];
    arrayOfah26[0] = new ah(4, 31);
    arrayOfai7[1] = new ai(18, arrayOfah26);
    ah[] arrayOfah27 = new ah[2];
    arrayOfah27[0] = new ah(2, 14);
    arrayOfah27[1] = new ah(4, 15);
    arrayOfai7[2] = new ai(18, arrayOfah27);
    ah[] arrayOfah28 = new ah[2];
    arrayOfah28[0] = new ah(4, 13);
    arrayOfah28[1] = new ah(1, 14);
    arrayOfai7[3] = new ai(26, arrayOfah28);
    arrayOfag[6] = new ag(7, arrayOfInt7, arrayOfai7);
    int[] arrayOfInt8 = { 6, 24, 42 };
    ai[] arrayOfai8 = new ai[4];
    ah[] arrayOfah29 = new ah[1];
    arrayOfah29[0] = new ah(2, 97);
    arrayOfai8[0] = new ai(24, arrayOfah29);
    ah[] arrayOfah30 = new ah[2];
    arrayOfah30[0] = new ah(2, 38);
    arrayOfah30[1] = new ah(2, 39);
    arrayOfai8[1] = new ai(22, arrayOfah30);
    ah[] arrayOfah31 = new ah[2];
    arrayOfah31[0] = new ah(4, 18);
    arrayOfah31[1] = new ah(2, 19);
    arrayOfai8[2] = new ai(22, arrayOfah31);
    ah[] arrayOfah32 = new ah[2];
    arrayOfah32[0] = new ah(4, 14);
    arrayOfah32[1] = new ah(2, 15);
    arrayOfai8[3] = new ai(26, arrayOfah32);
    arrayOfag[7] = new ag(8, arrayOfInt8, arrayOfai8);
    int[] arrayOfInt9 = { 6, 26, 46 };
    ai[] arrayOfai9 = new ai[4];
    ah[] arrayOfah33 = new ah[1];
    arrayOfah33[0] = new ah(2, 116);
    arrayOfai9[0] = new ai(30, arrayOfah33);
    ah[] arrayOfah34 = new ah[2];
    arrayOfah34[0] = new ah(3, 36);
    arrayOfah34[1] = new ah(2, 37);
    arrayOfai9[1] = new ai(22, arrayOfah34);
    ah[] arrayOfah35 = new ah[2];
    arrayOfah35[0] = new ah(4, 16);
    arrayOfah35[1] = new ah(4, 17);
    arrayOfai9[2] = new ai(20, arrayOfah35);
    ah[] arrayOfah36 = new ah[2];
    arrayOfah36[0] = new ah(4, 12);
    arrayOfah36[1] = new ah(4, 13);
    arrayOfai9[3] = new ai(24, arrayOfah36);
    arrayOfag[8] = new ag(9, arrayOfInt9, arrayOfai9);
    int[] arrayOfInt10 = { 6, 28, 50 };
    ai[] arrayOfai10 = new ai[4];
    ah[] arrayOfah37 = new ah[2];
    arrayOfah37[0] = new ah(2, 68);
    arrayOfah37[1] = new ah(2, 69);
    arrayOfai10[0] = new ai(18, arrayOfah37);
    ah[] arrayOfah38 = new ah[2];
    arrayOfah38[0] = new ah(4, 43);
    arrayOfah38[1] = new ah(1, 44);
    arrayOfai10[1] = new ai(26, arrayOfah38);
    ah[] arrayOfah39 = new ah[2];
    arrayOfah39[0] = new ah(6, 19);
    arrayOfah39[1] = new ah(2, 20);
    arrayOfai10[2] = new ai(24, arrayOfah39);
    ah[] arrayOfah40 = new ah[2];
    arrayOfah40[0] = new ah(6, 15);
    arrayOfah40[1] = new ah(2, 16);
    arrayOfai10[3] = new ai(28, arrayOfah40);
    arrayOfag[9] = new ag(10, arrayOfInt10, arrayOfai10);
    int[] arrayOfInt11 = { 6, 30, 54 };
    ai[] arrayOfai11 = new ai[4];
    ah[] arrayOfah41 = new ah[1];
    arrayOfah41[0] = new ah(4, 81);
    arrayOfai11[0] = new ai(20, arrayOfah41);
    ah[] arrayOfah42 = new ah[2];
    arrayOfah42[0] = new ah(1, 50);
    arrayOfah42[1] = new ah(4, 51);
    arrayOfai11[1] = new ai(30, arrayOfah42);
    ah[] arrayOfah43 = new ah[2];
    arrayOfah43[0] = new ah(4, 22);
    arrayOfah43[1] = new ah(4, 23);
    arrayOfai11[2] = new ai(28, arrayOfah43);
    ah[] arrayOfah44 = new ah[2];
    arrayOfah44[0] = new ah(3, 12);
    arrayOfah44[1] = new ah(8, 13);
    arrayOfai11[3] = new ai(24, arrayOfah44);
    arrayOfag[10] = new ag(11, arrayOfInt11, arrayOfai11);
    int[] arrayOfInt12 = { 6, 32, 58 };
    ai[] arrayOfai12 = new ai[4];
    ah[] arrayOfah45 = new ah[2];
    arrayOfah45[0] = new ah(2, 92);
    arrayOfah45[1] = new ah(2, 93);
    arrayOfai12[0] = new ai(24, arrayOfah45);
    ah[] arrayOfah46 = new ah[2];
    arrayOfah46[0] = new ah(6, 36);
    arrayOfah46[1] = new ah(2, 37);
    arrayOfai12[1] = new ai(22, arrayOfah46);
    ah[] arrayOfah47 = new ah[2];
    arrayOfah47[0] = new ah(4, 20);
    arrayOfah47[1] = new ah(6, 21);
    arrayOfai12[2] = new ai(26, arrayOfah47);
    ah[] arrayOfah48 = new ah[2];
    arrayOfah48[0] = new ah(7, 14);
    arrayOfah48[1] = new ah(4, 15);
    arrayOfai12[3] = new ai(28, arrayOfah48);
    arrayOfag[11] = new ag(12, arrayOfInt12, arrayOfai12);
    int[] arrayOfInt13 = { 6, 34, 62 };
    ai[] arrayOfai13 = new ai[4];
    ah[] arrayOfah49 = new ah[1];
    arrayOfah49[0] = new ah(4, 107);
    arrayOfai13[0] = new ai(26, arrayOfah49);
    ah[] arrayOfah50 = new ah[2];
    arrayOfah50[0] = new ah(8, 37);
    arrayOfah50[1] = new ah(1, 38);
    arrayOfai13[1] = new ai(22, arrayOfah50);
    ah[] arrayOfah51 = new ah[2];
    arrayOfah51[0] = new ah(8, 20);
    arrayOfah51[1] = new ah(4, 21);
    arrayOfai13[2] = new ai(24, arrayOfah51);
    ah[] arrayOfah52 = new ah[2];
    arrayOfah52[0] = new ah(12, 11);
    arrayOfah52[1] = new ah(4, 12);
    arrayOfai13[3] = new ai(22, arrayOfah52);
    arrayOfag[12] = new ag(13, arrayOfInt13, arrayOfai13);
    int[] arrayOfInt14 = { 6, 26, 46, 66 };
    ai[] arrayOfai14 = new ai[4];
    ah[] arrayOfah53 = new ah[2];
    arrayOfah53[0] = new ah(3, 115);
    arrayOfah53[1] = new ah(1, 116);
    arrayOfai14[0] = new ai(30, arrayOfah53);
    ah[] arrayOfah54 = new ah[2];
    arrayOfah54[0] = new ah(4, 40);
    arrayOfah54[1] = new ah(5, 41);
    arrayOfai14[1] = new ai(24, arrayOfah54);
    ah[] arrayOfah55 = new ah[2];
    arrayOfah55[0] = new ah(11, 16);
    arrayOfah55[1] = new ah(5, 17);
    arrayOfai14[2] = new ai(20, arrayOfah55);
    ah[] arrayOfah56 = new ah[2];
    arrayOfah56[0] = new ah(11, 12);
    arrayOfah56[1] = new ah(5, 13);
    arrayOfai14[3] = new ai(24, arrayOfah56);
    arrayOfag[13] = new ag(14, arrayOfInt14, arrayOfai14);
    int[] arrayOfInt15 = { 6, 26, 48, 70 };
    ai[] arrayOfai15 = new ai[4];
    ah[] arrayOfah57 = new ah[2];
    arrayOfah57[0] = new ah(5, 87);
    arrayOfah57[1] = new ah(1, 88);
    arrayOfai15[0] = new ai(22, arrayOfah57);
    ah[] arrayOfah58 = new ah[2];
    arrayOfah58[0] = new ah(5, 41);
    arrayOfah58[1] = new ah(5, 42);
    arrayOfai15[1] = new ai(24, arrayOfah58);
    ah[] arrayOfah59 = new ah[2];
    arrayOfah59[0] = new ah(5, 24);
    arrayOfah59[1] = new ah(7, 25);
    arrayOfai15[2] = new ai(30, arrayOfah59);
    ah[] arrayOfah60 = new ah[2];
    arrayOfah60[0] = new ah(11, 12);
    arrayOfah60[1] = new ah(7, 13);
    arrayOfai15[3] = new ai(24, arrayOfah60);
    arrayOfag[14] = new ag(15, arrayOfInt15, arrayOfai15);
    int[] arrayOfInt16 = { 6, 26, 50, 74 };
    ai[] arrayOfai16 = new ai[4];
    ah[] arrayOfah61 = new ah[2];
    arrayOfah61[0] = new ah(5, 98);
    arrayOfah61[1] = new ah(1, 99);
    arrayOfai16[0] = new ai(24, arrayOfah61);
    ah[] arrayOfah62 = new ah[2];
    arrayOfah62[0] = new ah(7, 45);
    arrayOfah62[1] = new ah(3, 46);
    arrayOfai16[1] = new ai(28, arrayOfah62);
    ah[] arrayOfah63 = new ah[2];
    arrayOfah63[0] = new ah(15, 19);
    arrayOfah63[1] = new ah(2, 20);
    arrayOfai16[2] = new ai(24, arrayOfah63);
    ah[] arrayOfah64 = new ah[2];
    arrayOfah64[0] = new ah(3, 15);
    arrayOfah64[1] = new ah(13, 16);
    arrayOfai16[3] = new ai(30, arrayOfah64);
    arrayOfag[15] = new ag(16, arrayOfInt16, arrayOfai16);
    int[] arrayOfInt17 = { 6, 30, 54, 78 };
    ai[] arrayOfai17 = new ai[4];
    ah[] arrayOfah65 = new ah[2];
    arrayOfah65[0] = new ah(1, 107);
    arrayOfah65[1] = new ah(5, 108);
    arrayOfai17[0] = new ai(28, arrayOfah65);
    ah[] arrayOfah66 = new ah[2];
    arrayOfah66[0] = new ah(10, 46);
    arrayOfah66[1] = new ah(1, 47);
    arrayOfai17[1] = new ai(28, arrayOfah66);
    ah[] arrayOfah67 = new ah[2];
    arrayOfah67[0] = new ah(1, 22);
    arrayOfah67[1] = new ah(15, 23);
    arrayOfai17[2] = new ai(28, arrayOfah67);
    ah[] arrayOfah68 = new ah[2];
    arrayOfah68[0] = new ah(2, 14);
    arrayOfah68[1] = new ah(17, 15);
    arrayOfai17[3] = new ai(28, arrayOfah68);
    arrayOfag[16] = new ag(17, arrayOfInt17, arrayOfai17);
    int[] arrayOfInt18 = { 6, 30, 56, 82 };
    ai[] arrayOfai18 = new ai[4];
    ah[] arrayOfah69 = new ah[2];
    arrayOfah69[0] = new ah(5, 120);
    arrayOfah69[1] = new ah(1, 121);
    arrayOfai18[0] = new ai(30, arrayOfah69);
    ah[] arrayOfah70 = new ah[2];
    arrayOfah70[0] = new ah(9, 43);
    arrayOfah70[1] = new ah(4, 44);
    arrayOfai18[1] = new ai(26, arrayOfah70);
    ah[] arrayOfah71 = new ah[2];
    arrayOfah71[0] = new ah(17, 22);
    arrayOfah71[1] = new ah(1, 23);
    arrayOfai18[2] = new ai(28, arrayOfah71);
    ah[] arrayOfah72 = new ah[2];
    arrayOfah72[0] = new ah(2, 14);
    arrayOfah72[1] = new ah(19, 15);
    arrayOfai18[3] = new ai(28, arrayOfah72);
    arrayOfag[17] = new ag(18, arrayOfInt18, arrayOfai18);
    int[] arrayOfInt19 = { 6, 30, 58, 86 };
    ai[] arrayOfai19 = new ai[4];
    ah[] arrayOfah73 = new ah[2];
    arrayOfah73[0] = new ah(3, 113);
    arrayOfah73[1] = new ah(4, 114);
    arrayOfai19[0] = new ai(28, arrayOfah73);
    ah[] arrayOfah74 = new ah[2];
    arrayOfah74[0] = new ah(3, 44);
    arrayOfah74[1] = new ah(11, 45);
    arrayOfai19[1] = new ai(26, arrayOfah74);
    ah[] arrayOfah75 = new ah[2];
    arrayOfah75[0] = new ah(17, 21);
    arrayOfah75[1] = new ah(4, 22);
    arrayOfai19[2] = new ai(26, arrayOfah75);
    ah[] arrayOfah76 = new ah[2];
    arrayOfah76[0] = new ah(9, 13);
    arrayOfah76[1] = new ah(16, 14);
    arrayOfai19[3] = new ai(26, arrayOfah76);
    arrayOfag[18] = new ag(19, arrayOfInt19, arrayOfai19);
    int[] arrayOfInt20 = { 6, 34, 62, 90 };
    ai[] arrayOfai20 = new ai[4];
    ah[] arrayOfah77 = new ah[2];
    arrayOfah77[0] = new ah(3, 107);
    arrayOfah77[1] = new ah(5, 108);
    arrayOfai20[0] = new ai(28, arrayOfah77);
    ah[] arrayOfah78 = new ah[2];
    arrayOfah78[0] = new ah(3, 41);
    arrayOfah78[1] = new ah(13, 42);
    arrayOfai20[1] = new ai(26, arrayOfah78);
    ah[] arrayOfah79 = new ah[2];
    arrayOfah79[0] = new ah(15, 24);
    arrayOfah79[1] = new ah(5, 25);
    arrayOfai20[2] = new ai(30, arrayOfah79);
    ah[] arrayOfah80 = new ah[2];
    arrayOfah80[0] = new ah(15, 15);
    arrayOfah80[1] = new ah(10, 16);
    arrayOfai20[3] = new ai(28, arrayOfah80);
    arrayOfag[19] = new ag(20, arrayOfInt20, arrayOfai20);
    int[] arrayOfInt21 = { 6, 28, 50, 72, 94 };
    ai[] arrayOfai21 = new ai[4];
    ah[] arrayOfah81 = new ah[2];
    arrayOfah81[0] = new ah(4, 116);
    arrayOfah81[1] = new ah(4, 117);
    arrayOfai21[0] = new ai(28, arrayOfah81);
    ah[] arrayOfah82 = new ah[1];
    arrayOfah82[0] = new ah(17, 42);
    arrayOfai21[1] = new ai(26, arrayOfah82);
    ah[] arrayOfah83 = new ah[2];
    arrayOfah83[0] = new ah(17, 22);
    arrayOfah83[1] = new ah(6, 23);
    arrayOfai21[2] = new ai(28, arrayOfah83);
    ah[] arrayOfah84 = new ah[2];
    arrayOfah84[0] = new ah(19, 16);
    arrayOfah84[1] = new ah(6, 17);
    arrayOfai21[3] = new ai(30, arrayOfah84);
    arrayOfag[20] = new ag(21, arrayOfInt21, arrayOfai21);
    int[] arrayOfInt22 = { 6, 26, 50, 74, 98 };
    ai[] arrayOfai22 = new ai[4];
    ah[] arrayOfah85 = new ah[2];
    arrayOfah85[0] = new ah(2, 111);
    arrayOfah85[1] = new ah(7, 112);
    arrayOfai22[0] = new ai(28, arrayOfah85);
    ah[] arrayOfah86 = new ah[1];
    arrayOfah86[0] = new ah(17, 46);
    arrayOfai22[1] = new ai(28, arrayOfah86);
    ah[] arrayOfah87 = new ah[2];
    arrayOfah87[0] = new ah(7, 24);
    arrayOfah87[1] = new ah(16, 25);
    arrayOfai22[2] = new ai(30, arrayOfah87);
    ah[] arrayOfah88 = new ah[1];
    arrayOfah88[0] = new ah(34, 13);
    arrayOfai22[3] = new ai(24, arrayOfah88);
    arrayOfag[21] = new ag(22, arrayOfInt22, arrayOfai22);
    int[] arrayOfInt23 = { 6, 30, 54, 78, 102 };
    ai[] arrayOfai23 = new ai[4];
    ah[] arrayOfah89 = new ah[2];
    arrayOfah89[0] = new ah(4, 121);
    arrayOfah89[1] = new ah(5, 122);
    arrayOfai23[0] = new ai(30, arrayOfah89);
    ah[] arrayOfah90 = new ah[2];
    arrayOfah90[0] = new ah(4, 47);
    arrayOfah90[1] = new ah(14, 48);
    arrayOfai23[1] = new ai(28, arrayOfah90);
    ah[] arrayOfah91 = new ah[2];
    arrayOfah91[0] = new ah(11, 24);
    arrayOfah91[1] = new ah(14, 25);
    arrayOfai23[2] = new ai(30, arrayOfah91);
    ah[] arrayOfah92 = new ah[2];
    arrayOfah92[0] = new ah(16, 15);
    arrayOfah92[1] = new ah(14, 16);
    arrayOfai23[3] = new ai(30, arrayOfah92);
    arrayOfag[22] = new ag(23, arrayOfInt23, arrayOfai23);
    int[] arrayOfInt24 = { 6, 28, 54, 80, 106 };
    ai[] arrayOfai24 = new ai[4];
    ah[] arrayOfah93 = new ah[2];
    arrayOfah93[0] = new ah(6, 117);
    arrayOfah93[1] = new ah(4, 118);
    arrayOfai24[0] = new ai(30, arrayOfah93);
    ah[] arrayOfah94 = new ah[2];
    arrayOfah94[0] = new ah(6, 45);
    arrayOfah94[1] = new ah(14, 46);
    arrayOfai24[1] = new ai(28, arrayOfah94);
    ah[] arrayOfah95 = new ah[2];
    arrayOfah95[0] = new ah(11, 24);
    arrayOfah95[1] = new ah(16, 25);
    arrayOfai24[2] = new ai(30, arrayOfah95);
    ah[] arrayOfah96 = new ah[2];
    arrayOfah96[0] = new ah(30, 16);
    arrayOfah96[1] = new ah(2, 17);
    arrayOfai24[3] = new ai(30, arrayOfah96);
    arrayOfag[23] = new ag(24, arrayOfInt24, arrayOfai24);
    int[] arrayOfInt25 = { 6, 32, 58, 84, 110 };
    ai[] arrayOfai25 = new ai[4];
    ah[] arrayOfah97 = new ah[2];
    arrayOfah97[0] = new ah(8, 106);
    arrayOfah97[1] = new ah(4, 107);
    arrayOfai25[0] = new ai(26, arrayOfah97);
    ah[] arrayOfah98 = new ah[2];
    arrayOfah98[0] = new ah(8, 47);
    arrayOfah98[1] = new ah(13, 48);
    arrayOfai25[1] = new ai(28, arrayOfah98);
    ah[] arrayOfah99 = new ah[2];
    arrayOfah99[0] = new ah(7, 24);
    arrayOfah99[1] = new ah(22, 25);
    arrayOfai25[2] = new ai(30, arrayOfah99);
    ah[] arrayOfah100 = new ah[2];
    arrayOfah100[0] = new ah(22, 15);
    arrayOfah100[1] = new ah(13, 16);
    arrayOfai25[3] = new ai(30, arrayOfah100);
    arrayOfag[24] = new ag(25, arrayOfInt25, arrayOfai25);
    int[] arrayOfInt26 = { 6, 30, 58, 86, 114 };
    ai[] arrayOfai26 = new ai[4];
    ah[] arrayOfah101 = new ah[2];
    arrayOfah101[0] = new ah(10, 114);
    arrayOfah101[1] = new ah(2, 115);
    arrayOfai26[0] = new ai(28, arrayOfah101);
    ah[] arrayOfah102 = new ah[2];
    arrayOfah102[0] = new ah(19, 46);
    arrayOfah102[1] = new ah(4, 47);
    arrayOfai26[1] = new ai(28, arrayOfah102);
    ah[] arrayOfah103 = new ah[2];
    arrayOfah103[0] = new ah(28, 22);
    arrayOfah103[1] = new ah(6, 23);
    arrayOfai26[2] = new ai(28, arrayOfah103);
    ah[] arrayOfah104 = new ah[2];
    arrayOfah104[0] = new ah(33, 16);
    arrayOfah104[1] = new ah(4, 17);
    arrayOfai26[3] = new ai(30, arrayOfah104);
    arrayOfag[25] = new ag(26, arrayOfInt26, arrayOfai26);
    int[] arrayOfInt27 = { 6, 34, 62, 90, 118 };
    ai[] arrayOfai27 = new ai[4];
    ah[] arrayOfah105 = new ah[2];
    arrayOfah105[0] = new ah(8, 122);
    arrayOfah105[1] = new ah(4, 123);
    arrayOfai27[0] = new ai(30, arrayOfah105);
    ah[] arrayOfah106 = new ah[2];
    arrayOfah106[0] = new ah(22, 45);
    arrayOfah106[1] = new ah(3, 46);
    arrayOfai27[1] = new ai(28, arrayOfah106);
    ah[] arrayOfah107 = new ah[2];
    arrayOfah107[0] = new ah(8, 23);
    arrayOfah107[1] = new ah(26, 24);
    arrayOfai27[2] = new ai(30, arrayOfah107);
    ah[] arrayOfah108 = new ah[2];
    arrayOfah108[0] = new ah(12, 15);
    arrayOfah108[1] = new ah(28, 16);
    arrayOfai27[3] = new ai(30, arrayOfah108);
    arrayOfag[26] = new ag(27, arrayOfInt27, arrayOfai27);
    int[] arrayOfInt28 = { 6, 26, 50, 74, 98, 122 };
    ai[] arrayOfai28 = new ai[4];
    ah[] arrayOfah109 = new ah[2];
    arrayOfah109[0] = new ah(3, 117);
    arrayOfah109[1] = new ah(10, 118);
    arrayOfai28[0] = new ai(30, arrayOfah109);
    ah[] arrayOfah110 = new ah[2];
    arrayOfah110[0] = new ah(3, 45);
    arrayOfah110[1] = new ah(23, 46);
    arrayOfai28[1] = new ai(28, arrayOfah110);
    ah[] arrayOfah111 = new ah[2];
    arrayOfah111[0] = new ah(4, 24);
    arrayOfah111[1] = new ah(31, 25);
    arrayOfai28[2] = new ai(30, arrayOfah111);
    ah[] arrayOfah112 = new ah[2];
    arrayOfah112[0] = new ah(11, 15);
    arrayOfah112[1] = new ah(31, 16);
    arrayOfai28[3] = new ai(30, arrayOfah112);
    arrayOfag[27] = new ag(28, arrayOfInt28, arrayOfai28);
    int[] arrayOfInt29 = { 6, 30, 54, 78, 102, 126 };
    ai[] arrayOfai29 = new ai[4];
    ah[] arrayOfah113 = new ah[2];
    arrayOfah113[0] = new ah(7, 116);
    arrayOfah113[1] = new ah(7, 117);
    arrayOfai29[0] = new ai(30, arrayOfah113);
    ah[] arrayOfah114 = new ah[2];
    arrayOfah114[0] = new ah(21, 45);
    arrayOfah114[1] = new ah(7, 46);
    arrayOfai29[1] = new ai(28, arrayOfah114);
    ah[] arrayOfah115 = new ah[2];
    arrayOfah115[0] = new ah(1, 23);
    arrayOfah115[1] = new ah(37, 24);
    arrayOfai29[2] = new ai(30, arrayOfah115);
    ah[] arrayOfah116 = new ah[2];
    arrayOfah116[0] = new ah(19, 15);
    arrayOfah116[1] = new ah(26, 16);
    arrayOfai29[3] = new ai(30, arrayOfah116);
    arrayOfag[28] = new ag(29, arrayOfInt29, arrayOfai29);
    int[] arrayOfInt30 = { 6, 26, 52, 78, 104, 130 };
    ai[] arrayOfai30 = new ai[4];
    ah[] arrayOfah117 = new ah[2];
    arrayOfah117[0] = new ah(5, 115);
    arrayOfah117[1] = new ah(10, 116);
    arrayOfai30[0] = new ai(30, arrayOfah117);
    ah[] arrayOfah118 = new ah[2];
    arrayOfah118[0] = new ah(19, 47);
    arrayOfah118[1] = new ah(10, 48);
    arrayOfai30[1] = new ai(28, arrayOfah118);
    ah[] arrayOfah119 = new ah[2];
    arrayOfah119[0] = new ah(15, 24);
    arrayOfah119[1] = new ah(25, 25);
    arrayOfai30[2] = new ai(30, arrayOfah119);
    ah[] arrayOfah120 = new ah[2];
    arrayOfah120[0] = new ah(23, 15);
    arrayOfah120[1] = new ah(25, 16);
    arrayOfai30[3] = new ai(30, arrayOfah120);
    arrayOfag[29] = new ag(30, arrayOfInt30, arrayOfai30);
    int[] arrayOfInt31 = { 6, 30, 56, 82, 108, 134 };
    ai[] arrayOfai31 = new ai[4];
    ah[] arrayOfah121 = new ah[2];
    arrayOfah121[0] = new ah(13, 115);
    arrayOfah121[1] = new ah(3, 116);
    arrayOfai31[0] = new ai(30, arrayOfah121);
    ah[] arrayOfah122 = new ah[2];
    arrayOfah122[0] = new ah(2, 46);
    arrayOfah122[1] = new ah(29, 47);
    arrayOfai31[1] = new ai(28, arrayOfah122);
    ah[] arrayOfah123 = new ah[2];
    arrayOfah123[0] = new ah(42, 24);
    arrayOfah123[1] = new ah(1, 25);
    arrayOfai31[2] = new ai(30, arrayOfah123);
    ah[] arrayOfah124 = new ah[2];
    arrayOfah124[0] = new ah(23, 15);
    arrayOfah124[1] = new ah(28, 16);
    arrayOfai31[3] = new ai(30, arrayOfah124);
    arrayOfag[30] = new ag(31, arrayOfInt31, arrayOfai31);
    int[] arrayOfInt32 = { 6, 34, 60, 86, 112, 138 };
    ai[] arrayOfai32 = new ai[4];
    ah[] arrayOfah125 = new ah[1];
    arrayOfah125[0] = new ah(17, 115);
    arrayOfai32[0] = new ai(30, arrayOfah125);
    ah[] arrayOfah126 = new ah[2];
    arrayOfah126[0] = new ah(10, 46);
    arrayOfah126[1] = new ah(23, 47);
    arrayOfai32[1] = new ai(28, arrayOfah126);
    ah[] arrayOfah127 = new ah[2];
    arrayOfah127[0] = new ah(10, 24);
    arrayOfah127[1] = new ah(35, 25);
    arrayOfai32[2] = new ai(30, arrayOfah127);
    ah[] arrayOfah128 = new ah[2];
    arrayOfah128[0] = new ah(19, 15);
    arrayOfah128[1] = new ah(35, 16);
    arrayOfai32[3] = new ai(30, arrayOfah128);
    arrayOfag[31] = new ag(32, arrayOfInt32, arrayOfai32);
    int[] arrayOfInt33 = { 6, 30, 58, 86, 114, 142 };
    ai[] arrayOfai33 = new ai[4];
    ah[] arrayOfah129 = new ah[2];
    arrayOfah129[0] = new ah(17, 115);
    arrayOfah129[1] = new ah(1, 116);
    arrayOfai33[0] = new ai(30, arrayOfah129);
    ah[] arrayOfah130 = new ah[2];
    arrayOfah130[0] = new ah(14, 46);
    arrayOfah130[1] = new ah(21, 47);
    arrayOfai33[1] = new ai(28, arrayOfah130);
    ah[] arrayOfah131 = new ah[2];
    arrayOfah131[0] = new ah(29, 24);
    arrayOfah131[1] = new ah(19, 25);
    arrayOfai33[2] = new ai(30, arrayOfah131);
    ah[] arrayOfah132 = new ah[2];
    arrayOfah132[0] = new ah(11, 15);
    arrayOfah132[1] = new ah(46, 16);
    arrayOfai33[3] = new ai(30, arrayOfah132);
    arrayOfag[32] = new ag(33, arrayOfInt33, arrayOfai33);
    int[] arrayOfInt34 = { 6, 34, 62, 90, 118, 146 };
    ai[] arrayOfai34 = new ai[4];
    ah[] arrayOfah133 = new ah[2];
    arrayOfah133[0] = new ah(13, 115);
    arrayOfah133[1] = new ah(6, 116);
    arrayOfai34[0] = new ai(30, arrayOfah133);
    ah[] arrayOfah134 = new ah[2];
    arrayOfah134[0] = new ah(14, 46);
    arrayOfah134[1] = new ah(23, 47);
    arrayOfai34[1] = new ai(28, arrayOfah134);
    ah[] arrayOfah135 = new ah[2];
    arrayOfah135[0] = new ah(44, 24);
    arrayOfah135[1] = new ah(7, 25);
    arrayOfai34[2] = new ai(30, arrayOfah135);
    ah[] arrayOfah136 = new ah[2];
    arrayOfah136[0] = new ah(59, 16);
    arrayOfah136[1] = new ah(1, 17);
    arrayOfai34[3] = new ai(30, arrayOfah136);
    arrayOfag[33] = new ag(34, arrayOfInt34, arrayOfai34);
    int[] arrayOfInt35 = { 6, 30, 54, 78, 102, 126, 150 };
    ai[] arrayOfai35 = new ai[4];
    ah[] arrayOfah137 = new ah[2];
    arrayOfah137[0] = new ah(12, 121);
    arrayOfah137[1] = new ah(7, 122);
    arrayOfai35[0] = new ai(30, arrayOfah137);
    ah[] arrayOfah138 = new ah[2];
    arrayOfah138[0] = new ah(12, 47);
    arrayOfah138[1] = new ah(26, 48);
    arrayOfai35[1] = new ai(28, arrayOfah138);
    ah[] arrayOfah139 = new ah[2];
    arrayOfah139[0] = new ah(39, 24);
    arrayOfah139[1] = new ah(14, 25);
    arrayOfai35[2] = new ai(30, arrayOfah139);
    ah[] arrayOfah140 = new ah[2];
    arrayOfah140[0] = new ah(22, 15);
    arrayOfah140[1] = new ah(41, 16);
    arrayOfai35[3] = new ai(30, arrayOfah140);
    arrayOfag[34] = new ag(35, arrayOfInt35, arrayOfai35);
    int[] arrayOfInt36 = { 6, 24, 50, 76, 102, 128, 154 };
    ai[] arrayOfai36 = new ai[4];
    ah[] arrayOfah141 = new ah[2];
    arrayOfah141[0] = new ah(6, 121);
    arrayOfah141[1] = new ah(14, 122);
    arrayOfai36[0] = new ai(30, arrayOfah141);
    ah[] arrayOfah142 = new ah[2];
    arrayOfah142[0] = new ah(6, 47);
    arrayOfah142[1] = new ah(34, 48);
    arrayOfai36[1] = new ai(28, arrayOfah142);
    ah[] arrayOfah143 = new ah[2];
    arrayOfah143[0] = new ah(46, 24);
    arrayOfah143[1] = new ah(10, 25);
    arrayOfai36[2] = new ai(30, arrayOfah143);
    ah[] arrayOfah144 = new ah[2];
    arrayOfah144[0] = new ah(2, 15);
    arrayOfah144[1] = new ah(64, 16);
    arrayOfai36[3] = new ai(30, arrayOfah144);
    arrayOfag[35] = new ag(36, arrayOfInt36, arrayOfai36);
    int[] arrayOfInt37 = { 6, 28, 54, 80, 106, 132, 158 };
    ai[] arrayOfai37 = new ai[4];
    ah[] arrayOfah145 = new ah[2];
    arrayOfah145[0] = new ah(17, 122);
    arrayOfah145[1] = new ah(4, 123);
    arrayOfai37[0] = new ai(30, arrayOfah145);
    ah[] arrayOfah146 = new ah[2];
    arrayOfah146[0] = new ah(29, 46);
    arrayOfah146[1] = new ah(14, 47);
    arrayOfai37[1] = new ai(28, arrayOfah146);
    ah[] arrayOfah147 = new ah[2];
    arrayOfah147[0] = new ah(49, 24);
    arrayOfah147[1] = new ah(10, 25);
    arrayOfai37[2] = new ai(30, arrayOfah147);
    ah[] arrayOfah148 = new ah[2];
    arrayOfah148[0] = new ah(24, 15);
    arrayOfah148[1] = new ah(46, 16);
    arrayOfai37[3] = new ai(30, arrayOfah148);
    arrayOfag[36] = new ag(37, arrayOfInt37, arrayOfai37);
    int[] arrayOfInt38 = { 6, 32, 58, 84, 110, 136, 162 };
    ai[] arrayOfai38 = new ai[4];
    ah[] arrayOfah149 = new ah[2];
    arrayOfah149[0] = new ah(4, 122);
    arrayOfah149[1] = new ah(18, 123);
    arrayOfai38[0] = new ai(30, arrayOfah149);
    ah[] arrayOfah150 = new ah[2];
    arrayOfah150[0] = new ah(13, 46);
    arrayOfah150[1] = new ah(32, 47);
    arrayOfai38[1] = new ai(28, arrayOfah150);
    ah[] arrayOfah151 = new ah[2];
    arrayOfah151[0] = new ah(48, 24);
    arrayOfah151[1] = new ah(14, 25);
    arrayOfai38[2] = new ai(30, arrayOfah151);
    ah[] arrayOfah152 = new ah[2];
    arrayOfah152[0] = new ah(42, 15);
    arrayOfah152[1] = new ah(32, 16);
    arrayOfai38[3] = new ai(30, arrayOfah152);
    arrayOfag[37] = new ag(38, arrayOfInt38, arrayOfai38);
    int[] arrayOfInt39 = { 6, 26, 54, 82, 110, 138, 166 };
    ai[] arrayOfai39 = new ai[4];
    ah[] arrayOfah153 = new ah[2];
    arrayOfah153[0] = new ah(20, 117);
    arrayOfah153[1] = new ah(4, 118);
    arrayOfai39[0] = new ai(30, arrayOfah153);
    ah[] arrayOfah154 = new ah[2];
    arrayOfah154[0] = new ah(40, 47);
    arrayOfah154[1] = new ah(7, 48);
    arrayOfai39[1] = new ai(28, arrayOfah154);
    ah[] arrayOfah155 = new ah[2];
    arrayOfah155[0] = new ah(43, 24);
    arrayOfah155[1] = new ah(22, 25);
    arrayOfai39[2] = new ai(30, arrayOfah155);
    ah[] arrayOfah156 = new ah[2];
    arrayOfah156[0] = new ah(10, 15);
    arrayOfah156[1] = new ah(67, 16);
    arrayOfai39[3] = new ai(30, arrayOfah156);
    arrayOfag[38] = new ag(39, arrayOfInt39, arrayOfai39);
    int[] arrayOfInt40 = { 6, 30, 58, 86, 114, 142, 170 };
    ai[] arrayOfai40 = new ai[4];
    ah[] arrayOfah157 = new ah[2];
    arrayOfah157[0] = new ah(19, 118);
    arrayOfah157[1] = new ah(6, 119);
    arrayOfai40[0] = new ai(30, arrayOfah157);
    ah[] arrayOfah158 = new ah[2];
    arrayOfah158[0] = new ah(18, 47);
    arrayOfah158[1] = new ah(31, 48);
    arrayOfai40[1] = new ai(28, arrayOfah158);
    ah[] arrayOfah159 = new ah[2];
    arrayOfah159[0] = new ah(34, 24);
    arrayOfah159[1] = new ah(34, 25);
    arrayOfai40[2] = new ai(30, arrayOfah159);
    ah[] arrayOfah160 = new ah[2];
    arrayOfah160[0] = new ah(20, 15);
    arrayOfah160[1] = new ah(61, 16);
    arrayOfai40[3] = new ai(30, arrayOfah160);
    arrayOfag[39] = new ag(40, arrayOfInt40, arrayOfai40);
    return arrayOfag;
  }

  public static ag on(int paramInt)
  {
    if ((paramInt <= 0) || (paramInt > 40))
      throw new IllegalArgumentException();
    return iAS[(paramInt - 1)];
  }

  public final int aMd()
  {
    return this.iAT;
  }

  public final int aMe()
  {
    return this.iAW;
  }

  public final int aMf()
  {
    return 17 + 4 * this.iAT;
  }

  public final ai b(o paramo)
  {
    return this.iAV[paramo.ordinal()];
  }

  public final String toString()
  {
    return String.valueOf(this.iAT);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ap.a.ag
 * JD-Core Version:    0.6.2
 */