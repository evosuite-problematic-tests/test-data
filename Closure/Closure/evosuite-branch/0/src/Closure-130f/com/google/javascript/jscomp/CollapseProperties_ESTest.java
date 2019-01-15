/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 07 07:28:20 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CollapseProperties;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.rhino.Node;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CollapseProperties_ESTest extends CollapseProperties_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CollapseProperties collapseProperties0 = new CollapseProperties((AbstractCompiler) null, true, false);
      Node node0 = Node.newString(0, "", 0, 1711);
      collapseProperties0.process(node0, node0);
      assertEquals(48, Node.DIRECTIVES);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      CollapseProperties collapseProperties0 = new CollapseProperties(compiler0, false, true);
      Node node0 = Node.newString(91, "/$|MK`lja=9ly");
      collapseProperties0.process(node0, node0);
      assertFalse(node0.isLabelName());
  }
}
