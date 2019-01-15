/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 14:11:12 GMT 2018
 */

package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimplexOptimizer_ESTest extends SimplexOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer((-1982.8862181556), (-1982.8862181556));
      OptimizationData[] optimizationDataArray0 = new OptimizationData[8];
      // Undeclared exception!
      try { 
        simplexOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(1.0, 6.283185307179586);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[5];
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = 6.283185307179586;
      doubleArray0[2] = 6.283185307179586;
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[0] = (OptimizationData) initialGuess0;
      NelderMeadSimplex nelderMeadSimplex0 = new NelderMeadSimplex(doubleArray0, 1.0, 6.283185307179586, (-2048.71288221633), 1.0);
      optimizationDataArray0[1] = (OptimizationData) nelderMeadSimplex0;
      // Undeclared exception!
      try { 
        simplexOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer((-1982.8862181556), (-1982.8862181556));
      OptimizationData[] optimizationDataArray0 = new OptimizationData[8];
      NelderMeadSimplex nelderMeadSimplex0 = new NelderMeadSimplex(21);
      optimizationDataArray0[1] = (OptimizationData) nelderMeadSimplex0;
      double[] doubleArray0 = new double[3];
      SimpleBounds simpleBounds0 = new SimpleBounds(doubleArray0, doubleArray0);
      optimizationDataArray0[6] = (OptimizationData) simpleBounds0;
      // Undeclared exception!
      try { 
        simplexOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: MathUnsupportedOperationException");
      
      } catch(MathUnsupportedOperationException e) {
         //
         // constraint
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", e);
      }
  }
}
