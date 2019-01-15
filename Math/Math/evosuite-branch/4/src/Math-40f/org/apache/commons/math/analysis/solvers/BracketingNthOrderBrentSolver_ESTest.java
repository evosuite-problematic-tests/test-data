/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 15:20:33 GMT 2019
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.DifferentiableUnivariateFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.function.Power;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BracketingNthOrderBrentSolver_ESTest extends BracketingNthOrderBrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1.0), 0.0, 0.0, 581);
      int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
      assertEquals(581, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(581, (UnivariateFunction) polynomialFunction0, (-26.82554), 2355.890819194559, 2300.774, allowedSolution0);
      assertEquals((-26.82554), bracketingNthOrderBrentSolver0.getMin(), 0.01);
      assertEquals(2300.774, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(341.9111858505, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 897);
      assertEquals(897, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1490), (-1490), (-1490));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,490 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 2457.30341169886, 1.0E-9, (-814));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -814 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (double) 581;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(581, (UnivariateFunction) polynomialFunction0, (-752.24), (-1.0), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-752.24, -1], values: [-437,051.44, -581]
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2172.384), (-2651.0), (-2651.0), 32);
      Power power0 = new Power(2680.19912691215);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(32, (UnivariateFunction) power0, 0.0, 2680.19912691215, allowedSolution0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(32, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (double) 581;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(581, (UnivariateFunction) polynomialFunction0, (-26.82554), 2355.890819194559, 2300.774, allowedSolution0);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (double) 581;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(581, (UnivariateFunction) polynomialFunction0, (-752.24), 0.0, allowedSolution0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1.0), 0.0, 1.5413693858220168, 581);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1.5413693858220168;
      doubleArray0[1] = (double) 581;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(581, (UnivariateFunction) polynomialFunction0, (-752.24), 1.5413693858220168, allowedSolution0);
      assertEquals((-0.0026529593559416753), double0, 0.01);
      assertEquals(581, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      double[] doubleArray0 = new double[8];
      doubleArray0[5] = (-752.24);
      doubleArray0[7] = (double) 581;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(581, (UnivariateFunction) polynomialFunction0, (-752.24), (-1.0), allowedSolution0);
      assertEquals((-1.13786344434081), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(701.504080454, 701.504080454, 701.504080454, 2218);
      Sin sin0 = new Sin();
      DifferentiableUnivariateFunction differentiableUnivariateFunction0 = sin0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(2218, (UnivariateFunction) differentiableUnivariateFunction0, 1.0, (double) 2218, 701.504080454, allowedSolution0);
      assertEquals(1.0, double0, 0.01);
      assertEquals(2218, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = (-1.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(581, (UnivariateFunction) polynomialFunction0, (-26.82554), 2355.890819194559, 2300.774, allowedSolution0);
      assertEquals(3.6029228136040932E-6, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      double[] doubleArray0 = new double[8];
      doubleArray0[5] = (-1.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(581, (UnivariateFunction) polynomialFunction0, (-26.82554), 2355.890819194559, (-1.138233274835915), allowedSolution0);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(1.2257471402358122E-4, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Sin sin0 = new Sin();
      DifferentiableUnivariateFunction differentiableUnivariateFunction0 = sin0.derivative();
      double double0 = bracketingNthOrderBrentSolver0.solve(1597, (UnivariateFunction) differentiableUnivariateFunction0, 0.0, 701.504080454, 1.0E-6);
      assertEquals(699.004365423576, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = (double) 581;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(581, (UnivariateFunction) polynomialFunction0, (-26.82554), 2355.890819194559, 2300.774, allowedSolution0);
      assertEquals((-0.0019552453942948324), double0, 0.01);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-0.19162899808070932);
      doubleArray0[3] = (-0.19162899808070932);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(581, (UnivariateFunction) polynomialFunction0, (-752.24), (-0.19162899808070932), allowedSolution0);
      assertEquals((-1.000000000092844), double0, 0.01);
  }
}
