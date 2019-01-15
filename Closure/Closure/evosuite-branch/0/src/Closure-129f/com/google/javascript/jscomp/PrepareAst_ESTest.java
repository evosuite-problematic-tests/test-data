/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 07 07:26:25 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.MemoizedScopeCreator;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.PrepareAst;
import com.google.javascript.jscomp.SyntacticScopeCreator;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.jscomp.Tracer;
import com.google.javascript.rhino.Node;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrepareAst_ESTest extends PrepareAst_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      PrepareAst prepareAst0 = new PrepareAst(compiler0, true);
      SyntheticAst syntheticAst0 = new SyntheticAst("ui;vJ1'j$#GJT)8O");
      Node node0 = syntheticAst0.getAstRoot(compiler0);
      prepareAst0.process(node0, node0);
      assertFalse(node0.isFor());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Logger logger0 = Tracer.logger;
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      PrepareAst prepareAst0 = new PrepareAst(compiler0);
      Node node0 = new Node((-734), 306, 306);
      prepareAst0.process(node0, node0);
      assertEquals(4, Node.FLAG_ARGUMENTS_UNMODIFIED);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PrepareAst prepareAst0 = new PrepareAst((AbstractCompiler) null);
      prepareAst0.process((Node) null, (Node) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      SyntheticAst syntheticAst0 = new SyntheticAst("ui;vJ1'j$#GJT)8O");
      Node node0 = syntheticAst0.getAstRoot(compiler0);
      PrepareAst.PrepareAnnotations prepareAst_PrepareAnnotations0 = new PrepareAst.PrepareAnnotations();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      MemoizedScopeCreator memoizedScopeCreator0 = new MemoizedScopeCreator(syntacticScopeCreator0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, prepareAst_PrepareAnnotations0, memoizedScopeCreator0);
      Node node1 = new Node(37, node0, node0, node0, 46, 37);
      prepareAst_PrepareAnnotations0.visit(nodeTraversal0, node1, node1);
      assertEquals(12, Node.COLUMN_BITS);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PrepareAst.PrepareAnnotations prepareAst_PrepareAnnotations0 = new PrepareAst.PrepareAnnotations();
      Node node0 = new Node(105, 105, 105);
      prepareAst_PrepareAnnotations0.visit((NodeTraversal) null, node0, node0);
      assertEquals(12, Node.COLUMN_BITS);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PrepareAst.PrepareAnnotations prepareAst_PrepareAnnotations0 = new PrepareAst.PrepareAnnotations();
      Node node0 = new Node(64);
      node0.addChildrenToBack(node0);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, prepareAst_PrepareAnnotations0);
      boolean boolean0 = prepareAst_PrepareAnnotations0.shouldTraverse(nodeTraversal0, node0, node0);
      assertTrue(boolean0);
  }
}