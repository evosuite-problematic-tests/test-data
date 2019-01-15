/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jan 06 14:17:54 GMT 2019
 */

package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SimplexOptimizer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"; 
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
    java.lang.System.setProperty("user.dir", "/tmp/run_evosuite.pl_261926_1546783953"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SimplexOptimizer_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer",
      "org.apache.commons.math3.exception.util.ExceptionContextProvider",
      "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer$2",
      "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer$1",
      "org.apache.commons.math3.optim.SimpleValueChecker",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.exception.OutOfRangeException",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.optim.nonlinear.scalar.GoalType",
      "org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback",
      "org.apache.commons.math3.optim.BaseOptimizer",
      "org.apache.commons.math3.optim.InitialGuess",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.MathUnsupportedOperationException",
      "org.apache.commons.math3.util.Incrementor",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.util.Pair",
      "org.apache.commons.math3.optim.AbstractConvergenceChecker",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.exception.ZeroException",
      "org.apache.commons.math3.util.Incrementor$MaxCountExceededCallback",
      "org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.exception.MaxCountExceededException",
      "org.apache.commons.math3.optim.PointValuePair",
      "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex",
      "org.apache.commons.math3.exception.TooManyIterationsException",
      "org.apache.commons.math3.optim.BaseMultivariateOptimizer",
      "org.apache.commons.math3.exception.util.Localizable",
      "org.apache.commons.math3.exception.NumberIsTooLargeException",
      "org.apache.commons.math3.optim.OptimizationData",
      "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer",
      "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.optim.ConvergenceChecker",
      "org.apache.commons.math3.exception.NullArgumentException",
      "org.apache.commons.math3.exception.TooManyEvaluationsException",
      "org.apache.commons.math3.analysis.MultivariateFunction",
      "org.apache.commons.math3.optim.MaxEval",
      "org.apache.commons.math3.optim.MaxIter",
      "org.apache.commons.math3.optim.SimpleBounds"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SimplexOptimizer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math3.optim.BaseOptimizer",
      "org.apache.commons.math3.optim.BaseMultivariateOptimizer",
      "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer",
      "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer",
      "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer$1",
      "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer$2",
      "org.apache.commons.math3.optim.nonlinear.scalar.GoalType",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.optim.AbstractConvergenceChecker",
      "org.apache.commons.math3.optim.SimpleValueChecker",
      "org.apache.commons.math3.util.Incrementor",
      "org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback",
      "org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback",
      "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex",
      "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.exception.NullArgumentException",
      "org.apache.commons.math3.optim.SimplePointChecker",
      "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex",
      "org.apache.commons.math3.exception.ZeroException",
      "org.apache.commons.math3.optim.SimpleBounds",
      "org.apache.commons.math3.optim.InitialGuess",
      "org.apache.commons.math3.util.Pair",
      "org.apache.commons.math3.optim.PointValuePair",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.optim.MaxEval",
      "org.apache.commons.math3.optim.MaxIter",
      "org.apache.commons.math3.random.BitsStreamGenerator",
      "org.apache.commons.math3.random.ISAACRandom",
      "org.apache.commons.math3.random.UnitSphereRandomVectorGenerator",
      "org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction",
      "org.apache.commons.math3.exception.NoDataException",
      "org.apache.commons.math3.exception.OutOfRangeException",
      "org.apache.commons.math3.random.MersenneTwister",
      "org.apache.commons.math3.linear.RealVector",
      "org.apache.commons.math3.linear.RealVectorFormat",
      "org.apache.commons.math3.util.CompositeFormat",
      "org.apache.commons.math3.linear.ArrayRealVector",
      "org.apache.commons.math3.util.MathUtils",
      "org.apache.commons.math3.random.AbstractWell",
      "org.apache.commons.math3.random.Well44497a",
      "org.apache.commons.math3.random.RandomAdaptor",
      "org.apache.commons.math3.random.Well512a",
      "org.apache.commons.math3.random.Well44497b",
      "org.apache.commons.math3.random.Well19937c",
      "org.apache.commons.math3.random.JDKRandomGenerator",
      "org.apache.commons.math3.random.Well1024a",
      "org.apache.commons.math3.random.Well19937a",
      "org.apache.commons.math3.exception.MathUnsupportedOperationException",
      "org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction$MicrosphereSurfaceElement",
      "org.apache.commons.math3.util.FastMathLiteralArrays",
      "org.apache.commons.math3.util.FastMath$lnMant",
      "org.apache.commons.math3.util.FastMath$CodyWaite",
      "org.apache.commons.math3.random.SynchronizedRandomGenerator",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.exception.MaxCountExceededException",
      "org.apache.commons.math3.exception.TooManyEvaluationsException"
    );
  }
}
