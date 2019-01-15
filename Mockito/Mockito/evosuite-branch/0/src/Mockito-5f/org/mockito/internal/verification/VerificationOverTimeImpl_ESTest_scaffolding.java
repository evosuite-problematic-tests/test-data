/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Dec 18 09:47:00 GMT 2018
 */

package org.mockito.internal.verification;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class VerificationOverTimeImpl_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.mockito.internal.verification.VerificationOverTimeImpl"; 
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
    java.lang.System.setProperty("user.dir", "/tmp/run_evosuite.pl_3503_1545126271"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(VerificationOverTimeImpl_ESTest_scaffolding.class.getClassLoader() ,
      "org.mockito.internal.util.collections.ListUtil",
      "org.mockito.invocation.Invocation",
      "org.mockito.mock.MockCreationSettings",
      "org.mockito.internal.stubbing.InvocationContainer",
      "org.mockito.internal.invocation.CapturesArgumensFromInvocation",
      "org.mockito.mock.SerializableMode",
      "org.mockito.mock.MockName",
      "org.mockito.exceptions.PrintableInvocation",
      "org.mockito.internal.invocation.InvocationMatcher",
      "org.mockito.internal.verification.api.VerificationDataInOrder",
      "org.mockito.listeners.InvocationListener",
      "org.mockito.internal.stubbing.StubbedInvocationMatcher",
      "org.mockito.internal.creation.MockSettingsImpl",
      "org.mockito.verification.VerificationWrapper",
      "org.mockito.invocation.DescribedInvocation",
      "org.mockito.verification.VerificationAfterDelay",
      "org.mockito.exceptions.base.MockitoException",
      "org.mockito.internal.verification.VerificationDataImpl",
      "org.mockito.internal.verification.api.VerificationData",
      "org.mockito.internal.stubbing.InvocationContainerImpl",
      "org.mockito.stubbing.Answer",
      "org.mockito.invocation.InvocationOnMock",
      "org.mockito.internal.verification.NoMoreInteractions",
      "org.mockito.internal.invocation.InvocationsFinder",
      "org.mockito.internal.verification.RegisteredInvocations",
      "org.mockito.internal.verification.DefaultRegisteredInvocations",
      "org.mockito.internal.progress.MockingProgress",
      "org.mockito.MockSettings",
      "org.mockito.invocation.StubInfo",
      "org.mockito.exceptions.base.MockitoAssertionError",
      "org.mockito.internal.verification.AtMost",
      "org.mockito.verification.VerificationMode",
      "org.mockito.internal.verification.VerificationOverTimeImpl",
      "org.mockito.verification.After",
      "org.mockito.internal.invocation.InvocationMarker",
      "org.mockito.internal.util.collections.ListUtil$Filter",
      "org.mockito.internal.util.Timer",
      "org.mockito.internal.verification.api.VerificationInOrderMode",
      "org.mockito.internal.verification.DefaultRegisteredInvocations$1",
      "org.mockito.internal.verification.DefaultRegisteredInvocations$RemoveToString",
      "org.mockito.internal.creation.settings.CreationSettings",
      "org.mockito.internal.verification.SingleRegisteredInvocation"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(VerificationOverTimeImpl_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.mockito.internal.verification.VerificationOverTimeImpl",
      "org.mockito.internal.verification.AtMost",
      "org.mockito.internal.invocation.InvocationMarker",
      "org.mockito.internal.util.Timer",
      "org.mockito.verification.VerificationWrapper",
      "org.mockito.verification.After",
      "org.mockito.internal.progress.MockingProgressImpl",
      "org.mockito.exceptions.Reporter",
      "org.mockito.internal.progress.ArgumentMatcherStorageImpl",
      "org.mockito.internal.creation.settings.CreationSettings",
      "org.mockito.internal.creation.MockSettingsImpl",
      "org.mockito.internal.stubbing.InvocationContainerImpl",
      "org.mockito.internal.verification.DefaultRegisteredInvocations",
      "org.mockito.internal.verification.VerificationDataImpl",
      "org.mockito.internal.progress.ThreadSafeMockingProgress",
      "org.mockito.verification.Timeout",
      "org.mockito.internal.invocation.InvocationMatcher",
      "org.mockito.internal.invocation.SerializableMethod",
      "org.mockito.exceptions.base.MockitoException",
      "org.mockito.internal.exceptions.stacktrace.ConditionalStackTraceFilter",
      "org.mockito.internal.configuration.GlobalConfiguration",
      "org.mockito.configuration.DefaultMockitoConfiguration",
      "org.mockito.internal.configuration.ClassPathLoader",
      "org.mockito.internal.configuration.plugins.PluginRegistry",
      "org.mockito.internal.configuration.plugins.PluginLoader",
      "org.mockito.internal.configuration.plugins.DefaultPluginSwitch",
      "org.mockito.internal.configuration.plugins.PluginFinder",
      "org.mockito.internal.util.collections.Iterables",
      "org.mockito.internal.creation.cglib.CglibMockMaker",
      "org.mockito.internal.exceptions.stacktrace.DefaultStackTraceCleanerProvider",
      "org.mockito.internal.configuration.plugins.Plugins",
      "org.mockito.internal.exceptions.stacktrace.DefaultStackTraceCleaner",
      "org.mockito.internal.exceptions.stacktrace.StackTraceFilter",
      "org.mockito.internal.verification.NoMoreInteractions",
      "org.mockito.internal.invocation.realmethod.DefaultRealMethod",
      "org.mockito.internal.invocation.InvocationImpl",
      "org.mockito.internal.debugging.LocationImpl",
      "org.mockito.exceptions.misusing.FriendlyReminderException",
      "org.mockito.internal.util.StringJoiner",
      "org.mockito.internal.verification.DefaultRegisteredInvocations$RemoveToString",
      "org.mockito.internal.util.collections.ListUtil",
      "org.mockito.internal.invocation.InvocationsFinder",
      "org.mockito.internal.invocation.InvocationsFinder$RemoveNotMatching",
      "org.mockito.internal.stubbing.defaultanswers.GloballyConfiguredAnswer",
      "org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls",
      "org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues",
      "org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues",
      "org.mockito.internal.util.ObjectMethodsGuru",
      "org.mockito.internal.util.MockUtil",
      "org.mockito.internal.stubbing.defaultanswers.ReturnsMocks",
      "org.mockito.internal.MockitoCore",
      "org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs",
      "org.mockito.internal.stubbing.answers.CallsRealMethods",
      "org.mockito.Answers",
      "org.mockito.internal.listeners.CollectCreatedMocks",
      "org.mockito.internal.stubbing.BaseStubbing",
      "org.mockito.internal.stubbing.ConsecutiveStubbing",
      "org.mockito.internal.stubbing.StubbedInvocationMatcher",
      "org.mockito.internal.invocation.realmethod.CleanTraceRealMethod",
      "org.mockito.internal.debugging.VerboseMockInvocationLogger",
      "org.mockito.exceptions.misusing.UnfinishedStubbingException",
      "org.mockito.internal.debugging.Localized",
      "org.mockito.internal.util.MockCreationValidator",
      "org.mockito.internal.util.MockNameImpl",
      "org.mockito.exceptions.misusing.UnfinishedVerificationException",
      "org.mockito.internal.util.reflection.Constructors",
      "org.mockito.internal.verification.InOrderContextImpl",
      "org.mockito.internal.util.collections.IdentitySet",
      "org.mockito.internal.verification.api.VerificationDataInOrderImpl",
      "org.mockito.internal.invocation.ArgumentsProcessor",
      "org.mockito.internal.stubbing.answers.Returns",
      "org.mockito.internal.stubbing.answers.ThrowsException",
      "org.mockito.internal.verification.SingleRegisteredInvocation",
      "org.mockito.internal.stubbing.OngoingStubbingImpl",
      "org.mockito.internal.stubbing.answers.ThrowsExceptionClass",
      "org.mockito.internal.util.collections.Sets",
      "org.mockito.internal.listeners.NotifiedMethodInvocationReport",
      "org.mockito.mock.SerializableMode"
    );
  }
}
