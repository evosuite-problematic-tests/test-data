/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 14:48:59 GMT 2019
 */

package org.apache.commons.math3.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RectangularCholeskyDecomposition;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RectangularCholeskyDecomposition_ESTest extends RectangularCholeskyDecomposition_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[5] = 2105.18144;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(openMapRealVector0);
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition(realMatrix0, 1335.3);
      int int0 = rectangularCholeskyDecomposition0.getRank();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[5] = 2105.18144;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(openMapRealVector0);
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition(realMatrix0, 1335.3);
      RealMatrix realMatrix1 = rectangularCholeskyDecomposition0.getRootMatrix();
      assertEquals(2, realMatrix1.getColumnDimension());
      assertEquals(8, realMatrix1.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-4132.4);
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      Double[] doubleArray1 = new Double[1];
      doubleArray1[0] = (Double) (-4132.4);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray1, (-4132.4));
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(openMapRealVector0);
      RealMatrix realMatrix1 = array2DRowRealMatrix0.preMultiply(realMatrix0);
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = null;
      try {
        rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition(realMatrix1, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -70,567,878,060.224 is smaller than, or equal to, the minimum (0): not positive definite matrix: value -70,567,878,060.224 at index 0
         //
         verifyException("org.apache.commons.math3.linear.RectangularCholeskyDecomposition", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-373.0);
      doubleArray0[2] = 0.5;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      Double[] doubleArray1 = new Double[5];
      doubleArray1[0] = (Double) 1.0E-12;
      doubleArray1[1] = (Double) doubleArray0[0];
      doubleArray1[2] = (Double) 326.222683;
      doubleArray1[3] = (Double) (-373.0);
      doubleArray1[4] = (Double) 0.5;
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray1);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(openMapRealVector1);
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = null;
      try {
        rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition(realMatrix0, 0.5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -90,774,071.326 is smaller than, or equal to, the minimum (0.5): not positive definite matrix: value -90,774,071.326 at index 2
         //
         verifyException("org.apache.commons.math3.linear.RectangularCholeskyDecomposition", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = 568.0839697576;
      doubleArray0[0] = doubleArray1;
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(doubleArray0);
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition(blockRealMatrix0, 0.5);
      assertEquals(1, rectangularCholeskyDecomposition0.getRank());
  }
}
