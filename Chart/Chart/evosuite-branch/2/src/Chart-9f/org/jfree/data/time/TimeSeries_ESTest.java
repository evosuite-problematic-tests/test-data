/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 10:58:08 GMT 2019
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Second;
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.time.SpreadsheetDate;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.xy.OHLCDataItem;
import org.jfree.data.xy.XYDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeSeries_ESTest extends TimeSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, 2204.3921043893747);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) fixedMillisecond0, (RegularTimePeriod) fixedMillisecond0);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals(1, timeSeries0.getItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1000);
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0);
      // Undeclared exception!
      try { 
        timeSeries0.update(0, (Number) 2);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1000);
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0);
      timeSeries0.getItems();
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("Value", timeSeries0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3, 1600, 1600, 2939, (-2838));
      Year year0 = new Year(mockDate0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "", "Gl)rGEqYI^3#`jcKg", class0);
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
  public void test04()  throws Throwable  {
      Day day0 = new Day();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "Aw!fs=Tsk,-zyy", "", class0);
      TimeSeries timeSeries1 = new TimeSeries(day0);
      timeSeries1.add((RegularTimePeriod) day0, (Number) null);
      timeSeries0.addAndOrUpdate(timeSeries1);
      timeSeries0.getValue((RegularTimePeriod) day0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) fixedMillisecond0, 950.42474427843);
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, class0);
      timeSeries0.add((RegularTimePeriod) fixedMillisecond0, (double) (-3811));
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You are attempting to add an observation for the time period Fri Feb 14 20:21:21 GMT 2014 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "", "b^GUm#5/PlV\";#Py]4", class0);
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      timeSeries1.setDomainDescription("{%FJ/|RrLX)");
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals("{%FJ/|RrLX)", timeSeries1.getDomainDescription());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      TimeSeries timeSeries1 = new TimeSeries(second0);
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertEquals("Time", timeSeries1.getDomainDescription());
      assertEquals("Value", timeSeries1.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "org.jfree.data.xy.XYIntervalSeries", "org.jfree.data.xy.XYIntervalSeries", class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-547));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, 2204.3921043893747);
      assertEquals(1, timeSeries0.getItemCount());
      
      timeSeries0.setMaximumItemCount(0);
      assertEquals(0, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-16115L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Day day0 = new Day();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "eWwJ", "eWwJ", class0);
      timeSeries0.getDataItem((RegularTimePeriod) day0);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("eWwJ", timeSeries0.getRangeDescription());
      assertEquals("eWwJ", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, 2204.3921043893747);
      timeSeries0.getTimePeriods();
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Day day0 = new Day();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "Aw!fs=Tsk,-zyy", "", class0);
      TimeSeries timeSeries1 = new TimeSeries(day0);
      timeSeries1.add((RegularTimePeriod) day0, (Number) null);
      timeSeries0.addAndOrUpdate(timeSeries1);
      timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries0);
      assertEquals(1, timeSeries1.getItemCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Day day0 = new Day();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "Aw!fs=Tsk,-zyy", "", class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) day0, 1262.8916517987);
      TimeSeries timeSeries1 = new TimeSeries(day0);
      timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, 0.0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, "c", "You are trying to add data where the time period class ", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((RegularTimePeriod) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
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
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.previous();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) fixedMillisecond0, 950.42474427843);
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, class0);
      timeSeries0.add(regularTimePeriod0, (double) (-3820));
      timeSeries0.add(timeSeriesDataItem0, false);
      assertEquals(2, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.previous();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(regularTimePeriod0, (double) (-2083));
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, class0);
      Float float0 = new Float(1.0);
      timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (Number) float0);
      timeSeries0.add(regularTimePeriod0, (double) (-3811));
      assertEquals(2, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Day day0 = new Day();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "Aw!fs=Tsk,-zyy", "Aw!fs=Tsk,-zyy", class0);
      TimeSeries timeSeries1 = new TimeSeries(day0);
      TimeSeries timeSeries2 = timeSeries0.addAndOrUpdate(timeSeries1);
      timeSeries2.setMaximumItemCount(0);
      timeSeries2.add((RegularTimePeriod) day0, (Number) null);
      assertEquals(0, timeSeries2.getMaximumItemCount());
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Day day0 = new Day();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "Aw!fs=Tsk,-zyy", "Aw!fs=Tsk,-zyy", class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) day0, (Number) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Day day0 = new Day();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "Aw!fs=Tsk,-zyy", "", class0);
      TimeSeries timeSeries1 = new TimeSeries(day0);
      timeSeries1.add((RegularTimePeriod) day0, (Number) null);
      timeSeries0.addAndOrUpdate(timeSeries1);
      // Undeclared exception!
      try { 
        timeSeries1.addAndOrUpdate(timeSeries0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Day, but the TimeSeries is expecting an instance of org.jfree.data.time.RegularTimePeriod.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Day day0 = new Day();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "Aw!fs=Tsk,-zyy", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.addOrUpdate((RegularTimePeriod) null, (Number) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Minute minute0 = new Minute(mockDate0);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      
      timeSeries0.setMaximumItemCount(0);
      timeSeries0.addOrUpdate((RegularTimePeriod) minute0, (Number) 0);
      assertEquals(0, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Day day0 = new Day();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "", "", class0);
      byte[] byteArray0 = new byte[5];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      timeSeries0.addOrUpdate((RegularTimePeriod) day0, (Number) bigInteger0);
      RegularTimePeriod regularTimePeriod0 = day0.previous();
      timeSeries0.addOrUpdate(regularTimePeriod0, 0.0);
      timeSeries0.setMaximumItemAge(0L);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Day day0 = new Day();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "", "", class0);
      byte[] byteArray0 = new byte[5];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      timeSeries0.addOrUpdate((RegularTimePeriod) day0, (Number) bigInteger0);
      RegularTimePeriod regularTimePeriod0 = day0.previous();
      timeSeries0.setMaximumItemAge(0L);
      timeSeries0.addOrUpdate(regularTimePeriod0, (Number) (byte)0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Day day0 = new Day();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "", "t", class0);
      timeSeries0.removeAgedItems((long) (byte) (-25), false);
      timeSeries0.removeAgedItems((-1761L), false);
      assertEquals("t", timeSeries0.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("", timeSeries0.getDomainDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.add((RegularTimePeriod) day0, 0.0);
      timeSeries0.removeAgedItems((long) 2147, true);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Day day0 = new Day();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "", "t", class0);
      BigInteger bigInteger0 = BigInteger.ONE;
      timeSeries0.addOrUpdate((RegularTimePeriod) day0, (Number) bigInteger0);
      timeSeries0.setMaximumItemAge(0L);
      assertEquals(1, timeSeries0.getItemCount());
      
      timeSeries0.removeAgedItems((-1761L), false);
      assertEquals("", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Day day0 = new Day();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "", "t", class0);
      BigInteger bigInteger0 = BigInteger.ONE;
      timeSeries0.addOrUpdate((RegularTimePeriod) day0, (Number) bigInteger0);
      timeSeries0.setMaximumItemAge(0L);
      assertEquals(1, timeSeries0.getItemCount());
      
      timeSeries0.removeAgedItems((long) (byte)103, true);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.clear();
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals("Time", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Day day0 = new Day();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "Aw!fs=Tsk,-zyy", "", class0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) day0);
      TimeSeries timeSeries1 = new TimeSeries(day0);
      timeSeries1.add((RegularTimePeriod) day0, number0);
      assertEquals(1, timeSeries1.getItemCount());
      
      timeSeries1.clear();
      assertEquals("Time", timeSeries1.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Day day0 = new Day();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "eWwJ", "eWwJ", class0);
      timeSeries0.delete((RegularTimePeriod) day0);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("eWwJ", timeSeries0.getRangeDescription());
      assertEquals("eWwJ", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, 2204.3921043893747);
      assertEquals(1, timeSeries0.getItemCount());
      
      timeSeries0.delete((RegularTimePeriod) fixedMillisecond0);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(0, (-2163));
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
      Day day0 = new Day();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "Aw!fs=Tsk,-zyy", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-2072), (-2072));
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
      Quarter quarter0 = new Quarter();
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(4244, 4);
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
      Day day0 = new Day();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "eWwJ", "eWwJ", class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(31, 31);
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals("eWwJ", timeSeries1.getRangeDescription());
      assertEquals("eWwJ", timeSeries1.getDomainDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertNotSame(timeSeries1, timeSeries0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Day day0 = new Day();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "Aw!fs=Tsk,-zyy", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) null, (RegularTimePeriod) day0);
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
      Day day0 = new Day();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "Aw!fs=Tsk,-zyy", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) day0, (RegularTimePeriod) null);
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
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-1L), 469L);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0, ";6#j|r+25", "Time", class0);
      Month month0 = new Month();
      RegularTimePeriod regularTimePeriod0 = month0.next();
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(regularTimePeriod0, (RegularTimePeriod) month0);
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
      MockDate mockDate0 = new MockDate();
      Minute minute0 = new Minute(mockDate0);
      RegularTimePeriod regularTimePeriod0 = minute0.next();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0, class0);
      timeSeries0.addOrUpdate(regularTimePeriod0, (Number) 0);
      timeSeries0.createCopy((RegularTimePeriod) minute0, (RegularTimePeriod) minute0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.previous();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(regularTimePeriod0, 950.42474427843);
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, class0);
      timeSeries0.add(timeSeriesDataItem0, false);
      timeSeries0.createCopy((RegularTimePeriod) fixedMillisecond0, (RegularTimePeriod) fixedMillisecond0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-3811), (-2083), (-2083));
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) fixedMillisecond0, (double) (-2083));
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, class0);
      boolean boolean0 = timeSeries0.equals(mockDate0);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertFalse(boolean0);
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals("Time", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1000);
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0);
      MockDate mockDate0 = new MockDate(0);
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(mockDate0, 2, 767.5980816633, 1, 0.0, (-2196.503890111));
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries1 = new TimeSeries(oHLCDataItem0, "", "", class0);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertFalse(boolean0);
      assertEquals("", timeSeries1.getRangeDescription());
      assertEquals("", timeSeries1.getDomainDescription());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertEquals("Value", timeSeries0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(2476L);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      assertTrue(timeSeries1.equals((Object)timeSeries0));
      
      timeSeries1.setRangeDescription((String) null);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertFalse(timeSeries1.equals((Object)timeSeries0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(2476L);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      timeSeries1.setMaximumItemAge(2476L);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals(2476L, timeSeries1.getMaximumItemAge());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Quarter quarter0 = new Quarter(2, 2);
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      timeSeries0.setMaximumItemCount(4);
      TimeSeries timeSeries1 = new TimeSeries(quarter0);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals(4, timeSeries0.getMaximumItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(2476L);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (double) 2476L);
      Object object0 = timeSeries0.clone();
      boolean boolean0 = timeSeries0.equals(object0);
      assertEquals(1, timeSeries0.getItemCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(2476L);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (double) 2476L);
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      assertEquals(1, timeSeries0.getItemCount());
      
      Short short0 = new Short((short) (-210));
      timeSeries1.update((RegularTimePeriod) fixedMillisecond0, (Number) short0);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0, (String) null, (String) null, (Class) null);
      timeSeries0.hashCode();
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Day day0 = new Day();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "", "t", class0);
      byte[] byteArray0 = new byte[5];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      timeSeries0.addOrUpdate((RegularTimePeriod) day0, (Number) bigInteger0);
      timeSeries0.hashCode();
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Minute minute0 = new Minute(mockDate0);
      RegularTimePeriod regularTimePeriod0 = minute0.next();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0, class0);
      timeSeries0.addOrUpdate(regularTimePeriod0, (Number) 0);
      timeSeries0.addOrUpdate((RegularTimePeriod) minute0, (Number) 0);
      timeSeries0.hashCode();
      assertEquals(2, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Minute minute0 = new Minute(mockDate0);
      RegularTimePeriod regularTimePeriod0 = minute0.next();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0, class0);
      ArrayList<TimeSeriesDataItem> arrayList0 = new ArrayList<TimeSeriesDataItem>();
      timeSeries0.data = (List) arrayList0;
      timeSeries0.addOrUpdate(regularTimePeriod0, (Number) 0);
      timeSeries0.addOrUpdate((RegularTimePeriod) minute0, (Number) 0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) minute0);
      arrayList0.add(timeSeriesDataItem0);
      assertEquals(3, arrayList0.size());
      
      timeSeries0.hashCode();
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }
}
