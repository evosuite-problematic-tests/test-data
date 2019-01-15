/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jan 04 19:33:13 GMT 2019
 */

package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AbstractLeastSquaresOptimizer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer"; 
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
    java.lang.System.setProperty("user.dir", "/tmp/run_evosuite.pl_96126_1546630281"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractLeastSquaresOptimizer_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math3.linear.RealVector$2",
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.optim.SimplePointChecker",
      "org.apache.commons.math3.linear.RealVectorFormat",
      "org.apache.commons.math3.linear.FieldVector",
      "org.apache.commons.math3.linear.DefaultRealMatrixPreservingVisitor",
      "org.apache.commons.math3.linear.RealVector",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.exception.MathArithmeticException",
      "org.apache.commons.math3.exception.OutOfRangeException",
      "org.apache.commons.math3.exception.NotPositiveException",
      "org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback",
      "org.apache.commons.math3.linear.FieldMatrix",
      "org.apache.commons.math3.linear.ArrayRealVector",
      "org.apache.commons.math3.linear.AbstractRealMatrix$5",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.MathUnsupportedOperationException",
      "org.apache.commons.math3.linear.RealMatrixFormat",
      "org.apache.commons.math3.exception.ZeroException",
      "org.apache.commons.math3.linear.Array2DRowFieldMatrix",
      "org.apache.commons.math3.optim.nonlinear.vector.ModelFunction",
      "org.apache.commons.math3.exception.ConvergenceException",
      "org.apache.commons.math3.linear.AbstractFieldMatrix",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.optim.BaseMultivariateOptimizer",
      "org.apache.commons.math3.linear.SparseRealMatrix",
      "org.apache.commons.math3.exception.NumberIsTooLargeException",
      "org.apache.commons.math3.optim.OptimizationData",
      "org.apache.commons.math3.optim.nonlinear.vector.Target",
      "org.apache.commons.math3.analysis.BivariateFunction",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.optim.PointVectorValuePair",
      "org.apache.commons.math3.exception.NoDataException",
      "org.apache.commons.math3.linear.EigenDecomposition",
      "org.apache.commons.math3.exception.TooManyEvaluationsException",
      "org.apache.commons.math3.linear.RealMatrix",
      "org.apache.commons.math3.exception.NotFiniteNumberException",
      "org.apache.commons.math3.linear.RealLinearOperator",
      "org.apache.commons.math3.analysis.MultivariateMatrixFunction",
      "org.apache.commons.math3.linear.RealMatrixPreservingVisitor",
      "org.apache.commons.math3.exception.util.ExceptionContextProvider",
      "org.apache.commons.math3.linear.BlockRealMatrix",
      "org.apache.commons.math3.linear.OpenMapRealMatrix",
      "org.apache.commons.math3.linear.BlockFieldMatrix",
      "org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.linear.MatrixDimensionMismatchException",
      "org.apache.commons.math3.linear.FieldMatrixPreservingVisitor",
      "org.apache.commons.math3.linear.DecompositionSolver",
      "org.apache.commons.math3.optim.BaseOptimizer",
      "org.apache.commons.math3.linear.NonSquareMatrixException",
      "org.apache.commons.math3.linear.MatrixUtils",
      "org.apache.commons.math3.exception.MultiDimensionMismatchException",
      "org.apache.commons.math3.linear.NonSymmetricMatrixException",
      "org.apache.commons.math3.util.Incrementor",
      "org.apache.commons.math3.linear.Array2DRowRealMatrix",
      "org.apache.commons.math3.linear.TriDiagonalTransformer",
      "org.apache.commons.math3.util.MathUtils",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.util.Pair",
      "org.apache.commons.math3.optim.AbstractConvergenceChecker",
      "org.apache.commons.math3.util.CompositeFormat",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.linear.AbstractRealMatrix",
      "org.apache.commons.math3.util.Incrementor$MaxCountExceededCallback",
      "org.apache.commons.math3.linear.AnyMatrix",
      "org.apache.commons.math3.exception.MathParseException",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.exception.MaxCountExceededException",
      "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer",
      "org.apache.commons.math3.exception.TooManyIterationsException",
      "org.apache.commons.math3.exception.util.Localizable",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.optim.ConvergenceChecker",
      "org.apache.commons.math3.exception.NullArgumentException",
      "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer",
      "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer",
      "org.apache.commons.math3.linear.DiagonalMatrix",
      "org.apache.commons.math3.linear.RealMatrixChangingVisitor",
      "org.apache.commons.math3.optim.nonlinear.vector.Weight",
      "org.apache.commons.math3.optim.SimpleVectorValueChecker",
      "org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractLeastSquaresOptimizer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math3.optim.BaseOptimizer",
      "org.apache.commons.math3.optim.BaseMultivariateOptimizer",
      "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer",
      "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer",
      "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer",
      "org.apache.commons.math3.optim.AbstractConvergenceChecker",
      "org.apache.commons.math3.optim.SimplePointChecker",
      "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer",
      "org.apache.commons.math3.util.Incrementor",
      "org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback",
      "org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback",
      "org.apache.commons.math3.util.Pair",
      "org.apache.commons.math3.optim.PointVectorValuePair",
      "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer",
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.linear.RealVector",
      "org.apache.commons.math3.linear.RealVectorFormat",
      "org.apache.commons.math3.util.CompositeFormat",
      "org.apache.commons.math3.linear.ArrayRealVector",
      "org.apache.commons.math3.optim.MaxIter",
      "org.apache.commons.math3.optim.SimpleBounds",
      "org.apache.commons.math3.linear.RealLinearOperator",
      "org.apache.commons.math3.linear.RealMatrixFormat",
      "org.apache.commons.math3.linear.AbstractRealMatrix",
      "org.apache.commons.math3.linear.DiagonalMatrix",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.optim.nonlinear.vector.Weight",
      "org.apache.commons.math3.optim.SimpleVectorValueChecker",
      "org.apache.commons.math3.optim.MaxEval",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.exception.NullArgumentException",
      "org.apache.commons.math3.optim.InitialGuess",
      "org.apache.commons.math3.linear.Array2DRowRealMatrix",
      "org.apache.commons.math3.linear.MatrixUtils",
      "org.apache.commons.math3.exception.OutOfRangeException",
      "org.apache.commons.math3.linear.BlockRealMatrix",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.linear.NonSquareMatrixException",
      "org.apache.commons.math3.exception.MultiDimensionMismatchException",
      "org.apache.commons.math3.linear.MatrixDimensionMismatchException",
      "org.apache.commons.math3.util.MathUtils",
      "org.apache.commons.math3.exception.MathUnsupportedOperationException",
      "org.apache.commons.math3.linear.EigenDecomposition",
      "org.apache.commons.math3.linear.TriDiagonalTransformer",
      "org.apache.commons.math3.linear.DefaultRealMatrixPreservingVisitor",
      "org.apache.commons.math3.linear.AbstractRealMatrix$5",
      "org.apache.commons.math3.exception.NoDataException",
      "org.apache.commons.math3.linear.RealVector$2",
      "org.apache.commons.math3.exception.NumberIsTooLargeException",
      "org.apache.commons.math3.linear.SchurTransformer",
      "org.apache.commons.math3.linear.HessenbergTransformer",
      "org.apache.commons.math3.linear.SchurTransformer$ShiftInfo",
      "org.apache.commons.math3.linear.DefaultRealMatrixChangingVisitor",
      "org.apache.commons.math3.exception.NotPositiveException"
    );
  }
}
