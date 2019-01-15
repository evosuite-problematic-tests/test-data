/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Jan 05 15:48:16 GMT 2019
 */

package org.apache.commons.math.optimization.linear;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SimplexTableau_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math.optimization.linear.SimplexTableau"; 
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
    java.lang.System.setProperty("user.dir", "/tmp/run_evosuite.pl_236084_1546703180"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SimplexTableau_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math.exception.MathIllegalStateException",
      "org.apache.commons.math.linear.BlockFieldMatrix",
      "org.apache.commons.math.exception.NumberIsTooSmallException",
      "org.apache.commons.math.exception.NullArgumentException",
      "org.apache.commons.math.exception.util.ExceptionContext",
      "org.apache.commons.math.optimization.linear.Relationship$1",
      "org.apache.commons.math.util.FastMath",
      "org.apache.commons.math.util.MathUtils",
      "org.apache.commons.math.optimization.linear.Relationship",
      "org.apache.commons.math.linear.MatrixUtils",
      "org.apache.commons.math.exception.NotStrictlyPositiveException",
      "org.apache.commons.math.util.OpenIntToDoubleHashMap",
      "org.apache.commons.math.exception.NotFiniteNumberException",
      "org.apache.commons.math.linear.RealMatrix",
      "org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry",
      "org.apache.commons.math.util.Precision",
      "org.apache.commons.math.linear.MatrixDimensionMismatchException",
      "org.apache.commons.math.linear.RealLinearOperator",
      "org.apache.commons.math.exception.MathIllegalArgumentException",
      "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator",
      "org.apache.commons.math.analysis.FunctionUtils$10",
      "org.apache.commons.math.optimization.linear.LinearObjectiveFunction",
      "org.apache.commons.math.util.CompositeFormat",
      "org.apache.commons.math.linear.AbstractFieldMatrix",
      "org.apache.commons.math.exception.MultiDimensionMismatchException",
      "org.apache.commons.math.linear.RealVector$Entry",
      "org.apache.commons.math.exception.MathParseException",
      "org.apache.commons.math.optimization.linear.LinearConstraint",
      "org.apache.commons.math.linear.SparseRealVector",
      "org.apache.commons.math.exception.DimensionMismatchException",
      "org.apache.commons.math.exception.MathIllegalNumberException",
      "org.apache.commons.math.linear.ArrayRealVector",
      "org.apache.commons.math.analysis.BivariateRealFunction",
      "org.apache.commons.math.analysis.MultivariateFunction",
      "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator",
      "org.apache.commons.math.linear.RealVectorFormat",
      "org.apache.commons.math.analysis.UnivariateFunction",
      "org.apache.commons.math.exception.OutOfRangeException",
      "org.apache.commons.math.linear.AnyMatrix",
      "org.apache.commons.math.linear.RealVector$2",
      "org.apache.commons.math.exception.NumberIsTooLargeException",
      "org.apache.commons.math.exception.NoDataException",
      "org.apache.commons.math.analysis.FunctionUtils",
      "org.apache.commons.math.exception.ZeroException",
      "org.apache.commons.math.linear.Array2DRowRealMatrix",
      "org.apache.commons.math.linear.RealMatrixPreservingVisitor",
      "org.apache.commons.math.optimization.linear.SimplexTableau",
      "org.apache.commons.math.linear.SparseRealMatrix",
      "org.apache.commons.math.linear.FieldMatrixPreservingVisitor",
      "org.apache.commons.math.exception.util.Localizable",
      "org.apache.commons.math.linear.NonSquareMatrixException",
      "org.apache.commons.math.analysis.DifferentiableUnivariateFunction",
      "org.apache.commons.math.linear.AbstractRealMatrix",
      "org.apache.commons.math.optimization.RealPointValuePair",
      "org.apache.commons.math.linear.FieldVector",
      "org.apache.commons.math.exception.MathArithmeticException",
      "org.apache.commons.math.linear.Array2DRowFieldMatrix",
      "org.apache.commons.math.linear.OpenMapRealVector",
      "org.apache.commons.math.linear.BlockRealMatrix",
      "org.apache.commons.math.exception.util.LocalizedFormats",
      "org.apache.commons.math.linear.RealVector",
      "org.apache.commons.math.analysis.function.Multiply",
      "org.apache.commons.math.linear.RealMatrixChangingVisitor",
      "org.apache.commons.math.linear.FieldMatrix",
      "org.apache.commons.math.exception.util.ExceptionContextProvider",
      "org.apache.commons.math.linear.OpenMapRealMatrix",
      "org.apache.commons.math.optimization.GoalType",
      "org.apache.commons.math.exception.util.ArgUtils"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SimplexTableau_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.optimization.linear.SimplexTableau",
      "org.apache.commons.math.optimization.linear.Relationship",
      "org.apache.commons.math.optimization.GoalType",
      "org.apache.commons.math.linear.RealVector",
      "org.apache.commons.math.linear.RealVectorFormat",
      "org.apache.commons.math.util.CompositeFormat",
      "org.apache.commons.math.linear.ArrayRealVector",
      "org.apache.commons.math.optimization.linear.LinearObjectiveFunction",
      "org.apache.commons.math.linear.RealLinearOperator",
      "org.apache.commons.math.linear.AbstractRealMatrix",
      "org.apache.commons.math.linear.Array2DRowRealMatrix",
      "org.apache.commons.math.linear.MatrixUtils",
      "org.apache.commons.math.linear.SparseRealVector",
      "org.apache.commons.math.linear.OpenMapRealVector",
      "org.apache.commons.math.util.OpenIntToDoubleHashMap",
      "org.apache.commons.math.util.FastMath",
      "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator",
      "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator",
      "org.apache.commons.math.linear.RealVector$Entry",
      "org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry",
      "org.apache.commons.math.analysis.function.Multiply",
      "org.apache.commons.math.analysis.FunctionUtils",
      "org.apache.commons.math.analysis.FunctionUtils$10",
      "org.apache.commons.math.linear.RealVector$1",
      "org.apache.commons.math.util.Precision",
      "org.apache.commons.math.exception.MathIllegalArgumentException",
      "org.apache.commons.math.exception.MathIllegalNumberException",
      "org.apache.commons.math.exception.OutOfRangeException",
      "org.apache.commons.math.exception.util.LocalizedFormats",
      "org.apache.commons.math.exception.util.ExceptionContext",
      "org.apache.commons.math.exception.util.ArgUtils",
      "org.apache.commons.math.exception.DimensionMismatchException",
      "org.apache.commons.math.optimization.RealPointValuePair",
      "org.apache.commons.math.exception.NullArgumentException",
      "org.apache.commons.math.optimization.linear.LinearConstraint",
      "org.apache.commons.math.exception.NumberIsTooLargeException",
      "org.apache.commons.math.exception.NumberIsTooSmallException",
      "org.apache.commons.math.exception.NotStrictlyPositiveException",
      "org.apache.commons.math.linear.RealVector$2",
      "org.apache.commons.math.optimization.linear.Relationship$1",
      "org.apache.commons.math.exception.MathArithmeticException",
      "org.apache.commons.math.exception.MathUnsupportedOperationException",
      "org.apache.commons.math.analysis.function.Divide",
      "org.apache.commons.math.analysis.function.Log",
      "org.apache.commons.math.util.FastMathLiteralArrays",
      "org.apache.commons.math.util.FastMath$lnMant",
      "org.apache.commons.math.analysis.function.Sinc",
      "org.apache.commons.math.analysis.function.Gaussian",
      "org.apache.commons.math.analysis.function.Acosh",
      "org.apache.commons.math.linear.OpenMapRealMatrix",
      "org.apache.commons.math.util.MathUtils",
      "org.apache.commons.math.analysis.function.Tan",
      "org.apache.commons.math.analysis.function.Tan$1",
      "org.apache.commons.math.analysis.function.Acosh$1",
      "org.apache.commons.math.analysis.function.Power",
      "org.apache.commons.math.analysis.function.Power$1",
      "org.apache.commons.math.analysis.function.Atan",
      "org.apache.commons.math.analysis.function.Atan$1",
      "org.apache.commons.math.analysis.function.Floor",
      "org.apache.commons.math.linear.RealVector$SparseEntryIterator",
      "org.apache.commons.math.analysis.function.Acos",
      "org.apache.commons.math.analysis.function.Acos$1",
      "org.apache.commons.math.analysis.function.Cos",
      "org.apache.commons.math.analysis.function.Cos$1",
      "org.apache.commons.math.linear.BlockRealMatrix",
      "org.apache.commons.math.analysis.function.Log1p",
      "org.apache.commons.math.analysis.function.Log1p$1",
      "org.apache.commons.math.analysis.function.Logit",
      "org.apache.commons.math.analysis.function.Sqrt",
      "org.apache.commons.math.analysis.function.Sqrt$1",
      "org.apache.commons.math.analysis.function.Log$1",
      "org.apache.commons.math.analysis.function.Asinh",
      "org.apache.commons.math.analysis.function.Minus",
      "org.apache.commons.math.util.FastMath$ExpIntTable",
      "org.apache.commons.math.util.FastMath$ExpFracTable",
      "org.apache.commons.math.analysis.function.Constant",
      "org.apache.commons.math.analysis.polynomials.PolynomialFunction",
      "org.apache.commons.math.analysis.function.Cbrt",
      "org.apache.commons.math.analysis.function.Exp",
      "org.apache.commons.math.analysis.function.Exp$1",
      "org.apache.commons.math.analysis.function.Sinh",
      "org.apache.commons.math.linear.RealVector$2$2",
      "org.apache.commons.math.linear.RealVector$2$UnmodifiableEntry",
      "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction",
      "org.apache.commons.math.analysis.function.Signum",
      "org.apache.commons.math.analysis.function.Asin",
      "org.apache.commons.math.analysis.function.Ulp",
      "org.apache.commons.math.analysis.function.Expm1",
      "org.apache.commons.math.analysis.function.Expm1$1",
      "org.apache.commons.math.analysis.function.Cbrt$1",
      "org.apache.commons.math.analysis.function.HarmonicOscillator",
      "org.apache.commons.math.analysis.function.HarmonicOscillator$1",
      "org.apache.commons.math.analysis.function.Tanh",
      "org.apache.commons.math.analysis.function.Tanh$1",
      "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm",
      "org.apache.commons.math.util.MathArrays$OrderDirection",
      "org.apache.commons.math.util.MathArrays",
      "org.apache.commons.math.util.MathArrays$2",
      "org.apache.commons.math.util.Pair",
      "org.apache.commons.math.util.MathArrays$1",
      "org.apache.commons.math.exception.NonMonotonicSequenceException",
      "org.apache.commons.math.analysis.function.Cosh",
      "org.apache.commons.math.analysis.function.Sigmoid",
      "org.apache.commons.math.analysis.function.Rint",
      "org.apache.commons.math.analysis.function.Atanh",
      "org.apache.commons.math.analysis.function.StepFunction",
      "org.apache.commons.math.analysis.function.Sin",
      "org.apache.commons.math.exception.NoDataException",
      "org.apache.commons.math.analysis.function.Logit$1",
      "org.apache.commons.math.analysis.function.Inverse",
      "org.apache.commons.math.analysis.function.Inverse$1",
      "org.apache.commons.math.analysis.function.Atanh$1",
      "org.apache.commons.math.analysis.function.Logistic",
      "org.apache.commons.math.analysis.function.Gaussian$1",
      "org.apache.commons.math.analysis.function.Identity",
      "org.apache.commons.math.analysis.function.Sigmoid$1",
      "org.apache.commons.math.analysis.function.Abs",
      "org.apache.commons.math.analysis.function.Log10",
      "org.apache.commons.math.analysis.function.Log10$1",
      "org.apache.commons.math.analysis.function.Asinh$1",
      "org.apache.commons.math.analysis.function.Asin$1",
      "org.apache.commons.math.linear.RealVector$2$1",
      "org.apache.commons.math.analysis.function.Sinc$2",
      "org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm",
      "org.apache.commons.math.analysis.function.Logistic$1"
    );
  }
}
