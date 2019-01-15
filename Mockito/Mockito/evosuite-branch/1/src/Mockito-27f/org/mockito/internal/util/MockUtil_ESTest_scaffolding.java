/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Dec 26 12:09:19 GMT 2018
 */

package org.mockito.internal.util;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class MockUtil_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.mockito.internal.util.MockUtil"; 
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
    java.lang.System.setProperty("user.dir", "/tmp/run_evosuite.pl_203559_1545826049"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MockUtil_ESTest_scaffolding.class.getClassLoader() ,
      "org.mockito.cglib.core.MethodInfo",
      "org.mockito.cglib.proxy.Callback",
      "org.mockito.cglib.proxy.FixedValueGenerator",
      "org.mockito.cglib.proxy.MethodInterceptorGenerator$1",
      "org.mockito.cglib.proxy.InvocationHandlerGenerator",
      "org.mockito.internal.stubbing.InvocationContainer",
      "org.mockito.internal.util.ObjectMethodsGuru",
      "org.mockito.internal.creation.MockSettingsImpl",
      "org.mockito.internal.creation.jmock.ClassImposterizer$ClassWithSuperclassToWorkAroundCglibBug",
      "org.mockito.cglib.core.LocalVariablesSorter",
      "org.mockito.internal.creation.jmock.ClassImposterizer$3",
      "org.mockito.cglib.core.ClassNameReader$1",
      "org.mockito.internal.stubbing.InvocationContainerImpl",
      "org.mockito.cglib.core.ReflectUtils",
      "org.mockito.cglib.proxy.CallbackGenerator",
      "org.mockito.cglib.core.ClassInfo",
      "org.mockito.cglib.proxy.FixedValue",
      "org.mockito.cglib.core.ObjectSwitchCallback",
      "org.mockito.exceptions.misusing.NotAMockException",
      "org.mockito.internal.invocation.realmethod.RealMethod",
      "org.mockito.cglib.core.ClassEmitter$FieldInfo",
      "org.mockito.internal.creation.jmock.ClassImposterizer",
      "org.mockito.internal.creation.cglib.CGLIBHacker",
      "org.mockito.cglib.core.GeneratorStrategy",
      "org.objenesis.ObjenesisStd",
      "org.mockito.internal.progress.MockingProgress",
      "org.mockito.cglib.core.Local",
      "org.mockito.cglib.core.ClassNameReader$EarlyExitException",
      "org.mockito.internal.configuration.GlobalConfiguration",
      "org.objenesis.Objenesis",
      "org.mockito.cglib.proxy.MethodInterceptor",
      "org.mockito.cglib.proxy.CallbackGenerator$Context",
      "org.mockito.asm.Item",
      "org.mockito.asm.FieldVisitor",
      "org.mockito.cglib.core.ClassEmitter",
      "org.objenesis.strategy.InstantiatorStrategy",
      "org.mockito.cglib.core.Transformer",
      "org.mockito.cglib.core.AbstractClassGenerator",
      "org.mockito.exceptions.misusing.MockitoConfigurationException",
      "org.mockito.internal.progress.IOngoingStubbing",
      "org.mockito.internal.invocation.MockitoMethod",
      "org.mockito.internal.InvocationNotifierHandler",
      "org.mockito.cglib.core.CodeEmitter$State",
      "org.mockito.internal.util.ListUtil$Filter",
      "org.mockito.listeners.InvocationListener",
      "org.mockito.cglib.core.KeyFactory$Generator",
      "org.mockito.asm.Type",
      "org.mockito.stubbing.Answer",
      "org.mockito.cglib.core.ClassEmitter$3",
      "org.mockito.internal.exceptions.base.StackTraceFilter",
      "org.mockito.cglib.proxy.Enhancer",
      "org.mockito.invocation.InvocationOnMock",
      "org.mockito.cglib.core.ProcessArrayCallback",
      "org.objenesis.instantiator.ObjectInstantiator",
      "org.mockito.asm.Opcodes",
      "org.objenesis.strategy.StdInstantiatorStrategy",
      "org.mockito.cglib.core.ClassEmitter$1",
      "org.mockito.internal.creation.MethodInterceptorFilter",
      "org.mockito.configuration.IMockitoConfiguration",
      "org.mockito.MockSettings",
      "org.mockito.cglib.core.Predicate",
      "org.mockito.cglib.proxy.ProxyRefDispatcher",
      "org.mockito.cglib.proxy.Factory",
      "org.mockito.cglib.core.EmitUtils$ArrayDelimiters",
      "org.mockito.internal.creation.jmock.ClassImposterizer$1",
      "org.mockito.internal.creation.jmock.ClassImposterizer$2",
      "org.mockito.cglib.proxy.LazyLoaderGenerator",
      "org.mockito.asm.ClassVisitor",
      "org.mockito.cglib.core.CodeGenerationException",
      "org.mockito.cglib.core.CollectionUtils",
      "org.mockito.asm.MethodAdapter",
      "org.mockito.internal.util.MockName",
      "org.mockito.cglib.core.KeyFactory$2",
      "org.objenesis.strategy.BaseInstantiatorStrategy",
      "org.mockito.cglib.core.KeyFactory$1",
      "org.mockito.cglib.core.Customizer",
      "org.mockito.configuration.AnnotationEngine",
      "org.mockito.listeners.MethodInvocationReport",
      "org.mockito.internal.invocation.MatchersBinder",
      "org.mockito.cglib.core.EmitUtils",
      "org.mockito.cglib.core.Constants",
      "org.mockito.cglib.proxy.LazyLoader",
      "org.mockito.configuration.DefaultMockitoConfiguration",
      "org.mockito.stubbing.VoidMethodStubbable",
      "org.mockito.cglib.core.DebuggingClassWriter",
      "org.mockito.cglib.core.NamingPolicy",
      "org.mockito.internal.creation.jmock.SearchingClassLoader",
      "org.mockito.cglib.proxy.NoOp",
      "org.mockito.internal.verification.RegisteredInvocations",
      "org.mockito.cglib.core.LocalVariablesSorter$State",
      "org.mockito.internal.MockHandler",
      "org.mockito.cglib.proxy.InvocationHandler",
      "org.mockito.cglib.core.ReflectUtils$4",
      "org.mockito.cglib.core.ReflectUtils$2",
      "org.mockito.internal.util.MockCreationValidator",
      "org.mockito.cglib.core.ReflectUtils$3",
      "org.mockito.asm.ByteVector",
      "org.mockito.cglib.core.ReflectUtils$1",
      "org.mockito.internal.creation.MockitoMethodProxy",
      "org.mockito.cglib.core.DebuggingClassWriter$1",
      "org.mockito.internal.creation.cglib.MockitoNamingPolicy",
      "org.mockito.cglib.core.AbstractClassGenerator$1",
      "org.mockito.cglib.core.DefaultGeneratorStrategy",
      "org.mockito.cglib.core.ProcessSwitchCallback",
      "org.mockito.cglib.core.ClassNameReader",
      "org.mockito.cglib.core.AbstractClassGenerator$Source",
      "org.mockito.asm.FieldWriter",
      "org.mockito.cglib.proxy.MethodInterceptorGenerator",
      "org.mockito.cglib.proxy.Dispatcher",
      "org.mockito.cglib.core.EmitUtils$ParameterTyper",
      "org.mockito.cglib.core.DefaultNamingPolicy",
      "org.mockito.cglib.core.TypeUtils",
      "org.mockito.cglib.core.CodeEmitter",
      "org.mockito.cglib.proxy.DispatcherGenerator",
      "org.mockito.exceptions.PrintableInvocation",
      "org.mockito.asm.ClassReader",
      "org.mockito.internal.configuration.ClassPathLoader",
      "org.mockito.exceptions.base.MockitoException",
      "org.mockito.internal.verification.api.VerificationData",
      "org.mockito.internal.exceptions.base.ConditionalStackTraceFilter",
      "org.mockito.internal.MockHandlerInterface",
      "org.mockito.internal.progress.ThreadSafeMockingProgress",
      "org.mockito.asm.MethodWriter",
      "org.mockito.asm.Edge",
      "org.mockito.asm.Label",
      "org.mockito.cglib.core.Signature",
      "org.mockito.cglib.proxy.CallbackInfo",
      "org.mockito.cglib.proxy.CallbackFilter",
      "org.mockito.asm.Attribute",
      "org.mockito.internal.MockitoInvocationHandler",
      "org.mockito.cglib.core.EmitUtils$8",
      "org.mockito.asm.AnnotationVisitor",
      "org.mockito.cglib.core.EmitUtils$9",
      "org.mockito.asm.ClassAdapter",
      "org.mockito.cglib.proxy.NoOpGenerator",
      "org.mockito.cglib.core.EmitUtils$7",
      "org.mockito.internal.util.ArrayUtils",
      "org.mockito.internal.util.MockUtil",
      "org.mockito.cglib.proxy.Enhancer$EnhancerKey",
      "org.mockito.cglib.proxy.Enhancer$1",
      "org.objenesis.ObjenesisBase",
      "org.mockito.asm.MethodVisitor",
      "org.mockito.asm.Frame",
      "org.mockito.asm.ClassWriter",
      "org.mockito.cglib.core.KeyFactory",
      "org.mockito.cglib.core.ClassGenerator"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MockUtil_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.mockito.internal.util.MockUtil",
      "org.objenesis.ObjenesisBase",
      "org.objenesis.ObjenesisStd",
      "org.objenesis.strategy.BaseInstantiatorStrategy",
      "org.objenesis.strategy.StdInstantiatorStrategy",
      "org.mockito.cglib.core.DefaultNamingPolicy",
      "org.mockito.internal.creation.cglib.MockitoNamingPolicy",
      "org.mockito.internal.creation.jmock.ClassImposterizer$1",
      "org.mockito.internal.creation.jmock.ClassImposterizer$2",
      "org.mockito.internal.creation.jmock.ClassImposterizer",
      "org.mockito.internal.util.MockCreationValidator",
      "org.mockito.internal.MockHandler",
      "org.mockito.internal.creation.MockSettingsImpl",
      "org.mockito.internal.invocation.MatchersBinder",
      "org.mockito.internal.progress.ThreadSafeMockingProgress",
      "org.mockito.internal.stubbing.InvocationContainerImpl",
      "org.mockito.internal.verification.RegisteredInvocations",
      "org.mockito.internal.util.MockName",
      "org.mockito.internal.InvocationNotifierHandler",
      "org.mockito.internal.creation.MethodInterceptorFilter",
      "org.mockito.internal.creation.cglib.CGLIBHacker",
      "org.mockito.internal.util.ObjectMethodsGuru",
      "org.mockito.cglib.core.AbstractClassGenerator",
      "org.mockito.cglib.proxy.Enhancer$1",
      "org.mockito.cglib.core.AbstractClassGenerator$Source",
      "org.mockito.cglib.core.CollectionUtils",
      "org.mockito.cglib.core.TypeUtils",
      "org.mockito.cglib.core.Signature",
      "org.mockito.asm.Type",
      "org.mockito.cglib.core.KeyFactory$1",
      "org.mockito.cglib.core.KeyFactory$2",
      "org.mockito.cglib.core.KeyFactory",
      "org.mockito.cglib.core.KeyFactory$Generator",
      "org.mockito.cglib.core.DefaultGeneratorStrategy",
      "org.mockito.asm.ClassWriter",
      "org.mockito.cglib.core.DebuggingClassWriter",
      "org.mockito.asm.ByteVector",
      "org.mockito.asm.Item",
      "org.mockito.asm.ClassAdapter",
      "org.mockito.cglib.core.ClassEmitter",
      "org.mockito.cglib.core.ReflectUtils$1",
      "org.mockito.cglib.core.ReflectUtils$2",
      "org.mockito.cglib.core.ReflectUtils",
      "org.mockito.cglib.core.AbstractClassGenerator$1",
      "org.mockito.cglib.core.ClassInfo",
      "org.mockito.cglib.core.ClassEmitter$1",
      "org.mockito.cglib.core.EmitUtils$ArrayDelimiters",
      "org.mockito.cglib.core.EmitUtils",
      "org.mockito.asm.MethodWriter",
      "org.mockito.asm.Label",
      "org.mockito.cglib.core.Constants",
      "org.mockito.asm.MethodAdapter",
      "org.mockito.cglib.core.LocalVariablesSorter",
      "org.mockito.cglib.core.CodeEmitter",
      "org.mockito.cglib.core.LocalVariablesSorter$State",
      "org.mockito.cglib.core.MethodInfo",
      "org.mockito.cglib.core.CodeEmitter$State",
      "org.mockito.asm.Frame",
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
      "org.mockito.cglib.proxy.Enhancer",
      "org.mockito.internal.creation.jmock.ClassImposterizer$3",
      "org.mockito.internal.creation.jmock.SearchingClassLoader",
      "org.mockito.cglib.proxy.NoOpGenerator",
      "org.mockito.cglib.proxy.MethodInterceptorGenerator$1",
      "org.mockito.cglib.proxy.MethodInterceptorGenerator",
      "org.mockito.cglib.proxy.InvocationHandlerGenerator",
      "org.mockito.cglib.proxy.LazyLoaderGenerator",
      "org.mockito.cglib.proxy.DispatcherGenerator",
      "org.mockito.cglib.proxy.FixedValueGenerator",
      "org.mockito.cglib.proxy.CallbackInfo",
      "org.mockito.exceptions.base.MockitoException",
      "org.mockito.exceptions.misusing.NotAMockException",
      "org.mockito.internal.exceptions.base.ConditionalStackTraceFilter",
      "org.mockito.internal.configuration.GlobalConfiguration",
      "org.mockito.configuration.DefaultMockitoConfiguration",
      "org.mockito.internal.configuration.ClassPathLoader",
      "org.mockito.internal.exceptions.base.StackTraceFilter",
      "org.mockito.internal.stubbing.VoidMethodStubbableImpl",
      "org.mockito.exceptions.Reporter",
      "org.mockito.internal.util.StringJoiner",
      "org.mockito.internal.debugging.VerboseMockInvocationLogger",
      "org.mockito.cglib.proxy.MethodProxy",
      "org.mockito.cglib.proxy.MethodProxy$CreateInfo",
      "org.mockito.internal.creation.AbstractMockitoMethodProxy",
      "org.mockito.internal.creation.DelegatingMockitoMethodProxy",
      "org.mockito.stubbing.answers.ReturnsElementsOf",
      "org.mockito.internal.invocation.Invocation",
      "org.mockito.internal.invocation.InvocationMatcher",
      "org.mockito.internal.creation.DelegatingMethod",
      "org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod",
      "org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod",
      "org.mockito.internal.invocation.SerializableMethod",
      "org.mockito.internal.progress.MockingProgressImpl",
      "org.mockito.internal.progress.ArgumentMatcherStorageImpl",
      "org.mockito.internal.creation.SerializableMockitoMethodProxy",
      "org.mockito.internal.util.reflection.Whitebox",
      "org.mockito.internal.stubbing.StubbedInvocationMatcher",
      "org.mockito.cglib.proxy.MethodProxy$FastClassInfo",
      "org.mockito.cglib.reflect.FastClass$Generator",
      "org.mockito.cglib.reflect.FastClassEmitter",
      "org.mockito.cglib.core.VisibilityPredicate",
      "org.mockito.cglib.core.DuplicatesPredicate",
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
      "org.mockito.cglib.core.EmitUtils$15",
      "org.mockito.cglib.core.EmitUtils$16",
      "org.mockito.cglib.core.Block",
      "org.mockito.cglib.reflect.FastClassEmitter$4",
      "org.mockito.cglib.core.ReflectUtils$4",
      "org.mockito.asm.Handler",
      "org.mockito.cglib.reflect.FastClass",
      "org.mockito.internal.util.ArrayUtils",
      "org.mockito.internal.listeners.NotifiedMethodInvocationReport"
    );
  }
}
