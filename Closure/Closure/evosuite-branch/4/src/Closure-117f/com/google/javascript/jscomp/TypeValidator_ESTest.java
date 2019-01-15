/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 11:15:54 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.DiagnosticType;
import com.google.javascript.jscomp.FindExportableNodes;
import com.google.javascript.jscomp.GlobalNamespace;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.LineNumberCheck;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.TightenTypes;
import com.google.javascript.jscomp.TypeCheck;
import com.google.javascript.jscomp.TypeValidator;
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.ObjectType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypeValidator_ESTest extends TypeValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0);
      typeValidator0.expectValidTypeofName(nodeTraversal0, (Node) null, (String) null);
      assertEquals(1, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, (Node) null);
      JSType jSType0 = globalNamespace0.getTypeOfThis();
      typeValidator0.expectStringOrNumber(nodeTraversal0, (Node) null, jSType0, "Not declared as a type name");
      assertEquals(1, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      Iterable<TypeValidator.TypeMismatch> iterable0 = typeValidator0.getMismatches();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSTypeNative[] jSTypeNativeArray0 = new JSTypeNative[6];
      JSTypeNative jSTypeNative0 = JSTypeNative.GREATEST_FUNCTION_TYPE;
      jSTypeNativeArray0[0] = jSTypeNative0;
      jSTypeNativeArray0[1] = jSTypeNativeArray0[0];
      jSTypeNativeArray0[2] = jSTypeNative0;
      jSTypeNativeArray0[3] = jSTypeNativeArray0[2];
      jSTypeNativeArray0[4] = jSTypeNativeArray0[1];
      jSTypeNativeArray0[5] = jSTypeNativeArray0[3];
      JSType jSType0 = jSTypeRegistry0.createUnionType(jSTypeNativeArray0);
      JSType[] jSTypeArray0 = new JSType[0];
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs(jSTypeArray0);
      DiagnosticType diagnosticType0 = TypedScopeCreator.CONSTRUCTOR_EXPECTED;
      String[] stringArray0 = new String[5];
      JSError jSError0 = JSError.make("Named type with empty name component", node0, diagnosticType0, stringArray0);
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, jSError0);
      String string0 = typeValidator_TypeMismatch0.toString();
      assertEquals("(function (...[None]): *, function (...[None]): *)", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, (Node) null);
      JSType jSType0 = globalNamespace0.getTypeOfThis();
      boolean boolean0 = typeValidator0.expectObject(nodeTraversal0, (Node) null, jSType0, "Unknown class name");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      ReverseAbstractInterpreter reverseAbstractInterpreter0 = compiler0.getReverseAbstractInterpreter();
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      TypeCheck typeCheck0 = new TypeCheck(compiler0, reverseAbstractInterpreter0, jSTypeRegistry0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, typeCheck0, (ScopeCreator) null);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNullType();
      boolean boolean0 = typeValidator0.expectObject(nodeTraversal0, (Node) null, jSType0, "Not declared as a type name");
      assertEquals(1, compiler0.getWarningCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, (Node) null);
      JSType jSType0 = globalNamespace0.getTypeOfThis();
      typeValidator0.expectActualObject(nodeTraversal0, (Node) null, jSType0, "MA^??k-EDRu=Lo.,B*!");
      assertEquals(0, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, (Node) null);
      JSType jSType0 = globalNamespace0.getTypeOfThis();
      typeValidator0.expectAnyObject(nodeTraversal0, (Node) null, jSType0, "Not declared as a type name");
      assertEquals(0, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      LineNumberCheck lineNumberCheck0 = new LineNumberCheck(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, lineNumberCheck0);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseVoidType();
      typeValidator0.expectString(nodeTraversal0, (Node) null, jSType0, "Unknown class name");
      assertEquals(0, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, (Node) null);
      JSType jSType0 = globalNamespace0.getTypeOfThis();
      typeValidator0.expectNumber(nodeTraversal0, (Node) null, jSType0, "JSC_NOT_FUNCTION_TYPE");
      assertEquals(1, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0);
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNullType();
      typeValidator0.expectStringOrNumber(nodeTraversal0, (Node) null, jSType0, "");
      assertEquals(0, JSType.NOT_ENUMDECL);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, (Node) null);
      JSType jSType0 = globalNamespace0.getTypeOfThis();
      boolean boolean0 = typeValidator0.expectNotNullOrUndefined(nodeTraversal0, (Node) null, jSType0, "+`7B+MKVxI~t/)9f", jSType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, (Node) null);
      JSType jSType0 = globalNamespace0.getTypeOfThis();
      typeValidator0.expectSwitchMatchesCase(nodeTraversal0, (Node) null, jSType0, jSType0);
      assertFalse(jSType0.isStringValueType());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, (Node) null);
      JSType jSType0 = globalNamespace0.getTypeOfThis();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSType[] jSTypeArray0 = new JSType[2];
      FunctionType functionType0 = jSTypeRegistry0.createConstructorType(jSType0, jSTypeArray0);
      // Undeclared exception!
      try { 
        typeValidator0.expectSwitchMatchesCase(nodeTraversal0, (Node) null, jSType0, functionType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypeValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, (Node) null);
      JSType jSType0 = globalNamespace0.getTypeOfThis();
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      JSTypeRegistry jSTypeRegistry0 = tightenTypes0.getTypeRegistry();
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType((JSDocInfo) null);
      // Undeclared exception!
      try { 
        typeValidator0.expectCanAssignToPropertyOf(nodeTraversal0, (Node) null, jSType0, objectType0, (Node) null, "com.google.javascript.rhino.head.ast.StringLiteral");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypeValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, (Node) null);
      JSType jSType0 = globalNamespace0.getTypeOfThis();
      boolean boolean0 = typeValidator0.expectCanAssignToPropertyOf(nodeTraversal0, (Node) null, jSType0, jSType0, (Node) null, "Not declared as a type name");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, (Node) null);
      JSType jSType0 = globalNamespace0.getTypeOfThis();
      boolean boolean0 = typeValidator0.expectCanAssignTo(nodeTraversal0, (Node) null, jSType0, jSType0, "P^\"\"L1");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, (Node) null);
      JSType jSType0 = globalNamespace0.getTypeOfThis();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType1 = modificationVisitor0.caseBooleanType();
      boolean boolean0 = typeValidator0.expectCanAssignTo(nodeTraversal0, (Node) null, jSType0, jSType1, "{$");
      assertEquals(1, compiler0.getWarningCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      LineNumberCheck lineNumberCheck0 = new LineNumberCheck(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, lineNumberCheck0);
      JSTypeNative[] jSTypeNativeArray0 = new JSTypeNative[1];
      JSTypeNative jSTypeNative0 = JSTypeNative.VOID_TYPE;
      jSTypeNativeArray0[0] = jSTypeNative0;
      JSType jSType0 = jSTypeRegistry0.createUnionType(jSTypeNativeArray0);
      typeValidator0.expectArgumentMatchesParameter(nodeTraversal0, (Node) null, jSType0, jSType0, (Node) null, 0);
      assertFalse(jSType0.isNoType());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, (Node) null);
      JSType jSType0 = globalNamespace0.getTypeOfThis();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.REFERENCE_ERROR_FUNCTION_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      // Undeclared exception!
      try { 
        typeValidator0.expectArgumentMatchesParameter(nodeTraversal0, (Node) null, jSType0, functionType0, (Node) null, 461845907);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypeValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, (Node) null);
      JSType jSType0 = globalNamespace0.getTypeOfThis();
      typeValidator0.expectCanOverride(nodeTraversal0, (Node) null, jSType0, jSType0, "Named type with empty name component", jSType0);
      assertEquals(0, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, (Node) null);
      JSType jSType0 = globalNamespace0.getTypeOfThis();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSType[] jSTypeArray0 = new JSType[2];
      FunctionType functionType0 = jSTypeRegistry0.createConstructorType(jSType0, jSTypeArray0);
      // Undeclared exception!
      try { 
        typeValidator0.expectCanOverride(nodeTraversal0, (Node) null, functionType0, jSType0, "Mgzf", jSType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.FunctionType", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, (Node) null);
      JSType jSType0 = globalNamespace0.getTypeOfThis();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType(jSType0, (Node) null);
      EnumType enumType0 = jSTypeRegistry0.createEnumType((String) null, (Node) null, functionType0);
      // Undeclared exception!
      try { 
        typeValidator0.expectSuperType(nodeTraversal0, (Node) null, functionType0, enumType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypeValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, (Node) null);
      JSType jSType0 = globalNamespace0.getTypeOfThis();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      JSType[] jSTypeArray0 = new JSType[3];
      jSTypeArray0[2] = jSType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType(jSType0, true, jSTypeArray0);
      EnumType enumType0 = jSTypeRegistry0.createEnumType("", (Node) null, jSType0);
      EnumElementType enumElementType0 = enumType0.getElementsType();
      typeValidator0.expectSuperType(nodeTraversal0, (Node) null, functionType0, enumElementType0);
      assertEquals(0, JSType.NOT_ENUMDECL);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, (Node) null);
      JSType jSType0 = globalNamespace0.getTypeOfThis();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      EnumType enumType0 = jSTypeRegistry0.createEnumType("assignment to property ", (Node) null, jSType0);
      EnumElementType enumElementType0 = enumType0.getElementsType();
      JSType jSType1 = enumElementType0.getPropertyType("Not declared as a constructor");
      typeValidator0.expectCanCast(nodeTraversal0, (Node) null, jSType0, jSType1);
      assertEquals(0, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, (Node) null);
      JSType jSType0 = globalNamespace0.getTypeOfThis();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      JSType[] jSTypeArray0 = new JSType[3];
      jSTypeArray0[2] = jSType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType(jSType0, true, jSTypeArray0);
      // Undeclared exception!
      try { 
        typeValidator0.expectCanCast(nodeTraversal0, (Node) null, jSType0, functionType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.FunctionType", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, (Node) null);
      JSType jSType0 = globalNamespace0.getTypeOfThis();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSType[] jSTypeArray0 = new JSType[2];
      FunctionType functionType0 = jSTypeRegistry0.createConstructorType(jSType0, jSTypeArray0);
      typeValidator0.expectAllInterfaceProperties(nodeTraversal0, (Node) null, functionType0);
      assertTrue(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, (Node) null);
      JSType jSType0 = globalNamespace0.getTypeOfThis();
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      JSTypeRegistry jSTypeRegistry0 = tightenTypes0.getTypeRegistry();
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType(jSType0, (Node) null);
      typeValidator0.expectString(nodeTraversal0, (Node) null, functionType0, (String) null);
      assertTrue(functionType0.hasCachedValues());
      assertEquals(1, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      FindExportableNodes findExportableNodes0 = new FindExportableNodes(compiler0, true);
      typeValidator0.setShouldReport(false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, findExportableNodes0);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, (Node) null);
      JSType jSType0 = globalNamespace0.getTypeOfThis();
      typeValidator0.expectBitwiseable(nodeTraversal0, (Node) null, jSType0, "MA^??k-EDRu=Lo.,B*!");
      assertEquals(0, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNoObjectType();
      Node node0 = new Node(0, 2544, 7);
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      DiagnosticType diagnosticType0 = TypeValidator.TYPE_MISMATCH_WARNING;
      String[] stringArray0 = new String[7];
      JSError jSError0 = JSError.make((String) null, node0, checkLevel0, diagnosticType0, stringArray0);
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, jSError0);
      boolean boolean0 = typeValidator_TypeMismatch0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNoObjectType();
      Node node0 = new Node(0, 2544, 7);
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      DiagnosticType diagnosticType0 = TypeValidator.TYPE_MISMATCH_WARNING;
      String[] stringArray0 = new String[7];
      JSError jSError0 = JSError.make((String) null, node0, checkLevel0, diagnosticType0, stringArray0);
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, jSError0);
      boolean boolean0 = typeValidator_TypeMismatch0.equals(typeValidator_TypeMismatch0);
      assertTrue(boolean0);
  }
}
