/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Jan 05 17:45:41 GMT 2019
 */

package org.mockito;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Matchers_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.mockito.Matchers"; 
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
    java.lang.System.setProperty("user.dir", "/tmp/run_evosuite.pl_43315_1546710288"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Matchers_ESTest_scaffolding.class.getClassLoader() ,
      "org.mockito.internal.configuration.plugins.PluginRegistry",
      "org.mockito.internal.matchers.ContainsExtraTypeInformation",
      "org.mockito.cglib.proxy.Callback",
      "org.mockito.exceptions.misusing.UnfinishedVerificationException",
      "org.mockito.invocation.Location",
      "org.hamcrest.Condition$Step",
      "org.mockito.exceptions.Reporter",
      "org.mockito.exceptions.verification.VerificationInOrderFailure",
      "org.hamcrest.core.Is",
      "org.mockito.exceptions.misusing.NullInsteadOfMockException",
      "org.hamcrest.collection.IsIn",
      "org.mockito.ArgumentMatcher",
      "org.mockito.internal.configuration.plugins.PluginLoader",
      "org.mockito.internal.matchers.InstanceOf",
      "org.mockito.internal.matchers.Matches",
      "org.mockito.internal.exceptions.stacktrace.StackTraceFilter",
      "org.mockito.exceptions.misusing.NotAMockException",
      "org.mockito.exceptions.misusing.FriendlyReminderException",
      "org.mockito.internal.progress.MockingProgress",
      "org.mockito.exceptions.misusing.MissingMethodInvocationException",
      "org.mockito.exceptions.verification.SmartNullPointerException",
      "org.hamcrest.Condition",
      "org.mockito.exceptions.verification.TooLittleActualInvocations",
      "org.mockito.internal.progress.MockingProgressImpl",
      "org.mockito.internal.matchers.NotNull",
      "org.mockito.internal.matchers.StartsWith",
      "org.hamcrest.beans.HasPropertyWithValue",
      "org.hamcrest.TypeSafeMatcher",
      "org.mockito.internal.matchers.MatcherDecorator",
      "org.mockito.internal.configuration.plugins.Plugins",
      "org.mockito.cglib.proxy.MethodInterceptor",
      "org.mockito.exceptions.verification.TooManyActualInvocations",
      "org.mockito.plugins.MockMaker",
      "org.mockito.internal.matchers.Contains",
      "org.mockito.internal.exceptions.stacktrace.DefaultStackTraceCleanerProvider",
      "org.mockito.plugins.StackTraceCleanerProvider",
      "org.mockito.exceptions.misusing.MockitoConfigurationException",
      "org.hamcrest.beans.HasPropertyWithValue$2",
      "org.hamcrest.SelfDescribing",
      "org.mockito.internal.matchers.EndsWith",
      "org.mockito.exceptions.misusing.InvalidUseOfMatchersException",
      "org.mockito.exceptions.misusing.UnfinishedStubbingException",
      "org.hamcrest.core.IsNot",
      "org.mockito.Matchers",
      "org.mockito.exceptions.verification.NoInteractionsWanted",
      "org.hamcrest.internal.ReflectiveTypeFinder",
      "org.mockito.exceptions.base.MockitoException",
      "org.mockito.plugins.PluginSwitch",
      "org.mockito.internal.matchers.CapturesArguments",
      "org.mockito.internal.matchers.Same",
      "org.hamcrest.TypeSafeDiagnosingMatcher",
      "org.hamcrest.BaseMatcher",
      "org.mockito.internal.progress.ArgumentMatcherStorageImpl",
      "org.mockito.internal.util.collections.Iterables",
      "org.mockito.internal.matchers.Any",
      "org.hamcrest.core.AnyOf",
      "org.mockito.internal.configuration.plugins.DefaultPluginSwitch",
      "org.mockito.internal.util.Primitives",
      "org.mockito.internal.progress.ThreadSafeMockingProgress",
      "org.mockito.exceptions.verification.WantedButNotInvoked",
      "org.hamcrest.core.IsEqual",
      "org.hamcrest.core.ShortcutCombination",
      "org.mockito.internal.creation.cglib.CglibMockMaker",
      "org.hamcrest.Description",
      "org.hamcrest.beans.HasProperty",
      "org.mockito.exceptions.misusing.WrongTypeOfReturnValue",
      "org.mockito.internal.progress.ArgumentMatcherStorage",
      "org.mockito.internal.exceptions.stacktrace.DefaultStackTraceCleaner",
      "org.mockito.exceptions.stacktrace.StackTraceCleaner",
      "org.mockito.internal.matchers.Null",
      "org.mockito.internal.progress.HandyReturnValues",
      "org.mockito.exceptions.base.MockitoAssertionError",
      "org.mockito.internal.debugging.LocationImpl",
      "org.mockito.internal.matchers.Equals",
      "org.mockito.internal.configuration.plugins.PluginFinder",
      "org.mockito.internal.matchers.LocalizedMatcher",
      "org.mockito.internal.matchers.AnyVararg",
      "org.mockito.exceptions.verification.NeverWantedButInvoked",
      "org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue",
      "org.mockito.exceptions.misusing.CannotVerifyStubOnlyMock",
      "org.hamcrest.Matcher",
      "org.mockito.internal.matchers.apachecommons.ReflectionEquals",
      "org.mockito.internal.matchers.VarargMatcher"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Matchers_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.mockito.internal.progress.ThreadSafeMockingProgress",
      "org.mockito.Matchers",
      "org.hamcrest.BaseMatcher",
      "org.mockito.ArgumentMatcher",
      "org.mockito.internal.matchers.AnyVararg",
      "org.mockito.internal.matchers.Any",
      "org.mockito.internal.matchers.Null",
      "org.mockito.internal.matchers.NotNull",
      "org.hamcrest.DiagnosingMatcher",
      "org.hamcrest.core.IsInstanceOf",
      "org.hamcrest.core.IsAnything",
      "org.hamcrest.BaseDescription",
      "org.hamcrest.StringDescription",
      "org.hamcrest.Description$NullDescription",
      "org.mockito.internal.progress.MockingProgressImpl",
      "org.mockito.exceptions.Reporter",
      "org.mockito.internal.progress.ArgumentMatcherStorageImpl",
      "org.mockito.internal.matchers.LocalizedMatcher",
      "org.mockito.internal.debugging.LocationImpl",
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
      "org.mockito.internal.progress.HandyReturnValues",
      "org.mockito.internal.matchers.InstanceOf",
      "org.mockito.internal.matchers.Equals",
      "org.mockito.internal.util.Primitives",
      "org.mockito.internal.matchers.Contains",
      "org.mockito.internal.matchers.apachecommons.ReflectionEquals",
      "org.hamcrest.core.IsSame",
      "org.mockito.internal.matchers.Same",
      "org.hamcrest.core.Is",
      "org.hamcrest.core.AllOf",
      "org.hamcrest.core.ShortcutCombination",
      "org.hamcrest.core.AnyOf",
      "org.hamcrest.internal.ReflectiveTypeFinder",
      "org.hamcrest.TypeSafeDiagnosingMatcher",
      "org.hamcrest.beans.HasPropertyWithValue$2",
      "org.hamcrest.beans.HasPropertyWithValue",
      "org.mockito.internal.matchers.Matches",
      "org.hamcrest.core.IsNot",
      "org.hamcrest.beans.SamePropertyValuesAs",
      "org.hamcrest.beans.PropertyUtil",
      "org.hamcrest.beans.SamePropertyValuesAs$PropertyMatcher",
      "org.hamcrest.core.IsEqual",
      "org.hamcrest.core.DescribedAs",
      "org.hamcrest.TypeSafeMatcher",
      "org.hamcrest.number.IsCloseTo",
      "org.mockito.internal.matchers.StartsWith",
      "org.hamcrest.Description",
      "org.mockito.internal.matchers.EndsWith",
      "org.hamcrest.number.OrderingComparison",
      "org.hamcrest.beans.HasProperty",
      "org.hamcrest.collection.IsIn",
      "org.hamcrest.core.IsNull",
      "org.hamcrest.core.CombinableMatcher",
      "org.hamcrest.core.CombinableMatcher$CombinableEitherMatcher",
      "org.hamcrest.core.CombinableMatcher$CombinableBothMatcher",
      "org.hamcrest.FeatureMatcher",
      "org.hamcrest.object.HasToString",
      "org.hamcrest.internal.SelfDescribingValueIterator",
      "org.hamcrest.internal.SelfDescribingValue",
      "org.hamcrest.core.IsCollectionContaining",
      "org.hamcrest.collection.IsArrayWithSize",
      "org.hamcrest.collection.IsMapContaining",
      "org.hamcrest.core.SubstringMatcher",
      "org.hamcrest.core.StringContains",
      "org.hamcrest.Condition$NotMatched",
      "org.hamcrest.Condition",
      "org.hamcrest.beans.HasPropertyWithValue$1",
      "org.hamcrest.collection.IsArray",
      "org.hamcrest.text.IsEmptyString"
    );
  }
}