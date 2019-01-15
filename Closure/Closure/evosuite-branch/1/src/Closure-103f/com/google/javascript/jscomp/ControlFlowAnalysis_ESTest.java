/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 10:34:56 GMT 2018
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ControlFlowAnalysis;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.DefaultCodingConvention;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.MemoizedScopeCreator;
import com.google.javascript.jscomp.NameReferenceGraph;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.List;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ControlFlowAnalysis_ESTest extends ControlFlowAnalysis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true);
      Node node0 = new Node(119);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true);
      Node node0 = new Node(30);
      controlFlowAnalysis0.process(node0, node0);
      assertEquals(45, Node.IS_VAR_ARGS_PARAM);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(77, nodeArray0, 77, (-804));
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true);
      controlFlowAnalysis0.process(node0, node0);
      assertEquals(44, Node.IS_OPTIONAL_PARAM);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false);
      Node node0 = new Node(75, (-1033), (-1033));
      node0.setType(49);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, controlFlowAnalysis0);
      controlFlowAnalysis0.visit(nodeTraversal0, node0, node0);
      assertEquals(0, nodeTraversal0.getLineNumber());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("m@$4Cmq", true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      Compiler compiler0 = new Compiler(mockPrintStream0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true);
      ControlFlowGraph<Node> controlFlowGraph0 = controlFlowAnalysis0.getCfg();
      assertNull(controlFlowGraph0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(111, nodeArray0, 111, (-804));
      Node node1 = new Node(37, node0, 12, 11);
      node0.addChildrenToFront(node1);
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true);
      controlFlowAnalysis0.process(node0, node0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, controlFlowAnalysis0, (ScopeCreator) null);
      boolean boolean0 = controlFlowAnalysis0.shouldTraverse(nodeTraversal0, node0, node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false);
      Node node0 = new Node(75, (-1033), (-1033));
      controlFlowAnalysis0.process(node0, node0);
      node0.setType(49);
      boolean boolean0 = controlFlowAnalysis0.shouldTraverse((NodeTraversal) null, node0, node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(111, nodeArray0, 111, (-804));
      Node node1 = new Node(37, node0, 12, 11);
      node0.addChildrenToFront(node1);
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true);
      controlFlowAnalysis0.process(node0, node1);
      assertNotSame(node1, node0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Node node0 = new Node((-804));
      Node node1 = new Node(4, node0, node0, node0, node0, 38, 13);
      node0.addChildrenToFront(node1);
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Node node0 = new Node(108);
      node0.addChildrenToFront(node0);
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(110, nodeArray0, 110, (-800));
      node0.addChildrenToFront(node0);
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true);
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
  public void test11()  throws Throwable  {
      Node node0 = new Node(113);
      node0.addChildrenToFront(node0);
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(116, nodeArray0, 116, (-804));
      node0.addChildrenToFront(node0);
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(117);
      node0.addChildToBack(node0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Node node0 = new Node(118);
      node0.addChildrenToFront(node0);
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true);
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
  public void test15()  throws Throwable  {
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(126, nodeArray0, 126, (-804));
      Node node1 = new Node(37, node0, 12, 11);
      node0.addChildrenToFront(node1);
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true);
      controlFlowAnalysis0.process(node0, node0);
      assertEquals(34, Node.PARENTHESIZED_PROP);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(115, nodeArray0);
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false);
      DefaultCodingConvention defaultCodingConvention0 = new DefaultCodingConvention();
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, defaultCodingConvention0);
      MemoizedScopeCreator memoizedScopeCreator0 = new MemoizedScopeCreator(typedScopeCreator0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, controlFlowAnalysis0, memoizedScopeCreator0);
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
  public void test17()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Vector<JSType> vector0 = new Vector<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) vector0);
      Compiler compiler0 = new Compiler();
      Node node1 = compiler0.parseTestCode("$R?aa2{A7+");
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, (NodeTraversal.Callback) null);
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
  public void test18()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true);
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode("com.google.javascript.jscomp.ControlFlowAnalysis$AstControlFlowGraph$2", "com.google.javascript.jscomp.MinimizeExitPoints");
      Node node0 = compiler0.parse(jSSourceFile0);
      NameReferenceGraph.Reference nameReferenceGraph_Reference0 = new NameReferenceGraph.Reference(node0, node0);
      controlFlowAnalysis0.process(node0, node0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, (NodeTraversal.Callback) null, (ScopeCreator) null);
      Node node1 = new Node(2, node0, nameReferenceGraph_Reference0.parent, 4095, (-3));
      controlFlowAnalysis0.visit(nodeTraversal0, nameReferenceGraph_Reference0.site, node1);
      assertEquals(2, Node.RIGHT);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Vector<JSType> vector0 = new Vector<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) vector0);
      Compiler compiler0 = new Compiler();
      Node node1 = compiler0.parseTestCode("$R?aa2{A7+");
      node0.addChildAfter(node1, node1);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false);
      controlFlowAnalysis0.process(node0, node0);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, (NodeTraversal.Callback) null);
      controlFlowAnalysis0.visit(nodeTraversal0, node1, node0);
      assertEquals(2, Node.RIGHT);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(116, nodeArray0, 116, (-804));
      Node node1 = new Node(37, node0, 12, 11);
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // Cannot find break target.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(117);
      Node node1 = Node.newString("m@$4Cmq");
      node1.addChildrenToFront(node0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node1, node0);
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
  public void test22()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false);
      Node node0 = Node.newNumber((double) 0L);
      Node node1 = new Node(4, (-897), 30);
      controlFlowAnalysis0.process(node0, node1);
      assertEquals(2, Node.BREAK_PROP);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(77, nodeArray0, 77, (-804));
      Node node1 = new Node(37, node0, 12, 11);
      node0.addChildrenToFront(node1);
      Compiler compiler0 = new Compiler();
      node0.detachFromParent();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(111, nodeArray0, 111, (-804));
      Node node1 = new Node(37, node0, 12, 11);
      node0.addChildrenToFront(node1);
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, controlFlowAnalysis0);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.visit(nodeTraversal0, node1, node1);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(113, nodeArray0, 113, (-804));
      Node node1 = new Node(37, node0, 12, 11);
      node0.addChildrenToFront(node1);
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, controlFlowAnalysis0, (ScopeCreator) null);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.visit(nodeTraversal0, node1, node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true);
      Node node0 = new Node(115);
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
  public void test27()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("m@$4Cmq", true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      Compiler compiler0 = new Compiler(mockPrintStream0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, controlFlowAnalysis0);
      Node node0 = new Node((-649));
      controlFlowAnalysis0.process(node0, node0);
      Node node1 = new Node(35, node0, 276, 35);
      controlFlowAnalysis0.visit(nodeTraversal0, node1, node0);
      assertEquals(4, Node.ENUM_PROP);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true);
      Node node0 = Node.newNumber((double) 0L);
      Node node1 = new Node((byte)52, 0, 30);
      controlFlowAnalysis0.process(node0, node1);
      assertEquals(36, Node.OPT_ARG_NAME);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false);
      Node node0 = new Node(86, (-1033), (-1033));
      controlFlowAnalysis0.process(node0, node0);
      assertEquals(1, Node.LEFT);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Vector<JSType> vector0 = new Vector<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) vector0);
      node0.setType(102);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, true);
      controlFlowAnalysis0.process(node0, node0);
      assertEquals(7, Node.LOCAL_PROP);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true);
      Node node0 = new Node(103);
      controlFlowAnalysis0.process(node0, node0);
      assertEquals(15, Node.CASEARRAY_PROP);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false);
      Node node0 = Node.newString(7, "com.google.javascript.jscomp.ControlFlowAnalysis$AstControlFlowGraph");
      Node node1 = new Node(4354, node0, node0, 8, 2561);
      controlFlowAnalysis0.process(node1, node1);
      assertEquals(12, Node.REGEXP_PROP);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(77, nodeArray0, 77, (-804));
      boolean boolean0 = ControlFlowAnalysis.isBreakStructure(node0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Node node0 = new Node(108);
      boolean boolean0 = ControlFlowAnalysis.isBreakStructure(node0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(110, nodeArray0, 110, (-804));
      boolean boolean0 = ControlFlowAnalysis.isBreakStructure(node0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Node node0 = new Node(113);
      boolean boolean0 = ControlFlowAnalysis.isBreakStructure(node0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Node node0 = new Node(115);
      boolean boolean0 = ControlFlowAnalysis.isBreakStructure(node0, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("%bU<8-f;5z+i-:0i");
      boolean boolean0 = ControlFlowAnalysis.isBreakStructure(node0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(113, nodeArray0, 113, (-804));
      boolean boolean0 = ControlFlowAnalysis.isContinueStructure(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Node node0 = new Node(115);
      boolean boolean0 = ControlFlowAnalysis.isContinueStructure(node0);
      assertTrue(boolean0);
  }
}