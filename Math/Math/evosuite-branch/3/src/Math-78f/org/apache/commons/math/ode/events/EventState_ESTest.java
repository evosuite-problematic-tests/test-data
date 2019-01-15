/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 16:46:04 GMT 2019
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
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(eventHandler0).toString();
      EventState eventState0 = new EventState(eventHandler0, (-0.25), (-0.25), (-2545));
      eventState0.getEventHandler();
      assertFalse(eventState0.stop());
      assertEquals((-0.25), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals((-2545), eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      EventState eventState0 = new EventState(eventHandler0, 0.0, 0.0, 0);
      int int0 = eventState0.getMaxIterationCount();
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(0, int0);
      assertEquals(0.0, eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      EventState eventState0 = new EventState(eventHandler0, (-1.0), (-230.0315843634048), 1);
      double double0 = eventState0.getEventTime();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(230.0315843634048, eventState0.getConvergence(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(1, eventState0.getMaxIterationCount());
      assertEquals((-1.0), eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      EventState eventState0 = new EventState(eventHandler0, (-1614.4), 1322.7623, (-405));
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals((-1614.4), double0, 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals((-405), eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(1322.7623, eventState0.getConvergence(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      EventState eventState0 = new EventState(eventHandler0, (-1.0), (-230.0315843634048), 1);
      double double0 = eventState0.getConvergence();
      assertFalse(eventState0.stop());
      assertEquals(230.0315843634048, double0, 0.01);
      assertEquals(1, eventState0.getMaxIterationCount());
      assertEquals((-1.0), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.25).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1.0), (-230.0315843634048), 1);
      double[] doubleArray0 = new double[2];
      eventState0.reinitializeBegin((-0.25), doubleArray0);
      assertEquals(1, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals((-1.0), eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(230.0315843634048, eventState0.getConvergence(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(17).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn(1.0E-14, (-1985.2), 1.0E-6, 0.0, (-1985.2)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1614.4), 1322.7623, (-405));
      double[] doubleArray0 = new double[5];
      eventState0.stepAccepted((-405), doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      eventState0.reinitializeBegin(0.0, doubleArray0);
      eventState0.evaluateStep(dummyStepInterpolator0);
      eventState0.stepAccepted((-1964.81), doubleArray0);
      // Undeclared exception!
      try { 
        eventState0.evaluateStep(dummyStepInterpolator0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // internal error, please fill a bug report at https://issues.apache.org/jira/browse/MATH
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(264).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn(1.0E-15, 1.0E-15, (-1068.5674894908818), (-1068.5674894908818), 1.0E-15).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1068.5674894908818), (-1068.5674894908818), 264);
      double[] doubleArray0 = new double[14];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      eventState0.evaluateStep(dummyStepInterpolator0);
      eventState0.stepAccepted(264, doubleArray0);
      eventState0.evaluateStep(dummyStepInterpolator0);
      eventState0.stepAccepted((-1068.5674894908818), doubleArray0);
      // Undeclared exception!
      try { 
        eventState0.evaluateStep(dummyStepInterpolator0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // internal error, please fill a bug report at https://issues.apache.org/jira/browse/MATH
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(252).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn(0.0, 0.0, (-1068.5674894908818), (-1068.5674894908818), 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1068.5674894908818), (-1068.5674894908818), 252);
      double[] doubleArray0 = new double[14];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      eventState0.evaluateStep(dummyStepInterpolator0);
      dummyStepInterpolator0.storeTime((-1068.5674894908818));
      eventState0.stepAccepted(252, doubleArray0);
      eventState0.evaluateStep(dummyStepInterpolator0);
      eventState0.stepAccepted((-1068.5674894908818), doubleArray0);
      boolean boolean0 = eventState0.evaluateStep(dummyStepInterpolator0);
      assertEquals((-1068.5674894908818), dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(264).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn(0.0, 0.0, (-1068.5674894908818), (-1068.5674894908818), 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1068.5674894908818), (-1068.5674894908818), 264);
      double[] doubleArray0 = new double[14];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      eventState0.evaluateStep(dummyStepInterpolator0);
      eventState0.stepAccepted(264, doubleArray0);
      eventState0.evaluateStep(dummyStepInterpolator0);
      eventState0.stepAccepted((-1068.5674894908818), doubleArray0);
      boolean boolean0 = eventState0.evaluateStep(dummyStepInterpolator0);
      assertEquals((-1068.5674894908818), dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(1.0E-15, 1.0E-15, (-1068.5674894908818), (-1068.5674894908818), 1.0E-15).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1068.5674894908818), (-1068.5674894908818), 264);
      double[] doubleArray0 = new double[10];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      eventState0.evaluateStep(dummyStepInterpolator0);
      eventState0.stepAccepted(264, doubleArray0);
      eventState0.reinitializeBegin((-1068.5674894908818), doubleArray0);
      eventState0.stepAccepted((-1068.5674894908818), doubleArray0);
      eventState0.evaluateStep(dummyStepInterpolator0);
      boolean boolean0 = eventState0.evaluateStep(dummyStepInterpolator0);
      assertEquals((-1068.5674894908818), dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(1.0E-15, 1.0E-15, (-1068.5674894908818), (-1068.5674894908818), 1.0E-15).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1068.5674894908818), (-1068.5674894908818), 264);
      double[] doubleArray0 = new double[10];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      eventState0.evaluateStep(dummyStepInterpolator0);
      dummyStepInterpolator0.storeTime((-1068.5674894908818));
      eventState0.stepAccepted(264, doubleArray0);
      eventState0.reinitializeBegin((-1068.5674894908818), doubleArray0);
      eventState0.stepAccepted((-1068.5674894908818), doubleArray0);
      eventState0.evaluateStep(dummyStepInterpolator0);
      boolean boolean0 = eventState0.evaluateStep(dummyStepInterpolator0);
      assertEquals(0.0, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(292).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn(1.0E-14, (-1985.2), 1.0E-6, 0.0, (-1985.2)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1614.4), 1322.7623, (-405));
      double[] doubleArray0 = new double[5];
      eventState0.stepAccepted((-405), doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      eventState0.reinitializeBegin(0.0, doubleArray0);
      eventState0.evaluateStep(dummyStepInterpolator0);
      assertEquals(0.0, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      
      eventState0.stepAccepted((-1964.81), doubleArray0);
      assertEquals(1322.7623, eventState0.getConvergence(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      EventState eventState0 = new EventState(eventHandler0, (-1068.5674894908818), (-1068.5674894908818), 264);
      boolean boolean0 = eventState0.stop();
      assertFalse(boolean0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals((-1068.5674894908818), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(264, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn(0.25, 1205.0, (-1070.3073981726354), (-641.827424930416), 0.25).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1.0), (-230.0315843634048), 1);
      double[] doubleArray0 = new double[2];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      eventState0.evaluateStep(dummyStepInterpolator0);
      dummyStepInterpolator0.storeTime(0.0);
      eventState0.stepAccepted(0.0, doubleArray0);
      eventState0.evaluateStep(dummyStepInterpolator0);
      eventState0.stepAccepted(1.0, doubleArray0);
      boolean boolean0 = eventState0.stop();
      assertEquals(230.0315843634048, eventState0.getEventTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(1.0E-15, 1.0E-15, (-1068.5674894908818), (-1068.5674894908818), 1.0E-15).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1068.5674894908818), (-1068.5674894908818), 264);
      double[] doubleArray0 = new double[14];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      eventState0.evaluateStep(dummyStepInterpolator0);
      eventState0.stepAccepted(264, doubleArray0);
      eventState0.evaluateStep(dummyStepInterpolator0);
      assertEquals(264.0, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      
      boolean boolean0 = eventState0.reset(1.0E-15, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      EventState eventState0 = new EventState(eventHandler0, (-1068.5674894908818), (-1068.5674894908818), 264);
      double[] doubleArray0 = new double[10];
      boolean boolean0 = eventState0.reset(1.0E-15, doubleArray0);
      assertFalse(boolean0);
      assertFalse(eventState0.stop());
      assertEquals((-1068.5674894908818), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(264, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn(1.0E-14, (-1985.2), 1.0E-6, 0.0, (-1985.2)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1614.4), 1322.7623, (-405));
      double[] doubleArray0 = new double[5];
      eventState0.stepAccepted((-405), doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      eventState0.evaluateStep(dummyStepInterpolator0);
      eventState0.stepAccepted((-1964.81), doubleArray0);
      assertEquals((-405.0), eventState0.getEventTime(), 0.01);
      
      boolean boolean0 = eventState0.reset((-405), doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn(1.0E-14, (-1985.2076318172826), 1.0E-6, 0.0, (-1985.2076318172826)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1614.4), 1322.7623, 2);
      double[] doubleArray0 = new double[5];
      eventState0.stepAccepted(2, doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      eventState0.evaluateStep(dummyStepInterpolator0);
      eventState0.stepAccepted((-1964.81), doubleArray0);
      assertEquals(2.0, eventState0.getEventTime(), 0.01);
      
      boolean boolean0 = eventState0.reset(2, doubleArray0);
      assertTrue(boolean0);
  }
}
