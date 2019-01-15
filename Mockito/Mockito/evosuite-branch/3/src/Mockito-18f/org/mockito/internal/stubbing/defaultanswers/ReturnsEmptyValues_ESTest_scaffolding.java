/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Jan 05 18:14:39 GMT 2019
 */

package org.mockito.internal.stubbing.defaultanswers;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ReturnsEmptyValues_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues"; 
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
    java.lang.System.setProperty("user.dir", "/tmp/run_evosuite.pl_98849_1546711940"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ReturnsEmptyValues_ESTest_scaffolding.class.getClassLoader() ,
      "net.bytebuddy.matcher.CollectionSizeMatcher",
      "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Simple$ConflictHandler",
      "org.mockito.internal.util.ObjectMethodsGuru",
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
      "net.bytebuddy.description.field.FieldList",
      "org.mockito.exceptions.misusing.MockitoConfigurationException",
      "org.mockito.internal.invocation.MockitoMethod",
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
      "org.mockito.stubbing.Answer",
      "net.bytebuddy.matcher.StringMatcher$Mode$2",
      "net.bytebuddy.implementation.attribute.MethodAttributeAppender$NoOp",
      "org.mockito.invocation.InvocationOnMock",
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
      "net.bytebuddy.implementation.attribute.MethodAttributeAppender",
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
      "net.bytebuddy.matcher.MethodSortMatcher$Sort$1",
      "org.mockito.internal.invocation.AbstractAwareMethod",
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
      "net.bytebuddy.matcher.NullMatcher",
      "org.mockito.internal.util.Primitives",
      "net.bytebuddy.dynamic.scaffold.MethodLookupEngine$Default$Factory",
      "net.bytebuddy.implementation.attribute.MethodAttributeAppender$ForInstrumentedMethod",
      "net.bytebuddy.matcher.ElementMatcher$Junction$Conjunction",
      "org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues",
      "net.bytebuddy.asm.ClassVisitorWrapper$Chain",
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
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ReturnsEmptyValues_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues",
      "org.mockito.internal.util.Primitives",
      "org.mockito.internal.util.ObjectMethodsGuru",
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
      "org.mockito.internal.invocation.InvocationMatcher",
      "org.mockito.internal.invocation.ArgumentsProcessor",
      "org.mockito.internal.invocation.realmethod.CleanTraceRealMethod",
      "org.mockito.internal.invocation.realmethod.DefaultRealMethod",
      "org.mockito.internal.invocation.InvocationImpl",
      "org.mockito.internal.creation.DelegatingMethod",
      "org.mockito.exceptions.base.MockitoException",
      "org.mockito.exceptions.misusing.NotAMockException",
      "org.mockito.internal.exceptions.stacktrace.ConditionalStackTraceFilter",
      "org.mockito.internal.configuration.GlobalConfiguration",
      "org.mockito.configuration.DefaultMockitoConfiguration",
      "org.mockito.internal.configuration.ClassPathLoader",
      "org.mockito.internal.exceptions.stacktrace.DefaultStackTraceCleaner",
      "org.mockito.internal.exceptions.stacktrace.StackTraceFilter",
      "org.mockito.internal.invocation.SerializableMethod",
      "org.mockito.internal.stubbing.StubbedInvocationMatcher",
      "org.mockito.internal.handler.MockHandlerFactory",
      "org.mockito.internal.handler.MockHandlerImpl",
      "org.mockito.internal.invocation.MatchersBinder",
      "org.mockito.internal.progress.ThreadSafeMockingProgress",
      "org.mockito.internal.stubbing.InvocationContainerImpl",
      "org.mockito.internal.creation.settings.CreationSettings",
      "org.mockito.internal.creation.MockSettingsImpl",
      "org.mockito.internal.verification.DefaultRegisteredInvocations",
      "org.mockito.internal.handler.NullResultGuardian",
      "org.mockito.internal.handler.InvocationNotifierHandler",
      "org.mockito.internal.creation.bytebuddy.MockFeatures",
      "org.hamcrest.BaseMatcher",
      "org.mockito.ArgumentMatcher",
      "org.mockito.internal.matchers.Equals",
      "org.mockito.internal.debugging.VerboseMockInvocationLogger",
      "org.mockito.internal.util.MockNameImpl",
      "org.mockito.internal.util.MockCreationValidator",
      "org.mockito.exceptions.Reporter",
      "org.mockito.internal.util.StringJoiner",
      "org.mockito.internal.verification.SingleRegisteredInvocation",
      "org.mockito.internal.creation.bytebuddy.CachingMockBytecodeGenerator$CachedBytecodeGenerator",
      "org.mockito.internal.creation.bytebuddy.CachingMockBytecodeGenerator$CachedBytecodeGenerator$MockKey",
      "net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default",
      "net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase",
      "net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder",
      "net.bytebuddy.NamingStrategy$SuffixingRandom",
      "net.bytebuddy.NamingStrategy$SuffixingRandom$BaseNameResolver$ForGivenType",
      "net.bytebuddy.description.modifier.TypeManifestation",
      "net.bytebuddy.dynamic.scaffold.FieldRegistry$Default",
      "net.bytebuddy.NamingStrategy$Fixed",
      "net.bytebuddy.matcher.FilterableList$AbstractBase",
      "net.bytebuddy.description.type.TypeList$ForLoadedType",
      "net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$AbstractDelegatingBuilder",
      "net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$DefaultOptionalMatchedMethodInterception",
      "net.bytebuddy.matcher.BooleanMatcher",
      "net.bytebuddy.matcher.LatentMethodMatcher$Resolved",
      "net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$DefaultMatchedMethodInterception",
      "net.bytebuddy.implementation.MethodDelegation",
      "net.bytebuddy.dynamic.scaffold.MethodLookupEngine$Default",
      "net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$ForInstanceField",
      "net.bytebuddy.implementation.bind.annotation.Argument$Binder",
      "net.bytebuddy.implementation.bind.annotation.AllArguments$Binder",
      "net.bytebuddy.implementation.bind.annotation.Origin$Binder",
      "net.bytebuddy.implementation.bind.annotation.This$Binder",
      "net.bytebuddy.description.method.MethodList$ForLoadedType",
      "net.bytebuddy.description.method.MethodDescription$AbstractMethodDescription",
      "net.bytebuddy.description.method.MethodDescription$ForLoadedMethod",
      "net.bytebuddy.description.method.MethodList$Explicit",
      "net.bytebuddy.implementation.bind.annotation.Super$Binder",
      "net.bytebuddy.implementation.bind.annotation.Default$Binder",
      "net.bytebuddy.implementation.bind.annotation.SuperCall$Binder",
      "net.bytebuddy.implementation.bind.annotation.DefaultCall$Binder",
      "net.bytebuddy.implementation.bind.annotation.Empty$Binder",
      "net.bytebuddy.implementation.bind.annotation.Argument$NextUnboundAsDefaultsProvider",
      "net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$TerminationHandler$Returning",
      "net.bytebuddy.implementation.bind.annotation.BindingPriority$Resolver",
      "net.bytebuddy.implementation.bind.DeclaringTypeResolver",
      "net.bytebuddy.implementation.bind.ArgumentTypeResolver",
      "net.bytebuddy.implementation.bind.MethodNameEqualityResolver",
      "net.bytebuddy.implementation.bind.ParameterLengthResolver",
      "net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Chain",
      "net.bytebuddy.implementation.bytecode.assign.primitive.VoidAwareAssigner",
      "net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveTypeAwareAssigner",
      "net.bytebuddy.implementation.bytecode.assign.reference.ReferenceTypeAwareAssigner",
      "net.bytebuddy.implementation.bytecode.assign.Assigner",
      "net.bytebuddy.dynamic.scaffold.MethodLookupEngine$Default$MethodBucket",
      "net.bytebuddy.matcher.VisibilityMatcher",
      "net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor",
      "net.bytebuddy.jar.asm.Type",
      "net.bytebuddy.dynamic.scaffold.MethodLookupEngine$OverriddenClassMethod",
      "net.bytebuddy.dynamic.scaffold.MethodLookupEngine$Default$MethodBucket$DefaultMethodLookup$Disabled",
      "net.bytebuddy.dynamic.scaffold.MethodLookupEngine$Finding$Default",
      "net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$DefaultMethodAnnotationTarget",
      "net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForImplementation",
      "net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Entry",
      "net.bytebuddy.implementation.FieldAccessor",
      "net.bytebuddy.implementation.FieldAccessor$FieldNameExtractor$ForBeanProperty",
      "net.bytebuddy.implementation.FieldAccessor$ForUnnamedField",
      "net.bytebuddy.implementation.FieldAccessor$FieldLocator$ForInstrumentedTypeHierarchy$Factory",
      "net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$ForStaticMethod",
      "net.bytebuddy.matcher.CollectionOneToOneMatcher",
      "net.bytebuddy.matcher.MethodParameterTypeMatcher",
      "net.bytebuddy.description.modifier.Ownership",
      "net.bytebuddy.description.modifier.Visibility",
      "net.bytebuddy.description.modifier.FieldManifestation",
      "net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$DefaultFieldValueTarget",
      "net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$FieldToken",
      "net.bytebuddy.dynamic.scaffold.FieldRegistry$Default$Entry",
      "net.bytebuddy.implementation.SuperMethodCall",
      "net.bytebuddy.description.type.TypeDescription$AbstractTypeDescription$OfSimpleType",
      "net.bytebuddy.dynamic.scaffold.InstrumentedType$AbstractBase",
      "net.bytebuddy.dynamic.scaffold.subclass.SubclassInstrumentedType",
      "net.bytebuddy.implementation.LoadedTypeInitializer$NoOp",
      "net.bytebuddy.dynamic.scaffold.InstrumentedType$TypeInitializer$None",
      "net.bytebuddy.NamingStrategy$UnnamedType$Default",
      "net.bytebuddy.dynamic.TargetType",
      "net.bytebuddy.description.field.FieldDescription$AbstractFieldDescription",
      "net.bytebuddy.description.field.FieldDescription$Latent",
      "net.bytebuddy.dynamic.scaffold.InstrumentedType$AbstractBase$FieldToken",
      "net.bytebuddy.description.annotation.AnnotationList$Empty",
      "net.bytebuddy.description.type.TypeDescription",
      "net.bytebuddy.description.method.ParameterList$AbstractBase",
      "net.bytebuddy.utility.JavaMethod$ForLoadedMethod",
      "net.bytebuddy.description.method.ParameterList$ForLoadedExecutable",
      "net.bytebuddy.description.type.TypeList$Explicit",
      "net.bytebuddy.description.method.MethodDescription$Latent",
      "net.bytebuddy.description.annotation.AnnotationList$Explicit",
      "net.bytebuddy.dynamic.scaffold.InstrumentedType$AbstractBase$MethodToken",
      "net.bytebuddy.description.method.ParameterList$Explicit",
      "net.bytebuddy.implementation.bytecode.StackSize",
      "net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder$InstrumentableMatcher",
      "net.bytebuddy.description.method.ParameterDescription$AbstractParameterDescription",
      "net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter",
      "net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Prepared",
      "net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$Factory",
      "net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$OriginTypeIdentifier",
      "net.bytebuddy.implementation.Implementation$Target$AbstractBase",
      "net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget",
      "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Simple",
      "net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForImplementation$Compiled",
      "net.bytebuddy.implementation.MethodDelegation$Appender",
      "net.bytebuddy.implementation.bytecode.StackManipulation$Compound",
      "net.bytebuddy.implementation.bytecode.StackManipulation$Size",
      "net.bytebuddy.implementation.bytecode.member.MethodVariableAccess",
      "net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$ArgumentLoadingStackManipulation",
      "net.bytebuddy.description.field.FieldList$Explicit",
      "net.bytebuddy.implementation.bytecode.member.FieldAccess",
      "net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher",
      "net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher$AbstractFieldInstruction",
      "net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher$FieldGetInstruction",
      "net.bytebuddy.implementation.bind.MethodDelegationBinder$Processor",
      "net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder",
      "net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodInvoker$Virtual",
      "net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$DelegationProcessor",
      "net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Entry$AbstractDefiningEntry",
      "net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Entry$ForImplementation",
      "net.bytebuddy.description.type.PackageDescription$AbstractPackageDescription",
      "net.bytebuddy.description.type.PackageDescription$Simple",
      "net.bytebuddy.description.type.PackageDescription$ForLoadedPackage",
      "net.bytebuddy.implementation.bytecode.StackManipulation$LegalTrivial",
      "net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodInvoker$Simple",
      "net.bytebuddy.implementation.FieldAccessor$Appender",
      "net.bytebuddy.implementation.FieldAccessor$FieldLocator$ForInstrumentedTypeHierarchy",
      "net.bytebuddy.implementation.SuperMethodCall$Appender",
      "net.bytebuddy.implementation.SuperMethodCall$Appender$TerminationHandler",
      "net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Compiled",
      "net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$Entry$Simple",
      "net.bytebuddy.dynamic.scaffold.FieldRegistry$Default$Prepared",
      "net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$Entry$NoOp",
      "net.bytebuddy.dynamic.scaffold.FieldRegistry$Default$Compiled",
      "net.bytebuddy.dynamic.scaffold.TypeWriter$Default",
      "net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForCreation",
      "net.bytebuddy.implementation.Implementation$Context$Default",
      "net.bytebuddy.dynamic.DynamicType$Default",
      "net.bytebuddy.dynamic.DynamicType$Default$Unloaded",
      "net.bytebuddy.jar.asm.ClassVisitor",
      "net.bytebuddy.jar.asm.ClassWriter",
      "net.bytebuddy.jar.asm.ByteVector",
      "net.bytebuddy.jar.asm.Item",
      "net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor",
      "net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ValidatingClassVisitor$Constraint",
      "net.bytebuddy.implementation.attribute.AnnotationAppender$Default",
      "net.bytebuddy.implementation.attribute.AnnotationAppender$Target$OnType",
      "net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotation",
      "net.bytebuddy.jar.asm.FieldVisitor",
      "net.bytebuddy.jar.asm.FieldWriter",
      "net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Entry$ForSkippedMethod",
      "net.bytebuddy.implementation.Implementation$Context$ExtractableView$InjectedCode$None",
      "net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Entry$Sort",
      "org.mockito.internal.creation.util.SearchingClassLoader",
      "net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default",
      "net.bytebuddy.dynamic.DynamicType$Default$Loaded",
      "net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$ReflectionStore$Resolved",
      "net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection",
      "net.bytebuddy.dynamic.loading.ClassInjector",
      "net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$ClassLoadingAction",
      "org.mockito.internal.creation.instance.ObjenesisInstantiator",
      "org.objenesis.ObjenesisBase",
      "org.objenesis.ObjenesisStd",
      "org.objenesis.strategy.BaseInstantiatorStrategy",
      "org.objenesis.strategy.StdInstantiatorStrategy",
      "org.mockito.internal.creation.instance.InstantiatorProvider",
      "org.objenesis.strategy.PlatformDescription",
      "org.objenesis.instantiator.sun.SunReflectionFactoryInstantiator",
      "org.objenesis.instantiator.sun.SunReflectionFactoryHelper",
      "org.mockito.internal.creation.bytebuddy.MockMethodInterceptor",
      "org.mockito.internal.creation.bytebuddy.ByteBuddyCrossClassLoaderSerializationSupport",
      "net.bytebuddy.description.method.ParameterDescription$Latent",
      "net.bytebuddy.dynamic.scaffold.InstrumentedType$AbstractBase$MethodToken$ParameterToken",
      "org.mockito.internal.stubbing.defaultanswers.GloballyConfiguredAnswer",
      "org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls",
      "org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues",
      "org.mockito.internal.stubbing.defaultanswers.ReturnsMocks",
      "org.mockito.internal.MockitoCore",
      "org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs",
      "org.mockito.internal.stubbing.answers.CallsRealMethods",
      "org.mockito.Answers",
      "org.mockito.internal.util.reflection.Constructors"
    );
  }
}
