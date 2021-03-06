/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 06:26:55 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.FunctionTypeBuilder;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FunctionTypeBuilder_ESTest extends FunctionTypeBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "&MOB", "com.google.common.collect.MapConstraints$ConstrainedMultimap");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("", compiler0, node0, "JSC_GOOG_SCOPE_USES_THROW", (Scope) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      Vector<JSType> vector0 = new Vector<JSType>();
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) null, (List<JSType>) vector0);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferFromOverriddenFunction(functionType0, (Node) null);
      assertSame(functionTypeBuilder0, functionTypeBuilder1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FunctionTypeBuilder.UnknownFunctionContents functionTypeBuilder_UnknownFunctionContents0 = new FunctionTypeBuilder.UnknownFunctionContents();
      Iterable<String> iterable0 = functionTypeBuilder_UnknownFunctionContents0.getEscapedVarNames();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FunctionTypeBuilder.UnknownFunctionContents functionTypeBuilder_UnknownFunctionContents0 = new FunctionTypeBuilder.UnknownFunctionContents();
      boolean boolean0 = functionTypeBuilder_UnknownFunctionContents0.mayBeFromExterns();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FunctionTypeBuilder.UnknownFunctionContents functionTypeBuilder_UnknownFunctionContents0 = new FunctionTypeBuilder.UnknownFunctionContents();
      Node node0 = functionTypeBuilder_UnknownFunctionContents0.getSourceNode();
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager((Logger) null);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "&MOB", "com.google.common.collect.MapConstraints$ConstrainedMultimap");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("com.google.common.collect.MapConstraints$ConstrainedMultimap", compiler0, node0, "&MOB", (Scope) null);
      // Undeclared exception!
      try { 
        functionTypeBuilder0.buildAndRegister();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // All Function types must have params and a return type
         //
         verifyException("com.google.javascript.jscomp.FunctionTypeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager((Logger) null);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "&MOB", "com.google.common.collect.MapConstraints$ConstrainedMultimap");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("com.google.common.collect.MapConstraints$ConstrainedMultimap", compiler0, node0, "&MOB", (Scope) null);
      FunctionTypeBuilder.AstFunctionContents functionTypeBuilder_AstFunctionContents0 = new FunctionTypeBuilder.AstFunctionContents(node0);
      functionTypeBuilder0.setContents(functionTypeBuilder_AstFunctionContents0);
      functionTypeBuilder0.inferParameterTypes(node0, (JSDocInfo) null);
      // Undeclared exception!
      try { 
        functionTypeBuilder0.buildAndRegister();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FunctionTypeBuilder.AstFunctionContents functionTypeBuilder_AstFunctionContents0 = new FunctionTypeBuilder.AstFunctionContents((Node) null);
      assertFalse(functionTypeBuilder_AstFunctionContents0.mayHaveNonEmptyReturns());
      
      functionTypeBuilder_AstFunctionContents0.recordNonEmptyReturn();
      assertTrue(functionTypeBuilder_AstFunctionContents0.mayHaveNonEmptyReturns());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(1487, nodeArray0);
      FunctionTypeBuilder functionTypeBuilder0 = null;
      try {
        functionTypeBuilder0 = new FunctionTypeBuilder((String) null, compiler0, node0, (String) null, (Scope) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager((Logger) null);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "&MOB", "com.google.common.collect.MapConstraints$ConstrainedMultimap");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("com.google.common.collect.MapConstraints$ConstrainedMultimap", compiler0, node0, "&MOB", (Scope) null);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.setContents((FunctionTypeBuilder.FunctionContents) null);
      assertSame(functionTypeBuilder0, functionTypeBuilder1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.common.collect.MapConstaints$eonstrainedMultimap", "com.google.common.collect.MapConstaints$eonstrainedMultimap");
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      Stack<JSType> stack0 = new Stack<JSType>();
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("com.google.common.collect.MapConstaints$eonstrainedMultimap", compiler0, node0, (String) null, (Scope) null);
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) null, (List<JSType>) stack0);
      functionTypeBuilder0.inferFromOverriddenFunction(functionType0, node0);
      assertEquals(0, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "&MOB", "com.google.common.collect.MapConstraints$ConstrainedMultimap");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("&MOB", compiler0, node0, "", (Scope) null);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferFromOverriddenFunction((FunctionType) null, node0);
      assertSame(functionTypeBuilder1, functionTypeBuilder0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.common.collect.MapConstaints$eonstrainedMultimap", "com.google.common.collect.MapConstaints$eonstrainedMultimap");
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("com.google.common.collect.MapConstaints$eonstrainedMultimap", compiler0, node0, (String) null, (Scope) null);
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.RANGE_ERROR_FUNCTION_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferFromOverriddenFunction(functionType0, node0);
      assertSame(functionTypeBuilder0, functionTypeBuilder1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.common.collect.MapConstraints$ConstrainedMultimap", "com.google.common.collect.MapConstraints$ConstrainedMultimap");
      node0.setVarArgs(true);
      node0.addChildrenToFront(node0);
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("com.google.common.collect.MapConstraints$ConstrainedMultimap", compiler0, node0, "com.google.common.collect.MapConstraints$ConstrainedMultimap", (Scope) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) null, node0);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferFromOverriddenFunction(functionType0, node0);
      assertSame(functionTypeBuilder1, functionTypeBuilder0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "W9zrjJ/On;b", "W9zrjJ/On;b");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("W9zrjJ/On;b", compiler0, node0, "W9zrjJ/On;b", (Scope) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) null, node0);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferFromOverriddenFunction(functionType0, node0);
      FunctionType functionType1 = functionTypeBuilder1.buildAndRegister();
      assertEquals(0, JSType.NOT_ENUMDECL);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager((Logger) null);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "&MOB", "com.google.common.collect.MapConstraints$ConstrainedMultimap");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("com.google.common.collect.MapConstraints$ConstrainedMultimap", compiler0, node0, "&MOB", (Scope) null);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferReturnType((JSDocInfo) null);
      assertSame(functionTypeBuilder0, functionTypeBuilder1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "W9zrjJ/On;b", "W9zrjJ/On;b");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("W9zrjJ/On;b", compiler0, node0, "W9zrjJ/On;b", (Scope) null);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferReturnType(jSDocInfo0);
      assertSame(functionTypeBuilder0, functionTypeBuilder1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "&MOB", "com.google.common.collect.MapConstraints$ConstrainedMultimap");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("", compiler0, node0, "JSC_GOOG_SCOPE_USES_THROW", (Scope) null);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferInheritance((JSDocInfo) null);
      assertSame(functionTypeBuilder0, functionTypeBuilder1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "W9zrjJ/On;b", "W9zrjJ/On;b");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("W9zrjJ/On;b", compiler0, node0, "W9zrjJ/On;b", (Scope) null);
      functionTypeBuilder0.inferInheritance(jSDocInfo0);
      assertEquals(0, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.common.collect.MapConstraints$ConstrainedMultimap", "com.google.common.collect.MapConstraints$ConstrainedMultimap");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("com.google.common.collect.MapConstraints$ConstrainedMultimap", compiler0, node0, "com.google.common.collect.MapConstraints$ConstrainedMultimap", (Scope) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) null, node0);
      functionTypeBuilder0.inferThisType(jSDocInfo0, functionType0);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferThisType(jSDocInfo0, functionType0);
      assertSame(functionTypeBuilder0, functionTypeBuilder1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager((Logger) null);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "&MOB", "com.google.common.collect.MapConstraints$ConstrainedMultimap");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("com.google.common.collect.MapConstraints$ConstrainedMultimap", compiler0, node0, "&MOB", (Scope) null);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferThisType(jSDocInfo0, (JSType) null);
      assertSame(functionTypeBuilder0, functionTypeBuilder1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager((Logger) null);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "&MOB", "com.google.common.collect.MapConstraints$ConstrainedMultimap");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("com.google.common.collect.MapConstraints$ConstrainedMultimap", compiler0, node0, "&MOB", (Scope) null);
      functionTypeBuilder0.inferParameterTypes(node0, (JSDocInfo) null);
      FunctionType functionType0 = functionTypeBuilder0.buildAndRegister();
      functionTypeBuilder0.inferThisType((JSDocInfo) null, functionType0);
      assertFalse(functionType0.isReturnTypeInferred());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager((Logger) null);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "&MOB", "com.google.common.collect.MapConstraints$ConstrainedMultimap");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("com.google.common.collect.MapConstraints$ConstrainedMultimap", compiler0, node0, "&MOB", (Scope) null);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferParameterTypes((Node) null, jSDocInfo0);
      assertSame(functionTypeBuilder1, functionTypeBuilder0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "&MOB", "com.google.common.collect.MapConstraints$ConstrainedMultimap");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("com.google.common.collect.MapConstraints$ConstrainedMultimap", compiler0, node0, "&MOB", (Scope) null);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferParameterTypes((Node) null, (JSDocInfo) null);
      assertSame(functionTypeBuilder1, functionTypeBuilder0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager((Logger) null);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.common.collect.MapConstraints$ConstrainedMultimap", "com.google.common.collect.MapConstraints$ConstrainedMultimap");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("com.google.common.collect.MapConstraints$ConstrainedMultimap", compiler0, node0, "com.google.common.collect.MapConstraints$ConstrainedMultimap", (Scope) null);
      // Undeclared exception!
      try { 
        functionTypeBuilder0.inferParameterTypes(node0, (JSDocInfo) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // EXPR_RESULT 1 [source_file: com.google.javascript.rhino.Node$ObjectPropListItem@0000000499] is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "&MOB", "com.google.common.collect.MapConstraints$ConstrainedMultimap");
      Node node1 = new Node((-2042), node0, node0, 44, 46);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("&MOB", compiler0, node1, "com.google.common.collect.MapConstraints$ConstrainedMultimap", (Scope) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) null, node1);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferFromOverriddenFunction(functionType0, node1);
      FunctionTypeBuilder functionTypeBuilder2 = functionTypeBuilder1.inferParameterTypes(jSDocInfo0);
      assertSame(functionTypeBuilder2, functionTypeBuilder0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager((Logger) null);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "&MOB", "com.google.common.collect.MapConstraints$ConstrainedMultimap");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("com.google.common.collect.MapConstraints$ConstrainedMultimap", compiler0, node0, "&MOB", (Scope) null);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferTemplateTypeName((JSDocInfo) null);
      assertSame(functionTypeBuilder1, functionTypeBuilder0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "&MOB", "com.google.common.collect.MapConstraints$ConstrainedMultimap");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("&MOB", compiler0, node0, "com.google.common.collect.MapConstraints$ConstrainedMultimap", (Scope) null);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferTemplateTypeName(jSDocInfo0);
      assertSame(functionTypeBuilder1, functionTypeBuilder0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      boolean boolean0 = FunctionTypeBuilder.isFunctionTypeDeclaration(jSDocInfo0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Node node0 = Node.newString("@extends", 3, 3);
      FunctionTypeBuilder.AstFunctionContents functionTypeBuilder_AstFunctionContents0 = new FunctionTypeBuilder.AstFunctionContents(node0);
      functionTypeBuilder_AstFunctionContents0.recordEscapedVarName("@extends");
      Iterable<String> iterable0 = functionTypeBuilder_AstFunctionContents0.getEscapedVarNames();
      assertFalse(functionTypeBuilder_AstFunctionContents0.mayHaveNonEmptyReturns());
      assertTrue(iterable0.contains("@extends"));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FunctionTypeBuilder.AstFunctionContents functionTypeBuilder_AstFunctionContents0 = new FunctionTypeBuilder.AstFunctionContents((Node) null);
      Iterable<String> iterable0 = functionTypeBuilder_AstFunctionContents0.getEscapedVarNames();
      assertNotNull(iterable0);
      assertFalse(functionTypeBuilder_AstFunctionContents0.mayHaveNonEmptyReturns());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FunctionTypeBuilder.AstFunctionContents functionTypeBuilder_AstFunctionContents0 = new FunctionTypeBuilder.AstFunctionContents((Node) null);
      functionTypeBuilder_AstFunctionContents0.recordEscapedVarName("JSC_INEXISTANT_PARAM");
      functionTypeBuilder_AstFunctionContents0.recordEscapedVarName("");
      assertFalse(functionTypeBuilder_AstFunctionContents0.mayHaveNonEmptyReturns());
  }
}
