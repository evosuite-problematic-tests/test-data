/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 04:40:26 GMT 2019
 */

package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.util.SortOrder;
import org.jfree.data.DefaultKeyedValues;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultKeyedValues_ESTest extends DefaultKeyedValues_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(comparable0).toString();
      defaultKeyedValues0.addValue(comparable0, (-4553.6643450670545));
      Object object0 = defaultKeyedValues0.clone();
      Comparable<DefaultKeyedValues> comparable1 = (Comparable<DefaultKeyedValues>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(comparable1).toString();
      defaultKeyedValues0.addValue(comparable1, (-4553.6643450670545));
      defaultKeyedValues0.removeValue(0);
      boolean boolean0 = defaultKeyedValues0.equals(object0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Double double0 = Double.valueOf((double) 0);
      defaultKeyedValues0.insertValue(0, (Comparable) double0, (double) 0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(comparable0).toString();
      defaultKeyedValues0.setValue(comparable0, 2925.458);
      Object object0 = defaultKeyedValues0.clone();
      boolean boolean0 = defaultKeyedValues0.equals(object0);
      assertNotSame(object0, defaultKeyedValues0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      List list0 = defaultKeyedValues0.getKeys();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      // Undeclared exception!
      try { 
        defaultKeyedValues0.getIndex((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Byte byte0 = Byte.valueOf((byte)0);
      defaultKeyedValues0.addValue((Comparable) byte0, 1.0);
      Number number0 = defaultKeyedValues0.getValue((Comparable) byte0);
      assertEquals(1.0, number0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(comparable0).toString();
      // Undeclared exception!
      try { 
        defaultKeyedValues0.getValue(comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Key not found: null
         //
         verifyException("org.jfree.data.DefaultKeyedValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      // Undeclared exception!
      try { 
        defaultKeyedValues0.setValue((Comparable) null, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Short short0 = Short.valueOf((short)153);
      // Undeclared exception!
      try { 
        defaultKeyedValues0.insertValue((-2081), (Comparable) short0, (Number) short0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'position' out of bounds.
         //
         verifyException("org.jfree.data.DefaultKeyedValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Float float0 = new Float((-2479.27F));
      // Undeclared exception!
      try { 
        defaultKeyedValues0.insertValue(1818, (Comparable) float0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'position' out of bounds.
         //
         verifyException("org.jfree.data.DefaultKeyedValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Float float0 = new Float((float) 0);
      // Undeclared exception!
      try { 
        defaultKeyedValues0.insertValue(0, (Comparable) null, (Number) float0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Double double0 = Double.valueOf((-1747.529428972892));
      defaultKeyedValues0.addValue((Comparable) double0, (-1747.529428972892));
      defaultKeyedValues0.insertValue(0, (Comparable) double0, (Number) double0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Integer integer0 = new Integer(1);
      defaultKeyedValues0.setValue((Comparable) comparable0, (Number) integer0);
      Double double0 = Double.valueOf((double) 0);
      defaultKeyedValues0.setValue((Comparable) double0, (Number) double0);
      defaultKeyedValues0.insertValue(0, (Comparable) double0, (double) 0);
      assertEquals(2, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Double double0 = new Double((-295.2));
      defaultKeyedValues0.setValue((Comparable) double0, (-295.2));
      defaultKeyedValues0.removeValue((Comparable) double0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Byte byte0 = Byte.valueOf((byte)113);
      // Undeclared exception!
      try { 
        defaultKeyedValues0.removeValue((Comparable) byte0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The key (113) is not recognised.
         //
         verifyException("org.jfree.data.DefaultKeyedValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      SortOrder sortOrder0 = SortOrder.ASCENDING;
      defaultKeyedValues0.addValue((Comparable) 1, 464.7);
      defaultKeyedValues0.sortByKeys(sortOrder0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      SortOrder sortOrder0 = SortOrder.DESCENDING;
      Float float0 = new Float((-2479.27F));
      defaultKeyedValues0.setValue((Comparable) float0, (double) (-2479.27F));
      defaultKeyedValues0.sortByValues(sortOrder0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      DefaultKeyedValues defaultKeyedValues1 = new DefaultKeyedValues();
      assertTrue(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      
      Integer integer0 = Integer.valueOf(0);
      defaultKeyedValues1.addValue((Comparable) integer0, (double) 0);
      boolean boolean0 = defaultKeyedValues0.equals(defaultKeyedValues1);
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Long long0 = new Long(0L);
      boolean boolean0 = defaultKeyedValues0.equals(long0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(comparable0).toString();
      defaultKeyedValues0.setValue(comparable0, (Number) null);
      Object object0 = defaultKeyedValues0.clone();
      boolean boolean0 = defaultKeyedValues0.equals(object0);
      assertNotSame(object0, defaultKeyedValues0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Integer integer0 = new Integer((-1));
      defaultKeyedValues0.setValue((Comparable) integer0, 0.0);
      Object object0 = defaultKeyedValues0.clone();
      assertTrue(object0.equals((Object)defaultKeyedValues0));
      
      defaultKeyedValues0.addValue((Comparable) integer0, (double) (-1));
      boolean boolean0 = defaultKeyedValues0.equals(object0);
      assertFalse(object0.equals((Object)defaultKeyedValues0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      defaultKeyedValues0.hashCode();
  }
}
