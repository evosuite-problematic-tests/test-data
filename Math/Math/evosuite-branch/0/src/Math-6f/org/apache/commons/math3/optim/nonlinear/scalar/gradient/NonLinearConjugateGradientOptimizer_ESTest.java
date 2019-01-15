/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 09:47:45 GMT 2018
 */

package org.apache.commons.math3.optim.nonlinear.scalar.gradient;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.solvers.BisectionSolver;
import org.apache.commons.math3.analysis.solvers.BrentSolver;
import org.apache.commons.math3.analysis.solvers.PegasusSolver;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NonLinearConjugateGradientOptimizer_ESTest extends NonLinearConjugateGradientOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NonLinearConjugateGradientOptimizer.IdentityPreconditioner nonLinearConjugateGradientOptimizer_IdentityPreconditioner0 = new NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
      // Undeclared exception!
      try { 
        nonLinearConjugateGradientOptimizer_IdentityPreconditioner0.precondition((double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$IdentityPreconditioner", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>((-19.05456594341), 970.2477074077);
      NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, simplePointChecker0);
      assertNull(nonLinearConjugateGradientOptimizer0.getGoalType());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE;
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(0.0, 0.0, 2771);
      PegasusSolver pegasusSolver0 = new PegasusSolver(775.057586, 944.6141907533, 2771);
      NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, simplePointChecker0, pegasusSolver0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[2];
      NonLinearConjugateGradientOptimizer.BracketingStep nonLinearConjugateGradientOptimizer_BracketingStep0 = new NonLinearConjugateGradientOptimizer.BracketingStep(944.6141907533);
      optimizationDataArray0[0] = (OptimizationData) nonLinearConjugateGradientOptimizer_BracketingStep0;
      nonLinearConjugateGradientOptimizer0.parseOptimizationData(optimizationDataArray0);
      assertEquals(2, optimizationDataArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker(9.163997439438226, 9.163997439438226);
      BrentSolver brentSolver0 = new BrentSolver();
      NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, simpleValueChecker0, brentSolver0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[2];
      // Undeclared exception!
      try { 
        nonLinearConjugateGradientOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker(0.0, (-1230.208054454));
      BisectionSolver bisectionSolver0 = new BisectionSolver((-1230.208054454), (-2253.0));
      NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, simpleValueChecker0, bisectionSolver0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[1];
      SimpleBounds simpleBounds0 = SimpleBounds.unbounded(3113);
      optimizationDataArray0[0] = (OptimizationData) simpleBounds0;
      // Undeclared exception!
      try { 
        nonLinearConjugateGradientOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: MathUnsupportedOperationException");
      
      } catch(MathUnsupportedOperationException e) {
         //
         // constraint
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", e);
      }
  }
}
