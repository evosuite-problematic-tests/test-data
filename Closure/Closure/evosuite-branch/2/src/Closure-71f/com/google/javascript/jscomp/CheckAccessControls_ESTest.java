/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 14:20:21 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CheckAccessControls;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CheckAccessControls_ESTest extends CheckAccessControls_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("+Im.Fo,gA.javscriptv=comp.Normalize$DuplmateDelaraonHanOler", "+Im.Fo,gA.javscriptv=comp.Normalize$DuplmateDelaraonHanOler");
      CheckAccessControls checkAccessControls0 = new CheckAccessControls(compiler0);
      checkAccessControls0.hotSwapScript(node0);
      assertFalse(node0.isQuotedString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("com.google.javacript.jsc.mp.Normalize$tuplIcaweDQl=r;tionHandlIr");
      CheckAccessControls checkAccessControls0 = new CheckAccessControls(compiler0);
      Node node1 = new Node(30, node0);
      checkAccessControls0.process(node1, node1);
      assertEquals(9, Node.FIXUPS_PROP);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("Statement fusion missing.");
      CheckAccessControls checkAccessControls0 = new CheckAccessControls(compiler0);
      Node node1 = new Node(30, node0);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) objectType0, node1);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jSDocInfo0.setDeprecated(true);
      functionType0.setJSDocInfo(jSDocInfo0);
      node1.setJSType(functionType0);
      // Undeclared exception!
      try { 
        checkAccessControls0.process(node1, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("com.google.javacript.jsc.mp.Normalize$tuplIcaweDQl=r;tionHandlIr");
      CheckAccessControls checkAccessControls0 = new CheckAccessControls(compiler0);
      Node node1 = new Node(30, node0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) objectType0, node1);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      functionType0.setJSDocInfo(jSDocInfo0);
      node1.setJSType(functionType0);
      checkAccessControls0.process(node1, node1);
      assertEquals(1, Node.FLAG_GLOBAL_STATE_UNMODIFIED);
  }
}