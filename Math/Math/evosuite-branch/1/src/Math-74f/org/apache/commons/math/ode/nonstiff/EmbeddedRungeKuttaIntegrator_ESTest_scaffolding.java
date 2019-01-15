/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Dec 24 16:06:15 GMT 2018
 */

package org.apache.commons.math.ode.nonstiff;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class EmbeddedRungeKuttaIntegrator_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/tmp/run_evosuite.pl_57761_1545667444"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(EmbeddedRungeKuttaIntegrator_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math.ode.DerivativeException",
      "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator",
      "org.apache.commons.math.ode.nonstiff.HighamHall54Integrator",
      "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator",
      "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator",
      "org.apache.commons.math.ode.events.CombinedEventsManager",
      "org.apache.commons.math.ode.FirstOrderIntegrator",
      "org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.ode.sampling.StepHandler",
      "org.apache.commons.math.ConvergenceException",
      "org.apache.commons.math.MaxEvaluationsExceededException",
      "org.apache.commons.math.ode.AbstractIntegrator",
      "org.apache.commons.math.analysis.UnivariateRealFunction",
      "org.apache.commons.math.ode.sampling.DummyStepInterpolator",
      "org.apache.commons.math.ode.events.EventException",
      "org.apache.commons.math.ode.events.EventHandler",
      "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator",
      "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator",
      "org.apache.commons.math.ode.sampling.AbstractStepInterpolator",
      "org.apache.commons.math.ode.events.EventState",
      "org.apache.commons.math.ode.FirstOrderConverter",
      "org.apache.commons.math.ode.nonstiff.DormandPrince54StepInterpolator",
      "org.apache.commons.math.ode.ODEIntegrator",
      "org.apache.commons.math.FunctionEvaluationException",
      "org.apache.commons.math.ode.nonstiff.HighamHall54StepInterpolator",
      "org.apache.commons.math.ode.sampling.StepInterpolator",
      "org.apache.commons.math.ode.IntegratorException",
      "org.apache.commons.math.ode.FirstOrderDifferentialEquations",
      "org.apache.commons.math.ode.SecondOrderDifferentialEquations",
      "org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.commons.math.ode.SecondOrderDifferentialEquations", false, EmbeddedRungeKuttaIntegrator_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.commons.math.ode.events.EventHandler", false, EmbeddedRungeKuttaIntegrator_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(EmbeddedRungeKuttaIntegrator_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.ode.AbstractIntegrator",
      "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator",
      "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator",
      "org.apache.commons.math.ode.nonstiff.HighamHall54Integrator",
      "org.apache.commons.math.ode.sampling.AbstractStepInterpolator",
      "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator",
      "org.apache.commons.math.ode.nonstiff.HighamHall54StepInterpolator",
      "org.apache.commons.math.ode.events.CombinedEventsManager",
      "org.apache.commons.math.ode.FirstOrderConverter",
      "org.apache.commons.math.ode.sampling.DummyStepHandler",
      "org.apache.commons.math.ode.sampling.DummyStepHandler$LazyHolder",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.ode.IntegratorException",
      "org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator",
      "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator",
      "org.apache.commons.math.ode.events.EventState",
      "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator",
      "org.apache.commons.math.ode.nonstiff.DormandPrince54StepInterpolator",
      "org.apache.commons.math.ode.sampling.StepNormalizer",
      "org.apache.commons.math.ode.nonstiff.EulerStepInterpolator",
      "org.apache.commons.math.ode.sampling.DummyStepInterpolator",
      "org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker",
      "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator",
      "org.apache.commons.math.ode.nonstiff.ThreeEighthesStepInterpolator",
      "org.apache.commons.math.ode.DerivativeException",
      "org.apache.commons.math.ConvergenceException",
      "org.apache.commons.math.MaxEvaluationsExceededException"
    );
  }
}
