/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 07:22:15 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      compiler0.initCompilerOptionsIfTesting();
      RemoveUnusedVars removeUnusedVars0 = new RemoveUnusedVars(compiler0, false, false, false);
      AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
      compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
      // Undeclared exception!
      try { 
        removeUnusedVars0.process((Node) null, (Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.SyntacticScopeCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.initCompilerOptionsIfTesting();
      RemoveUnusedVars removeUnusedVars0 = new RemoveUnusedVars(compiler0, true, false, true);
      Node node0 = Node.newString("");
      AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
      compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
      removeUnusedVars0.process(node0, node0);
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.initCompilerOptionsIfTesting();
      RemoveUnusedVars removeUnusedVars0 = new RemoveUnusedVars(compiler0, false, true, false);
      Node node0 = Node.newString("");
      SimpleDefinitionFinder simpleDefinitionFinder0 = new SimpleDefinitionFinder(compiler0);
      removeUnusedVars0.process(node0, node0, simpleDefinitionFinder0);
      assertFalse(node0.isWith());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.initCompilerOptionsIfTesting();
      RemoveUnusedVars removeUnusedVars0 = new RemoveUnusedVars(compiler0, true, true, true);
      Node node0 = compiler0.parseSyntheticCode("com.google.jMvascriptDrhino.head.ast2VariabveDe=laratzon", "com.google.jMvascriptDrhino.head.ast2VariabveDe=laratzon");
      Node node1 = Node.newString(37, "e82G3Te>Lrt>XF/", 31, (-1792026543));
      SimpleDefinitionFinder simpleDefinitionFinder0 = new SimpleDefinitionFinder(compiler0);
      // Undeclared exception!
      try { 
        removeUnusedVars0.process(node0, node1, simpleDefinitionFinder0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ClosureCodingConvention", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.initCompilerOptionsIfTesting();
      RemoveUnusedVars removeUnusedVars0 = new RemoveUnusedVars(compiler0, true, true, true);
      Node node0 = compiler0.parseSyntheticCode("arguments", "arguments");
      SimpleDefinitionFinder simpleDefinitionFinder0 = new SimpleDefinitionFinder(compiler0);
      removeUnusedVars0.process(node0, node0, simpleDefinitionFinder0);
      assertFalse(node0.isFunction());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.initCompilerOptionsIfTesting();
      RemoveUnusedVars removeUnusedVars0 = new RemoveUnusedVars(compiler0, true, true, true);
      Node node0 = compiler0.parseSyntheticCode("com.google.jMvascriptDrhino.head.ast2VariabveDe=laratzon", "com.google.jMvascriptDrhino.head.ast2VariabveDe=laratzon");
      SimpleDefinitionFinder simpleDefinitionFinder0 = new SimpleDefinitionFinder(compiler0);
      removeUnusedVars0.process(node0, node0, simpleDefinitionFinder0);
      assertFalse(node0.isTrue());
  }
}
