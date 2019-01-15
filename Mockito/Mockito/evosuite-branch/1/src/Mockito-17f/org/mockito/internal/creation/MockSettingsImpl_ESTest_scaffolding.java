/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Dec 24 17:39:45 GMT 2018
 */

package org.mockito.internal.creation;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class MockSettingsImpl_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.mockito.internal.creation.MockSettingsImpl"; 
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
    java.lang.System.setProperty("user.dir", "/tmp/run_evosuite.pl_79282_1545673103"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MockSettingsImpl_ESTest_scaffolding.class.getClassLoader() ,
      "org.mockito.exceptions.misusing.UnfinishedStubbingException",
      "org.mockito.configuration.AnnotationEngine",
      "org.mockito.exceptions.misusing.UnfinishedVerificationException",
      "org.mockito.exceptions.verification.NoInteractionsWanted",
      "org.mockito.internal.creation.MockSettingsImpl",
      "org.mockito.exceptions.Reporter",
      "org.mockito.exceptions.verification.VerificationInOrderFailure",
      "org.mockito.configuration.DefaultMockitoConfiguration",
      "org.mockito.internal.configuration.ClassPathLoader",
      "org.mockito.exceptions.base.MockitoException",
      "org.mockito.exceptions.misusing.NullInsteadOfMockException",
      "org.mockito.internal.exceptions.base.ConditionalStackTraceFilter",
      "org.mockito.stubbing.Answer",
      "org.mockito.internal.exceptions.base.StackTraceFilter",
      "org.mockito.invocation.InvocationOnMock",
      "org.mockito.exceptions.verification.WantedButNotInvoked",
      "org.mockito.internal.util.StringJoiner",
      "org.mockito.stubbing.ClonesArguments",
      "org.mockito.exceptions.misusing.NotAMockException",
      "org.mockito.configuration.IMockitoConfiguration",
      "org.mockito.exceptions.misusing.MissingMethodInvocationException",
      "org.mockito.exceptions.verification.SmartNullPointerException",
      "org.mockito.exceptions.misusing.WrongTypeOfReturnValue",
      "org.mockito.exceptions.verification.TooLittleActualInvocations",
      "org.mockito.MockSettings",
      "org.mockito.internal.configuration.GlobalConfiguration",
      "org.mockito.exceptions.base.MockitoAssertionError",
      "org.mockito.exceptions.verification.TooManyActualInvocations",
      "org.mockito.exceptions.verification.ArgumentsAreDifferent",
      "org.mockito.exceptions.verification.NeverWantedButInvoked",
      "org.mockito.internal.util.MockName",
      "org.mockito.exceptions.misusing.MockitoConfigurationException",
      "org.mockito.exceptions.misusing.InvalidUseOfMatchersException"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MockSettingsImpl_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.mockito.internal.creation.MockSettingsImpl",
      "org.mockito.exceptions.Reporter",
      "org.mockito.exceptions.base.MockitoException",
      "org.mockito.internal.util.StringJoiner",
      "org.mockito.internal.exceptions.base.ConditionalStackTraceFilter",
      "org.mockito.internal.configuration.GlobalConfiguration",
      "org.mockito.configuration.DefaultMockitoConfiguration",
      "org.mockito.internal.configuration.ClassPathLoader",
      "org.mockito.internal.exceptions.base.StackTraceFilter",
      "org.mockito.internal.util.MockName",
      "org.mockito.internal.invocation.InvocationMatcher",
      "org.mockito.stubbing.ClonesArguments",
      "org.mockito.internal.invocation.Invocation",
      "org.mockito.internal.invocation.SerializableMethod",
      "org.mockito.internal.stubbing.StubbedInvocationMatcher",
      "org.mockito.internal.creation.AbstractMockitoMethodProxy",
      "org.mockito.internal.creation.DelegatingMockitoMethodProxy",
      "org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod",
      "org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod",
      "org.mockito.cglib.proxy.MethodProxy",
      "org.mockito.cglib.core.Signature",
      "org.mockito.cglib.proxy.MethodProxy$CreateInfo",
      "org.mockito.cglib.core.AbstractClassGenerator",
      "org.mockito.internal.creation.SerializableMockitoMethodProxy",
      "org.mockito.internal.util.reflection.Whitebox",
      "org.mockito.internal.reporting.PrintSettings",
      "org.mockito.cglib.core.CollectionUtils",
      "org.mockito.cglib.core.TypeUtils",
      "org.mockito.asm.Type",
      "org.mockito.cglib.core.Constants",
      "org.mockito.cglib.proxy.MethodInterceptorGenerator$1",
      "org.mockito.cglib.proxy.MethodInterceptorGenerator"
    );
  }
}
