/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 07 05:35:34 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.VarCheck;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.ArrayList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VarCheck_ESTest extends VarCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      VarCheck varCheck0 = null;
      try {
        varCheck0 = new VarCheck(compiler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("");
      VarCheck varCheck0 = new VarCheck(compiler0, false);
      Node node1 = new Node(20, node0, 2, 1);
      varCheck0.process(node0, node0);
      assertEquals(15, Node.CASEARRAY_PROP);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("s");
      VarCheck varCheck0 = new VarCheck(compiler0, false);
      Node node1 = new Node(20, node0, 1, 1);
      // Undeclared exception!
      try { 
        varCheck0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("P");
      Node node1 = new Node(20, node0, 167, 1);
      VarCheck varCheck0 = new VarCheck(compiler0, true);
      // Undeclared exception!
      try { 
        varCheck0.process(node0, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // Unexpected variable P
         //   Node(NAME P):  [testcode] :1:0
         // [source unknown]
         //   Parent(EXPR_RESULT):  [testcode] :1:0
         // [source unknown]
         //
         verifyException("com.google.javascript.jscomp.VarCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.VarCheck$NameRefInExternsCheck");
      VarCheck varCheck0 = new VarCheck(compiler0, false);
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

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("");
      VarCheck varCheck0 = new VarCheck(compiler0, false);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      JSType[] jSTypeArray0 = new JSType[3];
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) objectType0, (List<JSType>) arrayList0);
      jSTypeArray0[0] = (JSType) functionType0;
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(jSTypeArray0[0]);
      jSTypeArray0[1] = jSType0;
      jSTypeArray0[2] = (JSType) functionType0;
      Node node1 = jSTypeRegistry0.createOptionalParameters(jSTypeArray0);
      // Undeclared exception!
      try { 
        varCheck0.process(node1, node0);
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
