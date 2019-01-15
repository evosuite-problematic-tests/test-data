/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 14:30:34 GMT 2018
 */

package org.apache.commons.math3.optim.nonlinear.vector;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Weight_ESTest extends Weight_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Weight weight0 = new Weight(doubleArray0);
      RealMatrix realMatrix0 = weight0.getWeight();
      assertEquals(3, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(46);
      Weight weight0 = new Weight(diagonalMatrix0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      Weight weight0 = null;
      try {
        weight0 = new Weight(array2DRowRealMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // non square (1x4) matrix
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.vector.Weight", e);
      }
  }
}
