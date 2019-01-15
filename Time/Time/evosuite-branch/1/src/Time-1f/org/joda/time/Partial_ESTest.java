/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 12:29:27 GMT 2018
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Months;
import org.joda.time.Partial;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.DateTimeFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Partial_ESTest extends Partial_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[0];
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, (int[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Values array must not be null
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Partial partial0 = new Partial(copticChronology0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      Partial partial1 = partial0.with(dateTimeFieldType0, 1);
      Partial.Property partial_Property0 = partial1.property(dateTimeFieldType0);
      int int0 = partial_Property0.get();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Days days0 = Days.ZERO;
      Partial partial1 = partial0.plus(days0);
      assertTrue(partial1.equals((Object)partial0));
      assertNotSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      int[] intArray0 = new int[1];
      Partial partial0 = new Partial(buddhistChronology0, (DateTimeFieldType[]) null, intArray0);
      // Undeclared exception!
      try { 
        partial0.getFieldTypes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Partial partial0 = new Partial();
      Partial.Property partial_Property0 = new Partial.Property(partial0, 87);
      // Undeclared exception!
      try { 
        partial_Property0.withMaximumValue();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 87
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Partial.Property partial_Property0 = new Partial.Property((Partial) null, 0);
      // Undeclared exception!
      try { 
        partial_Property0.setCopy("]#-5)2;Z,w");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.Partial$Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Partial.Property partial_Property0 = new Partial.Property(partial0, 0);
      Partial partial1 = partial_Property0.addWrapFieldToCopy(0);
      assertTrue(partial1.equals((Object)partial0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      Partial partial0 = new Partial(dateTimeFieldType0, 32, (Chronology) null);
      Partial.Property partial_Property0 = new Partial.Property(partial0, 32);
      // Undeclared exception!
      try { 
        partial_Property0.setCopy(32);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 32
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Partial partial0 = new Partial(dateTimeFieldType0, (-4903), buddhistChronology0);
      Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
      partial_Property0.getPartial();
      assertEquals((-4903), partial_Property0.get());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Partial.Property partial_Property0 = new Partial.Property((Partial) null, 0);
      // Undeclared exception!
      try { 
        partial_Property0.addToCopy((-1928));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.Partial$Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      int[] intArray0 = new int[7];
      Partial partial0 = new Partial((Chronology) null, dateTimeFieldTypeArray0, intArray0);
      Partial.Property partial_Property0 = new Partial.Property(partial0, 772);
      // Undeclared exception!
      try { 
        partial_Property0.withMinimumValue();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 772
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Partial partial0 = null;
      try {
        partial0 = new Partial((DateTimeFieldType) null, 1572);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field type must not be null
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[7];
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
  public void test13()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
      int[] intArray0 = new int[0];
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Values array must be the same length as the types array
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[0];
      int[] intArray0 = new int[0];
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
      assertEquals(0, partial0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[7];
      int[] intArray0 = new int[7];
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, copticChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not contain null: index 0
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[5];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldTypeArray0[0];
      dateTimeFieldTypeArray0[4] = dateTimeFieldTypeArray0[1];
      int[] intArray0 = new int[5];
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(4231);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, iSOChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not contain duplicate unsupported: era and era
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[5];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.era();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType1;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[4] = dateTimeFieldType1;
      int[] intArray0 = new int[5];
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(4231);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, iSOChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must be in order largest-smallest: weekyearOfCentury < era
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.centuryOfEra();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType1;
      dateTimeFieldTypeArray0[3] = dateTimeFieldTypeArray0[2];
      int[] intArray0 = new int[7];
      Partial partial0 = new Partial((Chronology) null, dateTimeFieldTypeArray0, intArray0);
      DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.secondOfDay();
      // Undeclared exception!
      try { 
        partial0.with(dateTimeFieldType2, 1456);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must be in order largest-smallest: yearOfEra < centuryOfEra
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((-3527L));
      Partial partial0 = new Partial(localDate0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Partial partial1 = partial0.with(dateTimeFieldType0, 726);
      assertEquals(4, partial1.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[5];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldTypeArray0[1];
      dateTimeFieldTypeArray0[3] = dateTimeFieldTypeArray0[0];
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      int[] intArray0 = new int[5];
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null, 2);
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, julianChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not contain duplicate: year and year
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[5];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.yearOfCentury();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
      dateTimeFieldTypeArray0[2] = dateTimeFieldTypeArray0[1];
      dateTimeFieldTypeArray0[3] = dateTimeFieldType1;
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      int[] intArray0 = new int[5];
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null, 2);
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, julianChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not contain duplicate: yearOfCentury and yearOfCentury
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.weekyearOfCentury();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      int[] intArray0 = new int[3];
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, (Chronology) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must be in order largest-smallest: weekyearOfCentury < weekyear
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[7];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.minuteOfDay();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
      dateTimeFieldTypeArray0[2] = dateTimeFieldTypeArray0[0];
      dateTimeFieldTypeArray0[3] = dateTimeFieldTypeArray0[1];
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[5] = dateTimeFieldTypeArray0[3];
      dateTimeFieldTypeArray0[6] = dateTimeFieldTypeArray0[4];
      int[] intArray0 = new int[7];
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, gregorianChronology0);
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
      LocalTime localTime0 = LocalTime.fromMillisOfDay((-1L));
      Partial partial0 = new Partial(localTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      Partial partial1 = partial0.with(dateTimeFieldType0, 7);
      assertNotSame(partial1, partial0);
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
      YearMonth yearMonth0 = new YearMonth((-1994L));
      Partial partial0 = new Partial(yearMonth0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      Partial partial1 = partial0.withChronologyRetainFields(islamicChronology0);
      assertNotSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      Chronology chronology0 = gregorianChronology0.withUTC();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[2];
      int[] intArray0 = new int[9];
      Partial partial0 = new Partial(chronology0, dateTimeFieldTypeArray0, intArray0);
      Partial partial1 = partial0.withChronologyRetainFields(chronology0);
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Partial partial0 = new Partial();
      // Undeclared exception!
      try { 
        partial0.with((DateTimeFieldType) null, 2461);
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
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, 6);
      Partial partial1 = partial0.with(dateTimeFieldType0, 6);
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((-3527L));
      Partial partial0 = new Partial(localDate0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      // Undeclared exception!
      try { 
        partial0.with(dateTimeFieldType0, 726);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 726 for era must not be larger than 1
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.era();
      dateTimeFieldTypeArray0[2] = dateTimeFieldType1;
      int[] intArray0 = new int[7];
      Partial partial0 = new Partial((Chronology) null, dateTimeFieldTypeArray0, intArray0);
      DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.secondOfDay();
      // Undeclared exception!
      try { 
        partial0.with(dateTimeFieldType2, 1456);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay((-1L));
      Partial partial0 = new Partial(localTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      // Undeclared exception!
      try { 
        partial0.with(dateTimeFieldType0, (-45));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -45 for secondOfDay must not be smaller than 0
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, 6);
      Partial partial1 = partial0.with(dateTimeFieldType0, 2586);
      assertEquals(1, partial1.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Partial partial0 = new Partial();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      Partial partial1 = partial0.without(dateTimeFieldType0);
      assertSame(partial0, partial1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      int[] intArray0 = new int[7];
      Partial partial0 = new Partial(buddhistChronology0, dateTimeFieldTypeArray0, intArray0);
      // Undeclared exception!
      try { 
        partial0.without(dateTimeFieldType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Date date0 = localDateTime0.toDate();
      LocalDate localDate0 = LocalDate.fromDateFields(date0);
      Partial partial0 = new Partial(localDate0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      Partial partial1 = partial0.withField(dateTimeFieldType0, 4231);
      Partial partial2 = partial1.withField(dateTimeFieldType0, 4231);
      assertSame(partial2, partial1);
      assertNotSame(partial2, partial0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, 6);
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      Partial partial1 = partial0.withFieldAdded(durationFieldType0, 5);
      assertNotSame(partial1, partial0);
      assertFalse(partial1.equals((Object)partial0));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, (-9));
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      Partial partial1 = partial0.withFieldAdded(durationFieldType0, 0);
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, 6);
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 6);
      assertNotSame(partial1, partial0);
      assertFalse(partial1.equals((Object)partial0));
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, 6);
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 0);
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Partial partial0 = new Partial();
      Partial partial1 = partial0.minus((ReadablePeriod) null);
      assertEquals(0, partial1.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Days days0 = Days.ZERO;
      Partial partial1 = partial0.withPeriodAdded(days0, 0);
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      Partial partial0 = new Partial(dateTimeFieldType0, 1);
      Months months0 = Months.ZERO;
      Partial partial1 = partial0.withPeriodAdded(months0, 1);
      assertNotSame(partial1, partial0);
      assertTrue(partial1.equals((Object)partial0));
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(7L);
      LocalDate localDate1 = localDate0.withLocalMillis(7L);
      Partial partial0 = new Partial(localDate1);
      Instant instant0 = new Instant((long) 726);
      boolean boolean0 = partial0.isMatch((ReadableInstant) instant0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((-3527L));
      Partial partial0 = new Partial(localDate0);
      Instant instant0 = new Instant((long) 726);
      boolean boolean0 = partial0.isMatch((ReadableInstant) instant0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay((-1L));
      Partial partial0 = new Partial(localTime0);
      LocalDateTime localDateTime0 = new LocalDateTime();
      boolean boolean0 = partial0.isMatch((ReadablePartial) localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Partial partial0 = new Partial();
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
  public void test48()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Partial partial0 = new Partial(localTime0);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      boolean boolean0 = partial0.isMatch((ReadablePartial) localDateTime0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Partial partial0 = new Partial(copticChronology0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      Partial partial1 = partial0.with(dateTimeFieldType0, 1);
      partial1.toString();
      DateTimeFormatter dateTimeFormatter0 = partial1.getFormatter();
      assertNull(dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Partial partial0 = new Partial(dateTimeFieldType0, 488, copticChronology0);
      String string0 = partial0.toString();
      assertEquals("0488", string0);
      
      String string1 = partial0.toString();
      assertEquals("0488", string1);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      int[] intArray0 = new int[4];
      Partial partial0 = new Partial((Chronology) null, dateTimeFieldTypeArray0, intArray0);
      Locale locale0 = Locale.FRANCE;
      // Undeclared exception!
      try { 
        partial0.toString((String) null, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
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
  public void test53()  throws Throwable  {
      Partial partial0 = new Partial();
      String string0 = partial0.toString((String) null);
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Partial partial0 = new Partial((Chronology) null);
      Locale locale0 = Locale.FRANCE;
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
}