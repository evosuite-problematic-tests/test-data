/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Dec 26 10:35:35 GMT 2018
 */

package com.google.javascript.rhino.jstype;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class UnionType_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.javascript.rhino.jstype.UnionType"; 
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
    java.lang.System.setProperty("user.dir", "/tmp/run_evosuite.pl_139155_1545820497"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(UnionType_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.ArrayListMultimap",
      "com.google.javascript.rhino.jstype.NoType",
      "com.google.common.collect.ListMultimap",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.javascript.rhino.jstype.ArrowType",
      "com.google.javascript.rhino.SimpleErrorReporter",
      "com.google.common.collect.AbstractMultimap$WrappedCollection",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.common.collect.Collections2",
      "com.google.javascript.rhino.jstype.NumberType",
      "com.google.javascript.rhino.jstype.FunctionParamBuilder",
      "com.google.common.collect.PeekingIterator",
      "com.google.javascript.rhino.EvaluatorException",
      "com.google.javascript.rhino.jstype.TernaryValue$1",
      "com.google.common.collect.RegularImmutableList",
      "com.google.javascript.rhino.jstype.TernaryValue$3",
      "com.google.javascript.rhino.jstype.StaticScope",
      "com.google.javascript.rhino.jstype.InstanceObjectType",
      "com.google.javascript.rhino.jstype.TernaryValue$2",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.javascript.rhino.Node$PropListItem",
      "com.google.javascript.rhino.RhinoException",
      "com.google.common.collect.Sets$2",
      "com.google.common.collect.Sets$3",
      "com.google.javascript.rhino.jstype.ObjectType",
      "com.google.javascript.rhino.Node",
      "com.google.common.collect.Sets$1",
      "com.google.common.collect.ImmutableSet$ArrayImmutableSet",
      "com.google.javascript.rhino.jstype.RecordType",
      "com.google.javascript.rhino.jstype.FunctionPrototypeType",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.Iterators$12",
      "com.google.javascript.rhino.jstype.JSType$1",
      "com.google.javascript.rhino.jstype.NoObjectType$GreatestSupertypeVisitor",
      "com.google.javascript.rhino.jstype.JSType$2",
      "com.google.common.base.Predicate",
      "com.google.common.collect.AbstractMultimap$AsMap",
      "com.google.javascript.rhino.jstype.VoidType",
      "com.google.common.base.Joiner",
      "com.google.common.collect.AbstractListMultimap",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.common.collect.ImmutableAsList",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.rhino.jstype.ProxyObjectType",
      "com.google.common.collect.Sets$SetView",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.javascript.rhino.jstype.TemplateType",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.javascript.rhino.jstype.NamedType",
      "com.google.common.collect.Iterators$14",
      "com.google.common.collect.Iterators$13",
      "com.google.common.collect.Iterators$15",
      "com.google.javascript.rhino.jstype.UnionTypeBuilder",
      "com.google.common.collect.Lists$Partition",
      "com.google.common.collect.Lists",
      "com.google.javascript.rhino.jstype.ParameterizedType",
      "com.google.javascript.rhino.jstype.NullType",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "com.google.javascript.rhino.ErrorReporter",
      "com.google.javascript.rhino.jstype.UnknownType",
      "com.google.javascript.rhino.jstype.ValueType",
      "com.google.javascript.rhino.jstype.BooleanType",
      "com.google.javascript.rhino.jstype.NoObjectType",
      "com.google.common.collect.AbstractIterator",
      "com.google.javascript.rhino.jstype.JSType$TypePair",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.common.collect.MapDifference",
      "com.google.javascript.rhino.jstype.ErrorFunctionType",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.common.collect.Lists$ImmutableListWithNullElementsException",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.common.collect.EmptyImmutableList",
      "com.google.common.base.Joiner$1",
      "com.google.common.base.Joiner$2",
      "com.google.common.collect.AbstractMultimap$WrappedList",
      "com.google.common.collect.ImmutableCollection",
      "com.google.javascript.rhino.jstype.TernaryValue",
      "com.google.common.collect.AbstractMultimap$EntrySet",
      "com.google.javascript.rhino.jstype.IndexedType",
      "com.google.common.collect.AbstractMultimap$RandomAccessWrappedList",
      "com.google.javascript.rhino.testing.EmptyScope",
      "com.google.common.collect.ImmutableEnumSet",
      "com.google.common.collect.AbstractMultimap$Entries",
      "com.google.common.collect.HashMultimap",
      "com.google.javascript.rhino.jstype.EnumElementType",
      "com.google.javascript.rhino.jstype.UnionType",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$2",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$3",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$1",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.javascript.rhino.jstype.StaticSlot",
      "com.google.common.collect.Iterators$6",
      "com.google.common.collect.BiMap",
      "com.google.javascript.rhino.jstype.NoObjectType$LeastSupertypeVisitor",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.collect.Iterators$8",
      "com.google.common.collect.ImmutableSet",
      "com.google.javascript.rhino.Node$1",
      "com.google.javascript.rhino.jstype.EnumType",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.AbstractMultimap$SortedKeySet",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.Iterators$3",
      "com.google.common.collect.Sets",
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.javascript.rhino.jstype.BooleanLiteralSet",
      "com.google.common.collect.AbstractMultimap$SortedAsMap",
      "com.google.common.collect.Multiset",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.collect.Multimap",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.ImmutableList",
      "com.google.javascript.rhino.jstype.StringType",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.common.collect.AbstractMultimap$KeySet",
      "com.google.javascript.rhino.jstype.Visitor",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.javascript.rhino.jstype.AllType",
      "com.google.common.collect.Maps",
      "com.google.common.collect.SetMultimap",
      "com.google.javascript.rhino.jstype.FunctionType$Kind"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(UnionType_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.javascript.rhino.jstype.JSType$1",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.rhino.jstype.UnionType",
      "com.google.javascript.rhino.jstype.TernaryValue",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.javascript.rhino.jstype.BooleanLiteralSet",
      "com.google.javascript.rhino.SimpleErrorReporter",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.common.base.Joiner",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.Collections2",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.common.collect.Maps",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.collect.HashMultimap",
      "com.google.common.collect.AbstractListMultimap",
      "com.google.common.collect.ArrayListMultimap",
      "com.google.javascript.rhino.jstype.ValueType",
      "com.google.javascript.rhino.jstype.BooleanType",
      "com.google.javascript.rhino.jstype.NullType",
      "com.google.javascript.rhino.jstype.NumberType",
      "com.google.javascript.rhino.jstype.StringType",
      "com.google.javascript.rhino.jstype.ObjectType",
      "com.google.javascript.rhino.jstype.UnknownType",
      "com.google.javascript.rhino.jstype.VoidType",
      "com.google.javascript.rhino.jstype.AllType",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.javascript.rhino.jstype.FunctionPrototypeType",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.javascript.rhino.jstype.FunctionParamBuilder",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.rhino.Node$PropListItem",
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.EmptyImmutableList",
      "com.google.javascript.rhino.jstype.FunctionType$Kind",
      "com.google.javascript.rhino.jstype.InstanceObjectType",
      "com.google.javascript.rhino.jstype.ArrowType",
      "com.google.common.collect.Sets",
      "com.google.common.collect.Lists",
      "com.google.javascript.rhino.jstype.NoObjectType",
      "com.google.javascript.rhino.jstype.NoType",
      "com.google.javascript.rhino.jstype.NoObjectType$LeastSupertypeVisitor",
      "com.google.javascript.rhino.jstype.NoObjectType$GreatestSupertypeVisitor",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$1",
      "com.google.javascript.rhino.jstype.ErrorFunctionType",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$2",
      "com.google.javascript.rhino.jstype.UnionTypeBuilder",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$3",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.javascript.rhino.jstype.ProxyObjectType",
      "com.google.javascript.rhino.jstype.TemplateType",
      "com.google.javascript.rhino.RhinoException",
      "com.google.javascript.rhino.EvaluatorException",
      "com.google.javascript.rhino.jstype.EnumElementType",
      "com.google.javascript.rhino.jstype.EnumType",
      "com.google.javascript.rhino.jstype.JSType$TypePair",
      "com.google.javascript.rhino.testing.EmptyScope",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.javascript.rhino.jstype.RecordTypeBuilder",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.javascript.rhino.Node$SiblingNodeIterable",
      "com.google.javascript.rhino.jstype.NamedType",
      "com.google.javascript.rhino.Node$FileLevelJsDocBuilder",
      "com.google.javascript.rhino.jstype.RecordType",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.SingletonImmutableMap",
      "com.google.common.collect.Iterables",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.collect.Iterators$14",
      "com.google.javascript.rhino.jstype.PrototypeObjectType$Property",
      "com.google.javascript.rhino.Token",
      "com.google.javascript.rhino.jstype.IndexedType",
      "com.google.javascript.rhino.jstype.JSType$2",
      "com.google.javascript.rhino.jstype.ParameterizedType",
      "com.google.common.collect.AbstractMultimap$WrappedCollection",
      "com.google.common.collect.AbstractMultimap$WrappedList",
      "com.google.common.collect.AbstractMultimap$RandomAccessWrappedList",
      "com.google.common.collect.AbstractMultimap$WrappedCollection$WrappedIterator",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.common.collect.AbstractMultimap$WrappedSet",
      "com.google.common.collect.AbstractMultimap$Values",
      "com.google.common.collect.AbstractMultimap$ValueIterator",
      "com.google.common.collect.AbstractMultimap$EntryIterator",
      "com.google.common.collect.AbstractMultimap$Entries",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo",
      "com.google.common.collect.Iterables$3",
      "com.google.common.collect.Iterables$IterableWithToString",
      "com.google.common.collect.Iterables$10",
      "com.google.common.collect.Iterables$4",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.Hashing",
      "com.google.javascript.rhino.jstype.SimpleSlot",
      "com.google.common.collect.Iterators$9",
      "com.google.common.collect.Iterators$5"
    );
  }
}
