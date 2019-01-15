/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jan 04 23:08:55 GMT 2019
 */

package org.mockito.exceptions;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Reporter_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.mockito.exceptions.Reporter"; 
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
    java.lang.System.setProperty("user.dir", "/tmp/run_evosuite.pl_144860_1546643223"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Reporter_ESTest_scaffolding.class.getClassLoader() ,
      "org.mockito.exceptions.misusing.UnfinishedStubbingException",
      "org.mockito.internal.invocation.Invocation",
      "org.mockito.configuration.AnnotationEngine",
      "org.mockito.exceptions.misusing.UnfinishedVerificationException",
      "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent",
      "org.mockito.exceptions.verification.NoInteractionsWanted",
      "org.mockito.exceptions.Discrepancy",
      "org.mockito.internal.invocation.CapturesArgumensFromInvocation",
      "org.mockito.exceptions.PrintableInvocation",
      "org.mockito.internal.invocation.InvocationMatcher",
      "org.mockito.internal.stubbing.StubbedInvocationMatcher",
      "org.mockito.exceptions.Reporter",
      "org.mockito.exceptions.verification.VerificationInOrderFailure",
      "org.mockito.internal.exceptions.VerificationAwareInvocation",
      "org.mockito.configuration.DefaultMockitoConfiguration",
      "org.mockito.internal.configuration.ClassPathLoader",
      "org.mockito.exceptions.base.MockitoException",
      "org.mockito.exceptions.misusing.NullInsteadOfMockException",
      "org.mockito.internal.exceptions.base.ConditionalStackTraceFilter",
      "org.mockito.internal.exceptions.base.StackTraceFilter",
      "org.mockito.stubbing.Answer",
      "org.mockito.invocation.InvocationOnMock",
      "org.mockito.exceptions.verification.WantedButNotInvoked",
      "org.mockito.internal.util.StringJoiner",
      "org.mockito.exceptions.misusing.NotAMockException",
      "org.mockito.internal.exceptions.util.ScenarioPrinter",
      "org.mockito.internal.debugging.Location",
      "org.mockito.configuration.IMockitoConfiguration",
      "org.mockito.exceptions.misusing.MissingMethodInvocationException",
      "org.mockito.exceptions.verification.SmartNullPointerException",
      "org.mockito.exceptions.misusing.WrongTypeOfReturnValue",
      "org.mockito.exceptions.verification.TooLittleActualInvocations",
      "org.mockito.internal.configuration.GlobalConfiguration",
      "org.mockito.exceptions.base.MockitoAssertionError",
      "org.mockito.exceptions.verification.TooManyActualInvocations",
      "org.mockito.internal.reporting.PrintingFriendlyInvocation",
      "org.mockito.exceptions.verification.ArgumentsAreDifferent",
      "org.mockito.exceptions.verification.NeverWantedButInvoked",
      "org.mockito.exceptions.misusing.MockitoConfigurationException",
      "org.mockito.exceptions.verification.junit.JUnitTool",
      "org.mockito.exceptions.misusing.InvalidUseOfMatchersException",
      "org.mockito.exceptions.Pluralizer"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Reporter_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.mockito.exceptions.Reporter",
      "org.mockito.exceptions.verification.junit.JUnitTool",
      "org.mockito.exceptions.base.MockitoException",
      "org.mockito.exceptions.misusing.NotAMockException",
      "org.mockito.internal.util.StringJoiner",
      "org.mockito.internal.exceptions.base.ConditionalStackTraceFilter",
      "org.mockito.internal.configuration.GlobalConfiguration",
      "org.mockito.configuration.DefaultMockitoConfiguration",
      "org.mockito.internal.configuration.ClassPathLoader",
      "org.mockito.internal.exceptions.base.StackTraceFilter",
      "org.mockito.exceptions.misusing.InvalidUseOfMatchersException",
      "org.mockito.internal.invocation.InvocationMatcher",
      "org.mockito.internal.invocation.Invocation",
      "org.mockito.internal.debugging.Location",
      "org.mockito.exceptions.misusing.NullInsteadOfMockException",
      "org.mockito.exceptions.misusing.MissingMethodInvocationException",
      "org.mockito.exceptions.verification.SmartNullPointerException",
      "org.mockito.stubbing.answers.ReturnsElementsOf",
      "org.mockito.internal.stubbing.StubbedInvocationMatcher",
      "org.mockito.exceptions.Discrepancy",
      "org.mockito.exceptions.Pluralizer",
      "org.mockito.exceptions.base.MockitoAssertionError",
      "org.mockito.exceptions.verification.VerificationInOrderFailure",
      "org.mockito.exceptions.misusing.WrongTypeOfReturnValue",
      "org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod",
      "org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod",
      "org.mockito.internal.invocation.SerializableMethod",
      "org.mockito.exceptions.misusing.UnfinishedStubbingException",
      "org.mockito.cglib.core.Signature",
      "org.mockito.cglib.proxy.MethodProxy",
      "org.mockito.cglib.core.CollectionUtils",
      "org.mockito.cglib.core.TypeUtils",
      "org.mockito.asm.Type",
      "org.mockito.cglib.core.Constants",
      "org.mockito.cglib.proxy.MethodInterceptorGenerator$1",
      "org.mockito.cglib.proxy.MethodInterceptorGenerator",
      "org.mockito.cglib.proxy.MethodProxy$CreateInfo",
      "org.mockito.cglib.core.AbstractClassGenerator",
      "org.mockito.internal.creation.AbstractMockitoMethodProxy",
      "org.mockito.internal.creation.SerializableMockitoMethodProxy",
      "org.mockito.internal.util.reflection.Whitebox",
      "org.mockito.exceptions.misusing.UnfinishedVerificationException",
      "org.mockito.internal.creation.DelegatingMockitoMethodProxy",
      "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent",
      "org.mockito.cglib.proxy.MethodProxy$FastClassInfo",
      "org.mockito.cglib.core.AbstractClassGenerator$Source",
      "org.mockito.cglib.reflect.FastClass$Generator",
      "org.mockito.cglib.core.DefaultGeneratorStrategy",
      "org.mockito.cglib.core.DefaultNamingPolicy",
      "org.mockito.asm.ClassWriter",
      "org.mockito.cglib.core.DebuggingClassWriter",
      "org.mockito.asm.ByteVector",
      "org.mockito.asm.Item",
      "org.mockito.asm.ClassAdapter",
      "org.mockito.cglib.core.ClassEmitter",
      "org.mockito.cglib.reflect.FastClassEmitter",
      "org.mockito.cglib.core.AbstractClassGenerator$1",
      "org.mockito.cglib.core.ClassInfo",
      "org.mockito.cglib.core.ClassEmitter$1",
      "org.mockito.asm.MethodWriter",
      "org.mockito.asm.Label",
      "org.mockito.asm.MethodAdapter",
      "org.mockito.cglib.core.LocalVariablesSorter",
      "org.mockito.cglib.core.CodeEmitter",
      "org.mockito.cglib.core.LocalVariablesSorter$State",
      "org.mockito.cglib.core.MethodInfo",
      "org.mockito.cglib.core.CodeEmitter$State",
      "org.mockito.asm.Frame",
      "org.mockito.cglib.core.VisibilityPredicate",
      "org.mockito.cglib.core.ReflectUtils$1",
      "org.mockito.cglib.core.ReflectUtils$2",
      "org.mockito.cglib.core.ReflectUtils",
      "org.mockito.cglib.core.DuplicatesPredicate",
      "org.mockito.cglib.core.KeyFactory$1",
      "org.mockito.cglib.core.KeyFactory$2",
      "org.mockito.cglib.core.KeyFactory",
      "org.mockito.cglib.core.KeyFactory$Generator",
      "org.mockito.cglib.core.EmitUtils$ArrayDelimiters",
      "org.mockito.cglib.core.EmitUtils",
      "org.mockito.cglib.core.ClassEmitter$FieldInfo",
      "org.mockito.asm.FieldWriter",
      "org.mockito.asm.Edge",
      "org.mockito.cglib.core.EmitUtils$7",
      "org.mockito.cglib.core.Local",
      "org.mockito.cglib.core.EmitUtils$8",
      "org.mockito.cglib.core.EmitUtils$9",
      "org.mockito.cglib.core.DebuggingClassWriter$1",
      "org.mockito.asm.ClassReader",
      "org.mockito.cglib.core.ClassNameReader$EarlyExitException",
      "org.mockito.cglib.core.ClassNameReader",
      "org.mockito.cglib.core.ClassNameReader$1",
      "org.mockito.cglib.core.MethodWrapper",
      "org.mockito.cglib.reflect.FastClassEmitter$1",
      "org.mockito.cglib.reflect.FastClassEmitter$3",
      "org.mockito.cglib.core.EmitUtils$5",
      "org.mockito.cglib.core.EmitUtils$6",
      "org.mockito.cglib.core.MethodInfoTransformer",
      "org.mockito.cglib.core.ReflectUtils$3",
      "org.mockito.cglib.reflect.FastClassEmitter$GetIndexCallback",
      "org.mockito.cglib.core.EmitUtils$10",
      "org.mockito.cglib.core.EmitUtils$11",
      "org.mockito.cglib.core.EmitUtils$12",
      "org.mockito.cglib.core.EmitUtils$13",
      "org.mockito.cglib.core.EmitUtils$14",
      "org.mockito.cglib.core.Block",
      "org.mockito.cglib.reflect.FastClassEmitter$4",
      "org.mockito.cglib.core.ReflectUtils$4",
      "org.mockito.asm.Handler",
      "org.mockito.cglib.reflect.FastClass",
      "org.mockito.cglib.core.EmitUtils$15",
      "org.mockito.cglib.core.EmitUtils$16",
      "org.mockito.exceptions.verification.WantedButNotInvoked",
      "org.mockito.internal.exceptions.util.ScenarioPrinter",
      "org.mockito.exceptions.verification.NeverWantedButInvoked",
      "org.mockito.internal.reporting.PrintSettings",
      "org.mockito.exceptions.verification.NoInteractionsWanted",
      "org.mockito.exceptions.verification.ArgumentsAreDifferent"
    );
  }
}
