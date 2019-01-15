/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 15:52:10 GMT 2018
 */

package org.apache.commons.math.optimization.general;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.apache.commons.math.optimization.SimpleVectorialPointChecker;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LevenbergMarquardtOptimizer_ESTest extends LevenbergMarquardtOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 100;
      levenbergMarquardtOptimizer0.residualsWeights = doubleArray0;
      levenbergMarquardtOptimizer0.setQRRankingThreshold(9.999999999999996E8);
      double[][] doubleArray1 = new double[1][0];
      doubleArray1[0] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) levenbergMarquardtOptimizer0.residualsWeights, (Object) doubleArray0, (Object) levenbergMarquardtOptimizer0.residualsWeights, (Object) levenbergMarquardtOptimizer0.residualsWeights).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.doOptimize();
      assertEquals(1000000.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[1];
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor(2.2251E-308);
      doubleArray0[0] = (double) 100;
      levenbergMarquardtOptimizer0.residualsWeights = doubleArray0;
      double[][] doubleArray1 = new double[1][0];
      doubleArray1[0] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) levenbergMarquardtOptimizer0.residualsWeights, (Object) doubleArray0, (Object) doubleArray0, (Object) levenbergMarquardtOptimizer0.residualsWeights).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.doOptimize();
      assertEquals(8.1E7, levenbergMarquardtOptimizer0.getChiSquare(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 100;
      levenbergMarquardtOptimizer0.residualsWeights = doubleArray0;
      double[][] doubleArray1 = new double[1][0];
      doubleArray1[0] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray2 = new double[1];
      doubleArray2[0] = 4816.87261;
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) levenbergMarquardtOptimizer0.residualsWeights, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray2, (Object) doubleArray2).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.doOptimize();
      assertEquals(2, levenbergMarquardtOptimizer0.getJacobianEvaluations());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 100;
      levenbergMarquardtOptimizer0.residualsWeights = doubleArray0;
      double[][] doubleArray1 = new double[1][0];
      doubleArray1[0] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray2 = new double[1];
      SimpleVectorialPointChecker simpleVectorialPointChecker0 = new SimpleVectorialPointChecker();
      levenbergMarquardtOptimizer0.setConvergenceChecker(simpleVectorialPointChecker0);
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) levenbergMarquardtOptimizer0.residualsWeights, (Object) doubleArray0, (Object) doubleArray0, (Object) levenbergMarquardtOptimizer0.residualsWeights, (Object) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // parameters relative tolerance is too small (0), no further improvement in the approximate solution is possible
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 100;
      levenbergMarquardtOptimizer0.residualsWeights = doubleArray0;
      double[][] doubleArray1 = new double[1][0];
      doubleArray1[0] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray2 = new double[1];
      SimpleVectorialPointChecker simpleVectorialPointChecker0 = new SimpleVectorialPointChecker(100.0, 100);
      levenbergMarquardtOptimizer0.setConvergenceChecker(simpleVectorialPointChecker0);
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) levenbergMarquardtOptimizer0.residualsWeights, (Object) doubleArray0, (Object) doubleArray0, (Object) levenbergMarquardtOptimizer0.residualsWeights, (Object) doubleArray2).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.doOptimize();
      assertEquals(1000.0, levenbergMarquardtOptimizer0.getRMS(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 100;
      levenbergMarquardtOptimizer0.residualsWeights = doubleArray0;
      levenbergMarquardtOptimizer0.setQRRankingThreshold(1.0);
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0);
      double[][] doubleArray1 = new double[1][0];
      doubleArray1[0] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1, (Object) null).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray2 = new double[1];
      doubleArray2[0] = 1.0;
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) levenbergMarquardtOptimizer0.residualsWeights, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray2).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0);
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 100;
      levenbergMarquardtOptimizer0.residualsWeights = doubleArray0;
      levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0);
      double[][] doubleArray1 = new double[1][0];
      doubleArray1[0] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray2 = new double[1];
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) levenbergMarquardtOptimizer0.residualsWeights, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray2, (Object) doubleArray2).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.doOptimize();
      assertEquals(1000.0, levenbergMarquardtOptimizer0.getRMS(), 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[1];
      levenbergMarquardtOptimizer0.residualsWeights = doubleArray0;
      double[][] doubleArray1 = new double[1][0];
      doubleArray1[0] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) levenbergMarquardtOptimizer0.residualsWeights, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0));
      VectorialPointValuePair vectorialPointValuePair1 = levenbergMarquardtOptimizer0.doOptimize();
      assertNotSame(vectorialPointValuePair1, vectorialPointValuePair0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 100;
      levenbergMarquardtOptimizer0.residualsWeights = doubleArray0;
      levenbergMarquardtOptimizer0.setQRRankingThreshold(1.0);
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0);
      double[][] doubleArray1 = new double[1][0];
      doubleArray1[0] = doubleArray0;
      double[][] doubleArray2 = new double[8][1];
      doubleArray2[0] = doubleArray0;
      doubleArray2[1] = doubleArray0;
      doubleArray2[2] = doubleArray0;
      doubleArray2[3] = levenbergMarquardtOptimizer0.residualsWeights;
      doubleArray2[4] = levenbergMarquardtOptimizer0.residualsWeights;
      doubleArray2[5] = doubleArray0;
      doubleArray2[7] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1, (Object) doubleArray1, (Object) null).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) levenbergMarquardtOptimizer0.residualsWeights, (Object) doubleArray0, (Object) doubleArray0, (Object) levenbergMarquardtOptimizer0.residualsWeights, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.residuals = doubleArray0;
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-4.42669096685415));
      levenbergMarquardtOptimizer0.setParRelativeTolerance((-4.42669096685415));
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 100;
      levenbergMarquardtOptimizer0.residualsWeights = doubleArray0;
      levenbergMarquardtOptimizer0.setQRRankingThreshold(100);
      levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0);
      double[][] doubleArray1 = new double[1][3];
      doubleArray1[0] = levenbergMarquardtOptimizer0.residualsWeights;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1, (Object) null).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) levenbergMarquardtOptimizer0.residualsWeights, (Object) levenbergMarquardtOptimizer0.residualsWeights, (Object) levenbergMarquardtOptimizer0.residualsWeights).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      double double0 = 0.0;
      levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0);
      levenbergMarquardtOptimizer0.updateJacobian();
      levenbergMarquardtOptimizer0.residualsWeights = doubleArray0;
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }
}