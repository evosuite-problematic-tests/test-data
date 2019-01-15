/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 15:20:28 GMT 2018
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.apache.commons.math.analysis.solvers.UnivariateRealSolver;
import org.apache.commons.math.ode.ExpandableStatefulODE;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator;
import org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math.ode.nonstiff.GillIntegrator;
import org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math.ode.nonstiff.ThreeEighthesIntegrator;
import org.apache.commons.math.ode.sampling.DummyStepHandler;
import org.apache.commons.math.ode.sampling.StepHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegrator_ESTest extends AbstractIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(457.0, (-3200.7792951), 5224.6559961, 5224.6559961);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(eventHandler0).toString();
      dormandPrince853Integrator0.addEventHandler(eventHandler0, 1.0, 135.67062, 0);
      Collection<EventHandler> collection0 = dormandPrince853Integrator0.getEventHandlers();
      assertTrue(collection0.contains(eventHandler0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(3414.0, 3414.0, 3414.0, 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      double double0 = dormandPrince853Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 3414.0, doubleArray0, 0.0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0E-6, 0.0, 0.0, 0.0);
      int int0 = graggBulirschStoerIntegrator0.getEvaluations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(3414.0, 3414.0, 3414.0, 0.0);
      String string0 = dormandPrince853Integrator0.getName();
      assertEquals("Dormand-Prince 8 (5, 3)", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator((-1200.221671717));
      double double0 = threeEighthesIntegrator0.getCurrentSignedStepsize();
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(1000.0);
      double double0 = gillIntegrator0.getCurrentStepStart();
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(3414.0, 3414.0, 3414.0, 0.0);
      Collection<StepHandler> collection0 = dormandPrince853Integrator0.getStepHandlers();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(3414.0, 3414.0, 3414.0, 0.0);
      int int0 = dormandPrince853Integrator0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(4, 4, 0.0, 0.0, (-1.0));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      try { 
        adamsBashforthIntegrator0.integrate(expandableStatefulODE0, 5388.96);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix must have at least one column
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1145.8), 1000.0, (-1145.8), 1000.0);
      Collection<EventHandler> collection0 = graggBulirschStoerIntegrator0.getEventHandlers();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, Integer.MAX_VALUE, 1355.7057767, 0.0);
      graggBulirschStoerIntegrator0.setMaxEvaluations(Integer.MAX_VALUE);
      assertEquals(2.147483647E9, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(834.86466566188);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[2];
      try { 
        eulerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, doubleArray0, 0.0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 0
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-204.648188), 21.230051448181193, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray1 = new double[0];
      try { 
        dormandPrince54Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 21.230051448181193, doubleArray1, 21.230051448181193, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3 != 0
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1145.8), (-659.6683763775217), (-1145.8), (-1808.7954750939384));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1145.8), (-1145.8), (-1145.8), 1000.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      BrentSolver brentSolver0 = new BrentSolver((-659.6683763775217));
      graggBulirschStoerIntegrator0.addEventHandler(eventHandler0, 999.9, (double) 8, 706, (UnivariateRealSolver) brentSolver0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.addStepHandler(dummyStepHandler0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-1.0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1145.8), 1000.0, (-1145.8), 1000.0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1145.8), (-1145.8), 7373.146279168, 1000.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      BrentSolver brentSolver0 = new BrentSolver(1000.0);
      graggBulirschStoerIntegrator0.addEventHandler(eventHandler0, 999.9, (double) Integer.MAX_VALUE, 706, (UnivariateRealSolver) brentSolver0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-2417.513));
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-1.0));
      assertEquals(1145.8, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(897.6065000811625);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      try { 
        midpointIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 897.6065000811625, doubleArray0, 897.6065000811625, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }
}