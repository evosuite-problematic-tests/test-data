/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 10:56:58 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.CheckGlobalThis;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import java.io.PipedOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CheckGlobalThis_ESTest extends CheckGlobalThis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, (CheckLevel) null);
      Node node0 = new Node(105, 118, 105);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      node0.setJSDocInfo(jSDocInfo0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0);
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, (CheckLevel) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0, (ScopeCreator) null);
      Node node0 = new Node(105, 118, 105);
      Node node1 = new Node(19, node0, node0, node0, 21, 49);
      Node node2 = compiler0.parseSyntheticCode("Ad)C-Hs)Dnb!ySf", "Ad)C-Hs)Dnb!ySf");
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, (CheckLevel) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0, (ScopeCreator) null);
      Node node0 = new Node(105, 118, 105);
      Node node1 = new Node(19, node0, node0, node0, 21, 49);
      SyntheticAst syntheticAst0 = new SyntheticAst("Ad)C-Hs)Dnb!ySf");
      Node node2 = syntheticAst0.getAstRoot(compiler0);
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, (CheckLevel) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0, (ScopeCreator) null);
      Node node0 = new Node(105, (byte)42, 105);
      Node node1 = new Node(39, node0, node0, 28, 4095);
      node1.setType(38);
      Node node2 = new Node((-340), node1, node1, node1, node1, 2189, 125);
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0);
      Node node0 = Node.newString("dangerous use of the global 'this' object");
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, (Node) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, (CheckLevel) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0, (ScopeCreator) null);
      Node node0 = new Node(86, 118, 86);
      Node node1 = new Node(19, node0, node0, node0, 21, 49);
      node0.addChildToBack(node1);
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, (CheckLevel) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0, (ScopeCreator) null);
      Node node0 = new Node(86, 118, 86);
      node0.addChildToBack(node0);
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node0);
      boolean boolean1 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node0);
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, (CheckLevel) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0, (ScopeCreator) null);
      Node node0 = new Node(105, (byte)42, 105);
      node0.setType(42);
      checkGlobalThis0.visit(nodeTraversal0, node0, node0);
      assertEquals(2, Node.BREAK_PROP);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, (CheckLevel) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0, (ScopeCreator) null);
      Node node0 = new Node(86, 118, 86);
      node0.addChildToBack(node0);
      checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node0);
      checkGlobalThis0.visit(nodeTraversal0, node0, node0);
      assertEquals(22, Node.TARGETBLOCK_PROP);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, true);
      Compiler compiler0 = new Compiler(mockPrintStream0);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      MakeDeclaredNamesUnique.ContextualRenameInverter makeDeclaredNamesUnique_ContextualRenameInverter0 = (MakeDeclaredNamesUnique.ContextualRenameInverter)MakeDeclaredNamesUnique.getContextualRenameInverter(compiler0);
      Node node0 = new Node(42, 30, 25);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, makeDeclaredNamesUnique_ContextualRenameInverter0);
      checkGlobalThis0.visit(nodeTraversal0, node0, (Node) null);
      assertEquals(2, Node.SPECIALCALL_WITH);
  }
}