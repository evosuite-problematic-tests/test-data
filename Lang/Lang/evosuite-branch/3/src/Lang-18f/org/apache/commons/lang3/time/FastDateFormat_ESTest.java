/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 12:42:24 GMT 2019
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang3.time.FastDateFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FastDateFormat_ESTest extends FastDateFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      FastDateFormat fastDateFormat0 = new FastDateFormat("k", (TimeZone) null, locale0);
      assertEquals(4, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 2, locale0);
      MockDate mockDate0 = new MockDate(3336, 1, (-253));
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      fastDateFormat0.format((Date) mockDate0, stringBuffer0);
      assertEquals("5235/05/23 0:00:00", stringBuffer0.toString());
      assertEquals("5235/05/23 0:00:00", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      Locale locale0 = fastDateFormat0.getLocale();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "");
      FastDateFormat.getInstance("", (TimeZone) simpleTimeZone0, locale0);
      assertEquals("EEEE, MMMM d, yyyy", fastDateFormat0.getPattern());
      assertEquals(31, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      String string0 = fastDateFormat0.getPattern();
      assertEquals("M/d/yy h:mm a", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeInstance((-1), timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style -1
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, (TimeZone) null, locale0);
      ParsePosition parsePosition0 = new ParsePosition(1);
      fastDateFormat0.parseObject("lundi 12 janvier 0007", parsePosition0);
      assertEquals(28, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(3);
      LinkedList<Locale> linkedList0 = new LinkedList<Locale>();
      boolean boolean0 = fastDateFormat0.equals(linkedList0);
      assertFalse(boolean0);
      assertEquals(10, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(3, locale0);
      assertEquals("dd.MM.yy", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      String string0 = fastDateFormat0.toString();
      assertEquals("FastDateFormat[M/d/yy h:mm a]", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.US;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, locale0);
      int int0 = fastDateFormat0.getMaxLengthEstimate();
      assertEquals(49, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("& n >ZS");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      String string0 = fastDateFormat0.format((Calendar) mockGregorianCalendar0);
      assertEquals("Friday, February 14, 2014 8:21:21 PM GMT", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0);
      fastDateFormat0.getTimeZone();
      assertEquals(17, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1, locale0);
      fastDateFormat0.hashCode();
      assertEquals(32, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours(1);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1, timeZone0);
      assertEquals("MMMM d, yyyy", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, locale0);
      assertEquals(13, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      FastDateFormat.getInstance("9t6ix])!c?nvYMxtYg", timeZone0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(2, 2);
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours(1);
      // Undeclared exception!
      try { 
        fastDateFormat0.formatToCharacterIterator(zoneOffset0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: java.time.ZoneOffset
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.JAPANESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, timeZone0, locale0);
      assertEquals("H'\u6642'mm'\u5206'ss'\u79D2' z", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FastDateFormat.getInstance("Cr!]-Y.Tc?", (Locale) null);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FastDateFormat.getInstance("<DZ<S`q]P[tgwN\"");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FastDateFormat.getInstance("FastDateFormat[");
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FastDateFormat.getInstance("GsNGG2pIYV~J&;JFBz");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      FastDateFormat.getInstance("0zItI_W~{4", locale0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FastDateFormat.getInstance("J i-O8x;z7|S\"i(^");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = new Locale("KZr", "KZr");
      FastDateFormat.getInstance("KZr", locale0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FastDateFormat.getInstance("\".L6\")Ed{&\"Z");
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      FastDateFormat.getInstance("@=)4MiI;wsPxwZI[", locale0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      FastDateFormat.getInstance("5O5gLus;E|<~Mq;`VzA", locale0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDateFormat fastDateFormat0 = null;
      try {
        fastDateFormat0 = new FastDateFormat(",ahP8lBuIWmp`:K", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: P
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FastDateFormat.getInstance("Qsya}M`Kmz&cQ");
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FastDateFormat.getInstance("Rx{Ihp's<4xjRZ-(C");
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat.getInstance("T\"|]l", timeZone0, locale0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FastDateFormat.getInstance("@U1");
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      FastDateFormat.getInstance("&Vo?S[kdrd.~;", locale0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Locale locale0 = Locale.UK;
      FastDateFormat.getInstance("WA=l?DT`/Mn", locale0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FastDateFormat.getInstance("1X<:|!PD?l]WD#1");
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Locale locale0 = new Locale("s!k~&z8)[YF", "s!k~&z8)[YF");
      FastDateFormat.getInstance("s!k~&z8)[YF", locale0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FastDateFormat.getInstance("w@b_4OLc");
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FastDateFormat.getInstance("ZZc2r");
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      FastDateFormat.getInstance("kex6S*rQH0}L %", locale0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      FastDateFormat.getInstance("f/akVMlX0lbWg`ab", locale0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FastDateFormat.getInstance("&y1g.veR@");
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(10, ">_+f[r");
      Locale locale0 = Locale.forLanguageTag("The validated object is null");
      FastDateFormat.getInstance("j?Aa[:gEN1 Q", (TimeZone) simpleTimeZone0, locale0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("*|>A^L5}");
      FastDateFormat.getInstance("(lr1", locale0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Locale locale0 = new Locale("'JTvagy54@b_;-");
      FastDateFormat.getInstance("<null>", locale0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FastDateFormat.getInstance("org.apache.commons.lang3.time.FastDateFormat$TimeZoneDisplayKey");
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FastDateFormat.getInstance(">pZ'-3CCVAGFSs N1r|");
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FastDateFormat.getInstance("Du,F3o3r");
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      FastDateFormat.getInstance("k%v(obDJ", locale0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Locale locale0 = new Locale("8M}x#_V", "", "");
      FastDateFormat.getInstance("8M}x#_V", locale0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FastDateFormat.getInstance("zzzzB2c!&1w]S=");
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 2, 2);
      StringBuffer stringBuffer0 = new StringBuffer(2);
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0, 1);
      fastDateFormat0.format((Object) mockGregorianCalendar0, stringBuffer0, fieldPosition0);
      assertEquals(15, stringBuffer0.length());
      assertEquals("3/2/03 12:00 AM", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FieldPosition fieldPosition0 = new FieldPosition(1);
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("EEEE, MMMM d, yyyy");
      Long long0 = new Long(3);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) long0, (StringBuffer) null, fieldPosition0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat$TextField", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1, locale0);
      StringBuffer stringBuffer0 = new StringBuffer("r");
      FieldPosition fieldPosition0 = new FieldPosition(906);
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
  public void test54()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      boolean boolean0 = fastDateFormat0.equals(fastDateFormat0);
      assertTrue(boolean0);
      assertEquals("M/d/yy h:mm a", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance("'JTvagy54@b_;-");
      fastDateFormat0.equals(fastDateFormat1);
      assertEquals(31, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      StringBuffer stringBuffer0 = new StringBuffer(1);
      MockDate mockDate0 = new MockDate((-1586L));
      FieldPosition fieldPosition0 = new FieldPosition(3);
      fastDateFormat0.format((Object) mockDate0, stringBuffer0, fieldPosition0);
      assertEquals(17, stringBuffer0.length());
      assertEquals("12/31/69 11:59 PM", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2, "1/1/70 12:00 AM", 0, 3, 1, 0, 0, 1, 3, 3);
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(2, 0, (TimeZone) simpleTimeZone0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, (-438), 105, 1, 0);
      StringWriter stringWriter0 = new StringWriter(3);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals(33, stringBuffer0.length());
      assertEquals("MMM d, yyyy h:mm:ss a z", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      MockDate mockDate0 = new MockDate((-1448), 7, 1, (-1448), 0);
      String string0 = fastDateFormat0.format((Date) mockDate0);
      assertEquals("Sunday, June 1, 0452", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("0Kk");
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "0Kk");
      fastDateFormat0.format((long) 2, stringBuffer0);
      assertEquals(7, stringBuffer0.length());
      assertEquals("0Kk0024", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2, "1/1/70 12:00 AM", 0, 3, 1, 0, 0, 1, 3, 3);
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(2, 0, (TimeZone) simpleTimeZone0);
      String string0 = fastDateFormat0.format((-1884L));
      assertEquals("Jan 1, 1970 12:59:58 AM GMT+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("Z`");
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "Z`");
      fastDateFormat0.format((-980L), stringBuffer0);
      assertEquals("Z`+0000`", stringBuffer0.toString());
      assertEquals(8, stringBuffer0.length());
  }
}