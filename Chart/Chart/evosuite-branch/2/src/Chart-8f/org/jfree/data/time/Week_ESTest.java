/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 10:56:10 GMT 2019
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.jfree.data.time.Minute;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Week_ESTest extends Week_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0, 0, 0);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Week week0 = new Week(mockDate0, zoneInfo0);
      week0.hashCode();
      assertEquals(1900, week0.getYearValue());
      assertEquals((-2209075200001L), week0.getLastMillisecond());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-840L));
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Week week0 = new Week(mockDate0, zoneInfo0);
      int int0 = week0.getYearValue();
      assertEquals(1970, int0);
      assertEquals((-841L), week0.getLastMillisecond());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Week week0 = new Week();
      String string0 = week0.toString();
      assertEquals("Week 7, 2014", string0);
      assertEquals(1392409281319L, week0.getLastMillisecond());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Week week0 = new Week();
      int int0 = week0.compareTo(week0);
      assertEquals(0, int0);
      assertEquals(7, week0.getWeek());
      assertEquals(1392409281319L, week0.getLastMillisecond());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-840L));
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Week week0 = new Week(mockDate0, zoneInfo0);
      long long0 = week0.getSerialIndex();
      assertEquals(104411L, long0);
      assertEquals((-841L), week0.getLastMillisecond());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Week week0 = new Week();
      long long0 = week0.getMiddleMillisecond();
      assertEquals(1392409281320L, long0);
      assertEquals(7, week0.getWeek());
      assertEquals(1392409281319L, week0.getLastMillisecond());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Week week0 = new Week((-4), 804);
      assertEquals(1392409281319L, week0.getLastMillisecond());
      assertEquals(42608L, week0.getSerialIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(0, year0);
      assertEquals(1392409281319L, week0.getLastMillisecond());
      assertEquals(0, week0.getWeek());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "Null 'locale' argument.");
      Week week0 = null;
      try {
        week0 = new Week((Date) null, simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'time' argument.
         //
         verifyException("org.jfree.data.time.Week", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Week week0 = null;
      try {
        week0 = new Week(mockDate0, (TimeZone) null, (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'zone' argument.
         //
         verifyException("org.jfree.data.time.Week", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(zoneInfo0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Week week0 = null;
      try {
        week0 = new Week(date0, zoneInfo0, (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'locale' argument.
         //
         verifyException("org.jfree.data.time.Week", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2328L);
      Week week0 = new Week(mockDate0);
      assertEquals(2327L, week0.getLastMillisecond());
      assertEquals(104411L, week0.getSerialIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockDate mockDate0 = new MockDate(31, (-49), 31, 31, (-49));
      Locale locale0 = Locale.GERMAN;
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Week week0 = new Week(mockDate0, zoneInfo0, locale0);
      assertEquals((-1356976140001L), week0.getLastMillisecond());
      assertEquals(52, week0.getWeek());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-840L));
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Week week0 = new Week(mockDate0, zoneInfo0);
      RegularTimePeriod regularTimePeriod0 = week0.previous();
      int int0 = week0.compareTo(regularTimePeriod0);
      assertEquals(1, int0);
      assertEquals(1392409281319L, regularTimePeriod0.getLastMillisecond());
      assertEquals(104409L, regularTimePeriod0.getSerialIndex());
      assertEquals(1, week0.getWeek());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Week week0 = new Week();
      RegularTimePeriod regularTimePeriod0 = week0.previous();
      assertEquals(1392409281319L, regularTimePeriod0.getLastMillisecond());
      assertEquals(106748L, regularTimePeriod0.getSerialIndex());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0, 0, 0);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Week week0 = new Week(mockDate0, zoneInfo0);
      RegularTimePeriod regularTimePeriod0 = week0.previous();
      assertEquals((-2209075200001L), week0.getLastMillisecond());
      assertEquals(100701L, week0.getSerialIndex());
      assertNull(regularTimePeriod0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Week week0 = new Week(52, 52);
      RegularTimePeriod regularTimePeriod0 = week0.next();
      assertEquals(1392409281319L, regularTimePeriod0.getLastMillisecond());
      assertEquals(2809L, regularTimePeriod0.getSerialIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0, 0, 0);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Week week0 = new Week(mockDate0, zoneInfo0);
      RegularTimePeriod regularTimePeriod0 = week0.next();
      assertEquals((-2209075200001L), week0.getLastMillisecond());
      assertEquals(100702L, regularTimePeriod0.getSerialIndex());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Week week0 = new Week(359, 3299);
      RegularTimePeriod regularTimePeriod0 = week0.next();
      assertEquals(174901L, regularTimePeriod0.getSerialIndex());
      assertEquals(1392409281319L, regularTimePeriod0.getLastMillisecond());
      assertNotNull(regularTimePeriod0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockDate mockDate0 = new MockDate(9999, 9999, 9999, 9999, 841);
      Year year0 = new Year(mockDate0);
      Week week0 = new Week(841, year0);
      RegularTimePeriod regularTimePeriod0 = week0.next();
      assertNull(regularTimePeriod0);
      assertEquals(73, week0.getWeek());
      assertEquals(1392409281319L, week0.getLastMillisecond());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Week week0 = new Week();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(53, 135, 0, 53, 0);
      boolean boolean0 = week0.equals(mockGregorianCalendar0);
      assertFalse(boolean0);
      assertEquals(1392409281319L, week0.getLastMillisecond());
      assertEquals(7, week0.getWeek());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Week week0 = new Week();
      Week week1 = new Week(7, 53);
      boolean boolean0 = week1.equals(week0);
      assertFalse(boolean0);
      assertEquals(1392409281319L, week1.getLastMillisecond());
      assertEquals(2816L, week1.getSerialIndex());
      assertEquals(106749L, week0.getSerialIndex());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Week week0 = new Week();
      RegularTimePeriod regularTimePeriod0 = week0.next();
      boolean boolean0 = week0.equals(regularTimePeriod0);
      assertFalse(regularTimePeriod0.equals((Object)week0));
      assertEquals(106750L, regularTimePeriod0.getSerialIndex());
      assertEquals(1392409281319L, regularTimePeriod0.getLastMillisecond());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1311, (-1148), (-1294), (-3016), 10, (-1148));
      Week week0 = new Week(mockDate0);
      Locale locale0 = Locale.ITALIAN;
      Week week1 = new Week(mockDate0, week0.DEFAULT_TIME_ZONE, locale0);
      boolean boolean0 = week0.equals(week1);
      assertEquals(164906L, week1.getSerialIndex());
      assertTrue(boolean0);
      assertEquals(36020274651999L, week1.getLastMillisecond());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Week week0 = new Week();
      Minute minute0 = new Minute();
      int int0 = week0.compareTo(minute0);
      assertEquals(1392409281319L, week0.getLastMillisecond());
      assertEquals(0, int0);
      assertEquals(106749L, week0.getSerialIndex());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Week week0 = new Week();
      int int0 = week0.compareTo("Month outside valid range.");
      assertEquals(7, week0.getWeek());
      assertEquals(1392409281319L, week0.getLastMillisecond());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Week week0 = Week.parseWeek((String) null);
      assertNull(week0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        Week.parseWeek("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Could not find separator.
         //
         verifyException("org.jfree.data.time.Week", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        Week.parseWeek("Week 7, 2014");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't evaluate the week.
         //
         verifyException("org.jfree.data.time.Week", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        Week.parseWeek("_zA!o$v/5ih~-n");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't evaluate the year.
         //
         verifyException("org.jfree.data.time.Week", e);
      }
  }
}