/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 11:00:33 GMT 2018
 */

package org.jfree.data.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.List;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.statistics.SimpleHistogramBin;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Second;
import org.jfree.data.time.Year;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultIntervalCategoryDataset_ESTest extends DefaultIntervalCategoryDataset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Number[][] numberArray0 = new Number[3][0];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      int int0 = defaultIntervalCategoryDataset0.getColumnCount();
      assertEquals(3, defaultIntervalCategoryDataset0.getRowCount());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Number[][] numberArray0 = new Number[10][7];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset1 = (DefaultIntervalCategoryDataset)defaultIntervalCategoryDataset0.clone();
      boolean boolean0 = defaultIntervalCategoryDataset0.equals(defaultIntervalCategoryDataset1);
      assertTrue(boolean0);
      assertNotSame(defaultIntervalCategoryDataset1, defaultIntervalCategoryDataset0);
      assertEquals(10, defaultIntervalCategoryDataset1.getRowCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[6];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, (Number[][]) null, (Number[][]) null);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.getRowIndex((Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.getRowKey((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'row' argument is out of bounds.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[][] doubleArray0 = new double[3][0];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.getColumnKey(244);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 244
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[3];
      Number[][] numberArray0 = new Number[0][7];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, numberArray0, (Number[][]) null);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.setSeriesKeys((Comparable[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'seriesKeys' argument.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Number[][] numberArray0 = new Number[2][0];
      Number[][] numberArray1 = new Number[9][6];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = null;
      try {
        defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, stringArray0, numberArray1, numberArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DefaultIntervalCategoryDataset: the number of series in the start value dataset does not match the number of series in the end value dataset.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparable<DefaultIntervalCategoryDataset>[] comparableArray0 = (Comparable<DefaultIntervalCategoryDataset>[]) Array.newInstance(Comparable.class, 1);
      Number[][] numberArray0 = new Number[1][4];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = null;
      try {
        defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(comparableArray0, comparableArray0, numberArray0, numberArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The number of category keys does not match the number of categories in the data.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[7];
      Number[][] numberArray0 = new Number[1][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = null;
      try {
        defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, numberArray0, numberArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The number of series keys does not match the number of series in the data.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[][] doubleArray0 = new double[7][8];
      double[] doubleArray1 = new double[1];
      doubleArray0[1] = doubleArray1;
      double[][] doubleArray2 = new double[7][8];
      doubleArray2[0] = doubleArray0[1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = null;
      try {
        defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DefaultIntervalCategoryDataset: the number of categories in the start value dataset does not match the number of categories in the end value dataset.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Comparable<DefaultIntervalCategoryDataset>[] comparableArray0 = (Comparable<DefaultIntervalCategoryDataset>[]) Array.newInstance(Comparable.class, 1);
      Number[][] numberArray0 = new Number[1][4];
      Number[] numberArray1 = new Number[1];
      numberArray0[0] = numberArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(comparableArray0, comparableArray0, numberArray0, numberArray0);
      assertEquals(1, defaultIntervalCategoryDataset0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Comparable<JLayeredPane>[] comparableArray0 = (Comparable<JLayeredPane>[]) Array.newInstance(Comparable.class, 0);
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(comparableArray0, comparableArray0, (Number[][]) null, (Number[][]) null);
      defaultIntervalCategoryDataset0.setSeriesKeys(comparableArray0);
      assertEquals(0, defaultIntervalCategoryDataset0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Comparable<String>[] comparableArray0 = (Comparable<String>[]) Array.newInstance(Comparable.class, 1);
      Second second0 = new Second();
      Millisecond millisecond0 = new Millisecond(0, second0);
      comparableArray0[0] = (Comparable<String>) millisecond0;
      defaultIntervalCategoryDataset0.setSeriesKeys(comparableArray0);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.getValue((Comparable) comparableArray0[0], (Comparable) millisecond0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown 'category' key.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Number[][] numberArray0 = new Number[1][4];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.getSeriesKey(304);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such series : 304
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Number[][] numberArray0 = new Number[10][7];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      MockDate mockDate0 = new MockDate();
      defaultIntervalCategoryDataset0.indexOf(mockDate0);
      assertEquals(10, defaultIntervalCategoryDataset0.getRowCount());
      assertEquals(7, defaultIntervalCategoryDataset0.getCategoryCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.getSeriesKey((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such series : -1
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Number[][] numberArray0 = new Number[0][5];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      Comparable<String>[] comparableArray0 = (Comparable<String>[]) Array.newInstance(Comparable.class, 3);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.setSeriesKeys(comparableArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The number of series keys does not match the data.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[6];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, (Number[][]) null, (Number[][]) null);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.setCategoryKeys(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The number of categories does not match the data.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[9];
      Number[][] numberArray0 = new Number[0][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, numberArray0, numberArray0);
      int int0 = defaultIntervalCategoryDataset0.getCategoryCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      List list0 = defaultIntervalCategoryDataset0.getColumnKeys();
      assertEquals(1, defaultIntervalCategoryDataset0.getRowCount());
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset((Number[][]) null, (Number[][]) null);
      List list0 = defaultIntervalCategoryDataset0.getColumnKeys();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[][] doubleArray0 = new double[0][4];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.setCategoryKeys((Comparable[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'categoryKeys' argument.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Comparable<String>[] comparableArray0 = (Comparable<String>[]) Array.newInstance(Comparable.class, 1);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.setCategoryKeys(comparableArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DefaultIntervalCategoryDataset.setCategoryKeys(): null category not permitted.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Comparable<String>[] comparableArray0 = (Comparable<String>[]) Array.newInstance(Comparable.class, 1);
      Second second0 = new Second();
      Millisecond millisecond0 = new Millisecond(0, second0);
      comparableArray0[0] = (Comparable<String>) millisecond0;
      defaultIntervalCategoryDataset0.setCategoryKeys(comparableArray0);
      defaultIntervalCategoryDataset0.setSeriesKeys(comparableArray0);
      Number number0 = defaultIntervalCategoryDataset0.getValue((Comparable) comparableArray0[0], (Comparable) millisecond0);
      assertEquals(0.0, number0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[][] doubleArray0 = new double[14][9];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Year year0 = new Year();
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.getValue((Comparable) year0, (Comparable) 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown 'series' key.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Comparable<String>[] comparableArray0 = (Comparable<String>[]) Array.newInstance(Comparable.class, 1);
      Second second0 = new Second();
      Millisecond millisecond0 = new Millisecond(1991, second0);
      comparableArray0[0] = (Comparable<String>) millisecond0;
      defaultIntervalCategoryDataset0.setSeriesKeys(comparableArray0);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.getStartValue((Comparable) millisecond0, (Comparable) comparableArray0[0]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown 'category' key.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[][] doubleArray0 = new double[3][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.getStartValue((Comparable) 481.614534508332, (Comparable) 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown 'series' key.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Comparable<String>[] comparableArray0 = (Comparable<String>[]) Array.newInstance(Comparable.class, 1);
      Second second0 = new Second();
      Millisecond millisecond0 = new Millisecond(1991, second0);
      comparableArray0[0] = (Comparable<String>) millisecond0;
      defaultIntervalCategoryDataset0.setCategoryKeys(comparableArray0);
      defaultIntervalCategoryDataset0.setSeriesKeys(comparableArray0);
      Number number0 = defaultIntervalCategoryDataset0.getStartValue((Comparable) millisecond0, (Comparable) comparableArray0[0]);
      assertEquals(0.0, number0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[][] doubleArray0 = new double[5][6];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.getStartValue((-1184), 3077);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DefaultIntervalCategoryDataset.getValue(): series index out of range.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Number[][] numberArray0 = new Number[0][6];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, numberArray0, numberArray0);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.getStartValue(4051, 4051);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DefaultIntervalCategoryDataset.getValue(): series index out of range.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Number[][] numberArray0 = new Number[10][7];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.getStartValue(0, (-1944));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DefaultIntervalCategoryDataset.getValue(): category index out of range.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[][] doubleArray0 = new double[5][9];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.getStartValue(0, 1107);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DefaultIntervalCategoryDataset.getValue(): category index out of range.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Comparable<String>[] comparableArray0 = (Comparable<String>[]) Array.newInstance(Comparable.class, 1);
      MockDate mockDate0 = new MockDate(1991, 1991, 1991);
      Second second0 = new Second();
      Millisecond millisecond0 = new Millisecond(1991, second0);
      comparableArray0[0] = (Comparable<String>) millisecond0;
      defaultIntervalCategoryDataset0.setSeriesKeys(comparableArray0);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.getEndValue((Comparable) millisecond0, (Comparable) mockDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown 'category' key.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String[] stringArray0 = new String[8];
      Number[][] numberArray0 = new Number[0][7];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, numberArray0, numberArray0);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.getEndValue((Comparable) "0A*~$YWD~uuEQx", (Comparable) "0A*~$YWD~uuEQx");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown 'series' key.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Comparable<String>[] comparableArray0 = (Comparable<String>[]) Array.newInstance(Comparable.class, 1);
      Second second0 = new Second();
      Millisecond millisecond0 = new Millisecond(1986, second0);
      comparableArray0[0] = (Comparable<String>) millisecond0;
      defaultIntervalCategoryDataset0.setCategoryKeys(comparableArray0);
      defaultIntervalCategoryDataset0.setSeriesKeys(comparableArray0);
      Number number0 = defaultIntervalCategoryDataset0.getEndValue(comparableArray0[0], comparableArray0[0]);
      assertEquals(0.0, number0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String[] stringArray0 = new String[6];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, (Number[][]) null, (Number[][]) null);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.getEndValue((-1759), (-1759));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DefaultIntervalCategoryDataset.getValue(): series index out of range.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.getValue(415, 1515);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DefaultIntervalCategoryDataset.getValue(): series index out of range.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[][] doubleArray0 = new double[6][9];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.getEndValue(2, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DefaultIntervalCategoryDataset.getValue(): category index out of range.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[][] doubleArray0 = new double[2][8];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.getValue(0, 2513);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DefaultIntervalCategoryDataset.getValue(): category index out of range.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String[] stringArray0 = new String[6];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, (Number[][]) null, (Number[][]) null);
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-1017.09), 0.0);
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.setStartValue((-665), simpleHistogramBin0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DefaultIntervalCategoryDataset.setValue: series outside valid range.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.setStartValue(1986, 1329.344, 59);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DefaultIntervalCategoryDataset.setValue: series outside valid range.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Comparable<String>[] comparableArray0 = (Comparable<String>[]) Array.newInstance(Comparable.class, 1);
      Second second0 = new Second();
      Millisecond millisecond0 = new Millisecond(0, second0);
      comparableArray0[0] = (Comparable<String>) millisecond0;
      defaultIntervalCategoryDataset0.setCategoryKeys(comparableArray0);
      defaultIntervalCategoryDataset0.setStartValue(0, comparableArray0[0], 999);
      assertEquals(1, defaultIntervalCategoryDataset0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MockDate mockDate0 = new MockDate(0, 0, 0);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.setStartValue(0, mockDate0, 59);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DefaultIntervalCategoryDataset.setValue: unrecognised category.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[][] doubleArray0 = new double[2][7];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.setEndValue((-456), (-185.8937685), (-229.895));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DefaultIntervalCategoryDataset.setValue: series outside valid range.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Number[][] numberArray0 = new Number[8][7];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      Byte byte0 = new Byte((byte)16);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.setEndValue((byte)16, byte0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DefaultIntervalCategoryDataset.setValue: series outside valid range.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Comparable<String>[] comparableArray0 = (Comparable<String>[]) Array.newInstance(Comparable.class, 1);
      Second second0 = new Second();
      Millisecond millisecond0 = new Millisecond((-31), second0);
      comparableArray0[0] = (Comparable<String>) millisecond0;
      defaultIntervalCategoryDataset0.setCategoryKeys(comparableArray0);
      defaultIntervalCategoryDataset0.setEndValue(0, comparableArray0[0], 59);
      assertEquals(1, defaultIntervalCategoryDataset0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[][] doubleArray0 = new double[6][9];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.setEndValue(0, 0.0, 618.6195036266838);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DefaultIntervalCategoryDataset.setValue: unrecognised category.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Number[][] numberArray0 = new Number[0][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.getColumnIndex((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'columnKey' argument.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[][] doubleArray0 = new double[6][9];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      List list0 = defaultIntervalCategoryDataset0.getRowKeys();
      assertEquals(6, list0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset((Number[][]) null, (Number[][]) null);
      List list0 = defaultIntervalCategoryDataset0.getRowKeys();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[][] doubleArray0 = new double[5][4];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        defaultIntervalCategoryDataset0.getRowKey(90);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'row' argument is out of bounds.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      double[][] doubleArray0 = new double[6][9];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Comparable comparable0 = defaultIntervalCategoryDataset0.getRowKey(0);
      assertEquals(6, defaultIntervalCategoryDataset0.getRowCount());
      assertEquals("Series 1", comparable0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Number[][] numberArray0 = new Number[10][7];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      boolean boolean0 = defaultIntervalCategoryDataset0.equals((Object) null);
      assertEquals(10, defaultIntervalCategoryDataset0.getRowCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Number[][] numberArray0 = new Number[10][7];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      boolean boolean0 = defaultIntervalCategoryDataset0.equals(defaultIntervalCategoryDataset0);
      assertTrue(boolean0);
      assertEquals(10, defaultIntervalCategoryDataset0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Number[][] numberArray0 = new Number[0][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset((Number[][]) null, numberArray0);
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset1 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      boolean boolean0 = defaultIntervalCategoryDataset0.equals(defaultIntervalCategoryDataset1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Number[][] numberArray0 = new Number[6][7];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset((Number[][]) null, (Number[][]) null);
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset1 = new DefaultIntervalCategoryDataset((Number[][]) null, numberArray0);
      boolean boolean0 = defaultIntervalCategoryDataset0.equals(defaultIntervalCategoryDataset1);
      assertEquals(0, defaultIntervalCategoryDataset1.getCategoryCount());
      assertFalse(boolean0);
      assertFalse(defaultIntervalCategoryDataset1.equals((Object)defaultIntervalCategoryDataset0));
  }
}