/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 09:31:25 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CheckAccessControls;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CheckAccessControls_ESTest extends CheckAccessControls_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode("JSCIDEPrECATED_CLASS_REASON", "Overriding {0} property of {1} with {2} property.");
      JSSourceFile[] jSSourceFileArray0 = new JSSourceFile[5];
      jSSourceFileArray0[0] = jSSourceFile0;
      jSSourceFileArray0[1] = jSSourceFile0;
      jSSourceFileArray0[2] = jSSourceFile0;
      jSSourceFileArray0[3] = jSSourceFile0;
      jSSourceFileArray0[4] = jSSourceFile0;
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.compile(jSSourceFile0, jSSourceFileArray0, compilerOptions0);
      CheckAccessControls checkAccessControls0 = new CheckAccessControls(compiler0);
      // Undeclared exception!
      try { 
        checkAccessControls0.process((Node) null, (Node) null);
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
      compiler0.getErrorManager();
      CheckAccessControls checkAccessControls0 = new CheckAccessControls(compiler0);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      JSType[] jSTypeArray0 = new JSType[1];
      FunctionType functionType0 = jSTypeRegistry0.createConstructorType((JSType) null, false, jSTypeArray0);
      jSTypeArray0[0] = (JSType) functionType0;
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs(jSTypeArray0);
      checkAccessControls0.hotSwapScript(node0);
      assertEquals(0, node0.getSideEffectFlags());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile("iaS69QP{* .]zOIQ1x@o");
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.compile(jSSourceFile0, jSSourceFile0, compilerOptions0);
      CheckAccessControls checkAccessControls0 = new CheckAccessControls(compiler0);
      Node node0 = new Node(30);
      checkAccessControls0.hotSwapScript(node0);
      assertEquals(0, Node.LABEL_ID_PROP);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile("iaS6QP{* .]zOIQ1x@o");
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.compile(jSSourceFile0, jSSourceFile0, compilerOptions0);
      CheckAccessControls checkAccessControls0 = new CheckAccessControls(compiler0);
      Node node0 = new Node(33);
      // Undeclared exception!
      try { 
        checkAccessControls0.hotSwapScript(node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode("c/Tf|4-*rK/2-AC$z", "c/Tf|4-*rK/2-AC$z");
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.compile(jSSourceFile0, jSSourceFile0, compilerOptions0);
      CheckAccessControls checkAccessControls0 = new CheckAccessControls(compiler0);
      Node node0 = Node.newString(33, "");
      node0.addChildToBack(node0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkAccessControls0);
      checkAccessControls0.visit(nodeTraversal0, node0, node0);
      assertEquals(31, Node.SKIP_INDEXES_PROP);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode("c/Tf|4-*rK/2-AC$z", "c/Tf|4-*rK/2-AC$z");
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.compile(jSSourceFile0, jSSourceFile0, compilerOptions0);
      CheckAccessControls checkAccessControls0 = new CheckAccessControls(compiler0);
      Node node0 = new Node(33);
      node0.addChildToBack(node0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkAccessControls0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionType functionType0 = jSTypeRegistry0.createInterfaceType("'P,8Y%J", (Node) null);
      node0.setJSType(functionType0);
      // Undeclared exception!
      try { 
        checkAccessControls0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // GETPROP : com.google.javascript.rhino.jstype.FunctionType@0000000757 is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }
}