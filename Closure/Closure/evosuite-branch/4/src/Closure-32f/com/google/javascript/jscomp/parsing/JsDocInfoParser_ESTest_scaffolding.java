/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jan 06 06:04:52 GMT 2019
 */

package com.google.javascript.jscomp.parsing;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class JsDocInfoParser_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.javascript.jscomp.parsing.JsDocInfoParser"; 
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
    java.lang.System.setProperty("user.dir", "/tmp/run_evosuite.pl_232405_1546754567"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JsDocInfoParser_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.javascript.rhino.head.RegExpProxy",
      "com.google.common.collect.Hashing",
      "com.google.javascript.rhino.head.Icode",
      "com.google.javascript.rhino.head.DefaultErrorReporter",
      "com.google.javascript.rhino.JSDocInfo$Visibility",
      "com.google.javascript.rhino.head.Script",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.javascript.rhino.head.ScriptRuntime$DefaultMessageProvider",
      "com.google.javascript.rhino.head.WrappedException",
      "com.google.common.collect.Collections2",
      "com.google.javascript.rhino.head.debug.DebuggableObject",
      "com.google.common.collect.PeekingIterator",
      "com.google.javascript.rhino.head.jdk13.VMBridge_jdk13",
      "com.google.common.collect.RegularImmutableList",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser",
      "com.google.javascript.rhino.head.ast.Comment",
      "com.google.javascript.rhino.head.Function",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.javascript.rhino.head.ScriptableObject$RelinkedSlot",
      "com.google.javascript.rhino.Node$PropListItem",
      "com.google.javascript.jscomp.parsing.JsDocToken",
      "com.google.common.collect.RegularImmutableMap$KeySet",
      "com.google.common.collect.Sets$2",
      "com.google.javascript.rhino.Node$IntPropListItem",
      "com.google.common.collect.Sets$3",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.rhino.head.RhinoException",
      "com.google.common.collect.Sets$1",
      "com.google.javascript.rhino.SourcePosition",
      "com.google.common.collect.ImmutableSet$ArrayImmutableSet",
      "com.google.javascript.jscomp.parsing.NullErrorReporter$NewRhinoNullReporter",
      "com.google.javascript.rhino.JSDocInfo$Marker",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.javascript.rhino.Node$NodeMismatch",
      "com.google.javascript.rhino.head.ContextFactory$Listener",
      "com.google.javascript.rhino.head.ErrorReporter",
      "com.google.javascript.rhino.head.optimizer.Codegen",
      "com.google.javascript.rhino.head.ast.Jump",
      "com.google.javascript.rhino.head.NativeCall",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser$1",
      "com.google.javascript.jscomp.parsing.NullErrorReporter",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.Iterators$12",
      "com.google.javascript.rhino.head.ast.Scope",
      "com.google.common.collect.Iterators$11",
      "com.google.javascript.rhino.head.Scriptable",
      "com.google.common.base.Predicate",
      "com.google.javascript.rhino.head.EcmaError",
      "com.google.javascript.rhino.head.FunctionObject",
      "com.google.common.base.Joiner",
      "com.google.javascript.rhino.head.NativeContinuation",
      "com.google.javascript.rhino.Node$SiblingNodeIterable",
      "com.google.common.collect.SingletonImmutableMap",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.rhino.head.xml.XMLObject",
      "com.google.common.collect.ImmutableAsList",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.rhino.head.xml.XMLLib$Factory",
      "com.google.common.collect.Sets$SetView",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.collect.Iterators$14",
      "com.google.common.collect.Iterators$13",
      "com.google.javascript.rhino.InputId",
      "com.google.javascript.rhino.head.InterpretedFunction",
      "com.google.common.collect.RegularImmutableMap$LinkedEntry",
      "com.google.common.collect.Lists$Partition",
      "com.google.common.collect.Lists",
      "com.google.javascript.rhino.head.ast.AstRoot",
      "com.google.javascript.rhino.head.Token$CommentType",
      "com.google.javascript.rhino.Node$SideEffectFlags",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.RegularImmutableMap$TerminalEntry",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "com.google.javascript.rhino.head.NativeNumber",
      "com.google.javascript.rhino.ErrorReporter",
      "com.google.javascript.rhino.Token",
      "com.google.javascript.rhino.Node$FileLevelJsDocBuilder",
      "com.google.javascript.rhino.jstype.StaticSourceFile",
      "com.google.javascript.rhino.head.ScriptableObject$Slot",
      "org.mozilla.classfile.ClassFileWriter$ClassFileFormatException",
      "com.google.common.collect.AbstractIterator",
      "com.google.javascript.rhino.head.ScriptableObject$GetterSlot",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.javascript.rhino.head.Context$ClassShutterSetter",
      "com.google.javascript.rhino.head.ScriptRuntime$MessageProvider",
      "com.google.javascript.rhino.head.GeneratedClassLoader",
      "com.google.common.collect.MapDifference",
      "com.google.common.collect.RegularImmutableMap$NonTerminalEntry",
      "com.google.javascript.rhino.head.ast.FunctionNode",
      "com.google.javascript.rhino.head.ast.AstNode",
      "com.google.common.base.Preconditions",
      "com.google.javascript.rhino.head.ast.ErrorCollector",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.javascript.rhino.head.Context",
      "com.google.javascript.jscomp.parsing.Config",
      "com.google.javascript.rhino.head.SecurityController",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.base.Joiner$1",
      "com.google.common.base.Joiner$2",
      "com.google.common.collect.ImmutableSet$TransformedImmutableSet",
      "com.google.javascript.rhino.head.Callable",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser$WhitespaceOption",
      "com.google.javascript.rhino.head.Token",
      "com.google.common.collect.ImmutableCollection",
      "com.google.javascript.rhino.head.debug.Debugger",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser$State",
      "com.google.javascript.rhino.head.Node",
      "com.google.javascript.rhino.head.NativeBoolean",
      "com.google.javascript.rhino.head.ast.Name",
      "com.google.javascript.rhino.Node$AncestorIterable",
      "com.google.javascript.rhino.head.ClassShutter",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.google.common.collect.ImmutableEnumSet",
      "com.google.javascript.rhino.ScriptRuntime",
      "com.google.javascript.rhino.head.ast.ScriptNode",
      "com.google.javascript.rhino.head.NativeArray",
      "com.google.javascript.rhino.head.tools.ToolErrorReporter",
      "com.google.javascript.rhino.head.WrapFactory",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.common.collect.Iterators$6",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.Iterators$7",
      "com.google.javascript.rhino.head.NativeString",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser",
      "com.google.javascript.rhino.head.ContextFactory",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.base.Function",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.google.common.collect.ImmutableMap",
      "com.google.javascript.rhino.head.VMBridge",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.javascript.rhino.jstype.SimpleSourceFile",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.Iterators$3",
      "com.google.common.collect.Sets",
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.javascript.rhino.head.Evaluator",
      "com.google.javascript.rhino.head.Kit",
      "com.google.javascript.jscomp.parsing.Annotation",
      "com.google.javascript.rhino.head.ContextListener",
      "com.google.javascript.rhino.head.jdk15.VMBridge_jdk15",
      "com.google.javascript.rhino.Node$ObjectPropListItem",
      "com.google.javascript.rhino.head.ContinuationPending",
      "com.google.javascript.rhino.head.ContextAction",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.google.javascript.rhino.head.ast.IdeErrorReporter",
      "com.google.common.collect.Lists$2",
      "com.google.javascript.rhino.head.JavaScriptException",
      "com.google.javascript.rhino.IR",
      "com.google.javascript.rhino.head.EvaluatorException",
      "com.google.javascript.rhino.head.ast.NumberLiteral",
      "com.google.common.collect.Lists$1",
      "com.google.javascript.rhino.head.TopLevel",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser$ExtractionInfo",
      "com.google.javascript.rhino.head.BaseFunction",
      "com.google.common.collect.EmptyImmutableMap",
      "com.google.javascript.jscomp.parsing.JsDocTokenStream",
      "com.google.javascript.rhino.JSDocInfoBuilder",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.common.collect.Iterators",
      "com.google.javascript.rhino.head.IdFunctionCall",
      "com.google.javascript.rhino.JSDocInfo$NamePosition",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation",
      "com.google.common.collect.ImmutableList",
      "com.google.javascript.rhino.head.Interpreter",
      "com.google.javascript.rhino.head.ImporterTopLevel",
      "com.google.javascript.rhino.Node$AbstractPropListItem",
      "com.google.javascript.jscomp.parsing.Config$LanguageMode",
      "com.google.common.collect.RegularImmutableMap$EntrySet",
      "com.google.javascript.rhino.head.ScriptRuntime$1",
      "com.google.javascript.rhino.head.ScriptRuntime",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.Maps",
      "com.google.javascript.rhino.head.ContextFactory$GlobalSetter",
      "com.google.javascript.rhino.head.ast.NodeVisitor",
      "com.google.javascript.rhino.head.ConstProperties",
      "com.google.common.collect.Maps$EntryTransformer",
      "com.google.javascript.rhino.JSTypeExpression",
      "com.google.javascript.rhino.head.ScriptableObject",
      "com.google.javascript.rhino.head.IdScriptableObject",
      "com.google.common.collect.RegularImmutableMap$Values",
      "com.google.javascript.rhino.head.NativeFunction",
      "com.google.javascript.rhino.head.debug.DebuggableScript",
      "com.google.javascript.rhino.head.NativeObject"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JsDocInfoParser_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.ImmutableSet$ArrayImmutableSet",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser$ExtractionInfo",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser$ExtendedTypeInfo",
      "com.google.javascript.jscomp.parsing.Config$LanguageMode",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser$State",
      "com.google.javascript.jscomp.parsing.JsDocToken",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.Lists",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.base.Preconditions",
      "com.google.common.base.Joiner",
      "com.google.common.collect.Collections2",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.common.collect.Maps",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.RegularImmutableMap$TerminalEntry",
      "com.google.common.collect.RegularImmutableMap$NonTerminalEntry",
      "com.google.javascript.jscomp.parsing.Annotation",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser$1",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser$WhitespaceOption",
      "com.google.javascript.rhino.JSDocInfo$Visibility",
      "com.google.javascript.jscomp.parsing.JsDocTokenStream",
      "com.google.javascript.rhino.head.Node",
      "com.google.javascript.rhino.head.ast.AstNode",
      "com.google.javascript.rhino.head.ast.Comment",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.jscomp.parsing.Config",
      "com.google.common.collect.Sets",
      "com.google.common.collect.RegularImmutableMap$EntrySet",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$11",
      "com.google.javascript.jscomp.parsing.NullErrorReporter",
      "com.google.javascript.jscomp.parsing.NullErrorReporter$NewRhinoNullReporter",
      "com.google.javascript.rhino.JSDocInfoBuilder",
      "com.google.javascript.rhino.IR",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.rhino.Node$AbstractPropListItem",
      "com.google.javascript.rhino.Node$IntPropListItem",
      "com.google.javascript.rhino.head.tools.ToolErrorReporter",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.javascript.rhino.head.Kit",
      "com.google.javascript.rhino.head.ContextFactory",
      "com.google.javascript.rhino.head.ScriptableObject",
      "com.google.javascript.rhino.head.ScriptRuntime$DefaultMessageProvider",
      "com.google.javascript.rhino.head.ScriptRuntime",
      "com.google.javascript.rhino.head.optimizer.Codegen",
      "com.google.javascript.rhino.head.Icode",
      "com.google.javascript.rhino.head.Interpreter",
      "com.google.javascript.rhino.head.Context",
      "com.google.javascript.rhino.head.jdk13.VMBridge_jdk13",
      "com.google.javascript.rhino.head.jdk15.VMBridge_jdk15",
      "com.google.javascript.rhino.head.VMBridge",
      "com.google.javascript.rhino.head.DefaultErrorReporter",
      "com.google.javascript.rhino.Node$FileLevelJsDocBuilder",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo",
      "com.google.javascript.rhino.Node$ObjectPropListItem",
      "com.google.javascript.rhino.Node$SideEffectFlags",
      "com.google.javascript.rhino.Token",
      "com.google.javascript.rhino.ScriptRuntime",
      "com.google.javascript.rhino.head.ast.XmlRef",
      "com.google.javascript.rhino.head.ast.XmlPropRef",
      "com.google.javascript.rhino.head.ast.NumberLiteral",
      "com.google.javascript.rhino.head.Node$NodeIterator",
      "com.google.javascript.rhino.head.ast.LabeledStatement",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation",
      "com.google.javascript.rhino.head.ast.ErrorCollector",
      "com.google.javascript.rhino.jstype.JSType$1",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.rhino.jstype.ObjectType",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.javascript.rhino.head.ast.ParseProblem",
      "com.google.javascript.rhino.head.ast.ParseProblem$Type",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.EmptyImmutableList$1",
      "com.google.common.collect.EmptyImmutableList",
      "com.google.javascript.rhino.head.ast.TryStatement",
      "com.google.javascript.rhino.head.ast.Name",
      "com.google.javascript.rhino.head.SecurityController",
      "com.google.javascript.rhino.jstype.SimpleSourceFile",
      "com.google.javascript.rhino.head.IdScriptableObject",
      "com.google.javascript.rhino.head.BaseFunction",
      "com.google.javascript.rhino.head.RhinoException",
      "com.google.javascript.rhino.head.EcmaError",
      "com.google.javascript.rhino.head.Undefined",
      "com.google.javascript.rhino.head.UniqueTag",
      "com.google.javascript.rhino.head.Scriptable",
      "com.google.javascript.rhino.head.Node$PropListItem",
      "com.google.javascript.rhino.head.NativeObject",
      "com.google.javascript.rhino.head.JavaAdapter",
      "com.google.javascript.rhino.head.NativeJavaObject",
      "com.google.javascript.rhino.head.NativeJavaClass",
      "com.google.javascript.rhino.head.JavaMembers",
      "com.google.javascript.rhino.head.ClassCache",
      "com.google.javascript.rhino.head.ast.StringLiteral",
      "com.google.javascript.rhino.head.ast.ExpressionStatement",
      "com.google.javascript.rhino.head.ast.Jump",
      "com.google.javascript.rhino.head.ast.Scope",
      "com.google.javascript.rhino.head.NativeGlobal",
      "com.google.javascript.rhino.head.SecurityUtilities",
      "com.google.javascript.rhino.head.SecurityUtilities$1",
      "com.google.javascript.rhino.Node$SiblingNodeIterable",
      "com.google.javascript.rhino.head.NativeContinuation",
      "com.google.javascript.rhino.head.NativeObject$ValueCollection",
      "com.google.javascript.rhino.head.NativeJavaArray",
      "com.google.javascript.rhino.head.EvaluatorException",
      "com.google.javascript.rhino.head.ast.ArrayComprehension",
      "com.google.javascript.rhino.head.ast.Label",
      "org.mozilla.classfile.ClassFileWriter",
      "com.google.javascript.rhino.head.ObjArray",
      "org.mozilla.classfile.ConstantPool",
      "com.google.javascript.rhino.head.UintMap",
      "com.google.javascript.rhino.head.ObjToIntMap",
      "org.mozilla.classfile.ClassFileMethod",
      "org.mozilla.classfile.FieldOrMethodRef",
      "com.google.javascript.rhino.head.PolicySecurityController",
      "com.google.javascript.rhino.head.NativeArray",
      "com.google.javascript.rhino.head.WrapFactory",
      "com.google.javascript.rhino.head.TopLevel",
      "com.google.javascript.rhino.head.ImporterTopLevel",
      "com.google.javascript.rhino.head.IdScriptableObject$PrototypeValues",
      "com.google.javascript.rhino.head.IdFunctionObject",
      "com.google.javascript.rhino.head.ScriptableObject$Slot",
      "com.google.javascript.rhino.head.ScriptableObject$RelinkedSlot",
      "com.google.javascript.rhino.head.NativeError",
      "com.google.javascript.rhino.head.NativeString",
      "com.google.javascript.rhino.head.NativeBoolean",
      "com.google.javascript.rhino.head.NativeNumber",
      "com.google.javascript.rhino.head.NativeDate",
      "com.google.javascript.rhino.head.NativeMath",
      "com.google.javascript.rhino.head.NativeJSON",
      "com.google.javascript.rhino.head.NativeWith",
      "com.google.javascript.rhino.head.NativeCall",
      "com.google.javascript.rhino.head.NativeScript",
      "com.google.javascript.rhino.head.NativeIterator",
      "com.google.javascript.rhino.head.NativeGenerator",
      "com.google.javascript.rhino.head.NativeIterator$StopIteration",
      "com.google.javascript.rhino.head.xml.XMLLib$Factory",
      "com.google.javascript.rhino.head.xml.XMLLib$Factory$1",
      "com.google.javascript.rhino.head.LazilyLoadedCtor",
      "com.google.javascript.rhino.head.ScriptableObject$GetterSlot",
      "com.google.javascript.rhino.head.LazilyLoadedCtor$1",
      "com.google.javascript.rhino.head.regexp.NativeRegExp",
      "com.google.javascript.rhino.head.FunctionObject",
      "com.google.javascript.rhino.head.regexp.RECompiled",
      "com.google.javascript.rhino.head.regexp.CompilerState",
      "com.google.javascript.rhino.head.regexp.RENode",
      "com.google.javascript.rhino.head.regexp.NativeRegExpCtor",
      "com.google.javascript.rhino.head.JavaMembers$MethodSignature",
      "com.google.javascript.rhino.head.MemberBox",
      "com.google.javascript.rhino.head.NativeJavaMethod",
      "com.google.javascript.rhino.head.BeanProperty",
      "com.google.javascript.rhino.head.ast.ArrayLiteral",
      "com.google.javascript.rhino.head.ast.UnaryExpression",
      "com.google.javascript.rhino.head.ast.FunctionCall",
      "com.google.javascript.rhino.head.NativeJavaPackage",
      "com.google.javascript.rhino.head.ast.ScriptNode",
      "com.google.javascript.rhino.head.ast.FunctionNode",
      "com.google.javascript.rhino.head.ast.FunctionNode$Form",
      "com.google.javascript.rhino.head.CompilerEnvirons",
      "com.google.javascript.rhino.head.Parser",
      "com.google.javascript.rhino.head.TokenStream",
      "com.google.javascript.rhino.head.ast.AstRoot",
      "com.google.javascript.rhino.head.ast.SwitchCase",
      "com.google.javascript.rhino.head.ast.Loop",
      "com.google.javascript.rhino.head.ast.DoLoop",
      "com.google.javascript.rhino.head.JavaScriptException",
      "com.google.javascript.rhino.head.Token",
      "com.google.javascript.rhino.head.NativeFunction",
      "com.google.javascript.rhino.head.ast.InfixExpression",
      "com.google.javascript.rhino.head.ast.PropertyGet",
      "com.google.javascript.rhino.head.WrappedException",
      "com.google.javascript.rhino.head.ast.XmlElemRef",
      "com.google.javascript.rhino.head.ast.ForInLoop",
      "com.google.javascript.rhino.head.ast.GeneratorExpressionLoop",
      "com.google.javascript.rhino.head.ast.AstNode$DebugPrintVisitor",
      "com.google.javascript.rhino.head.Delegator",
      "com.google.javascript.rhino.head.Synchronizer",
      "com.google.javascript.rhino.head.ast.ErrorNode",
      "com.google.javascript.rhino.head.ast.GeneratorExpression",
      "com.google.javascript.rhino.Node$NodeMismatch",
      "com.google.javascript.rhino.head.ast.XmlMemberGet",
      "com.google.javascript.rhino.head.ast.XmlFragment",
      "com.google.javascript.rhino.head.ast.XmlString",
      "com.google.javascript.rhino.head.ast.ForLoop",
      "com.google.javascript.rhino.InputId",
      "com.google.javascript.rhino.head.ast.ElementGet",
      "com.google.javascript.rhino.head.ast.CatchClause",
      "com.google.javascript.rhino.head.ast.LetNode",
      "com.google.javascript.rhino.head.ast.WithStatement",
      "com.google.javascript.rhino.Node$AncestorIterable",
      "com.google.javascript.rhino.head.ast.KeywordLiteral",
      "com.google.javascript.rhino.head.Context$2",
      "com.google.javascript.rhino.head.ContinuationPending",
      "com.google.javascript.rhino.head.ast.IfStatement",
      "com.google.javascript.rhino.head.ast.ContinueStatement",
      "com.google.javascript.rhino.head.ast.Assignment",
      "com.google.javascript.rhino.head.ast.ParenthesizedExpression",
      "com.google.javascript.rhino.head.Context$1",
      "com.google.javascript.rhino.head.ast.Symbol",
      "com.google.javascript.rhino.head.ContextFactory$1",
      "com.google.javascript.rhino.head.DefiningClassLoader",
      "com.google.javascript.rhino.head.ast.ArrayComprehensionLoop",
      "com.google.javascript.rhino.head.IRFactory",
      "com.google.javascript.rhino.head.Decompiler",
      "com.google.javascript.rhino.head.NodeTransformer",
      "com.google.javascript.rhino.head.optimizer.OptTransformer",
      "org.mozilla.classfile.ClassFileField",
      "com.google.javascript.rhino.head.optimizer.BodyCodegen",
      "com.google.javascript.rhino.head.optimizer.BodyCodegen$ExceptionManager",
      "com.google.javascript.rhino.head.SecurityUtilities$2",
      "com.google.javascript.rhino.SimpleErrorReporter",
      "com.google.javascript.rhino.head.NativeObject$KeySet",
      "com.google.javascript.rhino.head.ast.SwitchStatement",
      "com.google.javascript.rhino.head.ast.ObjectProperty",
      "com.google.javascript.rhino.head.ast.ConditionalExpression",
      "com.google.javascript.rhino.head.ast.EmptyExpression",
      "com.google.javascript.rhino.head.ast.ThrowStatement",
      "com.google.javascript.rhino.head.NativeArray$3",
      "com.google.javascript.rhino.head.ast.XmlExpression",
      "com.google.javascript.rhino.head.ast.VariableInitializer",
      "com.google.javascript.rhino.head.ast.BreakStatement",
      "com.google.javascript.rhino.head.v8dtoa.FastDtoa",
      "com.google.javascript.rhino.head.v8dtoa.FastDtoaBuilder",
      "com.google.javascript.rhino.head.v8dtoa.DoubleHelper",
      "com.google.javascript.rhino.head.v8dtoa.DiyFp",
      "com.google.javascript.rhino.head.v8dtoa.CachedPowers$CachedPower",
      "com.google.javascript.rhino.head.v8dtoa.CachedPowers",
      "com.google.javascript.rhino.head.ast.Yield",
      "com.google.javascript.rhino.head.ast.RegExpLiteral",
      "com.google.javascript.rhino.head.ast.ObjectLiteral",
      "com.google.javascript.rhino.head.BoundFunction",
      "com.google.javascript.rhino.head.ast.XmlLiteral"
    );
  }
}
