/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 00:05:30 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.LocalDateTime;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTimeZone_ESTest extends DateTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      String string0 = dateTimeZone0.getShortName(365L);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      dateTimeZone0.UTC.writeReplace();
      assertEquals("UTC", dateTimeZone0.getID());
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      String string0 = fixedDateTimeZone0.toString();
      assertEquals("UTC", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Set<String> set0 = DateTimeZone.getAvailableIDs();
      assertEquals(572, set0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NameProvider nameProvider0 = DateTimeZone.getNameProvider();
      DateTimeZone.setNameProvider(nameProvider0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Provider provider0 = DateTimeZone.getProvider();
      assertNotNull(provider0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone.getDefault();
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      assertNotNull(julianChronology0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      assertEquals(1, BuddhistChronology.BE);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTimeZone.setDefault(fixedDateTimeZone0);
      assertTrue(fixedDateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZone.setDefault((DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone must not be null
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("America/Los_Angeles", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("-08:00");
      assertEquals("-08:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes((-1180), 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, (-1486));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1486
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes((-1249), 3578);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 3578
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(9);
      assertEquals("+09:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("America/Los_Angeles", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(fixedDateTimeZone0, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(115, "EAT");
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'EAT' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'America/Los_Angeles' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-26587893), "bF(v=6 )3#Q:E<");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
      assertNotNull(dateTimeZone0);
      assertEquals("-07:23", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("hourOfDay");
      timeZone0.setID("+00:00");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("+00:00");
      assertSame(dateTimeZone1, dateTimeZone0);
      assertNotNull(dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-28378000));
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis((-28378000));
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("-07:52:58", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone.setNameProvider((NameProvider) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("-08:00");
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      String string0 = fixedDateTimeZone0.getShortName((-1938L), locale0);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2);
      Locale locale0 = Locale.forLanguageTag("5");
      String string0 = dateTimeZone0.getShortName((-223L), locale0);
      assertEquals("+00:00:00.002", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = Locale.ENGLISH;
      String string0 = fixedDateTimeZone0.getName(233L, locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1131);
      String string0 = dateTimeZone0.getName((long) 1131);
      assertEquals("+00:00:01.131", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = new DateTime(dateTimeZone0);
      int int0 = dateTimeZone0.getOffset((ReadableInstant) dateTime0);
      assertEquals((-28800000), int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffset((ReadableInstant) null);
      assertEquals((-28800000), int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset(9223372036854775807L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.UTC.isStandardOffset(10800000L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffsetFromLocal(9223372036854775807L);
      assertEquals((-28378000), int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Days days0 = Days.ZERO;
      Period period0 = days0.toPeriod();
      int[] intArray0 = buddhistChronology0.get((ReadablePeriod) period0, 9972000000L, 9583872L);
      assertArrayEquals(new int[] {0, (-3), (-3), (-4), (-8), (-20), (-16), (-128)}, intArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(600, "JST");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
      int int0 = dateTimeZone0.getOffsetFromLocal((-2201L));
      assertEquals(32400000, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(625, "JST");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
      int int0 = dateTimeZone0.getOffsetFromLocal(9223372036854775807L);
      assertEquals(36000000, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 9, (Chronology) julianChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(320);
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2088);
      // Undeclared exception!
      try { 
        dateTimeZone0.adjustOffset(9223372036854775807L, false);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC(9223372036854775717L, false, 9223372036854775717L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("Pacific/Auckland");
      long long0 = dateTimeZone0.adjustOffset((-923304600001L), false);
      assertEquals((-923304600001L), long0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(625, "JST");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC((-9223372036854775808L), true);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-28378000));
      long long0 = dateTimeZone0.convertLocalToUTC((-340L), false);
      assertEquals("-07:52:58", dateTimeZone0.toString());
      assertEquals(28377660L, long0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 0);
      assertEquals(28800000L, long0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, (Chronology) buddhistChronology0);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 9, (Chronology) julianChronology0);
      boolean boolean0 = fixedDateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(600, "JST");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
      long long0 = dateTimeZone0.adjustOffset(10800714L, true);
      assertEquals(10800714L, long0);
  }
}
