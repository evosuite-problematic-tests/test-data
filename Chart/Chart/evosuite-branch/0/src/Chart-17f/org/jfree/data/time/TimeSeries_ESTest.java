/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 10:07:20 GMT 2018
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.SequenceInputStream;
import java.time.Instant;
import java.util.Date;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Second;
import org.jfree.data.time.SpreadsheetDate;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XYDataItem;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeSeries_ESTest extends TimeSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = JLayeredPane.MODAL_LAYER;
      XYDataItem xYDataItem0 = new XYDataItem((Number) integer0, (Number) integer0);
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      // Undeclared exception!
      try { 
        timeSeries0.update((-1140), (Number) integer0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.getItems();
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Week week0 = new Week();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getNextTimePeriod();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Second second0 = new Second();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      timeSeries0.add((RegularTimePeriod) second0, (double) 0, true);
      timeSeries0.getValue((RegularTimePeriod) second0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertEquals("Value", timeSeries1.getRangeDescription());
      assertEquals("Time", timeSeries1.getDomainDescription());
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertNotSame(timeSeries1, timeSeries0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.add((RegularTimePeriod) day0, (Number) 23, true);
      System.setCurrentTimeMillis(23);
      Day day1 = new Day();
      timeSeries0.addOrUpdate((RegularTimePeriod) day1, (double) 0);
      timeSeries0.hashCode();
      assertEquals(2, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-132L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      TimeSeries timeSeries1 = new TimeSeries(fixedMillisecond0);
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertEquals("Value", timeSeries1.getRangeDescription());
      assertEquals("Time", timeSeries1.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Second second0 = new Second();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-650));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Month month0 = new Month();
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, (String) null, (String) null, class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-673L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Year year0 = new Year();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      timeSeries0.getDataItem((RegularTimePeriod) year0);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Time", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      timeSeries0.addOrUpdate((RegularTimePeriod) second0, (double) 59);
      timeSeries0.getDataItem((RegularTimePeriod) second0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      timeSeries0.addOrUpdate((RegularTimePeriod) second0, (double) 59);
      timeSeries0.getTimePeriods();
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Second second0 = new Second();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      timeSeries0.add((RegularTimePeriod) second0, (double) 0, false);
      timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-23));
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Hour hour0 = new Hour(mockDate0, zoneInfo0);
      Minute minute0 = new Minute((-23), hour0);
      Second second0 = new Second((-23), minute0);
      Class<JCheckBoxMenuItem> class0 = JCheckBoxMenuItem.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      Day day0 = new Day(mockDate0);
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 23);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) day0, (RegularTimePeriod) hour0);
      timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries0);
      assertEquals(1, timeSeries0.getItemCount());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(59);
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getIndex((RegularTimePeriod) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Second second0 = new Second();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      timeSeries0.getValue((RegularTimePeriod) second0);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals("Time", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      // Undeclared exception!
      try { 
        timeSeries0.add((TimeSeriesDataItem) null, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'item' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Second second0 = new Second();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      timeSeries0.add((RegularTimePeriod) second0, (double) 0, true);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) second0, (Number) 59);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You are attempting to add an observation for the time period Fri Feb 14 20:21:21 GMT 2014 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Second second0 = new Second();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      timeSeries0.add((RegularTimePeriod) second0, (double) 0, true);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) second0, (Number) 59);
      assertEquals(1, timeSeries0.getItemCount());
      
      timeSeries0.setMaximumItemCount(0);
      timeSeries0.add(timeSeriesDataItem0, true);
      assertEquals("Time", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      Quarter quarter0 = new Quarter();
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) quarter0, (Number) 4);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      timeSeries0.addOrUpdate((RegularTimePeriod) second0, (double) 59);
      assertEquals(1, timeSeries0.getItemCount());
      
      timeSeries0.update((RegularTimePeriod) second0, (Number) 59);
      assertEquals("Time", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Second second0 = new Second();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      timeSeries0.add((RegularTimePeriod) second0, (double) 0, true);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals("Time", timeSeries1.getDomainDescription());
      assertEquals("Value", timeSeries1.getRangeDescription());
      assertEquals(1, timeSeries1.getItemCount());
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertNotSame(timeSeries1, timeSeries0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Second second0 = new Second();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      timeSeries0.add((RegularTimePeriod) second0, (double) 0, true);
      TimeSeries timeSeries1 = new TimeSeries(0, class0);
      timeSeries1.addAndOrUpdate(timeSeries0);
      assertEquals(1, timeSeries1.getItemCount());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Week week0 = new Week();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.addOrUpdate((RegularTimePeriod) null, (Number) 53);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Second second0 = new Second();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      timeSeries0.setMaximumItemCount(0);
      timeSeries0.addOrUpdate((RegularTimePeriod) second0, (Number) 0);
      assertEquals(0, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.add((RegularTimePeriod) day0, (Number) 23, false);
      timeSeries0.setMaximumItemAge(23);
      System.setCurrentTimeMillis(23);
      Day day1 = new Day();
      timeSeries0.addOrUpdate((RegularTimePeriod) day1, (-2597.8038432599));
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.removeAgedItems((long) 0, true);
      timeSeries0.removeAgedItems((-2994L), false);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Second second0 = new Second();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      timeSeries0.add((RegularTimePeriod) second0, (double) 0, true);
      timeSeries0.removeAgedItems((long) (-1353), true);
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Class<String> class0 = String.class;
      Class class1 = RegularTimePeriod.downsize(class0);
      timeSeries0.add((RegularTimePeriod) day0, (Number) 23, true);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      
      timeSeries0.setMaximumItemAge(23);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) day0, (RegularTimePeriod) hour0);
      timeSeries1.timePeriodClass = class1;
      timeSeries1.removeAgedItems((long) 0, true);
      assertEquals("Value", timeSeries0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Class<String> class0 = String.class;
      Class class1 = RegularTimePeriod.downsize(class0);
      timeSeries0.add((RegularTimePeriod) day0, (Number) 23, true);
      timeSeries0.setMaximumItemAge(23);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) day0, (RegularTimePeriod) hour0);
      timeSeries1.timePeriodClass = class1;
      timeSeries1.removeAgedItems((-2994L), false);
      assertEquals(1, timeSeries0.getItemCount());
      assertEquals("Value", timeSeries0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Second second0 = new Second();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      timeSeries0.clear();
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("Time", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Second second0 = new Second();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      timeSeries0.add((RegularTimePeriod) second0, (double) 0, true);
      timeSeries0.clear();
      assertEquals(0, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Second second0 = new Second();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      timeSeries0.delete((RegularTimePeriod) second0);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Second second0 = new Second();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      timeSeries0.add((RegularTimePeriod) second0, (double) 0, false);
      timeSeries0.delete((RegularTimePeriod) second0);
      assertEquals(0, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(Integer.MAX_VALUE, 3443);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, (String) null, "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-1), (-1359));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour();
      RegularTimePeriod regularTimePeriod0 = day0.previous();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.add((RegularTimePeriod) day0, (Number) 23, false);
      timeSeries0.add(regularTimePeriod0, (-1561.2958407));
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) day0, (RegularTimePeriod) hour0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(59, 59);
      assertEquals("Time", timeSeries1.getDomainDescription());
      assertEquals("Value", timeSeries1.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertNotSame(timeSeries1, timeSeries0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Month month0 = new Month();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) null, (RegularTimePeriod) month0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'start' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) hour0, (RegularTimePeriod) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'end' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.previous();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) fixedMillisecond0, regularTimePeriod0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start on or before end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour((-11), day0);
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.addOrUpdate((RegularTimePeriod) day0, (Number) 0);
      Instant instant0 = MockInstant.ofEpochSecond((long) (-11), (-1L));
      Date date0 = Date.from(instant0);
      Day day1 = new Day(date0);
      timeSeries0.createCopy((RegularTimePeriod) day1, (RegularTimePeriod) day0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) day0, (RegularTimePeriod) hour0);
      timeSeries1.setMaximumItemCount(0);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals(0, timeSeries1.getMaximumItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-650), 0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      boolean boolean0 = timeSeries0.equals(sequenceInputStream0);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertFalse(boolean0);
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour((-11), day0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) day0, (RegularTimePeriod) hour0);
      assertTrue(timeSeries1.equals((Object)timeSeries0));
      
      timeSeries1.setDescription("");
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertFalse(timeSeries1.equals((Object)timeSeries0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour((-11), day0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) day0, (RegularTimePeriod) hour0);
      timeSeries1.setDomainDescription("j3c[]x|6OH?");
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals("j3c[]x|6OH?", timeSeries1.getDomainDescription());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour((-11), day0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) day0, (RegularTimePeriod) hour0);
      timeSeries1.setRangeDescription("4/PCcp%?");
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals("4/PCcp%?", timeSeries1.getRangeDescription());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour((-11), day0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) day0, (RegularTimePeriod) hour0);
      timeSeries0.setMaximumItemAge(3739L);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals(3739L, timeSeries0.getMaximumItemAge());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour((-11), day0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) day0, (RegularTimePeriod) hour0);
      assertTrue(timeSeries1.equals((Object)timeSeries0));
      
      timeSeries1.add((RegularTimePeriod) day0, (Number) 0);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.add((RegularTimePeriod) day0, (Number) 23, false);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) day0, (RegularTimePeriod) hour0);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals("Time", timeSeries1.getDomainDescription());
      assertEquals("Value", timeSeries1.getRangeDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertNotSame(timeSeries1, timeSeries0);
      assertTrue(boolean0);
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.add((RegularTimePeriod) day0, (Number) 23, false);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) day0, (RegularTimePeriod) hour0);
      assertTrue(timeSeries1.equals((Object)timeSeries0));
      
      timeSeries0.addOrUpdate((RegularTimePeriod) day0, (-628.0));
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MockDate mockDate0 = new MockDate(39, 39, 3, 39, (-4271));
      Year year0 = new Year(mockDate0);
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, (String) null, "#FKQ{S", class0);
      timeSeries0.hashCode();
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("#FKQ{S", timeSeries0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries("", "", (String) null, class0);
      timeSeries0.hashCode();
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("", timeSeries0.getDomainDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries(0, (Class) null);
      timeSeries0.hashCode();
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.add((RegularTimePeriod) day0, (Number) 23, false);
      timeSeries0.hashCode();
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }
}
