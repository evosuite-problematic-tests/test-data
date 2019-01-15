/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 09:49:57 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.VarCheck;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VarCheck_ESTest extends VarCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.initCompilerOptionsIfTesting();
      VarCheck varCheck0 = new VarCheck(compiler0, false);
      Node node0 = Node.newNumber((double) 90);
      Node node1 = new Node(0, node0, node0, node0);
      varCheck0.process(node0, node0);
      assertEquals(6, Node.TEMP_PROP);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("Number node not created with Node.newNumber", "isObject");
      Node node1 = new Node(4, node0, node0, 4, 1);
      VarCheck varCheck0 = new VarCheck(compiler0);
      // Undeclared exception!
      try { 
        varCheck0.process(node0, node0);
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
      Compiler compiler0 = new Compiler();
      compiler0.initCompilerOptionsIfTesting();
      VarCheck varCheck0 = new VarCheck(compiler0, true);
      Node node0 = compiler0.parseSyntheticCode("Number node not created with Node.newNumber", "isObject");
      Node node1 = new Node(41, node0, node0);
      // Undeclared exception!
      try { 
        varCheck0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.initCompilerOptionsIfTesting();
      VarCheck varCheck0 = new VarCheck(compiler0, false);
      Node node0 = compiler0.parseSyntheticCode("Number node not createdwith Node.newNumber", "isO.bj9ct");
      // Undeclared exception!
      try { 
        varCheck0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }
}