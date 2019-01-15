/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 14:09:59 GMT 2019
 */

package org.apache.commons.math3.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.Field;
import org.apache.commons.math3.FieldElement;
import org.apache.commons.math3.util.MathArrays;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MathArrays_ESTest extends MathArrays_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = MathArrays.copyOf(doubleArray0);
      assertEquals(0, doubleArray1.length);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<FieldElement> class0 = FieldElement.class;
      Object object0 = new Object();
      Field<Object> field0 = (Field<Object>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(field0).getRuntimeClass();
      doReturn(object0).when(field0).getZero();
      // Undeclared exception!
      try { 
        MathArrays.buildArray(field0, (-1), (-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.reflect.Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[1];
      int[] intArray1 = MathArrays.copyOf(intArray0);
      assertEquals(1, intArray1.length);
      assertNotSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[][] doubleArray1 = new double[6][7];
      MathArrays.sortInPlace(doubleArray0, doubleArray1);
      assertEquals(7, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      double[][] doubleArray1 = new double[9][9];
      MathArrays.sortInPlace(doubleArray0, mathArrays_OrderDirection0, doubleArray1);
      assertEquals(9, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      MathArrays.scaleInPlace((-165.28875628273), doubleArray0);
      assertArrayEquals(new double[] {-0.0, -0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = MathArrays.ebeAdd(doubleArray0, doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[3];
      try { 
        MathArrays.ebeAdd(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 3
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = MathArrays.ebeSubtract(doubleArray0, doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[5];
      try { 
        MathArrays.ebeSubtract(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 7 != 5
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = MathArrays.ebeMultiply(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray1, 0.01);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[9];
      try { 
        MathArrays.ebeMultiply(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 9
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[2];
      try { 
        MathArrays.ebeDivide(doubleArray1, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 1
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = MathArrays.distance1(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[7];
      int int0 = MathArrays.distance1(intArray0, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = MathArrays.distance(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[2];
      double double0 = MathArrays.distance(intArray0, intArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = MathArrays.distanceInf(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[5];
      int int0 = MathArrays.distanceInf(intArray0, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Double[] doubleArray0 = new Double[6];
      doubleArray0[0] = (Double) 0.0;
      doubleArray0[1] = (Double) (-786.1718283);
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "org.apache.commons.math3.util.MathArrays$3";
      stringArray0[2] = "org.apache.commons.math3.util.MathArrays$2";
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Double[] doubleArray0 = new Double[2];
      Double double0 = new Double(929.976073985);
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Integer[] integerArray0 = new Integer[5];
      integerArray0[0] = (Integer) (-1471);
      integerArray0[1] = (Integer) 2769;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      boolean boolean0 = MathArrays.isMonotonic(integerArray0, mathArrays_OrderDirection0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Double[] doubleArray0 = new Double[2];
      Double double0 = new Double(329.110076939);
      doubleArray0[0] = double0;
      Double double1 = new Double((-182.91034F));
      doubleArray0[1] = double1;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      boolean boolean0 = MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "R";
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      boolean boolean0 = MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 825.5495;
      try { 
        MathArrays.checkOrder(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 1 and 2 are not strictly increasing (825.549 >= 0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 348.69894F;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      boolean boolean0 = MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 59.7566;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      try { 
        MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 1 and 2 are not strictly decreasing (0 <= 0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[3] = 3.834E-20;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      try { 
        MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 2 and 3 are not decreasing (0 < 0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      long[][] longArray0 = new long[4][1];
      MathArrays.checkRectangular(longArray0);
      assertEquals(4, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      long[][] longArray0 = new long[2][1];
      long[] longArray1 = new long[4];
      longArray0[0] = longArray1;
      try { 
        MathArrays.checkRectangular(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // some rows have length 1 while others have length 4
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1.34217729E8;
      MathArrays.checkPositive(doubleArray0);
      assertArrayEquals(new double[] {1.34217729E8}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      try { 
        MathArrays.checkPositive(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      long[] longArray0 = new long[1];
      MathArrays.checkNonNegative(longArray0);
      assertEquals(1, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      long[] longArray0 = new long[8];
      longArray0[2] = (-2246L);
      try { 
        MathArrays.checkNonNegative(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,246 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      long[][] longArray0 = new long[4][1];
      MathArrays.checkNonNegative(longArray0);
      assertEquals(4, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      long[][] longArray0 = new long[2][1];
      long[] longArray1 = new long[4];
      longArray1[0] = (-217L);
      longArray0[0] = longArray1;
      try { 
        MathArrays.checkNonNegative(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -217 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 3.834E-20;
      double double0 = MathArrays.safeNorm(doubleArray0);
      assertEquals(3.834E-20, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = Double.NEGATIVE_INFINITY;
      doubleArray0[6] = Double.POSITIVE_INFINITY;
      double double0 = MathArrays.safeNorm(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 6.032174644509064E-23;
      doubleArray0[7] = 6.032174644509064E-23;
      double double0 = MathArrays.safeNorm(doubleArray0);
      assertEquals(8.530783192867822E-23, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = Double.NaN;
      double double0 = MathArrays.safeNorm(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      double[][] doubleArray0 = new double[0][2];
      try { 
        MathArrays.sortInPlace((double[]) null, mathArrays_OrderDirection0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      double[][] doubleArray1 = new double[2][7];
      doubleArray1[0] = null;
      try { 
        MathArrays.sortInPlace(doubleArray0, mathArrays_OrderDirection0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      double[][] doubleArray1 = new double[7][4];
      try { 
        MathArrays.sortInPlace(doubleArray0, mathArrays_OrderDirection0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 4 != 5
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = MathArrays.linearCombination(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = MathArrays.convolve(doubleArray0, doubleArray0);
      try { 
        MathArrays.linearCombination(doubleArray1, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 7 != 4
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double double0 = MathArrays.linearCombination(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = Double.POSITIVE_INFINITY;
      double double0 = MathArrays.linearCombination(doubleArray0, doubleArray0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      double double0 = MathArrays.linearCombination(0.0, 2514.744752129873, 0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      double double0 = MathArrays.linearCombination(Double.NaN, Double.NaN, 0.0, 0.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      double double0 = MathArrays.linearCombination(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      double double0 = MathArrays.linearCombination((-1801.217), (-2162.3044911732), (-1722.3087944005), 1.34217729E8, (-928.1005304), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      double double0 = MathArrays.linearCombination(0.0, 0.0, 0.0, 0.0, (-3845.61), 1.304E19, 0.0, (-2199.1));
      assertEquals((-5.01467544E22), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      double double0 = MathArrays.linearCombination(2.0, 2.0, Double.NaN, 2.0, 778.25375324222, 778.25375324222, 0.0, 0.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      float[] floatArray0 = new float[8];
      boolean boolean0 = MathArrays.equals((float[]) null, floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      float[] floatArray0 = new float[5];
      boolean boolean0 = MathArrays.equals(floatArray0, floatArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      float[] floatArray0 = new float[2];
      boolean boolean0 = MathArrays.equals(floatArray0, (float[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      boolean boolean0 = MathArrays.equals((float[]) null, (float[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      float[] floatArray0 = new float[5];
      float[] floatArray1 = new float[7];
      boolean boolean0 = MathArrays.equals(floatArray0, floatArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      float[] floatArray0 = new float[9];
      floatArray0[0] = (-1805.776F);
      float[] floatArray1 = new float[9];
      boolean boolean0 = MathArrays.equals(floatArray0, floatArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      float[] floatArray0 = new float[5];
      boolean boolean0 = MathArrays.equalsIncludingNaN((float[]) null, floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      float[] floatArray0 = new float[5];
      boolean boolean0 = MathArrays.equalsIncludingNaN(floatArray0, floatArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      float[] floatArray0 = new float[8];
      boolean boolean0 = MathArrays.equalsIncludingNaN(floatArray0, (float[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      boolean boolean0 = MathArrays.equalsIncludingNaN((float[]) null, (float[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      float[] floatArray0 = new float[3];
      float[] floatArray1 = new float[8];
      boolean boolean0 = MathArrays.equalsIncludingNaN(floatArray0, floatArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      float[] floatArray0 = new float[9];
      floatArray0[2] = 831.911F;
      float[] floatArray1 = new float[9];
      boolean boolean0 = MathArrays.equalsIncludingNaN(floatArray0, floatArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      boolean boolean0 = MathArrays.equals((double[]) null, (double[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      boolean boolean0 = MathArrays.equals(doubleArray0, doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      boolean boolean0 = MathArrays.equals(doubleArray0, (double[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      boolean boolean0 = MathArrays.equals((double[]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[8];
      boolean boolean0 = MathArrays.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = MathArrays.ebeDivide(doubleArray0, doubleArray0);
      boolean boolean0 = MathArrays.equals(doubleArray1, doubleArray1);
      assertFalse(boolean0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      boolean boolean0 = MathArrays.equalsIncludingNaN((double[]) null, (double[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      boolean boolean0 = MathArrays.equalsIncludingNaN(doubleArray0, doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      boolean boolean0 = MathArrays.equalsIncludingNaN(doubleArray0, (double[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      boolean boolean0 = MathArrays.equalsIncludingNaN((double[]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[8];
      boolean boolean0 = MathArrays.equalsIncludingNaN(doubleArray1, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1291.00296534;
      double[] doubleArray1 = MathArrays.scale(1291.00296534, doubleArray0);
      boolean boolean0 = MathArrays.equalsIncludingNaN(doubleArray0, doubleArray1);
      assertArrayEquals(new double[] {1666688.656516673, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      try { 
        MathArrays.normalizeArray(doubleArray0, Float.NEGATIVE_INFINITY);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot normalize to an infinite value
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      try { 
        MathArrays.normalizeArray(doubleArray0, Double.NaN);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot normalize to NaN
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = Double.POSITIVE_INFINITY;
      try { 
        MathArrays.normalizeArray(doubleArray0, 1351.600456950785);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array contains an infinite element, \u221E at index 7
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[4] = Double.NaN;
      try { 
        MathArrays.normalizeArray(doubleArray0, 734.16412);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // array sums to zero
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 2336.94;
      doubleArray0[4] = Double.NaN;
      double[] doubleArray1 = MathArrays.normalizeArray(doubleArray0, 734.16412);
      assertArrayEquals(new double[] {734.16412, 0.0, 0.0, 0.0, Double.NaN}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Class<FieldElement> class0 = FieldElement.class;
      Field<Object> field0 = (Field<Object>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(field0).getRuntimeClass();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(field0).getZero();
      Object[][] objectArray0 = MathArrays.buildArray(field0, 1418, 0);
      assertEquals(1418, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      try { 
        MathArrays.convolve(doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no data
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[0];
      try { 
        MathArrays.convolve(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no data
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }
}
