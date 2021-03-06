/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 11:44:42 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.InlineVariables;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InlineVariables_ESTest extends InlineVariables_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.ALL;
      InlineVariables inlineVariables0 = new InlineVariables(compiler0, inlineVariables_Mode0, false);
      Node node0 = Node.newNumber(0.0, 1362, 1362);
      // Undeclared exception!
      try { 
        inlineVariables0.process(node0, node0);
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

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.LOCALS_ONLY;
      InlineVariables inlineVariables0 = new InlineVariables(compiler0, inlineVariables_Mode0, false);
      Node node0 = Node.newString(3510, "b_vI~g={e", 3510, 157);
      // Undeclared exception!
      try { 
        inlineVariables0.process(node0, node0);
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

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.CONSTANTS_ONLY;
      InlineVariables inlineVariables0 = new InlineVariables((AbstractCompiler) null, inlineVariables_Mode0, true);
      Node node0 = Node.newNumber(0.7);
      // Undeclared exception!
      try { 
        inlineVariables0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }
}
