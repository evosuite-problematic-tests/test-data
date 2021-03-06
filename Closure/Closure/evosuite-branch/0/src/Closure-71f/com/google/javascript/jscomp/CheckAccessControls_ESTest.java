/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 07 05:16:41 GMT 2019
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
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CheckAccessControls_ESTest extends CheckAccessControls_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Stack<JSSourceFile> stack0 = new Stack<JSSourceFile>();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.compile((List<JSSourceFile>) stack0, (List<JSSourceFile>) stack0, compilerOptions0);
      CheckAccessControls checkAccessControls0 = new CheckAccessControls(compiler0);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "co.google.javascript.jscomp.SimpleDefinitionFinder$DefinitionG;theringCallback", (String) null);
      Node node1 = new Node(30, 31, 4095);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      Stack<JSType> stack1 = new Stack<JSType>();
      JSType jSType0 = jSTypeRegistry0.createFunctionType((ObjectType) null, (JSType) null, (List<JSType>) stack1);
      node1.setJSType(jSType0);
      checkAccessControls0.process(node0, node1);
      assertEquals(2, Node.POST_FLAG);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Stack<JSSourceFile> stack0 = new Stack<JSSourceFile>();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.compile((List<JSSourceFile>) stack0, (List<JSSourceFile>) stack0, compilerOptions0);
      CheckAccessControls checkAccessControls0 = new CheckAccessControls(compiler0);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      JSType[] jSTypeArray0 = new JSType[13];
      Node node0 = jSTypeRegistry0.createParameters(jSTypeArray0);
      node0.setType(30);
      checkAccessControls0.process((Node) null, node0);
      assertEquals(4, Node.DESCENDANTS_FLAG);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Stack<JSSourceFile> stack0 = new Stack<JSSourceFile>();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.compile((List<JSSourceFile>) stack0, (List<JSSourceFile>) stack0, compilerOptions0);
      CheckAccessControls checkAccessControls0 = new CheckAccessControls(compiler0);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascrdpt.jscomp.Simple=efinitionFinder$DefinitionGatheringCallback", (String) null);
      checkAccessControls0.hotSwapScript(node0);
      assertEquals(1, Node.DECR_FLAG);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Stack<JSSourceFile> stack0 = new Stack<JSSourceFile>();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      compiler0.compile((List<JSSourceFile>) stack0, (List<JSSourceFile>) stack0, compilerOptions0);
      CheckAccessControls checkAccessControls0 = new CheckAccessControls(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkAccessControls0);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) linkedList0);
      JSTypeNative[] jSTypeNativeArray0 = new JSTypeNative[0];
      JSType jSType0 = jSTypeRegistry0.createUnionType(jSTypeNativeArray0);
      node0.setJSType(jSType0);
      Node node1 = new Node(33, node0, node0, node0);
      // Undeclared exception!
      try { 
        checkAccessControls0.visit(nodeTraversal0, node1, node1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // LP : com.google.javascript.rhino.jstype.NoType@0000000191 is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }
}
