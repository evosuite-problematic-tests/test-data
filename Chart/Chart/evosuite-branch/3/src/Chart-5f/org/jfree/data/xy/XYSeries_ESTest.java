/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 06:39:33 GMT 2019
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.DropMode;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.SerialDate;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYSeries;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XYSeries_ESTest extends XYSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(60L);
      XYSeries xYSeries0 = new XYSeries(fixedMillisecond0, true);
      XYSeries xYSeries1 = (XYSeries)xYSeries0.clone();
      assertNotSame(xYSeries1, xYSeries0);
      assertTrue(xYSeries1.getAllowDuplicateXValues());
      assertEquals(Integer.MAX_VALUE, xYSeries1.getMaximumItemCount());
      assertTrue(xYSeries1.getAutoSort());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Week week0 = new Week(412, 412);
      XYSeries xYSeries0 = new XYSeries(week0, false, true);
      int int0 = xYSeries0.getMaximumItemCount();
      assertTrue(xYSeries0.getAllowDuplicateXValues());
      assertFalse(xYSeries0.getAutoSort());
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0, 0, 0, 0);
      TimeZone timeZone0 = TimeZone.getDefault();
      Month month0 = new Month(mockDate0, timeZone0);
      XYSeries xYSeries0 = new XYSeries(month0);
      Short short0 = new Short((short) (-2));
      xYSeries0.add((double) 0, (Number) short0);
      assertEquals(1, xYSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      XYSeries xYSeries0 = new XYSeries(quarter0, false, false);
      xYSeries0.add((double) 1, (-1182.8), false);
      xYSeries0.addOrUpdate((double) 1, 0.0);
      assertEquals(1, xYSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hour hour0 = new Hour();
      XYSeries xYSeries0 = new XYSeries(hour0, false, false);
      xYSeries0.add((-999.2443067), (Number) 23, true);
      xYSeries0.toArray();
      assertEquals(1, xYSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hour hour0 = new Hour();
      XYSeries xYSeries0 = new XYSeries(hour0, false, false);
      xYSeries0.getItems();
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
      assertFalse(xYSeries0.getAutoSort());
      assertFalse(xYSeries0.getAllowDuplicateXValues());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hour hour0 = new Hour();
      XYSeries xYSeries0 = new XYSeries(hour0, false, false);
      // Undeclared exception!
      try { 
        xYSeries0.updateByIndex(1, 23);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      XYSeries xYSeries0 = new XYSeries(fixedMillisecond0, false);
      // Undeclared exception!
      try { 
        xYSeries0.add((XYDataItem) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'item' argument.
         //
         verifyException("org.jfree.data.xy.XYSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockDate mockDate0 = new MockDate(391, 391, 44, 0, 982);
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      XYSeries xYSeries0 = new XYSeries(serialDate0, false);
      // Undeclared exception!
      try { 
        xYSeries0.remove((Number) (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hour hour0 = new Hour();
      XYSeries xYSeries0 = new XYSeries(hour0, false, false);
      boolean boolean0 = xYSeries0.getAllowDuplicateXValues();
      assertFalse(boolean0);
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
      assertFalse(xYSeries0.getAutoSort());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hour hour0 = new Hour();
      XYSeries xYSeries0 = new XYSeries(hour0, false, false);
      boolean boolean0 = xYSeries0.getAutoSort();
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
      assertFalse(boolean0);
      assertFalse(xYSeries0.getAllowDuplicateXValues());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockDate mockDate0 = new MockDate(627, (-1994), (-1994), (-1994), (-1994), 627);
      Hour hour0 = new Hour(mockDate0);
      XYSeries xYSeries0 = new XYSeries(hour0);
      xYSeries0.add(517.683293, (double) 627);
      assertEquals(1, xYSeries0.getItemCount());
      
      xYSeries0.setMaximumItemCount(0);
      assertEquals(0, xYSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      XYSeries xYSeries0 = new XYSeries(quarter0);
      xYSeries0.add((Number) 1, (Number) 4);
      Long long0 = new Long(2L);
      xYSeries0.addOrUpdate((Number) 1, (Number) long0);
      assertEquals(2, xYSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hour hour0 = new Hour();
      XYSeries xYSeries0 = new XYSeries(hour0, true, false);
      XYDataItem xYDataItem0 = new XYDataItem((Number) 23, (Number) 23);
      xYSeries0.add(xYDataItem0, true);
      // Undeclared exception!
      try { 
        xYSeries0.add(xYDataItem0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // X-value already exists.
         //
         verifyException("org.jfree.data.xy.XYSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      XYSeries xYSeries0 = new XYSeries(quarter0);
      xYSeries0.add((Number) 1, (Number) 4);
      Long long0 = new Long(2L);
      xYSeries0.addOrUpdate((Number) long0, (Number) long0);
      xYSeries0.addOrUpdate((Number) 1, (Number) long0);
      assertEquals(3, xYSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hour hour0 = new Hour();
      XYSeries xYSeries0 = new XYSeries(hour0, false, false);
      xYSeries0.add((Number) 0, (Number) 0);
      Long long0 = new Long(0L);
      // Undeclared exception!
      try { 
        xYSeries0.add((Number) 0, (Number) long0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // X-value already exists.
         //
         verifyException("org.jfree.data.xy.XYSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockDate mockDate0 = new MockDate(391, 391, 44, 0, 982);
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      XYSeries xYSeries0 = new XYSeries(serialDate0, false);
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
      
      xYSeries0.setMaximumItemCount(0);
      xYSeries0.addOrUpdate((-1.0), 0.0);
      assertFalse(xYSeries0.getAutoSort());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Month month0 = new Month();
      XYSeries xYSeries0 = new XYSeries(month0, true, true);
      xYSeries0.delete(521, 3);
      assertTrue(xYSeries0.getAutoSort());
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
      assertTrue(xYSeries0.getAllowDuplicateXValues());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      XYSeries xYSeries0 = new XYSeries(quarter0);
      // Undeclared exception!
      try { 
        xYSeries0.delete(1, 4);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      XYSeries xYSeries0 = new XYSeries(quarter0);
      xYSeries0.clear();
      assertTrue(xYSeries0.getAllowDuplicateXValues());
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
      assertTrue(xYSeries0.getAutoSort());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute((-1), hour0);
      XYSeries xYSeries0 = new XYSeries(minute0, false, false);
      xYSeries0.addOrUpdate((Number) 23, (Number) 23);
      assertEquals(1, xYSeries0.getItemCount());
      
      xYSeries0.clear();
      assertFalse(xYSeries0.getAutoSort());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Hour hour0 = new Hour();
      XYSeries xYSeries0 = new XYSeries(hour0, false);
      xYSeries0.add((Number) 0, (Number) 0);
      assertEquals(1, xYSeries0.getItemCount());
      
      xYSeries0.update(0, 0);
      assertTrue(xYSeries0.getAllowDuplicateXValues());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockDate mockDate0 = new MockDate(470, 470, 0, (-521), 0);
      Year year0 = new Year(mockDate0);
      XYSeries xYSeries0 = new XYSeries(year0, false, true);
      // Undeclared exception!
      try { 
        xYSeries0.update((-9999), (-9999));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No observation for x = -9999
         //
         verifyException("org.jfree.data.xy.XYSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XYSeries xYSeries0 = new XYSeries("\":'9'`", true);
      // Undeclared exception!
      try { 
        xYSeries0.addOrUpdate((Number) null, (Number) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'x' argument.
         //
         verifyException("org.jfree.data.xy.XYSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      XYSeries xYSeries0 = new XYSeries(quarter0, true, false);
      xYSeries0.add((double) 1, (-1182.8), true);
      xYSeries0.setMaximumItemCount(1);
      xYSeries0.addOrUpdate((-1496.971460323), 0.0);
      assertEquals(1, xYSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      XYSeries xYSeries0 = new XYSeries(quarter0, false, false);
      xYSeries0.add((double) 1, (-1182.8), false);
      xYSeries0.add((-2928.212), (-1382.496268490503), false);
      assertEquals(2, xYSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      XYSeries xYSeries0 = new XYSeries(quarter0);
      xYSeries0.add((double) 4, (Number) null, true);
      double[][] doubleArray0 = xYSeries0.toArray();
      assertTrue(xYSeries0.getAutoSort());
      assertEquals(2, doubleArray0.length);
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
      assertTrue(xYSeries0.getAllowDuplicateXValues());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      XYSeries xYSeries0 = new XYSeries(quarter0);
      XYSeries xYSeries1 = xYSeries0.createCopy(1, 1);
      xYSeries0.setMaximumItemCount(1);
      boolean boolean0 = xYSeries0.equals(xYSeries1);
      assertEquals(1, xYSeries0.getMaximumItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      XYSeries xYSeries0 = new XYSeries(quarter0);
      xYSeries0.add((Number) 1, (Number) 4);
      XYSeries xYSeries1 = xYSeries0.createCopy(1, (-2146));
      boolean boolean0 = xYSeries0.equals(xYSeries1);
      assertEquals(1, xYSeries0.getItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute((-1), hour0);
      XYSeries xYSeries0 = new XYSeries(minute0, false, false);
      xYSeries0.addOrUpdate((Number) 59, (Number) 23);
      // Undeclared exception!
      try { 
        xYSeries0.createCopy(0, Integer.MAX_VALUE);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      XYSeries xYSeries0 = new XYSeries(quarter0, false, false);
      DefaultMutableTreeNode defaultMutableTreeNode0 = new DefaultMutableTreeNode(quarter0.LAST_QUARTER);
      JTree jTree0 = new JTree(defaultMutableTreeNode0);
      DropMode dropMode0 = jTree0.getDropMode();
      boolean boolean0 = xYSeries0.equals(dropMode0);
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
      assertFalse(boolean0);
      assertFalse(xYSeries0.getAutoSort());
      assertFalse(xYSeries0.getAllowDuplicateXValues());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      XYSeries xYSeries0 = new XYSeries(quarter0);
      XYSeries xYSeries1 = xYSeries0.createCopy(1, (-2146));
      assertTrue(xYSeries1.equals((Object)xYSeries0));
      
      xYSeries1.setDescription("");
      boolean boolean0 = xYSeries0.equals(xYSeries1);
      assertFalse(xYSeries1.equals((Object)xYSeries0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      XYSeries xYSeries0 = new XYSeries(quarter0);
      XYSeries xYSeries1 = xYSeries0.createCopy(1, 1);
      boolean boolean0 = xYSeries0.equals(xYSeries1);
      assertEquals(Integer.MAX_VALUE, xYSeries1.getMaximumItemCount());
      assertTrue(xYSeries1.getAllowDuplicateXValues());
      assertTrue(boolean0);
      assertTrue(xYSeries1.getAutoSort());
      assertNotSame(xYSeries1, xYSeries0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      XYSeries xYSeries0 = new XYSeries(quarter0, false, false);
      XYSeries xYSeries1 = new XYSeries(quarter0, true, true);
      boolean boolean0 = xYSeries0.equals(xYSeries1);
      assertEquals(Integer.MAX_VALUE, xYSeries1.getMaximumItemCount());
      assertTrue(xYSeries1.getAllowDuplicateXValues());
      assertTrue(xYSeries1.getAutoSort());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(2655);
      XYSeries xYSeries0 = new XYSeries(serialDate0, false, false);
      XYSeries xYSeries1 = new XYSeries(serialDate0, false, true);
      boolean boolean0 = xYSeries0.equals(xYSeries1);
      assertEquals(Integer.MAX_VALUE, xYSeries1.getMaximumItemCount());
      assertFalse(xYSeries0.getAllowDuplicateXValues());
      assertFalse(xYSeries1.getAutoSort());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockDate mockDate0 = new MockDate(627, (-1994), (-1994), (-1994), (-1994), 627);
      Hour hour0 = new Hour(mockDate0);
      XYSeries xYSeries0 = new XYSeries(hour0);
      xYSeries0.hashCode();
      assertTrue(xYSeries0.getAutoSort());
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
      assertTrue(xYSeries0.getAllowDuplicateXValues());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Month month0 = new Month();
      XYSeries xYSeries0 = new XYSeries(month0, false);
      xYSeries0.addOrUpdate((Number) 9999, (Number) (-9999));
      xYSeries0.add(2862.05834725412, (double) 9999);
      BigInteger bigInteger0 = BigInteger.ZERO;
      xYSeries0.add((Number) (-9999), (Number) bigInteger0);
      xYSeries0.hashCode();
      assertFalse(xYSeries0.getAutoSort());
      assertTrue(xYSeries0.getAllowDuplicateXValues());
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Hour hour0 = new Hour();
      XYSeries xYSeries0 = new XYSeries(hour0, false, false);
      xYSeries0.hashCode();
      assertFalse(xYSeries0.getAllowDuplicateXValues());
      assertEquals(Integer.MAX_VALUE, xYSeries0.getMaximumItemCount());
      assertFalse(xYSeries0.getAutoSort());
  }
}