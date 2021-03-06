/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 00:11:51 GMT 2019
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.YearMonth;
import org.joda.time.YearMonthDay;
import org.joda.time.Years;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasePeriod_ESTest extends BasePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(1319, 1319, 1319, 1, 1319, 0, 1319, 1319);
      // Undeclared exception!
      try { 
        mutablePeriod0.setValue(21, 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 21
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(2720, (-833), (-1330), 999, 2720, 999, (-806), 1);
      DateTime dateTime0 = new DateTime((long) 999, (DateTimeZone) null);
      Duration duration0 = mutablePeriod0.toDurationTo(dateTime0);
      Minutes minutes0 = Minutes.ONE;
      PeriodType periodType0 = minutes0.getPeriodType();
      MutablePeriod mutablePeriod1 = new MutablePeriod(duration0, dateTime0, periodType0);
      assertEquals(82936225956001L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Duration duration0 = Duration.standardHours(28265625);
      Hours hours0 = Hours.FOUR;
      PeriodType periodType0 = hours0.getPeriodType();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, duration0, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.set((DurationFieldType) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'null'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Period period0 = new Period((-2768L), (-2768L), iSOChronology0);
      PeriodType periodType0 = PeriodType.minutes();
      MutablePeriod mutablePeriod0 = new MutablePeriod(period0, periodType0, iSOChronology0);
      // Undeclared exception!
      try { 
        mutablePeriod0.setHours(1024);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'hours'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Duration duration0 = Duration.standardHours(28265625);
      Hours hours0 = Hours.FOUR;
      PeriodType periodType0 = hours0.getPeriodType();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, duration0, periodType0);
      mutablePeriod0.add((long) 28265625);
      assertEquals(1, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(2492L);
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      Duration duration0 = mutablePeriod0.toDurationFrom(mutableDateTime0);
      assertEquals(2492L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.addSeconds(1);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(2492L);
      mutablePeriod0.setPeriod(0, 1677, 0, 0, 4, 100, 0, 229);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateMidnight0, dateMidnight0);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Instant instant0 = new Instant();
      Years years0 = Years.yearsBetween((ReadableInstant) instant0, (ReadableInstant) instant0);
      PeriodType periodType0 = years0.getPeriodType();
      Period period0 = new Period((ReadableInstant) null, instant0, periodType0);
      assertEquals(1, period0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PeriodType periodType0 = PeriodType.days();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, periodType0);
      assertEquals(1, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PeriodType periodType0 = PeriodType.years();
      Period period0 = null;
      try {
        period0 = new Period((ReadablePartial) null, (ReadablePartial) null, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      LocalDate localDate0 = LocalDate.fromCalendarFields(calendar0);
      Hours hours0 = Hours.SIX;
      PeriodType periodType0 = hours0.getPeriodType();
      Period period0 = new Period(localDate0, localDate0, periodType0);
      assertEquals(1, period0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      LocalDate localDate0 = LocalDate.fromCalendarFields(calendar0);
      Hours hours0 = Hours.SIX;
      PeriodType periodType0 = hours0.getPeriodType();
      Period period0 = null;
      try {
        period0 = new Period(localDate0, (ReadablePartial) null, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      YearMonthDay yearMonthDay0 = YearMonthDay.fromCalendarFields(mockGregorianCalendar0);
      PeriodType periodType0 = PeriodType.time();
      Period period0 = new Period(yearMonthDay0, yearMonthDay0, periodType0);
      assertEquals(4, period0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      YearMonth yearMonth0 = YearMonth.parse("", dateTimeFormatter0);
      LocalDate localDate0 = yearMonth0.toLocalDate(23);
      Period period0 = null;
      try {
        period0 = new Period(localDate0, yearMonth0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(1289L);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalTime localTime0 = new LocalTime(2825L, (Chronology) islamicChronology0);
      Period period0 = null;
      try {
        period0 = new Period(localDate0, localTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      Period period0 = mutablePeriod0.toPeriod();
      mutablePeriod0.add((ReadablePeriod) period0);
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = Period.days(8);
      PeriodType periodType0 = PeriodType.years();
      MutablePeriod mutablePeriod0 = null;
      try {
        mutablePeriod0 = new MutablePeriod(period0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'days'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.setPeriod((ReadablePeriod) null);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.setMillis(1);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(0L, 0L, periodType0);
      Seconds seconds0 = period0.toStandardSeconds();
      PeriodType periodType1 = seconds0.getPeriodType();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType1);
      mutablePeriod0.setYears(0);
      assertEquals(1, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodParser0).parseInto(any(org.joda.time.ReadWritablePeriod.class) , anyString() , anyInt() , any(java.util.Locale.class));
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      PeriodType periodType0 = PeriodType.years();
      PeriodFormatter periodFormatter1 = periodFormatter0.withParseType(periodType0);
      MutablePeriod mutablePeriod0 = periodFormatter1.parseMutablePeriod("");
      mutablePeriod0.addMonths(0);
      assertEquals(1, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Instant instant0 = new Instant();
      Duration duration0 = new Duration((-1973L), (-496L));
      MutableDateTime mutableDateTime0 = instant0.toMutableDateTime();
      PeriodType periodType0 = PeriodType.years();
      MutablePeriod mutablePeriod0 = new MutablePeriod(mutableDateTime0, duration0, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.addMillis(3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'millis'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodParser0).parseInto(any(org.joda.time.ReadWritablePeriod.class) , anyString() , anyInt() , any(java.util.Locale.class));
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      MutablePeriod mutablePeriod0 = periodFormatter0.parseMutablePeriod("");
      // Undeclared exception!
      try { 
        mutablePeriod0.add((DurationFieldType) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'null'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(665L, 665L);
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(665L);
      mutablePeriod0.mergePeriod(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(659, 4, 0, 0, 659, 659, (-862), 0);
      mutablePeriod0.add((ReadablePeriod) null);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodParser0).parseInto(any(org.joda.time.ReadWritablePeriod.class) , anyString() , anyInt() , any(java.util.Locale.class));
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      PeriodType periodType0 = PeriodType.years();
      PeriodFormatter periodFormatter1 = periodFormatter0.withParseType(periodType0);
      MutablePeriod mutablePeriod0 = periodFormatter1.parseMutablePeriod("");
      Period period0 = new Period((-464L));
      // Undeclared exception!
      try { 
        mutablePeriod0.add((ReadablePeriod) period0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'millis'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }
}
