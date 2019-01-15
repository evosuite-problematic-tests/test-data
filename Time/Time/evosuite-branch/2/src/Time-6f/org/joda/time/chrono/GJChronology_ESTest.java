/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 23:35:17 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.Years;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.LenientChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (long) 1, 1);
      long long0 = gJChronology0.julianToGregorianByWeekyear((-2081L));
      assertEquals(1, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-1209602081L), long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTime dateTime0 = DateTime.now();
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateTime0, dateTime0, (PeriodType) null);
      int[] intArray0 = gJChronology0.get((ReadablePeriod) mutablePeriod0, (-39505376318680L), 86400000L);
      assertArrayEquals(new int[] {1251, 10, 3, 0, 3, 38, 38, 680}, intArray0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (long) 1, 1);
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[+00:00:00.001,cutover=1970-01-01T00:00:00.001Z,mdfw=1]", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (long) 1, 1);
      gJChronology0.hashCode();
      assertEquals(1, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      // Undeclared exception!
      try { 
        dateTime0.withWeekyear((-1262));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000-07:52:58 (BuddhistChronology[America/Los_Angeles])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.dayOfYear();
      String string0 = dateTimeField0.getAsShortText(2014, (Locale) null);
      assertEquals("2014", string0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      MonthDay monthDay0 = new MonthDay();
      MonthDay monthDay1 = monthDay0.withChronologyRetainFields(gJChronology0);
      MonthDay monthDay2 = monthDay1.minusDays((-340));
      assertEquals(20, monthDay2.getDayOfMonth());
      assertEquals(1, monthDay2.getMonthOfYear());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-868));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      DateTime dateTime0 = new DateTime(255, 1, 4, 255, 4, lenientChronology0);
      assertEquals((-71254803359132L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1487));
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (long) (-1487), 1);
      DateTime dateTime0 = new DateTime((Chronology) gJChronology0);
      Years years0 = Years.TWO;
      DateTime dateTime1 = dateTime0.withPeriodAdded(years0, (-1487));
      // Undeclared exception!
      try { 
        GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateTime1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cutover too early. Must be on or after 0001-01-01.
         //
         verifyException("org.joda.time.chrono.GJChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      // Undeclared exception!
      try { 
        GJChronology.getInstance(dateTimeZone0, (-12219292800000L), 11);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 11
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      GJChronology gJChronology1 = (GJChronology)gJChronology0.withZone((DateTimeZone) null);
      assertEquals(4, gJChronology1.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Object) null, gJChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1392409281320L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      try { 
        gJChronology0.getDateTimeMillis(11, 50, 30, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 50 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (long) 1, 1);
      long long0 = gJChronology0.getDateTimeMillis(9, 1, 9, 1);
      assertEquals((-61882617599999L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      try { 
        gJChronology0.getDateTimeMillis(1066, 1883, 60, 1970, 93, (-1875), 1883);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1970 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      try { 
        gJChronology0.getDateTimeMillis(2, 2, 93, 382, 2, 29, 1332);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 382 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      try { 
        gJChronology0.getDateTimeMillis(2, 2, 29, 29, 29, 29, 29);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 29 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      long long0 = gJChronology0.getDateTimeMillis(2, 2, 2, 2, 2, 2, 1);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-62101461477999L), long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      boolean boolean0 = gJChronology0.equals("org.joda.time.JodaTimePermission");
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      boolean boolean0 = gJChronology0.equals(gJChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      GJChronology gJChronology1 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null, 3);
      boolean boolean0 = gJChronology1.equals(gJChronology0);
      assertFalse(gJChronology0.equals((Object)gJChronology1));
      assertFalse(boolean0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (long) 1, 1);
      DateTime dateTime0 = new DateTime(0L, dateTimeZone0);
      GJChronology gJChronology1 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateTime0);
      boolean boolean0 = gJChronology0.equals(gJChronology1);
      assertEquals(4, gJChronology1.getMinimumDaysInFirstWeek());
      assertEquals(1, gJChronology0.getMinimumDaysInFirstWeek());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      GJChronology gJChronology1 = GJChronology.getInstance();
      boolean boolean0 = gJChronology0.equals(gJChronology1);
      assertFalse(boolean0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(4, gJChronology1.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[America/Los_Angeles]", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      DateTime dateTime0 = new DateTime(0L, dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateTime0);
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[+00:00:00.001,cutover=1970-01-01]", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      MonthDay monthDay0 = new MonthDay();
      MonthDay monthDay1 = monthDay0.withChronologyRetainFields(gJChronology0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(10800000L);
      MonthDay monthDay2 = monthDay1.withPeriodAdded(mutablePeriod0, 1);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(2, monthDay2.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth(1L);
      long long0 = gJChronology0.set(yearMonth0, (-39505376318680L));
      assertEquals((-1741118680L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) gJChronology0);
      int[] intArray0 = new int[4];
      intArray0[0] = 1;
      intArray0[1] = 1;
      intArray0[2] = 1;
      gJChronology0.validate(localDateTime0, intArray0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      DateTime dateTime1 = dateTime0.plusYears((-1262));
      assertEquals((-38432173540680L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      // Undeclared exception!
      try { 
        dateTime0.plusYears((-2872));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000-07:52:58 (BuddhistChronology[America/Los_Angeles])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTime dateTime0 = DateTime.now();
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateTime0, dateTime0, (PeriodType) null);
      int[] intArray0 = gJChronology0.get((ReadablePeriod) mutablePeriod0, (-39505376318680L), (-40200809918680L));
      assertArrayEquals(new int[] {(-22), 0, (-1), (-6), 0, 0, 0, 0}, intArray0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Years years0 = Years.THREE;
      long long0 = gJChronology0.add((ReadablePeriod) years0, 0L, 1498);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(141816960000000L, long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTime dateTime0 = DateTime.now();
      Duration duration0 = new Duration(86400043L);
      DateTime dateTime1 = dateTime0.withDurationAdded((ReadableDuration) duration0, 935);
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateTime1, dateTime0, (PeriodType) null);
      long long0 = gJChronology0.add((ReadablePeriod) mutablePeriod0, 86400043L, 935);
      assertEquals((-75383861191632L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1487));
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (long) (-1487), 1);
      Years years0 = Years.TWO;
      long long0 = gJChronology0.add((ReadablePeriod) years0, (-4294967296L), 2883);
      assertEquals(1, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(181951945032704L, long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1487));
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (long) (-1487), 1);
      Years years0 = Years.TWO;
      gJChronology0.get((ReadablePeriod) years0, (long) 1, (long) (-1487));
      assertEquals(1, gJChronology0.getMinimumDaysInFirstWeek());
  }
}
