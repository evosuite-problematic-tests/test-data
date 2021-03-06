/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 15:33:17 GMT 2018
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Cbrt;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.Log10;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Sinc;
import org.apache.commons.math.analysis.function.Tanh;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1609.7686;
      doubleArray0[3] = (double) 2093;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      illinoisSolver0.solve(2093, (UnivariateRealFunction) polynomialFunction0, (-1161.026), (double) 2093, (-1083.8494654884787), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log10 log10_0 = new Log10();
      double double0 = pegasusSolver0.solve(243, (UnivariateRealFunction) log10_0, 0.15, (double) 1441, 1.0E-6);
      assertEquals(1.0E-6, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1.0000000000007718, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.5830993332061267E-10);
      Sigmoid sigmoid0 = new Sigmoid(0.0, (-1504.079954638813));
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(24, (UnivariateRealFunction) sigmoid0, (-1071.777), 0.0, 1.5830993332061267E-10, allowedSolution0);
      assertEquals(1.5830993332061267E-10, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1071.777), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0, (-2554.74117512), 0.5);
      Gaussian gaussian0 = new Gaussian();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(18, (UnivariateRealFunction) gaussian0, 1.0, (-2554.74117512), allowedSolution0);
      assertEquals(1.0, regulaFalsiSolver0.getMin(), 0.01);
      assertEquals((-2554.74117512), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1610.9114));
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(2439, (UnivariateRealFunction) tanh0, (-2.911444300634767E-13), 0.8315866022690556, allowedSolution0);
      assertEquals(0.8315866022690556, illinoisSolver0.getMax(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      double double0 = regulaFalsiSolver0.solve(5328, (UnivariateRealFunction) sinc0, 3263.61334527, (double) 5328, (double) 5328);
      assertEquals(5328.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(5324.999547834699, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(479, (UnivariateRealFunction) sinc0, (-1205.263), (double) 479, allowedSolution0);
      assertEquals((-363.13149999999996), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1083.8494651770786), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(479, (UnivariateRealFunction) sinc0, (-1205.263), 980.8763883652549, allowedSolution0);
      assertEquals((-112.19330581737245), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-958.185759344887), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(479, (UnivariateRealFunction) sinc0, (-1205.263), (double) 479, allowedSolution0);
      assertEquals((-363.13149999999996), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1083.8494651770786), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2179, (UnivariateRealFunction) sinc0, (-56.465), 1579.3939, allowedSolution0);
      assertEquals((-56.465), regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(1168.672467135403, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(479, (UnivariateRealFunction) sinc0, (-1205.263), 981.0332309139, allowedSolution0);
      assertEquals((-112.11488454305004), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(961.327351998477, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(479, (UnivariateRealFunction) sinc0, (-1205.263), 981.0332309139, allowedSolution0);
      assertEquals((-112.11488454305004), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(961.3273517918566, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), (-1.0));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(810, (UnivariateRealFunction) cbrt0, (-1.0), (double) 810, (double) 810, allowedSolution0);
      assertEquals(810.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(8.437473351215933E-46, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(455, (UnivariateRealFunction) sinc0, (-1205.263), (double) 455, allowedSolution0);
      assertEquals((-375.13149999999996), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-933.05301811617), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(479, (UnivariateRealFunction) sinc0, (-1206.3243828532034), (double) 479, allowedSolution0);
      assertEquals((-363.6621914266017), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1203.2299863248847), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(7.549789948768648E-8, 7.549789948768648E-8, (-1.0));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(846, (UnivariateRealFunction) cbrt0, (-1.0), 138.74449475027, (double) 846, allowedSolution0);
      assertEquals(846.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-2.183105034505519E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(7.549789948768648E-8, 7.549789948768648E-8, (-1.0));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(846, (UnivariateRealFunction) cbrt0, (-1.0), 168.433903635585, (double) 846, allowedSolution0);
      assertEquals(846.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(4.120721186895839E-8, double0, 0.01);
  }
}
