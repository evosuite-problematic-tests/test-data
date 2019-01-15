/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 12:16:09 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ControlFlowAnalysis;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.SyntacticScopeCreator;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ControlFlowAnalysis_ESTest extends ControlFlowAnalysis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("is]x");
      Node node1 = new Node(119, node0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, true);
      controlFlowAnalysis0.process(node1, node1);
      assertEquals(16, Node.SOURCENAME_PROP);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, true);
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.ControlFlowAnalysis$1");
      Node node1 = new Node(30, node0, node0, node0, node0, 1, 1);
      controlFlowAnalysis0.process(node0, node1);
      assertEquals(37, Node.OPT_ARG_NAME);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("is]x");
      Node node1 = new Node(77, node0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      controlFlowAnalysis0.process(node1, node1);
      assertEquals(4095, Node.MAX_COLUMN_NUMBER);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, true);
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.ControlFlowAnalysis$1");
      Node node1 = new Node(49, node0, node0, node0, 105, 48);
      controlFlowAnalysis0.process(node0, node1);
      assertFalse(node1.isComma());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("is](");
      Node node1 = new Node(112, node0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      controlFlowAnalysis0.process(node1, node1);
      assertFalse(node1.isStringKey());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, true);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) arrayList0);
      Node node1 = Node.newString(113, "com.google.javascript.jscomp.ControlFlowAnalysis$1", 130, 1507);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, true);
      ControlFlowGraph<Node> controlFlowGraph0 = controlFlowAnalysis0.getCfg();
      assertNull(controlFlowGraph0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Node node0 = new Node(114, (-3735), 114);
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, controlFlowAnalysis0);
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
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, true);
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.ControlFlowAnalysis$1");
      Node node1 = Node.newString(105, "com.google.javascript.jscomp.ControlFlowAnalysis$1", 130, 1507);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node1);
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
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("is](");
      Node node1 = new Node(105, node0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node1, node1);
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
  public void test10()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, true, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, controlFlowAnalysis0);
      Logger logger0 = Logger.getLogger("");
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      Node node0 = compiler0.parseTestCode("\"O9FVF");
      controlFlowAnalysis0.process((Node) null, node0);
      node0.setType(4);
      boolean boolean0 = controlFlowAnalysis0.shouldTraverse(nodeTraversal0, node0, node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("}+ w&}OFKnmIA");
      Node node1 = new Node(108, node0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, true);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node1, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("is]x");
      Node node1 = new Node(110, node0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, true);
      controlFlowAnalysis0.process(node1, node1);
      assertTrue(node1.hasChildren());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("sx", 116, 116);
      Node node1 = new Node(116, node0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, true);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node1, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString(118, "is]x");
      Node node1 = new Node(118, node0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, true);
      controlFlowAnalysis0.process(node1, node1);
      assertFalse(node1.isInstanceOf());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("is](");
      Node node1 = new Node(126, node0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      controlFlowAnalysis0.process(node1, node1);
      assertEquals(29, Node.JSDOC_INFO_PROP);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("4]x");
      Node node1 = new Node(115, node0);
      Node node2 = compiler0.parseTestCode("4]x");
      node1.addChildrenAfter(node2, node0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, true);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node1, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, controlFlowAnalysis0);
      Node node0 = Node.newString(4, ")'s#UMS>F9V!R");
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
  public void test18()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, true);
      Node node0 = Node.newString(105, "com.google.javascript.jscomp.ControlFlowAnalysis$1", 130, 1507);
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, controlFlowAnalysis0, syntacticScopeCreator0);
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
  public void test19()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("is](");
      Node node1 = new Node(125, node0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, true);
      controlFlowAnalysis0.process(node1, node1);
      assertEquals(4095, Node.MAX_COLUMN_NUMBER);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("is](");
      Node node1 = new Node(125, node0);
      Node node2 = new Node(0, node1, 39, 1);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, true);
      controlFlowAnalysis0.process(node1, node1);
      assertFalse(node1.isNE());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, true);
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.ControlFlowAnalysis$1");
      Node node1 = Node.newString(116, "com.google.javascript.jscomp.ControlFlowAnalysis$1", 130, 1507);
      Node node2 = new Node(38, node1, node0, node1, node1, 16, 112);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node1);
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
  public void test22()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("is]x");
      Node node1 = new Node(117, node0);
      node1.removeChildren();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, true);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node1, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // Cannot find continue target.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("is]x");
      Node node1 = new Node(117, node0);
      Node node2 = new Node(0, node1, 39, 1);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, true);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node1, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // Cannot find continue target.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("}+ w&}OFKnmIA");
      Node node1 = new Node(105, node0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, controlFlowAnalysis0, (ScopeCreator) null);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.visit(nodeTraversal0, node0, node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("is]x");
      Node node1 = new Node(117, node0);
      Node node2 = ControlFlowAnalysis.computeFollowNode(node0);
      assertNull(node2);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, true);
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.ControlFlowAnalysis$1");
      node0.addChildToBack(node0);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Node node0 = new Node(114, (-3735), 114);
      // Undeclared exception!
      try { 
        ControlFlowAnalysis.computeFallThrough(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("}+ w&}OFKnmIA");
      Node node1 = new Node(125, node0);
      Node node2 = new Node(0, node1, 39, 1);
      boolean boolean0 = ControlFlowAnalysis.isBreakTarget(node1, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Node node0 = new Node(115, (-3735), 115);
      boolean boolean0 = ControlFlowAnalysis.isBreakTarget(node0, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.ControlFlowAnalysis$1");
      Node node1 = new Node(35, node0, node0, node0, node0, 44, 4);
      boolean boolean0 = ControlFlowAnalysis.mayThrowException(node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, true);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) arrayList0);
      Node node1 = Node.newString(37, "com.google.javascript.jscomp.ControlFlowAnalysis$1", 130, 36);
      controlFlowAnalysis0.process(node0, node1);
      assertEquals(8, Node.FLAG_NO_THROWS);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, true);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) arrayList0);
      Node node1 = Node.newString(52, "com.google\"javascript.jscomq.ControlFlowAnalysis$1", 130, 1507);
      controlFlowAnalysis0.process(node0, node1);
      assertFalse(node0.isFalse());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Node node0 = Node.newString(102, "yxm\"r5N%6qmC%#UmnI:", 102, 102);
      boolean boolean0 = ControlFlowAnalysis.mayThrowException(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("is]x");
      Node node1 = new Node(103, node0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      controlFlowAnalysis0.process(node1, node1);
      assertFalse(node1.isTypeOf());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Node node0 = Node.newString(105, "com.google.javascript.jscomp.ControlFlowAnalysis$1", 130, 1507);
      boolean boolean0 = ControlFlowAnalysis.mayThrowException(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("}+ w&}OFKnmIA");
      Node node1 = new Node(125, node0);
      boolean boolean0 = ControlFlowAnalysis.mayThrowException(node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Node node0 = Node.newString("is]x");
      Node node1 = new Node(77, node0);
      // Undeclared exception!
      try { 
        ControlFlowAnalysis.isBreakTarget(node1, "vKt3");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("}+ w&}OFKnmIA");
      Node node1 = new Node(108, node0);
      // Undeclared exception!
      try { 
        ControlFlowAnalysis.isBreakTarget(node1, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("}+ w&}OFKnmIA");
      Node node1 = new Node(110, node0);
      // Undeclared exception!
      try { 
        ControlFlowAnalysis.isBreakTarget(node1, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Node node0 = Node.newString(113, "com.google.javascript.jscomp.ControlFlowAnalysis$1", 130, 1507);
      // Undeclared exception!
      try { 
        ControlFlowAnalysis.isBreakTarget(node0, "com.google.javascript.jscomp.ControlFlowAnalysis$1");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Node node0 = new Node(114, (-3735), 114);
      // Undeclared exception!
      try { 
        ControlFlowAnalysis.isBreakTarget(node0, "i)XjruO");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Node node0 = new Node(114, (-3735), 114);
      boolean boolean0 = ControlFlowAnalysis.isContinueStructure(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Node node0 = new Node(115, (-3735), 115);
      boolean boolean0 = ControlFlowAnalysis.isContinueStructure(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Logger logger0 = Logger.getLogger("");
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.ProcessTweaks$TweakInfo");
      Node node1 = ControlFlowAnalysis.getExceptionHandler(node0);
      assertNull(node1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Node node0 = Node.newString(105, "com.google.javascript.jscomp.ControlFlowAnalysis$1", 130, 1507);
      Node node1 = ControlFlowAnalysis.getExceptionHandler(node0);
      assertNull(node1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("}+ w&}OFKnmIA");
      Node node1 = new Node(125, node0);
      node0.setType(47);
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
}
