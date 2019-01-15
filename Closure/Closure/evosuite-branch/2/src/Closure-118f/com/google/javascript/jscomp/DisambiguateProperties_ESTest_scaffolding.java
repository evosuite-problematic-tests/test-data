/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jan 04 16:07:49 GMT 2019
 */

package com.google.javascript.jscomp;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DisambiguateProperties_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.javascript.jscomp.DisambiguateProperties"; 
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
    java.lang.System.setProperty("user.dir", "/tmp/run_evosuite.pl_66296_1546617954"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DisambiguateProperties_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.AllEqualOrdering",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.common.collect.Collections2",
      "com.google.common.collect.ImmutableSortedMap$Builder",
      "com.google.javascript.jscomp.NodeTraversal$Callback",
      "com.google.javascript.rhino.jstype.StaticScope",
      "com.google.javascript.jscomp.SourceExcerptProvider",
      "com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem",
      "com.google.common.collect.Sets$2",
      "com.google.common.collect.Sets$3",
      "com.google.javascript.rhino.jstype.ObjectType",
      "com.google.javascript.rhino.Node",
      "com.google.common.collect.Sets$1",
      "com.google.common.collect.NullsLastOrdering",
      "com.google.common.collect.ImmutableMapKeySet",
      "com.google.common.collect.ImmutableSet$ArrayImmutableSet",
      "com.google.javascript.jscomp.DisambiguateProperties$1",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.RegularImmutableBiMap",
      "com.google.common.collect.ByFunctionOrdering",
      "com.google.common.collect.SortedMapDifference",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.EmptyImmutableBiMap",
      "com.google.javascript.jscomp.ConcreteType",
      "com.google.common.base.Predicate",
      "com.google.common.collect.LexicographicalOrdering",
      "com.google.javascript.jscomp.TightenTypes",
      "com.google.common.base.Joiner",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.common.collect.NullsFirstOrdering",
      "com.google.common.collect.ImmutableAsList",
      "com.google.javascript.jscomp.DisambiguateProperties$Property",
      "com.google.javascript.rhino.jstype.ProxyObjectType",
      "com.google.common.collect.Sets$SetView",
      "com.google.javascript.jscomp.DisambiguateProperties$FindExternProperties",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.javascript.jscomp.DisambiguateProperties$AbstractScopingCallback",
      "com.google.javascript.jscomp.ConcreteType$ConcreteInstanceType",
      "com.google.javascript.rhino.jstype.TemplateType",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.collect.UsingToStringOrdering",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem",
      "com.google.common.collect.ImmutableMultimap",
      "com.google.common.collect.ImmutableSortedMap",
      "com.google.common.collect.ImmutableSortedSet",
      "com.google.javascript.rhino.jstype.ValueType",
      "com.google.javascript.jscomp.ConcreteType$ConcreteFunctionType",
      "com.google.javascript.rhino.jstype.BooleanType",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.javascript.jscomp.DiagnosticType",
      "com.google.common.collect.MapDifference",
      "com.google.common.collect.SortedIterable",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.javascript.jscomp.AbstractCompiler",
      "com.google.javascript.jscomp.ConcreteType$Factory",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.ImmutableSortedSetFauxverideShim",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.ImmutableMapValues",
      "com.google.common.base.Joiner$1",
      "com.google.common.base.Joiner$2",
      "com.google.javascript.jscomp.NodeTraversal$ScopedCallback",
      "com.google.common.collect.RegularImmutableSortedMap",
      "com.google.javascript.jscomp.ConcreteType$ConcreteUniqueType",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableEnumMap",
      "com.google.common.collect.EmptyImmutableSortedSet",
      "com.google.javascript.jscomp.JSError",
      "com.google.common.collect.ImmutableEnumSet",
      "com.google.common.collect.EmptyImmutableSortedMap",
      "com.google.javascript.jscomp.DisambiguateProperties$FindRenameableProperties",
      "com.google.javascript.jscomp.CompilerPass",
      "com.google.common.collect.ImmutableSetMultimap",
      "com.google.javascript.jscomp.CheckLevel",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.Maps$9",
      "com.google.common.collect.ImmutableSet",
      "com.google.javascript.jscomp.graph.LatticeElement",
      "com.google.common.base.Function",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ComparatorOrdering",
      "com.google.javascript.jscomp.DisambiguateProperties$Warnings",
      "com.google.common.collect.Sets",
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.common.collect.ImmutableSortedMapFauxverideShim",
      "com.google.javascript.jscomp.DisambiguateProperties$TypeSystem",
      "com.google.common.collect.ExplicitOrdering",
      "com.google.common.collect.Multiset",
      "com.google.common.collect.AbstractMultimap",
      "com.google.javascript.jscomp.DisambiguateProperties",
      "com.google.common.collect.Multimap",
      "com.google.common.collect.CompoundOrdering",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.SingletonImmutableBiMap",
      "com.google.common.collect.ReverseOrdering",
      "com.google.javascript.rhino.jstype.StringType",
      "com.google.common.collect.ImmutableMap$1MapViewOfValuesAsSingletonSets",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.javascript.jscomp.graph.UnionFind",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.common.collect.ReverseNaturalOrdering",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.Maps",
      "com.google.common.collect.SetMultimap",
      "com.google.common.collect.DescendingImmutableSortedSet",
      "com.google.common.collect.Maps$EntryTransformer",
      "com.google.common.collect.Ordering",
      "com.google.common.collect.NaturalOrdering",
      "com.google.common.collect.RegularImmutableSortedSet"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DisambiguateProperties_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.javascript.jscomp.DisambiguateProperties",
      "com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem",
      "com.google.javascript.jscomp.DisambiguateProperties$AbstractScopingCallback",
      "com.google.javascript.jscomp.DisambiguateProperties$FindExternProperties",
      "com.google.javascript.jscomp.DisambiguateProperties$FindRenameableProperties",
      "com.google.javascript.jscomp.DisambiguateProperties$Property",
      "com.google.javascript.jscomp.DiagnosticType",
      "com.google.javascript.jscomp.CheckLevel",
      "com.google.javascript.jscomp.DisambiguateProperties$Warnings",
      "com.google.common.base.Joiner",
      "com.google.common.base.Preconditions",
      "com.google.common.base.Joiner$1",
      "com.google.common.collect.Collections2",
      "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage",
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.javascript.jscomp.BasicErrorManager",
      "com.google.javascript.jscomp.LoggerErrorManager",
      "com.google.javascript.jscomp.ErrorFormat",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.ImmutableSet$ArrayImmutableSet",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.javascript.jscomp.AbstractMessageFormatter",
      "com.google.javascript.jscomp.LightweightMessageFormatter$LineNumberingFormatter",
      "com.google.javascript.jscomp.LightweightMessageFormatter",
      "com.google.javascript.jscomp.BasicErrorManager$LeveledJSErrorComparator",
      "com.google.common.collect.Sets",
      "com.google.javascript.jscomp.AbstractCompiler",
      "com.google.javascript.jscomp.Compiler$1",
      "com.google.javascript.jscomp.Compiler",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.common.collect.Maps",
      "com.google.javascript.jscomp.CodingConventions$Proxy",
      "com.google.javascript.jscomp.ClosureCodingConvention",
      "com.google.javascript.jscomp.CodingConventions",
      "com.google.javascript.jscomp.CodingConventions$DefaultCodingConvention",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.EmptyImmutableList",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.Iterators",
      "com.google.javascript.jscomp.RhinoErrorReporter",
      "com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.Lists",
      "com.google.javascript.rhino.head.Kit",
      "com.google.javascript.rhino.head.optimizer.Codegen",
      "com.google.javascript.rhino.head.Icode",
      "com.google.javascript.rhino.head.Interpreter",
      "com.google.javascript.rhino.head.Context",
      "com.google.javascript.rhino.head.ContextFactory",
      "com.google.javascript.rhino.head.ScriptableObject",
      "com.google.javascript.rhino.head.ScriptRuntime$DefaultMessageProvider",
      "com.google.javascript.rhino.head.ScriptRuntime",
      "com.google.javascript.rhino.head.jdk13.VMBridge_jdk13",
      "com.google.javascript.rhino.head.jdk15.VMBridge_jdk15",
      "com.google.javascript.rhino.head.VMBridge",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableEntry",
      "com.google.javascript.rhino.SimpleErrorReporter",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.RegularImmutableMap$TerminalEntry",
      "com.google.common.collect.RegularImmutableMap$NonTerminalEntry",
      "com.google.javascript.jscomp.RhinoErrorReporter$NewRhinoErrorReporter",
      "com.google.javascript.jscomp.PassFactory",
      "com.google.javascript.jscomp.Compiler$4",
      "com.google.javascript.jscomp.RecentChange",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.common.collect.ImmutableSortedMapFauxverideShim",
      "com.google.common.collect.Ordering",
      "com.google.common.collect.NaturalOrdering",
      "com.google.common.collect.EmptyImmutableSortedMap",
      "com.google.common.collect.ImmutableSortedSetFauxverideShim",
      "com.google.common.collect.EmptyImmutableSortedSet",
      "com.google.common.collect.ImmutableSortedSet",
      "com.google.common.collect.ImmutableSortedMap",
      "com.google.common.collect.ImmutableSortedMap$Builder",
      "com.google.common.collect.ImmutableSortedMap$1",
      "com.google.javascript.jscomp.TightenTypes",
      "com.google.javascript.jscomp.NodeTraversal$AbstractPostOrderCallback",
      "com.google.javascript.jscomp.CoalesceVariableNames$1",
      "com.google.javascript.jscomp.CoalesceVariableNames",
      "com.google.common.collect.RegularImmutableSortedSet",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.collect.RegularImmutableSortedMap",
      "com.google.common.collect.SortedLists$KeyPresentBehavior",
      "com.google.common.collect.SortedLists$KeyAbsentBehavior",
      "com.google.common.collect.SortedLists",
      "com.google.javascript.jscomp.PrintStreamErrorManager",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.SingletonImmutableBiMap",
      "com.google.common.collect.EmptyImmutableBiMap",
      "com.google.javascript.jscomp.AbstractMessageFormatter$1",
      "com.google.javascript.jscomp.AbstractMessageFormatter$Color",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.jscomp.JSModule",
      "com.google.javascript.jscomp.JSError",
      "com.google.javascript.jscomp.VerboseMessageFormatter",
      "com.google.javascript.jscomp.ConcreteType$ConcreteNoneType",
      "com.google.javascript.jscomp.ConcreteType$ConcreteAll",
      "com.google.javascript.jscomp.ConcreteType",
      "com.google.javascript.jscomp.ConcreteType$ConcreteUnionType",
      "com.google.javascript.rhino.jstype.CanCastToVisitor",
      "com.google.javascript.rhino.jstype.JSType$1",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.rhino.jstype.AllType",
      "com.google.javascript.rhino.jstype.ObjectType",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.javascript.rhino.jstype.NoObjectType",
      "com.google.javascript.jscomp.JSModuleGraph",
      "com.google.common.base.Charsets",
      "com.google.javascript.jscomp.CompilerInput",
      "com.google.javascript.jscomp.SourceFile",
      "com.google.javascript.jscomp.SourceFile$Builder",
      "com.google.javascript.jscomp.SourceFile$Preloaded",
      "com.google.javascript.jscomp.JsAst",
      "com.google.javascript.rhino.InputId",
      "com.google.javascript.jscomp.SyntheticAst",
      "com.google.javascript.rhino.IR",
      "com.google.javascript.rhino.Node$AbstractPropListItem",
      "com.google.javascript.rhino.Node$ObjectPropListItem",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.google.common.collect.RegularImmutableSortedMap$EntrySet",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.RegularImmutableSortedMap$EntrySet$1",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.collect.ImmutableSortedAsList",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.ImmutableList$1",
      "com.google.javascript.jscomp.DiagnosticGroup",
      "com.google.javascript.jscomp.TypeValidator",
      "com.google.javascript.jscomp.TightenTypes$ConcreteScope",
      "com.google.javascript.jscomp.WarningsGuard",
      "com.google.common.base.Splitter",
      "com.google.common.base.Splitter$2",
      "com.google.common.base.CharMatcher$1",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.base.CharMatcher$13",
      "com.google.common.base.CharMatcher$RangesMatcher",
      "com.google.common.base.CharMatcher$2",
      "com.google.common.base.CharMatcher$3",
      "com.google.common.base.CharMatcher$4",
      "com.google.common.base.CharMatcher$5",
      "com.google.common.base.CharMatcher$6",
      "com.google.common.base.CharMatcher$Or",
      "com.google.common.base.CharMatcher$7",
      "com.google.common.base.CharMatcher$8",
      "com.google.common.base.CharMatcher$15",
      "com.google.common.base.CharMatcher",
      "com.google.javascript.jscomp.WhitelistWarningsGuard",
      "com.google.common.io.Files",
      "com.google.common.io.ByteSource",
      "com.google.common.io.Files$FileByteSource",
      "com.google.common.io.CharSource",
      "com.google.common.io.ByteSource$AsCharSource",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.collect.AbstractMapBasedMultimap",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.collect.LinkedHashMultimap",
      "com.google.common.collect.LinkedHashMultimap$ValueEntry",
      "com.google.common.collect.AbstractListMultimap",
      "com.google.common.collect.ArrayListMultimap",
      "com.google.javascript.rhino.jstype.TemplateTypeMap",
      "com.google.javascript.rhino.jstype.ModificationVisitor",
      "com.google.javascript.rhino.jstype.TemplateTypeMapReplacer",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.javascript.rhino.jstype.ProxyObjectType",
      "com.google.javascript.rhino.jstype.TemplateType",
      "com.google.javascript.rhino.jstype.ValueType",
      "com.google.javascript.rhino.jstype.BooleanType",
      "com.google.javascript.rhino.jstype.NullType",
      "com.google.javascript.rhino.jstype.NumberType",
      "com.google.javascript.rhino.jstype.StringType",
      "com.google.javascript.rhino.jstype.UnknownType",
      "com.google.javascript.rhino.jstype.VoidType",
      "com.google.javascript.rhino.jstype.PropertyMap$1",
      "com.google.javascript.rhino.jstype.PropertyMap",
      "com.google.javascript.rhino.jstype.FunctionParamBuilder",
      "com.google.javascript.rhino.Node$IntPropListItem",
      "com.google.javascript.rhino.jstype.ArrowType",
      "com.google.common.collect.RegularImmutableList",
      "com.google.javascript.rhino.jstype.FunctionType$Kind",
      "com.google.javascript.rhino.jstype.FunctionType$PropAccess",
      "com.google.javascript.rhino.jstype.InstanceObjectType",
      "com.google.javascript.rhino.jstype.Property",
      "com.google.javascript.rhino.jstype.NoType",
      "com.google.javascript.rhino.jstype.NoResolvedType",
      "com.google.javascript.rhino.jstype.ErrorFunctionType",
      "com.google.javascript.rhino.jstype.UnionTypeBuilder",
      "com.google.javascript.rhino.jstype.EquivalenceMethod",
      "com.google.javascript.rhino.jstype.TemplateTypeMap$EquivalenceMatch",
      "com.google.javascript.rhino.jstype.UnionType",
      "com.google.common.collect.Iterators$12",
      "com.google.javascript.rhino.jstype.FunctionBuilder",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$1",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.collect.Platform",
      "com.google.javascript.jscomp.Tracer$1",
      "com.google.javascript.jscomp.Tracer$Stat",
      "com.google.javascript.jscomp.Tracer",
      "com.google.javascript.jscomp.Compiler$IntermediateState",
      "com.google.javascript.jscomp.PassConfig",
      "com.google.javascript.jscomp.DefaultPassConfig",
      "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator",
      "com.google.javascript.jscomp.DefaultPassConfig$HotSwapPassFactory",
      "com.google.javascript.jscomp.DefaultPassConfig$1",
      "com.google.javascript.jscomp.DefaultPassConfig$2",
      "com.google.javascript.jscomp.DefaultPassConfig$3",
      "com.google.javascript.jscomp.DefaultPassConfig$4",
      "com.google.javascript.jscomp.DefaultPassConfig$5",
      "com.google.javascript.jscomp.DefaultPassConfig$6",
      "com.google.javascript.jscomp.DefaultPassConfig$7",
      "com.google.javascript.jscomp.DefaultPassConfig$8",
      "com.google.javascript.jscomp.DefaultPassConfig$9",
      "com.google.javascript.jscomp.DefaultPassConfig$10",
      "com.google.javascript.jscomp.DefaultPassConfig$11",
      "com.google.javascript.jscomp.DefaultPassConfig$12",
      "com.google.javascript.jscomp.DefaultPassConfig$13",
      "com.google.javascript.jscomp.DefaultPassConfig$14",
      "com.google.javascript.jscomp.DefaultPassConfig$15",
      "com.google.javascript.jscomp.DefaultPassConfig$16",
      "com.google.javascript.jscomp.DefaultPassConfig$17",
      "com.google.javascript.jscomp.DefaultPassConfig$18",
      "com.google.javascript.jscomp.DefaultPassConfig$19",
      "com.google.javascript.jscomp.DefaultPassConfig$20",
      "com.google.javascript.jscomp.DefaultPassConfig$21",
      "com.google.javascript.jscomp.DefaultPassConfig$22",
      "com.google.javascript.jscomp.DefaultPassConfig$23",
      "com.google.javascript.jscomp.DefaultPassConfig$24",
      "com.google.javascript.jscomp.DefaultPassConfig$25",
      "com.google.javascript.jscomp.DefaultPassConfig$26",
      "com.google.javascript.jscomp.DefaultPassConfig$27",
      "com.google.javascript.jscomp.DefaultPassConfig$28",
      "com.google.javascript.jscomp.DefaultPassConfig$29",
      "com.google.javascript.jscomp.DefaultPassConfig$30",
      "com.google.javascript.jscomp.DefaultPassConfig$31",
      "com.google.javascript.jscomp.DefaultPassConfig$32",
      "com.google.javascript.jscomp.DefaultPassConfig$33",
      "com.google.javascript.jscomp.DefaultPassConfig$34",
      "com.google.javascript.jscomp.DefaultPassConfig$35",
      "com.google.javascript.jscomp.DefaultPassConfig$36",
      "com.google.javascript.jscomp.DefaultPassConfig$37",
      "com.google.javascript.jscomp.DefaultPassConfig$38",
      "com.google.javascript.jscomp.DefaultPassConfig$39",
      "com.google.javascript.jscomp.DefaultPassConfig$40",
      "com.google.javascript.jscomp.DefaultPassConfig$41",
      "com.google.javascript.jscomp.DefaultPassConfig$42",
      "com.google.javascript.jscomp.DefaultPassConfig$43",
      "com.google.javascript.jscomp.DefaultPassConfig$44",
      "com.google.javascript.jscomp.DefaultPassConfig$45",
      "com.google.javascript.jscomp.DefaultPassConfig$46",
      "com.google.javascript.jscomp.DefaultPassConfig$47",
      "com.google.javascript.jscomp.DefaultPassConfig$48",
      "com.google.javascript.jscomp.DefaultPassConfig$49",
      "com.google.javascript.jscomp.DefaultPassConfig$50",
      "com.google.javascript.jscomp.DefaultPassConfig$51",
      "com.google.javascript.jscomp.DefaultPassConfig$52",
      "com.google.javascript.jscomp.DefaultPassConfig$53",
      "com.google.javascript.jscomp.DefaultPassConfig$54",
      "com.google.javascript.jscomp.DefaultPassConfig$55",
      "com.google.javascript.jscomp.DefaultPassConfig$56",
      "com.google.javascript.jscomp.DefaultPassConfig$57",
      "com.google.javascript.jscomp.DefaultPassConfig$58",
      "com.google.javascript.jscomp.DefaultPassConfig$59",
      "com.google.javascript.jscomp.DefaultPassConfig$60",
      "com.google.javascript.jscomp.DefaultPassConfig$61",
      "com.google.javascript.jscomp.DefaultPassConfig$62",
      "com.google.javascript.jscomp.DefaultPassConfig$63",
      "com.google.javascript.jscomp.DefaultPassConfig$64",
      "com.google.javascript.jscomp.DefaultPassConfig$65",
      "com.google.javascript.jscomp.DefaultPassConfig$66",
      "com.google.javascript.jscomp.DefaultPassConfig$67",
      "com.google.javascript.jscomp.DefaultPassConfig$68",
      "com.google.javascript.jscomp.DefaultPassConfig$69",
      "com.google.javascript.jscomp.DefaultPassConfig$70",
      "com.google.javascript.jscomp.DefaultPassConfig$71",
      "com.google.javascript.jscomp.DefaultPassConfig$72",
      "com.google.javascript.jscomp.DefaultPassConfig$73",
      "com.google.javascript.jscomp.DefaultPassConfig$74",
      "com.google.javascript.jscomp.DefaultPassConfig$75",
      "com.google.javascript.jscomp.DefaultPassConfig$76",
      "com.google.javascript.jscomp.DefaultPassConfig$77",
      "com.google.javascript.jscomp.DefaultPassConfig$78",
      "com.google.javascript.jscomp.DefaultPassConfig$79",
      "com.google.javascript.jscomp.DefaultPassConfig$80",
      "com.google.javascript.jscomp.DefaultPassConfig$81",
      "com.google.javascript.jscomp.DefaultPassConfig$82",
      "com.google.javascript.jscomp.DefaultPassConfig$83",
      "com.google.javascript.jscomp.DefaultPassConfig$84",
      "com.google.javascript.jscomp.DefaultPassConfig$85",
      "com.google.javascript.jscomp.DefaultPassConfig$86",
      "com.google.javascript.jscomp.DefaultPassConfig$87",
      "com.google.javascript.jscomp.DefaultPassConfig$88",
      "com.google.javascript.jscomp.DefaultPassConfig$89",
      "com.google.javascript.jscomp.DefaultPassConfig$90",
      "com.google.javascript.jscomp.DefaultPassConfig$91",
      "com.google.javascript.jscomp.DefaultPassConfig$92",
      "com.google.javascript.jscomp.DefaultPassConfig$93",
      "com.google.javascript.jscomp.DefaultPassConfig$94",
      "com.google.javascript.jscomp.DefaultPassConfig$95",
      "com.google.javascript.jscomp.DefaultPassConfig$96",
      "com.google.javascript.jscomp.DefaultPassConfig$97",
      "com.google.javascript.jscomp.DefaultPassConfig$98",
      "com.google.javascript.jscomp.DefaultPassConfig$99",
      "com.google.javascript.jscomp.DefaultPassConfig$100",
      "com.google.javascript.jscomp.DefaultPassConfig$101",
      "com.google.javascript.jscomp.DefaultPassConfig$102",
      "com.google.javascript.jscomp.DefaultPassConfig$103",
      "com.google.javascript.jscomp.DefaultPassConfig$107",
      "com.google.javascript.jscomp.DefaultPassConfig$108",
      "com.google.javascript.jscomp.PassConfig$State",
      "com.google.javascript.jscomp.ReplaceIdGenerators$UniqueRenamingToken",
      "com.google.javascript.jscomp.ReplaceIdGenerators",
      "com.google.javascript.jscomp.CompilerOptions$NullAliasTransformationHandler$NullAliasTransformation",
      "com.google.javascript.jscomp.CompilerOptions$NullAliasTransformationHandler",
      "com.google.javascript.jscomp.CompilerOptions",
      "com.google.javascript.jscomp.DependencyOptions",
      "com.google.javascript.jscomp.ComposeWarningsGuard",
      "com.google.common.primitives.Ints",
      "com.google.javascript.jscomp.ComposeWarningsGuard$GuardComparator",
      "com.google.javascript.jscomp.SourceMap$DetailLevel",
      "com.google.javascript.jscomp.SourceMap$Format",
      "com.google.javascript.jscomp.CompilerOptions$LanguageMode",
      "com.google.javascript.jscomp.CompilerOptions$DevMode",
      "com.google.javascript.jscomp.CheckEventfulObjectDisposal$DisposalCheckingPolicy",
      "com.google.javascript.jscomp.VariableRenamingPolicy",
      "com.google.javascript.jscomp.PropertyRenamingPolicy",
      "com.google.javascript.jscomp.AnonymousFunctionNamingPolicy",
      "com.google.javascript.jscomp.CompilerOptions$TweakProcessing",
      "com.google.javascript.jscomp.CompilerOptions$TracerMode",
      "com.google.javascript.jscomp.PhaseOptimizer$ProgressRange",
      "com.google.javascript.jscomp.PhaseOptimizer",
      "com.google.javascript.jscomp.AbstractPeepholeOptimization",
      "com.google.javascript.jscomp.PeepholeReplaceKnownMethods",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.common.collect.ImmutableBiMap$Builder",
      "com.google.common.collect.RegularImmutableBiMap",
      "com.google.common.collect.RegularImmutableBiMap$BiMapEntry",
      "com.google.javascript.jscomp.Compiler$5",
      "com.google.javascript.jscomp.CheckGlobalThis",
      "com.google.javascript.jscomp.CheckAccessControls",
      "com.google.javascript.jscomp.VarCheck",
      "com.google.javascript.jscomp.CheckGlobalNames",
      "com.google.javascript.jscomp.VariableReferenceCheck",
      "com.google.javascript.jscomp.StrictModeCheck",
      "com.google.javascript.jscomp.ProcessDefines",
      "com.google.common.base.CharMatcher$11",
      "com.google.javascript.jscomp.ProcessTweaks$TweakFunction",
      "com.google.javascript.jscomp.ProcessTweaks",
      "com.google.javascript.jscomp.TypedScopeCreator",
      "com.google.javascript.jscomp.FunctionTypeBuilder",
      "com.google.javascript.jscomp.TypeCheck",
      "com.google.javascript.jscomp.CheckMissingReturn$1",
      "com.google.javascript.jscomp.CheckMissingReturn$2",
      "com.google.javascript.jscomp.CheckMissingReturn",
      "com.google.javascript.jscomp.CheckDebuggerStatement",
      "com.google.javascript.jscomp.CheckRegExp",
      "com.google.javascript.jscomp.CheckEventfulObjectDisposal",
      "com.google.javascript.jscomp.SyntacticScopeCreator",
      "com.google.javascript.jscomp.CheckSideEffects",
      "com.google.javascript.jscomp.CheckUnreachableCode",
      "com.google.javascript.jscomp.ConstCheck",
      "com.google.javascript.jscomp.ControlStructureCheck",
      "com.google.javascript.jscomp.CheckProvides",
      "com.google.javascript.jscomp.CheckRequiresForConstructors",
      "com.google.javascript.jscomp.JsMessageVisitor",
      "com.google.javascript.jscomp.CheckSuspiciousCode",
      "com.google.javascript.jscomp.DiagnosticGroups",
      "com.google.javascript.jscomp.DiagnosticGroupWarningsGuard",
      "com.google.javascript.jscomp.WarningsGuard$Priority",
      "com.google.javascript.jscomp.SuppressDocWarningsGuard",
      "com.google.common.collect.RegularImmutableMap$EntrySet",
      "com.google.common.collect.ReverseNaturalOrdering",
      "com.google.javascript.jscomp.Normalize",
      "com.google.javascript.jscomp.LineNumberCheck",
      "com.google.javascript.jscomp.NodeTraversal",
      "com.google.javascript.jscomp.SyntacticScopeCreator$DefaultRedeclarationHandler",
      "com.google.javascript.jscomp.MethodCompilerPass",
      "com.google.javascript.jscomp.InlineSimpleMethods$1",
      "com.google.javascript.jscomp.InlineSimpleMethods",
      "com.google.javascript.jscomp.InvocationsCallback",
      "com.google.javascript.jscomp.InlineSimpleMethods$InlineTrivialAccessors",
      "com.google.javascript.jscomp.Compiler$11",
      "com.google.javascript.jscomp.parsing.Config$LanguageMode",
      "com.google.javascript.jscomp.parsing.ParserRunner",
      "com.google.javascript.jscomp.parsing.Config",
      "com.google.javascript.jscomp.parsing.Annotation",
      "com.google.javascript.rhino.head.DefaultErrorReporter",
      "com.google.javascript.rhino.head.CompilerEnvirons",
      "com.google.javascript.rhino.head.Parser",
      "com.google.javascript.rhino.head.TokenStream",
      "com.google.javascript.rhino.head.ObjToIntMap",
      "com.google.javascript.rhino.head.Node",
      "com.google.javascript.rhino.head.ast.AstNode",
      "com.google.javascript.rhino.head.ast.Jump",
      "com.google.javascript.rhino.head.ast.Scope",
      "com.google.javascript.rhino.head.ast.ScriptNode",
      "com.google.javascript.rhino.head.ast.AstRoot",
      "com.google.javascript.rhino.head.ast.Name",
      "com.google.javascript.rhino.head.ast.ExpressionStatement",
      "com.google.javascript.jscomp.BasicErrorManager$ErrorWithLevel",
      "com.google.javascript.rhino.head.Parser$ParserException",
      "com.google.javascript.rhino.head.ast.EmptyStatement",
      "com.google.javascript.rhino.head.RhinoException",
      "com.google.javascript.rhino.head.EvaluatorException",
      "com.google.javascript.jscomp.parsing.ParserRunner$ParseResult",
      "com.google.javascript.jscomp.Normalize$NormalizeStatements",
      "com.google.javascript.jscomp.NodeUtil$1",
      "com.google.javascript.jscomp.NodeUtil$NumbericResultPredicate",
      "com.google.javascript.jscomp.NodeUtil$BooleanResultPredicate",
      "com.google.javascript.jscomp.NodeUtil$MayBeStringResultPredicate",
      "com.google.javascript.jscomp.NodeUtil$MatchNotFunction",
      "com.google.javascript.jscomp.NodeUtil",
      "com.google.javascript.jscomp.MakeDeclaredNamesUnique",
      "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer",
      "com.google.common.collect.AbstractMultiset",
      "com.google.common.collect.AbstractMapBasedMultiset",
      "com.google.common.collect.HashMultiset",
      "com.google.common.collect.Multisets$5",
      "com.google.common.collect.Multisets",
      "com.google.common.collect.Sets$ImprovedAbstractSet",
      "com.google.common.collect.Multisets$EntrySet",
      "com.google.common.collect.AbstractMultiset$EntrySet",
      "com.google.common.collect.AbstractMapBasedMultiset$1",
      "com.google.javascript.jscomp.JSError$1",
      "com.google.javascript.jscomp.ControlFlowAnalysis",
      "com.google.javascript.jscomp.StatementFusion",
      "com.google.javascript.jscomp.CodeGenerator",
      "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax",
      "com.google.javascript.jscomp.ConcreteType$ConcreteFunctionType",
      "com.google.javascript.jscomp.PeepholeFoldWithTypes",
      "com.google.javascript.jscomp.Compiler$7",
      "com.google.javascript.jscomp.Compiler$3",
      "com.google.common.collect.ImmutableMapKeySet",
      "com.google.javascript.jscomp.Tracer$ThreadTrace",
      "com.google.javascript.jscomp.Compiler$9",
      "com.google.javascript.jscomp.PeepholeRemoveDeadCode",
      "com.google.javascript.jscomp.StripCode",
      "com.google.javascript.jscomp.Compiler$8",
      "com.google.javascript.jscomp.SourceFile$Generated",
      "com.google.javascript.jscomp.SymbolTable",
      "com.google.common.collect.ComparatorOrdering",
      "com.google.common.collect.ReverseOrdering",
      "com.google.javascript.jscomp.MemoizedScopeCreator"
    );
  }
}
