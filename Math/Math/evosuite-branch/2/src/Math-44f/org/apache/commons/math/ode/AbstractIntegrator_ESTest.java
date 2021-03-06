/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 20:21:48 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
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
import org.apache.commons.math.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math.ode.sampling.FixedStepHandler;
import org.apache.commons.math.ode.sampling.StepHandler;
import org.apache.commons.math.ode.sampling.StepNormalizer;
import org.apache.commons.math.ode.sampling.StepNormalizerBounds;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegrator_ESTest extends AbstractIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0, Double.NaN, 905.6461, Double.NaN);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(eventHandler0).toString();
      graggBulirschStoerIntegrator0.addEventHandler(eventHandler0, 0.0, 1.0, 2197);
      Collection<EventHandler> collection0 = graggBulirschStoerIntegrator0.getEventHandlers();
      assertTrue(collection0.contains(eventHandler0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0, Double.NaN, 905.6461, Double.NaN);
      int int0 = graggBulirschStoerIntegrator0.getEvaluations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      String string0 = dormandPrince54Integrator0.getName();
      assertEquals("Dormand-Prince 5(4)", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-15.0), (-1354.750307), doubleArray0, doubleArray0);
      double double0 = dormandPrince54Integrator0.getCurrentSignedStepsize();
      assertEquals(142.55263801487507, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(0.0);
      double double0 = gillIntegrator0.getCurrentStepStart();
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 0.0, (-1.0));
      Collection<StepHandler> collection0 = dormandPrince853Integrator0.getStepHandlers();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(1.0);
      int int0 = midpointIntegrator0.getMaxEvaluations();
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, int0);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(5, 0.0, Double.NaN, 0.0, 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      try { 
        adamsBashforthIntegrator0.integrate(expandableStatefulODE0, (-2553.605433742345));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix must have at least one column
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0, Double.NaN, 905.6461, Double.NaN);
      Collection<EventHandler> collection0 = graggBulirschStoerIntegrator0.getEventHandlers();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, (-2314.7203345973744), doubleArray0, doubleArray0);
      highamHall54Integrator0.setMaxEvaluations(366);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-907.29), (-907.29), (-1210.53269464349), 693.37);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[3];
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, doubleArray0, (-1733.5), doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3 != 0
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-62.70620189), 0.0, 0.0, 0.0);
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray1 = new double[4];
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-3.7155475428252136E-8), doubleArray0, (-1448.9100942167904), doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 4 != 0
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-338.82));
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      double double0 = eulerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-338.82), doubleArray0, 1.0, doubleArray0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3930.85969666, 3930.85969666, 3930.85969666, 3930.85969666);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-4379.9), 5360.1018, 1490.25465717199, (-4379.9), 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(320.521558625635);
      graggBulirschStoerIntegrator0.addEventHandler(eventHandler0, (-3462.6), 3930.85969666, 4556, (UnivariateRealSolver) illinoisSolver0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(24).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.BOTH;
      StepNormalizer stepNormalizer0 = new StepNormalizer((-3462.6), fixedStepHandler0, stepNormalizerBounds0);
      graggBulirschStoerIntegrator0.addStepHandler(stepNormalizer0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 0.5745911272121454);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3930.85969666, 3930.85969666, 3930.85969666, 3930.85969666);
      EventHandler.Action eventHandler_Action0 = EventHandler.Action.STOP;
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(eventHandler_Action0).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn((-4379.9), 5360.1018, 5360.1018, (-4379.9), 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(320.521558625635);
      graggBulirschStoerIntegrator0.addEventHandler(eventHandler0, (-4379.9), 3930.85969666, 4556, (UnivariateRealSolver) illinoisSolver0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(24).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(0.0);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 5360.1018);
      assertEquals(2163.224254806064, expandableStatefulODE0.getTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3930.85969666, 3930.85969666, 3930.85969666, 3930.85969666);
      EventHandler.Action eventHandler_Action0 = EventHandler.Action.RESET_STATE;
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(eventHandler_Action0).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn((-4379.9), 5360.1018, 5360.1018, (-4379.9), 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(320.521558625635);
      graggBulirschStoerIntegrator0.addEventHandler(eventHandler0, (-4379.9), 3930.85969666, 4556, (UnivariateRealSolver) illinoisSolver0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(24).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(0.0);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 5360.1018);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3930.85969666, 3930.85969666, 3930.85969666, 3930.85969666);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 3930.85969666, doubleArray0, 3930.85969666, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }
}
