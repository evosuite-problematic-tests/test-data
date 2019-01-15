/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Dec 18 10:21:07 GMT 2018
 */

package org.mockito.internal.configuration.injection;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class PropertyAndSetterInjection_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.mockito.internal.configuration.injection.PropertyAndSetterInjection"; 
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
    java.lang.System.setProperty("user.dir", "/tmp/run_evosuite.pl_12848_1545128326"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PropertyAndSetterInjection_ESTest_scaffolding.class.getClassLoader() ,
      "net.bytebuddy.matcher.CollectionSizeMatcher",
      "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Simple$ConflictHandler",
      "org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker",
      "net.bytebuddy.implementation.attribute.TypeAttributeAppender$ForSuperType",
      "net.bytebuddy.dynamic.scaffold.MethodLookupEngine",
      "net.bytebuddy.matcher.EqualityMatcher",
      "net.bytebuddy.matcher.ElementMatcher$Junction$Disjunction",
      "net.bytebuddy.description.annotation.AnnotationList",
      "org.mockito.exceptions.misusing.NotAMockException",
      "net.bytebuddy.NamingStrategy$Unbound",
      "net.bytebuddy.NamingStrategy$Unbound$Default",
      "net.bytebuddy.description.method.MethodList",
      "net.bytebuddy.matcher.StringMatcher$Mode",
      "net.bytebuddy.matcher.ModifierMatcher",
      "net.bytebuddy.dynamic.DynamicType$Builder",
      "net.bytebuddy.matcher.MethodSortMatcher",
      "net.bytebuddy.matcher.FilterableList$Empty",
      "net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy",
      "org.mockito.plugins.MockMaker",
      "net.bytebuddy.matcher.MethodReturnTypeMatcher",
      "org.mockito.internal.configuration.injection.PropertyAndSetterInjection$1",
      "org.mockito.internal.util.collections.ListUtil$Filter",
      "net.bytebuddy.description.field.FieldList",
      "org.mockito.exceptions.misusing.MockitoConfigurationException",
      "net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy$SuffixingRandom",
      "net.bytebuddy.NamingStrategy",
      "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Simple$ConflictHandler$Default$3",
      "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Simple$ConflictHandler$Default$2",
      "net.bytebuddy.matcher.ElementMatcher$Junction$AbstractBase",
      "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Simple$ConflictHandler$Default$1",
      "net.bytebuddy.matcher.LatentMethodMatcher",
      "net.bytebuddy.description.ModifierReviewable",
      "net.bytebuddy.utility.RandomString",
      "net.bytebuddy.implementation.attribute.FieldAttributeAppender$NoOp",
      "org.mockito.plugins.PluginSwitch",
      "net.bytebuddy.dynamic.scaffold.MethodLookupEngine$Factory",
      "net.bytebuddy.utility.ByteBuddyCommons",
      "net.bytebuddy.matcher.StringMatcher$Mode$1",
      "net.bytebuddy.matcher.StringMatcher$Mode$2",
      "net.bytebuddy.implementation.attribute.MethodAttributeAppender$NoOp",
      "org.mockito.internal.util.collections.Iterables",
      "net.bytebuddy.matcher.StringMatcher$Mode$3",
      "org.mockito.internal.configuration.plugins.DefaultPluginSwitch",
      "net.bytebuddy.matcher.StringMatcher$Mode$4",
      "net.bytebuddy.matcher.StringMatcher$Mode$5",
      "net.bytebuddy.matcher.StringMatcher$Mode$6",
      "net.bytebuddy.matcher.StringMatcher$Mode$7",
      "net.bytebuddy.description.type.PackageDescription",
      "net.bytebuddy.matcher.StringMatcher$Mode$8",
      "net.bytebuddy.matcher.StringMatcher$Mode$9",
      "net.bytebuddy.description.ModifierReviewable$AbstractModifierReviewable",
      "net.bytebuddy.asm.ClassVisitorWrapper",
      "org.mockito.internal.configuration.injection.MockInjectionStrategy",
      "net.bytebuddy.matcher.NegatingMatcher",
      "org.mockito.invocation.MockHandler",
      "net.bytebuddy.dynamic.scaffold.FieldRegistry",
      "net.bytebuddy.description.annotation.AnnotationDescription",
      "org.mockito.internal.creation.bytebuddy.CachingMockBytecodeGenerator",
      "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Simple$BridgeTarget",
      "net.bytebuddy.description.type.DeclaredInType",
      "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Factory",
      "net.bytebuddy.matcher.DeclaringTypeMatcher",
      "net.bytebuddy.implementation.attribute.TypeAttributeAppender$NoOp",
      "org.mockito.internal.configuration.injection.filter.OngoingInjecter",
      "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Simple$Factory",
      "net.bytebuddy.matcher.ModifierMatcher$Mode",
      "net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$MethodNameTransformer",
      "net.bytebuddy.dynamic.scaffold.MethodRegistry$Default",
      "net.bytebuddy.dynamic.DynamicType$Builder$FieldAnnotationTarget",
      "net.bytebuddy.matcher.FilterableList",
      "net.bytebuddy.ByteBuddy$Definable",
      "net.bytebuddy.matcher.MethodSortMatcher$Sort",
      "org.mockito.internal.creation.bytebuddy.MockBytecodeGenerator",
      "org.mockito.internal.configuration.plugins.PluginRegistry",
      "net.bytebuddy.implementation.attribute.AnnotationAppender",
      "net.bytebuddy.ByteBuddy",
      "org.mockito.internal.creation.instance.InstantiationException",
      "net.bytebuddy.dynamic.scaffold.MethodRegistry",
      "net.bytebuddy.NamingStrategy$SuffixingRandom$BaseNameResolver",
      "org.mockito.internal.configuration.plugins.PluginLoader",
      "net.bytebuddy.implementation.attribute.TypeAttributeAppender",
      "net.bytebuddy.description.method.MethodDescription",
      "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter",
      "net.bytebuddy.implementation.attribute.MethodAttributeAppender",
      "org.mockito.internal.configuration.injection.MockInjectionStrategy$1",
      "net.bytebuddy.description.type.TypeList",
      "net.bytebuddy.matcher.MethodParameterMatcher",
      "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Simple$ConflictHandler$Default",
      "net.bytebuddy.implementation.attribute.FieldAttributeAppender",
      "net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory",
      "net.bytebuddy.matcher.MethodSortMatcher$Sort$6",
      "net.bytebuddy.matcher.MethodSortMatcher$Sort$5",
      "net.bytebuddy.ByteBuddy$Definable$Undefined",
      "net.bytebuddy.matcher.MethodSortMatcher$Sort$4",
      "net.bytebuddy.matcher.MethodSortMatcher$Sort$3",
      "org.mockito.internal.configuration.plugins.Plugins",
      "net.bytebuddy.matcher.MethodSortMatcher$Sort$2",
      "org.mockito.internal.configuration.injection.filter.MockCandidateFilter",
      "net.bytebuddy.matcher.MethodSortMatcher$Sort$1",
      "net.bytebuddy.matcher.NameMatcher",
      "net.bytebuddy.matcher.ElementMatcher$Junction",
      "net.bytebuddy.description.type.TypeDescription$AbstractTypeDescription",
      "org.mockito.internal.exceptions.stacktrace.DefaultStackTraceCleanerProvider",
      "org.mockito.plugins.StackTraceCleanerProvider",
      "net.bytebuddy.description.type.TypeDescription",
      "net.bytebuddy.description.annotation.AnnotatedCodeElement",
      "net.bytebuddy.ClassFileVersion",
      "net.bytebuddy.dynamic.scaffold.MethodRegistry$Prepared",
      "net.bytebuddy.description.type.TypeList$Empty",
      "net.bytebuddy.matcher.StringMatcher",
      "org.mockito.mock.MockName",
      "net.bytebuddy.implementation.Implementation",
      "net.bytebuddy.implementation.attribute.AnnotationAppender$Target",
      "net.bytebuddy.description.ByteCodeElement",
      "org.mockito.exceptions.base.MockitoException",
      "org.mockito.internal.configuration.injection.PropertyAndSetterInjection",
      "net.bytebuddy.matcher.NullMatcher",
      "net.bytebuddy.dynamic.scaffold.MethodLookupEngine$Default$Factory",
      "net.bytebuddy.implementation.attribute.MethodAttributeAppender$ForInstrumentedMethod",
      "net.bytebuddy.matcher.ElementMatcher$Junction$Conjunction",
      "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter",
      "net.bytebuddy.asm.ClassVisitorWrapper$Chain",
      "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter",
      "net.bytebuddy.description.type.TypeDescription$ForLoadedType",
      "net.bytebuddy.dynamic.loading.ClassLoadingStrategy",
      "org.mockito.internal.util.MockUtil",
      "org.mockito.internal.configuration.plugins.PluginFinder",
      "net.bytebuddy.matcher.ElementMatcher",
      "net.bytebuddy.matcher.ElementMatchers",
      "net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory",
      "net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy",
      "net.bytebuddy.description.NamedElement"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PropertyAndSetterInjection_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.mockito.internal.configuration.injection.MockInjectionStrategy",
      "org.mockito.internal.configuration.injection.PropertyAndSetterInjection",
      "org.mockito.internal.configuration.injection.PropertyAndSetterInjection$1",
      "org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter",
      "org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter",
      "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter",
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
      "org.mockito.internal.util.reflection.FieldInitializer",
      "org.mockito.internal.util.reflection.FieldInitializer$NoArgConstructorInstantiator",
      "org.mockito.internal.util.reflection.FieldReader",
      "org.mockito.internal.util.reflection.AccessibilityChanger",
      "org.mockito.internal.configuration.injection.MockInjectionStrategy$1",
      "org.mockito.internal.configuration.injection.ConstructorInjection",
      "org.mockito.internal.configuration.injection.SpyOnInjectedFieldsHandler",
      "org.mockito.internal.configuration.injection.ConstructorInjection$SimpleArgumentResolver",
      "org.mockito.internal.util.reflection.FieldInitializer$ParameterizedConstructorInstantiator",
      "org.mockito.internal.util.reflection.FieldInitializer$ParameterizedConstructorInstantiator$1"
    );
  }
}
