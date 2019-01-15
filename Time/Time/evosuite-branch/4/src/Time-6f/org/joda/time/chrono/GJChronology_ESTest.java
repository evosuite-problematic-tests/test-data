/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 18:55:15 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.Instant;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null);
      gJChronology0.hashCode();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      boolean boolean0 = dateTimeField0.isLenient();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      Locale locale0 = Locale.TAIWAN;
      String string0 = dateTimeField0.getAsShortText(0, locale0);
      assertEquals("0", string0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      Partial partial0 = new Partial();
      dateTimeField0.getMinimumValue((ReadablePartial) partial0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      Locale locale0 = Locale.GERMAN;
      dateTimeField0.getMaximumShortTextLength(locale0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, (-60), gJChronology0);
      int int0 = dateTimeField0.getMaximumValue((ReadablePartial) partial0);
      assertEquals(52, int0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      int int0 = dateTimeField0.getDifference(1122L, (-28800000L));
      assertEquals(0, int0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      dateTimeField0.getMaximumTextLength((Locale) null);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      long long0 = dateTimeField0.add(365L, 60);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(36288000365L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      long long0 = dateTimeField0.add(31557600000L, (-4340L));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-2593274400000L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      Locale locale0 = Locale.TAIWAN;
      String string0 = dateTimeField0.getAsText(1970, locale0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals("1970", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      long long0 = dateTimeField0.getDifferenceAsLong(615L, 120L);
      assertEquals(0L, long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Period period0 = new Period((-61964502833940L));
      int[] intArray0 = gJChronology0.get((ReadablePeriod) period0, (long) 6, (-61964330033940L));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertArrayEquals(new int[] {(-1963), (-6), (-3), (-1), (-17), (-53), (-53), (-946)}, intArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        GJChronology.getInstance(dateTimeZone0, (-79303104000000L), 77);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cutover too early. Must be on or after 0001-01-01.
         //
         verifyException("org.joda.time.chrono.GJChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Instant instant0 = GJChronology.DEFAULT_CUTOVER;
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      long long0 = gJChronology0.julianToGregorianByWeekyear((-476L));
      assertEquals((-1209600476L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        GJChronology.getInstance(dateTimeZone0, (-12219292800000L), (-838));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: -838
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null);
      GJChronology gJChronology1 = (GJChronology)gJChronology0.withZone((DateTimeZone) null);
      assertEquals(4, gJChronology1.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) null);
      long long0 = gJChronology0.getDateTimeMillis(4846, 1, 5, 5);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(90758188800005L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      long long0 = gJChronology0.getDateTimeMillis(1, 1, 1, 93);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-62135741221907L), long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(4);
      DateTime dateTime0 = DateTime.now();
      Instant instant0 = dateTime0.toInstant();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      try { 
        gJChronology0.getDateTimeMillis(1192, 120, (-1034), 4, 2453, (-163), 4466);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2453 for minuteOfHour must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null);
      try { 
        gJChronology0.getDateTimeMillis(29, 2, 29, 6, 29, 29, 6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 29 for dayOfMonth must be in the range [1,28]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      try { 
        gJChronology0.getDateTimeMillis(2, 2, 2, 2, 2, 91, (-2004318070));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 91 for secondOfMinute must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      long long0 = gJChronology0.getDateTimeMillis(6, 6, 6, 6, 6, 6, 60);
      assertEquals((-61964502833940L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(4);
      DateTime dateTime0 = DateTime.now();
      Instant instant0 = dateTime0.toInstant();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      boolean boolean0 = gJChronology0.equals(dateTime0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      boolean boolean0 = gJChronology0.equals(gJChronology0);
      assertTrue(boolean0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      GJChronology gJChronology1 = GJChronology.getInstance(dateTimeZone0, (long) 1, 1);
      boolean boolean0 = gJChronology0.equals(gJChronology1);
      assertFalse(boolean0);
      assertEquals(1, gJChronology1.getMinimumDaysInFirstWeek());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      GJChronology gJChronology1 = GJChronology.getInstanceUTC();
      boolean boolean0 = gJChronology0.equals(gJChronology1);
      assertEquals(4, gJChronology1.getMinimumDaysInFirstWeek());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) null);
      GJChronology gJChronology1 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) null, 1);
      boolean boolean0 = gJChronology0.equals(gJChronology1);
      assertFalse(boolean0);
      assertFalse(gJChronology1.equals((Object)gJChronology0));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[America/Los_Angeles]", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(4);
      DateTime dateTime0 = DateTime.now();
      Instant instant0 = dateTime0.toInstant();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[+00:00:00.004,cutover=1970-01-01]", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (long) 1, 1);
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[+01:00,cutover=1970-01-01T00:00:00.001Z,mdfw=1]", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Instant instant0 = new Instant();
      Duration duration0 = Duration.standardSeconds(2592000000L);
      Instant instant1 = instant0.plus((ReadableDuration) duration0);
      MutableDateTime mutableDateTime0 = instant1.toMutableDateTime(dateTimeZone0);
      MutableDateTime mutableDateTime1 = mutableDateTime0.copy();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) mutableDateTime1);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      Locale locale0 = Locale.TAIWAN;
      String string0 = dateTimeField0.getAsText((-12219292800000L), locale0);
      assertEquals("40", string0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      Locale locale0 = Locale.TAIWAN;
      String string0 = dateTimeField0.getAsText((-4340L), locale0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      String string0 = dateTimeField0.getAsShortText((-12219321178000L));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals("40", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      Locale locale0 = Locale.TAIWAN;
      String string0 = dateTimeField0.getAsShortText(1515L, locale0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      YearMonth yearMonth0 = YearMonth.now((Chronology) gJChronology0);
      Period period0 = Period.minutes(86399961);
      YearMonth yearMonth1 = yearMonth0.withPeriodAdded(period0, 6);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(2014, yearMonth1.getYear());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      long long0 = dateTimeField0.addWrapField((-12219292800000L), 681);
      assertEquals((-12239251200000L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      System.setCurrentTimeMillis((-12219292800000L));
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      // Undeclared exception!
      try { 
        gJChronology0.set(localDateTime0, (-3285L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 14 for dayOfMonth is not supported
         //
         verifyException("org.joda.time.chrono.GJChronology$CutoverField", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      long long0 = gJChronology0.set(localDateTime0, (-62141464680000L));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      // Undeclared exception!
      try { 
        dateTimeField0.set((-61846983469990L), "GJChronology[America/Los_Angeles]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"GJChronology[America/Los_Angeles]\" for weekOfWeekyear is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      Locale locale0 = Locale.PRC;
      long long0 = dateTimeField0.set((-28802131L), "1", locale0);
      assertEquals((-28802131L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      dateTimeField0.isLeap((-12219292800000L));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      dateTimeField0.isLeap(1515L);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      dateTimeField0.getLeapAmount((-12219349556000L));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      dateTimeField0.getLeapAmount((-4340L));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      long long0 = dateTimeField0.addWrapField((-4340L), (-704));
      assertEquals(22978795660L, long0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gJChronology0);
      int[] intArray0 = new int[8];
      intArray0[0] = 13;
      intArray0[1] = 13;
      // Undeclared exception!
      try { 
        dateTimeField0.addWrapPartial(localDateTime0, 13, intArray0, 13);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for dayOfMonth must be in the range [1,31]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      long long0 = dateTimeField0.roundCeiling((-12219321178000L));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-12219005222000L), long0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      long long0 = dateTimeField0.roundHalfFloor(1515L);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-230400000L), long0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth((Chronology) gJChronology0);
      YearMonth yearMonth1 = yearMonth0.plusMonths((-2147483646));
      assertEquals(8, yearMonth1.getMonthOfYear());
      assertEquals((-178954958), yearMonth1.getYear());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      Period period0 = Period.minutes((-2144));
      int[] intArray0 = gJChronology0.get((ReadablePeriod) period0, (-136296172800000L), 535L);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertArrayEquals(new int[] {4318, 11, 4, 2, 23, 52, 58, 535}, intArray0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      MutablePeriod mutablePeriod0 = new MutablePeriod((byte) (-7), 127, (-1073741823), 3600, 5344, 1, 1582, 1268);
      long long0 = gJChronology0.add((ReadablePeriod) mutablePeriod0, 0L, (int) (byte) (-1));
      assertEquals(649398611086356732L, long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      MutablePeriod mutablePeriod0 = new MutablePeriod((byte) (-7), 128, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte) (-7));
      long long0 = gJChronology0.add((ReadablePeriod) mutablePeriod0, (long) (byte) (-7), 128);
      assertEquals(14810601599097L, long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) null);
      Minutes minutes0 = Minutes.MIN_VALUE;
      Duration duration0 = minutes0.toStandardDuration();
      Period period0 = new Period((ReadableInstant) null, duration0);
      Period period1 = period0.plusMonths(414);
      long long0 = gJChronology0.add((ReadablePeriod) period1, (long) 414, 414);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-52893819484811586L), long0);
  }
}
