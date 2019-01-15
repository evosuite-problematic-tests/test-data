/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 11:07:29 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.FoldConstants;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.JsAst;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.RenameLabels;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.StrictModeCheck;
import com.google.javascript.jscomp.SymbolTable;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.io.PrintStream;
import java.util.List;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FoldConstants_ESTest extends FoldConstants_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      StrictModeCheck strictModeCheck0 = new StrictModeCheck(compiler0, false, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, strictModeCheck0);
      Node node0 = Node.newNumber((-4.915098215449497), (-2292), 148);
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      foldConstants0.tryFoldShift(nodeTraversal0, node0, node0, node0, node0);
      assertTrue(compiler0.hasErrors());
      assertEquals(1, compiler0.getErrorCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      // Undeclared exception!
      try { 
        foldConstants0.hasBreakOrContinue((Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil$MatchNodeType", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("4/Cy}");
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      NodeTraversal.traverse((AbstractCompiler) compiler0, node0, (NodeTraversal.Callback) foldConstants0);
      assertEquals(49, Node.LAST_PROP);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Stack<JSType> stack0 = new Stack<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) stack0);
      Node node1 = new Node(0, node0, node0);
      foldConstants0.process(node1, node1);
      assertTrue(node1.hasChildren());
      assertTrue(node1.hasOneChild());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("4/Cy}");
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0, (ScopeCreator) null);
      Node node1 = new Node(27, node0, node0, node0);
      Scope scope0 = new Scope(node1, compiler0);
      // Undeclared exception!
      try { 
        nodeTraversal0.traverseWithScope(node1, scope0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      SymbolTable symbolTable0 = new SymbolTable(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0, symbolTable0);
      Node node0 = new Node(0);
      Node node1 = new Node(27, 1, 4);
      node1.addChildToFront(node1);
      foldConstants0.visit(nodeTraversal0, node1, node0);
      assertEquals(10, Node.VARS_PROP);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("length");
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      NodeTraversal.traverse((AbstractCompiler) compiler0, node0, (NodeTraversal.Callback) foldConstants0);
      assertEquals(44, Node.IS_OPTIONAL_PARAM);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      SymbolTable symbolTable0 = new SymbolTable(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0, symbolTable0);
      Node node0 = new Node(0);
      Node node1 = new Node(4, 37, 6);
      node1.addChildToFront(node1);
      foldConstants0.visit(nodeTraversal0, node1, node0);
      assertEquals((-1), Node.CATCH_SCOPE_PROP);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      SymbolTable symbolTable0 = new SymbolTable(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0, symbolTable0);
      Node node0 = new Node(0, 0, 0);
      Node node1 = new Node(30, node0, node0, node0);
      node1.addChildToFront(node1);
      foldConstants0.visit(nodeTraversal0, node1, node0);
      assertFalse(node0.equals((Object)node1));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      SymbolTable symbolTable0 = new SymbolTable(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0, symbolTable0);
      Node node0 = new Node(0);
      Node node1 = new Node(20, node0, node0, node0);
      node1.addChildToFront(node1);
      foldConstants0.visit(nodeTraversal0, node1, node0);
      assertEquals(6, Node.TEMP_PROP);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      SymbolTable symbolTable0 = new SymbolTable(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0, symbolTable0);
      Node node0 = new Node(0, 0, 0);
      Node node1 = new Node(16, node0, node0, node0, node0, 49, 29);
      node1.addChildToFront(node1);
      foldConstants0.visit(nodeTraversal0, node1, node0);
      assertEquals((-1), Node.CATCH_SCOPE_PROP);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0);
      Node node0 = Node.newNumber((double) (-1905), 1791, 88);
      Node node1 = new Node((-1905), node0);
      // Undeclared exception!
      try { 
        foldConstants0.tryFoldBlock(nodeTraversal0, node1, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0);
      Node node0 = Node.newNumber((double) (-1905), 1791, 88);
      Node node1 = new Node((-1905), node0, node0, node0, 16, 27);
      Node node2 = new Node((-1905), node1);
      // Undeclared exception!
      try { 
        foldConstants0.tryFoldBlock(nodeTraversal0, node2, node1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode("", "");
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      RenameLabels renameLabels0 = new RenameLabels(compiler0);
      RenameLabels.ProcessLabels renameLabels_ProcessLabels0 = renameLabels0.new ProcessLabels();
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, renameLabels_ProcessLabels0);
      JsAst jsAst0 = new JsAst(jSSourceFile0);
      CompilerInput compilerInput0 = new CompilerInput(jsAst0);
      Node node0 = compilerInput0.getAstRoot(compiler0);
      foldConstants0.tryFoldBlock(nodeTraversal0, node0, node0);
      assertEquals(17, Node.TYPE_PROP);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      StrictModeCheck strictModeCheck0 = new StrictModeCheck(compiler0, false, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, strictModeCheck0);
      Node node0 = Node.newString("JSC_DIVIDE_BY_0_ERROR", 2142991944, 259);
      Node node1 = Node.newNumber((double) 268, (-2292), 113);
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      Node node2 = new Node(63, node0, node0, node1, 919, 32);
      // Undeclared exception!
      try { 
        foldConstants0.tryFoldHookIf(nodeTraversal0, node2, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      SymbolTable symbolTable0 = new SymbolTable(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0, symbolTable0);
      Node node0 = new Node(0, 0, 0);
      Node node1 = new Node(30, node0, node0, node0);
      node1.addChildToFront(node1);
      foldConstants0.tryMinimizeIf(nodeTraversal0, node1, node0);
      assertEquals(27, Node.SPECIALCALL_PROP);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      SymbolTable symbolTable0 = new SymbolTable(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0, symbolTable0);
      Node node0 = new Node(0, 0, 0);
      foldConstants0.tryFoldAndOr(nodeTraversal0, node0, node0, node0, node0);
      assertEquals(0, Node.NON_SPECIALCALL);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode("", "");
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      RenameLabels renameLabels0 = new RenameLabels(compiler0);
      RenameLabels.ProcessLabels renameLabels_ProcessLabels0 = renameLabels0.new ProcessLabels();
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, renameLabels_ProcessLabels0);
      JsAst jsAst0 = new JsAst(jSSourceFile0);
      CompilerInput compilerInput0 = new CompilerInput(jsAst0);
      Node node0 = compilerInput0.getAstRoot(compiler0);
      Node node1 = Node.newString("Gn.wT4'");
      // Undeclared exception!
      try { 
        foldConstants0.tryFoldAndOr(nodeTraversal0, node1, node1, node1, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0);
      Node node0 = compiler0.parseTestCode("H4]%GQ8U*`7()0c(=");
      Node node1 = Node.newNumber(0.0);
      // Undeclared exception!
      try { 
        foldConstants0.tryFoldAndOr(nodeTraversal0, node1, node1, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Node node0 = new Node(122, 149, 122);
      Node node1 = new Node(25, node0, node0);
      FoldConstants foldConstants0 = new FoldConstants((AbstractCompiler) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, foldConstants0);
      foldConstants0.tryFoldAndOr(nodeTraversal0, node1, node1, node0, node0);
      assertEquals(2, Node.POST_FLAG);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0);
      Node node0 = new Node((-3063), 114, (-3063));
      foldConstants0.tryFoldLeftChildAdd(nodeTraversal0, node0, node0, node0, node0);
      assertEquals((-3), Node.LOCAL_BLOCK_PROP);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0);
      Node node0 = new Node(122, 149, 122);
      foldConstants0.tryFoldLeftChildAdd(nodeTraversal0, node0, node0, node0, node0);
      assertEquals(0, node0.getChildCount());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants((AbstractCompiler) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0);
      Node node0 = compiler0.parseTestCode("H4]%GQ8U*`7()0c(=");
      Node node1 = Node.newString("H4]%GQ8U*`7()0c(=");
      foldConstants0.tryFoldAdd(nodeTraversal0, node0, node1, node0, node0);
      assertEquals(2, Node.BREAK_PROP);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      SymbolTable symbolTable0 = new SymbolTable(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0, symbolTable0);
      Node node0 = new Node(0, 0, 0);
      foldConstants0.tryFoldAdd(nodeTraversal0, node0, node0, node0, node0);
      assertFalse(node0.isQualifiedName());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants((AbstractCompiler) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0);
      Node node0 = compiler0.parseTestCode("H4]%GQ8U*`7()0c(=");
      Node node1 = Node.newString("H4]%GQ8U*`7()0c(=");
      foldConstants0.tryFoldAdd(nodeTraversal0, node1, node0, node1, node1);
      assertEquals(15, Node.CASEARRAY_PROP);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Node node0 = Node.newNumber(1.0, (-2292), 3430);
      Normalize.VerifyConstants normalize_VerifyConstants0 = new Normalize.VerifyConstants((AbstractCompiler) null, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, normalize_VerifyConstants0);
      FoldConstants foldConstants0 = new FoldConstants((AbstractCompiler) null);
      Node node1 = Node.newString("", 27, 25);
      // Undeclared exception!
      try { 
        foldConstants0.tryFoldAdd(nodeTraversal0, node0, node0, node1, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      Node node0 = Node.newNumber((double) (byte)30, 97, 97);
      // Undeclared exception!
      try { 
        foldConstants0.tryFoldAdd((NodeTraversal) null, node0, node0, node0, node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown arithmetic operator
         //
         verifyException("com.google.javascript.jscomp.FoldConstants", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      StrictModeCheck strictModeCheck0 = new StrictModeCheck(compiler0, false, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, strictModeCheck0);
      Node node0 = Node.newNumber(1.0, 268, 113);
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      Node node1 = new Node(30, node0, node0, node0, node0);
      foldConstants0.tryFoldAdd(nodeTraversal0, node1, node0, node1, node1);
      assertFalse(node0.isUnscopedQualifiedName());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0);
      Node node0 = new Node(122, 149, 122);
      foldConstants0.tryFoldBitAndOr(nodeTraversal0, node0, node0, node0, node0);
      assertEquals(44, Node.IS_OPTIONAL_PARAM);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0);
      Node node0 = compiler0.parseTestCode("H4]%GQ8U*`7()0c(=");
      Node node1 = Node.newNumber(0.0);
      foldConstants0.tryFoldBitAndOr(nodeTraversal0, node0, node1, node0, node0);
      assertEquals(12, Node.REGEXP_PROP);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      StrictModeCheck strictModeCheck0 = new StrictModeCheck(compiler0, false, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, strictModeCheck0);
      Node node0 = Node.newNumber((-4.915098215449497), (-2292), 148);
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      foldConstants0.tryFoldBitAndOr(nodeTraversal0, node0, node0, node0, node0);
      assertFalse(node0.isQuotedString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      StrictModeCheck strictModeCheck0 = new StrictModeCheck(compiler0, false, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, strictModeCheck0);
      Node node0 = Node.newNumber((double) 268, (-2292), 113);
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      // Undeclared exception!
      try { 
        foldConstants0.tryFoldBitAndOr(nodeTraversal0, node0, node0, node0, node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown bitwise operator
         //
         verifyException("com.google.javascript.jscomp.FoldConstants", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      Node node0 = Node.newNumber(1.1016261340958513, 97, 97);
      Node node1 = new Node((-1038), node0, (-1671), 27);
      foldConstants0.tryFoldShift((NodeTraversal) null, node0, node0, node1, node1);
      assertEquals(9, Node.FIXUPS_PROP);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      StrictModeCheck strictModeCheck0 = new StrictModeCheck(compiler0, false, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, strictModeCheck0);
      Node node0 = Node.newNumber((double) 268, (-2292), 113);
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      foldConstants0.tryFoldShift(nodeTraversal0, node0, node0, node0, node0);
      assertEquals(1, compiler0.getErrorCount());
      assertTrue(compiler0.hasErrors());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      StrictModeCheck strictModeCheck0 = new StrictModeCheck(compiler0, false, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, strictModeCheck0);
      Node node0 = Node.newNumber(1.1016261340958513, (-2292), 148);
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      foldConstants0.tryFoldShift(nodeTraversal0, node0, node0, node0, node0);
      assertTrue(compiler0.hasErrors());
      assertEquals(1, compiler0.getErrorCount());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      StrictModeCheck strictModeCheck0 = new StrictModeCheck(compiler0, false, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, strictModeCheck0);
      Node node0 = Node.newNumber(1.0, (-2292), 113);
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      // Undeclared exception!
      try { 
        foldConstants0.tryFoldShift(nodeTraversal0, node0, node0, node0, node0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // Unknown shift operator: number
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      Node node0 = new Node(122, 149, 122);
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0);
      // Undeclared exception!
      try { 
        foldConstants0.tryFoldComparison(nodeTraversal0, node0, node0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      StrictModeCheck strictModeCheck0 = new StrictModeCheck(compiler0, false, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, strictModeCheck0);
      Node node0 = Node.newNumber((double) 268, (-2292), 113);
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      foldConstants0.tryFoldComparison(nodeTraversal0, node0, node0, node0, node0);
      assertEquals(7, Node.LOCAL_PROP);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("4/Cy}");
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0, (ScopeCreator) null);
      foldConstants0.tryFoldComparison(nodeTraversal0, node0, node0, node0, node0);
      assertEquals(12, Node.COLUMN_BITS);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      Node node0 = new Node(24);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0);
      Node node1 = Node.newString(".r#+TG&G", 1, 2);
      foldConstants0.tryFoldComparison(nodeTraversal0, node0, node1, node0, node0);
      assertEquals(34, Node.PARENTHESIZED_PROP);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Node node0 = new Node(122, 149, 122);
      Node node1 = new Node(25, node0, node0);
      Node node2 = Node.newNumber((double) 13);
      FoldConstants foldConstants0 = new FoldConstants((AbstractCompiler) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, foldConstants0);
      foldConstants0.tryFoldComparison(nodeTraversal0, node2, node2, node1, node2);
      assertEquals(40, Node.ORIGINALNAME_PROP);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("4/Cy}");
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0, (ScopeCreator) null);
      foldConstants0.tryFoldStringIndexOf(nodeTraversal0, node0, node0, node0, node0);
      assertEquals(2, Node.BREAK_PROP);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      SymbolTable symbolTable0 = new SymbolTable(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0, symbolTable0);
      Node node0 = new Node(0, 0, 0);
      foldConstants0.tryFoldStringJoin(nodeTraversal0, node0, node0, node0, node0);
      assertEquals(36, Node.OPT_ARG_NAME);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      SymbolTable symbolTable0 = new SymbolTable(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0, symbolTable0);
      Node node0 = new Node(0);
      foldConstants0.tryFoldGetElem(nodeTraversal0, node0, node0, node0, node0);
      assertEquals(30, Node.SKIP_INDEXES_PROP);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("4/Cy}");
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0, (ScopeCreator) null);
      foldConstants0.tryFoldGetProp(nodeTraversal0, node0, node0, node0, node0);
      assertFalse(node0.isOptionalArg());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("4/Cy}");
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0, (ScopeCreator) null);
      foldConstants0.tryFoldGetProp(nodeTraversal0, node0, node0, node0, node0);
      assertFalse(node0.isNoSideEffectsCall());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0);
      Node node0 = compiler0.parseSyntheticCode("}L|\"H7HsGLb%", "RegExp");
      foldConstants0.tryFoldRegularExpressionConstructor(nodeTraversal0, node0, node0);
      assertEquals(48, Node.DIRECTIVES);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      Node node0 = new Node(24);
      Node node1 = new Node(15, node0);
      node1.addChildToFront(node1);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0);
      foldConstants0.tryFoldRegularExpressionConstructor(nodeTraversal0, node1, node1);
      assertTrue(node1.hasChildren());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      boolean boolean0 = FoldConstants.containsUnicodeEscape("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Node node0 = new Node(122, 149, 122);
      FoldConstants foldConstants0 = new FoldConstants((AbstractCompiler) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, foldConstants0);
      // Undeclared exception!
      try { 
        foldConstants0.tryFoldWhile(nodeTraversal0, node0, node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("4/Cy}");
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0, (ScopeCreator) null);
      // Undeclared exception!
      try { 
        foldConstants0.tryFoldFor(nodeTraversal0, node0, node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      SymbolTable symbolTable0 = new SymbolTable(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0, symbolTable0);
      Node node0 = new Node(0, 0, 0);
      // Undeclared exception!
      try { 
        foldConstants0.tryFoldDo(nodeTraversal0, node0, node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      MockFile mockFile0 = new MockFile("45z^7<r&", "");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Compiler compiler0 = new Compiler(mockPrintStream0);
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      Node node0 = Node.newNumber(0.0, 20, 0);
      foldConstants0.tryMinimizeCondition((NodeTraversal) null, node0, node0);
      assertEquals(20, node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      StrictModeCheck strictModeCheck0 = new StrictModeCheck(compiler0, false, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, strictModeCheck0);
      Node node0 = Node.newNumber((double) 268, 268, 113);
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      // Undeclared exception!
      try { 
        foldConstants0.tryMinimizeCondition(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }
}
