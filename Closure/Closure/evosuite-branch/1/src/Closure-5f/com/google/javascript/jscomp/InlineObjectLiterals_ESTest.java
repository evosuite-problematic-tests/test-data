/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 06:49:10 GMT 2018
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.InlineObjectLiterals;
import com.google.javascript.jscomp.RenameLabels;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InlineObjectLiterals_ESTest extends InlineObjectLiterals_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      InlineObjectLiterals inlineObjectLiterals0 = new InlineObjectLiterals((AbstractCompiler) null, renameLabels_DefaultNameSupplier0);
      // Undeclared exception!
      try { 
        inlineObjectLiterals0.process((Node) null, (Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }
}
