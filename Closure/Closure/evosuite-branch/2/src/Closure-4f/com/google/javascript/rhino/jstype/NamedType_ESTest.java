/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 11:54:06 GMT 2019
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Predicate;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.NullType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.SimpleSlot;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnknownType;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NamedType_ESTest extends NamedType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "String", "com.google.javascript.rhno.jstype.NamedType$1", 13, 13);
      Node node0 = new Node(256);
      namedType0.defineDeclaredProperty("Vm ]8]\r*3", (JSType) null, node0);
      namedType0.resolveInternal(simpleErrorReporter0, (StaticScope<JSType>) null);
      assertTrue(namedType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "syBy.)0v", "", (-1), (-3782));
      boolean boolean0 = namedType0.isNamedType();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "syBy.)0v", "", (-1), (-3782));
      String string0 = namedType0.toStringHelper(false);
      assertEquals("syBy.)0v", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "", "", 1994, 1994);
      ObjectType objectType0 = jSTypeRegistry0.createObjectType((ObjectType) namedType0);
      namedType0.setReferencedType(objectType0);
      namedType0.resolveInternal(simpleErrorReporter0, (StaticScope<JSType>) null);
      assertFalse(namedType0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>(1966);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "", "", (-2352), (-2352));
      namedType0.isImplicitPrototype(recordType0);
      assertTrue(namedType0.isNominalType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "", "", 0, 0);
      namedType0.hashCode();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "}%8X", "agG^$fo/$V8K%", 1004, 1004);
      namedType0.defineProperty("}%8X", (JSType) null, false, (Node) null);
      boolean boolean0 = namedType0.defineProperty("}%8X", (JSType) null, true, (Node) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      jSTypeRegistry0.declareType("Erq5o*", nullType0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Erq5o*", "Erq5o*", 13, 0);
      UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
      JSType jSType0 = namedType0.resolveInternal(simpleErrorReporter0, unknownType0);
      assertTrue(jSType0.isNullType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "", "", 1966, 1966);
      jSTypeRegistry0.forwardDeclareType("");
      namedType0.resolveInternal(simpleErrorReporter0, (StaticScope<JSType>) null);
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "String", "String", 14, 14);
      jSTypeRegistry0.setLastGeneration(false);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "String");
      namedType0.resolveInternal(simpleErrorReporter0, templateType0);
      assertTrue(namedType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>(1966);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "", "", (-2352), (-2352));
      jSTypeRegistry0.setLastGeneration(false);
      namedType0.resolveInternal(simpleErrorReporter0, recordType0);
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "(S1^h;P/F<fv", "(S1^h;P/F<fv", (-21), (-21));
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      JSType[] jSTypeArray0 = new JSType[4];
      jSTypeArray0[3] = (JSType) namedType0;
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs(jSTypeArray0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(namedType0, node0);
      hashMap0.put("(S1^h;P/F<fv", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      namedType0.resolveInternal(simpleErrorReporter0, recordType0);
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "com.google.javascript.rhino.jstype.NamedType$PropertyContinuation", "Xd\"DSTZ5&D#q]:X`", (-437), 2562);
      JSTypeNative jSTypeNative0 = JSTypeNative.TYPE_ERROR_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      namedType0.resolveInternal(simpleErrorReporter0, objectType0);
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "(S1^h;P/F<fv", "(S1^h;P/F<fv", (-21), (-21));
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty((JSType) null, (Node) null);
      hashMap0.put("(S1^h;P/F<fv", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      namedType0.resolveInternal(simpleErrorReporter0, recordType0);
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "String", "String", 14, 14);
      Predicate<JSType> predicate0 = (Predicate<JSType>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(predicate0).apply(any(com.google.javascript.rhino.jstype.JSType.class));
      namedType0.setValidator(predicate0);
      namedType0.resolveInternal(simpleErrorReporter0, (StaticScope<JSType>) null);
      assertTrue(namedType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "syBy.)0v", "", (-1), (-3782));
      SimpleSlot simpleSlot0 = new SimpleSlot("", (JSType) null, true);
      namedType0.getTypedefType(simpleErrorReporter0, simpleSlot0, "Unknown class name");
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>(1966);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "", "", (-2352), (-2352));
      namedType0.resolveInternal(simpleErrorReporter0, recordType0);
      // Undeclared exception!
      try { 
        namedType0.setValidator((Predicate<JSType>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.JSType", e);
      }
  }
}
