/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 09:50:31 GMT 2018
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.FieldPosition;
import java.text.Format;
import java.time.ZoneId;
import java.time.ZoneOffset;
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
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FastDatePrinter_ESTest extends FastDatePrinter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("5SE}1V>GCeI&hE|S/B4", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: V
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("1E hZ {", (TimeZone) null, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      String string0 = fastDatePrinter0.format((Calendar) mockGregorianCalendar0);
      assertEquals("1ven 8+0000 {", string0);
      assertEquals(16, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("zK");
      Locale locale0 = Locale.CANADA;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("zK", timeZone0, locale0);
      StringBuffer stringBuffer0 = new StringBuffer(3);
      fastDatePrinter0.format((long) 1, stringBuffer0);
      assertEquals("GMT0", stringBuffer0.toString());
      assertEquals(7, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("", (TimeZone) null, locale0);
      int int0 = fastDatePrinter0.getMaxLengthEstimate();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2123, "E");
      Locale locale0 = Locale.KOREAN;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("E", simpleTimeZone0, locale0);
      String string0 = fastDatePrinter0.toString();
      assertEquals("FastDatePrinter[E,ko,E]", string0);
      assertEquals(1, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("Unknown class: ");
      Locale locale0 = Locale.GERMANY;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter(";4D ", timeZone0, locale0);
      fastDatePrinter0.getLocale();
      assertEquals(7, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(31, "");
      Locale locale0 = Locale.ROOT;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("", simpleTimeZone0, locale0);
      fastDatePrinter0.hashCode();
      assertEquals(0, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.US;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("1E=h7 7", (TimeZone) null, locale0);
      // Undeclared exception!
      try { 
        fastDatePrinter0.format((long) 75);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("", (TimeZone) null, locale0);
      fastDatePrinter0.getPattern();
      assertEquals(0, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.KOREA;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("", timeZone0, locale0);
      fastDatePrinter0.getTimeZone();
      assertEquals(0, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("M=", (TimeZone) null, locale0);
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      StringBuffer stringBuffer0 = new StringBuffer(2);
      fastDatePrinter0.applyRules(calendar0, stringBuffer0);
      assertEquals(2, stringBuffer0.length());
      assertEquals(3, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("y", (TimeZone) null, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 2, 1);
      StringBuffer stringBuffer0 = new StringBuffer(0);
      fastDatePrinter0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals(4, stringBuffer0.length());
      assertEquals(4, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("k", (TimeZone) null, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(99, 2, 1);
      StringBuffer stringBuffer0 = new StringBuffer("");
      fastDatePrinter0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals(2, stringBuffer0.length());
      assertEquals(4, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.KOREA;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("h-*DD>in+biE4N6Mwc", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: i
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ENGLISH;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("Ag^]%C6Ps6|Wz!+", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: A
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("+B/r");
      Locale locale0 = Locale.ROOT;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("+B/r", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: B
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("h.>/1C#:|");
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("h.>/1C#:|", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: C
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("01`FEE$p?~uwIn");
      Locale locale0 = Locale.GERMAN;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("01`FEE$p?~uwIn", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: p
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.UK;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("@3{,WHwd$5UtNor;", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: U
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(77, "'WS~!8r'Iii_<lx3");
      Locale locale0 = Locale.ITALY;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("'WS~!8r'Iii_<lx3", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = new Locale("[]J9Y-d");
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("[]J9Y-d", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: J
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("L", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: L
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("&&<yy\"zE}N{@hl2\"E|", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: N
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("l}sm~3j$7}t;g$Q0B");
      Locale locale0 = Locale.FRANCE;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter(":O MYUh1,4kD%%(8", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINA;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("P.HUzt)l;Zo", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: P
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = Locale.GERMAN;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter(")-KQ+)GpvD>$rCVGnf", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Q
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ITALIAN;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("R38m{j", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: R
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("~T}@8T9k@oJ0");
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("~T}@8T9k@oJ0", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("2KSXPA`2ge'N", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: X
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("!GY1n?B][4Vuc51|vD5", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Y
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.UK;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("=an9?", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: n
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("](bNc{", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("c1]3dSD9uFsXST|OBz^", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: c
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      Locale locale0 = new Locale("", ",", "");
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("den", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: e
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("+f|i", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: f
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.KOREA;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("2gESrE:p(Q`D]UY", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: g
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("j;mDn", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: j
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(60, "Z(8whN>");
      Locale locale0 = Locale.TAIWAN;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("1708l>2Uo{|V1k-fpz", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: l
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINA;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("_{7m~IX)##]", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("HoI>Uzn:d?", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-2146), "1[*qRufdwey>,");
      Locale locale0 = Locale.JAPAN;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("1[*qRufdwey>,", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: q
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.FRENCH;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("rwaCQU5V", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: r
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("9~;E} s%zo|v5[i", (TimeZone) null, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("~^tH#~eH>OUp3>", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2612, "K5*u");
      Locale locale0 = Locale.JAPANESE;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("K5*u", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: u
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("F`x)wPAY", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: x
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("(PAF.F#'");
      Locale locale0 = Locale.FRENCH;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter(" h'", timeZone0, locale0);
      assertEquals(5, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("''z:>{v~jgs>$4IbFX");
      Locale locale0 = Locale.ITALY;
      FastDatePrinter fastDatePrinter0 = null;
      try {
        fastDatePrinter0 = new FastDatePrinter("''z:>{v~jgs>$4IbFX", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: v
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("1E hZ {", (TimeZone) null, locale0);
      StringBuffer stringBuffer0 = new StringBuffer();
      FieldPosition fieldPosition0 = new FieldPosition(1);
      // Undeclared exception!
      try { 
        fastDatePrinter0.format((Object) "1E hZ {", stringBuffer0, fieldPosition0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: java.lang.String
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.US;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("K[;D^", timeZone0, locale0);
      MockDate mockDate0 = new MockDate(1283, 3, 101, 101, 3);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "K[;D^");
      fastDatePrinter0.format((Object) mockDate0, stringBuffer0, (FieldPosition) null);
      assertEquals("K[;D^5[;195^", stringBuffer0.toString());
      assertEquals(11, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      StringBuffer stringBuffer0 = new StringBuffer("");
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0);
      Locale locale0 = Locale.JAPANESE;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("", timeZone0, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      fastDatePrinter0.format((Object) mockGregorianCalendar0, stringBuffer0, fieldPosition0);
      assertEquals(0, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      StringBuffer stringBuffer0 = new StringBuffer(1012);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(363, "", 363, 0, 0, 0, 3078, 0, 3078, (-1832));
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("", simpleTimeZone0, locale0);
      Long long0 = new Long(0L);
      fastDatePrinter0.format((Object) long0, stringBuffer0, (FieldPosition) null);
      assertEquals(0, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("Unknown class: ");
      Locale locale0 = Locale.GERMANY;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter(";4D ", timeZone0, locale0);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "Unknown class: ");
      FieldPosition fieldPosition0 = new FieldPosition(3);
      // Undeclared exception!
      try { 
        fastDatePrinter0.format((Object) null, stringBuffer0, fieldPosition0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: <null>
         //
         verifyException("org.apache.commons.lang3.time.FastDatePrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("8", timeZone0, locale0);
      boolean boolean0 = fastDatePrinter0.equals(fastDatePrinter0);
      assertTrue(boolean0);
      assertEquals(1, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("8", timeZone0, locale0);
      boolean boolean0 = fastDatePrinter0.equals("8");
      assertFalse(boolean0);
      assertEquals(1, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("8", timeZone0, locale0);
      FastDatePrinter fastDatePrinter1 = new FastDatePrinter("", timeZone0, locale0);
      fastDatePrinter0.equals(fastDatePrinter1);
      assertEquals(1, fastDatePrinter0.getMaxLengthEstimate());
      assertEquals(0, fastDatePrinter1.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "&,");
      Locale locale0 = Locale.ITALIAN;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("&,", simpleTimeZone0, locale0);
      Locale locale1 = Locale.CANADA_FRENCH;
      FastDatePrinter fastDatePrinter1 = new FastDatePrinter("&,", simpleTimeZone0, locale1);
      fastDatePrinter0.equals(fastDatePrinter1);
      assertEquals(2, fastDatePrinter1.getMaxLengthEstimate());
      assertEquals(2, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("Unknown class: ");
      Locale locale0 = Locale.GERMANY;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter(";4D ", timeZone0, locale0);
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      String string0 = fastDatePrinter0.format(calendar0);
      assertEquals(";445 ", string0);
      assertEquals(7, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Locale locale0 = Locale.US;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("M=", (TimeZone) null, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 0, 0, 3, 3, 0);
      StringBuffer stringBuffer0 = new StringBuffer(2);
      fastDatePrinter0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals("12=", stringBuffer0.toString());
      assertEquals(3, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("y", (TimeZone) null, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      StringBuffer stringBuffer0 = new StringBuffer("");
      fastDatePrinter0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals(4, stringBuffer0.length());
      assertEquals(4, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("y", (TimeZone) null, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(106, 1012, 1);
      StringBuffer stringBuffer0 = new StringBuffer("");
      fastDatePrinter0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals(4, stringBuffer0.length());
      assertEquals(4, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Locale locale0 = Locale.US;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("1E=h7 7", (TimeZone) null, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 0, 1);
      String string0 = fastDatePrinter0.format((Calendar) mockGregorianCalendar0);
      assertEquals("1Sat=127 7", string0);
      assertEquals(12, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone(".8k");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter(".8k", timeZone0, locale0);
      StringBuffer stringBuffer0 = new StringBuffer();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
      fastDatePrinter0.applyRules(mockGregorianCalendar0, stringBuffer0);
      assertEquals(".820", stringBuffer0.toString());
      assertEquals(6, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.UK;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("_Z\"", timeZone0, locale0);
      timeZone0.setRawOffset((-1739));
      MockDate mockDate0 = new MockDate(1, (-1264), (-3782), 822, 3);
      String string0 = fastDatePrinter0.format((Date) mockDate0);
      assertEquals("_-0000\"", string0);
      assertEquals(7, fastDatePrinter0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDatePrinter fastDatePrinter0 = new FastDatePrinter("", timeZone0, locale0);
      FastDatePrinter fastDatePrinter1 = new FastDatePrinter("", timeZone0, locale0);
      FastDatePrinter.getTimeZoneDisplay(timeZone0, false, 111, locale0);
  }
}