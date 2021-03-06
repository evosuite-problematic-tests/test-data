/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 13:09:48 GMT 2018
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((Object) null, gJChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTime dateTime0 = DateTime.now((DateTimeZone) fixedDateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) dateTime0, 1);
      gJChronology0.hashCode();
      assertEquals(1, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      gJChronology0.equals((Object) null);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-831));
      DateMidnight dateMidnight0 = new DateMidnight(4723L);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateMidnight0);
      DateTime dateTime0 = new DateTime((-3259L), (Chronology) gJChronology0);
      DateTime dateTime1 = dateTime0.withWeekyear(178);
      assertEquals((-56550009603259L), dateTime1.getMillis());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      StrictChronology.getInstance(gJChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      MonthDay monthDay0 = MonthDay.now();
      MonthDay monthDay1 = monthDay0.withChronologyRetainFields(gJChronology0);
      MonthDay monthDay2 = monthDay1.minusDays(57);
      assertEquals(19, monthDay2.getDayOfMonth());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Instant instant0 = new Instant();
      DateTimeZone dateTimeZone0 = instant0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      LocalDate localDate0 = new LocalDate((long) 4734, (Chronology) gJChronology0);
      Period period0 = Period.minutes(12825000);
      LocalDate localDate1 = localDate0.minus(period0);
      assertSame(localDate1, localDate0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      System.setCurrentTimeMillis(4723L);
      System.setCurrentTimeMillis((-5710L));
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-831));
      DateMidnight dateMidnight0 = new DateMidnight(4723L);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateMidnight0);
      DateTimeZone dateTimeZone1 = gJChronology0.getZone();
      DateTime dateTime0 = new DateTime((-3259L), (Chronology) gJChronology0);
      DateTime dateTime1 = dateTime0.plusWeeks(91);
      Period period0 = new Period(1570L, (-7631578000L), gJChronology0);
      DateTime dateTime2 = dateTime1.withPeriodAdded(period0, 178);
      GJChronology gJChronology1 = GJChronology.getInstance(dateTimeZone1, (ReadableInstant) dateTime2, 3);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      gJChronology1.assemble(assembledChronology_Fields0);
      assertEquals((-1491736366719L), dateTime2.getMillis());
      assertNotSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      // Undeclared exception!
      try { 
        GJChronology.getInstance(dateTimeZone0, 17L, 23034375);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 23034375
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      // Undeclared exception!
      try { 
        GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (-12219292800000L), 4062);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 4062
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      GJChronology gJChronology1 = (GJChronology)gJChronology0.withZone((DateTimeZone) null);
      assertEquals(4, gJChronology1.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(4, 4);
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateMidnight0);
      long long0 = gJChronology0.getDateTimeMillis(1, 1, 4, 4);
      assertEquals((-62135525039996L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      Instant instant0 = GJChronology.DEFAULT_CUTOVER;
      YearMonth yearMonth0 = new YearMonth(instant0, gJChronology0);
      // Undeclared exception!
      try { 
        yearMonth0.toLocalDate(11);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Specified date does not exist
         //
         verifyException("org.joda.time.chrono.GJChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Instant instant0 = new Instant();
      DateTimeZone dateTimeZone0 = instant0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      LocalDate localDate0 = new LocalDate((long) 4734, (Chronology) gJChronology0);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(28800000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      try { 
        gJChronology0.getDateTimeMillis(4, 4, 2035, 0, 968, 25650000, 25650000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 968 for minuteOfHour must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      try { 
        gJChronology0.getDateTimeMillis(2, 2, 2, 3600, 2, 3600, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 3600 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      try { 
        gJChronology0.getDateTimeMillis(2, 2, 29, 29, 2, 2, 29);
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
      Instant instant0 = GJChronology.DEFAULT_CUTOVER;
      DateTimeZone dateTimeZone0 = instant0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      LocalDate localDate0 = new LocalDate((long) 4713, (Chronology) gJChronology0);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(28800000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[UTC]", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      DateMidnight dateMidnight0 = DateMidnight.now(dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateMidnight0);
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[UTC,cutover=2014-02-14]", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTime dateTime0 = DateTime.now((DateTimeZone) fixedDateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) dateTime0, 1);
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[UTC,cutover=2014-02-14T20:21:21.320Z,mdfw=1]", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      MonthDay monthDay0 = MonthDay.now();
      MonthDay monthDay1 = monthDay0.withChronologyRetainFields(gJChronology0);
      Period period0 = Period.minutes((-2147483646));
      MonthDay monthDay2 = monthDay1.withPeriodAdded(period0, (-2147483646));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(2, monthDay2.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Instant instant0 = new Instant();
      DateTimeZone dateTimeZone0 = instant0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      LocalDate localDate0 = new LocalDate((long) 4734, (Chronology) gJChronology0);
      localDate0.withWeekyear(4734);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Instant instant0 = new Instant();
      Date date0 = instant0.toDate();
      DateTimeZone dateTimeZone0 = instant0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      LocalDate localDate0 = LocalDate.fromDateFields(date0);
      // Undeclared exception!
      try { 
        gJChronology0.set(localDate0, 47L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 14 for dayOfMonth is not supported
         //
         verifyException("org.joda.time.chrono.GJChronology$CutoverField", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Period period0 = Period.ZERO;
      int[] intArray0 = gJChronology0.get((ReadablePeriod) period0, (-12219292800030L), (long) 915);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) gJChronology0);
      gJChronology0.validate(localDateTime0, intArray0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertArrayEquals(new int[] {387, 2, 3, 6, 0, 0, 0, 945}, intArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      Instant instant0 = GJChronology.DEFAULT_CUTOVER;
      DateMidnight dateMidnight0 = new DateMidnight((Chronology) gJChronology0);
      PeriodType periodType0 = PeriodType.months();
      Period period0 = new Period(dateMidnight0, instant0, periodType0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(1392364800000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      Period period0 = Period.weeks(923);
      int[] intArray0 = gJChronology0.get((ReadablePeriod) period0, (long) 923, (-2487022272000000L));
      assertArrayEquals(new int[] {(-78810), 0, 0, (-5), (-23), (-52), (-58), (-923)}, intArray0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Period period0 = Period.ZERO;
      Period period1 = period0.minusMonths(1);
      Period period2 = period1.withHours(28);
      long long0 = buddhistChronology0.add((ReadablePeriod) period2, (-86400000L), 28);
      assertEquals((-70963200000L), long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-831));
      DateMidnight dateMidnight0 = new DateMidnight(4732L);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateMidnight0);
      DateTime dateTime0 = new DateTime((-5710L), (Chronology) gJChronology0);
      DateMidnight dateMidnight1 = dateTime0.toDateMidnight();
      Period period0 = new Period(39, (-7631578000L), gJChronology0);
      Duration duration0 = period0.toDurationTo(dateMidnight1);
      assertEquals((-124312L), duration0.getStandardMinutes());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-831));
      DateMidnight dateMidnight0 = new DateMidnight(4732L);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateMidnight0);
      DateTime dateTime0 = new DateTime((-7603200030L), (Chronology) gJChronology0);
      DateMidnight dateMidnight1 = dateTime0.toDateMidnight();
      Period period0 = new Period(66, (-7631578000L), gJChronology0);
      Duration duration0 = period0.toDurationTo(dateMidnight1);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-7689599169L), dateMidnight1.getMillis());
      assertEquals((-100L), duration0.getStandardDays());
  }
}
