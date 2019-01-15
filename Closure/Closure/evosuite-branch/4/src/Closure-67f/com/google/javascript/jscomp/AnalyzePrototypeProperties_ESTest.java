/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 09:23:30 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.AnalyzePrototypeProperties;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.CheckUnreachableCode;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.ControlFlowAnalysis;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.JSModuleGraph;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique;
import com.google.javascript.jscomp.MemoizedScopeCreator;
import com.google.javascript.jscomp.NameReferenceGraph;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax;
import com.google.javascript.jscomp.RuntimeTypeCheck;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AnalyzePrototypeProperties_ESTest extends AnalyzePrototypeProperties_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MakeDeclaredNamesUnique.ContextualRenamer makeDeclaredNamesUnique_ContextualRenamer0 = new MakeDeclaredNamesUnique.ContextualRenamer();
      MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique(makeDeclaredNamesUnique_ContextualRenamer0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, makeDeclaredNamesUnique0);
      Compiler compiler1 = nodeTraversal0.getCompiler();
      LinkedList<Node> linkedList0 = new LinkedList<Node>();
      NodeTraversal.traverseRoots((AbstractCompiler) compiler0, (List<Node>) linkedList0, (NodeTraversal.Callback) makeDeclaredNamesUnique0);
      compiler0.getModuleGraph();
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler1, (JSModuleGraph) null, false, false);
      Node node0 = Node.newString("m.z]o");
      // Undeclared exception!
      try { 
        analyzePrototypeProperties0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckUnreachableCode checkUnreachableCode0 = new CheckUnreachableCode((AbstractCompiler) null, checkLevel0);
      MemoizedScopeCreator memoizedScopeCreator0 = new MemoizedScopeCreator((ScopeCreator) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, checkUnreachableCode0, memoizedScopeCreator0);
      nodeTraversal0.getCompiler();
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties((AbstractCompiler) null, (JSModuleGraph) null, false, false);
      SyntheticAst syntheticAst0 = new SyntheticAst("valueOf");
      Node node0 = syntheticAst0.getAstRoot((AbstractCompiler) null);
      AnalyzePrototypeProperties.GlobalFunction analyzePrototypeProperties_GlobalFunction0 = null;
      try {
        analyzePrototypeProperties_GlobalFunction0 = analyzePrototypeProperties0.new GlobalFunction(node0, node0, node0, (JSModule) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSModule[] jSModuleArray0 = new JSModule[1];
      JSModule jSModule0 = new JSModule(")");
      jSModuleArray0[0] = jSModule0;
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph(jSModuleArray0);
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, jSModuleGraph0, true, true);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getModuleGraph();
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, (JSModuleGraph) null, true, true);
      Collection<AnalyzePrototypeProperties.NameInfo> collection0 = analyzePrototypeProperties0.getAllNameInfo();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Vector<JSModule> vector0 = new Vector<JSModule>();
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph(vector0);
      AnalyzePrototypeProperties analyzePrototypeProperties0 = null;
      try {
        analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, jSModuleGraph0, true, true);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getModuleGraph();
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, (JSModuleGraph) null, false, false);
      Node node0 = compiler0.parseSyntheticCode("HE#XH\"U?=jo", "S|xD6z\"`m,ienm");
      analyzePrototypeProperties0.process(node0, node0);
      String string0 = "'b2>B\"kdJ3fvE";
      JSModule jSModule0 = new JSModule(string0);
      AnalyzePrototypeProperties.AssignmentProperty analyzePrototypeProperties_AssignmentProperty0 = new AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule0);
      analyzePrototypeProperties_AssignmentProperty0.getValue();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getModuleGraph();
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, (JSModuleGraph) null, true, true);
      String string0 = "I1";
      Node node0 = Node.newString("I1");
      // Undeclared exception!
      try { 
        analyzePrototypeProperties0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Node node0 = Node.newString(2048, "7O3&", (-1), 665);
      JSModule jSModule0 = new JSModule("7O3&");
      AnalyzePrototypeProperties.LiteralProperty analyzePrototypeProperties_LiteralProperty0 = new AnalyzePrototypeProperties.LiteralProperty(node0, node0, node0, node0, jSModule0);
      analyzePrototypeProperties_LiteralProperty0.getValue();
      Node node1 = analyzePrototypeProperties_LiteralProperty0.getValue();
      assertEquals((-1), node1.getLineno());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Node node0 = Node.newString(0, "");
      AnalyzePrototypeProperties.LiteralProperty analyzePrototypeProperties_LiteralProperty0 = new AnalyzePrototypeProperties.LiteralProperty(node0, node0, node0, node0, (JSModule) null);
      node0.getQualifiedName();
      // Undeclared exception!
      try { 
        analyzePrototypeProperties_LiteralProperty0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties((AbstractCompiler) null, (JSModuleGraph) null, false, true);
      AnalyzePrototypeProperties.NameInfo analyzePrototypeProperties_NameInfo0 = analyzePrototypeProperties0.new NameInfo("P");
      String string0 = analyzePrototypeProperties_NameInfo0.toString();
      assertEquals("P", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Logger logger0 = Logger.getLogger("");
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler1 = new Compiler(loggerErrorManager0);
      compiler1.getModuleGraph();
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, (JSModuleGraph) null, false, false);
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      Stack<JSType> stack0 = new Stack<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) stack0);
      AnalyzePrototypeProperties.NameInfo analyzePrototypeProperties_NameInfo0 = analyzePrototypeProperties0.new NameInfo("");
      analyzePrototypeProperties_NameInfo0.getDeepestCommonModuleRef();
      AnalyzePrototypeProperties.GlobalFunction analyzePrototypeProperties_GlobalFunction0 = null;
      try {
        analyzePrototypeProperties_GlobalFunction0 = analyzePrototypeProperties0.new GlobalFunction(node0, node0, node0, (JSModule) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "", "");
      JSModule jSModule0 = new JSModule("");
      AnalyzePrototypeProperties.AssignmentProperty analyzePrototypeProperties_AssignmentProperty0 = new AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule0);
      node0.removeChildren();
      // Undeclared exception!
      try { 
        analyzePrototypeProperties_AssignmentProperty0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getModuleGraph();
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, (JSModuleGraph) null, false, false);
      AnalyzePrototypeProperties.NameInfo analyzePrototypeProperties_NameInfo0 = analyzePrototypeProperties0.new NameInfo((String) null);
      boolean boolean0 = analyzePrototypeProperties_NameInfo0.readsClosureVariables();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Node node0 = Node.newString(2048, "7O3&", (-1), 665);
      node0.getAncestor(3174);
      JSModule jSModule0 = new JSModule("7O3&");
      AnalyzePrototypeProperties.LiteralProperty analyzePrototypeProperties_LiteralProperty0 = new AnalyzePrototypeProperties.LiteralProperty(node0, node0, node0, node0, jSModule0);
      JSModule jSModule1 = analyzePrototypeProperties_LiteralProperty0.getModule();
      assertSame(jSModule0, jSModule1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Node node0 = Node.newString("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameContext");
      Node node1 = new Node(3614, node0);
      Node node2 = ControlFlowAnalysis.computeFallThrough(node1);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0);
      Compiler compiler0 = new Compiler(mockPrintStream0);
      Compiler.IntermediateState compiler_IntermediateState0 = compiler0.getState();
      Node node3 = compiler_IntermediateState0.externsRoot;
      JSSourceFile jSSourceFile0 = JSSourceFile.fromGenerator("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameContext", (SourceFile.Generator) null);
      CompilerInput compilerInput0 = new CompilerInput(jSSourceFile0, false);
      compilerInput0.getModule();
      AnalyzePrototypeProperties.LiteralProperty analyzePrototypeProperties_LiteralProperty0 = new AnalyzePrototypeProperties.LiteralProperty(node2, node1, (Node) null, node0, (JSModule) null);
      Node node4 = analyzePrototypeProperties_LiteralProperty0.getPrototype();
      assertNull(node4);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile("m@)PI2L|");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Compiler compiler0 = new Compiler(mockPrintStream0);
      compiler0.getModuleGraph();
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties((AbstractCompiler) null, (JSModuleGraph) null, true, true);
      AnalyzePrototypeProperties.NameInfo analyzePrototypeProperties_NameInfo0 = analyzePrototypeProperties0.new NameInfo("m@)PI2L|");
      analyzePrototypeProperties_NameInfo0.getDeclarations();
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
      String string0 = "replaceStrings";
      // Undeclared exception!
      try { 
        RuntimeTypeCheck.getBoilerplateCode(compiler0, "replaceStrings");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Node node0 = Node.newString(2133, "3HKj$,'<4");
      JSModule jSModule0 = new JSModule("yT,F|Ux~P+an+ TfB4");
      AnalyzePrototypeProperties.AssignmentProperty analyzePrototypeProperties_AssignmentProperty0 = new AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule0);
      JSModule jSModule1 = analyzePrototypeProperties_AssignmentProperty0.getModule();
      assertEquals((-1), jSModule1.getDepth());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "sc8.\"\\?_/I";
      FileSystemHandling.shouldAllThrowIOExceptions();
      Node node0 = Node.newString("sc8.\"?_/I");
      Node node1 = null;
      NameReferenceGraph.Reference nameReferenceGraph_Reference0 = new NameReferenceGraph.Reference((Node) null, node0);
      nameReferenceGraph_Reference0.getModule();
      AnalyzePrototypeProperties.LiteralProperty analyzePrototypeProperties_LiteralProperty0 = new AnalyzePrototypeProperties.LiteralProperty(node0, node0, node0, (Node) null, (JSModule) null);
      AnalyzePrototypeProperties.AssignmentProperty analyzePrototypeProperties_AssignmentProperty0 = new AnalyzePrototypeProperties.AssignmentProperty(nameReferenceGraph_Reference0.parent, (JSModule) null);
      // Undeclared exception!
      try { 
        analyzePrototypeProperties_AssignmentProperty0.getPrototype();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.AnalyzePrototypeProperties$AssignmentProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      Stack<JSType> stack0 = new Stack<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) stack0);
      JSModule[] jSModuleArray0 = new JSModule[1];
      JSModule jSModule0 = new JSModule(")");
      jSModuleArray0[0] = jSModule0;
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph(jSModuleArray0);
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, jSModuleGraph0, true, true);
      AnalyzePrototypeProperties.GlobalFunction analyzePrototypeProperties_GlobalFunction0 = null;
      try {
        analyzePrototypeProperties_GlobalFunction0 = analyzePrototypeProperties0.new GlobalFunction(node0, node0, node0, jSModule0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }
}
