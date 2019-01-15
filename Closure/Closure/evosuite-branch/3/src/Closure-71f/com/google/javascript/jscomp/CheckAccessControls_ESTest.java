/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 09:51:03 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.CheckAccessControls;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.TightenTypes;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
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
      Node node0 = compiler0.parseSyntheticCode("c>dW=lS'(PieLMp", "com.googLe.javascript.jscomp.Rena=eLabe8s$1");
      checkAccessControls0.hotSwapScript(node0);
      assertEquals((-1), Node.CATCH_SCOPE_PROP);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      CheckAccessControls checkAccessControls0 = new CheckAccessControls(compiler0);
      Node node0 = Node.newString((-2825), "");
      checkAccessControls0.process(node0, node0);
      assertFalse(node0.hasOneChild());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      CheckAccessControls checkAccessControls0 = new CheckAccessControls(compiler0);
      Node node0 = new Node(30);
      checkAccessControls0.hotSwapScript(node0);
      assertEquals(11, Node.USES_PROP);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      CheckAccessControls checkAccessControls0 = new CheckAccessControls(compiler0);
      Node node0 = new Node(30);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      JSTypeNative jSTypeNative0 = JSTypeNative.STRING_TYPE;
      JSType jSType0 = jSTypeRegistry0.getNativeType(jSTypeNative0);
      node0.setJSType(jSType0);
      checkAccessControls0.hotSwapScript(node0);
      assertFalse(node0.isLocalResultCall());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      CheckAccessControls checkAccessControls0 = new CheckAccessControls(compiler0);
      Node node0 = new Node(30, 30, 30);
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      JSTypeRegistry jSTypeRegistry0 = tightenTypes0.getTypeRegistry();
      JSTypeNative jSTypeNative0 = JSTypeNative.STRING_OBJECT_FUNCTION_TYPE;
      JSType jSType0 = jSTypeRegistry0.getNativeType(jSTypeNative0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType(jSType0, node0);
      node0.setJSType(functionType0);
      checkAccessControls0.hotSwapScript(node0);
      assertFalse(node0.isQualifiedName());
  }
}
