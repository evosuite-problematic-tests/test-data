/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 10:07:13 GMT 2018
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CheckGlobalThis;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.PeepholeFoldConstants;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CheckGlobalThis_ESTest extends CheckGlobalThis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Node node0 = new Node(105, 105, 105);
      node0.addChildToBack(node0);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis((AbstractCompiler) null, checkLevel0);
      Compiler compiler0 = new Compiler();
      Node node1 = compiler0.parseSyntheticCode("W]nZV^i,H", "dangerous use of the global 'this' object");
      boolean boolean0 = checkGlobalThis0.shouldTraverse((NodeTraversal) null, node0, node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Node node0 = new Node(105, 105, 105);
      node0.addChildToBack(node0);
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis((AbstractCompiler) null, checkLevel0);
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      SyntheticAst syntheticAst0 = new SyntheticAst("zw@70IbTCN");
      Node node1 = syntheticAst0.getAstRoot((AbstractCompiler) null);
      Node node2 = peepholeFoldConstants0.optimizeSubtree(node1);
      boolean boolean0 = checkGlobalThis0.shouldTraverse((NodeTraversal) null, node0, node2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis((AbstractCompiler) null, checkLevel0);
      Node node0 = new Node(105, 105, 105);
      Node node1 = new Node(2, node0, node0, node0, 9, 2);
      node0.addChildToFront(node1);
      node1.setType(38);
      boolean boolean0 = checkGlobalThis0.shouldTraverse((NodeTraversal) null, node0, node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis((AbstractCompiler) null, checkLevel0);
      Node node0 = new Node(105, 105, 105);
      Node node1 = new Node(86, node0);
      checkGlobalThis0.shouldTraverse((NodeTraversal) null, node0, node1);
      boolean boolean0 = checkGlobalThis0.shouldTraverse((NodeTraversal) null, node0, node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis((AbstractCompiler) null, checkLevel0);
      Node node0 = new Node(105, 105, 105);
      node0.addSuppression("");
      Node node1 = Node.newString("", 15, 2);
      // Undeclared exception!
      try { 
        checkGlobalThis0.shouldTraverse((NodeTraversal) null, node0, node1);
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
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis((AbstractCompiler) null, checkLevel0);
      Node node0 = new Node(105, 105, 105);
      Node node1 = new Node(42, node0);
      Node node2 = Node.newNumber((double) 8);
      boolean boolean0 = checkGlobalThis0.shouldTraverse((NodeTraversal) null, node0, node2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      Node node0 = Node.newString(102, "Ek,QNm", (-72), 102);
      NodeTraversal.traverse((AbstractCompiler) compiler0, node0, (NodeTraversal.Callback) checkGlobalThis0);
      assertEquals(8, Node.CODEOFFSET_PROP);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis((AbstractCompiler) null, checkLevel0);
      Node node0 = new Node(105, 105, 105);
      Node node1 = new Node(86, node0);
      boolean boolean0 = checkGlobalThis0.shouldTraverse((NodeTraversal) null, node1, node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis((AbstractCompiler) null, checkLevel0);
      Node node0 = new Node(105, 105, 105);
      Node node1 = new Node(42, node0);
      checkGlobalThis0.visit((NodeTraversal) null, node1, node1);
      assertEquals(4095, Node.MAX_COLUMN_NUMBER);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis((AbstractCompiler) null, checkLevel0);
      Node node0 = new Node(105, 105, 105);
      Node node1 = new Node(86, node0);
      checkGlobalThis0.shouldTraverse((NodeTraversal) null, node0, node1);
      checkGlobalThis0.visit((NodeTraversal) null, node0, node1);
      assertEquals(4095, Node.MAX_COLUMN_NUMBER);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis((AbstractCompiler) null, checkLevel0);
      Node node0 = new Node(105, 105, 105);
      Node node1 = new Node(42, node0);
      checkGlobalThis0.visit((NodeTraversal) null, node1, (Node) null);
      assertTrue(node1.isQualifiedName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis((AbstractCompiler) null, checkLevel0);
      Node node0 = new Node(105, 8303, 105);
      Node node1 = new Node(2, node0, node0, node0, 9, 2);
      node1.setType(38);
      node1.addSuppression("");
      boolean boolean0 = checkGlobalThis0.shouldTraverse((NodeTraversal) null, node0, node0);
      assertFalse(boolean0);
  }
}
