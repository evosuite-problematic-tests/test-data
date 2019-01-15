/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 15:41:14 GMT 2019
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Asinh;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Identity;
import org.apache.commons.math.analysis.function.Log;
import org.apache.commons.math.analysis.function.Signum;
import org.apache.commons.math.analysis.function.Sinh;
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
      Log log0 = new Log();
      illinoisSolver0.solve(2053, (UnivariateRealFunction) log0, 1.0, 0.003120712733200042, 0.005891864510038331);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-3004.271), (-3004.271));
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(659, (UnivariateRealFunction) asinh0, (double) 659, 0.0, allowedSolution0);
      assertEquals(659.0, pegasusSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Log log0 = new Log();
      double double0 = illinoisSolver0.solve(2053, (UnivariateRealFunction) log0, 0.005891864510038331, (double) 2053);
      assertEquals(0.005891864510038331, illinoisSolver0.getMin(), 0.01);
      assertEquals(0.9999999952308134, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Identity identity0 = new Identity();
      double double0 = regulaFalsiSolver0.solve(64, (UnivariateRealFunction) identity0, (-1.4875637833957824), 0.6366197723675814, 489.378942849);
      assertEquals(489.378942849, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinh sinh0 = new Sinh();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(210, (UnivariateRealFunction) sinh0, (-369.18643158), 0.5);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (210) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(1.0, 1.0, 1.0);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(687484141, (UnivariateRealFunction) harmonicOscillator0, 1.0E-6, 1.0, 1.0, allowedSolution0);
      assertEquals(1.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.0, 1.0, 1.0);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(1.0, 1.0, 1.0);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(687484141, (UnivariateRealFunction) harmonicOscillator0, 1.0E-6, 1.0, 1.0, allowedSolution0);
      assertEquals(1.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.5649044281958954, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(1.0, 1.0, 1.0);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(687484147, (UnivariateRealFunction) harmonicOscillator0, (-1.0), 1.0, 1.0, allowedSolution0);
      assertEquals(1.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.5707963267948967, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(1.0, 1.0, 1.0);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(687484141, (UnivariateRealFunction) harmonicOscillator0, 1.0E-6, 1.0, 1.0, allowedSolution0);
      assertEquals(1.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.5707963267948968, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(1.0, 1.0, 1.0);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(687484141, (UnivariateRealFunction) harmonicOscillator0, 1.0E-6, 1.0, 1.0, allowedSolution0);
      assertEquals(1.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.5707963267948968, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((-0.7804898317985489), (-0.7804898317985489), (-0.7804898317985489));
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(238, (UnivariateRealFunction) harmonicOscillator0, (-22.924883582250118), (-0.7804898317985489), (-22.924883582250118), allowedSolution0);
      assertEquals((-22.924883582250118), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-3.0125775675323823), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(64, (UnivariateRealFunction) signum0, (-738.731370453898), (double) 64, (-738.731370453898), allowedSolution0);
      assertEquals((-738.731370453898), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-6.283794466097072E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1709, (UnivariateRealFunction) signum0, (-738.731370453898), (double) 1709, (-738.731370453898), allowedSolution0);
      assertEquals((-738.731370453898), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(4.7984068292447E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(64, (UnivariateRealFunction) signum0, (-738.731370453898), (double) 64, (-738.731370453898), allowedSolution0);
      assertEquals((-738.731370453898), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-6.283794466097072E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(37, (UnivariateRealFunction) signum0, (-738.73), (double) 37, (-738.73), allowedSolution0);
      assertEquals((-738.73), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-4.7151930716967415E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(64, (UnivariateRealFunction) signum0, (-738.731370453898), (double) 64, (-738.731370453898), allowedSolution0);
      assertEquals((-738.731370453898), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.1922240004602851E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(79, (UnivariateRealFunction) signum0, (-738.731370453898), (double) 79, (-738.731370453898), allowedSolution0);
      assertEquals((-738.731370453898), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-6.31303767869169E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(64, (UnivariateRealFunction) signum0, (-738.731370453898), (double) 64, (-738.731370453898), allowedSolution0);
      assertEquals((-738.731370453898), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.1922240004602851E-7, double0, 0.01);
  }
}
