/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 15:39:12 GMT 2019
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Asinh;
import org.apache.commons.math.analysis.function.Log;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Signum;
import org.apache.commons.math.analysis.function.Sinh;
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
      PegasusSolver pegasusSolver0 = new PegasusSolver((-3004.271), (-3004.271));
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.5);
      Sinh sinh0 = new Sinh();
      illinoisSolver0.solve(575, (UnivariateRealFunction) sinh0, 0.0, 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(64, (UnivariateRealFunction) signum0, (-2574.545), (double) 64, allowedSolution0);
      assertEquals(64.0, regulaFalsiSolver0.getMax(), 0.01);
      assertEquals((-3.1306874183470737E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(659, (UnivariateRealFunction) asinh0, (double) 659, 0.0, allowedSolution0);
      assertEquals(329.5, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(4941.4876567);
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = 4941.4876567;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = illinoisSolver0.solve(4, (UnivariateRealFunction) polynomialFunction0, (-4452.0), 0.5);
      assertEquals(0.5, illinoisSolver0.getMax(), 0.01);
      assertEquals(0.4999999936926276, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(9.539E-7, 9.539E-7, 9.539E-7);
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(63403, (UnivariateRealFunction) log0, 0.2514985532502717, 1.0786147748356003, allowedSolution0);
      assertEquals(0.2514985532502717, pegasusSolver0.getMin(), 0.01);
      assertEquals(1.0000000000809333, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(9.5390404651165E-7, 9.5390404651165E-7, 9.5390404651165E-7);
      Log log0 = new Log();
      double double0 = pegasusSolver0.solve(63403, (UnivariateRealFunction) log0, 9.5390404651165E-7, (double) 63403);
      assertEquals(9.5390404651165E-7, pegasusSolver0.getMin(), 0.01);
      assertEquals(1.0000000041126278, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(9.5390404651165E-7, 9.5390404651165E-7, 9.5390404651165E-7);
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(1555074202, (UnivariateRealFunction) log0, 9.548495977944824E-7, (double) 63403, 9.548495977944824E-7, allowedSolution0);
      assertEquals(9.548495977944824E-7, pegasusSolver0.getMin(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(9.903406258325788E-4, 9.903406258325788E-4, 9.903406258325788E-4);
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(63404, (UnivariateRealFunction) log0, 9.548496E-7, (double) 63404, 9.548496E-7, allowedSolution0);
      assertEquals(9.548496E-7, pegasusSolver0.getMin(), 0.01);
      assertEquals(1.0000000041078874, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(9.5390404651165E-7, 9.5390404651165E-7, 9.5390404651165E-7);
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(1555074202, (UnivariateRealFunction) log0, 9.548495977944824E-7, (double) 63403, 9.548495977944824E-7, allowedSolution0);
      assertEquals(9.548495977944824E-7, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.46967298176896427, 0.46967298176896427, 0.46967298176896427);
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(1555074202, (UnivariateRealFunction) log0, 9.548495977944824E-7, (double) 63403, 9.548495977944824E-7, allowedSolution0);
      assertEquals(9.548495977944824E-7, pegasusSolver0.getMin(), 0.01);
      assertEquals(0.6550781856636316, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(9.5390404651165E-7, 9.5390404651165E-7, 9.5390404651165E-7);
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(1555074202, (UnivariateRealFunction) log0, 0.0994829353408909, (double) 63403, 0.0994829353408909, allowedSolution0);
      assertEquals(0.0994829353408909, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.999999967651666, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      regulaFalsiSolver0.solve(64, (UnivariateRealFunction) signum0, (-1.0), 2.408894749979492E-4, 2.408894749979492E-4, allowedSolution0);
      assertEquals(2.408894749979492E-4, regulaFalsiSolver0.getStartValue(), 0.01);
      
      regulaFalsiSolver0.setup(64, signum0, (-418.18184427089915), 1219.190839, 1321.7276034);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(2.1360545309973256E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.94, 0.94, 0.94);
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(27, (UnivariateRealFunction) log0, 0.94, (double) 27, 0.94, allowedSolution0);
      assertEquals(0.94, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.94, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(72, (UnivariateRealFunction) signum0, (-1.0), 2.408894749979492E-4, 2.408894749979492E-4, allowedSolution0);
      assertEquals(5.056552770139053E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(64, (UnivariateRealFunction) signum0, (-1.0), 2.408894749979492E-4, 2.408894749979492E-4, allowedSolution0);
      assertEquals(2.408894749979492E-4, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-4.482487694977428E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(64, (UnivariateRealFunction) signum0, (-1.0), 2.408894749979492E-4, 2.408894749979492E-4, allowedSolution0);
      assertEquals(2.408894749979492E-4, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-4.482487694977428E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(980.019);
      Sigmoid sigmoid0 = new Sigmoid((-1102.26201639611), 1.0E-6);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(158, (UnivariateRealFunction) sigmoid0, 3.7670456583663996, 980.019, 0.031257527796093684, allowedSolution0);
      assertEquals(0.031257527796093684, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(980.0189608067793, double0, 0.01);
  }
}