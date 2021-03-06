/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 07:27:29 GMT 2018
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.CheckSideEffects;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CheckSideEffects_ESTest extends CheckSideEffects_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects((AbstractCompiler) null, checkLevel0, false);
      Node node0 = new Node(8233, 3119, 3119);
      checkSideEffects0.hotSwapScript(node0, node0);
      assertEquals(54, Node.SLASH_V);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, true);
      Node node0 = compiler0.parseTestCode("B");
      // Undeclared exception!
      try { 
        checkSideEffects0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Logger logger0 = Logger.getAnonymousLogger();
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      CheckSideEffects.StripProtection checkSideEffects_StripProtection0 = new CheckSideEffects.StripProtection(compiler0);
      Node node0 = new Node(1329, 1329, 0);
      checkSideEffects_StripProtection0.process(node0, node0);
      assertEquals(8, Node.FLAG_NO_THROWS);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      SyntheticAst syntheticAst0 = new SyntheticAst(",T;241J$w]qW@V");
      Node node0 = syntheticAst0.getAstRoot(compiler0);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, false);
      checkSideEffects0.process(node0, node0);
      assertFalse(node0.isDec());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, true);
      Node node0 = compiler0.parseTestCode("5>MEH");
      // Undeclared exception!
      try { 
        checkSideEffects0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, true);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSType[] jSTypeArray0 = new JSType[0];
      Node node0 = jSTypeRegistry0.createOptionalParameters(jSTypeArray0);
      checkSideEffects0.process(node0, node0);
      assertFalse(node0.isWhile());
  }
}
