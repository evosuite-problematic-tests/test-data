/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 17:29:55 GMT 2019
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang3.time.FastDateFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FastDateFormat_ESTest extends FastDateFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateFormatSymbols dateFormatSymbols0 = DateFormatSymbols.getInstance();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      Locale locale0 = Locale.JAPAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, timeZone0, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(490, 108, 490, (-501), 108);
      String string0 = fastDateFormat0.format((Calendar) mockGregorianCalendar0);
      assertEquals("0500\u5E744\u670813\u65E5 4\u664248\u520600\u79D2 GMT", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("dd/MM/yy h:mm:ss 'o''clock' a z");
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 2, 2);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "dd/MM/yy h:mm:ss 'o''clock' a z");
      fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals("dd/MM/yy h:mm:ss 'o''clock' a z02/03/01 12:00:00 o'clock AM GMT", stringBuffer0.toString());
      
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateInstance(3);
      assertFalse(fastDateFormat1.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0);
      String string0 = fastDateFormat0.getPattern();
      assertEquals("EEEE, MMMM d, yyyy h:mm:ss a z", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, (TimeZone) null);
      assertEquals(2, FastDateFormat.MEDIUM);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0);
      ParsePosition parsePosition0 = new ParsePosition(1);
      fastDateFormat0.parseObject("WycY}BbAH", parsePosition0);
      assertEquals(0, parsePosition0.getIndex());
      assertEquals(50, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1);
      fastDateFormat0.getLocale();
      assertEquals(20, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0);
      assertEquals(18, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0);
      String string0 = fastDateFormat0.toString();
      assertEquals("FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z]", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(3);
      int int0 = fastDateFormat0.getMaxLengthEstimate();
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("");
      Long long0 = new Long(1);
      String string0 = fastDateFormat0.format((Object) long0);
      assertEquals("", string0);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
      assertEquals(21, fastDateFormat1.getMaxLengthEstimate());
      assertFalse(fastDateFormat1.getTimeZoneOverridesCalendar());
      assertNotSame(fastDateFormat1, fastDateFormat0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1, locale0);
      assertEquals("yyyy/MM/dd H:mm:ss z", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", (Locale) null);
      TimeZone timeZone0 = fastDateFormat0.getTimeZone();
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
      assertNotNull(timeZone0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("org.apache.commons.lang3.time.FastDateFormat$TimeZoneDisplayKey");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1, timeZone0);
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateTimeInstance(1, 2, timeZone0);
      boolean boolean0 = fastDateFormat1.equals(fastDateFormat0);
      assertFalse(boolean0);
      assertEquals("MMMM d, yyyy h:mm:ss a", fastDateFormat1.getPattern());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, locale0);
      String string0 = fastDateFormat0.format((long) 0);
      assertEquals("\u4E0A\u534812\u664200\u520600\u79D2 GMT", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("org.apache.commons.lang3.time.FastDateFormat$TimeZoneDisplayKey");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 2, timeZone0);
      assertEquals("MMMM d, yyyy h:mm:ss a", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ENGLISH;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, timeZone0, locale0);
      assertEquals(3, FastDateFormat.SHORT);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("12:00:00 AM GMT");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: A
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("%ChsDi", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: C
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("wW3D2");
      Locale locale0 = new Locale("The value %s is not in the specified inclusive range of %s to %s", "The validated array contains null element at index: %d", "yyyy'\u5E74'M'\u6708'd'\u65E5' EEEE M hhZmm:ss");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 0, 0, 3, 2);
      String string0 = fastDateFormat0.format((Object) mockGregorianCalendar0);
      assertEquals("1633652", string0);
      
      boolean boolean0 = fastDateFormat0.equals((Object) null);
      assertFalse(boolean0);
      
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      boolean boolean1 = fastDateFormat0.getTimeZoneOverridesCalendar();
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("(H=9!@KFBR&T<(*8M?");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: B
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("/Iu", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("J8j4", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: J
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("D@0s6zk[L", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: L
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-4237), "No date time pattern for locale: ");
      Locale locale0 = Locale.CANADA_FRENCH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("No date time pattern for locale: ", (TimeZone) simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: N
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(")Oe=4>Vqi/xg", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Locale locale0 = new Locale("2Pf3{7$0#=<.S(swS");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("2Pf3{7$0#=<.S(swS", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: P
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("73QY{\"aj", timeZone0, (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Q
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("</{R]-cx@`i&2fPT");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: R
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(")>>:SFt");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("The validated character sequence is blank");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(14, "h'_V}#3iS>|R|D2i3");
      Locale locale0 = Locale.ITALIAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("UCmk:F%BY_,W@z;[W", (TimeZone) simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: U
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(" K]VcW _O", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: V
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Gh&3ZXIFh");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: X
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("*^YAO");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Y
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("\"bBx0::W");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("c`'kqW*d}Q.vg*~PAaw", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: c
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("}0e>).JN@;", (TimeZone) simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: e
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("fNT54ZF7gUF!BD", (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: f
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("gDT=d", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: g
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("i");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: i
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("M^8{y\"s$]/j:&U~");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: j
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("dE:K%&$~3l", (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: l
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("|s242\"nEP/02I", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: n
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("org.apache.commons.lang3.time.FastDateFormat$StringLiteral", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("]2p:ha'bJW~}`1k");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: p
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("qfu\"^wFbO", (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: q
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("rvO", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: r
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(",u!x.-t#byGi&", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: u
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(":vUi_gS~7aExxcc");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: v
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("x0q", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: x
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      timeZone0.setRawOffset(0);
      Locale locale0 = Locale.ENGLISH;
      timeZone0.getDisplayName(false, 0, locale0);
      Locale locale1 = Locale.TAIWAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(2, locale0);
      assertEquals("MMM d, yyyy", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("ZZ");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 3, 1, 1, 1);
      StringBuffer stringBuffer0 = new StringBuffer("ZZ");
      fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals(8, stringBuffer0.length());
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.TAIWAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1, timeZone0, locale0);
      assertEquals("yyyy'\u5E74'M'\u6708'd'\u65E5' ahh'\u6642'mm'\u5206'ss'\u79D2'", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("");
      MockDate mockDate0 = new MockDate(2);
      StringBuffer stringBuffer0 = new StringBuffer("");
      FieldPosition fieldPosition0 = new FieldPosition((-5455));
      fastDateFormat0.format((Object) mockDate0, stringBuffer0, fieldPosition0);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, locale0);
      StringBuffer stringBuffer0 = new StringBuffer(2998);
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0, 100);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) ")!IRjrM*(P,cU,PIT", stringBuffer0, fieldPosition0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: java.lang.String
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0);
      StringBuffer stringBuffer0 = new StringBuffer(0);
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) null, stringBuffer0, fieldPosition0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: <null>
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance(" ");
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, " ");
      Locale locale0 = new Locale(" ", " ", "The validated array index is invalid: %d");
      FastDateFormat fastDateFormat1 = new FastDateFormat(" ", simpleTimeZone0, locale0);
      boolean boolean0 = fastDateFormat0.equals(fastDateFormat1);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
      assertFalse(boolean0);
      assertTrue(fastDateFormat1.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("yyyy'\u5E74'M'\u6708'd'\u65E5' GEEE M hhZmm:ss");
      Locale locale0 = Locale.FRANCE;
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance("yyyy'\u5E74'M'\u6708'd'\u65E5' GEEE M hhZmm:ss", locale0);
      boolean boolean0 = fastDateFormat0.equals(fastDateFormat1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      Locale.setDefault(locale0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("");
      TimeZone timeZone0 = TimeZone.getTimeZone("FastDateFormat[]");
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance("", timeZone0, locale0);
      boolean boolean0 = fastDateFormat0.equals(fastDateFormat1);
      assertFalse(boolean0);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(3);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2462, 116, 843, 1, 83);
      StringBuffer stringBuffer0 = new StringBuffer("");
      fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals(8, stringBuffer0.length());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=15903829380000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2473,MONTH=11,WEEK_OF_YEAR=51,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=355,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=23,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("MMM d, yyyy", locale0);
      TimeZone timeZone0 = TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
      mockGregorianCalendar0.set(0, 0, 13, 31, 31, 89);
      String string0 = fastDateFormat0.format((Object) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62166241650680,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=0,YEAR=1,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=14,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=32,SECOND=29,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals("janv. 14, 0001", string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("yyyy'\u5E74'M'\u6708'd'\u65E5' GEEE M hhZmm:ss");
      StringBuffer stringBuffer0 = new StringBuffer();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1002), 44, 100, 0, (-575));
      fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals("1000\u5E7412\u67088\u65E5 BCSun 12 02+000025:00", stringBuffer0.toString());
      assertEquals(32, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("k");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "k");
      fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals(3, stringBuffer0.length());
      assertEquals("k20", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("k");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 3);
      StringBuffer stringBuffer0 = new StringBuffer("k");
      fastDateFormat0.applyRules(mockGregorianCalendar0, stringBuffer0);
      assertEquals("k24", stringBuffer0.toString());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62132918400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=34,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("Z");
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-672), "Z");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(simpleTimeZone0);
      String string0 = fastDateFormat0.format((Object) mockGregorianCalendar0);
      assertEquals("-0000", string0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      System.setCurrentTimeMillis(411L);
      Locale locale0 = Locale.CANADA_FRENCH;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 112, 117);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "EEEE, MMMM d, yyyy");
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-489), "EEEE, MMMM d, yyyy");
      locale0.getUnicodeLocaleKeys();
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1, (TimeZone) simpleTimeZone0, locale0);
      assertEquals("HH:mm:ss z", fastDateFormat0.getPattern());
  }
}
