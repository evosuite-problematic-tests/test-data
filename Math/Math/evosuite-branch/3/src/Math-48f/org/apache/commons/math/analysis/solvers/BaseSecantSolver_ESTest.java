/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 15:58:45 GMT 2019
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Abs;
import org.apache.commons.math.analysis.function.Expm1;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Inverse;
import org.apache.commons.math.analysis.function.Log;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Sinc;
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
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      illinoisSolver0.solve(2063, (UnivariateRealFunction) inverse0, (-1586.1425326116337), 0.5000000000042687, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 1.0E-6);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-445.024));
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(1.0, 20, (-971.2));
      double double0 = pegasusSolver0.solve(20, (UnivariateRealFunction) harmonicOscillator0, (-445.024), 0.0);
      assertEquals((-222.512), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-178.8127683035613), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0);
      Sigmoid sigmoid0 = new Sigmoid(2268, 0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(2268, (UnivariateRealFunction) sigmoid0, 2444.13, 2444.13, 2444.13, allowedSolution0);
      assertEquals(2444.13, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(2444.13, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(968.98, 968.98, 0.0);
      Abs abs0 = new Abs();
      double double0 = pegasusSolver0.solve(709, (UnivariateRealFunction) abs0, 1391.1, 0.0, 0.0);
      assertEquals(1391.1, pegasusSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-18.491910634495312), (-18.491910634495312), (-18.491910634495312));
      Expm1 expm1_0 = new Expm1();
      double double0 = regulaFalsiSolver0.solve(2095, (UnivariateRealFunction) expm1_0, (-1305.364770849318), 0.24031152249852994);
      assertEquals((-1305.364770849318), regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-18.491910634));
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2095, (UnivariateRealFunction) expm1_0, (-18.491910634), 0.24031152249879337, 1046.39407, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: convergence failed
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-18.49191));
      Expm1 expm1_0 = new Expm1();
      double double0 = regulaFalsiSolver0.solve(2095, (UnivariateRealFunction) expm1_0, (-1316.3936807), 0.24031152249852994);
      assertEquals((-1316.3936807), regulaFalsiSolver0.getMin(), 0.01);
      assertEquals((-4.0430805870027594E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-18.491910634));
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(2095, (UnivariateRealFunction) expm1_0, (-18.491910634), 0.24031152249879337, 1046.39407, allowedSolution0);
      assertEquals((-6.874073445130657E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(2052, (UnivariateRealFunction) sinc0, (-1589.0818635655673), 2471.0, allowedSolution0);
      assertEquals((-1589.0818635655673), illinoisSolver0.getMin(), 0.01);
      assertEquals(2406.4599726497813, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(299, (UnivariateRealFunction) expm1_0, (-36.283654), 2.0611166583832345E-247, (double) 299, allowedSolution0);
      assertEquals(299.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-7.272372702803025E-246), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-18.491910634));
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(2147479797, (UnivariateRealFunction) log0, 0.49999999999999994, 2901.1703, (-18.491910634), allowedSolution0);
      assertEquals((-18.491910634), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-18.491910634));
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(2095, (UnivariateRealFunction) expm1_0, (-18.491910634), 0.24031152249879337, 1046.39407, allowedSolution0);
      assertEquals(1046.39407, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(2063, (UnivariateRealFunction) inverse0, (-1612.1506942), 0.5, allowedSolution0);
      assertEquals(0.5, illinoisSolver0.getMax(), 0.01);
      assertEquals(4.835098023575744E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((-383.889067297186), 1738.6639584053753, 1738.6639584053753);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(139, (UnivariateRealFunction) harmonicOscillator0, (-383.889067297186), 7.549789948768648E-8, allowedSolution0);
      assertEquals(7.549789948768648E-8, illinoisSolver0.getMax(), 0.01);
      assertEquals((-50.714154973234855), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((-383.2893316536017), 1738.6639584053753, 1738.6639584053753);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(139, (UnivariateRealFunction) harmonicOscillator0, (-383.2893316536017), 7.549789948768648E-8, allowedSolution0);
      assertEquals((-191.6446657890519), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-6.3583632243490635), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(2063, (UnivariateRealFunction) inverse0, (-1612.1506942), 0.5000000000042687, allowedSolution0);
      assertEquals((-805.8253470999979), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.0669342635450261E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(2038, (UnivariateRealFunction) inverse0, (-1612.1506942), (double) 2038, allowedSolution0);
      assertEquals(2038.0, illinoisSolver0.getMax(), 0.01);
      assertEquals(3.075892038097016E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.9367223953945027);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((-541.85206241003), 1738.6639584053753, 1738.6639584053753);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(139, (UnivariateRealFunction) harmonicOscillator0, (-541.85206241003), 7.549789948768648E-8, allowedSolution0);
      assertEquals((-270.92603116726605), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-284.7946448407513), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((-383.889067297186), 1738.6639584053753, 1738.6639584053753);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(139, (UnivariateRealFunction) harmonicOscillator0, (-383.889067297186), 7.549789948768648E-8, allowedSolution0);
      assertEquals((-191.94453361084405), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-50.71415497323484), double0, 0.01);
  }
}
