/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 16:01:44 GMT 2019
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Abs;
import org.apache.commons.math.analysis.function.Asinh;
import org.apache.commons.math.analysis.function.Expm1;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Inverse;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Sin;
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
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      illinoisSolver0.solve(2063, (UnivariateRealFunction) inverse0, (-1612.1506942), (double) 2063, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2521.13, 485.63, 910.473);
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(210, (UnivariateRealFunction) sin0, 910.473, 2521.13, allowedSolution0);
      assertEquals(2521.13, illinoisSolver0.getMax(), 0.01);
      assertEquals(910.473, double0, 0.01);
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
      PegasusSolver pegasusSolver0 = new PegasusSolver((-445.024));
      Sigmoid sigmoid0 = new Sigmoid(1949982224, (-620.0));
      double double0 = pegasusSolver0.solve(1949982224, (UnivariateRealFunction) sigmoid0, (-445.024), 1923.5804082, 1923.5804082);
      assertEquals(1923.5804082, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(14.961366615218537, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0, 1.0, 1.0);
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2146885809, (UnivariateRealFunction) sinh0, (-1005.581), 0.375, allowedSolution0);
      assertEquals((-502.603), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.375, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.226E-8, 1.226E-8);
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = regulaFalsiSolver0.solve(589, (UnivariateRealFunction) expm1_0, (-1340608.4420721468), 1.226E-8, 1.226E-8, allowedSolution0);
      assertEquals(1.226E-8, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-6.19299991655948E-19), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.5295323314814981E-201);
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(241, (UnivariateRealFunction) expm1_0, (-1438.8721539697829), 1.5295323314814981E-201, 1.5295323314814981E-201, allowedSolution0);
      assertEquals(1.5295323314814981E-201, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1.7176007181756082E-160), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0, 1.0, 1.0);
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2095, (UnivariateRealFunction) expm1_0, (-1417.7272436687), 96.13, 0.5, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (2,095) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0, 1.0, 1.0);
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(238, (UnivariateRealFunction) expm1_0, (-1417.7272436687), 336.3631477, 96.13, allowedSolution0);
      assertEquals(96.13, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1417.7272436687003), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-4.889747503083399E12), (-4.889747503083399E12), 1408.7);
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(1612, (UnivariateRealFunction) asinh0, (-921364.356089008), 3931.3, 1408.7, allowedSolution0);
      assertEquals(1408.7, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(962.2252864800198, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(2063, (UnivariateRealFunction) inverse0, (-1612.1506942), 0.5000000000042687, allowedSolution0);
      assertEquals((-805.8253470999979), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.0669342635450261E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(2063, (UnivariateRealFunction) inverse0, (-1612.1506942), 0.3483140167113703, allowedSolution0);
      assertEquals((-805.9011900916444), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1.4463076158406622E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(2063, (UnivariateRealFunction) inverse0, (-1586.1425326116337), 0.5000000000042687, allowedSolution0);
      assertEquals((-792.8212663058147), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-2.0912230223213705E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(2063, (UnivariateRealFunction) inverse0, (-1612.1506942), 0.5000000000042687, allowedSolution0);
      assertEquals((-805.8253470999979), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1.7298127273273402E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(2063, (UnivariateRealFunction) inverse0, (-1612.1506942), 0.5000000000042687, allowedSolution0);
      assertEquals((-805.8253470999979), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.0669342635450261E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(2063, (UnivariateRealFunction) inverse0, (-1612.1506942), 0.5, allowedSolution0);
      assertEquals((-805.8253471), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(4.835098023575744E-7, double0, 0.01);
  }
}