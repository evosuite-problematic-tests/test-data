/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 07 02:59:40 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CollapseVariableDeclarations;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.SourceExcerptProvider;
import com.google.javascript.jscomp.Tracer;
import com.google.javascript.jscomp.VerboseMessageFormatter;
import com.google.javascript.rhino.Node;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CollapseVariableDeclarations_ESTest extends CollapseVariableDeclarations_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VerboseMessageFormatter verboseMessageFormatter0 = new VerboseMessageFormatter((SourceExcerptProvider) null);
      Logger logger0 = Tracer.logger;
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(verboseMessageFormatter0, logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED;
      compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
      CollapseVariableDeclarations collapseVariableDeclarations0 = null;
      try {
        collapseVariableDeclarations0 = new CollapseVariableDeclarations(compiler0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CollapseVariableDeclarations collapseVariableDeclarations0 = new CollapseVariableDeclarations(compiler0);
      Node node0 = compiler0.parseTestCode("C[Hvhf:/`'}}H");
      collapseVariableDeclarations0.process(node0, node0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CollapseVariableDeclarations collapseVariableDeclarations0 = new CollapseVariableDeclarations(compiler0);
      Node node0 = new Node(118, 3509, 0);
      Node node1 = new Node(1, node0, node0, node0, 49, 4095);
      // Undeclared exception!
      try { 
        collapseVariableDeclarations0.process(node0, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CollapseVariableDeclarations collapseVariableDeclarations0 = new CollapseVariableDeclarations(compiler0);
      Node node0 = new Node(118, 118, 118);
      Node node1 = new Node(118, node0, node0, node0);
      // Undeclared exception!
      try { 
        collapseVariableDeclarations0.process(node0, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }
}
