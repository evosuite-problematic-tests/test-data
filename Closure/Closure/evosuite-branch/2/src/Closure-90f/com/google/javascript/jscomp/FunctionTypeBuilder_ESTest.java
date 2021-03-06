/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 15:06:26 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.FunctionTypeBuilder;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.TightenTypes;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticScope;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FunctionTypeBuilder_ESTest extends FunctionTypeBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("p)Q6U*mMx", "p)Q6U*mMx");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("rY;Ac", compiler0, node0, "(+d? ht*q?n6zf8aK", (Scope) null);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.setSourceNode(node0);
      assertSame(functionTypeBuilder1, functionTypeBuilder0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("", "");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("", compiler0, node0, "", (Scope) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      JSType jSType0 = jSTypeRegistry0.createNamedType("", "", 26, 0);
      ObjectType objectType0 = ObjectType.cast(jSType0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) objectType0, (Node) null);
      functionTypeBuilder0.inferFromOverriddenFunction(functionType0, (Node) null);
      JSType[] jSTypeArray0 = new JSType[3];
      jSTypeArray0[0] = jSType0;
      jSTypeArray0[1] = (JSType) objectType0;
      jSTypeArray0[2] = jSType0;
      Node node1 = jSTypeRegistry0.createOptionalParameters(jSTypeArray0);
      functionTypeBuilder0.inferParameterTypes(node1, (JSDocInfo) null);
      assertEquals(1, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newNumber(0.0);
      FunctionTypeBuilder functionTypeBuilder0 = null;
      try {
        functionTypeBuilder0 = new FunctionTypeBuilder((String) null, compiler0, node0, "%Ax$>", (Scope) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("/+G8pR2P`S]a&H*");
      Scope scope0 = new Scope(node0, compiler0);
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("/+G8pR2P`S]a&H*", compiler0, node0, "/+G8pR2P`S]a&H*", scope0);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferFromOverriddenFunction((FunctionType) null, node0);
      assertSame(functionTypeBuilder0, functionTypeBuilder1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("rY;Ac", "rY;Ac");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("rY;Ac", compiler0, node0, "rY;Ac", (Scope) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      JSType jSType0 = jSTypeRegistry0.getType((StaticScope<JSType>) null, "rY;Ac", "rY;Ac", (-3572), 16);
      ObjectType objectType0 = ObjectType.cast(jSType0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) objectType0, (Node) null);
      // Undeclared exception!
      try { 
        functionTypeBuilder0.inferFromOverriddenFunction(functionType0, node0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // EXPR_RESULT 1 [sourcename: java.lang.String@0000000805] is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("com.google.javascript.rhino.jstype.EnumElementType", "com.google.javascript.rhino.jstype.EnumElementType");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("com.google.javascript.rhino.jstype.EnumElementType", compiler0, node0, "com.google.javascript.rhino.jstype.EnumElementType", (Scope) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.DATE_FUNCTION_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferFromOverriddenFunction(functionType0, node0);
      assertSame(functionTypeBuilder0, functionTypeBuilder1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("p)Q6U*mMx", "p)Q6U*mMx");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("rY;Ac", compiler0, node0, "(+d? ht*q?n6zf8aK", (Scope) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSType jSType0 = jSTypeRegistry0.getType((StaticScope<JSType>) null, "", "rY;Ac", 12, 46);
      ObjectType objectType0 = ObjectType.cast(jSType0);
      EnumType enumType0 = jSTypeRegistry0.createEnumType("", objectType0);
      EnumElementType enumElementType0 = enumType0.getElementsType();
      JSType[] jSTypeArray0 = new JSType[3];
      jSTypeArray0[2] = (JSType) enumType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) enumElementType0, true, jSTypeArray0);
      Node node1 = jSTypeRegistry0.createParametersWithVarArgs(jSTypeArray0);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferFromOverriddenFunction(functionType0, node1);
      assertSame(functionTypeBuilder1, functionTypeBuilder0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("05[}?}7ALm#Q", "05[}?}7ALm#Q");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("05[}?}7ALm#Q", compiler0, node0, "05[}?}7ALm#Q", (Scope) null);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferParameterTypes(node0, jSDocInfo0);
      FunctionType functionType0 = functionTypeBuilder1.buildAndRegister();
      JSType[] jSTypeArray0 = new JSType[4];
      jSTypeArray0[3] = (JSType) objectType0;
      Node node1 = jSTypeRegistry0.createParametersWithVarArgs(jSTypeArray0);
      functionTypeBuilder1.inferFromOverriddenFunction(functionType0, node1);
      assertFalse(functionType0.hasCachedValues());
      assertFalse(functionType0.isReturnTypeInferred());
      assertEquals(0, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("p)Q6U*mMx", "p)Q6U*mMx");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("rY;Ac", compiler0, node0, "(+d? ht*q?n6zf8aK", (Scope) null);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferReturnType((JSDocInfo) null);
      assertSame(functionTypeBuilder1, functionTypeBuilder0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("05[}?}7ALm#Q", "05[}?}7ALm#Q");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("05[}?}7ALm#Q", compiler0, node0, "05[}?}7ALm#Q", (Scope) null);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferReturnType(jSDocInfo0);
      assertSame(functionTypeBuilder1, functionTypeBuilder0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("Function");
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      JSTypeRegistry jSTypeRegistry0 = tightenTypes0.getTypeRegistry();
      JSTypeNative jSTypeNative0 = JSTypeNative.OBJECT_FUNCTION_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      Scope scope0 = new Scope(node0, objectType0);
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("s]|.9V1s90+R1,<rc", compiler0, node0, "JSC_OPTIONAL_ARG_AT_END", scope0);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferReturnStatementsAsLastResort((Node) null);
      assertSame(functionTypeBuilder0, functionTypeBuilder1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("rY;Ac", "rY;Ac");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("rY;Ac", compiler0, node0, "rY;Ac", (Scope) null);
      // Undeclared exception!
      try { 
        functionTypeBuilder0.inferReturnStatementsAsLastResort(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("p)Q6U*mMx", "p)Q6U*mMx");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("rY;Ac", compiler0, node0, "(+d? ht*q?n6zf8aK", (Scope) null);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferInheritance((JSDocInfo) null);
      assertSame(functionTypeBuilder1, functionTypeBuilder0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("p)Q6U*mMx", "p)Q6U*mMx");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("rY;Ac", compiler0, node0, "(+d? ht*q?n6zf8aK", (Scope) null);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      functionTypeBuilder0.inferInheritance(jSDocInfo0);
      assertEquals(0, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("p)Q6U*mMx", "p)Q6U*mMx");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("rY;Ac", compiler0, node0, "(+d? ht*q?n6zf8aK", (Scope) null);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferThisType((JSDocInfo) null, (JSType) null);
      assertSame(functionTypeBuilder0, functionTypeBuilder1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Node node0 = compiler0.parseTestCode("/+G8pR2P`S]a&H*");
      Scope scope0 = new Scope(node0, compiler0);
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("/+G8pR2P`S]a&H*", compiler0, node0, "/+G8pR2P`S]a&H*", scope0);
      ObjectType objectType0 = jSTypeRegistry0.createObjectType((ObjectType) null);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferThisType((JSDocInfo) null, objectType0);
      assertSame(functionTypeBuilder1, functionTypeBuilder0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("p)Q6U*mMx", "p)Q6U*mMx");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("rY;Ac", compiler0, node0, "(+d? ht*q?n6zf8aK", (Scope) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSType jSType0 = jSTypeRegistry0.getType((StaticScope<JSType>) null, "", "rY;Ac", 12, 46);
      ObjectType objectType0 = ObjectType.cast(jSType0);
      EnumType enumType0 = jSTypeRegistry0.createEnumType("", objectType0);
      EnumElementType enumElementType0 = enumType0.getElementsType();
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferThisType(jSDocInfo0, enumElementType0);
      assertSame(functionTypeBuilder1, functionTypeBuilder0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("p)Q6U*mMx", "p)Q6U*mMx");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("rY;Ac", compiler0, node0, "(+d? ht*q?n6zf8aK", (Scope) null);
      // Undeclared exception!
      try { 
        functionTypeBuilder0.inferThisType((JSDocInfo) null, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.JSTypeRegistry", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("p)Q6U*mMx", "p)Q6U*mMx");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("rY;Ac", compiler0, node0, "(+d? ht*q?n6zf8aK", (Scope) null);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      // Undeclared exception!
      try { 
        functionTypeBuilder0.inferThisType(jSDocInfo0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.JSTypeRegistry", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("p)QUmMx", "p)QUmMx");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("rY;Ac", compiler0, node0, "p)QUmMx", (Scope) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      EnumType enumType0 = jSTypeRegistry0.createEnumType("", objectType0);
      EnumElementType enumElementType0 = enumType0.getElementsType();
      JSDocInfo jSDocInfo0 = enumElementType0.getJSDocInfo();
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferThisType(jSDocInfo0, (Node) null);
      assertSame(functionTypeBuilder0, functionTypeBuilder1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("p)QUmMx", "p)QUmMx");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("rY;Ac", compiler0, node0, "p)QUmMx", (Scope) null);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferParameterTypes((Node) null, (JSDocInfo) null);
      assertSame(functionTypeBuilder0, functionTypeBuilder1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("p)QUmMx", "p)QUmMx");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("rY;Ac", compiler0, node0, "p)QUmMx", (Scope) null);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferParameterTypes((Node) null, jSDocInfo0);
      assertSame(functionTypeBuilder0, functionTypeBuilder1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("05[}?}7ALm#Q", "05[}?}7ALm#Q");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("05[}?}7ALm#Q", compiler0, node0, "05[}?}7ALm#Q", (Scope) null);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      JSType[] jSTypeArray0 = new JSType[4];
      jSTypeArray0[3] = (JSType) objectType0;
      Node node1 = jSTypeRegistry0.createParametersWithVarArgs(jSTypeArray0);
      functionTypeBuilder0.inferParameterTypes(node1, jSDocInfo0);
      assertEquals(0, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("p)Q6U*mMx", "p)Q6U*mMx");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("rY;Ac", compiler0, node0, "(+d? ht*q?n6zf8aK", (Scope) null);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferTemplateTypeName((JSDocInfo) null);
      assertSame(functionTypeBuilder1, functionTypeBuilder0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("05[}?}7ALm#Q", "05[}?}7ALm#Q");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("05[}?}7ALm#Q", compiler0, node0, "05[}?}7ALm#Q", (Scope) null);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferTemplateTypeName(jSDocInfo0);
      assertSame(functionTypeBuilder0, functionTypeBuilder1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("p)Q6U*mMx", "p)Q6U*mMx");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("rY;Ac", compiler0, node0, "(+d? ht*q?n6zf8aK", (Scope) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSType jSType0 = jSTypeRegistry0.getType((StaticScope<JSType>) null, "", "rY;Ac", 12, 46);
      ObjectType objectType0 = ObjectType.cast(jSType0);
      EnumType enumType0 = jSTypeRegistry0.createEnumType("", objectType0);
      EnumElementType enumElementType0 = enumType0.getElementsType();
      JSType[] jSTypeArray0 = new JSType[3];
      jSTypeArray0[2] = (JSType) enumType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) enumElementType0, true, jSTypeArray0);
      functionTypeBuilder0.inferFromOverriddenFunction(functionType0, node0);
      FunctionType functionType1 = functionTypeBuilder0.buildAndRegister();
      assertFalse(functionType1.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("p)Q6U*mMx", "p)Q6U*mMx");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("rY;Ac", compiler0, node0, "(+d? ht*q?n6zf8aK", (Scope) null);
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
  public void test27()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      boolean boolean0 = FunctionTypeBuilder.isFunctionTypeDeclaration(jSDocInfo0);
      assertFalse(boolean0);
  }
}
