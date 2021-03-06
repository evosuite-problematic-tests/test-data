/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 19:38:25 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BasicMonthOfYearDateTimeField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJMonthOfYearDateTimeField;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasicMonthOfYearDateTimeField_ESTest extends BasicMonthOfYearDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(copticChronology0, 1);
      long long0 = basicMonthOfYearDateTimeField0.remainder(1);
      assertEquals(1900800001L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(julianChronology0, fixedDateTimeZone0);
      assertNotNull(zonedChronology0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth(400, 12, julianChronology0);
      YearMonth yearMonth1 = yearMonth0.plusMonths(400);
      assertEquals(4, yearMonth1.getMonthOfYear());
      assertEquals(434, yearMonth1.getYear());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(julianChronology0);
      assertNotNull(lenientChronology0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(copticChronology0, 1);
      long long0 = basicMonthOfYearDateTimeField0.addWrapField(297L, 1);
      assertEquals(2592000297L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = new Period((-1L), 1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(julianChronology0, 12);
      long long0 = basicMonthOfYearDateTimeField0.add(1173L, (-2807L));
      assertEquals((-7381843198827L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(gregorianChronology0, 0);
      long long0 = basicMonthOfYearDateTimeField0.add((-1360L), (-2480));
      assertEquals((-6521904001360L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = new IslamicChronology((Chronology) null, "Md]", islamicChronology_LeapYearPatternType0);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.add((long) 0, (-1933977599999L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Magnitude of add amount is too large: -1933977599999
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(copticChronology0, 1);
      long long0 = basicMonthOfYearDateTimeField0.add((long) 1, 2629800000L);
      assertEquals(6383859729177600001L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(julianChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.add((-161164798618L), (-161164798618L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Magnitude of add amount is too large: -161164798618
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(copticChronology0, 1);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.add(1947L, 30672000000L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Magnitude of add amount is too large: 30672000000
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(copticChronology0, 1);
      long long0 = basicMonthOfYearDateTimeField0.add(5043L, 2629799989L);
      assertEquals(6383859702220805043L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      DateTime dateTime0 = DateTime.now();
      LocalDate localDate0 = dateTime0.toLocalDate();
      int[] intArray0 = new int[9];
      int[] intArray1 = gJMonthOfYearDateTimeField0.add((ReadablePartial) localDate0, 1, intArray0, 0);
      assertSame(intArray0, intArray1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(islamicChronology0, 1);
      Partial partial0 = new Partial();
      int[] intArray0 = new int[1];
      int[] intArray1 = basicMonthOfYearDateTimeField0.add((ReadablePartial) partial0, 12, intArray0, (-751));
      assertEquals(0, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      LocalTime localTime0 = new LocalTime(10000000000L, (Chronology) islamicChronology0);
      Partial partial0 = new Partial(localTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      Partial partial1 = partial0.with(dateTimeFieldType0, 6);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.add((ReadablePartial) partial1, 1, intArray0, 6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(1, 1);
      MonthDay monthDay1 = monthDay0.minusDays((-3197));
      assertEquals(6, monthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(julianChronology0, 12);
      long long0 = basicMonthOfYearDateTimeField0.getDifferenceAsLong((-776L), (-479L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(copticChronology0, 1);
      long long0 = basicMonthOfYearDateTimeField0.getDifferenceAsLong(6383859729177600001L, 1);
      assertEquals(2629799999L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      IslamicChronology islamicChronology0 = new IslamicChronology(buddhistChronology0, buddhistChronology0, (IslamicChronology.LeapYearPatternType) null);
      EthiopicChronology ethiopicChronology0 = new EthiopicChronology(islamicChronology0, (Object) null, 1);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(ethiopicChronology0);
      long long0 = gJMonthOfYearDateTimeField0.set((-2391L), 13);
      assertEquals(21859197609L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = new IslamicChronology((Chronology) null, "Md]", islamicChronology_LeapYearPatternType0);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      int int0 = gJMonthOfYearDateTimeField0.getLeapAmount((-1888099199999L));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(julianChronology0, 0);
      boolean boolean0 = basicMonthOfYearDateTimeField0.isLeap((-161164798600L));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(julianChronology0, 12);
      int int0 = basicMonthOfYearDateTimeField0.getLeapAmount(2350L);
      assertEquals(0, int0);
  }
}
