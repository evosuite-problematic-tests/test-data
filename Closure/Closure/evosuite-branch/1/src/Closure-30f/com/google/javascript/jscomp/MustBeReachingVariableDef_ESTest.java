/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 07:41:54 GMT 2018
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.MustBeReachingVariableDef;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.graph.DiGraph;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.Iterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MustBeReachingVariableDef_ESTest extends MustBeReachingVariableDef_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Node node0 = new Node(100);
      Compiler compiler0 = new Compiler();
      Node node1 = compiler0.parseSyntheticCode("arguments", "arguments");
      node0.addChildrenToBack(node1);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      scope0.declare("arguments", node1, (JSType) null, (CompilerInput) null, true);
      mustBeReachingVariableDef0.analyze(30);
      Node node2 = mustBeReachingVariableDef0.getDef("arguments", node0);
      assertFalse(node2.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Node node0 = new Node(100, 100, 100);
      Compiler compiler0 = new Compiler();
      Node node1 = compiler0.parseSyntheticCode("arguments", "arguments");
      node0.addChildrenToBack(node1);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      scope0.declare("arguments", node1, (JSType) null, (CompilerInput) null, true);
      mustBeReachingVariableDef0.analyze(30);
      DiGraph.DiGraphNode<Node, ControlFlowGraph.Branch> diGraph_DiGraphNode0 = (DiGraph.DiGraphNode<Node, ControlFlowGraph.Branch>)controlFlowGraph0.createDirectedGraphNode(node0);
      boolean boolean0 = mustBeReachingVariableDef0.flow(diGraph_DiGraphNode0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef0 = new MustBeReachingVariableDef.MustDef();
      Node node0 = new Node((-1279), (-1279), (-23));
      Scope scope0 = new Scope(node0, (ObjectType) null);
      Iterator<Scope.Var> iterator0 = scope0.getVars();
      boolean boolean0 = mustBeReachingVariableDef_MustDef0.equals(iterator0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef0 = new MustBeReachingVariableDef.MustDef();
      Node node0 = new Node((-1294), (-1294), (-1294));
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, false, false);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef1 = mustBeReachingVariableDef0.join(mustBeReachingVariableDef_MustDef0, mustBeReachingVariableDef_MustDef0);
      assertNotSame(mustBeReachingVariableDef_MustDef1, mustBeReachingVariableDef_MustDef0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Node node0 = new Node(98);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      // Undeclared exception!
      try { 
        mustBeReachingVariableDef0.analyze(30);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.MustBeReachingVariableDef", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Node node0 = new Node(99);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      mustBeReachingVariableDef0.analyze(30);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Node node0 = new Node(101);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      // Undeclared exception!
      try { 
        mustBeReachingVariableDef0.analyze(30);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.MustBeReachingVariableDef", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Node node0 = new Node(103);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      // Undeclared exception!
      try { 
        mustBeReachingVariableDef0.analyze(30);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.MustBeReachingVariableDef", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Node node0 = new Node(104);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      mustBeReachingVariableDef0.analyze(30);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Node node0 = new Node(106);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      mustBeReachingVariableDef0.analyze(30);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Node node0 = new Node(107);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      mustBeReachingVariableDef0.analyze(30);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Node node0 = new Node(108);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      // Undeclared exception!
      try { 
        mustBeReachingVariableDef0.analyze(30);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.MustBeReachingVariableDef", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Node node0 = new Node(109);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      mustBeReachingVariableDef0.analyze(30);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Node node0 = new Node(110);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      mustBeReachingVariableDef0.analyze(30);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Node node0 = new Node(111);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      mustBeReachingVariableDef0.analyze(30);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Node node0 = new Node(112);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      mustBeReachingVariableDef0.analyze(30);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Node node0 = new Node(113);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      // Undeclared exception!
      try { 
        mustBeReachingVariableDef0.analyze(30);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.MustBeReachingVariableDef", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Node node0 = new Node(114);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      // Undeclared exception!
      try { 
        mustBeReachingVariableDef0.analyze(30);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.MustBeReachingVariableDef", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Node node0 = new Node(115);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      // Undeclared exception!
      try { 
        mustBeReachingVariableDef0.analyze(30);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // malformed 'for' statement FOR
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Node node0 = new Node(116);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      mustBeReachingVariableDef0.analyze(30);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Node node0 = new Node(117);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      mustBeReachingVariableDef0.analyze(30);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Node node0 = new Node(119);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      mustBeReachingVariableDef0.analyze(30);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Node node0 = new Node(120);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      mustBeReachingVariableDef0.analyze(30);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Node node0 = new Node(121);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      mustBeReachingVariableDef0.analyze(30);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Node node0 = new Node(122);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      mustBeReachingVariableDef0.analyze(30);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Node node0 = new Node(123);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      mustBeReachingVariableDef0.analyze(30);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Node node0 = new Node(124);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      mustBeReachingVariableDef0.analyze(30);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Node node0 = new Node(125);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      mustBeReachingVariableDef0.analyze(30);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Node node0 = new Node(118);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      Node node1 = Node.newNumber(2472.8300409197, 52, (-1082006378));
      node0.addChildrenToFront(node1);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      mustBeReachingVariableDef0.analyze(30);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Node node0 = new Node(118, 118, 118);
      Compiler compiler0 = new Compiler();
      Node node1 = compiler0.parseSyntheticCode("arguments", "arguments");
      node0.addChildrenToBack(node1);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      // Undeclared exception!
      try { 
        mustBeReachingVariableDef0.analyze(30);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // SCRIPT 1 [synthetic: com.google.javascript.rhino.Node$IntPropListItem@0000000512] [source_file: com.google.javascript.rhino.Node$ObjectPropListItem@0000000513] [input_id: com.google.javascript.rhino.Node$ObjectPropListItem@0000000514] is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Node node0 = new Node(102);
      Compiler compiler0 = new Compiler();
      Node node1 = compiler0.parseSyntheticCode("m;VhX=-eW/zO;pZ", "m;VhX=-eW/zO;pZ");
      node0.addChildrenToBack(node1);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      mustBeReachingVariableDef0.analyze(30);
      Node node2 = mustBeReachingVariableDef0.getDef("m;VhX=-eW/zO;pZ", node0);
      assertNull(node2);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Node node0 = new Node(97);
      Compiler compiler0 = new Compiler();
      Node node1 = compiler0.parseTestCode("Cannot pass in both unaliasable and aliasable globals; you must choose one or the other.");
      node0.addChildToBack(node1);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, (AbstractCompiler) null);
      mustBeReachingVariableDef0.analyze(30);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Node node0 = new Node(100);
      Compiler compiler0 = new Compiler();
      Node node1 = compiler0.parseSyntheticCode("m;VhX=-eW/zO;pZ", "m;VhX=-eW/zO;pZ");
      node0.addChildrenToBack(node1);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      mustBeReachingVariableDef0.analyze(30);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Node node0 = new Node(100, 100, 100);
      Compiler compiler0 = new Compiler();
      Node node1 = compiler0.parseSyntheticCode("arguments", "arguments");
      node0.addChildrenToBack(node1);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      scope0.declare("arguments", node1, (JSType) null, (CompilerInput) null, true);
      mustBeReachingVariableDef0.analyze(30);
      boolean boolean0 = mustBeReachingVariableDef0.dependsOnOuterScopeVars("arguments", node0);
      assertFalse(boolean0);
  }
}
