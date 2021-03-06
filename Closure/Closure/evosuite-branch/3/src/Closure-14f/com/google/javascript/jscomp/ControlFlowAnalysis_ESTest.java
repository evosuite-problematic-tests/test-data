/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 07:48:55 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ConstCheck;
import com.google.javascript.jscomp.ControlFlowAnalysis;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.LineNumberCheck;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.PrintStreamErrorManager;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.SyntacticScopeCreator;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.io.PrintStream;
import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ControlFlowAnalysis_ESTest extends ControlFlowAnalysis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, true);
      Node node0 = Node.newString(30, "com.google.javascript.jscomp.ControlFlowAnalysis$AstControlFlowGraph$1");
      controlFlowAnalysis0.process(node0, node0);
      assertFalse(node0.isGetterDef());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, true, true);
      Node node0 = new Node((-752));
      Node node1 = new Node(77, node0, 2845, (-1890));
      controlFlowAnalysis0.process(node0, node1);
      assertFalse(node0.isOptionalArg());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, true, true);
      Node node0 = new Node(112);
      controlFlowAnalysis0.process(node0, node0);
      assertEquals((-1), node0.getSourceOffset());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, true);
      SyntheticAst syntheticAst0 = new SyntheticAst("i>_t`zGvr'JVi:_");
      Node node0 = syntheticAst0.getAstRoot(compiler0);
      Node node1 = new Node(113, node0, 125, 2822);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node1, node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      ControlFlowGraph<Node> controlFlowGraph0 = controlFlowAnalysis0.getCfg();
      assertNull(controlFlowGraph0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Node node0 = Node.newString(114, "p<Qu+uNx(", 120, (-3211));
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      LineNumberCheck lineNumberCheck0 = new LineNumberCheck(compiler0);
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, lineNumberCheck0, syntacticScopeCreator0);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Logger logger0 = Logger.getLogger("#@]Vlmon:Bk");
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      Node node0 = new Node(105, 105, 105);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Logger logger0 = Logger.getLogger("#@]Vlmon:Bk");
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, true);
      Node node0 = new Node(105);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ConstCheck constCheck0 = new ConstCheck(compiler0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, false);
      Node node0 = new Node(4);
      controlFlowAnalysis0.process(node0, node0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, constCheck0);
      boolean boolean0 = controlFlowAnalysis0.shouldTraverse(nodeTraversal0, node0, node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, false);
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager((PrintStream) null);
      Compiler compiler0 = new Compiler(printStreamErrorManager0);
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.ControlFlowAnalysis$AstControlFlowGraph$1");
      controlFlowAnalysis0.process(node0, node0);
      Node node1 = Node.newString(49, "com.google.javascript.jscomp.ControlFlowAnalysis$AstControlFlowGraph$1", 8, 38);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, (NodeTraversal.Callback) null);
      boolean boolean0 = controlFlowAnalysis0.shouldTraverse(nodeTraversal0, node0, node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, true);
      SyntheticAst syntheticAst0 = new SyntheticAst("QI0EsJYjfUk8G");
      Node node0 = syntheticAst0.getAstRoot(compiler0);
      Node node1 = new Node(110, node0, 52, 2822);
      controlFlowAnalysis0.process(node1, node1);
      assertFalse(node1.isAdd());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Node node0 = Node.newString(114, "p<Qu+uNx(", 120, (-3211));
      Node node1 = new Node(111, node0, node0, node0, node0, (-2017), 3);
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node1, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Node node0 = Node.newString(114, "p<Qu+uNx(", 120, (-3211));
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      Node node1 = Node.newString(49, "V9L?(eT[UVqyX^+I {q", 35, 49);
      controlFlowAnalysis0.process(node0, node1);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, controlFlowAnalysis0);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.shouldTraverse(nodeTraversal0, node1, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, true);
      SyntheticAst syntheticAst0 = new SyntheticAst("QI0EsJYjfUk8G");
      Node node0 = syntheticAst0.getAstRoot(compiler0);
      Node node1 = new Node(115, node0, 121, 2822);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node1, node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("chainCalls");
      Compiler compiler0 = new Compiler(mockPrintStream0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, false);
      Node node0 = compiler0.parseTestCode("chainCalls");
      Node node1 = Node.newString(116, "chainCalls");
      node1.addChildrenToBack(node0);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, false);
      Node node0 = new Node(117);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Vector<JSType> vector0 = new Vector<JSType>();
      Node node1 = jSTypeRegistry0.createParameters((List<JSType>) vector0);
      node0.addChildrenToFront(node1);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Node node0 = Node.newString(114, "p<Qu+uNx(", 120, (-3211));
      Node node1 = new Node(119, node0, node0, node0, node0, (-2017), 3);
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, true);
      controlFlowAnalysis0.process(node0, node1);
      assertEquals(40, Node.ORIGINALNAME_PROP);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, true, true);
      Node node0 = Node.newNumber(0.0, 120, 125);
      Node node1 = new Node(120, node0, node0, node0);
      controlFlowAnalysis0.process(node1, node1);
      assertFalse(node1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, true, true);
      Node node0 = new Node(108);
      Node node1 = new Node(126, node0, 2845, (-1910));
      controlFlowAnalysis0.process(node0, node1);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, controlFlowAnalysis0);
      boolean boolean0 = controlFlowAnalysis0.shouldTraverse(nodeTraversal0, node1, node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Node node0 = new Node(105, 105, 105);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, controlFlowAnalysis0, (ScopeCreator) null);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, true, true);
      Node node0 = new Node(108);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Node node0 = Node.newString(114, "p<Qu+uNx(", 742, (-3211));
      Node node1 = new Node(115, node0, node0, node0, node0, 54, 3);
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, true);
      LineNumberCheck lineNumberCheck0 = new LineNumberCheck(compiler0);
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, lineNumberCheck0, syntacticScopeCreator0);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.visit(nodeTraversal0, node1, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, true, true);
      Node node0 = new Node(125);
      controlFlowAnalysis0.process(node0, node0);
      assertEquals(1, Node.FLAG_GLOBAL_STATE_UNMODIFIED);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, true, true);
      Node node0 = new Node(125);
      Node node1 = new Node(30, node0, node0, 53, 1);
      controlFlowAnalysis0.process(node0, node0);
      assertFalse(node0.isAnd());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("chainCalls");
      Compiler compiler0 = new Compiler(mockPrintStream0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, false);
      Node node0 = compiler0.parseTestCode("chainCalls");
      Node node1 = new Node(4095, node0, node0, node0, node0);
      controlFlowAnalysis0.process(node1, node0);
      assertFalse(node0.isAssign());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("chainCalls");
      Compiler compiler0 = new Compiler(mockPrintStream0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, false);
      Node node0 = compiler0.parseTestCode("chainCalls");
      Node node1 = Node.newString(116, "chainCalls");
      Node node2 = new Node(4095, node1);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // Cannot find break target.
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, true, true);
      Node node0 = new Node(117);
      Node node1 = new Node(16, node0, node0, node0, 161, 4);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      Node node0 = Node.newString(4, "uUi:");
      Node node1 = Node.newNumber(323.54);
      node0.addChildrenToBack(node1);
      controlFlowAnalysis0.process(node0, node0);
      assertFalse(node0.isLabelName());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Node node0 = Node.newString(114, "p<Qu+uNx(", 120, (-3211));
      Node node1 = new Node(111, node0, node0, node0, node0, (-2017), 3);
      Node node2 = ControlFlowAnalysis.computeFollowNode(node0);
      assertNull(node2);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Node node0 = new Node(113, (-3211), 113);
      node0.addChildrenToBack(node0);
      Node node1 = ControlFlowAnalysis.computeFollowNode(node0);
      assertFalse(node1.isNumber());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Node node0 = Node.newString(114, "p<Qu+uNx(", 113, (-3211));
      node0.addChildrenToBack(node0);
      Node node1 = ControlFlowAnalysis.computeFollowNode(node0);
      assertFalse(node1.isBreak());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, true, true);
      Compiler compiler0 = new Compiler((PrintStream) null);
      Node node0 = compiler0.parseTestCode("com.google.javascript.js;omp.Control4lowAnalysis$AstControlFlowGraph$1");
      controlFlowAnalysis0.process(node0, node0);
      assertFalse(node0.isWith());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Node node0 = Node.newString(114, "p<Qu+uNx(", 120, (-3211));
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Node node0 = Node.newString(77, "D");
      Node node1 = new Node(407, node0, node0);
      boolean boolean0 = ControlFlowAnalysis.isBreakTarget(node0, "D");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Node node0 = Node.newString(114, "", 120, (-3211));
      boolean boolean0 = ControlFlowAnalysis.isBreakTarget(node0, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Node node0 = new Node(108, 119, 119);
      Node node1 = new Node(126, node0, 2845, (-1910));
      // Undeclared exception!
      try { 
        ControlFlowAnalysis.isBreakTarget(node0, "j6e");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // IF 119 is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager((PrintStream) null);
      Compiler compiler0 = new Compiler(printStreamErrorManager0);
      Node node0 = compiler0.parseTestCode("com.google.javascript.js;omp.Control4lowAnalysis$AstControlFlowGraph$1");
      Node node1 = new Node(35, node0, node0, 46, 54);
      boolean boolean0 = ControlFlowAnalysis.mayThrowException(node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Node node0 = new Node(117, 52, 52);
      Node node1 = new Node(37, node0, node0, node0);
      boolean boolean0 = ControlFlowAnalysis.mayThrowException(node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Node node0 = Node.newString(52, ".FPcq`y*\"cH7_B8", 1630, 2110);
      boolean boolean0 = ControlFlowAnalysis.mayThrowException(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Node node0 = Node.newString(102, "D");
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, true);
      controlFlowAnalysis0.process(node0, node0);
      assertEquals(50, Node.FREE_CALL);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Logger logger0 = Logger.getLogger("#@]Vlmon:Bk");
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      Node node0 = new Node(103, 103, 103);
      controlFlowAnalysis0.process(node0, node0);
      assertFalse(node0.isTry());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Node node0 = new Node(105, 105, 105);
      boolean boolean0 = ControlFlowAnalysis.mayThrowException(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("chainCalls");
      Compiler compiler0 = new Compiler(mockPrintStream0);
      Node node0 = compiler0.parseTestCode("chainCalls");
      boolean boolean0 = ControlFlowAnalysis.mayThrowException(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Node node0 = Node.newString(110, "p<Qu+uNx(", 110, (-3211));
      // Undeclared exception!
      try { 
        ControlFlowAnalysis.isBreakTarget(node0, "Cx");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Node node0 = new Node(113, (-3211), 113);
      // Undeclared exception!
      try { 
        ControlFlowAnalysis.isBreakTarget(node0, "Cx");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Node node0 = Node.newString(115, "p<Qu+uNx(", 120, (-3211));
      // Undeclared exception!
      try { 
        ControlFlowAnalysis.isBreakTarget(node0, "Cx");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Node node0 = new Node(125);
      boolean boolean0 = ControlFlowAnalysis.isBreakStructure(node0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Node node0 = new Node(113, (-3211), 113);
      boolean boolean0 = ControlFlowAnalysis.isContinueStructure(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Node node0 = Node.newString(114, "p<Qu+uNx(", 120, (-3211));
      boolean boolean0 = ControlFlowAnalysis.isContinueStructure(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Node node0 = Node.newString(114, "p<Qu+uNx(", 742, (-3211));
      Node node1 = new Node(115, node0, node0, node0, node0, 54, 3);
      boolean boolean0 = ControlFlowAnalysis.isContinueStructure(node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("chainCalls");
      Compiler compiler0 = new Compiler(mockPrintStream0);
      Node node0 = compiler0.parseTestCode("chainCalls");
      Node node1 = ControlFlowAnalysis.getExceptionHandler(node0);
      assertNull(node1);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Node node0 = new Node(4);
      // Undeclared exception!
      try { 
        ControlFlowAnalysis.getExceptionHandler(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Node node0 = new Node(105, 105, 105);
      Node node1 = ControlFlowAnalysis.getExceptionHandler(node0);
      assertNull(node1);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Node node0 = new Node(125);
      Node node1 = new Node(30, node0, node0, 53, 1);
      Node node2 = ControlFlowAnalysis.getCatchHandlerForBlock(node0);
      assertNull(node2);
  }
}
