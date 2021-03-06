/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 10:54:16 GMT 2019
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.TimePeriod;
import org.jfree.data.time.TimePeriodValue;
import org.jfree.data.time.TimePeriodValues;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XYDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimePeriodValues_ESTest extends TimePeriodValues_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(868.30226, 868.30226);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(xYDataItem0, "vWHGZO+", "");
      int int0 = timePeriodValues0.getMaxMiddleIndex();
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals("", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals("vWHGZO+", timePeriodValues0.getDomainDescription());
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(868.30226, 868.30226);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(xYDataItem0, "vWHGZO+", "vWHGZO+");
      assertEquals("vWHGZO+", timePeriodValues0.getDomainDescription());
      
      timePeriodValues0.setDomainDescription("Value");
      assertEquals("Value", timePeriodValues0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Year year0 = new Year();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(year0, "TableOrder.BY_COLUMN", "]d5V1s6-k5{}kjA8ELL");
      // Undeclared exception!
      try { 
        timePeriodValues0.getValue(91);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 91, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Year year0 = new Year();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(year0, "TableOrder.BY_COLUMN", "]d5V1s6-k5{}kjA8ELL");
      int int0 = timePeriodValues0.getMinEndIndex();
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals("]d5V1s6-k5{}kjA8ELL", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals("TableOrder.BY_COLUMN", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(fixedMillisecond0);
      int int0 = timePeriodValues0.getMaxStartIndex();
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals("Value", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), int0);
      assertEquals("Time", timePeriodValues0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(fixedMillisecond0);
      int int0 = timePeriodValues0.getMinStartIndex();
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals("Value", timePeriodValues0.getRangeDescription());
      assertEquals("Time", timePeriodValues0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1565L));
      Millisecond millisecond0 = new Millisecond(mockDate0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(millisecond0);
      // Undeclared exception!
      try { 
        timePeriodValues0.getTimePeriod((-2100));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Year year0 = new Year();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(year0, "TableOrder.BY_COLUMN", "]d5V1s6-k5{}kjA8ELL");
      int int0 = timePeriodValues0.getMaxEndIndex();
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals("TableOrder.BY_COLUMN", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals("]d5V1s6-k5{}kjA8ELL", timePeriodValues0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hour hour0 = new Hour();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0, "`_FHuK<v_kqga$E]", "A connection must be supplied.");
      // Undeclared exception!
      try { 
        timePeriodValues0.update(0, 23);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, (-1732));
      Week week0 = new Week(mockDate0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(week0);
      int int0 = timePeriodValues0.getMinMiddleIndex();
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals("Time", timePeriodValues0.getDomainDescription());
      assertEquals("Value", timePeriodValues0.getRangeDescription());
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Year year0 = new Year(mockDate0, timeZone0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(year0);
      // Undeclared exception!
      try { 
        timePeriodValues0.add((TimePeriodValue) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null item not allowed.
         //
         verifyException("org.jfree.data.time.TimePeriodValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(868.30226, 868.30226);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(xYDataItem0, "vWHGZO+", "vWHGZO+");
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-3966L));
      timePeriodValues0.add((TimePeriod) fixedMillisecond0, 868.30226);
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.previous();
      timePeriodValues0.add((TimePeriod) regularTimePeriod0, (double) 592);
      assertEquals(1, timePeriodValues0.getMinMiddleIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(868.30226, 868.30226);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(xYDataItem0, "vWHGZO+", "Failed to add cloned item.");
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-3966L));
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.next();
      timePeriodValues0.add((TimePeriod) fixedMillisecond0, Double.NEGATIVE_INFINITY);
      Integer integer0 = JLayeredPane.POPUP_LAYER;
      timePeriodValues0.add((TimePeriod) regularTimePeriod0, (Number) integer0);
      assertEquals(1, timePeriodValues0.getMaxStartIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(868.30226, 868.30226);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(xYDataItem0, "vWHGZO+", "vWHGZO+");
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-3966L));
      timePeriodValues0.add((TimePeriod) fixedMillisecond0, 868.30226);
      timePeriodValues0.delete(592, (-38));
      assertEquals(0, timePeriodValues0.getMaxEndIndex());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(868.30226, 868.30226);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(xYDataItem0, "vWHGZO+", "");
      // Undeclared exception!
      try { 
        timePeriodValues0.delete(592, 1704);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 592, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-620), (-2170), (-2170), (-620), (-2170), 1600);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(fixedMillisecond0, "", "Failed to add cloned item.");
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy(1800, 4243);
      timePeriodValues1.add((TimePeriod) fixedMillisecond0, (double) 1600);
      boolean boolean0 = timePeriodValues1.equals(timePeriodValues0);
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals(0, timePeriodValues1.getMaxEndIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-620), (-2170), (-2170), (-620), (-2170), 1600);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(fixedMillisecond0, "", "Failed to add cloned item.");
      JMenu jMenu0 = new JMenu();
      boolean boolean0 = timePeriodValues0.equals(jMenu0);
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals("Failed to add cloned item.", timePeriodValues0.getRangeDescription());
      assertFalse(boolean0);
      assertEquals("", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Week week0 = new Week(807, (-3337));
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(week0, "Failed to add cloned item.", "We");
      TimePeriodValues timePeriodValues1 = new TimePeriodValues("We");
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertEquals("Failed to add cloned item.", timePeriodValues0.getDomainDescription());
      assertFalse(boolean0);
      assertEquals((-1), timePeriodValues1.getMinEndIndex());
      assertEquals("We", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues1.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues1.getMaxStartIndex());
      assertEquals((-1), timePeriodValues1.getMaxEndIndex());
      assertEquals((-1), timePeriodValues1.getMinMiddleIndex());
      assertEquals((-1), timePeriodValues1.getMinStartIndex());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("", (String) null, (String) null);
      TimePeriodValues timePeriodValues1 = new TimePeriodValues("");
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertEquals((-1), timePeriodValues1.getMinStartIndex());
      assertEquals((-1), timePeriodValues1.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues1.getMinMiddleIndex());
      assertFalse(boolean0);
      assertEquals("Value", timePeriodValues1.getRangeDescription());
      assertEquals((-1), timePeriodValues1.getMinEndIndex());
      assertEquals("Time", timePeriodValues1.getDomainDescription());
      assertEquals((-1), timePeriodValues1.getMaxStartIndex());
      assertEquals((-1), timePeriodValues1.getMaxEndIndex());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(868.30226, 868.30226);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(xYDataItem0, "vWHGZO+", "");
      TimePeriodValues timePeriodValues1 = (TimePeriodValues)timePeriodValues0.clone();
      timePeriodValues1.setRangeDescription("vWHGZO+");
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertFalse(boolean0);
      assertEquals("vWHGZO+", timePeriodValues1.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(868.30226, 868.30226);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(xYDataItem0, "vWHGZO+", "vWHGZO+");
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-3966L));
      timePeriodValues0.add((TimePeriod) fixedMillisecond0, 868.30226);
      Object object0 = timePeriodValues0.clone();
      boolean boolean0 = timePeriodValues0.equals(object0);
      assertEquals(0, timePeriodValues0.getMaxMiddleIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-620), (-2170), (-2170), (-620), (-2170), 1600);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(fixedMillisecond0, "", "Failed to add cloned item.");
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy((-2170), (-2170));
      timePeriodValues0.add((TimePeriod) fixedMillisecond0, (double) 1600);
      timePeriodValues1.add((TimePeriod) fixedMillisecond0, (double) (-1839));
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertEquals(0, timePeriodValues1.getMinMiddleIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("", (String) null, (String) null);
      timePeriodValues0.hashCode();
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(435.54022569, (-2419.725378));
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(xYDataItem0);
      timePeriodValues0.hashCode();
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals("Time", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals("Value", timePeriodValues0.getRangeDescription());
  }
}
