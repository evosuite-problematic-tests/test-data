/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Jan 07 05:10:45 GMT 2019
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
    java.lang.System.setProperty("user.dir", "/tmp/run_evosuite.pl_92226_1546837728"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JsDocInfoParser_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.Hashing",
      "com.google.common.collect.Sets$CartesianSet",
      "com.google.javascript.rhino.JSDocInfo$Visibility",
      "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.common.collect.Collections2",
      "com.google.javascript.jscomp.mozilla.rhino.ast.Scope",
      "com.google.javascript.jscomp.mozilla.rhino.BaseFunction",
      "com.google.common.collect.PeekingIterator",
      "com.google.javascript.jscomp.mozilla.rhino.ImporterTopLevel",
      "com.google.javascript.jscomp.mozilla.rhino.IdScriptableObject",
      "com.google.javascript.jscomp.mozilla.rhino.EvaluatorException",
      "com.google.javascript.rhino.EvaluatorException",
      "com.google.common.collect.RegularImmutableList",
      "com.google.javascript.jscomp.mozilla.rhino.Callable",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptableObject$Slot",
      "com.google.javascript.jscomp.mozilla.rhino.MemberBox",
      "com.google.javascript.jscomp.mozilla.rhino.NativeObject",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.javascript.jscomp.mozilla.rhino.WrapFactory",
      "com.google.javascript.rhino.Node$PropListItem",
      "com.google.javascript.rhino.RhinoException",
      "com.google.javascript.jscomp.parsing.JsDocToken",
      "com.google.javascript.jscomp.mozilla.rhino.NativeArray",
      "com.google.common.collect.RegularImmutableMap$KeySet",
      "com.google.common.collect.Sets$2",
      "com.google.common.collect.Sets$3",
      "com.google.javascript.jscomp.mozilla.rhino.WrappedException",
      "com.google.javascript.rhino.Node",
      "com.google.common.collect.Sets$1",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptableObject",
      "com.google.javascript.jscomp.mozilla.rhino.Node",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime$MessageProvider",
      "com.google.javascript.jscomp.mozilla.rhino.Icode",
      "com.google.common.collect.ImmutableSet$ArrayImmutableSet",
      "com.google.javascript.jscomp.mozilla.rhino.NativeFunction",
      "com.google.javascript.jscomp.parsing.NullErrorReporter$NewRhinoNullReporter",
      "com.google.javascript.rhino.JSDocInfo$Marker",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.javascript.rhino.Node$NodeMismatch",
      "com.google.javascript.jscomp.mozilla.rhino.ContextFactory$Listener",
      "com.google.javascript.jscomp.mozilla.rhino.ast.Name",
      "com.google.javascript.jscomp.mozilla.rhino.debug.DebuggableScript",
      "com.google.javascript.jscomp.mozilla.rhino.SecurityController",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser$1",
      "com.google.javascript.jscomp.parsing.NullErrorReporter",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.javascript.jscomp.mozilla.rhino.ContinuationPending",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.Iterators$12",
      "com.google.common.collect.Iterators$11",
      "com.google.javascript.rhino.Context",
      "com.google.common.base.Predicate",
      "com.google.javascript.jscomp.mozilla.rhino.IdFunctionCall",
      "com.google.common.base.Joiner",
      "com.google.javascript.jscomp.mozilla.rhino.debug.DebuggableObject",
      "com.google.javascript.rhino.Node$SiblingNodeIterable",
      "com.google.common.collect.SingletonImmutableMap",
      "com.google.javascript.jscomp.mozilla.rhino.ContextFactory$GlobalSetter",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.common.collect.ImmutableAsList",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.jscomp.mozilla.rhino.ClassShutter",
      "com.google.common.collect.Sets$SetView",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.collect.Iterators$14",
      "com.google.common.collect.Iterators$13",
      "com.google.javascript.jscomp.mozilla.rhino.GeneratedClassLoader",
      "com.google.common.collect.RegularImmutableMap$LinkedEntry",
      "com.google.javascript.jscomp.mozilla.rhino.Kit",
      "com.google.common.collect.Lists$Partition",
      "com.google.common.collect.Lists",
      "com.google.javascript.rhino.Node$SideEffectFlags",
      "com.google.javascript.jscomp.mozilla.rhino.FunctionObject",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.RegularImmutableMap$TerminalEntry",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ErrorCollector",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "com.google.javascript.rhino.ErrorReporter",
      "com.google.javascript.rhino.Token",
      "com.google.javascript.rhino.Node$FileLevelJsDocBuilder",
      "com.google.javascript.jscomp.mozilla.rhino.xml.XMLLib$Factory",
      "org.mozilla.classfile.ClassFileWriter$ClassFileFormatException",
      "com.google.common.collect.AbstractIterator",
      "com.google.javascript.jscomp.mozilla.rhino.NativeCall",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.javascript.jscomp.mozilla.rhino.EcmaError",
      "com.google.common.collect.MapDifference",
      "com.google.common.collect.RegularImmutableMap$NonTerminalEntry",
      "com.google.javascript.rhino.EcmaError",
      "com.google.javascript.jscomp.mozilla.rhino.xml.XMLObject",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.javascript.jscomp.mozilla.rhino.Context$ClassShutterSetter",
      "com.google.javascript.jscomp.parsing.Config",
      "com.google.common.collect.ImmutableEntry",
      "com.google.javascript.jscomp.mozilla.rhino.Evaluator",
      "com.google.common.base.Joiner$1",
      "com.google.common.base.Joiner$2",
      "com.google.common.collect.ImmutableSet$TransformedImmutableSet",
      "com.google.javascript.jscomp.mozilla.rhino.ast.AstNode",
      "com.google.javascript.jscomp.mozilla.rhino.tools.ToolErrorReporter",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser$WhitespaceOption",
      "com.google.javascript.jscomp.mozilla.rhino.ContextListener",
      "com.google.common.collect.ImmutableCollection",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser$State",
      "com.google.javascript.jscomp.mozilla.rhino.ast.Jump",
      "com.google.javascript.rhino.Node$AncestorIterable",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.google.javascript.rhino.ScriptRuntime",
      "com.google.common.collect.ImmutableEnumSet",
      "com.google.javascript.jscomp.mozilla.rhino.Context",
      "com.google.javascript.jscomp.mozilla.rhino.ast.Comment",
      "com.google.javascript.jscomp.mozilla.rhino.RegExpProxy",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.javascript.jscomp.mozilla.rhino.Function",
      "com.google.common.collect.Iterators$6",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.Iterators$7",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.base.Function",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.google.common.collect.ImmutableMap",
      "com.google.javascript.jscomp.mozilla.rhino.Scriptable",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptableObject$GetterSlot",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$2",
      "com.google.javascript.jscomp.mozilla.rhino.Interpreter",
      "com.google.common.collect.Iterators$3",
      "com.google.common.collect.Sets",
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.javascript.jscomp.mozilla.rhino.RhinoException",
      "com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode",
      "com.google.javascript.jscomp.parsing.Annotation",
      "com.google.javascript.rhino.ScriptOrFnNode",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.google.javascript.jscomp.mozilla.rhino.ContextAction",
      "com.google.common.collect.Lists$2",
      "com.google.javascript.jscomp.mozilla.rhino.optimizer.Codegen",
      "com.google.javascript.jscomp.mozilla.rhino.ast.NodeVisitor",
      "com.google.common.collect.Lists$1",
      "com.google.javascript.jscomp.mozilla.rhino.InterpretedFunction",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser$ExtractionInfo",
      "com.google.javascript.jscomp.mozilla.rhino.DefaultErrorReporter",
      "com.google.javascript.jscomp.mozilla.rhino.debug.Debugger",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime",
      "com.google.common.collect.EmptyImmutableMap",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime$DefaultMessageProvider",
      "com.google.javascript.jscomp.parsing.JsDocTokenStream",
      "com.google.javascript.rhino.JSDocInfoBuilder",
      "com.google.javascript.jscomp.mozilla.rhino.JavaScriptException",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.common.collect.Iterators",
      "com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral",
      "com.google.javascript.jscomp.mozilla.rhino.VMBridge",
      "com.google.javascript.jscomp.mozilla.rhino.jdk13.VMBridge_jdk13",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation",
      "com.google.common.collect.ImmutableList",
      "com.google.javascript.jscomp.mozilla.rhino.Token$CommentType",
      "com.google.javascript.jscomp.mozilla.rhino.ConstProperties",
      "com.google.javascript.jscomp.mozilla.rhino.NativeContinuation",
      "com.google.javascript.jscomp.parsing.Config$LanguageMode",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime$1",
      "com.google.common.collect.RegularImmutableMap$EntrySet",
      "com.google.javascript.jscomp.mozilla.rhino.Token",
      "com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.Maps",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ScriptNode",
      "com.google.common.collect.Maps$EntryTransformer",
      "com.google.javascript.rhino.JSTypeExpression",
      "com.google.javascript.jscomp.mozilla.rhino.ast.IdeErrorReporter",
      "com.google.javascript.jscomp.mozilla.rhino.Script",
      "com.google.javascript.jscomp.mozilla.rhino.ContextFactory",
      "com.google.common.collect.RegularImmutableMap$Values",
      "com.google.javascript.jscomp.mozilla.rhino.jdk15.VMBridge_jdk15"
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
      "com.google.javascript.jscomp.mozilla.rhino.Node",
      "com.google.javascript.jscomp.mozilla.rhino.ast.AstNode",
      "com.google.javascript.jscomp.mozilla.rhino.ast.Comment",
      "com.google.javascript.jscomp.parsing.Config",
      "com.google.javascript.jscomp.mozilla.rhino.tools.ToolErrorReporter",
      "com.google.javascript.rhino.JSDocInfoBuilder",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.rhino.Node$PropListItem",
      "com.google.common.collect.RegularImmutableMap$EntrySet",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$11",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ErrorCollector",
      "com.google.common.collect.Sets",
      "com.google.javascript.jscomp.parsing.NullErrorReporter",
      "com.google.javascript.jscomp.parsing.NullErrorReporter$NewRhinoNullReporter",
      "com.google.javascript.rhino.ScriptRuntime",
      "com.google.javascript.rhino.Context",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ParseProblem",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ParseProblem$Type",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.javascript.jscomp.mozilla.rhino.Kit",
      "com.google.javascript.jscomp.mozilla.rhino.ContextFactory",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptableObject$Slot",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptableObject",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime$DefaultMessageProvider",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime",
      "com.google.javascript.jscomp.mozilla.rhino.optimizer.Codegen",
      "com.google.javascript.jscomp.mozilla.rhino.Icode",
      "com.google.javascript.jscomp.mozilla.rhino.Interpreter",
      "com.google.javascript.jscomp.mozilla.rhino.Context",
      "com.google.javascript.jscomp.mozilla.rhino.DefaultErrorReporter",
      "com.google.javascript.jscomp.mozilla.rhino.jdk13.VMBridge_jdk13",
      "com.google.javascript.jscomp.mozilla.rhino.jdk15.VMBridge_jdk15",
      "com.google.javascript.jscomp.mozilla.rhino.VMBridge",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.EmptyImmutableList$1",
      "com.google.common.collect.EmptyImmutableList",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.javascript.rhino.Node$FileLevelJsDocBuilder",
      "com.google.javascript.jscomp.mozilla.rhino.WrapFactory",
      "com.google.javascript.jscomp.mozilla.rhino.IdScriptableObject",
      "com.google.javascript.jscomp.mozilla.rhino.NativeContinuation",
      "com.google.javascript.jscomp.mozilla.rhino.JavaAdapter",
      "com.google.javascript.jscomp.mozilla.rhino.NativeJavaObject",
      "com.google.javascript.jscomp.mozilla.rhino.JavaMembers",
      "com.google.javascript.jscomp.mozilla.rhino.ClassCache",
      "com.google.javascript.jscomp.mozilla.rhino.ast.Jump",
      "com.google.javascript.jscomp.mozilla.rhino.ast.Scope",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ArrayComprehension",
      "com.google.javascript.jscomp.mozilla.rhino.CompilerEnvirons",
      "com.google.javascript.jscomp.mozilla.rhino.Parser",
      "com.google.javascript.jscomp.mozilla.rhino.TokenStream",
      "com.google.javascript.jscomp.mozilla.rhino.ObjToIntMap",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ScriptNode",
      "com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot",
      "com.google.javascript.jscomp.mozilla.rhino.ast.Name",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ExpressionStatement",
      "com.google.javascript.jscomp.mozilla.rhino.Parser$ParserException",
      "com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression",
      "com.google.javascript.jscomp.mozilla.rhino.RhinoException",
      "com.google.javascript.jscomp.mozilla.rhino.EvaluatorException",
      "com.google.javascript.rhino.jstype.JSType$1",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.rhino.jstype.ObjectType",
      "com.google.javascript.jscomp.mozilla.rhino.Node$NodeIterator",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo",
      "com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression",
      "com.google.javascript.jscomp.mozilla.rhino.ast.PropertyGet",
      "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem",
      "com.google.javascript.rhino.Kit",
      "com.google.javascript.jscomp.mozilla.rhino.ast.KeywordLiteral",
      "com.google.javascript.jscomp.mozilla.rhino.ast.Loop",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ForInLoop",
      "com.google.javascript.rhino.Node$NodeMismatch",
      "com.google.javascript.rhino.Token",
      "com.google.javascript.jscomp.mozilla.rhino.NativeObject",
      "com.google.javascript.jscomp.mozilla.rhino.NativeGlobal",
      "com.google.javascript.jscomp.mozilla.rhino.EcmaError",
      "com.google.javascript.jscomp.mozilla.rhino.SecurityUtilities",
      "com.google.javascript.jscomp.mozilla.rhino.SecurityUtilities$1",
      "com.google.javascript.jscomp.mozilla.rhino.RhinoException$1",
      "com.google.javascript.jscomp.mozilla.rhino.Context$2",
      "com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase",
      "com.google.javascript.jscomp.mozilla.rhino.Delegator",
      "com.google.javascript.jscomp.mozilla.rhino.NativeArray",
      "com.google.javascript.jscomp.mozilla.rhino.ast.XmlDotQuery",
      "com.google.javascript.jscomp.mozilla.rhino.ImporterTopLevel",
      "com.google.javascript.jscomp.mozilla.rhino.ObjArray",
      "com.google.javascript.jscomp.mozilla.rhino.UniqueTag",
      "com.google.javascript.jscomp.mozilla.rhino.Scriptable",
      "com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement",
      "com.google.javascript.jscomp.mozilla.rhino.ast.XmlFragment",
      "com.google.javascript.jscomp.mozilla.rhino.ast.XmlExpression",
      "com.google.javascript.jscomp.mozilla.rhino.ast.Symbol",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement",
      "com.google.javascript.jscomp.mozilla.rhino.NativeJavaPackage",
      "com.google.javascript.rhino.Node$SideEffectFlags",
      "com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral",
      "com.google.javascript.jscomp.mozilla.rhino.BaseFunction",
      "com.google.javascript.jscomp.mozilla.rhino.ast.XmlString",
      "com.google.javascript.jscomp.mozilla.rhino.SecurityController",
      "com.google.javascript.jscomp.mozilla.rhino.FunctionObject",
      "com.google.javascript.jscomp.mozilla.rhino.MemberBox",
      "com.google.javascript.jscomp.mozilla.rhino.Context$1",
      "com.google.javascript.jscomp.mozilla.rhino.Undefined",
      "com.google.javascript.rhino.SimpleErrorReporter",
      "com.google.javascript.jscomp.mozilla.rhino.ast.LetNode",
      "com.google.javascript.jscomp.mozilla.rhino.JavaScriptException",
      "com.google.javascript.rhino.Node$SiblingNodeIterable",
      "com.google.javascript.jscomp.mozilla.rhino.ast.XmlMemberGet",
      "com.google.javascript.jscomp.mozilla.rhino.IdScriptableObject$PrototypeValues",
      "com.google.javascript.jscomp.mozilla.rhino.IdFunctionObject",
      "com.google.javascript.jscomp.mozilla.rhino.NativeError",
      "com.google.javascript.jscomp.mozilla.rhino.NativeString",
      "com.google.javascript.jscomp.mozilla.rhino.NativeBoolean",
      "com.google.javascript.jscomp.mozilla.rhino.NativeNumber",
      "com.google.javascript.jscomp.mozilla.rhino.NativeDate",
      "com.google.javascript.jscomp.mozilla.rhino.NativeMath",
      "com.google.javascript.jscomp.mozilla.rhino.NativeJSON",
      "com.google.javascript.jscomp.mozilla.rhino.NativeWith",
      "com.google.javascript.jscomp.mozilla.rhino.NativeCall",
      "com.google.javascript.jscomp.mozilla.rhino.NativeScript",
      "com.google.javascript.jscomp.mozilla.rhino.NativeIterator",
      "com.google.javascript.jscomp.mozilla.rhino.NativeGenerator",
      "com.google.javascript.jscomp.mozilla.rhino.NativeIterator$StopIteration",
      "com.google.javascript.jscomp.mozilla.rhino.xml.XMLLib$Factory",
      "com.google.javascript.jscomp.mozilla.rhino.xml.XMLLib$Factory$1",
      "com.google.javascript.jscomp.mozilla.rhino.LazilyLoadedCtor",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptableObject$GetterSlot",
      "com.google.javascript.rhino.Node$AncestorIterable",
      "com.google.javascript.jscomp.mozilla.rhino.ast.AstNode$DebugPrintVisitor",
      "com.google.javascript.jscomp.mozilla.rhino.Token",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ForLoop",
      "com.google.javascript.jscomp.mozilla.rhino.ast.XmlRef",
      "com.google.javascript.jscomp.mozilla.rhino.ast.XmlPropRef",
      "com.google.javascript.jscomp.mozilla.rhino.Synchronizer",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral",
      "com.google.javascript.jscomp.mozilla.rhino.NativeJavaClass",
      "com.google.javascript.jscomp.mozilla.rhino.ast.BreakStatement",
      "com.google.javascript.jscomp.mozilla.rhino.JavaMembers$MethodSignature",
      "com.google.javascript.jscomp.mozilla.rhino.NativeJavaMethod",
      "com.google.javascript.jscomp.mozilla.rhino.BeanProperty",
      "com.google.javascript.jscomp.mozilla.rhino.ContinuationPending",
      "com.google.javascript.jscomp.mozilla.rhino.ast.FunctionCall",
      "com.google.javascript.jscomp.mozilla.rhino.ast.NewExpression",
      "com.google.javascript.jscomp.mozilla.rhino.ast.WithStatement",
      "com.google.javascript.jscomp.mozilla.rhino.JavaAdapter$2",
      "com.google.javascript.jscomp.mozilla.rhino.tools.shell.Global",
      "com.google.javascript.jscomp.mozilla.rhino.tools.shell.Environment",
      "org.mozilla.classfile.ClassFileWriter",
      "org.mozilla.classfile.ConstantPool",
      "com.google.javascript.jscomp.mozilla.rhino.UintMap",
      "org.mozilla.classfile.ClassFileMethod",
      "org.mozilla.classfile.FieldOrMethodRef",
      "com.google.javascript.jscomp.mozilla.rhino.PolicySecurityController",
      "com.google.javascript.jscomp.mozilla.rhino.ast.VariableInitializer",
      "com.google.javascript.jscomp.mozilla.rhino.ast.XmlElemRef",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement",
      "com.google.javascript.jscomp.mozilla.rhino.IRFactory",
      "com.google.javascript.jscomp.mozilla.rhino.Decompiler",
      "com.google.javascript.jscomp.mozilla.rhino.NodeTransformer",
      "com.google.javascript.jscomp.mozilla.rhino.optimizer.OptTransformer",
      "org.mozilla.classfile.ClassFileField",
      "com.google.javascript.jscomp.mozilla.rhino.optimizer.BodyCodegen",
      "com.google.javascript.jscomp.mozilla.rhino.PolicySecurityController$1",
      "com.google.javascript.jscomp.mozilla.rhino.PolicySecurityController$Loader",
      "com.google.javascript.jscomp.mozilla.rhino.ast.Yield",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ConditionalExpression",
      "com.google.javascript.jscomp.mozilla.rhino.ast.UnaryExpression",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ParenthesizedExpression",
      "com.google.javascript.jscomp.mozilla.rhino.ast.WhileLoop",
      "com.google.javascript.jscomp.mozilla.rhino.BoundFunction",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.javascript.jscomp.mozilla.rhino.NativeJavaArray",
      "com.google.javascript.jscomp.mozilla.rhino.ast.SwitchStatement",
      "com.google.javascript.jscomp.mozilla.rhino.ContextFactory$1",
      "com.google.javascript.jscomp.mozilla.rhino.DefiningClassLoader",
      "com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement",
      "com.google.javascript.jscomp.mozilla.rhino.ast.VariableDeclaration",
      "com.google.javascript.jscomp.mozilla.rhino.ast.DoLoop",
      "com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause",
      "com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode",
      "com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode$Form",
      "com.google.javascript.jscomp.mozilla.rhino.ast.Assignment",
      "com.google.javascript.jscomp.mozilla.rhino.ast.Label",
      "com.google.javascript.jscomp.mozilla.rhino.ast.RegExpLiteral",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement",
      "com.google.javascript.jscomp.mozilla.rhino.ast.Block",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ElementGet",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ArrayComprehensionLoop",
      "com.google.javascript.jscomp.mozilla.rhino.ContextFactory$1GlobalSetterImpl",
      "com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral",
      "com.google.javascript.rhino.RhinoException",
      "com.google.javascript.rhino.EvaluatorException",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime$1",
      "com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement",
      "com.google.javascript.jscomp.mozilla.rhino.WrappedException",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptableObject$ValueCollection",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptableObject$ValueCollection$1",
      "com.google.javascript.jscomp.mozilla.rhino.ast.XmlLiteral",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ErrorNode",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral",
      "com.google.javascript.jscomp.mozilla.rhino.DToA"
    );
  }
}
