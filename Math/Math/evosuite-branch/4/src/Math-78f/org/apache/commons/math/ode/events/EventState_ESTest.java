/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 16:25:56 GMT 2019
 */

package org.apache.commons.math.ode.events;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.events.EventState;
import org.apache.commons.math.ode.sampling.DummyStepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EventState_ESTest extends EventState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 1598.0, 1598.0, 0);
      eventState0.getEventHandler();
      assertEquals(0, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(1598.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      EventState eventState0 = new EventState(eventHandler0, 0.0, 0.0, 4);
      int int0 = eventState0.getMaxIterationCount();
      assertEquals(0.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 0.0, 0.0, 0);
      double double0 = eventState0.getEventTime();
      assertFalse(eventState0.stop());
      assertEquals(0.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(0, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 0.0, 0.0, 0);
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      EventState eventState0 = new EventState(eventHandler0, 0.0, 0.0, 3);
      double double0 = eventState0.getConvergence();
      assertEquals(0.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(3, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (-654.79356)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 0.0, 0.0, 4);
      double[] doubleArray0 = new double[4];
      eventState0.stepAccepted((-71.641557), doubleArray0);
      eventState0.reinitializeBegin(0.0, doubleArray0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(4, eventState0.getMaxIterationCount());
      assertEquals(0.0, eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (-654.79356), 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 0.0, 0.0, 4);
      double[] doubleArray0 = new double[4];
      eventState0.stepAccepted((-71.641557), doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      eventState0.evaluateStep(dummyStepInterpolator0);
      assertEquals((-71.641557), dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      
      eventState0.reinitializeBegin(0.0, doubleArray0);
      assertEquals(4, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 0.0, 9966, 9966);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      
      double[] doubleArray0 = new double[5];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      boolean boolean0 = eventState0.evaluateStep(dummyStepInterpolator0);
      assertEquals(9966, eventState0.getMaxIterationCount());
      assertEquals(0.0, eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(9966.0, eventState0.getConvergence(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (-653.2285635776378), 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 0.0, 9966, 9966);
      double[] doubleArray0 = new double[5];
      eventState0.stepAccepted((-71.641557), doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      eventState0.stepAccepted((-653.2285635776378), doubleArray0);
      boolean boolean0 = eventState0.evaluateStep(dummyStepInterpolator0);
      assertEquals((-653.2285635776378), dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (-653.2285635776378), 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 0.0, 9966, 9966);
      double[] doubleArray0 = new double[5];
      eventState0.stepAccepted((-71.641557), doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      dummyStepInterpolator0.storeTime(9966);
      // Undeclared exception!
      try { 
        eventState0.evaluateStep(dummyStepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [-71.642, 9,894.358], Values: [-653.229, -653.229]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-691)).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn(0.0, (-654.79356), 0.0, (-144.8), 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 0.0, 0.0, 4);
      double[] doubleArray0 = new double[4];
      eventState0.stepAccepted((-71.641557), doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      boolean boolean0 = eventState0.evaluateStep(dummyStepInterpolator0);
      eventState0.stepAccepted(0.0, doubleArray0);
      boolean boolean1 = eventState0.evaluateStep(dummyStepInterpolator0);
      assertEquals(0.0, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn(0.0, (-654.79356), 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 0.0, 0.0, 4);
      double[] doubleArray0 = new double[5];
      eventState0.stepAccepted((-71.641557), doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      dummyStepInterpolator0.storeTime(2298.7);
      eventState0.evaluateStep(dummyStepInterpolator0);
      eventState0.stepAccepted((-654.79356), doubleArray0);
      boolean boolean0 = eventState0.evaluateStep(dummyStepInterpolator0);
      assertTrue(eventState0.stop());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      EventState eventState0 = new EventState(eventHandler0, 0.0, 0.0, 4);
      boolean boolean0 = eventState0.stop();
      assertFalse(boolean0);
      assertEquals(4, eventState0.getMaxIterationCount());
      assertEquals(0.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn(0.0, (-654.79356), 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 0.0, 0.0, 4);
      double[] doubleArray0 = new double[5];
      eventState0.stepAccepted((-71.641557), doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      eventState0.evaluateStep(dummyStepInterpolator0);
      eventState0.stepAccepted((-654.79356), doubleArray0);
      boolean boolean0 = eventState0.stop();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (-654.79356), 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 0.0, 0.0, 4);
      double[] doubleArray0 = new double[5];
      eventState0.stepAccepted((-71.641557), doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      eventState0.evaluateStep(dummyStepInterpolator0);
      assertEquals((-71.641557), dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      
      boolean boolean0 = eventState0.reset((-1951.767581324), doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      EventState eventState0 = new EventState(eventHandler0, 0.0, 0.0, 4);
      double[] doubleArray0 = new double[4];
      boolean boolean0 = eventState0.reset(1794.43947, doubleArray0);
      assertEquals(4, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(0.0, eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(eventState0.stop());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn((-235.9), 1.0E-15, 1.0E-15, (-559.2740513)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-60.9), (-60.9), (-3));
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      
      double[] doubleArray0 = new double[3];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      eventState0.evaluateStep(dummyStepInterpolator0);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      
      eventState0.stepAccepted((-60.9), doubleArray0);
      boolean boolean0 = eventState0.reset((-1618.02817541), doubleArray0);
      assertTrue(boolean0);
      assertEquals((-3), eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn(0.0, (-654.79356), 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 0.0, 0.0, 4);
      double[] doubleArray0 = new double[5];
      eventState0.stepAccepted((-71.641557), doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      eventState0.evaluateStep(dummyStepInterpolator0);
      assertEquals((-71.641557), dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      
      eventState0.stepAccepted((-654.79356), doubleArray0);
      boolean boolean0 = eventState0.reset((-1951.767581324), doubleArray0);
      assertTrue(boolean0);
  }
}
