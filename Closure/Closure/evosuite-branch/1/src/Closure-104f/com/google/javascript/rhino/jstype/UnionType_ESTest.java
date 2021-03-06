/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 10:35:35 GMT 2018
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.AllType;
import com.google.javascript.rhino.jstype.ArrowType;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.BooleanType;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionPrototypeType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.NullType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.rhino.jstype.VoidType;
import com.google.javascript.rhino.testing.EmptyScope;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnionType_ESTest extends UnionType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.isUnionType();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      JSType jSType0 = jSTypeRegistry0.createOptionalType(objectType0);
      jSType0.forgiveUnknownNames();
      assertFalse(jSType0.isNoType());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      linkedHashSet0.add(booleanType0);
      boolean boolean0 = unionType0.matchesInt32Context();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      JSTypeNative jSTypeNative0 = JSTypeNative.URI_ERROR_FUNCTION_TYPE;
      JSType jSType0 = jSTypeRegistry0.getNativeType(jSTypeNative0);
      linkedHashSet0.add(jSType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.matchesInt32Context();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<ArrowType> linkedHashSet0 = new LinkedHashSet<ArrowType>();
      LinkedHashSet<JSType> linkedHashSet1 = new LinkedHashSet<JSType>(linkedHashSet0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet1);
      JSType jSType0 = JSType.getLeastSupertype((JSType) unionType0, (JSType) unionType0);
      linkedHashSet1.add(jSType0);
      boolean boolean0 = unionType0.matchesStringContext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, errorFunctionType0);
      linkedHashSet0.add(instanceObjectType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.matchesStringContext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      linkedHashSet0.add(noType0);
      boolean boolean0 = unionType0.matchesObjectContext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>(3374, 3374);
      VoidType voidType0 = new VoidType((JSTypeRegistry) null);
      linkedHashSet0.add(voidType0);
      UnionType unionType0 = new UnionType((JSTypeRegistry) null, linkedHashSet0);
      boolean boolean0 = unionType0.matchesObjectContext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      NullType nullType0 = new NullType(jSTypeRegistry0);
      linkedHashSet0.add(nullType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = unionType0.findPropertyType("Named type with empty name component");
      assertNull(jSType0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      JSType jSType0 = jSTypeRegistry0.createOptionalType(objectType0);
      JSType jSType1 = jSType0.findPropertyType("");
      assertNull(jSType1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderShallowInequality(noType0);
      linkedHashSet0.add(noType0);
      linkedHashSet0.add(jSType_TypePair0.typeB);
      NoType noType1 = (NoType)unionType0.findPropertyType("(com.google.javascript.rhino.jstype.NoType@0000000030|com.google.javascript.rhino.jstype.NoType@0000000223)");
      assertEquals(Integer.MAX_VALUE, noType1.getMaxArguments());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      linkedHashSet0.add(booleanType0);
      boolean boolean0 = unionType0.canAssignTo(unionType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Not declared as a type name", " Fyb}m(e", 0, 1);
      JSType jSType0 = namedType0.getReferencedType();
      linkedHashSet0.add(jSType0);
      boolean boolean0 = unionType0.canAssignTo(jSType0);
      assertTrue(boolean0);
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
      EmptyScope emptyScope0 = new EmptyScope();
      JSType jSType0 = jSTypeRegistry0.getType((StaticScope<JSType>) emptyScope0, "vJH[Up)CEo1.", "OJPq/>Ihq@R\"ULs", 393, (-1));
      linkedHashSet0.add(jSType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.canBeCalled();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      JSTypeNative jSTypeNative0 = JSTypeNative.URI_ERROR_FUNCTION_TYPE;
      JSType jSType0 = jSTypeRegistry0.getNativeType(jSTypeNative0);
      linkedHashSet0.add(jSType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      ObjectType objectType0 = unionType0.dereference();
      assertFalse(objectType0.isOrdinaryFunction());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "CZ3l$u<A]d4fD13'F");
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, errorFunctionType0);
      ObjectType objectType0 = instanceObjectType0.getImplicitPrototype();
      linkedHashSet0.add(instanceObjectType0);
      linkedHashSet0.add(objectType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      unionType0.testForEquality(errorFunctionType0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSTypeNative jSTypeNative0 = JSTypeNative.UNKNOWN_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      JSType.TypePair jSType_TypePair0 = objectType0.getTypesUnderShallowInequality(unionType0);
      linkedHashSet0.add(jSType_TypePair0.typeB);
      JSType.TypePair jSType_TypePair1 = unionType0.getTypesUnderInequality(objectType0);
      linkedHashSet0.add(jSType_TypePair1.typeB);
      unionType0.testForEquality(jSType_TypePair1.typeA);
      assertEquals(2, linkedHashSet0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "CZ3l$u<A]d4fD13'F");
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, errorFunctionType0);
      linkedHashSet0.add(instanceObjectType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.isNullable();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderShallowInequality(noType0);
      linkedHashSet0.add(jSType_TypePair0.typeB);
      boolean boolean0 = unionType0.isNullable();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSTypeNative jSTypeNative0 = JSTypeNative.UNKNOWN_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      JSType.TypePair jSType_TypePair0 = objectType0.getTypesUnderShallowInequality(unionType0);
      linkedHashSet0.add(jSType_TypePair0.typeB);
      JSType.TypePair jSType_TypePair1 = unionType0.getTypesUnderInequality(objectType0);
      linkedHashSet0.add(jSType_TypePair1.typeB);
      boolean boolean0 = unionType0.isUnknownType();
      assertEquals(2, linkedHashSet0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      JSType jSType0 = unionType0.getLeastSupertype(unknownType0);
      assertFalse(jSType0.isNoType());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderShallowInequality((JSType) null);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      linkedHashSet0.add(booleanType0);
      JSType jSType0 = unionType0.getLeastSupertype(jSType_TypePair0.typeA);
      assertFalse(jSType0.isNumberValueType());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Unknown class name");
      JSType jSType0 = errorFunctionType0.getPropertyType("374");
      linkedHashSet0.add(jSType0);
      FunctionPrototypeType functionPrototypeType0 = new FunctionPrototypeType(jSTypeRegistry0, errorFunctionType0, errorFunctionType0);
      JSType jSType1 = unionType0.getLeastSupertype(functionPrototypeType0);
      assertFalse(jSType1.isAllType());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSTypeNative jSTypeNative0 = JSTypeNative.URI_ERROR_FUNCTION_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderInequality(objectType0);
      linkedHashSet0.add(jSType_TypePair0.typeB);
      JSType jSType0 = unionType0.meet(objectType0);
      JSType jSType1 = unionType0.getLeastSupertype(jSType0);
      assertFalse(jSType1.isStringValueType());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderShallowInequality((JSType) null);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      linkedHashSet0.add(booleanType0);
      NoType noType0 = (NoType)unionType0.meet(jSType_TypePair0.typeB);
      assertTrue(noType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      JSTypeNative jSTypeNative0 = JSTypeNative.URI_ERROR_FUNCTION_TYPE;
      JSType jSType0 = jSTypeRegistry0.getNativeType(jSTypeNative0);
      linkedHashSet0.add(jSType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType1 = unionType0.meet(unionType0);
      assertFalse(jSType1.isTemplateType());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>(4064);
      HashMap<String, JSType> hashMap0 = new HashMap<String, JSType>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(recordType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType1 = unionType0.meet(jSType0);
      assertFalse(jSType1.isBooleanValueType());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderShallowInequality((JSType) null);
      boolean boolean0 = unionType0.differsFrom(jSType_TypePair0.typeB);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      JSType jSType0 = noObjectType0.getLeastSupertype(nullType0);
      linkedHashSet0.add(jSType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = linkedHashSet0.add(unionType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderShallowInequality((JSType) null);
      boolean boolean0 = unionType0.contains(jSType_TypePair0.typeA);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      JSTypeNative jSTypeNative0 = JSTypeNative.URI_ERROR_FUNCTION_TYPE;
      JSType jSType0 = jSTypeRegistry0.getNativeType(jSTypeNative0);
      linkedHashSet0.add(jSType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.contains(jSType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, ")MTo+cBLW4ZUQJ", "Not declared as a constructor", 133, 1);
      JSType jSType0 = namedType0.getReferencedType();
      linkedHashSet0.add(jSType0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderShallowInequality(jSType0);
      JSType jSType1 = unionType0.getRestrictedUnion(jSType_TypePair0.typeA);
      assertEquals("?", jSType1.toString());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "CZ3l$u<A]d4fD13'F");
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, errorFunctionType0);
      ObjectType objectType0 = instanceObjectType0.getImplicitPrototype();
      linkedHashSet0.add(objectType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      NoObjectType noObjectType0 = (NoObjectType)unionType0.meet(errorFunctionType0);
      unionType0.getRestrictedUnion(noObjectType0);
      assertTrue(noObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderShallowInequality(noType0);
      linkedHashSet0.add(noType0);
      linkedHashSet0.add(jSType_TypePair0.typeB);
      String string0 = unionType0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      JSTypeNative jSTypeNative0 = JSTypeNative.URI_ERROR_FUNCTION_TYPE;
      JSType jSType0 = jSTypeRegistry0.getNativeType(jSTypeNative0);
      linkedHashSet0.add(jSType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.isSubtype(unionType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      JSTypeNative jSTypeNative0 = JSTypeNative.URI_ERROR_FUNCTION_TYPE;
      JSType jSType0 = jSTypeRegistry0.getNativeType(jSTypeNative0);
      linkedHashSet0.add(jSType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      NoType noType0 = (NoType)unionType0.getRestrictedUnion(jSType0);
      boolean boolean0 = unionType0.isSubtype(noType0);
      assertFalse(boolean0);
      assertTrue(noType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      linkedHashSet0.add(booleanType0);
      JSType jSType0 = unionType0.getRestrictedTypeGivenToBooleanOutcome(true);
      assertEquals("boolean", jSType0.toString());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      JSTypeNative jSTypeNative0 = JSTypeNative.URI_ERROR_FUNCTION_TYPE;
      JSType jSType0 = jSTypeRegistry0.getNativeType(jSTypeNative0);
      linkedHashSet0.add(jSType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      BooleanLiteralSet booleanLiteralSet0 = unionType0.getPossibleToBooleanOutcomes();
      assertEquals(BooleanLiteralSet.TRUE, booleanLiteralSet0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Not declared as a type name", " Fyb}m(e", 0, 1);
      JSType jSType0 = namedType0.getReferencedType();
      linkedHashSet0.add(jSType0);
      BooleanLiteralSet booleanLiteralSet0 = unionType0.getPossibleToBooleanOutcomes();
      assertEquals(BooleanLiteralSet.BOTH, booleanLiteralSet0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSTypeNative jSTypeNative0 = JSTypeNative.URI_ERROR_FUNCTION_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderInequality(objectType0);
      linkedHashSet0.add(jSType_TypePair0.typeB);
      NoType noType0 = (NoType)unionType0.getRestrictedUnion(objectType0);
      unionType0.getTypesUnderEquality(noType0);
      assertTrue(noType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      JSType jSType0 = jSTypeRegistry0.createOptionalType(objectType0);
      JSType.TypePair jSType_TypePair0 = jSType0.getTypesUnderEquality(jSType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSTypeNative jSTypeNative0 = JSTypeNative.URI_ERROR_FUNCTION_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderInequality(objectType0);
      linkedHashSet0.add(jSType_TypePair0.typeB);
      JSType.TypePair jSType_TypePair1 = unionType0.getTypesUnderInequality(jSType_TypePair0.typeB);
      assertNotSame(jSType_TypePair0, jSType_TypePair1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
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
  public void test44()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      EmptyScope emptyScope0 = new EmptyScope();
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      linkedHashSet0.add(booleanType0);
      JSType jSType0 = unionType0.resolveInternal(simpleErrorReporter0, emptyScope0);
      assertFalse(jSType0.isTemplateType());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      EmptyScope emptyScope0 = new EmptyScope();
      JSType jSType0 = jSTypeRegistry0.getType((StaticScope<JSType>) emptyScope0, "vJH[Up)CEo1.", "OJPq/>Ihq@R\"ULs", 393, (-1));
      linkedHashSet0.add(jSType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType1 = unionType0.resolveInternal(simpleErrorReporter0, emptyScope0);
      assertFalse(jSType1.isNominalType());
  }
}
