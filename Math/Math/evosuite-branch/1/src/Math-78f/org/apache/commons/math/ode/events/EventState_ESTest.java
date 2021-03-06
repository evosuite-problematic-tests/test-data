/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 16:15:16 GMT 2018
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
      EventState eventState0 = new EventState(eventHandler0, (-790.47340348316), (-790.47340348316), 3007);
      eventState0.getEventHandler();
      assertFalse(eventState0.stop());
      assertEquals(3007, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals((-790.47340348316), eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      EventState eventState0 = new EventState(eventHandler0, (-790.47340348316), (-790.47340348316), 3007);
      int int0 = eventState0.getMaxIterationCount();
      assertEquals(3007, int0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals((-790.47340348316), eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      EventState eventState0 = new EventState(eventHandler0, (-790.47340348316), (-790.47340348316), 3007);
      double double0 = eventState0.getEventTime();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals((-790.47340348316), eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(3007, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, (-3016.126923), 0.0, 1155);
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(0.0, eventState0.getConvergence(), 0.01);
      assertEquals((-3016.126923), double0, 0.01);
      assertEquals(1155, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      EventState eventState0 = new EventState(eventHandler0, (-790.47340348316), (-790.47340348316), 3007);
      double double0 = eventState0.getConvergence();
      assertEquals(3007, eventState0.getMaxIterationCount());
      assertEquals(790.47340348316, double0, 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals((-790.47340348316), eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 1140.69944941, 1100.323, 466);
      double[] doubleArray0 = new double[0];
      eventState0.reinitializeBegin(466, doubleArray0);
      assertEquals(466, eventState0.getMaxIterationCount());
      assertEquals(1140.69944941, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(1100.323, eventState0.getConvergence(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NaN, 1.0, 0.0, 1.0E-14).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-790.47340348316), (-790.47340348316), 3007);
      double[] doubleArray0 = new double[4];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      boolean boolean0 = eventState0.evaluateStep(dummyStepInterpolator0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertTrue(boolean0);
      
      boolean boolean1 = eventState0.evaluateStep(dummyStepInterpolator0);
      assertFalse(eventState0.stop());
      assertEquals((-790.47340348316), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(3007, eventState0.getMaxIterationCount());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn(Double.NaN, 1814.9646828149362, 1814.9646828149362, Double.NaN, 1814.9646828149362).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 1814.9646828149362, 1814.9646828149362, 2995);
      double[] doubleArray0 = new double[4];
      eventState0.reinitializeBegin(2995, doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      eventState0.evaluateStep(dummyStepInterpolator0);
      eventState0.stepAccepted(2995, doubleArray0);
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
      doReturn((-1)).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn(Double.NaN, 1814.9646828149362, 1814.9646828149362, Double.NaN, 1814.9646828149362).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 1814.9646828149362, 1814.9646828149362, 2995);
      double[] doubleArray0 = new double[4];
      eventState0.reinitializeBegin(2995, doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      eventState0.evaluateStep(dummyStepInterpolator0);
      eventState0.stepAccepted(2995, doubleArray0);
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
  public void test09()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1311.34), 1813.96215, 1813.96215, (-1311.34), 1813.96215).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-790.47340348316), (-790.47340348316), 3007);
      double[] doubleArray0 = new double[4];
      eventState0.reinitializeBegin(3007, doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      eventState0.evaluateStep(dummyStepInterpolator0);
      assertEquals(3007.0, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      
      boolean boolean0 = eventState0.reset(2.2250738585072014E-308, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn(Double.NaN, 0.0, 0.0, Double.NaN, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 0.0, 0.0, (-1));
      double[] doubleArray0 = new double[1];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      eventState0.evaluateStep(dummyStepInterpolator0);
      dummyStepInterpolator0.storeTime(0.0);
      eventState0.stepAccepted((-1), doubleArray0);
      boolean boolean0 = eventState0.evaluateStep(dummyStepInterpolator0);
      assertEquals((-0.9999999990686774), dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn(Double.NaN, 0.0, 0.0, Double.NaN, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 0.0, 0.0, (-1));
      double[] doubleArray0 = new double[1];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      eventState0.evaluateStep(dummyStepInterpolator0);
      eventState0.stepAccepted((-1), doubleArray0);
      boolean boolean0 = eventState0.evaluateStep(dummyStepInterpolator0);
      assertEquals((-1.0), dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-341.21912414)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 3786.70479, 3786.70479, 1532);
      double[] doubleArray0 = new double[2];
      eventState0.stepAccepted(2.0, doubleArray0);
      assertEquals(1532, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(3786.70479, eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-2053.51444), Double.NaN, (-1102));
      double[] doubleArray0 = new double[0];
      eventState0.stepAccepted(0.0, doubleArray0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals((-1102), eventState0.getMaxIterationCount());
      assertEquals((-2053.51444), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getConvergence(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      EventState eventState0 = new EventState(eventHandler0, 1814.9646828149362, 1814.9646828149362, 2995);
      boolean boolean0 = eventState0.stop();
      assertEquals(2995, eventState0.getMaxIterationCount());
      assertEquals(1814.9646828149362, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NaN, 1814.9646828149362, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 1814.9646828149362, 1814.9646828149362, (-1));
      double[] doubleArray0 = new double[4];
      eventState0.reinitializeBegin((-1), doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      // Undeclared exception!
      try { 
        eventState0.evaluateStep(dummyStepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [\uFFFD, -1], Values: [1,814.965, 1,814.965]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      EventState eventState0 = new EventState(eventHandler0, 1814.9646828149362, 1814.9646828149362, 2995);
      double[] doubleArray0 = new double[4];
      boolean boolean0 = eventState0.reset((-1), doubleArray0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(2995, eventState0.getMaxIterationCount());
      assertEquals(1814.9646828149362, eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn((-1311.34), 1813.96215, 1813.96215, (-1311.34), 1813.96215).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-790.47340348316), (-790.47340348316), 3007);
      double[] doubleArray0 = new double[4];
      eventState0.reinitializeBegin(3007, doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      eventState0.evaluateStep(dummyStepInterpolator0);
      eventState0.stepAccepted(1312.9644756226053, doubleArray0);
      assertEquals(3007.0, eventState0.getEventTime(), 0.01);
      
      boolean boolean0 = eventState0.reset(2.2250738585072014E-308, doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn((-1311.34), 1813.96215, 1813.96215, (-1311.34), 1813.96215).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-790.47340348316), (-790.47340348316), 3007);
      double[] doubleArray0 = new double[4];
      eventState0.reinitializeBegin(3007, doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      eventState0.evaluateStep(dummyStepInterpolator0);
      eventState0.stepAccepted(1312.9644756226053, doubleArray0);
      assertEquals(3007.0, eventState0.getEventTime(), 0.01);
      
      boolean boolean0 = eventState0.reset(2.2250738585072014E-308, doubleArray0);
      assertTrue(boolean0);
  }
}
