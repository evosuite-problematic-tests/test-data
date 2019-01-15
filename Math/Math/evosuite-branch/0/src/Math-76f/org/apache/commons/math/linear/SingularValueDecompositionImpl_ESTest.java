/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 11:53:57 GMT 2018
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.BlockRealMatrix;
import org.apache.commons.math.linear.DecompositionSolver;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealVector;
import org.apache.commons.math.linear.SingularValueDecompositionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SingularValueDecompositionImpl_ESTest extends SingularValueDecompositionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl(array2DRowRealMatrix0);
      // Undeclared exception!
      try { 
        singularValueDecompositionImpl0.getConditionNumber();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.linear.SingularValueDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[1][7];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl(array2DRowRealMatrix0);
      double[] doubleArray1 = singularValueDecompositionImpl0.getSingularValues();
      assertEquals(0, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[18];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl(realMatrix0);
      // Undeclared exception!
      try { 
        singularValueDecompositionImpl0.getNorm();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.linear.SingularValueDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(2, 2);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.scalarAdd(503.155);
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl(realMatrix0);
      singularValueDecompositionImpl0.getU();
      RealMatrix realMatrix1 = singularValueDecompositionImpl0.getU();
      assertNotNull(realMatrix1);
      assertEquals(1006.31, singularValueDecompositionImpl0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Double[] doubleArray0 = new Double[4];
      Double double0 = new Double((-1441.4346305));
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      Double double1 = new Double(0.0);
      doubleArray0[2] = double1;
      doubleArray0[3] = double1;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 1.0);
      double[] doubleArray1 = new double[2];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray1);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(openMapRealVector0, arrayRealVector0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct((RealVector) arrayRealVector1);
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl(realMatrix0);
      RealMatrix realMatrix1 = singularValueDecompositionImpl0.getUT();
      assertNotNull(realMatrix1);
      assertEquals(1.8631373407950947E8, singularValueDecompositionImpl0.getConditionNumber(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 674.087868;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl(realMatrix0);
      DecompositionSolver decompositionSolver0 = singularValueDecompositionImpl0.getSolver();
      assertTrue(decompositionSolver0.isNonSingular());
      
      singularValueDecompositionImpl0.getUT();
      assertEquals(454394.45378478535, singularValueDecompositionImpl0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 674.087868;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl(realMatrix0);
      singularValueDecompositionImpl0.getS();
      RealMatrix realMatrix1 = singularValueDecompositionImpl0.getS();
      assertEquals(454394.45378478535, singularValueDecompositionImpl0.getNorm(), 0.01);
      assertNotNull(realMatrix1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 674.087868;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl(realMatrix0);
      singularValueDecompositionImpl0.getCovariance(674.087868);
      RealMatrix realMatrix1 = singularValueDecompositionImpl0.getV();
      assertEquals(1, realMatrix1.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[1][7];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl(array2DRowRealMatrix0);
      // Undeclared exception!
      try { 
        singularValueDecompositionImpl0.getV();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // column index -1 out of allowed range [0, 0]
         //
         verifyException("org.apache.commons.math.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[][] doubleArray0 = new double[1][7];
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 947.4164749539;
      doubleArray0[0] = doubleArray1;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl(array2DRowRealMatrix0);
      RealMatrix realMatrix0 = singularValueDecompositionImpl0.getV();
      assertNotSame(realMatrix0, array2DRowRealMatrix0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 947.4164749539;
      double[][] doubleArray1 = new double[3][7];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(doubleArray1);
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl(blockRealMatrix0);
      RealMatrix realMatrix0 = singularValueDecompositionImpl0.getV();
      assertEquals(1640.9734705479614, singularValueDecompositionImpl0.getNorm(), 0.01);
      assertEquals(1, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 674.087868;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl(realMatrix0);
      singularValueDecompositionImpl0.getCovariance(674.087868);
      RealMatrix realMatrix1 = singularValueDecompositionImpl0.getVT();
      assertNotSame(realMatrix1, realMatrix0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 674.087868;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl(realMatrix0);
      // Undeclared exception!
      try { 
        singularValueDecompositionImpl0.getCovariance(1.263445951028954E7);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cutoff singular value is 12,634,459.51, should be at most 454,394.454
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = Double.NEGATIVE_INFINITY;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl(array2DRowRealMatrix0);
      int int0 = singularValueDecompositionImpl0.getRank();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[18];
      doubleArray0[0] = 674.087868;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl(realMatrix0);
      DecompositionSolver decompositionSolver0 = singularValueDecompositionImpl0.getSolver();
      assertFalse(decompositionSolver0.isNonSingular());
      assertEquals(1, singularValueDecompositionImpl0.getRank());
  }
}
