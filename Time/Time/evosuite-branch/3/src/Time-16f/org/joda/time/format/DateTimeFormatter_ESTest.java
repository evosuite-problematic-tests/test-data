/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 19:42:10 GMT 2019
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.Partial;
import org.joda.time.ReadWritableInstant;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTimeFormatter_ESTest extends DateTimeFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Partial partial0 = new Partial(dateTimeFieldType0, (-3913), copticChronology0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      dateTimeFormatter0.getChronology();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      DateTimeFormatterBuilder.UnpaddedNumber dateTimeFormatterBuilder_UnpaddedNumber0 = new DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType0, 3949, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_UnpaddedNumber0, dateTimeFormatterBuilder_UnpaddedNumber0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalDate("]e9z*c 6AJY=dNP$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"]e9z*c 6AJY=dNP$\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(693, hashMap0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneName0);
      MockFile mockFile0 = new MockFile("O*ll8JX$|-gYvy$QG", "O*ll8JX$|-gYvy$QG");
      MockFileWriter mockFileWriter0 = new MockFileWriter(mockFile0, false);
      dateTimeFormatter0.printTo((Writer) mockFileWriter0, (long) 693);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, (DateTimeParser) null);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withDefaultYear((-2138));
      assertEquals((-2138), dateTimeFormatter1.getDefaultYear());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter1.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      DateTimeFormatterBuilder.Composite dateTimeFormatterBuilder_Composite0 = new DateTimeFormatterBuilder.Composite(linkedList0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_Composite0);
      DateTime dateTime0 = new DateTime(200L);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        dateTimeFormatter0.printTo((Writer) stringWriter0, (ReadableInstant) dateTime0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Printing not supported
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFormatterBuilder.CharacterLiteral dateTimeFormatterBuilder_CharacterLiteral0 = new DateTimeFormatterBuilder.CharacterLiteral('C');
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (-2428), (-2428));
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_CharacterLiteral0, dateTimeFormatterBuilder_Fraction0);
      StringBuffer stringBuffer0 = new StringBuffer();
      Instant instant0 = Instant.now();
      dateTimeFormatter0.printTo((Appendable) stringBuffer0, (ReadableInstant) instant0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(11, 11, 11);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormat_StyleFormatter0, dateTimeFormat_StyleFormatter0);
      boolean boolean0 = dateTimeFormatter0.isOffsetParsed();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Partial partial0 = new Partial(dateTimeFieldType0, (-3913), copticChronology0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      MockFile mockFile0 = new MockFile("-3913", "-3913");
      MockFileWriter mockFileWriter0 = new MockFileWriter(mockFile0, false);
      dateTimeFormatter0.printTo((Appendable) mockFileWriter0, (long) 1);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("MKzb!JS,PLn", ";]ps`c8U{LN\tY[>Z", false, 2000, 2000);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      MockDate mockDate0 = new MockDate();
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(mockDate0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("vsYW|+a`etgj|klhL");
      BufferedWriter bufferedWriter0 = new BufferedWriter(mockPrintWriter0);
      dateTimeFormatter0.printTo((Appendable) bufferedWriter0, (ReadablePartial) localDateTime0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("", "", false, 510, 510);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      int int0 = dateTimeFormatter0.getDefaultYear();
      assertEquals(2000, int0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(693, hashMap0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneName0);
      dateTimeFormatter0.getChronolgy();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFormatterBuilder.CharacterLiteral dateTimeFormatterBuilder_CharacterLiteral0 = new DateTimeFormatterBuilder.CharacterLiteral('f');
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_CharacterLiteral0, dateTimeFormatterBuilder_CharacterLiteral0);
      dateTimeFormatter0.getPivotYear();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = null;
      try {
        localDateTime0 = new LocalDateTime("minuteOfHour", dateTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"minuteOfHour\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 0, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_TwoDigitYear0);
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertFalse(boolean0);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Partial partial0 = new Partial(dateTimeFieldType0, (-3913), copticChronology0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      boolean boolean0 = dateTimeFormatter0.isPrinter();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, (DateTimeParser) null);
      boolean boolean0 = dateTimeFormatter0.isParser();
      assertFalse(boolean0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 0, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_TwoDigitYear0);
      boolean boolean0 = dateTimeFormatter0.isParser();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertTrue(boolean0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      Locale locale0 = Locale.GERMAN;
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      dateTimeFormatter1.withLocale((Locale) null);
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("Instant must not be null");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      Locale locale0 = new Locale("Instant must not be null", "Instant must not be null");
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withLocale(locale0);
      Locale locale1 = new Locale("Instant must not be null", "Instant must not be null");
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withLocale(locale1);
      assertEquals(2000, dateTimeFormatter2.getDefaultYear());
      assertNotSame(dateTimeFormatter2, dateTimeFormatter0);
      assertFalse(dateTimeFormatter2.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Partial partial0 = new Partial(dateTimeFieldType0, (-3913), copticChronology0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withOffsetParsed();
      assertTrue(dateTimeFormatter2.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter2.getDefaultYear());
      assertSame(dateTimeFormatter2, dateTimeFormatter1);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Partial partial0 = new Partial(dateTimeFieldType0, (-3913), copticChronology0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withChronology((Chronology) null);
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeFormatterBuilder.CharacterLiteral dateTimeFormatterBuilder_CharacterLiteral0 = new DateTimeFormatterBuilder.CharacterLiteral('C');
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (-2428), (-2428));
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_CharacterLiteral0, dateTimeFormatterBuilder_Fraction0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZone((DateTimeZone) null);
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset((String) null, (String) null, false, 901, 901);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 901, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TwoDigitYear0);
      Integer integer0 = new Integer(0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear(integer0);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear(0);
      assertFalse(dateTimeFormatter2.isOffsetParsed());
      assertSame(dateTimeFormatter2, dateTimeFormatter1);
      assertEquals(2000, dateTimeFormatter2.getDefaultYear());
      assertNotSame(dateTimeFormatter2, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset((String) null, "", true, (byte)41, 355);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withPivotYear((Integer) 1);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withPivotYear((-800));
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertEquals((-800), (int)dateTimeFormatter2.getPivotYear());
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertNotSame(dateTimeFormatter2, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeFormatterBuilder.CharacterLiteral dateTimeFormatterBuilder_CharacterLiteral0 = new DateTimeFormatterBuilder.CharacterLiteral('o');
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_CharacterLiteral0, dateTimeFormatterBuilder_CharacterLiteral0);
      StringBuffer stringBuffer0 = new StringBuffer("F+?knd*AAsV*P]Dfz");
      // Undeclared exception!
      try { 
        dateTimeFormatter0.printTo(stringBuffer0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The partial must not be null
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Partial partial0 = new Partial(dateTimeFieldType0, (-3913), copticChronology0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      MockFile mockFile0 = new MockFile("-3913", "-3913");
      MockFileWriter mockFileWriter0 = new MockFileWriter(mockFile0, false);
      dateTimeFormatter0.printTo((Writer) mockFileWriter0, (ReadablePartial) partial0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TextField0, dateTimeFormatterBuilder_TextField0);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      // Undeclared exception!
      try { 
        dateTimeFormatter0.printTo((Writer) charArrayWriter0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The partial must not be null
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, (DateTimeParser) null);
      MockFile mockFile0 = new MockFile((File) null, "years");
      MockFileWriter mockFileWriter0 = new MockFileWriter(mockFile0);
      dateTimeFormatter0.printTo((Writer) mockFileWriter0, (long) (-2138));
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      Partial partial0 = new Partial(localTime0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseInto((ReadWritableInstant) null, "", 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Instant must not be null
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (-2428), (-2428));
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_Fraction0, dateTimeFormatterBuilder_Fraction0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-3067));
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      int int0 = dateTimeFormatter1.parseInto(mutableDateTime0, ">n}zx|g5K'B YB-2R>\"", 5);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
      assertEquals((-6), int0);
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertTrue(dateTimeFormatter1.isOffsetParsed());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(689, hashMap0);
      hashMap0.put("", (DateTimeZone) null);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneName0);
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      int int0 = dateTimeFormatter0.parseInto(mutableDateTime0, "O*ll8JX:$|-gvvy$QG", 2);
      assertEquals(1392380481320L, mutableDateTime0.getMillis());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(693, hashMap0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneName0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
      MutableDateTime mutableDateTime0 = new MutableDateTime((long) 693);
      int int0 = dateTimeFormatter1.parseInto(mutableDateTime0, "d<A|lMV_<MKb", 1);
      assertEquals((-28799307L), mutableDateTime0.getMillis());
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("The partial must not be null");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      long long0 = dateTimeFormatter0.parseMillis("The partial must not be null");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(28800000L, long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 1807, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TwoDigitYear0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseMillis("11)aI%B)xWQD{Vz");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"11)aI%B)xWQD{Vz\" is malformed at \")aI%B)xWQD{Vz\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("org.joda.time.format.DateTimeFormatter");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.parseLocalDateTime("org.joda.time.format.DateTimeFormatter");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      DateTimeFormatterBuilder.PaddedNumber dateTimeFormatterBuilder_PaddedNumber0 = new DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, 2000, false, 2000);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_PaddedNumber0, dateTimeFormatterBuilder_PaddedNumber0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalDate("1k'D");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"1k'D\" is malformed at \"k'D\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("w/$/-@K", "w/$/-@K", true, 3235, 3235);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      dateTimeFormatter0.parseLocalDateTime("w/$/-@K");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName(689, hashMap0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneName0);
      hashMap0.put("O*ll8JX:$|-gvvy$QG", (DateTimeZone) null);
      dateTimeFormatter0.parseLocalDateTime("O*ll8JX:$|-gvvy$QG");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName((-121), hashMap0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneName0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseDateTime("+)AELVXo_");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+)AELVXo_\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutableDateTime.parse("0m");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"0m\" is malformed at \"m\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Partial partial0 = new Partial(dateTimeFieldType0, (-3913), copticChronology0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
      DateTime dateTime0 = dateTimeFormatter1.parseDateTime("-3913");
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertEquals((-185649638822000L), dateTime0.getMillis());
      assertTrue(dateTimeFormatter1.isOffsetParsed());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset((String) null, "", true, (byte)41, 355);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
      DateTime dateTime0 = dateTimeFormatter1.parseDateTime("");
      assertTrue(dateTimeFormatter1.isOffsetParsed());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertEquals(0L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("w/$/-@K", "w/$/-@K", true, 3235, 3235);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
      DateTime dateTime0 = dateTimeFormatter1.parseDateTime("w/$/-@K");
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertEquals(0L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("Instant must not be null");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseMutableDateTime("org.joda.time.DurationFieldType$StandardDurationFieldType");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"org.joda.time.DurationFieldType$...\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("", "", false, 510, 510);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseMutableDateTime("dayOfWeek");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"dayOfWeek\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneOffset dateTimeFormatterBuilder_TimeZoneOffset0 = new DateTimeFormatterBuilder.TimeZoneOffset("w/$/-@K", "w/$/-@K", true, 3235, 3235);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneOffset0, dateTimeFormatterBuilder_TimeZoneOffset0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
      MutableDateTime mutableDateTime0 = dateTimeFormatter1.parseMutableDateTime("w/$/-@K");
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertTrue(dateTimeFormatter1.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertEquals(0L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Partial partial0 = new Partial(dateTimeFieldType0, (-3913), copticChronology0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
      MutableDateTime mutableDateTime0 = dateTimeFormatter1.parseMutableDateTime("-3913");
      assertTrue(dateTimeFormatter1.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals((-185649638822000L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      hashMap0.put("<", (DateTimeZone) null);
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName((-121), hashMap0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneName0, dateTimeFormatterBuilder_TimeZoneName0);
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime("<");
      assertEquals(0L, mutableDateTime0.getMillis());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("org.joda.time.format.DateTimeFormatter");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZone(fixedDateTimeZone0);
      MutableDateTime mutableDateTime0 = dateTimeFormatter1.parseMutableDateTime("org.joda.time.format.DateTimeFormatter");
      assertFalse(dateTimeFormatter1.isOffsetParsed());
      assertEquals(2000, dateTimeFormatter1.getDefaultYear());
      assertEquals(0L, mutableDateTime0.getMillis());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, (DateTimeParser) null);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalTime("8 I'XJ");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Parsing not supported
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }
}