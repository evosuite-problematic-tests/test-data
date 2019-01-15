/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Dec 24 17:51:52 GMT 2018
 */

package org.mockito.internal.configuration.injection.filter;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TypeBasedCandidateFilter_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter"; 
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
    java.lang.System.setProperty("user.dir", "/tmp/run_evosuite.pl_80660_1545673428"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TypeBasedCandidateFilter_ESTest_scaffolding.class.getClassLoader() ,
      "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter$2",
      "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter",
      "org.mockito.internal.configuration.injection.filter.OngoingInjecter",
      "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter",
      "org.mockito.internal.configuration.injection.filter.MockCandidateFilter"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TypeBasedCandidateFilter_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter",
      "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter",
      "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter$2",
      "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter",
      "org.mockito.internal.configuration.plugins.PluginRegistry",
      "org.mockito.internal.configuration.plugins.PluginLoader",
      "org.mockito.internal.configuration.plugins.DefaultPluginSwitch",
      "org.mockito.internal.configuration.plugins.PluginFinder",
      "org.mockito.internal.util.collections.Iterables",
      "org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker",
      "org.mockito.internal.creation.bytebuddy.CachingMockBytecodeGenerator",
      "org.mockito.internal.creation.bytebuddy.MockBytecodeGenerator",
      "net.bytebuddy.ByteBuddy",
      "net.bytebuddy.ClassFileVersion",
      "net.bytebuddy.utility.ByteBuddyCommons",
      "net.bytebuddy.NamingStrategy$Unbound$Default",
      "net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy$SuffixingRandom",
      "net.bytebuddy.utility.RandomString",
      "net.bytebuddy.matcher.FilterableList$Empty",
      "net.bytebuddy.description.type.TypeList$Empty",
      "net.bytebuddy.matcher.ElementMatchers",
      "net.bytebuddy.matcher.ElementMatcher$Junction$AbstractBase",
      "net.bytebuddy.matcher.NameMatcher",
      "net.bytebuddy.matcher.StringMatcher",
      "net.bytebuddy.matcher.StringMatcher$Mode",
      "net.bytebuddy.matcher.MethodParameterMatcher",
      "net.bytebuddy.matcher.CollectionSizeMatcher",
      "net.bytebuddy.matcher.ElementMatcher$Junction$Conjunction",
      "net.bytebuddy.description.ModifierReviewable$AbstractModifierReviewable",
      "net.bytebuddy.description.type.TypeDescription$AbstractTypeDescription",
      "net.bytebuddy.description.type.TypeDescription$ForLoadedType",
      "net.bytebuddy.matcher.EqualityMatcher",
      "net.bytebuddy.matcher.MethodReturnTypeMatcher",
      "net.bytebuddy.matcher.DeclaringTypeMatcher",
      "net.bytebuddy.matcher.ModifierMatcher",
      "net.bytebuddy.matcher.ModifierMatcher$Mode",
      "net.bytebuddy.matcher.MethodSortMatcher",
      "net.bytebuddy.matcher.MethodSortMatcher$Sort",
      "net.bytebuddy.matcher.NegatingMatcher",
      "net.bytebuddy.matcher.ElementMatcher$Junction$Disjunction",
      "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Simple$ConflictHandler$Default",
      "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Simple$Factory",
      "net.bytebuddy.asm.ClassVisitorWrapper$Chain",
      "net.bytebuddy.dynamic.scaffold.MethodRegistry$Default",
      "net.bytebuddy.ByteBuddy$Definable$Undefined",
      "net.bytebuddy.implementation.attribute.TypeAttributeAppender$NoOp",
      "net.bytebuddy.dynamic.scaffold.MethodLookupEngine$Default$Factory",
      "net.bytebuddy.implementation.attribute.FieldAttributeAppender$NoOp",
      "net.bytebuddy.implementation.attribute.MethodAttributeAppender$NoOp",
      "net.bytebuddy.implementation.attribute.MethodAttributeAppender$ForInstrumentedMethod",
      "net.bytebuddy.implementation.attribute.TypeAttributeAppender$ForSuperType",
      "org.mockito.internal.exceptions.stacktrace.DefaultStackTraceCleanerProvider",
      "org.mockito.internal.configuration.plugins.Plugins",
      "org.mockito.internal.util.MockUtil",
      "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter$1",
      "org.mockito.exceptions.base.MockitoException",
      "org.mockito.exceptions.misusing.NotAMockException",
      "org.mockito.internal.exceptions.stacktrace.ConditionalStackTraceFilter",
      "org.mockito.internal.configuration.GlobalConfiguration",
      "org.mockito.configuration.DefaultMockitoConfiguration",
      "org.mockito.internal.configuration.ClassPathLoader",
      "org.mockito.internal.exceptions.stacktrace.DefaultStackTraceCleaner",
      "org.mockito.internal.exceptions.stacktrace.StackTraceFilter"
    );
  }
}