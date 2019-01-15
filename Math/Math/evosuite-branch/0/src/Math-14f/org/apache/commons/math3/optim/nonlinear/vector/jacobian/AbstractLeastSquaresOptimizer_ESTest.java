/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 10:08:37 GMT 2018
 */

package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.SimpleVectorValueChecker;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer;
import org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractLeastSquaresOptimizer_ESTest extends AbstractLeastSquaresOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleVectorValueChecker simpleVectorValueChecker0 = new SimpleVectorValueChecker(2704.43, 0.0);
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true, simpleVectorValueChecker0);
      gaussNewtonOptimizer0.setCost(0.0);
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.computeSigma(doubleArray0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer((-1806.7286180526992), (-1806.7286180526992), 822.0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[9];
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimplePointChecker<PointVectorValuePair> simplePointChecker0 = new SimplePointChecker<PointVectorValuePair>((-745.1863732), 1546.5060766);
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false, simplePointChecker0);
      // Undeclared exception!
      try { 
        gaussNewtonOptimizer0.getRMS();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer((-2572.58013841592), 0.0, 0.0);
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.getWeightSquareRoot();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.computeCost(doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer((-1806.7286180526992), (-1806.7286180526992), 822.0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[9];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(30, 30);
      Weight weight0 = new Weight(array2DRowRealMatrix0);
      optimizationDataArray0[3] = (OptimizationData) weight0;
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: MathUnsupportedOperationException");
      
      } catch(MathUnsupportedOperationException e) {
         //
         // unsupported operation
         //
         verifyException("org.apache.commons.math3.linear.EigenDecomposition", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      OptimizationData[] optimizationDataArray0 = new OptimizationData[19];
      double[] doubleArray0 = new double[2];
      Weight weight0 = new Weight(doubleArray0);
      optimizationDataArray0[10] = (OptimizationData) weight0;
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", e);
      }
  }
}
