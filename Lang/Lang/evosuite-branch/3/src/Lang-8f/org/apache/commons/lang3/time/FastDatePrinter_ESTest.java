/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 12:22:18 GMT 2019
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.text.FieldPosition;
import java.text.Format;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang3.time.FastDatePrinter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FastDatePrinter_ESTest extends FastDatePrinter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "org.apache.commons.lang3.time.FastDatePrinter", 0, 0, 0, 5, 4, 2229, 0, 0, (-470), 7, 2229);
      Locale locale0 = new Locale("", "");
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("%10M40E{/", simpleTimeZone0, locale0);
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      StringBuffer stringBuffer0 = new StringBuffer();
      fastDatePrinter0.format(calendar0, stringBuffer0);
      assertEquals(11, stringBuffer0.length());
      assertEquals(12, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-2319), "dd|mk");
      Locale locale0 = Locale.GERMAN;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("dd|mk", simpleTimeZone0, locale0);
      String string0 = fastDatePrinter0.format((long) 2);
      assertEquals("31|5923", string0);
      assertEquals(11, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINA;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("S", timeZone0, locale0);
      int int0 = fastDatePrinter0.getMaxLengthEstimate();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("", timeZone0, locale0);
      String string0 = fastDatePrinter0.toString();
      assertEquals(0, fastDatePrinter0.getMaxLengthEstimate());
      assertEquals("FastDatePrinter[,zh_CN,GMT]", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.UK;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("/a", timeZone0, locale0);
      fastDatePrinter0.getLocale();
      assertEquals(3, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINA;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("S", timeZone0, locale0);
      fastDatePrinter0.hashCode();
      assertEquals(4, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1710, "m7y-]m#3F");
      Locale locale0 = Locale.CHINA;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("m7y-]m#3F", simpleTimeZone0, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 0, 0, 2, 3);
      String string0 = fastDatePrinter0.format((Calendar) mockGregorianCalendar0);
      assertEquals(22, fastDatePrinter0.getMaxLengthEstimate());
      assertEquals("371000-]3#35", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2120, "", 2120, 0, 2120, 0, 1312, 0, 1312, 3033, 2120);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("", simpleTimeZone0, locale0);
      fastDatePrinter0.getPattern();
      assertEquals(0, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = Locale.GERMANY;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("", timeZone0, locale0);
      fastDatePrinter0.getTimeZone();
      assertEquals(0, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINA;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("h", timeZone0, locale0);
      FastDatePrinter fastDatePrinter1 = new FastDatePrinter("", timeZone0, locale0);
      boolean boolean0 = fastDatePrinter0.equals(fastDatePrinter1);
      assertEquals(4, fastDatePrinter0.getMaxLengthEstimate());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1680, "yy-]m3");
      Locale locale0 = new Locale("yy-]m3", "yy-]m3");
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("yy-]m3", simpleTimeZone0, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1073, 1, 0, 2, 1);
      String string0 = fastDatePrinter0.format((Calendar) mockGregorianCalendar0);
      assertEquals("73-]13", string0);
      assertEquals(10, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("7d3y#B%");
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("7d3y#B%", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: B
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-2309), "jAO@Z[sbU.MxZFZ=c");
      Locale locale0 = new Locale("");
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("HGAmpG[x+o", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: A
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.KOREAN;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("Illegal pattern component: ", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("`v6]`");
      Locale locale0 = Locale.ITALY;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("J'X{\"N'Hd9*0ds*x", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: J
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = new Locale("org.apache.commons.lang3.time.FastDatePrinter$UnpaddedNumberField");
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("L9^7", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: L
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = new Locale("");
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter(" zN.TP,TtmP\"9m,YuNi", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: N
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter(">_O0Lsb#9j=n<v%\u0001", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = Locale.ENGLISH;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("P1Taq`", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: P
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("QL&/");
      Locale locale0 = Locale.UK;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("QL&/", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Q
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.GERMAN;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("'G!'E&sR>,^", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: R
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "dTCJMOx-9+Yg->4");
      Locale locale0 = Locale.KOREAN;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("dTCJMOx-9+Yg->4", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.JAPANESE;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("}wFU31\"j!", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: U
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "zxE2!32c,");
      Locale locale0 = Locale.KOREAN;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("VGDa63vj", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: V
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.UK;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("W2C[n}UzD^&0ULS", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: C
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("X6E(/k+8?uck3", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: X
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.KOREA;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("^Y:HH[6", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Y
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "GKDTe^YPCt", 0, (-1), 5, 39, 5, 0, 0, 0);
      Locale locale0 = Locale.KOREAN;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("bj5|*?+JDrkf", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("?/H^hckfd6", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: c
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = Locale.ITALY;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("(EeX/", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: e
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter(" fa3[", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: f
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Locale locale0 = Locale.US;
      TimeZone timeZone0 = TimeZone.getTimeZone("$gukQH4z?{bFId,)Z/&");
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("$gukQH4z?{bFId,)Z/&", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: g
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = Locale.KOREA;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("hi8:LjIn-", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: i
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("]j`ddIHcR;Ti");
      Locale locale0 = Locale.TAIWAN;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("]j`ddIHcR;Ti", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: j
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("%$l9:kP;WNwL#", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: l
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "", 0, 0, 0, 1131, (-3473), 0, 0, 1619, 1685);
      Locale locale0 = Locale.ENGLISH;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("0n{2i", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: n
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("org.apache.commons.lang3.time.FastDatePrinter$TimeZoneNameRule", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-2309), "jAO@Z[sbU.MxZFZ=c");
      Locale locale0 = new Locale("");
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("HGHpG[x+o", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: p
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("^qO@b8\"IfR|G_", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: q
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("[D3ryEP8j-.~D@qHbE");
      Locale locale0 = Locale.ITALIAN;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("[D3ryEP8j-.~D@qHbE", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: r
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "");
      Locale locale0 = Locale.UK;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("FastDatePrinter[", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = new Locale("`_u:1?HY}wB", "`_u:1?HY}wB", "");
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("`_u:1?HY}wB", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: u
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "v+NY%");
      Locale locale0 = Locale.CHINA;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("v+NY%", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: v
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("m-(KxBVt;x/");
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("m-(KxBVt;x/", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: x
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINA;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("'", timeZone0, locale0);
      assertEquals(0, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.FRENCH;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("''4sR>^", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: R
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "org.apache.commons.lang3.time.FastDatePrinter", 0, 0, 0, 5, 5, 2229, 0, 0, (-470), 7, 2229);
      Locale locale0 = new Locale("", "");
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("%10M40E{/", simpleTimeZone0, locale0);
      Object object0 = new Object();
      StringBuffer stringBuffer0 = new StringBuffer();
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0);
      // Undeclared exception!
      try { 
        fastDatePrinter0.format(object0, stringBuffer0, fieldPosition0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: java.lang.Object
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("", (TimeZone) null, locale0);
      MockDate mockDate0 = new MockDate();
      StringBuffer stringBuffer0 = new StringBuffer();
      FieldPosition fieldPosition0 = new FieldPosition((-2633));
      // Undeclared exception!
      try { 
        fastDatePrinter0.format((Object) mockDate0, stringBuffer0, fieldPosition0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "org.apache.commons.lang3.time.FastDatePrinter$StringLiteral");
      Locale locale0 = Locale.JAPANESE;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("", simpleTimeZone0, locale0);
      Calendar calendar0 = MockCalendar.getInstance();
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0);
      fastDatePrinter0.format((Object) calendar0, (StringBuffer) null, fieldPosition0);
      assertEquals(0, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = Locale.JAPAN;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("", timeZone0, locale0);
      Long long0 = new Long((-57L));
      StringWriter stringWriter0 = new StringWriter(2);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      fastDatePrinter0.format((Object) long0, stringBuffer0, (FieldPosition) null);
      assertEquals(0, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINA;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("", timeZone0, locale0);
      FieldPosition fieldPosition0 = new FieldPosition(0);
      // Undeclared exception!
      try { 
        fastDatePrinter0.format((Object) null, (StringBuffer) null, fieldPosition0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: <null>
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = new Locale("@S'Zpboq709!P", "org.apache.commons.lang3.time.FastDatePrinter$TwoDigitNumberField");
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("@S'Zpboq709!P", timeZone0, locale0);
      fastDatePrinter0.equals(fastDatePrinter0);
      assertEquals(16, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "LAsfT8;jl", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
      Locale locale0 = new Locale("LAsfT8;jl");
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("a%10M40E{/", simpleTimeZone0, locale0);
      fastDatePrinter0.equals((Object) null);
      assertEquals(14, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.UK;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("/a", timeZone0, locale0);
      FastDatePrinter fastDatePrinter1 = new FastDatePrinter("/a", (TimeZone) null, locale0);
      boolean boolean0 = fastDatePrinter0.equals(fastDatePrinter1);
      assertFalse(boolean0);
      assertEquals(3, fastDatePrinter1.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = new Locale("@S'Zpboq709!P", "org.apache.commons.lang3.time.FastDatePrinter$TwoDigitNumberField");
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("@S'Zpboq709!P", timeZone0, locale0);
      Locale locale1 = Locale.PRC;
      FastDatePrinter fastDatePrinter1 = new FastDatePrinter("@S'Zpboq709!P", timeZone0, locale1);
      boolean boolean0 = fastDatePrinter0.equals(fastDatePrinter1);
      assertEquals(16, fastDatePrinter1.getMaxLengthEstimate());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = new Locale("@S'Zpboq709!P", "org.apache.commons.lang3.time.FastDatePrinter$TwoDigitNumberField");
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("@S'Zpboq709!P", timeZone0, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "org.apache.commons.lang3.time.FastDatePrinter$TwoDigitNumberField");
      fastDatePrinter0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals(80, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "org.apache.commons.lang3.time.FastDatePrinter", 0, 0, 0, 5, 5, 2229, 0, 0, (-470), 7, 2229);
      Locale locale0 = new Locale("", "");
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("%10M40E{/", simpleTimeZone0, locale0);
      StringBuffer stringBuffer0 = new StringBuffer();
      fastDatePrinter0.format((long) (-470), stringBuffer0);
      assertEquals(12, stringBuffer0.length());
      assertEquals(12, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1680, "m47y*-]m#3F");
      Locale locale0 = Locale.CHINA;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("m47y*-]m#3F", simpleTimeZone0, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 3);
      StringBuffer stringBuffer0 = new StringBuffer(83);
      fastDatePrinter0.applyRules(mockGregorianCalendar0, stringBuffer0);
      assertEquals(15, stringBuffer0.length());
      assertEquals(24, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-2287), "y-\"DZZ");
      Locale locale0 = Locale.GERMAN;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("y-\"DZZ", simpleTimeZone0, locale0);
      StringBuffer stringBuffer0 = new StringBuffer("y-\"DZZ");
      MockDate mockDate0 = new MockDate((-2287), (-2287), 3);
      fastDatePrinter0.format((Date) mockDate0, stringBuffer0);
      assertEquals("y-\"DZZ0579-\"153-00:00", stringBuffer0.toString());
      assertEquals(15, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINA;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("h", timeZone0, locale0);
      StringBuffer stringBuffer0 = new StringBuffer();
      fastDatePrinter0.format((-1587L), stringBuffer0);
      assertEquals(2, stringBuffer0.length());
      assertEquals("11", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINA;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("h", timeZone0, locale0);
      // Undeclared exception!
      try { 
        fastDatePrinter0.format((long) 2, (StringBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter$UnpaddedNumberField", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-2287), "jAO@Z[sbU.MxZFZ=c");
      Locale locale0 = Locale.GERMAN;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("dsk", simpleTimeZone0, locale0);
      StringBuffer stringBuffer0 = new StringBuffer("dsk");
      TimeZone.setDefault(simpleTimeZone0);
      MockDate mockDate0 = new MockDate((-2287), (-2287), 3);
      fastDatePrinter0.format((Date) mockDate0, stringBuffer0);
      assertEquals("dsk3024", stringBuffer0.toString());
      assertEquals(12, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINA;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("z", timeZone0, locale0);
      // Undeclared exception!
      try { 
        fastDatePrinter0.format((long) 2, (StringBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter$TimeZoneNameRule", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-2287), "dsFZ");
      Locale locale0 = Locale.GERMAN;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("dsFZ", simpleTimeZone0, locale0);
      StringBuffer stringBuffer0 = new StringBuffer("dsFZ");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 3, 2, 2);
      fastDatePrinter0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals(12, stringBuffer0.length());
      assertEquals(17, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("HGAmpG[x+o");
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDatePrinter.getTimeZoneDisplay(timeZone0, true, 110, locale0);
  }
}
