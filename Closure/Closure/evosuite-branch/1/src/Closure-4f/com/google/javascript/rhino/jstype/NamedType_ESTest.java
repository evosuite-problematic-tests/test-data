/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 06:47:15 GMT 2018
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.Property;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.rhino.jstype.UnknownType;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NamedType_ESTest extends NamedType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Boolean", (String) null, 134, 0);
      JSType jSType0 = namedType0.getReferencedType();
      ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) namedType0, (JSType) namedType0, (JSType) namedType0, (JSType) namedType0, (JSType) namedType0, (JSType) namedType0, jSType0, jSType0);
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) immutableList0);
      namedType0.defineSynthesizedProperty("", jSType0, node0);
      namedType0.resolveInternal(simpleErrorReporter0, (StaticScope<JSType>) null);
      assertTrue(namedType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Cycle detected in inheritance chain of type ", "Cycle detected in inheritance chain of type ", (-2182), (-2182));
      boolean boolean0 = namedType0.isNamedType();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "", "", 0, 0);
      String string0 = namedType0.toStringHelper(false);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "l 6tqyd#u&j(Owc)<9", ".", 0, 0);
      boolean boolean0 = namedType0.hasReferenceName();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "", "s:xG ", 827, 827);
      namedType0.hashCode();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "", "s:xG ", 827, 827);
      String string0 = namedType0.getReferenceName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "s78t!bK", "To", 1183, 256);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      Node node0 = Node.newString("v{", 0, 0);
      namedType0.defineProperty("s78t!bK", (JSType) null, true, node0);
      boolean boolean0 = namedType0.defineProperty("", unknownType0, true, node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "string", (String) null, 536870912, 1);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "%}wG<s( mN cgH\u0006x");
      JSType jSType0 = namedType0.resolveInternal(simpleErrorReporter0, errorFunctionType0);
      assertFalse(jSType0.isFunctionType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "", "", 2459, (-1540));
      UnknownType unknownType0 = (UnknownType)namedType0.getPropertyType("");
      namedType0.resolveInternal(simpleErrorReporter0, unknownType0);
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      jSTypeRegistry0.setLastGeneration(false);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Boolean", "Boolean", 1189, 1189);
      namedType0.resolveInternal(simpleErrorReporter0, (StaticScope<JSType>) null);
      assertTrue(namedType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "l 6tqyd#u&j(Owc)<9", ".", 0, 0);
      Node node0 = Node.newString(1, "Not declared as a type name");
      EnumType enumType0 = new EnumType(jSTypeRegistry0, "Named type with empty name component", node0, namedType0);
      UnknownType unknownType0 = (UnknownType)namedType0.getGreatestSubtype(enumType0);
      jSTypeRegistry0.setLastGeneration(false);
      namedType0.resolveInternal(simpleErrorReporter0, unknownType0);
      assertTrue(unknownType0.isResolved());
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      StringType stringType0 = new StringType(jSTypeRegistry0);
      Stack<JSType> stack0 = new Stack<JSType>();
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) stringType0, (List<JSType>) stack0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(functionType0, (Node) null);
      hashMap0.put("j@5", recordTypeBuilder_RecordProperty0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "j@5", "j@5", 3052, 0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
      namedType0.resolveInternal(simpleErrorReporter0, recordType0);
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noObjectType0, (Node) null);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "j@5", "j@5", 3070, (-3963));
      hashMap0.put("j@5", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
      namedType0.resolveInternal(simpleErrorReporter0, recordType0);
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(errorFunctionType0, (Node) null);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "j@5", "j@5", 3070, 0);
      hashMap0.put("j@5", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
      namedType0.resolveInternal(simpleErrorReporter0, recordType0);
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      StringType stringType0 = new StringType(jSTypeRegistry0);
      Stack<JSType> stack0 = new Stack<JSType>();
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) stringType0, (List<JSType>) stack0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(functionType0, (Node) null);
      hashMap0.put("j@5", recordTypeBuilder_RecordProperty0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "j@5", "j@5", 3052, 0);
      functionType0.setImplicitPrototype(namedType0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
      namedType0.resolveInternal(simpleErrorReporter0, recordType0);
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty((JSType) null, (Node) null);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "j@5", "j@5", 3070, 0);
      hashMap0.put("j@5", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, false);
      namedType0.resolveInternal(simpleErrorReporter0, recordType0);
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      NoType noType0 = new NoType(jSTypeRegistry0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noType0, (Node) null);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "j@5", "j@5", 3070, 0);
      hashMap0.put("j@5", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
      namedType0.resolveInternal(simpleErrorReporter0, recordType0);
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = ":j>*d87";
      stringArray0[3] = ")Z";
      stringArray0[4] = ":j>*d87";
      ImmutableList<String> immutableList0 = ImmutableList.copyOf(stringArray0);
      jSTypeRegistry0.setTemplateTypeNames(immutableList0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "", "s:xG ", 625, 625);
      UnknownType unknownType0 = (UnknownType)namedType0.getReferencedType();
      Predicate<JSType> predicate0 = (Predicate<JSType>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(predicate0).apply(any(com.google.javascript.rhino.jstype.JSType.class));
      namedType0.setValidator(predicate0);
      namedType0.resolveInternal(simpleErrorReporter0, unknownType0);
      assertTrue(namedType0.isTemplateType());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "", "", 0, 0);
      Node node0 = new Node(0);
      Property property0 = new Property("Not declared as a constructor", (JSType) null, true, node0);
      namedType0.getTypedefType(simpleErrorReporter0, property0, "Not declared as a type name");
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "HX@(y`opMR.", "HX@(y`opMR.", (-2153), (-2153));
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, namedType0, namedType0);
      namedType0.resolveInternal(simpleErrorReporter0, parameterizedType0);
      Predicate<JSType> predicate0 = (Predicate<JSType>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(predicate0).apply(any(com.google.javascript.rhino.jstype.JSType.class));
      boolean boolean0 = namedType0.setValidator(predicate0);
      assertTrue(namedType0.isResolved());
      assertFalse(boolean0);
  }
}
