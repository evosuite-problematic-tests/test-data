/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 05:27:31 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.FlowSensitiveInlineVariables;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FlowSensitiveInlineVariables_ESTest extends FlowSensitiveInlineVariables_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, flowSensitiveInlineVariables0, (ScopeCreator) null);
      flowSensitiveInlineVariables0.exitScope(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables((AbstractCompiler) null);
      Node node0 = Node.newNumber((-231.351571735007));
      Node node1 = new Node(50, node0, node0, node0);
      // Undeclared exception!
      try { 
        flowSensitiveInlineVariables0.process(node0, node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }
}
