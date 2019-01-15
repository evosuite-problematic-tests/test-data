/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 11:10:49 GMT 2018
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Floor;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.function.Sinc;
import org.apache.commons.math.analysis.function.Sqrt;
import org.apache.commons.math.analysis.function.Tan;
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
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, (-2997.6089417442117));
      Sqrt sqrt0 = new Sqrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      illinoisSolver0.solve(690, (UnivariateRealFunction) sqrt0, 0.0, 0.0, (-2997.6089417442117), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0);
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(1169, (UnivariateRealFunction) sin0, 86.17712906, 0.0, allowedSolution0);
      assertEquals(86.17712906, illinoisSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2070.0);
      Floor floor0 = new Floor();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(2211, (UnivariateRealFunction) floor0, (-1.0), (double) 2211, 2070.0, allowedSolution0);
      assertEquals((-1.0), illinoisSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(61.19114396903, 61.19114396903);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(96, (UnivariateRealFunction) tan0, 61.19114396903, (double) 96, allowedSolution0);
      assertEquals(78.595571984515, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(86.38318006712103, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0);
      Sinc sinc0 = new Sinc();
      double double0 = illinoisSolver0.solve(3169, (UnivariateRealFunction) sinc0, 0.0, 6.271288835710969, (-977.8776811486641));
      assertEquals((-977.8776811486641), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(3.1415926535897944, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2456, (UnivariateRealFunction) sin0, (-2444.089649), (double) 2456, (double) 2456, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: convergence failed
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(61.19114396903, 61.19114396903, 61.19114396903);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(110, (UnivariateRealFunction) tan0, (double) 110, 1024.0, allowedSolution0);
      assertEquals(110.0, pegasusSolver0.getMin(), 0.01);
      assertEquals(110.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(61.19114396903, 61.19114396903, 61.19114396903);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(5, (UnivariateRealFunction) tan0, (-786.0), 0.5, 0.0, allowedSolution0);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-347.9335029024311), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(61.19114396903, 61.19114396903, 61.19114396903);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(5, (UnivariateRealFunction) tan0, (-786.0), 0.5, 0.0, allowedSolution0);
      assertEquals((-786.0), double0, 0.01);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(61.19114396903, 61.19114396903, 61.19114396903);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(5, (UnivariateRealFunction) tan0, (-786.0), 110.0, 61.19114396903, allowedSolution0);
      assertEquals(61.19114396903, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(110.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(61.19114396903, 61.19114396903, 61.19114396903);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(96, (UnivariateRealFunction) tan0, (-8.631820517798573), 1024.0, allowedSolution0);
      assertEquals((-8.631820517798573), pegasusSolver0.getMin(), 0.01);
      assertEquals(882.9864630673479, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(61.19114396903, 61.19114396903, 61.19114396903);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(5, (UnivariateRealFunction) tan0, (-786.0), 882.9864630673479, 0.0, allowedSolution0);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(882.9864630673479, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(61.19114396903, 61.19114396903, 61.19114396903);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(5, (UnivariateRealFunction) tan0, (-786.0), 86.38318006712103, 0.0, allowedSolution0);
      assertEquals((-779.6837401916173), double0, 0.01);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(61.19114396903, 61.19114396903, 61.19114396903);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(5, (UnivariateRealFunction) tan0, (-786.0), 0.5, 0.0, allowedSolution0);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-347.9335029024311), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.7698024612348736);
      Sinc sinc0 = new Sinc();
      double double0 = illinoisSolver0.solve(3169, (UnivariateRealFunction) sinc0, 0.7698024612348736, 6.271288835710969, (-977.8776811486641));
      assertEquals((-977.8776811486641), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(3.0799453600950732, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(61.19114396903, 61.19114396903);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(5, (UnivariateRealFunction) tan0, (-786.0), 0.5, 0.0, allowedSolution0);
      assertEquals((-347.9335029024311), double0, 0.01);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(61.19114396903, 61.19114396903);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(5, (UnivariateRealFunction) tan0, (-786.0), 86.38318006712103, 0.0, allowedSolution0);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-779.6837401916173), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(61.19114396903, 61.19114396903);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(5, (UnivariateRealFunction) tan0, (-786.0), 0.5, 0.0, allowedSolution0);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-347.9335029024311), double0, 0.01);
  }
}