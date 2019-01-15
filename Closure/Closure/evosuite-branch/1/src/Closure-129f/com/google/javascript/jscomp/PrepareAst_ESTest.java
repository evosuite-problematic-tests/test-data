/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 11:31:11 GMT 2018
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.PrepareAst;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.rhino.Node;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrepareAst_ESTest extends PrepareAst_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PrepareAst prepareAst0 = new PrepareAst((AbstractCompiler) null);
      Node node0 = Node.newNumber(Double.POSITIVE_INFINITY, 0, (-1416));
      // Undeclared exception!
      try { 
        prepareAst0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("waIP");
      assertEquals(50, Node.FREE_CALL);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      PrepareAst prepareAst0 = new PrepareAst(compiler0);
      prepareAst0.process((Node) null, (Node) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      PrepareAst prepareAst0 = new PrepareAst(compiler0, true);
      Node node0 = new Node(3608, 3608, 746);
      Node node1 = new Node(1, node0, node0, node0, node0);
      prepareAst0.process(node1, node1);
      assertFalse(node1.isStringKey());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      PrepareAst prepareAst0 = new PrepareAst(compiler0, true);
      Node node0 = new Node('o', 'o', 'o');
      prepareAst0.process(node0, node0);
      assertTrue(node0.isCase());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      PrepareAst prepareAst0 = new PrepareAst(compiler0, true);
      Node node0 = new Node('~', '~', '~');
      prepareAst0.process(node0, node0);
      assertFalse(node0.isDo());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PrepareAst.PrepareAnnotations prepareAst_PrepareAnnotations0 = new PrepareAst.PrepareAnnotations();
      Compiler compiler0 = new Compiler((PrintStream) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, prepareAst_PrepareAnnotations0, (ScopeCreator) null);
      Node node0 = new Node(105);
      prepareAst_PrepareAnnotations0.visit(nodeTraversal0, node0, node0);
      assertEquals(0, nodeTraversal0.getLineNumber());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PrepareAst.PrepareAnnotations prepareAst_PrepareAnnotations0 = new PrepareAst.PrepareAnnotations();
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(3614);
      Node node1 = Node.newString(37, "'s:W3bJs^y");
      node1.addChildrenToBack(node0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, prepareAst_PrepareAnnotations0);
      Scope scope0 = Scope.createGlobalScope(node1);
      nodeTraversal0.traverseInnerNode(node1, node1, scope0);
      assertEquals(49, Node.DIRECT_EVAL);
  }
}
