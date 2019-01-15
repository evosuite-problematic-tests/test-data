/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jan 06 15:52:19 GMT 2019
 */

package org.apache.commons.math.optimization.fitting;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class GaussianFitter_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math.optimization.fitting.GaussianFitter"; 
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
    java.lang.System.setProperty("user.dir", "/tmp/run_evosuite.pl_17410_1546789828"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(GaussianFitter_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math.optimization.fitting.GaussianFitter$1",
      "org.apache.commons.math.exception.NumberIsTooSmallException",
      "org.apache.commons.math.analysis.MultivariateVectorialFunction",
      "org.apache.commons.math.analysis.function.Gaussian$Parametric",
      "org.apache.commons.math.exception.MathRuntimeException",
      "org.apache.commons.math.exception.NullArgumentException",
      "org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer",
      "org.apache.commons.math.exception.OutOfRangeException",
      "org.apache.commons.math.exception.NotStrictlyPositiveException",
      "org.apache.commons.math.exception.util.MessageFactory",
      "org.apache.commons.math.exception.MathThrowable",
      "org.apache.commons.math.exception.ZeroException",
      "org.apache.commons.math.analysis.MultivariateMatrixFunction",
      "org.apache.commons.math.optimization.BaseOptimizer",
      "org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser$1",
      "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction",
      "org.apache.commons.math.exception.util.Localizable",
      "org.apache.commons.math.exception.MathIllegalArgumentException",
      "org.apache.commons.math.optimization.fitting.WeightedObservedPoint",
      "org.apache.commons.math.optimization.fitting.CurveFitter",
      "org.apache.commons.math.analysis.ParametricUnivariateRealFunction",
      "org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser",
      "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction",
      "org.apache.commons.math.optimization.BaseMultivariateVectorialOptimizer",
      "org.apache.commons.math.optimization.fitting.GaussianFitter",
      "org.apache.commons.math.exception.DimensionMismatchException",
      "org.apache.commons.math.exception.util.LocalizedFormats",
      "org.apache.commons.math.exception.MathIllegalNumberException",
      "org.apache.commons.math.exception.util.ArgUtils"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(GaussianFitter_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.optimization.fitting.CurveFitter",
      "org.apache.commons.math.optimization.fitting.GaussianFitter",
      "org.apache.commons.math.optimization.fitting.GaussianFitter$1",
      "org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser",
      "org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser$1",
      "org.apache.commons.math.optimization.fitting.WeightedObservedPoint",
      "org.apache.commons.math.random.BitsStreamGenerator",
      "org.apache.commons.math.random.AbstractWell",
      "org.apache.commons.math.random.Well19937c",
      "org.apache.commons.math.random.GaussianRandomGenerator",
      "org.apache.commons.math.random.UncorrelatedRandomVectorGenerator",
      "org.apache.commons.math.util.FastMath",
      "org.apache.commons.math.random.UniformRandomGenerator",
      "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer",
      "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer",
      "org.apache.commons.math.exception.MathRuntimeException",
      "org.apache.commons.math.exception.MathIllegalArgumentException",
      "org.apache.commons.math.exception.MathIllegalNumberException",
      "org.apache.commons.math.exception.NumberIsTooSmallException",
      "org.apache.commons.math.exception.util.LocalizedFormats",
      "org.apache.commons.math.exception.util.ArgUtils",
      "org.apache.commons.math.random.MersenneTwister",
      "org.apache.commons.math.random.UnitSphereRandomVectorGenerator",
      "org.apache.commons.math.analysis.function.Gaussian$Parametric",
      "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction",
      "org.apache.commons.math.random.Well19937a",
      "org.apache.commons.math.random.RandomAdaptor",
      "org.apache.commons.math.exception.NotStrictlyPositiveException",
      "org.apache.commons.math.linear.AbstractRealMatrix",
      "org.apache.commons.math.linear.Array2DRowRealMatrix",
      "org.apache.commons.math.exception.DimensionMismatchException",
      "org.apache.commons.math.exception.NullArgumentException",
      "org.apache.commons.math.linear.BlockRealMatrix",
      "org.apache.commons.math.random.Well44497a",
      "org.apache.commons.math.random.CorrelatedRandomVectorGenerator",
      "org.apache.commons.math.exception.OutOfRangeException",
      "org.apache.commons.math.exception.MathIllegalStateException",
      "org.apache.commons.math.random.Well512a",
      "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer$1",
      "org.apache.commons.math.random.Well44497b",
      "org.apache.commons.math.linear.OpenMapRealMatrix",
      "org.apache.commons.math.util.OpenIntToDoubleHashMap",
      "org.apache.commons.math.random.JDKRandomGenerator",
      "org.apache.commons.math.optimization.AbstractConvergenceChecker",
      "org.apache.commons.math.optimization.SimpleVectorialValueChecker",
      "org.apache.commons.math.random.Well1024a",
      "org.apache.commons.math.linear.MatrixUtils",
      "org.apache.commons.math.exception.NoDataException",
      "org.apache.commons.math.analysis.function.HarmonicOscillator$Parametric",
      "org.apache.commons.math.linear.AbstractRealVector",
      "org.apache.commons.math.linear.OpenMapRealVector",
      "org.apache.commons.math.exception.NonPositiveDefiniteMatrixException",
      "org.apache.commons.math.optimization.SimpleVectorialPointChecker",
      "org.apache.commons.math.optimization.VectorialPointValuePair",
      "org.apache.commons.math.linear.DefaultRealMatrixPreservingVisitor",
      "org.apache.commons.math.linear.RealVectorFormat",
      "org.apache.commons.math.util.CompositeFormat",
      "org.apache.commons.math.linear.ArrayRealVector",
      "org.apache.commons.math.linear.AbstractRealMatrix$2",
      "org.apache.commons.math.exception.ZeroException"
    );
  }
}
