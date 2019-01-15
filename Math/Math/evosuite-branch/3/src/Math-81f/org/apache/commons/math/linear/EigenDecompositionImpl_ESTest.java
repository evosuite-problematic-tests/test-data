/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 16:54:45 GMT 2019
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.DecompositionSolver;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealMatrix;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[22];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-51.8));
      eigenDecompositionImpl0.getImagEigenvalues();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 1.0);
      try { 
        eigenDecompositionImpl0.getImagEigenvalue((-1104));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1104
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 100.0);
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(1239);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1239
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = new double[3];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.2250738585072014E-308);
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray2, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = (-1514.0);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      realMatrix0.setColumn(1, doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-51.8));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-51.8));
      eigenDecompositionImpl0.getV();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      assertFalse(realMatrix1.equals((Object)realMatrix0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-51.8));
      eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      assertFalse(realMatrix1.equals((Object)realMatrix0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 1.0);
      eigenDecompositionImpl0.getD();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      assertEquals(1, realMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-51.8));
      eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
      assertFalse(realMatrix1.equals((Object)realMatrix0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 1.0);
      eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      assertFalse(realMatrix0.equals((Object)array2DRowRealMatrix0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-51.8));
      eigenDecompositionImpl0.getVT();
      try { 
        eigenDecompositionImpl0.getEigenvector((-291));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -291
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      try { 
        eigenDecompositionImpl0.getEigenvector((-741));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -741
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-51.8));
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
      eigenDecompositionImpl0.getSolver();
      assertFalse(realMatrix0.equals((Object)realMatrix1));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[22];
      doubleArray0[1] = (-3260.747);
      doubleArray0[3] = 413.9;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-51.8));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 1840;
      doubleArray0[3] = (double) (-43);
      doubleArray0[6] = (double) (-43);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = Double.NEGATIVE_INFINITY;
      doubleArray0[3] = (-1065.853833);
      double[] doubleArray1 = new double[3];
      doubleArray1[2] = (-47.918574694517545);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1892.31640708);
      assertEquals((-5272487.601086937), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (-3260.746787443924);
      doubleArray0[2] = (-1514.0);
      doubleArray0[3] = 413.9;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-51.8));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // cannot solve degree 3 equation
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[22];
      doubleArray0[1] = (-3260.747);
      doubleArray0[2] = (-1514.0);
      doubleArray0[3] = 413.9;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-51.8));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = Double.NEGATIVE_INFINITY;
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 4536.5326707;
      doubleArray1[1] = 1892.31640708;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3483.609375731586));
      assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 2;
      doubleArray0[3] = (double) (-43);
      doubleArray0[5] = (double) 2;
      doubleArray0[6] = (double) (-43);
      doubleArray0[7] = (double) 2;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      openMapRealVector0.mapDivideToSelf((-18));
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = (double) 2679;
      doubleArray0[1] = (double) (-46);
      doubleArray0[0] = (double) (-46);
      doubleArray0[5] = (double) 2679;
      doubleArray0[6] = (double) (-46);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = (-1066.8687873210051);
      double[] doubleArray1 = new double[3];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, Double.NEGATIVE_INFINITY);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 1840;
      doubleArray0[1] = (double) (-43);
      doubleArray0[3] = (double) (-43);
      doubleArray0[2] = (double) (-43);
      doubleArray0[5] = (double) 2679;
      doubleArray0[6] = (double) (-43);
      doubleArray0[7] = (double) 1840;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      openMapRealVector0.mapDivideToSelf((-43));
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (double) 2679;
      doubleArray0[2] = (double) 2679;
      doubleArray0[3] = (double) (-46);
      doubleArray0[0] = (double) (-46);
      doubleArray0[5] = (double) 2679;
      doubleArray0[6] = (double) (-46);
      doubleArray0[7] = (double) 1840;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 1840;
      doubleArray0[2] = (double) 2679;
      doubleArray0[3] = (double) (-43);
      doubleArray0[5] = (double) 2679;
      doubleArray0[7] = (double) 1840;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      openMapRealVector0.mapDivideToSelf(2679);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) (-43);
      doubleArray0[2] = (double) 2652;
      doubleArray0[3] = (double) (-43);
      doubleArray0[5] = (double) 2652;
      doubleArray0[6] = (double) (-43);
      doubleArray0[7] = (double) 1840;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      openMapRealVector0.mapDivideToSelf(2652);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 1840;
      doubleArray0[3] = (double) (-43);
      doubleArray0[2] = (double) (-43);
      doubleArray0[5] = (double) 2679;
      doubleArray0[6] = (double) (-43);
      doubleArray0[7] = (double) 1840;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      openMapRealVector0.mapDivideToSelf((-43));
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = (double) 2679;
      doubleArray0[1] = (double) (-46);
      doubleArray0[0] = (double) (-46);
      doubleArray0[5] = (double) 2679;
      doubleArray0[6] = (double) (-46);
      doubleArray0[3] = (double) 1862;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 1840;
      doubleArray0[1] = (double) (-43);
      doubleArray0[2] = (double) (-43);
      doubleArray0[3] = (double) (-43);
      doubleArray0[5] = (double) 2679;
      doubleArray0[6] = (double) (-43);
      doubleArray0[7] = (double) 1840;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      openMapRealVector0.mapDivideToSelf(2679);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 2;
      doubleArray0[2] = (double) (-18);
      doubleArray0[3] = (double) (-43);
      doubleArray0[5] = (double) 2;
      doubleArray0[6] = (double) (-43);
      doubleArray0[7] = (double) 2;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      openMapRealVector0.mapDivideToSelf((-18));
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 1840;
      doubleArray0[1] = (double) (-43);
      doubleArray0[2] = (double) 2679;
      doubleArray0[3] = (double) (-43);
      doubleArray0[5] = (double) 1840;
      doubleArray0[6] = (double) (-43);
      doubleArray0[7] = (double) 1840;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      openMapRealVector0.mapDivideToSelf(2679);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 1840;
      doubleArray0[1] = (double) 2679;
      doubleArray0[3] = (double) (-43);
      doubleArray0[2] = (double) (-43);
      doubleArray0[5] = (double) 2679;
      doubleArray0[7] = (double) 1840;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      openMapRealVector0.mapDivideToSelf((-43));
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) (-43);
      doubleArray0[2] = (double) 2679;
      doubleArray0[5] = (double) 2679;
      doubleArray0[6] = (double) (-43);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      openMapRealVector0.mapDivideToSelf(2679);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 1779;
      doubleArray0[1] = (double) 2679;
      doubleArray0[3] = (double) (-43);
      doubleArray0[2] = (double) (-43);
      doubleArray0[5] = (double) 2679;
      doubleArray0[6] = (double) (-43);
      doubleArray0[7] = (double) 1779;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      openMapRealVector0.mapDivideToSelf((-43));
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (double) 2679;
      doubleArray0[2] = (double) 2679;
      doubleArray0[3] = (double) (-43);
      doubleArray0[0] = (double) (-43);
      doubleArray0[5] = (double) 2679;
      doubleArray0[6] = (double) (-43);
      doubleArray0[7] = (double) 1840;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (double) (-1463);
      doubleArray0[3] = (double) (-1463);
      doubleArray0[2] = (double) (-1463);
      doubleArray0[5] = (double) 2679;
      doubleArray0[6] = (double) (-1463);
      doubleArray0[7] = (double) 1840;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      openMapRealVector0.mapDivideToSelf((-1463));
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = 8.626312804275859;
      doubleArray0[0] = doubleArray1;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0, true);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 8.626312804275859);
      eigenDecompositionImpl0.getVT();
      assertEquals(8.626312804275859, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 1840;
      doubleArray0[1] = (double) (-43);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      assertEquals(9, realMatrix1.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = new double[3];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3483.609375731586));
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      assertFalse(decompositionSolver0.isNonSingular());
  }
}
