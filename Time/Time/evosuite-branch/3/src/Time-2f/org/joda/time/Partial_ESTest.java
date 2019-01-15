/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 19:11:14 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.MutableDateTime;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.DateTimeFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Partial_ESTest extends Partial_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[0];
      int[] intArray0 = new int[0];
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      Partial partial1 = partial0.without(dateTimeFieldType0);
      assertSame(partial0, partial1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      int[] intArray0 = new int[4];
      Partial partial0 = new Partial(gregorianChronology0, dateTimeFieldTypeArray0, intArray0);
      // Undeclared exception!
      try { 
        partial0.withField(dateTimeFieldType0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      Instant instant0 = new Instant();
      Chronology chronology0 = instant0.getChronology();
      Partial partial0 = new Partial(dateTimeFieldType0, 0, chronology0);
      Duration duration0 = new Duration(0L, 0L);
      Minutes minutes0 = duration0.toStandardMinutes();
      Days days0 = minutes0.toStandardDays();
      Partial partial1 = partial0.plus(days0);
      assertTrue(partial1.equals((Object)partial0));
      assertNotSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Period period0 = Period.ZERO;
      Partial partial1 = partial0.minus(period0);
      assertNotSame(partial1, partial0);
      assertTrue(partial1.equals((Object)partial0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Partial partial0 = new Partial(monthDay0);
      DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
      assertEquals(2, dateTimeFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Partial partial0 = new Partial();
      Partial.Property partial_Property0 = new Partial.Property(partial0, (-1111));
      // Undeclared exception!
      try { 
        partial_Property0.withMaximumValue();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1111
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[5];
      int[] intArray0 = new int[3];
      Partial partial0 = new Partial(copticChronology0, dateTimeFieldTypeArray0, intArray0);
      Partial.Property partial_Property0 = partial0.property(dateTimeFieldTypeArray0[0]);
      // Undeclared exception!
      try { 
        partial_Property0.setCopy("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) buddhistChronology0);
      Partial partial0 = new Partial(localDateTime0);
      Partial.Property partial_Property0 = new Partial.Property(partial0, 1);
      Locale locale0 = Locale.FRANCE;
      partial_Property0.getAsText(locale0);
      assertEquals(2, partial_Property0.get());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      Partial partial0 = new Partial(dateTimeFieldType0, 343);
      Partial.Property partial_Property0 = new Partial.Property(partial0, 60);
      // Undeclared exception!
      try { 
        partial_Property0.addWrapFieldToCopy(32);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 60
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
      Partial partial1 = partial_Property0.setCopy(0);
      assertTrue(partial1.equals((Object)partial0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Partial partial0 = new Partial(monthDay0);
      Partial.Property partial_Property0 = new Partial.Property(partial0, 5);
      Partial partial1 = partial_Property0.getPartial();
      assertEquals(2, partial1.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
      Partial partial1 = partial_Property0.addToCopy(0);
      assertTrue(partial1.equals((Object)partial0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Partial.Property partial_Property0 = new Partial.Property((Partial) null, 0);
      // Undeclared exception!
      try { 
        partial_Property0.withMinimumValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.Partial$Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Partial partial0 = null;
      try {
        partial0 = new Partial((DateTimeFieldType) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field type must not be null
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[0];
      Partial partial0 = null;
      try {
        partial0 = new Partial((DateTimeFieldType[]) null, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not be null
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, (int[]) null, iSOChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Values array must not be null
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      int[] intArray0 = new int[1];
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, buddhistChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Values array must be the same length as the types array
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      Instant instant0 = new Instant();
      Chronology chronology0 = instant0.getChronology();
      Partial partial0 = new Partial(dateTimeFieldType0, 0, chronology0);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.weekyear();
      Partial partial1 = partial0.with(dateTimeFieldType1, (-882));
      assertEquals(2, partial1.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[8];
      int[] intArray0 = new int[8];
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not contain null: index 0
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.centuryOfEra();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
      dateTimeFieldTypeArray0[2] = dateTimeFieldTypeArray0[1];
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      int[] intArray0 = new int[8];
      Partial partial0 = new Partial(buddhistChronology0, dateTimeFieldTypeArray0, intArray0);
      DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.minuteOfHour();
      // Undeclared exception!
      try { 
        partial0.with(dateTimeFieldType2, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must be in order largest-smallest: year < centuryOfEra
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Partial partial0 = new Partial(dateTimeFieldType0, 8, iSOChronology0);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.year();
      // Undeclared exception!
      try { 
        partial0.with(dateTimeFieldType1, 8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not contain duplicate: year and weekyear
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      Partial partial0 = new Partial(dateTimeFieldType0, 1328, (Chronology) null);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.yearOfCentury();
      // Undeclared exception!
      try { 
        partial0.with(dateTimeFieldType1, 1328);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1328 for yearOfCentury must not be larger than 99
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[8];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.yearOfCentury();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
      dateTimeFieldTypeArray0[2] = dateTimeFieldTypeArray0[0];
      dateTimeFieldTypeArray0[3] = dateTimeFieldType1;
      dateTimeFieldTypeArray0[4] = dateTimeFieldType1;
      dateTimeFieldTypeArray0[5] = dateTimeFieldTypeArray0[1];
      dateTimeFieldTypeArray0[6] = dateTimeFieldTypeArray0[1];
      dateTimeFieldTypeArray0[7] = dateTimeFieldType1;
      int[] intArray0 = new int[8];
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must be in order largest-smallest: yearOfCentury < year
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[5];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.minuteOfDay();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldTypeArray0[2];
      dateTimeFieldTypeArray0[4] = dateTimeFieldType1;
      int[] intArray0 = new int[5];
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must be in order largest-smallest: minuteOfHour < minuteOfDay
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[8];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.yearOfCentury();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
      DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.weekyearOfCentury();
      dateTimeFieldTypeArray0[2] = dateTimeFieldType2;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType1;
      dateTimeFieldTypeArray0[4] = dateTimeFieldTypeArray0[0];
      dateTimeFieldTypeArray0[5] = dateTimeFieldTypeArray0[0];
      dateTimeFieldTypeArray0[6] = dateTimeFieldType2;
      dateTimeFieldTypeArray0[7] = dateTimeFieldType0;
      int[] intArray0 = new int[8];
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not contain duplicate: yearOfCentury and weekyearOfCentury
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Partial partial0 = null;
      try {
        partial0 = new Partial((ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The partial must not be null
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[8];
      int[] intArray0 = new int[2];
      Partial partial0 = new Partial(buddhistChronology0, dateTimeFieldTypeArray0, intArray0);
      // Undeclared exception!
      try { 
        partial0.withChronologyRetainFields(buddhistChronology0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Partial partial0 = new Partial();
      Partial partial1 = partial0.withChronologyRetainFields((Chronology) null);
      assertSame(partial1, partial0);
      assertEquals(0, partial1.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      // Undeclared exception!
      try { 
        partial0.with((DateTimeFieldType) null, 91);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field type must not be null
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      Instant instant0 = new Instant();
      Chronology chronology0 = instant0.getChronology();
      Partial partial0 = new Partial(dateTimeFieldType0, 0, chronology0);
      Partial partial1 = partial0.with(dateTimeFieldType0, 0);
      assertEquals(1, partial1.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Partial partial0 = new Partial();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      // Undeclared exception!
      try { 
        partial0.with(dateTimeFieldType0, 690562340);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 690562340 for era must not be larger than 1
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldTypeArray0[0];
      dateTimeFieldTypeArray0[2] = dateTimeFieldTypeArray0[1];
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.era();
      dateTimeFieldTypeArray0[3] = dateTimeFieldType1;
      int[] intArray0 = new int[8];
      Partial partial0 = new Partial(buddhistChronology0, dateTimeFieldTypeArray0, intArray0);
      DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.minuteOfHour();
      // Undeclared exception!
      try { 
        partial0.with(dateTimeFieldType2, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not contain duplicate: year and year
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      LocalDate localDate0 = LocalDate.fromCalendarFields(mockGregorianCalendar0);
      Partial partial0 = new Partial(localDate0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      // Undeclared exception!
      try { 
        partial0.with(dateTimeFieldType0, (-296));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -296 for dayOfWeek must not be smaller than 1
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      Partial partial0 = new Partial(monthDay0);
      Partial partial1 = partial0.with(dateTimeFieldType0, 1);
      boolean boolean0 = partial1.isMatch((ReadablePartial) partial0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      Partial partial0 = new Partial(dateTimeFieldType0, 32);
      Partial partial1 = partial0.without(dateTimeFieldType0);
      assertEquals(0, partial1.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      Instant instant0 = new Instant();
      Chronology chronology0 = instant0.getChronology();
      Partial partial0 = new Partial(dateTimeFieldType0, 0, chronology0);
      Partial partial1 = partial0.withField(dateTimeFieldType0, 0);
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      Partial partial0 = new Partial(localDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      Partial partial1 = partial0.withFieldAdded(durationFieldType0, 1);
      assertNotSame(partial1, partial0);
      assertFalse(partial1.equals((Object)partial0));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      Partial partial1 = partial0.withFieldAdded(durationFieldType0, 0);
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      Partial partial0 = new Partial(localDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 3);
      assertNotSame(partial1, partial0);
      assertFalse(partial1.equals((Object)partial0));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      int[] intArray0 = new int[3];
      Partial partial0 = new Partial(buddhistChronology0, dateTimeFieldTypeArray0, intArray0);
      DurationFieldType durationFieldType0 = dateTimeFieldTypeArray0[0].getDurationType();
      Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 0);
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Partial partial0 = new Partial();
      Partial partial1 = partial0.withPeriodAdded((ReadablePeriod) null, 0);
      assertEquals(0, partial1.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[8];
      int[] intArray0 = new int[4];
      Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, intArray0);
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) iSOChronology0);
      Days days0 = Days.daysBetween((ReadableInstant) mutableDateTime0, (ReadableInstant) mutableDateTime0);
      Partial partial1 = partial0.withPeriodAdded(days0, 0);
      assertSame(partial0, partial1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      Partial partial0 = new Partial(dateTimeFieldType0, 5, julianChronology0);
      Instant instant0 = Instant.now();
      boolean boolean0 = partial0.isMatch((ReadableInstant) instant0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      Instant instant0 = new Instant();
      Chronology chronology0 = instant0.getChronology();
      Partial partial0 = new Partial(dateTimeFieldType0, 0, chronology0);
      boolean boolean0 = partial0.isMatch((ReadableInstant) instant0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Partial partial0 = new Partial(monthDay0);
      boolean boolean0 = partial0.isMatch((ReadablePartial) partial0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 1969);
      // Undeclared exception!
      try { 
        partial0.isMatch((ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The partial must not be null
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      partial0.getFormatter();
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      int[] intArray0 = new int[8];
      Partial partial0 = new Partial((Chronology) null, dateTimeFieldTypeArray0, intArray0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      partial0.toString();
      String string0 = partial0.toString();
      assertEquals("[yearOfCentury=0]", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      Partial partial0 = new Partial(dateTimeFieldType0, 6);
      String string0 = partial0.toString();
      assertEquals("--06", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Partial partial0 = new Partial(yearMonth0);
      String string0 = partial0.toStringList();
      assertEquals("[year=2014, monthOfYear=2]", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[8];
      int[] intArray0 = new int[4];
      Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, intArray0);
      // Undeclared exception!
      try { 
        partial0.toString("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid pattern specification
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Partial partial0 = new Partial();
      assertEquals(0, partial0.size());
      
      String string0 = partial0.toString((String) null);
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[0];
      int[] intArray0 = new int[0];
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
      Locale locale0 = Locale.forLanguageTag("`");
      // Undeclared exception!
      try { 
        partial0.toString("", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid pattern specification
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Partial partial0 = new Partial();
      Locale locale0 = new Locale("n0", "[]");
      String string0 = partial0.toString((String) null, locale0);
      assertEquals("[]", string0);
  }
}