/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 19:24:17 GMT 2019
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import org.apache.commons.math3.analysis.solvers.BisectionSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepNormalizer;
import org.apache.commons.math3.ode.sampling.StepNormalizerBounds;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegrator_ESTest extends AbstractIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3526.0), (-3526.0), doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.getCurrentSignedStepsize();
      assertEquals(3526.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3526.0), (-3526.0), doubleArray0, doubleArray0);
      int int0 = graggBulirschStoerIntegrator0.getEvaluations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-858.1066), (-858.1066), (-858.1066), (-858.1066));
      int int0 = dormandPrince54Integrator0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-1622.005540507595));
      double double0 = eulerIntegrator0.getCurrentStepStart();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.037109375, (-149.72683625798564), doubleArray0, doubleArray0);
      Collection<StepHandler> collection0 = dormandPrince853Integrator0.getStepHandlers();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3526.0), (-3526.0), doubleArray0, doubleArray0);
      String string0 = graggBulirschStoerIntegrator0.getName();
      assertEquals("Gragg-Bulirsch-Stoer", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(5678.89901197789, 5678.89901197789, (-1.0), 5678.89901197789);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(eventHandler0).toString();
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      dormandPrince853Integrator0.addEventHandler(eventHandler0, (-1.0), 5678.89901197789, 0, (UnivariateSolver) bisectionSolver0);
      Collection<EventHandler> collection0 = dormandPrince853Integrator0.getEventHandlers();
      assertTrue(collection0.contains(eventHandler0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1953.073, 1953.073, 0.0, 1953.073);
      dormandPrince853Integrator0.setMaxEvaluations(1586);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1409.2, 1692.1591243942294, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        dormandPrince853Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 1693.1591243942294, doubleArray0, (-4.048086182363988E115), doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 8 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[7];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, doubleArray0, doubleArray1);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        dormandPrince853Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 1311.9, doubleArray0, (-1.0), doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 7 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.3674990248235164, 1409.2, (-322.83), 1409.2);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-1.0));
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 0.0);
      assertEquals(0.0, expandableStatefulODE0.getTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addEventHandler(eventHandler0, 0.0, 0.0, 5);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (double) 5);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      EventHandler.Action eventHandler_Action0 = EventHandler.Action.STOP;
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(eventHandler_Action0).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn((-369.6179846519099), 0.0, (-369.6179846519099), 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addEventHandler(eventHandler0, (double) 6, 0.0, 6);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(6).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-369.6179846519099));
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (double) 6);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-398.24884442), 0.0, (-398.24884442), (-1.0), 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addEventHandler(eventHandler0, 0.0, 0.0, 5);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.BOTH;
      StepNormalizer stepNormalizer0 = new StepNormalizer(0.0, fixedStepHandler0, stepNormalizerBounds0);
      graggBulirschStoerIntegrator0.addStepHandler(stepNormalizer0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (double) 5);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(1, (-22), 778.0, doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        adamsBashforthIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 1.1368683772161603E-10, doubleArray0, 0.0, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math3.ode.MultistepIntegrator$NordsieckInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(911.7229308716737, 1904.0, 911.7229308716737, 911.7229308716737);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 911.7229308716737, doubleArray0, 911.7229308716737, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }
}
