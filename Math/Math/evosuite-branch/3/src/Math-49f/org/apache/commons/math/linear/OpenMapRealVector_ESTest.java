/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 15:59:40 GMT 2019
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OpenMapRealVector_ESTest extends OpenMapRealVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, false);
      openMapRealVector0.dotProduct((RealVector) arrayRealVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Double[] doubleArray0 = new Double[2];
      Double double0 = new Double(1.5874010519681994);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (double) doubleArray0[0]);
      OpenMapRealVector.OpenMapSparseIterator openMapRealVector_OpenMapSparseIterator0 = openMapRealVector0.new OpenMapSparseIterator();
      // Undeclared exception!
      try { 
        openMapRealVector_OpenMapSparseIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported
         //
         verifyException("org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-0.16666666666666666));
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.append(0.0);
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(3, openMapRealVector0.getDimension());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.036);
      // Undeclared exception!
      try { 
        openMapRealVector0.unitVector();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm
         //
         verifyException("org.apache.commons.math.linear.OpenMapRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.036);
      double[] doubleArray1 = openMapRealVector0.toArray();
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(3, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Double[] doubleArray0 = new Double[2];
      Double double0 = new Double(999.22977239906);
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double1 = openMapRealVector0.getSparsity();
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(openMapRealVector0);
      // Undeclared exception!
      try { 
        openMapRealVector0.setSubVector((-4230), (RealVector) arrayRealVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // index (-4,230)
         //
         verifyException("org.apache.commons.math.linear.AbstractRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      RealVector realVector0 = openMapRealVector0.add((RealVector) arrayRealVector0);
      assertTrue(realVector0.equals((Object)arrayRealVector0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 0.003;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-276.4754207065355));
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector((RealVector) openMapRealVector0);
      assertEquals(0.1111111111111111, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Double[] doubleArray0 = new Double[7];
      Double double0 = new Double((-908.9960582722601));
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[0];
      doubleArray0[3] = double0;
      doubleArray0[4] = doubleArray0[1];
      doubleArray0[5] = doubleArray0[0];
      Double double1 = new Double(0.0);
      doubleArray0[6] = double1;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double[] doubleArray1 = new double[7];
      doubleArray1[6] = (double) doubleArray0[0];
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray1);
      OpenMapRealVector openMapRealVector2 = openMapRealVector0.add(openMapRealVector1);
      assertEquals(0.14285714285714285, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(0.8571428571428571, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(1.0, openMapRealVector2.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(27);
      assertEquals(27, openMapRealVector0.getDimension());
      
      Double[] doubleArray0 = new Double[1];
      doubleArray0[0] = (Double) 1.0E-12;
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray0, 1.0E-12);
      OpenMapRealVector openMapRealVector2 = openMapRealVector0.append((RealVector) openMapRealVector1);
      assertEquals(0.03571428571428571, openMapRealVector2.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Double[] doubleArray0 = new Double[8];
      Double double0 = new Double((-1074.7335557));
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = double0;
      doubleArray0[3] = doubleArray0[0];
      doubleArray0[4] = double0;
      doubleArray0[5] = doubleArray0[1];
      doubleArray0[6] = doubleArray0[2];
      doubleArray0[7] = doubleArray0[0];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double[] doubleArray1 = new double[4];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray1, true);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.append((RealVector) arrayRealVector0);
      assertEquals(0.6666666666666666, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-794.7402085325508));
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeDivide(doubleArray0);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
      assertNotSame(openMapRealVector1, openMapRealVector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-240.64);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.036);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeMultiply((RealVector) openMapRealVector0);
      assertEquals(0.3333333333333333, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(0.3333333333333333, openMapRealVector0.getSparsity(), 0.01);
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-2768.364983938902));
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeMultiply(doubleArray0);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertTrue(openMapRealVector1.equals((Object)openMapRealVector0));
      assertNotSame(openMapRealVector1, openMapRealVector0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-169.7);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.getSubVector(0, 4);
      assertEquals(0.25, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(0.2, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-169.7);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.getSubVector(1, 1);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(0.2, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(1, openMapRealVector1.getDimension());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[4] = 0.0875862700108075;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.getSubVector(1, 1);
      assertEquals(1, openMapRealVector1.getDimension());
      assertEquals(0.2, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-240.64);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.036);
      double[] doubleArray1 = openMapRealVector0.getData();
      assertEquals(0.3333333333333333, openMapRealVector0.getSparsity(), 0.01);
      assertArrayEquals(new double[] {(-240.64), 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-169.7);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double0 = openMapRealVector0.getDistance(openMapRealVector0);
      assertEquals(0.2, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(2144247702);
      Double[] doubleArray0 = new Double[7];
      doubleArray0[0] = (Double) 1.0E-12;
      doubleArray0[1] = (Double) 1.0E-12;
      doubleArray0[2] = (Double) 1.0E-12;
      doubleArray0[3] = (Double) 1.0E-12;
      doubleArray0[4] = (Double) 1.0E-12;
      doubleArray0[5] = (Double) 1.0E-12;
      doubleArray0[6] = doubleArray0[0];
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray0);
      double double0 = openMapRealVector0.getDistance(openMapRealVector1);
      assertEquals(2.6457513110645905E-12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      double double0 = openMapRealVector0.getDistance((RealVector) arrayRealVector0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.036);
      double double0 = openMapRealVector0.getDistance((RealVector) openMapRealVector0);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double0 = openMapRealVector0.getDistance(doubleArray0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-169.7);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double0 = openMapRealVector0.getL1Distance(openMapRealVector0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.2, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      Double[] doubleArray1 = new Double[8];
      doubleArray1[0] = (Double) 1.0E-12;
      doubleArray1[1] = (Double) 1.0E-12;
      doubleArray1[2] = (Double) 0.0;
      doubleArray1[3] = (Double) 1.0E-12;
      doubleArray1[4] = (Double) 0.0;
      doubleArray1[5] = (Double) 1.0E-12;
      doubleArray1[6] = (Double) 0.0;
      doubleArray1[7] = (Double) 0.0;
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray1);
      double double0 = openMapRealVector0.getL1Distance(openMapRealVector1);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(4.0E-12, double0, 0.01);
      assertEquals(0.5, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(openMapRealVector0);
      double double0 = openMapRealVector0.getL1Distance((RealVector) arrayRealVector0);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.036);
      double double0 = openMapRealVector0.getL1Distance((RealVector) openMapRealVector0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.mapAdd(0.09090909090909091);
      double double0 = openMapRealVector1.getLInfDistance((RealVector) openMapRealVector0);
      assertEquals(0.09090909090909091, double0, 0.01);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 491.466);
      OpenMapRealVector openMapRealVector1 = (OpenMapRealVector)openMapRealVector0.mapDivide(0.0);
      double double0 = openMapRealVector0.getLInfDistance((RealVector) openMapRealVector1);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[3] = (-1154.1);
      doubleArray0[4] = 2.404307984052299E-9;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 491.466);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.projection(doubleArray0);
      double double0 = openMapRealVector0.getLInfDistance((RealVector) openMapRealVector1);
      assertEquals(2.404307984052299E-9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Double[] doubleArray0 = new Double[0];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 1.0);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      double double0 = openMapRealVector0.getLInfDistance((RealVector) arrayRealVector0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = 0.008333333333329196;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.036);
      double double0 = openMapRealVector0.getLInfDistance(doubleArray0);
      assertEquals(0.008333333333329196, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-169.7);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      boolean boolean0 = openMapRealVector0.isInfinite();
      assertFalse(boolean0);
      assertEquals(0.2, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = (OpenMapRealVector)openMapRealVector0.projection((RealVector) openMapRealVector0);
      boolean boolean0 = openMapRealVector1.isInfinite();
      assertFalse(boolean0);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealVector realVector0 = openMapRealVector0.add((RealVector) openMapRealVector0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.mapAddToSelf(1396.371177759);
      OpenMapRealVector openMapRealVector2 = openMapRealVector1.ebeDivide(realVector0);
      boolean boolean0 = openMapRealVector2.isInfinite();
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertFalse(realVector0.equals((Object)openMapRealVector0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-240.64));
      boolean boolean0 = openMapRealVector0.isNaN();
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealVector realVector0 = openMapRealVector0.projection((RealVector) openMapRealVector0);
      boolean boolean0 = realVector0.isNaN();
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-240.64));
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      assertEquals(3, realMatrix0.getRowDimension());
      assertEquals(3, realMatrix0.getColumnDimension());
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-169.7);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      assertEquals(0.2, openMapRealVector0.getSparsity(), 0.01);
      
      openMapRealVector0.set(0.0);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(769);
      double[] doubleArray0 = new double[8];
      openMapRealVector0.setSubVector(31, doubleArray0);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-240.64));
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract((RealVector) openMapRealVector0);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertTrue(openMapRealVector1.equals((Object)openMapRealVector0));
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.mapAdd((-577.91249259));
      OpenMapRealVector openMapRealVector2 = openMapRealVector0.subtract(openMapRealVector1);
      assertFalse(openMapRealVector2.equals((Object)openMapRealVector1));
      assertNotSame(openMapRealVector2, openMapRealVector1);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(1.0, openMapRealVector2.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-1215.128);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 1.125);
      RealVector realVector0 = openMapRealVector0.add(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract(realVector0);
      assertEquals(0.14285714285714285, openMapRealVector0.getSparsity(), 0.01);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertEquals(0.14285714285714285, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-240.64));
      openMapRealVector0.hashCode();
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-240.64);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.036);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.unitVector();
      boolean boolean0 = openMapRealVector0.equals(openMapRealVector1);
      assertEquals(0.3333333333333333, openMapRealVector0.getSparsity(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double((-1.0));
      doubleArray0[0] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      boolean boolean0 = openMapRealVector0.equals(doubleArray0[0]);
      assertFalse(boolean0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(1713, 1729);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector();
      boolean boolean0 = openMapRealVector0.equals(openMapRealVector1);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
      assertFalse(boolean0);
      assertEquals(1713, openMapRealVector0.getDimension());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector((-2134), (-2134));
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector((-2134), (-1));
      boolean boolean0 = openMapRealVector0.equals(openMapRealVector1);
      assertFalse(boolean0);
      assertEquals((-2134), openMapRealVector0.getDimension());
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-240.64);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.036);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.unitVector();
      OpenMapRealVector openMapRealVector2 = (OpenMapRealVector)openMapRealVector0.mapDivide((-240.64));
      OpenMapRealVector openMapRealVector3 = openMapRealVector2.add(openMapRealVector1);
      boolean boolean0 = openMapRealVector3.equals(openMapRealVector2);
      assertFalse(openMapRealVector3.equals((Object)openMapRealVector1));
      assertEquals(0.0, openMapRealVector3.getSparsity(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 0.16666666666745392;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      boolean boolean0 = openMapRealVector1.equals(openMapRealVector0);
      assertTrue(boolean0);
  }
}
