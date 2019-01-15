/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 15:31:17 GMT 2018
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Cbrt;
import org.apache.commons.math.analysis.function.Ceil;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Sinc;
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
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2687.43208), 2871.087525);
      Ceil ceil0 = new Ceil();
      pegasusSolver0.solve(255, (UnivariateRealFunction) ceil0, (-1564.274657133), 4.096479392501351E-5, 4.096479392501351E-5);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.5830993332061267E-10);
      Sigmoid sigmoid0 = new Sigmoid(0.0, (-1504.079954638813));
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(24, (UnivariateRealFunction) sigmoid0, (-1071.777), 0.0, 1.5830993332061267E-10, allowedSolution0);
      assertEquals(1.5830993332061267E-10, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1071.777), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0, (-2554.74117512), 0.5);
      Gaussian gaussian0 = new Gaussian();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(18, (UnivariateRealFunction) gaussian0, 1.0, (-2554.74117512), allowedSolution0);
      assertEquals(1.0, regulaFalsiSolver0.getMin(), 0.01);
      assertEquals((-2554.74117512), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2687.43208), 2871.087525);
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(255, (UnivariateRealFunction) sinh0, (-1169.6), 2871.087525, (-1169.6), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (255) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      double double0 = regulaFalsiSolver0.solve(5328, (UnivariateRealFunction) sinc0, 3263.61334527, (double) 5328, (double) 5328);
      assertEquals(3263.61334527, regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(5324.999547834699, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(981.0332309139);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(479, (UnivariateRealFunction) sinc0, (-1205.263), 981.0332309139, 981.0332309139, allowedSolution0);
      assertEquals(981.0332309139, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(981.0332309139, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(1803, (UnivariateRealFunction) sinc0, (-1288.741931436198), (double) 1803, allowedSolution0);
      assertEquals(257.1290342819009, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1542.52199290687, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(479, (UnivariateRealFunction) sinc0, (-1205.263), 1005.5517887639071, allowedSolution0);
      assertEquals((-99.85560561804641), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(835.663645854885, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(479, (UnivariateRealFunction) sinc0, (-1205.263), 981.0332309139, allowedSolution0);
      assertEquals((-112.11488454305004), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(961.327351998477, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(479, (UnivariateRealFunction) sinc0, (-1205.263), 1005.5517887639071, allowedSolution0);
      assertEquals((-99.85560561804641), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(835.663645854885, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(479, (UnivariateRealFunction) sinc0, (-1205.263), 981.0332309139, allowedSolution0);
      assertEquals((-112.11488454305004), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(961.3273517918566, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(479, (UnivariateRealFunction) sinc0, (-1205.263), (double) 479, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (479) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(479, (UnivariateRealFunction) sinc0, (-1205.263), 981.0332309139, allowedSolution0);
      assertEquals((-112.11488454305004), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(961.3273517918566, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.3318702237079696));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(846, (UnivariateRealFunction) cbrt0, (-1.3318702237079696), 138.74449475027, (double) 846, allowedSolution0);
      assertEquals(846.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(2.407442809440991E-46, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(7.549789948768648E-8, 7.549789948768648E-8, (-1.0));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = regulaFalsiSolver0.solve(846, (UnivariateRealFunction) cbrt0, (-1.0), 7.549789948768648E-8, (double) 846, allowedSolution0);
      assertEquals(846.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.4356137037979217E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(479, (UnivariateRealFunction) sinc0, (-1205.263), 981.7100978308413, allowedSolution0);
      assertEquals((-111.77645108457932), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-870.2211650443741), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(479, (UnivariateRealFunction) sinc0, (-1183.555366064207), 992.2150513577947, allowedSolution0);
      assertEquals((-95.67015735320615), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(983.3185005736085, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(7.549789948768648E-8, 7.549789948768648E-8, (-1.0));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(840, (UnivariateRealFunction) cbrt0, (-1.0), 138.74449475027, (double) 840, allowedSolution0);
      assertEquals(840.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-2.183105034505519E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(7.549789948768648E-8, 7.549789948768648E-8, (-1.0));
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(846, (UnivariateRealFunction) cbrt0, (-1.0), 138.17068828438912, (double) 846, allowedSolution0);
      assertEquals(846.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.885117213765236E-8, double0, 0.01);
  }
}
