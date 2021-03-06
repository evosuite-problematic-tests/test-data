/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 14:55:19 GMT 2018
 */

package org.apache.commons.math3.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OpenMapRealVector_ESTest extends OpenMapRealVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.append(1.0E-12);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(0, openMapRealVector0.getDimension());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Double[] doubleArray0 = new Double[5];
      Double double0 = new Double(0.0);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[0];
      doubleArray0[3] = doubleArray0[2];
      doubleArray0[4] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      double double1 = openMapRealVector0.getSparsity();
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      // Undeclared exception!
      try { 
        openMapRealVector0.unitVector();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm
         //
         verifyException("org.apache.commons.math3.linear.OpenMapRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector((-1260), (-1260));
      Double[] doubleArray0 = new Double[6];
      doubleArray0[0] = (Double) 1.0E-12;
      doubleArray0[1] = (Double) 1.0E-12;
      doubleArray0[2] = doubleArray0[0];
      doubleArray0[3] = (Double) 1.0E-12;
      doubleArray0[4] = (Double) 1.0E-12;
      doubleArray0[5] = doubleArray0[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      // Undeclared exception!
      try { 
        openMapRealVector0.projection(arrayRealVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,260 != 6
         //
         verifyException("org.apache.commons.math3.linear.RealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-1139.0));
      OpenMapRealVector.OpenMapSparseIterator openMapRealVector_OpenMapSparseIterator0 = openMapRealVector0.new OpenMapSparseIterator();
      // Undeclared exception!
      try { 
        openMapRealVector_OpenMapSparseIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported
         //
         verifyException("org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      RealVector realVector0 = RealVector.unmodifiableRealVector(openMapRealVector0);
      RealVector realVector1 = openMapRealVector0.add(realVector0);
      assertTrue(realVector1.equals((Object)openMapRealVector0));
      assertEquals(0, realVector1.getDimension());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      RealVector realVector0 = openMapRealVector0.add((RealVector) openMapRealVector0);
      assertTrue(realVector0.equals((Object)openMapRealVector0));
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertNotSame(realVector0, openMapRealVector0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.mapAdd(2814.77775);
      OpenMapRealVector openMapRealVector2 = openMapRealVector1.add(openMapRealVector0);
      assertTrue(openMapRealVector2.equals((Object)openMapRealVector1));
      assertEquals(1.0, openMapRealVector2.getSparsity(), 0.01);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertNotSame(openMapRealVector2, openMapRealVector1);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-1.0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.add(openMapRealVector0);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertEquals(0.2, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(0.2, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[5] = 1352.98027947645;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 422.223);
      Double[] doubleArray1 = new Double[8];
      doubleArray1[0] = (Double) openMapRealVector0.DEFAULT_ZERO_TOLERANCE;
      doubleArray1[1] = (Double) 2391.6;
      doubleArray1[2] = (Double) doubleArray0[7];
      doubleArray1[3] = doubleArray1[1];
      doubleArray1[4] = (Double) 2391.6;
      doubleArray1[5] = (Double) 172.2941;
      doubleArray1[6] = (Double) (-51.97907337);
      doubleArray1[7] = (Double) (-51.97907337);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray1, 1651.21);
      OpenMapRealVector openMapRealVector2 = openMapRealVector0.add(openMapRealVector1);
      assertTrue(openMapRealVector2.equals((Object)openMapRealVector1));
      assertEquals(0.125, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.375, openMapRealVector2.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-1.0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.append(openMapRealVector0);
      assertEquals(0.2, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(10, openMapRealVector1.getDimension());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.append((RealVector) arrayRealVector0);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(4, openMapRealVector1.getDimension());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.append((RealVector) openMapRealVector0);
      assertEquals(18, openMapRealVector1.getDimension());
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Double[] doubleArray0 = new Double[6];
      Double double0 = new Double((-2.4006971787803736E189));
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[0];
      doubleArray0[3] = double0;
      Double double1 = new Double((-208.0497542));
      doubleArray0[4] = double1;
      doubleArray0[5] = doubleArray0[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 1077.3112137);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray0);
      double double2 = openMapRealVector0.dotProduct(openMapRealVector1);
      assertEquals(0.8333333333333334, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, double2, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      openMapRealVector0.dotProduct((RealVector) arrayRealVector0);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double0 = openMapRealVector0.dotProduct((RealVector) openMapRealVector0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      
      openMapRealVector0.mapSubtractToSelf(Double.NaN);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeMultiply(openMapRealVector0);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Double[] doubleArray0 = new Double[6];
      Double double0 = new Double((-2.4006971787803736E189));
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      Double double1 = new Double(1822.62442726438);
      doubleArray0[2] = double1;
      doubleArray0[3] = doubleArray0[0];
      doubleArray0[4] = double0;
      doubleArray0[5] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 1077.3112137);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeMultiply(openMapRealVector0);
      OpenMapRealVector openMapRealVector2 = openMapRealVector1.ebeMultiply(openMapRealVector1);
      assertEquals(1.0, openMapRealVector2.getSparsity(), 0.01);
      assertNotSame(openMapRealVector2, openMapRealVector0);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      // Undeclared exception!
      try { 
        openMapRealVector0.getSubVector(2, (-476));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of elements should be positive (-476)
         //
         verifyException("org.apache.commons.math3.linear.OpenMapRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 2862.9877;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.getSubVector(2, 2);
      assertEquals(0.16666666666666666, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(2, openMapRealVector1.getDimension());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[2] = 382.6114;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.getSubVector(2, 2);
      assertEquals(0.5, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(0.16666666666666666, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[4] = 384.617;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.getSubVector(2, 2);
      assertEquals(0.16666666666666666, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(2, openMapRealVector1.getDimension());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Double[] doubleArray0 = new Double[2];
      Double double0 = new Double((-2173.1));
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double1 = openMapRealVector0.getDistance(openMapRealVector0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(122, 122, 122);
      Double[] doubleArray0 = new Double[2];
      doubleArray0[0] = (Double) 1.0E-12;
      doubleArray0[1] = (Double) 1.0E-12;
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray0);
      double double0 = openMapRealVector0.getDistance(openMapRealVector1);
      assertEquals(1.414213562373095E-12, double0, 0.01);
      assertEquals(122, openMapRealVector0.getDimension());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      RealVector realVector0 = RealVector.unmodifiableRealVector(openMapRealVector0);
      openMapRealVector0.getDistance(realVector0);
      assertEquals(0, openMapRealVector0.getDimension());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(144, 3504.765953761);
      double double0 = openMapRealVector0.getDistance((RealVector) openMapRealVector0);
      assertEquals(144, openMapRealVector0.getDimension());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(74, 0, (-264.266561840891));
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.mapAddToSelf(486.2933);
      double double0 = openMapRealVector1.getL1Distance((RealVector) openMapRealVector1);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(354, 354);
      Double[] doubleArray0 = new Double[8];
      doubleArray0[0] = (Double) 1.0E-12;
      doubleArray0[1] = (Double) 1.0E-12;
      doubleArray0[2] = (Double) 1.0E-12;
      doubleArray0[3] = (Double) 1.0E-12;
      doubleArray0[4] = (Double) 1.0E-12;
      doubleArray0[5] = (Double) 1.0E-12;
      doubleArray0[6] = doubleArray0[3];
      doubleArray0[7] = (Double) 1.0E-12;
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray0, (double) doubleArray0[2]);
      double double0 = openMapRealVector0.getL1Distance(openMapRealVector1);
      assertEquals(354, openMapRealVector0.getDimension());
      assertEquals(8.0E-12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      double double0 = openMapRealVector0.getL1Distance((RealVector) arrayRealVector0);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(74, 0, (-264.266561840891));
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0, 0);
      openMapRealVector1.mapAddToSelf(486.2933);
      double double0 = openMapRealVector1.getLInfDistance(openMapRealVector0);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(486.2933, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeDivide(openMapRealVector0);
      double double0 = openMapRealVector0.getLInfDistance(openMapRealVector1);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (-1.0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeDivide(openMapRealVector0);
      OpenMapRealVector openMapRealVector2 = openMapRealVector1.mapAdd((-1.0));
      double double0 = openMapRealVector2.getLInfDistance(openMapRealVector1);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(1.0, double0, 0.01);
      assertEquals(0.8, openMapRealVector2.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Double[] doubleArray0 = new Double[9];
      Double double0 = new Double(1.2794996377383974E-8);
      doubleArray0[1] = double0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, 1, 1);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      double double1 = openMapRealVector0.getLInfDistance(arrayRealVector0);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeDivide(openMapRealVector0);
      boolean boolean0 = openMapRealVector1.isInfinite();
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertFalse(boolean0);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Double[] doubleArray0 = new Double[8];
      Double double0 = new Double(0.0);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = double0;
      doubleArray0[3] = doubleArray0[0];
      doubleArray0[4] = double0;
      doubleArray0[5] = doubleArray0[0];
      doubleArray0[6] = doubleArray0[0];
      doubleArray0[7] = doubleArray0[0];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      openMapRealVector0.setSubVector(0, openMapRealVector0);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      
      openMapRealVector0.set(1.0E-12);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      OpenMapRealVector openMapRealVector1 = (OpenMapRealVector)openMapRealVector0.subtract((RealVector) openMapRealVector0);
      assertTrue(openMapRealVector1.equals((Object)openMapRealVector0));
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertEquals(Double.NaN, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 761.8906917841605;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract(openMapRealVector0);
      OpenMapRealVector openMapRealVector2 = openMapRealVector1.subtract(openMapRealVector0);
      assertFalse(openMapRealVector2.equals((Object)openMapRealVector0));
      assertEquals(0.25, openMapRealVector2.getSparsity(), 0.01);
      assertEquals(0.25, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      RealVector realVector0 = RealVector.unmodifiableRealVector(openMapRealVector0);
      OpenMapRealVector openMapRealVector1 = (OpenMapRealVector)openMapRealVector0.subtract(realVector0);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertTrue(openMapRealVector1.equals((Object)openMapRealVector0));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (-2770.297398442827);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      openMapRealVector0.unitize();
      assertEquals(0.5, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Double[] doubleArray0 = new Double[7];
      Double double0 = new Double(2088.531277);
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = double0;
      doubleArray0[3] = doubleArray0[0];
      doubleArray0[4] = double0;
      doubleArray0[5] = doubleArray0[3];
      doubleArray0[6] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double[] doubleArray1 = openMapRealVector0.toArray();
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertArrayEquals(new double[] {2088.531277, 2088.531277, 2088.531277, 2088.531277, 2088.531277, 2088.531277, 2088.531277}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[2] = 382.6114;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      openMapRealVector0.hashCode();
      assertEquals(0.16666666666666666, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(74, 0, (-264.266561840891));
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0, 0);
      openMapRealVector1.mapAddToSelf(486.2933);
      boolean boolean0 = openMapRealVector0.equals(openMapRealVector1);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Double[] doubleArray0 = new Double[6];
      Double double0 = new Double((-2.4006971787803736E189));
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray0[0];
      doubleArray0[3] = doubleArray0[0];
      doubleArray0[4] = doubleArray0[1];
      doubleArray0[5] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 1077.3112137);
      OpenMapRealVector.OpenMapSparseIterator openMapRealVector_OpenMapSparseIterator0 = openMapRealVector0.new OpenMapSparseIterator();
      RealVector.Entry realVector_Entry0 = openMapRealVector_OpenMapSparseIterator0.next();
      boolean boolean0 = openMapRealVector0.equals(realVector_Entry0);
      assertFalse(boolean0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector((-892), (-892));
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0, (-892));
      boolean boolean0 = openMapRealVector0.equals(openMapRealVector1);
      assertFalse(boolean0);
      assertEquals((-1784), openMapRealVector1.getDimension());
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray0, 2.5526681615684215E63);
      boolean boolean0 = openMapRealVector0.equals(openMapRealVector1);
      assertFalse(boolean0);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (-2770.297398442827);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      boolean boolean0 = openMapRealVector1.equals(openMapRealVector0);
      assertEquals(0.5, openMapRealVector1.getSparsity(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      openMapRealVector1.mapAddToSelf(580.118745077);
      boolean boolean0 = openMapRealVector1.equals(openMapRealVector0);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertFalse(boolean0);
  }
}
