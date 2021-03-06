/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 15:34:05 GMT 2019
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.AllType;
import com.google.javascript.rhino.jstype.ArrowType;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.BooleanType;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.NullType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.rhino.jstype.Visitor;
import com.google.javascript.rhino.jstype.VoidType;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnionType_ESTest extends UnionType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      Visitor<FunctionType> visitor0 = (Visitor<FunctionType>) mock(Visitor.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(visitor0).caseUnionType(any(com.google.javascript.rhino.jstype.UnionType.class));
      FunctionType functionType0 = unionType0.visit(visitor0);
      assertNull(functionType0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      unionType0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^l8$k?WzFA?wi");
      JSType jSType0 = errorFunctionType0.getReturnType();
      JSType jSType1 = jSTypeRegistry0.createOptionalNullableType(jSType0);
      jSType1.forgiveUnknownNames();
      assertFalse(jSType1.isNullType());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = unionType0.getRestrictedTypeGivenToBooleanOutcome(false);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderInequality(jSType0);
      linkedHashSet0.add(jSType_TypePair0.typeA);
      boolean boolean0 = unionType0.matchesNumberContext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      AllType allType0 = new AllType(jSTypeRegistry0);
      linkedHashSet0.add(allType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.matchesNumberContext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Unknown class name", "Not declared as a type name", 1, (-1));
      linkedHashSet0.add(namedType0);
      boolean boolean0 = unionType0.matchesStringContext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      JSType[] jSTypeArray0 = new JSType[3];
      FunctionType functionType0 = jSTypeRegistry0.createConstructorType((JSType) stringType0, jSTypeArray0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      linkedHashSet0.add(functionType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.matchesStringContext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.matchesObjectContext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^l8$k?WzFA?wi");
      JSType jSType0 = errorFunctionType0.getReturnType();
      JSType jSType1 = jSTypeRegistry0.createOptionalNullableType(jSType0);
      boolean boolean0 = jSType1.matchesObjectContext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^l8$k?WzFA?wi");
      JSType jSType0 = errorFunctionType0.getReturnType();
      JSType jSType1 = jSTypeRegistry0.createOptionalNullableType(jSType0);
      JSType jSType2 = jSType1.findPropertyType("rh08.cRZv#_Kp]<X");
      assertNull(jSType2);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "(", "Not declared as a constructor", 1, 1);
      JSType jSType0 = namedType0.getReferencedType();
      linkedHashSet0.add(jSType0);
      linkedHashSet0.add(namedType0);
      JSType jSType1 = unionType0.findPropertyType("A");
      assertEquals(1, JSType.ENUMDECL);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      linkedHashSet0.add(unknownType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.canAssignTo(unknownType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^l8$k?WzFA?wi");
      JSType jSType0 = errorFunctionType0.getReturnType();
      JSType jSType1 = jSTypeRegistry0.createOptionalNullableType(jSType0);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      boolean boolean0 = jSType1.canAssignTo(nullType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      AllType allType0 = new AllType(jSTypeRegistry0);
      linkedHashSet0.add(allType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.canBeCalled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      ObjectType objectType0 = unionType0.dereference();
      linkedHashSet0.add(objectType0);
      boolean boolean0 = unionType0.canBeCalled();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = unionType0.getRestrictedTypeGivenToBooleanOutcome(false);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderInequality(jSType0);
      linkedHashSet0.add(jSType_TypePair0.typeA);
      NoType noType0 = (NoType)unionType0.restrictByNotNullOrUndefined();
      assertTrue(noType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^l8$k?WzFA?wi");
      JSType jSType0 = errorFunctionType0.getReturnType();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      unionType0.testForEquality(jSType0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^l8$k?WzFA?wi");
      JSType jSType0 = errorFunctionType0.getReturnType();
      JSType jSType1 = jSTypeRegistry0.createOptionalNullableType(jSType0);
      jSType1.testForEquality(jSType0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^l8$k?WzFA?wi");
      JSType jSType0 = errorFunctionType0.getReturnType();
      JSType jSType1 = jSTypeRegistry0.createOptionalNullableType(jSType0);
      boolean boolean0 = jSType1.isNullable();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      AllType allType0 = new AllType(jSTypeRegistry0);
      linkedHashSet0.add(allType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.isNullable();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      linkedHashSet0.add(unknownType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.differsFrom(unknownType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = unionType0.getLeastSupertype(unknownType0);
      assertFalse(jSType0.isNamedType());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = unionType0.getRestrictedTypeGivenToBooleanOutcome(false);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderInequality(jSType0);
      linkedHashSet0.add(jSType_TypePair0.typeA);
      JSType jSType1 = unionType0.getLeastSupertype(unionType0);
      assertFalse(jSType1.isNoType());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      JSTypeNative jSTypeNative0 = JSTypeNative.SYNTAX_ERROR_FUNCTION_TYPE;
      JSType jSType0 = unknownType0.getNativeType(jSTypeNative0);
      linkedHashSet0.add(unknownType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType1 = unionType0.getLeastSupertype(jSType0);
      assertFalse(jSType1.isTemplateType());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = unionType0.getRestrictedTypeGivenToBooleanOutcome(false);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderInequality(jSType0);
      linkedHashSet0.add(jSType_TypePair0.typeA);
      JSTypeNative[] jSTypeNativeArray0 = new JSTypeNative[6];
      JSTypeNative jSTypeNative0 = JSTypeNative.NULL_TYPE;
      jSTypeNativeArray0[0] = jSTypeNative0;
      jSTypeNativeArray0[1] = jSTypeNativeArray0[0];
      jSTypeNativeArray0[2] = jSTypeNativeArray0[0];
      jSTypeNativeArray0[3] = jSTypeNativeArray0[1];
      jSTypeNativeArray0[4] = jSTypeNativeArray0[1];
      jSTypeNativeArray0[5] = jSTypeNativeArray0[0];
      JSType jSType1 = jSTypeRegistry0.createUnionType(jSTypeNativeArray0);
      JSType jSType2 = unionType0.getLeastSupertype(jSType1);
      assertFalse(jSType2.isObject());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = unionType0.getRestrictedTypeGivenToBooleanOutcome(false);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderInequality(jSType0);
      linkedHashSet0.add(jSType_TypePair0.typeA);
      JSType jSType1 = unionType0.meet(unionType0);
      assertTrue(jSType1.isObject());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSTypeNative[] jSTypeNativeArray0 = new JSTypeNative[6];
      JSTypeNative jSTypeNative0 = JSTypeNative.NULL_TYPE;
      jSTypeNativeArray0[0] = jSTypeNative0;
      JSTypeNative jSTypeNative1 = JSTypeNative.BOOLEAN_OBJECT_FUNCTION_TYPE;
      jSTypeNativeArray0[1] = jSTypeNative1;
      jSTypeNativeArray0[2] = jSTypeNativeArray0[0];
      jSTypeNativeArray0[3] = jSTypeNativeArray0[1];
      jSTypeNativeArray0[4] = jSTypeNativeArray0[2];
      jSTypeNativeArray0[5] = jSTypeNativeArray0[4];
      UnionType unionType1 = (UnionType)jSTypeRegistry0.createUnionType(jSTypeNativeArray0);
      NoType noType0 = (NoType)unionType1.meet(unionType0);
      assertTrue(noType0.isEmptyType());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^l8$k?WzFA?wi");
      JSType jSType0 = errorFunctionType0.getReturnType();
      UnionType unionType0 = (UnionType)jSTypeRegistry0.createOptionalNullableType(jSType0);
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)unionType0.meet(jSType0);
      assertFalse(instanceObjectType0.isNoObjectType());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      LinkedHashSet<ArrowType> linkedHashSet1 = new LinkedHashSet<ArrowType>();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      ArrowType arrowType0 = new ArrowType((JSTypeRegistry) null, node0, noObjectType0);
      linkedHashSet1.add(arrowType0);
      linkedHashSet0.addAll(linkedHashSet1);
      UnionType unionType0 = new UnionType((JSTypeRegistry) null, linkedHashSet0);
      // Undeclared exception!
      try { 
        JSType.getGreatestSubtype((JSType) unionType0, (JSType) unionType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.UnionTypeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSTypeNative jSTypeNative0 = JSTypeNative.NUMBER_OBJECT_FUNCTION_TYPE;
      JSType jSType0 = unionType0.getNativeType(jSTypeNative0);
      JSType jSType1 = unionType0.meet(jSType0);
      assertFalse(jSType1.isNumberValueType());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      JSType jSType0 = unionType0.meet(allType0);
      assertEquals(1, JSType.ENUMDECL);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSTypeNative jSTypeNative0 = JSTypeNative.NUMBER_OBJECT_FUNCTION_TYPE;
      JSType jSType0 = unionType0.getNativeType(jSTypeNative0);
      boolean boolean0 = unionType0.differsFrom(jSType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.equals(unionType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = unionType0.findPropertyType("Not declared as a constructor");
      boolean boolean0 = unionType0.contains(jSType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      linkedHashSet0.add(unknownType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.contains(unknownType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      linkedHashSet0.add(unknownType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = unionType0.getRestrictedUnion(unknownType0);
      assertFalse(jSType0.isStringValueType());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = jSTypeRegistry0.createNullableType(unionType0);
      linkedHashSet0.add(jSType0);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      NoType noType0 = (NoType)voidType0.restrictByNotNullOrUndefined();
      unionType0.getRestrictedUnion(noType0);
      assertTrue(noType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      ObjectType objectType0 = unionType0.dereference();
      linkedHashSet0.add(objectType0);
      unionType0.getRestrictedUnion(objectType0);
      assertTrue(objectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative[] jSTypeNativeArray0 = new JSTypeNative[6];
      JSTypeNative jSTypeNative0 = JSTypeNative.NULL_TYPE;
      jSTypeNativeArray0[0] = jSTypeNative0;
      JSTypeNative jSTypeNative1 = JSTypeNative.BOOLEAN_OBJECT_FUNCTION_TYPE;
      jSTypeNativeArray0[1] = jSTypeNative1;
      jSTypeNativeArray0[2] = jSTypeNative1;
      jSTypeNativeArray0[3] = jSTypeNativeArray0[1];
      jSTypeNativeArray0[4] = jSTypeNativeArray0[2];
      jSTypeNativeArray0[5] = jSTypeNativeArray0[1];
      JSType jSType0 = jSTypeRegistry0.createUnionType(jSTypeNativeArray0);
      String string0 = ((UnionType) jSType0).toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^l8$k?WzFA?wi");
      JSType jSType0 = errorFunctionType0.getReturnType();
      JSType jSType1 = jSTypeRegistry0.createOptionalNullableType(jSType0);
      JSType jSType2 = jSType1.getRestrictedTypeGivenToBooleanOutcome(true);
      assertFalse(jSType2.isFunctionType());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      BooleanLiteralSet booleanLiteralSet0 = unionType0.getPossibleToBooleanOutcomes();
      assertEquals(BooleanLiteralSet.EMPTY, booleanLiteralSet0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^l8$k?WzFA?wi");
      JSType jSType0 = errorFunctionType0.getReturnType();
      JSType jSType1 = jSTypeRegistry0.createOptionalNullableType(jSType0);
      BooleanLiteralSet booleanLiteralSet0 = jSType1.getPossibleToBooleanOutcomes();
      assertEquals(BooleanLiteralSet.BOTH, booleanLiteralSet0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^l8$k?WzFA?wi");
      JSType jSType0 = errorFunctionType0.getReturnType();
      JSType jSType1 = jSTypeRegistry0.createOptionalNullableType(jSType0);
      JSType.TypePair jSType_TypePair0 = jSType1.getTypesUnderEquality(jSType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      ObjectType objectType0 = unionType0.dereference();
      linkedHashSet0.add(objectType0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderInequality(objectType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Unknown class name", "Not declared as a type name", 1, (-1));
      linkedHashSet0.add(namedType0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderInequality(namedType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^l8$k?WzFA?wi");
      JSType jSType0 = errorFunctionType0.getReturnType();
      JSType jSType1 = jSTypeRegistry0.createOptionalNullableType(jSType0);
      JSType.TypePair jSType_TypePair0 = jSType1.getTypesUnderShallowInequality(jSType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      NullType nullType0 = new NullType(jSTypeRegistry0);
      linkedHashSet0.add(nullType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderShallowInequality(nullType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = unionType0.getRestrictedTypeGivenToBooleanOutcome(false);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderInequality(jSType0);
      linkedHashSet0.add(jSType_TypePair0.typeA);
      JSType jSType1 = unionType0.resolveInternal(simpleErrorReporter0, (StaticScope<JSType>) null);
      assertFalse(jSType1.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, (String) null);
      JSType[] jSTypeArray0 = new JSType[6];
      jSTypeArray0[0] = (JSType) errorFunctionType0;
      jSTypeArray0[1] = (JSType) errorFunctionType0;
      jSTypeArray0[2] = (JSType) errorFunctionType0;
      jSTypeArray0[3] = (JSType) errorFunctionType0;
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      jSTypeArray0[4] = (JSType) booleanType0;
      jSTypeArray0[5] = (JSType) errorFunctionType0;
      UnionType unionType0 = (UnionType)jSTypeRegistry0.createUnionType(jSTypeArray0);
      booleanType0.setResolvedTypeInternal(jSTypeArray0[1]);
      UnionType unionType1 = (UnionType)unionType0.resolveInternal(simpleErrorReporter0, (StaticScope<JSType>) null);
      assertFalse(unionType1.isNominalType());
  }
}
