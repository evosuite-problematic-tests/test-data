/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 11:55:14 GMT 2018
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
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
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
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(88, 0, 88);
      StringBuffer stringBuffer0 = new StringBuffer("");
      fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals(30, stringBuffer0.length());
      assertEquals("MMMM d, yyyy h:mm:ss a z", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      FastDateFormat.getInstance("7}akj", locale0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("EEEE, MM}MM d, yy", locale0);
      MockDate mockDate0 = new MockDate((-591), 0, (-2016));
      StringBuffer stringBuffer0 = new StringBuffer();
      fastDateFormat0.format((Date) mockDate0, stringBuffer0);
      assertEquals(17, stringBuffer0.length());
      assertEquals("\u661F\u671F\u4E8C, 06}06 25, 03", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "Illegal pattern component: ", 0, 0, 2669, 7, 0, 1, 0, 3);
      Locale locale0 = Locale.KOREAN;
      FastDateFormat.getInstance("<,SE_x3)0KqG?K", (TimeZone) simpleTimeZone0, locale0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "vUj:SHgUOI7Kw1b0");
      Locale locale0 = Locale.GERMANY;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, (TimeZone) simpleTimeZone0, locale0);
      String string0 = fastDateFormat0.getPattern();
      assertEquals("EEEE, d. MMMM yyyy", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours(0);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, timeZone0);
      Locale locale0 = fastDateFormat0.getLocale();
      assertEquals("en", locale0.getLanguage());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      ParsePosition parsePosition0 = new ParsePosition(1);
      Object object0 = fastDateFormat0.parseObject("pattern must not be null", parsePosition0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1);
      assertEquals("h:mm:ss a z", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(109, "");
      Locale locale0 = Locale.GERMAN;
      FastDateFormat fastDateFormat0 = new FastDateFormat("", simpleTimeZone0, locale0);
      String string0 = fastDateFormat0.toString();
      assertEquals("FastDateFormat[]", string0);
      assertEquals(0, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      int int0 = fastDateFormat0.getMaxLengthEstimate();
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours(0);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, timeZone0);
      fastDateFormat0.getTimeZone();
      assertEquals("h:mm:ss a z", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      fastDateFormat0.hashCode();
      assertEquals("M/d/yy h:mm a", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "vUj:SHgUOI7Kw1b0");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, (TimeZone) simpleTimeZone0);
      assertEquals(31, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, locale0);
      String string0 = fastDateFormat0.format((long) 0);
      assertEquals("0.00.00 GMT", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, (TimeZone) null);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      String string0 = fastDateFormat0.format((Calendar) mockGregorianCalendar0);
      assertEquals("Friday, February 14, 2014 8:21:21 PM GMT", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "u2v-ffk{S");
      FastDateFormat.getInstance("u2v-ffk{S", (TimeZone) simpleTimeZone0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.forLanguageTag("-|0Y%v8@_jO");
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeInstance((-2432), timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style -2432
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FastDateFormat.getInstance("9FN?y$,");
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, locale0);
      MockDate mockDate0 = new MockDate((-1), 0, 0);
      StringBuffer stringBuffer0 = new StringBuffer("Japanese");
      fastDateFormat0.format((Date) mockDate0, stringBuffer0);
      assertEquals("Japanese1898\u5E7412\u670831\u65E5", stringBuffer0.toString());
      assertEquals(19, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("/zbg");
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeZoneDisplay((TimeZone) null, true, 2, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FastDateFormat.getInstance("S$)mAHiwNx'UZQ)A$");
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FastDateFormat.getInstance("FB?;$,");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.JAPANESE;
      FastDateFormat fastDateFormat0 = null;
      try {
        fastDateFormat0 = new FastDateFormat("dECl;vOVH+*P", timeZone0, locale0);
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
      Locale locale0 = Locale.CANADA;
      FastDateFormat.getInstance("D>$L\"!}%F,!cU_", locale0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = new Locale("!Lb+r,Bn'NgDDJ", "!Lb+r,Bn'NgDDJ");
      FastDateFormat.getInstance("GMT", locale0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      FastDateFormat.getInstance("aSa#HJ", locale0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      FastDateFormat.getInstance("I8", locale0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ENGLISH;
      FastDateFormat.getInstance("=ZdK93Y#VM;rn#c", timeZone0, locale0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.JAPANESE;
      FastDateFormat fastDateFormat0 = null;
      try {
        fastDateFormat0 = new FastDateFormat("O9", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("TjQ' |HR~j");
      FastDateFormat.getInstance("P8c\n#", timeZone0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FastDateFormat.getInstance("QC:)&g+X\"*9?MPNmO");
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "hR.,6");
      Locale locale0 = new Locale("hR.,6", "hR.,6", "org.apache.commons.lang3.time.FastDateFormat$TwoDigitMonthField");
      FastDateFormat fastDateFormat0 = null;
      try {
        fastDateFormat0 = new FastDateFormat("hR.,6", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: R
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      FastDateFormat.getInstance("[Up)", locale0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("V,e2Ftb[Ahh9z4AD:a");
      FastDateFormat.getInstance("V,e2Ftb[Ahh9z4AD:a", locale0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat.getInstance("3y+XeUM", timeZone0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FastDateFormat.getInstance("d.!bndT");
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(4, "");
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDateFormat.getInstance("c.4CST>>`", (TimeZone) simpleTimeZone0, locale0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FastDateFormat.getInstance("e$N<#[uVYnI");
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FastDateFormat.getInstance("fFN?y$,");
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      FastDateFormat.getInstance("gDZ", locale0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FastDateFormat.getInstance("i7t #S;");
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.JAPANESE;
      FastDateFormat fastDateFormat0 = null;
      try {
        fastDateFormat0 = new FastDateFormat("l", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: l
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("A");
      Locale locale0 = Locale.CHINA;
      FastDateFormat fastDateFormat0 = null;
      try {
        fastDateFormat0 = new FastDateFormat("$n;`?cUO@$N\"ZGL%", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: n
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FastDateFormat.getInstance("org.apache.commons.lang3.time.FormatCache");
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("pattern must not be null");
      FastDateFormat.getInstance("pattern must not be null", timeZone0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FastDateFormat.getInstance("9qeFN?y$,");
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FastDateFormat.getInstance("r|1");
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      FastDateFormat fastDateFormat0 = null;
      try {
        fastDateFormat0 = new FastDateFormat("FastDateFormat[", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat.getInstance("%vD~j=uY>UL@M>v<b-;", timeZone0, (Locale) null);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, locale0);
      StringBuffer stringBuffer0 = new StringBuffer(0);
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) locale0, stringBuffer0, fieldPosition0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: java.util.Locale
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, locale0);
      MockDate mockDate0 = new MockDate();
      AttributedCharacterIterator attributedCharacterIterator0 = fastDateFormat0.formatToCharacterIterator(mockDate0);
      assertEquals(15, attributedCharacterIterator0.getRunLimit());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Locale locale0 = Locale.US;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm:ss a z", locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(386, 3, 1794, 1794, 0);
      StringWriter stringWriter0 = new StringWriter(114);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0);
      fastDateFormat0.format((Object) mockGregorianCalendar0, stringBuffer0, fieldPosition0);
      assertEquals("Monday, May 12, 0391 6:00:00 PM GMT", stringBuffer0.toString());
      assertEquals("Monday, May 12, 0391 6:00:00 PM GMT", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      Long long0 = new Long(0L);
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0, (-1528));
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) long0, (StringBuffer) null, fieldPosition0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat$UnpaddedMonthField", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, locale0);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "0.00.00 GMT");
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
  public void test54()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1, timeZone0);
      boolean boolean0 = fastDateFormat0.equals(fastDateFormat0);
      assertEquals("MMMM d, yyyy h:mm:ss a z", fastDateFormat0.getPattern());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(88, 0, 7);
      boolean boolean0 = fastDateFormat0.equals(mockGregorianCalendar0);
      assertFalse(boolean0);
      assertEquals(38, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0);
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
      fastDateFormat0.equals(fastDateFormat1);
      assertEquals("EEEE, MMMM d, yyyy h:mm:ss a z", fastDateFormat0.getPattern());
      assertEquals(21, fastDateFormat1.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.JAPAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1, timeZone0);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1347), "|cgm");
      FastDateFormat fastDateFormat1 = new FastDateFormat("MMMM d, yyyy h:mm:ss a z", simpleTimeZone0, locale0);
      boolean boolean0 = fastDateFormat0.equals(fastDateFormat1);
      assertEquals(38, fastDateFormat1.getMaxLengthEstimate());
      assertFalse(boolean0);
      assertEquals("MMMM d, yyyy h:mm:ss a z", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1);
      Locale locale0 = new Locale("!Lb+r,Bn'NgDDJ", "!Lb+r,Bn'NgDDJ");
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateTimeInstance(1, 1, locale0);
      boolean boolean0 = fastDateFormat0.equals(fastDateFormat1);
      assertFalse(boolean0);
      assertEquals(38, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("^4m|S6Dh", locale0);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "^4m|S6Dh");
      fastDateFormat0.format((-1501L), stringBuffer0);
      assertEquals(22, stringBuffer0.length());
      assertEquals("^4m|S6Dh^459|499636511", stringBuffer0.toString());
  }
}
