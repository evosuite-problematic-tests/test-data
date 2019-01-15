/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 08:18:43 GMT 2018
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.RemoveUnusedVars;
import com.google.javascript.jscomp.SimpleDefinitionFinder;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RemoveUnusedVars_ESTest extends RemoveUnusedVars_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED;
      compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
      RemoveUnusedVars removeUnusedVars0 = new RemoveUnusedVars(compiler0, false, false, false);
      Node node0 = compiler0.parseTestCode("arguments");
      removeUnusedVars0.process(node0, node0);
      assertEquals(132, node0.getType());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      RemoveUnusedVars removeUnusedVars0 = new RemoveUnusedVars(compiler0, true, true, true);
      Node node0 = Node.newNumber((double) 0L);
      AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED;
      compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
      removeUnusedVars0.process(node0, node0);
      assertFalse(node0.isVoid());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED;
      compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
      RemoveUnusedVars removeUnusedVars0 = new RemoveUnusedVars(compiler0, false, false, false);
      Node node0 = compiler0.parseTestCode("fC= qgc_cY|vHh");
      removeUnusedVars0.process(node0, node0);
      assertEquals(4096, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      RemoveUnusedVars removeUnusedVars0 = new RemoveUnusedVars(compiler0, true, true, true);
      Node node0 = Node.newNumber((double) 4294967295L);
      Node node1 = new Node(52, node0, 52, 1);
      node1.setType(86);
      SimpleDefinitionFinder simpleDefinitionFinder0 = new SimpleDefinitionFinder(compiler0);
      removeUnusedVars0.process(node0, node1, simpleDefinitionFinder0);
      assertEquals(16, Node.SOURCENAME_PROP);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      RemoveUnusedVars removeUnusedVars0 = new RemoveUnusedVars(compiler0, true, true, true);
      Node node0 = Node.newNumber((double) 4294967295L);
      Node node1 = new Node(52, node0, 52, 1);
      node1.setType(37);
      SimpleDefinitionFinder simpleDefinitionFinder0 = new SimpleDefinitionFinder(compiler0);
      removeUnusedVars0.process(node0, node1, simpleDefinitionFinder0);
      assertFalse(node1.isSetterDef());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED;
      compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
      RemoveUnusedVars removeUnusedVars0 = new RemoveUnusedVars(compiler0, false, false, false);
      Node node0 = compiler0.parseTestCode("fC=Rqgc_=Y|vHh");
      removeUnusedVars0.process(node0, node0);
      assertEquals(1, Node.FLAG_GLOBAL_STATE_UNMODIFIED);
  }
}
