/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 16:03:30 GMT 2018
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BrentSolver_ESTest extends BrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve((-334.799797), (-334.799797));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-334.8, -334.8]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 4212.034913;
      doubleArray0[1] = 2.0;
      doubleArray0[3] = 1274.0;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 0.0, 1274.0, 2.0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-1758.1430937444825), Double.POSITIVE_INFINITY, 343.278831322344);
      assertEquals(343.278831322344, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 0.0035230071720728623;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        brentSolver0.solve((-21.145176627671344), 5369.32660757, 0.0035230071720728623);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [-21.145, 5,369.327], Values: [0.004, 0.004]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = 5369.32660757;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve((-21.145176627671344), 5369.32660757, 0.0035230071720728623);
      assertEquals(2, brentSolver0.getIterationCount());
      assertEquals((-4.3368086899420177E-19), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = (-10.71861);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-2505.46297101), 0.0, (-601.1764));
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = 5369.32660757;
      doubleArray0[3] = (-10.71861);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve(0.0, 5369.32660757, 1.0);
      assertEquals(21, brentSolver0.getIterationCount());
      assertEquals(22.381669988846173, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = Double.POSITIVE_INFINITY;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, 0.0, Double.POSITIVE_INFINITY, 3.3665038575773976E44);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-2369.4552112913007), 861.473);
      assertEquals((-2369.4552112913007), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = Double.POSITIVE_INFINITY;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, 380.77662, 861.473);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [380.777, 861.473], Values: [\u221E, \u221E]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[3] = 675.1859098340145;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, 1.0E-14, 0.39424508191458685);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[22];
      doubleArray0[1] = 1.0E-6;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver();
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-2184.51797298), (-1.1368683772161603E-13));
      assertEquals((-1.1368683772161603E-13), double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = Double.POSITIVE_INFINITY;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, 0.0, 2.0);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[22];
      doubleArray0[1] = Double.POSITIVE_INFINITY;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.setRelativeAccuracy(Double.NaN);
      try { 
        brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-3458.0727938), 839.128728433858);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 186.2;
      doubleArray0[1] = 10.7186095;
      doubleArray0[2] = (-887.9557954671949);
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunctionLagrangeForm0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-2701.58518899), 0.5, (-887.9557954671949));
      assertEquals(1, brentSolver0.getIterationCount());
      assertEquals(1.1102230246251565E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1.0;
      doubleArray0[6] = (-601.1763928274277);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-10.71861), 0.0);
      assertEquals(15, brentSolver0.getIterationCount());
      assertEquals((-0.34421778768389055), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = 115.871897219;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-10.71861), 5369.32660757);
      assertEquals(56, brentSolver0.getIterationCount());
      assertEquals((-0.0035855222140149497), double0, 0.01);
  }
}
