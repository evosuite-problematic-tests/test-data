/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 00:01:30 GMT 2019
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
import org.evosuite.runtime.mock.java.util.MockDate;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.tz.DefaultNameProvider;
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
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forID("Africa/Addis_Ababa");
      Object object0 = ((DateTimeZone)fixedDateTimeZone0).writeReplace();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("UTC", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      String string0 = dateTimeZone0.UTC.getName(3318L);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      String string0 = fixedDateTimeZone0.toString();
      assertEquals("UTC", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Set<String> set0 = DateTimeZone.getAvailableIDs();
      assertEquals(572, set0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-28800000));
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("-08:00");
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("-08:00", dateTimeZone1.toString());
      assertNotNull(dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NameProvider nameProvider0 = DateTimeZone.getNameProvider();
      assertNotNull(nameProvider0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Provider provider0 = DateTimeZone.getProvider();
      assertNotNull(provider0);
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
      assertEquals("America/Los_Angeles", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, 572);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 572
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes((-2362), (-983));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -983
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      assertEquals("+01:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone0, fixedDateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("hourOfDay");
      timeZone0.setID("+00:00");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("+00:00");
      assertSame(dateTimeZone1, dateTimeZone0);
      assertNotNull(dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      TimeZone timeZone0 = TimeZone.getTimeZone("WET");
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'WET' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
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
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2936));
      assertEquals("-00:00:02.936", dateTimeZone0.toString());
      
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-25200000), "Ci10U]d?@rf)xfao");
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(simpleTimeZone0);
      assertEquals("-07:00", dateTimeZone1.getID());
      assertNotNull(dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      DateTimeZone.setNameProvider(defaultNameProvider0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone.setNameProvider((NameProvider) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone1);
      assertSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      Locale locale0 = Locale.GERMANY;
      String string0 = dateTimeZone0.getName((-9223372036854775779L), locale0);
      assertNotNull(string0);
      assertEquals("-07:52:58", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      Locale locale0 = new Locale("UTC");
      String string0 = dateTimeZone0.getShortName((long) 0, locale0);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(205);
      Locale locale0 = Locale.PRC;
      String string0 = dateTimeZone0.getShortName((long) 205, locale0);
      assertEquals("+00:00:00.205", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2021730694));
      Locale locale0 = Locale.JAPANESE;
      String string0 = dateTimeZone0.getName((-114L), locale0);
      assertEquals("-561:35:30.694", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      DateTime dateTime0 = DateTime.now();
      int int0 = dateTimeZone0.getOffset((ReadableInstant) dateTime0);
      assertEquals((-28800000), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffset((ReadableInstant) null);
      assertEquals((-28800000), int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      boolean boolean0 = dateTimeZone0.isStandardOffset(9223372036854775807L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      boolean boolean0 = dateTimeZone0.isStandardOffset(28800015L);
      assertTrue(boolean0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffsetFromLocal(986119199999L);
      assertEquals((-25200000), int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffsetFromLocal((-5756400001L));
      assertEquals((-28800000), int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("Africa/Addis_Ababa");
      int int0 = dateTimeZone0.getOffsetFromLocal((-9223372036854775778L));
      assertEquals(9288000, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("Africa/Addis_Ababa");
      int int0 = dateTimeZone0.getOffsetFromLocal((-1062210920001L));
      assertEquals(9320000, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("Africa/Addis_Ababa");
      int int0 = dateTimeZone0.getOffsetFromLocal((-9223372036826397823L));
      assertEquals(9288000, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("Africa/Addis_Ababa");
      int int0 = dateTimeZone0.getOffsetFromLocal(9223372036854775807L);
      assertEquals(9320000, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(205);
      // Undeclared exception!
      try { 
        dateTimeZone0.convertUTCToLocal(9223372036854775807L);
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
      long long0 = dateTimeZone0.convertLocalToUTC((-9223372036854775779L), true, 604800000L);
      assertEquals((-9223372036826397779L), long0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC(9223372036854775807L, true, 604800000L);
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
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC(9223372036854775793L, false, (long) (-28378000));
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
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-28800000));
      long long0 = dateTimeZone0.convertLocalToUTC((-340L), false);
      assertEquals("-08:00", dateTimeZone0.toString());
      assertEquals(28799660L, long0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 0);
      assertEquals(28800000L, long0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(0L, (Chronology) null);
      MockDate mockDate0 = new MockDate(0L);
      MonthDay monthDay0 = MonthDay.fromDateFields(mockDate0);
      LocalDateTime localDateTime1 = localDateTime0.withFields(monthDay0);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset((-5756400001L), false);
      assertEquals((-5756400001L), long0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.UTC.adjustOffset((-9223372036854775779L), false);
      assertEquals((-9223372036854775779L), long0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset((-9223372036854775796L), false);
      assertEquals((-9223372036854775796L), long0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(9223372036854775807L, false);
      assertEquals(9223372036854775807L, long0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      long long0 = dateTimeZone0.adjustOffset((-2717640000000L), false);
      assertEquals((-2717640422000L), long0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      long long0 = dateTimeZone0.adjustOffset((-2717640000000L), true);
      assertEquals((-2717640000000L), long0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset((-5756400001L), true);
      assertEquals((-5752800001L), long0);
  }
}
