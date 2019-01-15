/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 04:58:40 GMT 2019
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
      Node node0 = compiler0.parseTestCode("arguments");
      RemoveUnusedVars removeUnusedVars0 = new RemoveUnusedVars(compiler0, false, false, false);
      AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
      compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
      removeUnusedVars0.process(node0, node0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("arguments");
      RemoveUnusedVars removeUnusedVars0 = new RemoveUnusedVars(compiler0, true, true, true);
      AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
      compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
      // Undeclared exception!
      try { 
        removeUnusedVars0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // Unexpected lValue type NAME
         //   Node(NAME arguments): [testcode]:1:0
         // arguments
         //   Parent(EXPR_RESULT): [testcode]:1:0
         // arguments
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("zLFrS=~xELx8");
      RemoveUnusedVars removeUnusedVars0 = new RemoveUnusedVars(compiler0, true, true, true);
      SimpleDefinitionFinder simpleDefinitionFinder0 = new SimpleDefinitionFinder(compiler0);
      removeUnusedVars0.process(node0, node0, simpleDefinitionFinder0);
      assertFalse(node0.isFor());
  }
}
