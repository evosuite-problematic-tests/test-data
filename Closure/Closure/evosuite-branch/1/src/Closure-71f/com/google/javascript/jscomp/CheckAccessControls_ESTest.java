/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 09:16:21 GMT 2018
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.CheckAccessControls;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CheckAccessControls_ESTest extends CheckAccessControls_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      CheckAccessControls checkAccessControls0 = new CheckAccessControls(compiler0);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "missingProperties", "\",-|iE");
      checkAccessControls0.process(node0, node0);
      assertFalse(node0.isQuotedString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("oA.google.Wavascript.jscomp=heckAcc5sCotrols", "oA.google.Wavascript.jscomp=heckAcc5sCotrols");
      CheckAccessControls checkAccessControls0 = new CheckAccessControls(compiler0);
      checkAccessControls0.hotSwapScript(node0);
      assertEquals(42, Node.SIDE_EFFECT_FLAGS);
  }
}
