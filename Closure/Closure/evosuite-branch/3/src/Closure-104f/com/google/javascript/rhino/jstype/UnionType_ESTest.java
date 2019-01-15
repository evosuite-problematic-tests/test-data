/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 11:05:30 GMT 2019
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.AllType;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.BooleanType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.NullType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.ProxyObjectType;
import com.google.javascript.rhino.jstype.RecordType;
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
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      JSType jSType0 = jSTypeRegistry0.createOptionalType(noObjectType0);
      JSType jSType1 = noObjectType0.getLeastSupertype(jSType0);
      assertFalse(jSType1.isAllType());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, JSType> hashMap0 = new HashMap<String, JSType>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      ObjectType objectType0 = recordType0.getImplicitPrototype();
      JSType jSType0 = jSTypeRegistry0.createOptionalType(objectType0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      boolean boolean0 = linkedHashSet0.add(jSType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = unionType0.getRestrictedTypeGivenToBooleanOutcome(true);
      linkedHashSet0.add(jSType0);
      unionType0.forgiveUnknownNames();
      assertFalse(unionType0.isVoidType());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      AllType allType0 = new AllType(jSTypeRegistry0);
      EnumType enumType0 = jSTypeRegistry0.createEnumType("80yN", allType0);
      linkedHashSet0.add(enumType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.matchesUint32Context();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      NoType noType0 = new NoType(jSTypeRegistry0);
      linkedHashSet0.add(noType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.matchesNumberContext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      NullType nullType0 = new NullType(jSTypeRegistry0);
      JSType[] jSTypeArray0 = new JSType[3];
      FunctionType functionType0 = jSTypeRegistry0.createConstructorType((JSType) nullType0, jSTypeArray0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, functionType0, true);
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
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "", "BrkV", 0, 0);
      JSType jSType0 = namedType0.getReferencedType();
      EnumType enumType0 = new EnumType(jSTypeRegistry0, "", jSType0);
      linkedHashSet0.add(enumType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.matchesStringContext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      AllType allType0 = new AllType(jSTypeRegistry0);
      EnumType enumType0 = jSTypeRegistry0.createEnumType("80yN", allType0);
      linkedHashSet0.add(enumType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.matchesObjectContext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      linkedHashSet0.add(voidType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.matchesObjectContext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      AllType allType0 = new AllType(jSTypeRegistry0);
      EnumType enumType0 = jSTypeRegistry0.createEnumType("80yN", allType0);
      linkedHashSet0.add(enumType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = unionType0.findPropertyType("com.google.javascript.rhino.Node$NodeMismatch");
      assertNull(jSType0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      linkedHashSet0.add(voidType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = unionType0.findPropertyType("7ud94l9[6(>-qSo");
      assertNull(jSType0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, unknownType0);
      linkedHashSet0.add(proxyObjectType0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, proxyObjectType0, proxyObjectType0);
      JSType jSType0 = parameterizedType0.getRestrictedTypeGivenToBooleanOutcome(false);
      linkedHashSet0.add(jSType0);
      JSType jSType1 = unionType0.findPropertyType("Named type with empty name component");
      assertTrue(jSType1.isUnknownType());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = unionType0.meet(unionType0);
      boolean boolean0 = unionType0.canAssignTo(jSType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      linkedHashSet0.add(voidType0);
      boolean boolean0 = unionType0.canAssignTo(voidType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, false);
      linkedHashSet0.add(unknownType0);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      boolean boolean0 = unionType0.canAssignTo(booleanType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, unknownType0);
      linkedHashSet0.add(proxyObjectType0);
      boolean boolean0 = unionType0.canBeCalled();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      linkedHashSet0.add(objectType0);
      boolean boolean0 = unionType0.canBeCalled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, unknownType0);
      linkedHashSet0.add(proxyObjectType0);
      JSType jSType0 = unionType0.restrictByNotNullOrUndefined();
      assertFalse(jSType0.isNullType());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, unknownType0);
      linkedHashSet0.add(proxyObjectType0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, proxyObjectType0, proxyObjectType0);
      JSType jSType0 = parameterizedType0.getRestrictedTypeGivenToBooleanOutcome(false);
      linkedHashSet0.add(jSType0);
      unionType0.testForEquality(jSType0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      linkedHashSet0.add(voidType0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      linkedHashSet0.add(allType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      unionType0.testForEquality(unionType0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, unknownType0);
      linkedHashSet0.add(proxyObjectType0);
      boolean boolean0 = unionType0.isNullable();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      AllType allType0 = new AllType(jSTypeRegistry0);
      EnumType enumType0 = jSTypeRegistry0.createEnumType("80yN", allType0);
      linkedHashSet0.add(enumType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.isNullable();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, false);
      JSType jSType0 = unionType0.getLeastSupertype(unknownType0);
      assertFalse(jSType0.isNullType());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      AllType allType0 = new AllType(jSTypeRegistry0);
      EnumType enumType0 = jSTypeRegistry0.createEnumType("80yN", allType0);
      linkedHashSet0.add(enumType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = unionType0.getLeastSupertype(unionType0);
      assertFalse(jSType0.isRecordType());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, false);
      linkedHashSet0.add(unknownType0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      JSType jSType0 = unionType0.getLeastSupertype(allType0);
      assertFalse(jSType0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      linkedHashSet0.add(nullType0);
      NoType noType0 = (NoType)nullType0.restrictByNotNullOrUndefined();
      unionType0.meet(noType0);
      assertTrue(noType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      AllType allType0 = new AllType(jSTypeRegistry0);
      EnumType enumType0 = jSTypeRegistry0.createEnumType("80yN", allType0);
      linkedHashSet0.add(enumType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = unionType0.meet(unionType0);
      assertEquals(0, JSType.NOT_ENUMDECL);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = jSTypeRegistry0.createOptionalNullableType(unionType0);
      JSType jSType1 = unionType0.meet(jSType0);
      assertFalse(jSType1.isStringValueType());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      JSType jSType0 = unionType0.meet(nullType0);
      assertTrue(jSType0.isObject());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.equals(unionType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      AllType allType0 = new AllType(jSTypeRegistry0);
      EnumType enumType0 = jSTypeRegistry0.createEnumType("80yN", allType0);
      linkedHashSet0.add(enumType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      boolean boolean0 = unionType0.isObject();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, unknownType0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, proxyObjectType0, proxyObjectType0);
      boolean boolean0 = unionType0.contains(parameterizedType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, unknownType0);
      linkedHashSet0.add(proxyObjectType0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, proxyObjectType0, proxyObjectType0);
      boolean boolean0 = unionType0.contains(parameterizedType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      AllType allType0 = new AllType(jSTypeRegistry0);
      EnumType enumType0 = jSTypeRegistry0.createEnumType("80yN", allType0);
      linkedHashSet0.add(enumType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = unionType0.getRestrictedUnion(unionType0);
      assertTrue(jSType0.matchesObjectContext());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, false);
      linkedHashSet0.add(unknownType0);
      JSType jSType0 = unionType0.getRestrictedUnion(unknownType0);
      assertFalse(jSType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      AllType allType0 = new AllType(jSTypeRegistry0);
      linkedHashSet0.add(allType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = unionType0.getRestrictedUnion(unionType0);
      assertFalse(jSType0.isRecordType());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, unknownType0);
      linkedHashSet0.add(proxyObjectType0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, proxyObjectType0, proxyObjectType0);
      JSType jSType0 = parameterizedType0.getRestrictedTypeGivenToBooleanOutcome(false);
      linkedHashSet0.add(jSType0);
      String string0 = unionType0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      linkedHashSet0.add(objectType0);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      JSType jSType0 = booleanType0.getLeastSupertype(unionType0);
      JSType jSType1 = unionType0.getLeastSupertype(jSType0);
      assertTrue(jSType1.isUnionType());
      assertNotSame(jSType0, unionType0);
      assertNotSame(jSType1, unionType0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      JSType.TypePair jSType_TypePair0 = allType0.getTypesUnderEquality(unionType0);
      linkedHashSet0.add(jSType_TypePair0.typeA);
      JSType jSType0 = unionType0.getRestrictedTypeGivenToBooleanOutcome(true);
      assertFalse(jSType0.isStringValueType());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      AllType allType0 = new AllType(jSTypeRegistry0);
      EnumType enumType0 = jSTypeRegistry0.createEnumType("80yN", allType0);
      linkedHashSet0.add(enumType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      BooleanLiteralSet booleanLiteralSet0 = unionType0.getPossibleToBooleanOutcomes();
      assertEquals(BooleanLiteralSet.TRUE, booleanLiteralSet0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      AllType allType0 = new AllType(jSTypeRegistry0);
      linkedHashSet0.add(allType0);
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      BooleanLiteralSet booleanLiteralSet0 = unionType0.getPossibleToBooleanOutcomes();
      assertEquals(BooleanLiteralSet.BOTH, booleanLiteralSet0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, JSType> hashMap0 = new HashMap<String, JSType>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      ObjectType objectType0 = recordType0.getImplicitPrototype();
      JSType jSType0 = jSTypeRegistry0.createOptionalType(objectType0);
      JSType.TypePair jSType_TypePair0 = jSType0.getTypesUnderEquality(recordType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = unionType0.restrictByNotNullOrUndefined();
      linkedHashSet0.add(jSType0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderInequality(jSType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, unknownType0);
      linkedHashSet0.add(proxyObjectType0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, proxyObjectType0, proxyObjectType0);
      JSType jSType0 = parameterizedType0.getRestrictedTypeGivenToBooleanOutcome(false);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderInequality(jSType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = unionType0.restrictByNotNullOrUndefined();
      linkedHashSet0.add(jSType0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderShallowInequality(jSType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      linkedHashSet0.add(voidType0);
      JSType.TypePair jSType_TypePair0 = unionType0.getTypesUnderShallowInequality(voidType0);
      assertNotNull(jSType_TypePair0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      JSType jSType0 = unionType0.restrictByNotNullOrUndefined();
      linkedHashSet0.add(jSType0);
      EmptyScope emptyScope0 = new EmptyScope();
      JSType jSType1 = unionType0.resolveInternal(simpleErrorReporter0, emptyScope0);
      assertFalse(jSType1.isNominalType());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      LinkedHashSet<JSType> linkedHashSet0 = new LinkedHashSet<JSType>();
      HashMap<String, JSType> hashMap0 = new HashMap<String, JSType>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      EmptyScope emptyScope0 = new EmptyScope();
      UnionType unionType0 = new UnionType(jSTypeRegistry0, linkedHashSet0);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      voidType0.setResolvedTypeInternal(recordType0);
      linkedHashSet0.add(voidType0);
      JSType jSType0 = unionType0.resolveInternal(simpleErrorReporter0, emptyScope0);
      assertFalse(jSType0.isNoObjectType());
  }
}
