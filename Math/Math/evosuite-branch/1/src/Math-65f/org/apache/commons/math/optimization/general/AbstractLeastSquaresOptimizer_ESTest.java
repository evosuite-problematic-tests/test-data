/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 15:54:01 GMT 2018
 */

package org.apache.commons.math.optimization.general;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.apache.commons.math.optimization.general.GaussNewtonOptimizer;
import org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractLeastSquaresOptimizer_ESTest extends AbstractLeastSquaresOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.getRMS();
      levenbergMarquardtOptimizer0.incrementIterationsCounter();
      double[][] doubleArray0 = new double[2][6];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (double) 100;
      doubleArray1[1] = (-486.719630651);
      doubleArray1[2] = (-486.719630651);
      doubleArray1[3] = (double) 100;
      doubleArray1[4] = (-486.719630651);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[2];
      doubleArray2[0] = (-486.719630651);
      doubleArray2[1] = (-486.719630651);
      doubleArray0[1] = doubleArray2;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray0, (Object) null).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray3 = new double[2];
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(doubleArray3).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray3, doubleArray3, doubleArray3);
      levenbergMarquardtOptimizer0.getChiSquare();
      try { 
        levenbergMarquardtOptimizer0.getCovariances();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unable to compute covariances: singular problem
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      int int0 = levenbergMarquardtOptimizer0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, int0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      int int0 = levenbergMarquardtOptimizer0.getIterations();
      assertEquals(Integer.MAX_VALUE, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, int0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
      int int0 = gaussNewtonOptimizer0.getMaxIterations();
      assertEquals(100, int0);
      assertEquals(Integer.MAX_VALUE, gaussNewtonOptimizer0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
      int int0 = gaussNewtonOptimizer0.getEvaluations();
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(Integer.MAX_VALUE, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      int int0 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, int0);
      assertEquals(Integer.MAX_VALUE, levenbergMarquardtOptimizer0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.getConvergenceChecker();
      assertEquals(Integer.MAX_VALUE, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[3];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(doubleArray1).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray1, doubleArray1, doubleArray1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch 1 != 3
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setMaxIterations(0);
      try { 
        levenbergMarquardtOptimizer0.incrementIterationsCounter();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // maximal number of iterations (0) exceeded
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
      gaussNewtonOptimizer0.setMaxEvaluations(0);
      // Undeclared exception!
      try { 
        gaussNewtonOptimizer0.updateResidualsAndCost();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.FunctionEvaluationException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[2];
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((double[]) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      double[] doubleArray1 = new double[10];
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray1, doubleArray1, doubleArray1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[][] doubleArray0 = new double[2][6];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray1 = new double[2];
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(doubleArray1).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray1, doubleArray1, doubleArray1);
      double double0 = levenbergMarquardtOptimizer0.getChiSquare();
      assertEquals(1, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.rows = 2;
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.guessParametersErrors();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      try { 
        levenbergMarquardtOptimizer0.guessParametersErrors();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no degrees of freedom (0 measurements, 0 parameters)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = new double[9];
      try { 
        levenbergMarquardtOptimizer0.optimize((DifferentiableMultivariateVectorialFunction) null, doubleArray0, doubleArray1, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch 4 != 9
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }
}
