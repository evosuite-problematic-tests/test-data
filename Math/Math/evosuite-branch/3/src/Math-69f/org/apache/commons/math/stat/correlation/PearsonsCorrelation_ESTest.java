/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 16:28:56 GMT 2019
 */

package org.apache.commons.math.stat.correlation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.stat.correlation.Covariance;
import org.apache.commons.math.stat.correlation.PearsonsCorrelation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PearsonsCorrelation_ESTest extends PearsonsCorrelation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(1379, 1130);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.getColumnMatrix(56);
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(realMatrix0, 1130);
      RealMatrix realMatrix1 = pearsonsCorrelation0.getCorrelationMatrix();
      assertEquals(1.0, realMatrix1.getFrobeniusNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data: only 1 rows and 2 columns.
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[][] doubleArray0 = new double[2][7];
      Covariance covariance0 = new Covariance(doubleArray0, true);
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(covariance0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation(covariance0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // covariance matrix is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(1407, 1130);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.getColumnMatrix(56);
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(realMatrix0, 1130);
      RealMatrix realMatrix1 = pearsonsCorrelation0.getCorrelationStandardErrors();
      assertEquals(0.0, realMatrix1.getFrobeniusNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(realMatrix0);
      RealMatrix realMatrix1 = pearsonsCorrelation0.getCorrelationPValues();
      assertEquals(6, realMatrix1.getColumnDimension());
      assertEquals(Double.NaN, realMatrix1.getFrobeniusNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(array2DRowRealMatrix0, 1505);
      double[] doubleArray1 = new double[5];
      try { 
        pearsonsCorrelation0.correlation(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid array dimensions. xArray has size 4; yArray has 5 elements
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(1407, 1130);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.getColumnMatrix(56);
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(realMatrix0, 1130);
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[4];
      doubleArray0[0] = doubleArray1;
      // Undeclared exception!
      try { 
        pearsonsCorrelation0.computeCorrelationMatrix(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid array dimensions. xArray has size 1; yArray has 1 elements
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation(array2DRowRealMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data: only 4 rows and 1 columns.
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }
}