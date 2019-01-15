/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 12:44:13 GMT 2018
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Locale;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTimeZone_ESTest extends DateTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) null);
      Object object0 = ((DateTimeZone)cachedDateTimeZone0).writeReplace();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Set<String> set0 = DateTimeZone.getAvailableIDs();
      assertEquals(578, set0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NameProvider nameProvider0 = DateTimeZone.getNameProvider();
      DateTimeZone.setNameProvider(nameProvider0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) null);
      LocalDateTime localDateTime1 = localDateTime0.withMinuteOfHour(1);
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Provider provider0 = DateTimeZone.getProvider();
      assertNotNull(provider0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      assertEquals("America/Los_Angeles", timeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("+01:00");
      assertEquals("+01:00", dateTimeZone0.toString());
      assertNotNull(dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      String string0 = dateTimeZone0.toString();
      assertEquals("America/Los_Angeles", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      try { 
        dateTimeFormatter0.parseLocalDate("org.joda.time.LocalDate");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"org.joda.time.LocalDate\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("America/Los_Angeles", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("America/Los_Angeles", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-org.joda.time.chrono.BasicWeekyearDateTimeField");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-org.joda.time.chrono.BasicWeekye...\" is malformed at \"org.joda.time.chrono.BasicWeekye...\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:00");
      assertNotNull(dateTimeZone0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, 222);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 222
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHours((-28378032));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Hours out of range: -28378032
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHours(128);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Hours out of range: 128
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, (-465));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -465
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(17, (-59));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Positive hours must not have negative minutes: -59
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZone.forOffsetMillis((-141877189));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Millis out of range: -141877189
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZone.forOffsetMillis(Integer.MAX_VALUE);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Millis out of range: 2147483647
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("UTC");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1130), "America/St_Johns");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
      DateTime dateTime0 = new DateTime();
      int int0 = dateTimeZone0.getOffset((ReadableInstant) dateTime0);
      assertEquals((-12600000), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1313), "3kq(CLJ,");
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '3kq(CLJ,' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1418), "MET");
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'MET' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutes(1, 57);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone0);
      assertEquals("+01:57", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes((-23), (-23));
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-23:23", dateTimeZone0.getID());
      assertEquals("-23:23", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone.setNameProvider((NameProvider) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      Locale locale0 = Locale.UK;
      String string0 = dateTimeZone0.getName((-1061L), locale0);
      assertEquals("+00:00:00.001", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getName((-9223372036854775803L));
      assertEquals("-07:52:58", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Locale locale0 = Locale.PRC;
      String string0 = dateTimeZone0.getShortName(0L, locale0);
      assertNotNull(string0);
      assertEquals("-08:00", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      String string0 = dateTimeZone0.getShortName((-3082L));
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      Locale locale0 = Locale.ROOT;
      String string0 = dateTimeZone0.getName(88L, locale0);
      assertEquals("-08:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      dateTimeZone0.UTC.getOffset((ReadableInstant) null);
      assertEquals("+00:00:00.001", dateTimeZone0.toString());
      assertEquals("+00:00:00.001", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset((-5756400001L));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      boolean boolean0 = fixedDateTimeZone0.isStandardOffset(100000000000000L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) null);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffsetFromLocal(9971999999L);
      assertEquals((-25200000), int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffsetFromLocal((-5756400001L));
      assertEquals((-28800000), int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("EET");
      int int0 = dateTimeZone0.getOffsetFromLocal((-28378000L));
      assertEquals(7200000, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("MET");
      int int0 = dateTimeZone0.getOffsetFromLocal((-28377966L));
      assertEquals(3600000, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalTime localTime0 = LocalTime.now((Chronology) buddhistChronology0);
      int[] intArray0 = buddhistChronology0.get((ReadablePartial) localTime0, 4890L);
      assertArrayEquals(new int[] {16, 0, 4, 890}, intArray0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(11);
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
  public void test47()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone0.convertLocalToUTC((-2706L), true);
      assertEquals(28797294L, long0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC(9223372036854775807L, false);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC(9223372036854775807L, true);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      long long0 = fixedDateTimeZone0.convertLocalToUTC((-212L), false);
      assertEquals((-212L), long0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(10);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, (-28800000L));
      assertEquals(10L, long0);
      assertEquals("+00:00:00.010", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) null);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertEquals("+00:00:00.001", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(9223372036854775807L, false);
      assertEquals(9223372036854775807L, long0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      long long0 = dateTimeZone0.UTC.adjustOffset(2983L, false);
      assertEquals(2983L, long0);
      assertEquals("+00:00:00.001", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset((-9223372036854775803L), false);
      assertEquals((-9223372036854775803L), long0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset((-5756400001L), true);
      assertEquals((-5752800001L), long0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(25693200000L, false);
      assertEquals(25689600000L, long0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(25693200000L, true);
      assertEquals(25693200000L, long0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset((-5756400001L), false);
      assertEquals((-5756400001L), long0);
  }
}