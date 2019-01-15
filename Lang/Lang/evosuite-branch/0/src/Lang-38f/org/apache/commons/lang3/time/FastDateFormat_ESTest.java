/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 11:00:57 GMT 2018
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.text.AttributedCharacterIterator;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang3.time.FastDateFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.evosuite.runtime.mock.java.time.MockZonedDateTime;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FastDateFormat_ESTest extends FastDateFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("Z", timeZone0);
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Set<String> set0 = Calendar.getAvailableCalendarTypes();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0, locale_FilteringMode0);
      List<String> list1 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) list0, locale_FilteringMode0);
      fastDateFormat0.equals(list1);
      System.setCurrentTimeMillis((-1570L));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(2);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.GERMANY;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(2, 2, timeZone0, locale0);
      String string0 = fastDateFormat0.format((-32L));
      assertEquals("31.12.1969 23:59:59", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Locale locale0 = Locale.JAPAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(3, 0, locale0);
      assertEquals(25, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      fastDateFormat0.getPattern();
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(3, (TimeZone) null);
      assertEquals(10, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(2, 0, locale0);
      ParsePosition parsePosition0 = new ParsePosition(2427);
      fastDateFormat0.parseObject("", parsePosition0);
      assertEquals("d-MMM-yyyy H.mm.ss z", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0);
      fastDateFormat0.getLocale();
      assertEquals("EEEE, MMMM d, yyyy h:mm:ss a z", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0);
      assertEquals("h:mm:ss a z", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      // Undeclared exception!
      try { 
        FastDateFormat.getDateInstance((-1), locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style -1
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("");
      String string0 = fastDateFormat0.toString();
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
      assertEquals("FastDateFormat[]", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      assertEquals("EEEE, MMMM d, yyyy", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "", (-1), 0, 15, 1, (-1310), 0, (-1), 0);
      Locale locale0 = Locale.PRC;
      FastDateFormat fastDateFormat0 = new FastDateFormat("", simpleTimeZone0, locale0);
      fastDateFormat0.getTimeZone();
      assertTrue(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("wh2$$B(U#'#u-Sra9j", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: B
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getDateInstance((-353), (TimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style -353
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1, (Locale) null);
      assertEquals(18, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ROOT;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, timeZone0, locale0);
      boolean boolean0 = fastDateFormat0.getTimeZoneOverridesCalendar();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 3, timeZone0);
      assertEquals("EEEE, MMMM d, yyyy h:mm a", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, (TimeZone) null, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 0, 1, 0, 0);
      String string0 = fastDateFormat0.format((Calendar) mockGregorianCalendar0);
      assertEquals("0001\uB144 1\uC6D4 31\uC77C \uC6D4\uC694\uC77C", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ROOT;
      locale0.stripExtensions();
      timeZone0.getDisplayName(false, 0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, timeZone0, locale0);
      fastDateFormat0.getMaxLengthEstimate();
      fastDateFormat0.getTimeZoneOverridesCalendar();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      fastDateFormat0.format((Calendar) mockGregorianCalendar0);
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateInstance(1, timeZone0, locale0);
      MockDate mockDate0 = new MockDate(1714L);
      fastDateFormat1.format((Date) mockDate0);
      StringWriter stringWriter0 = null;
      try {
        stringWriter0 = new StringWriter((-1794));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative buffer size
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
      assertNotNull(fastDateFormat1);
      assertEquals(21, fastDateFormat1.getMaxLengthEstimate());
      assertNotSame(fastDateFormat1, fastDateFormat0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(0);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.GERMANY;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance((String) null, timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(">8%\"A['}[", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: A
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("69:$xkK?z_W]>");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Gk^C.b+fiYm'hQP!", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: C
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FastDateFormat.getInstance("wF(F<)D@H>`", locale0);
      String string0 = null;
      locale0.getScript();
      String string1 = "";
      // Undeclared exception!
      try { 
        locale0.getUnicodeLocaleType("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Ill-formed Unicode locale key: 
         //
         verifyException("java.util.Locale", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("5I5[v`.:Wt<", (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("1#+mZJuw");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: J
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("K K\"");
      fastDateFormat0.equals("K K\"");
      int[] intArray0 = new int[9];
      intArray0[0] = 2;
      intArray0[1] = 1;
      intArray0[2] = 0;
      intArray0[3] = 3;
      intArray0[4] = 2;
      intArray0[5] = 2;
      intArray0[6] = 0;
      intArray0[7] = 1;
      intArray0[8] = 3;
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("k-LuQHBAkFNi");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: L
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("NRl`", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: N
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("O#6PT6?8[yq@vf-/");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("P '>|7zr-\"tI,f");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: P
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Md66QE!{c5j7#FO;#&");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Q
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("R}8.FrBf|&P,LLWVJ", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: R
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Locale locale0 = new Locale("j5[v`.g{t<5");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(",3S}cn8Q", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: c
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("@ZWWUJ");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("[Ta_@/{&]k>p8lQ", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("%Uu;~O6g");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: U
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("0V");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: V
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("W}6j8#bW{soE", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: j
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone(">*]XYw/E%O");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(">*]XYw/E%O", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: X
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Y`=D]CPITf'0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Y
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("bg0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("e");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: e
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(" f%i`yZUy3rkW7^V-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: f
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("|gjtrL]hlZi]>fmq", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: g
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
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
  public void test45()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("69:,lcW=a", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: l
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Z+D0snL3");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: n
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("org.apache.commons.lang3.time.FastDateFormat$UnpaddedNumberField");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("]+*8p`AmF M,odP", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: p
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("yq5_O@TF");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: q
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Greenwich Mean Time", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: r
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("FastDateFormat[");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("\"uZ+D0snL3", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: u
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("org.apache.commons.lang3.time.FastDateFormat");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("&M^v]5 !ceBL>hix Ti", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: v
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("2x+kb/+C)C>KL");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: x
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      locale0.clone();
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, locale0);
      Long long0 = new Long(1);
      fastDateFormat0.equals(long0);
      int[] intArray0 = new int[5];
      intArray0[0] = 0;
      intArray0[1] = 1;
      intArray0[2] = 50;
      intArray0[3] = 1;
      intArray0[4] = 0;
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      assertNotNull(fastDateFormat0);
      
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1), (-2044), 1, 0, 1, (-245));
      String string0 = fastDateFormat0.format((Object) mockGregorianCalendar0);
      assertEquals("8/31/73 11:56 PM", string0);
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "nBuH^ )u&jg>kNyzx<n");
      Locale locale0 = new Locale("nBuH^ )u&jg>kNyzx<n", "", "nBuH^ )u&jg>kNyzx<n");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1, (TimeZone) simpleTimeZone0, locale0);
      MockDate mockDate0 = new MockDate(0, 0, 1294, 1294, 1, 0);
      AttributedCharacterIterator attributedCharacterIterator0 = fastDateFormat0.formatToCharacterIterator(mockDate0);
      assertEquals(39, attributedCharacterIterator0.getRunLimit());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) fastDateFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: org.apache.commons.lang3.time.FastDateFormat
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "org.apache.commons.lang3.time.FastDateFormat$TextField");
      Locale locale0 = new Locale("", "org.apache.commons.lang3.time.FastDateFormat$TwoDigitNumberField");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1, (TimeZone) simpleTimeZone0, locale0);
      Long long0 = new Long(0L);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "|uhJ?1OWRd");
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0, 15);
      fastDateFormat0.format((Object) long0, stringBuffer0, fieldPosition0);
      assertEquals(47, stringBuffer0.length());
      assertEquals("|uhJ?1OWRdJanuary 1, 1970 12:00:00 AM GMT+00:00", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("yyyy'\u5E74'M'\u6708'd'\u65E5' EEEE", timeZone0);
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0, 0);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) null, (StringBuffer) null, fieldPosition0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: <null>
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0);
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINESE;
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateInstance(0, timeZone0, locale0);
      fastDateFormat0.equals(fastDateFormat1);
      assertEquals("EEEE, MMMM d, yyyy h:mm:ss a z", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", timeZone0);
      assertEquals("", fastDateFormat0.getPattern());
      assertTrue(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("yyyy'\uB144' M'\uC6D4' d'\uC77C' '('EE')'");
      Locale locale0 = Locale.TAIWAN;
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance("yyyy'\uB144' M'\uC6D4' d'\uC77C' '('EE')'", locale0);
      fastDateFormat1.equals(fastDateFormat0);
      assertFalse(fastDateFormat1.getTimeZoneOverridesCalendar());
      assertEquals(21, fastDateFormat1.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("yyyy'\uB144' M'\uC6D4' d'\uC77C' '('EE')'");
      Locale locale0 = Locale.ENGLISH;
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance("yyyy'\uB144' M'\uC6D4' d'\uC77C' '('EE')'", locale0);
      boolean boolean0 = fastDateFormat1.equals(fastDateFormat0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      String string0 = fastDateFormat0.format((long) (-2856));
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
      assertEquals("12/31/69 11:59 PM", string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 3388, 1, (-1756), (-2400), (-2767));
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "Tuesday, January 2, 1900 12:01:00 AM GMT");
      fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals("Tuesday, January 2, 1900 12:01:00 AM GMTSaturday, February 16, 0284 3:13:53 AM GMT", stringBuffer0.toString());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-53201047567000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=284,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=3,HOUR_OF_DAY=3,MINUTE=13,SECOND=53,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("k'_B1}1x9LHX", timeZone0, locale0);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((long) (-26), (StringBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat$UnpaddedNumberField", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("k'_B1}1x9LHX", locale0);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((long) 2, (StringBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat$UnpaddedNumberField", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.FRENCH;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, timeZone0, locale0);
      assertEquals(3, FastDateFormat.SHORT);
  }
}