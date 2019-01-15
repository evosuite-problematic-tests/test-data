/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 18:38:48 GMT 2019
 */

package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.text.AttributedCharacterIterator;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang.time.FastDateFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FastDateFormat_ESTest extends FastDateFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale.setDefault(locale_Category0, locale0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      assertNotNull(fastDateFormat0);
      
      MockDate mockDate0 = new MockDate(10, 10, 0, 10, 0);
      String string0 = fastDateFormat0.format((Date) mockDate0);
      assertEquals("10-10-31 10:00", string0);
      assertEquals(14, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINA;
      FastDateFormat fastDateFormat0 = new FastDateFormat("", timeZone0, locale0);
      int int0 = fastDateFormat0.getMaxLengthEstimate();
      assertTrue(fastDateFormat0.getTimeZoneOverridesCalendar());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.US;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, locale0);
      fastDateFormat0.getTimeZoneOverridesCalendar();
      assertEquals("EEEE, MMMM d, yyyy h:mm:ss a z", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = new Locale("|hRCsH-JEV ?3", "q#~Dvuv30P%YZ");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, locale0);
      Long long0 = new Long(0);
      StringBuffer stringBuffer0 = new StringBuffer("Q#~DVUV30P%YZ");
      FieldPosition fieldPosition0 = new FieldPosition(941);
      fastDateFormat0.format((Object) long0, stringBuffer0, fieldPosition0);
      assertEquals(54, stringBuffer0.length());
      assertEquals("Q#~DVUV30P%YZThursday, January 1, 1970 12:00:00 AM GMT", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1);
      Locale locale0 = Locale.ITALY;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      String string0 = fastDateFormat0.format((Calendar) mockGregorianCalendar0);
      assertEquals("February 14, 2014", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("</nXGFL#", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: n
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINA;
      FastDateFormat fastDateFormat0 = new FastDateFormat("", timeZone0, locale0);
      ParsePosition parsePosition0 = new ParsePosition(11);
      fastDateFormat0.parseObject("", parsePosition0);
      assertEquals(0, parsePosition0.getIndex());
      assertEquals(0, parsePosition0.getErrorIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, locale0);
      fastDateFormat0.getLocale();
      assertEquals("EEEE d MMMM yyyy H.mm.ss z", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.US;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, locale0);
      String string0 = fastDateFormat0.getPattern();
      assertEquals("EEEE, MMMM d, yyyy h:mm:ss a z", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1, timeZone0);
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateInstance(1);
      assertEquals(20, fastDateFormat1.getMaxLengthEstimate());
      
      FastDateFormat fastDateFormat2 = FastDateFormat.getTimeInstance(0);
      assertEquals("h:mm:ss a z", fastDateFormat2.getPattern());
      
      timeZone0.getDisplayName();
      fastDateFormat0.equals((Object) null);
      assertEquals(20, fastDateFormat0.getMaxLengthEstimate());
      
      Locale locale0 = Locale.ENGLISH;
      FastDateFormat fastDateFormat3 = FastDateFormat.getDateInstance(3, locale0);
      fastDateFormat3.getTimeZone();
      assertEquals(10, fastDateFormat3.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("Z");
      TimeZone timeZone0 = TimeZone.getTimeZone("+0000");
      Locale locale0 = Locale.ROOT;
      FastDateFormat fastDateFormat1 = new FastDateFormat("Z", timeZone0, locale0);
      fastDateFormat0.equals(fastDateFormat1);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
      assertEquals(5, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("k");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      StringBuffer stringBuffer0 = new StringBuffer(3);
      fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals(2, stringBuffer0.length());
      assertEquals("20", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      Locale locale0 = Locale.UK;
      FastDateFormat.getTimeInstance(0, locale0);
      fastDateFormat0.getTimeZone();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 3, 0);
      DateFormatSymbols dateFormatSymbols0 = new DateFormatSymbols();
      MockSimpleDateFormat mockSimpleDateFormat0 = null;
      try {
        mockSimpleDateFormat0 = new MockSimpleDateFormat("org.apache.commons.lang.time.FastDateFormat$TwoDigitYearField", dateFormatSymbols0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'o'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      locale0.toLanguageTag();
      locale0.getDisplayName();
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      locale0.getExtensionKeys();
      LinkedHashSet<Locale> linkedHashSet0 = new LinkedHashSet<Locale>();
      Locale locale1 = Locale.KOREAN;
      linkedHashSet0.add(locale1);
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) linkedHashSet0, locale_FilteringMode0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 1, locale0);
      fastDateFormat0.getTimeZone();
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance(1, 4119);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 4119
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
      assertNotSame(fastDateFormat1, fastDateFormat0);
      assertEquals(21, fastDateFormat1.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The pattern must not be null
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("*:=A{_ /xq");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: A
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("|sMBm7r6gS");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: B
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("C8NSILB.-.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: C
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = Locale.CHINA;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("  D59uzgr\"7|v", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: u
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, locale0);
      List list0 = fastDateFormat0.parsePattern();
      assertEquals(15, list0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("{!9}. d)MFs >Yn", (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Y
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINA;
      FastDateFormat fastDateFormat0 = new FastDateFormat("]y,GM5v(> ", timeZone0, locale0);
      // Undeclared exception!
      try { 
        fastDateFormat0.parsePattern();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: v
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "*[aNQ6O}.?r5Zd|e\"");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("WILOZ", (TimeZone) simpleTimeZone0, (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Jh%ojgagei)");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: J
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("zKL:_~`o8!b;[NsAD");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: L
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("{\"0NFNL4&");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: N
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("O6g");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("11:59:58 PM");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: P
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("MMM d, yyyy");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("4Q@,#s", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Q
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Re", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: R
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("S3k-8,T9RC_bns^IRfC", (TimeZone) simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("\"}U$/1[c:`u/A3", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: U
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("V8-L_@G%YZUd\"8C", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: V
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("7b", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("chinois (Chine)");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: c
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("he alidated object is null", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: e
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("f_Q/*[P;2;/CIK QJuR");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: f
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("g");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: g
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("?0%iqE%Snf.", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: i
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("j.e1#nEJ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: j
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("<{l5b[oS_,sEJw");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: l
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Locale locale0 = new Locale("", "UC;F#eu-`W\"QsCr`Q{J");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("org.apache.commons.lang.time.FastDateFormat$PaddedNumberField", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(":p%gH96nD2[)S3HA~FJ", (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: p
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("q");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: q
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("rq", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: r
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(" at index: ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(12, "wYQ99NM");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("wYQ99NM", (TimeZone) simpleTimeZone0, (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Y
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("wx _");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: x
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(2, 0);
      assertEquals("MMM d, yyyy h:mm:ss a z", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("^&6EXd");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: X
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("ZZ");
      String string0 = fastDateFormat0.format((long) 2);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      locale0.toLanguageTag();
      locale0.getDisplayName();
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      locale0.getExtensionKeys();
      LinkedHashSet<Locale> linkedHashSet0 = new LinkedHashSet<Locale>();
      Locale locale1 = Locale.CHINA;
      linkedHashSet0.add(locale1);
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) linkedHashSet0, locale_FilteringMode0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 1, locale0);
      fastDateFormat0.toString();
      StringWriter stringWriter0 = null;
      try {
        stringWriter0 = new StringWriter((-141));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative buffer size
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      MockDate mockDate0 = new MockDate(0);
      AttributedCharacterIterator attributedCharacterIterator0 = fastDateFormat0.formatToCharacterIterator(mockDate0);
      assertEquals(15, attributedCharacterIterator0.getRunLimit());
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", (TimeZone) null, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      StringBuffer stringBuffer0 = new StringBuffer();
      FieldPosition fieldPosition0 = new FieldPosition((Format.Field) null, 1411);
      fastDateFormat0.format((Object) mockGregorianCalendar0, stringBuffer0, fieldPosition0);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      Locale locale0 = Locale.UK;
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: java.util.Locale
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, locale0);
      // Undeclared exception!
      try { 
        fastDateFormat0.formatToCharacterIterator((Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: <null>
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1, timeZone0);
      Locale locale0 = Locale.PRC;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      // Undeclared exception!
      try { 
        fastDateFormat0.format(calendar0, (StringBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat$UnpaddedNumberField", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateInstance(1);
      assertNotNull(fastDateFormat1);
      
      boolean boolean0 = fastDateFormat1.equals(fastDateFormat0);
      assertEquals(20, fastDateFormat1.getMaxLengthEstimate());
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Locale locale0 = Locale.UK;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", locale0);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(3, "");
      FastDateFormat fastDateFormat1 = new FastDateFormat("", simpleTimeZone0, locale0);
      boolean boolean0 = fastDateFormat0.equals(fastDateFormat1);
      assertFalse(boolean0);
      assertTrue(fastDateFormat1.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", locale0);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, locale0);
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat1 = FastDateFormat.getTimeInstance(0, timeZone0, locale0);
      boolean boolean0 = fastDateFormat0.equals(fastDateFormat1);
      assertEquals(15, fastDateFormat1.getMaxLengthEstimate());
      assertEquals(16, fastDateFormat0.getMaxLengthEstimate());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateTimeInstance(3, 3);
      fastDateFormat1.equals(fastDateFormat0);
      assertEquals(21, fastDateFormat1.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("S");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      StringBuffer stringBuffer0 = new StringBuffer();
      fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals(3, stringBuffer0.length());
      assertEquals("320", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", locale0);
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, timeZone0, locale0);
      MockDate mockDate0 = new MockDate(2, 310, 2);
      String string0 = fastDateFormat0.format((Date) mockDate0);
      assertEquals("1927\u5E7411\u67082\u65E5 \u661F\u671F\u4E09", string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Locale locale0 = Locale.US;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 12, 0);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "Friday, October 15, 1582 12:00:00 AM GMT");
      fastDateFormat0.applyRules(mockGregorianCalendar0, stringBuffer0);
      assertEquals(83, stringBuffer0.length());
      assertEquals("EEEE, MMMM d, yyyy h:mm:ss a z", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(2, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1361, 3, 13, (-1), 2);
      StringBuffer stringBuffer0 = new StringBuffer(99);
      fastDateFormat0.applyRules(mockGregorianCalendar0, stringBuffer0);
      assertEquals(8, stringBuffer0.length());
      assertEquals("yyyy/M/d", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("k");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 312, 2, 312, 1, 312);
      StringBuffer stringBuffer0 = new StringBuffer(3);
      fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals("24", stringBuffer0.toString());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-61282569228000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=28,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=15,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=6,SECOND=12,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, timeZone0, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 3, 13, (-1), 2);
      StringBuffer stringBuffer0 = new StringBuffer(99);
      fastDateFormat0.applyRules(mockGregorianCalendar0, stringBuffer0);
      assertEquals("\u4E0B\u534812\u664259\u520602\u79D2 GMT", stringBuffer0.toString());
      assertEquals(15, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("Z");
      String string0 = fastDateFormat0.format((long) 2);
      assertEquals("+0000", string0);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat.getInstance("", timeZone0);
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance(1, (-2669), timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style -2669
         //
         verifyException("java.text.DateFormat", e);
      }
  }
}