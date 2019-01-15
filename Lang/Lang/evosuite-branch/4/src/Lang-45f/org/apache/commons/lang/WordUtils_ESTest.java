/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 13:19:00 GMT 2019
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang.WordUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WordUtils_ESTest extends WordUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = WordUtils.capitalize("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = WordUtils.initials("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = WordUtils.wrap("]", 7);
      assertNotNull(string0);
      assertEquals("]", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      WordUtils wordUtils0 = new WordUtils();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = WordUtils.wrap((String) null, (-1952), (String) null, false);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = WordUtils.wrap("[Wn24Ba yAH7jE", (-875), "woZ=N#f9~v_", false);
      assertEquals("[Wn24BawoZ=N#f9~v_yAH7jE", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = WordUtils.wrap(" gPB{(YKpf~", 0, "mT=X,dr", true);
      assertEquals("gmT=X,drPmT=X,drBmT=X,dr{mT=X,dr(mT=X,drYmT=X,drKmT=X,drpmT=X,drfmT=X,dr~", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = WordUtils.wrap("j3l \"CG]=`:XyYmQ", (-4761), "0sj>|;5c-", true);
      assertEquals("j0sj>|;5c-30sj>|;5c-l0sj>|;5c-\"0sj>|;5c-C0sj>|;5c-G0sj>|;5c-]0sj>|;5c-=0sj>|;5c-`0sj>|;5c-:0sj>|;5c-X0sj>|;5c-y0sj>|;5c-Y0sj>|;5c-m0sj>|;5c-Q", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalize("^8hnUnTxOJ", charArray0);
      assertEquals("^8hnUnTxOJ", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = WordUtils.capitalize((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = WordUtils.capitalize("org.apache.commons.lang.WordUtils");
      assertEquals("Org.apache.commons.lang.WordUtils", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[4] = '9';
      String string0 = WordUtils.capitalizeFully(";d<e_KU$Z|*j`h%m9", charArray0);
      assertEquals(";d<e_ku$z|*j`h%m9", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("", (char[]) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalizeFully("HP-UX", charArray0);
      assertEquals("HP-UX", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.uncapitalize("ajDrwT8S(;og", charArray0);
      assertEquals("ajDrwT8S(;og", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = WordUtils.uncapitalize((String) null, (char[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = WordUtils.uncapitalize("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = WordUtils.uncapitalize(" ");
      assertEquals(" ", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = WordUtils.uncapitalize("z6");
      assertEquals("z6", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = WordUtils.swapCase((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = WordUtils.swapCase("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = WordUtils.swapCase("qxxX?QX~");
      assertEquals("QXXx?qx~", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = WordUtils.initials((String) null, (char[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.initials("^8hnUnTxOJ", charArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      char[] charArray0 = new char[1];
      String string0 = WordUtils.initials(".d>5]1", charArray0);
      assertEquals(".", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = WordUtils.initials(" ");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = WordUtils.abbreviate("]", 7, 7, "]");
      assertEquals("]", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = WordUtils.abbreviate((String) null, (-1), (-135), "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", 909, 909, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = WordUtils.abbreviate("9mw}ZQn8HyL4FO2", 0, 0, "9mw}ZQn8HyL4FO2");
      assertEquals("9mw}ZQn8HyL4FO2", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = WordUtils.abbreviate(";~", (-1), (-1), "");
      assertEquals(";~", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = WordUtils.abbreviate("[fG6_;pK3/E{%Iw", 745, (-1558), "[fG6_;pK3/E{%Iw");
      assertEquals("[fG6_;pK3/E{%Iw", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = WordUtils.abbreviate(" ", 0, 0, " ");
      assertEquals(" ", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = WordUtils.abbreviate("}+;yE Vj0{b%jz^cr[T", 0, 0, "");
      assertEquals("", string0);
  }
}
