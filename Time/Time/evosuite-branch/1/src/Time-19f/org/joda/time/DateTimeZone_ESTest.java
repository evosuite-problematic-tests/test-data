/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 13:11:48 GMT 2018
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTimeZone_ESTest extends DateTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      String string0 = dateTimeZone0.getShortName((long) (-28800000));
      assertNotNull(string0);
      assertEquals("-08:00", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(1);
      ((DateTimeZone)fixedDateTimeZone0).writeReplace();
      assertEquals("+00:00:00.001", fixedDateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(522);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals(522, timeZone0.getRawOffset());
      assertEquals("+00:00:00.522", dateTimeZone0.toString());
      assertNotNull(dateTimeZone1);
      assertEquals("+00:00:00.522", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(522);
      String string0 = dateTimeZone0.getName(0L);
      assertEquals("+00:00:00.522", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      String string0 = dateTimeZone0.toString();
      assertEquals("America/Los_Angeles", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Set<String> set0 = DateTimeZone.getAvailableIDs();
      assertFalse(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NameProvider nameProvider0 = DateTimeZone.getNameProvider();
      DateTimeZone.setNameProvider(nameProvider0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("America/Los_Angeles", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Provider provider0 = DateTimeZone.getProvider();
      assertNotNull(provider0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
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
  public void test10()  throws Throwable  {
      DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("America/Los_Angeles", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:00");
      assertNotNull(dateTimeZone0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("-00:00:00.001");
      assertNotNull(dateTimeZone0);
      assertEquals("-00:00:00.001", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, 1731);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 1731
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes((-1134), (-1134));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1134
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      TimeZone timeZone0 = dateTimeZone0.UTC.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      TimeZone timeZone0 = TimeZone.getTimeZone("IST");
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'IST' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-6));
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone1);
      assertEquals("-06:00", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone.setNameProvider((NameProvider) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3178000);
      assertEquals("+00:52:58", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(522);
      Locale locale0 = Locale.ITALY;
      String string0 = dateTimeZone0.getShortName(0L, locale0);
      assertEquals("+00:00:00.522", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(522);
      Locale locale0 = Locale.ITALY;
      String string0 = dateTimeZone0.getName((long) 522, locale0);
      assertEquals("+00:00:00.522", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.CHINA;
      String string0 = dateTimeZone0.getName(1L, locale0);
      assertNotNull(string0);
      assertEquals("-08:00", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateMidnight dateMidnight0 = DateMidnight.now(dateTimeZone0);
      dateTimeZone0.UTC.getOffset((ReadableInstant) dateMidnight0);
      assertEquals(1392364800000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(522);
      int int0 = dateTimeZone0.getOffset((ReadableInstant) null);
      assertEquals(522, int0);
      assertEquals("+00:00:00.522", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset((-5756400001L));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(522);
      boolean boolean0 = dateTimeZone0.isStandardOffset(0L);
      assertTrue(boolean0);
      assertEquals("+00:00:00.522", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffsetFromLocal(9223372036854775807L);
      assertEquals((-28378000), int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("Pacific/Guadalcanal");
      int int0 = dateTimeZone0.getOffsetFromLocal((-9223372036829575809L));
      assertEquals(38388000, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("Pacific/Guadalcanal");
      int int0 = dateTimeZone0.getOffsetFromLocal((-39603145L));
      assertEquals(39600000, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("Pacific/Guadalcanal");
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      DateMidnight dateMidnight0 = new DateMidnight((-39603145L), (Chronology) gregorianChronology0);
      DateMidnight dateMidnight1 = dateMidnight0.plusMonths((-3188));
      assertEquals((-8383862388000L), dateMidnight1.getMillis());
      assertEquals((-126000000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("Pacific/Guadalcanal");
      int int0 = dateTimeZone0.getOffsetFromLocal(9223372036854775807L);
      assertEquals(38388000, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(0L, false);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeZone0.convertUTCToLocal((-9223372036854775788L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC(9223372036854775772L, false, (-34L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.UTC.convertLocalToUTC((-1881L), true);
      assertEquals((-1881L), long0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC(9223372036854775807L, true, 2033L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("Pacific/Guadalcanal");
      // Undeclared exception!
      try { 
        fixedDateTimeZone0.getMillisKeepLocal(dateTimeZone0, (-9223372036843975840L));
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
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("Pacific/Guadalcanal");
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC((-9223372036829575809L), true);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(37);
      long long0 = dateTimeZone0.convertLocalToUTC(0L, true);
      assertEquals((-133200000L), long0);
      assertEquals("+37:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      long long0 = fixedDateTimeZone0.UTC.getMillisKeepLocal((DateTimeZone) null, 0L);
      assertEquals(28800000L, long0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.getMillisKeepLocal(dateTimeZone0, (-4899L));
      assertEquals((-4899L), long0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(751, 751, 1);
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(mockGregorianCalendar0);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1279);
      boolean boolean0 = dateTimeZone0.UTC.isLocalDateTimeGap((LocalDateTime) null);
      assertFalse(boolean0);
      assertEquals("+00:00:01.279", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(522);
      long long0 = dateTimeZone0.adjustOffset((-665L), true);
      assertEquals("+00:00:00.522", dateTimeZone0.getID());
      assertEquals((-665L), long0);
  }
}
