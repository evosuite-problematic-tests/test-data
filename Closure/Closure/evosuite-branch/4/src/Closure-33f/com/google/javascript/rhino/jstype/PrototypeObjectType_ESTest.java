/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 06:07:01 GMT 2019
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NullType;
import com.google.javascript.rhino.jstype.NumberType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.PrototypeObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.rhino.jstype.UnknownType;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrototypeObjectType_ESTest extends PrototypeObjectType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "(7wV");
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(errorFunctionType0, (Node) null);
      hashMap0.put("t,c3:vPT", recordTypeBuilder_RecordProperty0);
      RecordType recordType1 = jSTypeRegistry0.createRecordType(hashMap0);
      recordType0.matchConstraint(recordType1);
      assertTrue(recordType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      boolean boolean0 = recordType0.matchesObjectContext();
      assertFalse(recordType0.isNativeObjectType());
      assertTrue(boolean0);
      assertFalse(recordType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, ".prototype", (ObjectType) null);
      prototypeObjectType0.canBeCalled();
      assertTrue(prototypeObjectType0.hasReferenceName());
      assertFalse(prototypeObjectType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "(7wV");
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(errorFunctionType0, (Node) null);
      hashMap0.put("t,c3:vPT", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      int int0 = recordType0.getPropertiesCount();
      assertFalse(recordType0.isNativeObjectType());
      assertEquals(1, int0);
      assertFalse(recordType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnknownType unknownType0 = new UnknownType((JSTypeRegistry) null, true);
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType((JSTypeRegistry) null, "!:7_gd}Vw+zjBC", unknownType0, true);
      // Undeclared exception!
      try { 
        prototypeObjectType0.findPropertyType("Not declared as a constructor");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.JSType", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "H");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      errorFunctionType0.setPropertyJSDocInfo("Not declared as a constructor", jSDocInfo0);
      assertTrue(errorFunctionType0.hasCachedValues());
      
      boolean boolean0 = errorFunctionType0.hasProperty("Not declared as a constructor");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "H");
      JSType jSType0 = jSTypeRegistry0.getType((StaticScope<JSType>) errorFunctionType0, "com.google.common.collect.SingletonImmutableList", "Not declared as a type name", 0, (-99));
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      boolean boolean0 = errorFunctionType0.defineProperty("", jSType0, false, (Node) null);
      boolean boolean1 = errorFunctionType0.defineProperty("", recordType0, false, (Node) null);
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.hasReferenceName());
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "`uq&!IWl$&XJNGQs/");
      Set<String> set0 = errorFunctionType0.getOwnPropertyNames();
      errorFunctionType0.collectPropertyNames(set0);
      assertTrue(errorFunctionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "H");
      Set<String> set0 = errorFunctionType0.getOwnPropertyNames();
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      errorFunctionType0.setPropertyJSDocInfo("Not declared as a constructor", jSDocInfo0);
      // Undeclared exception!
      try { 
        errorFunctionType0.collectPropertyNames(set0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.AbstractCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "H");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      errorFunctionType0.setPropertyJSDocInfo("Not declared as a constructor", jSDocInfo0);
      boolean boolean0 = errorFunctionType0.isPropertyTypeInferred("Not declared as a constructor");
      assertTrue(errorFunctionType0.hasCachedValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "`uq&!IWl$&XJNGQs/");
      boolean boolean0 = errorFunctionType0.isPropertyTypeInferred("`uq&!IWl$&XJNGQs/");
      assertTrue(errorFunctionType0.isNominalConstructor());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "`uq&!IWl$&XJNGQs/");
      boolean boolean0 = errorFunctionType0.isPropertyInExterns("{;LGMyYoF.O");
      assertTrue(errorFunctionType0.isNominalConstructor());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "H");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      errorFunctionType0.setPropertyJSDocInfo("Not declared as a constructor", jSDocInfo0);
      errorFunctionType0.isPropertyInExterns("Not declared as a constructor");
      assertTrue(errorFunctionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "H");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      errorFunctionType0.setPropertyJSDocInfo("Not declared as a constructor", jSDocInfo0);
      NumberType numberType0 = new NumberType(jSTypeRegistry0);
      boolean boolean0 = errorFunctionType0.defineProperty("Not declared as a constructor", numberType0, true, (Node) null);
      assertTrue(errorFunctionType0.hasCachedValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Unknown class name");
      boolean boolean0 = errorFunctionType0.removeProperty(")qzcuE8^\"P4c6b");
      assertTrue(errorFunctionType0.isNominalConstructor());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "H");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      errorFunctionType0.setPropertyJSDocInfo("Not declared as a constructor", jSDocInfo0);
      boolean boolean0 = errorFunctionType0.removeProperty("Not declared as a constructor");
      assertTrue(errorFunctionType0.hasCachedValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "H");
      errorFunctionType0.getPropertyNode("Named type with empty name component");
      assertTrue(errorFunctionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "H");
      JSType jSType0 = errorFunctionType0.getPropertyType("H");
      boolean boolean0 = errorFunctionType0.defineDeclaredProperty("Named type with empty name component", jSType0, (Node) null);
      assertTrue(boolean0);
      
      errorFunctionType0.getPropertyNode("Named type with empty name component");
      assertTrue(errorFunctionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "`uq&!IWl$&XJNGQs/");
      errorFunctionType0.getOwnPropertyJSDocInfo("Unknown class name");
      assertTrue(errorFunctionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "H");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      errorFunctionType0.setPropertyJSDocInfo("Not declared as a constructor", jSDocInfo0);
      errorFunctionType0.getOwnPropertyJSDocInfo("Not declared as a constructor");
      assertTrue(errorFunctionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, (String) null);
      errorFunctionType0.setPropertyJSDocInfo("", (JSDocInfo) null);
      assertTrue(errorFunctionType0.isNominalConstructor());
      assertFalse(errorFunctionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "H");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      errorFunctionType0.setPropertyJSDocInfo("Not declared as a constructor", jSDocInfo0);
      errorFunctionType0.setPropertyJSDocInfo("Not declared as a constructor", jSDocInfo0);
      assertTrue(errorFunctionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "H");
      boolean boolean0 = errorFunctionType0.matchesNumberContext();
      assertFalse(boolean0);
      assertTrue(errorFunctionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      JSType jSType0 = stringType0.autoboxesTo();
      boolean boolean0 = jSType0.matchesNumberContext();
      assertTrue(boolean0);
      assertTrue(jSType0.isNominalType());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      ObjectType objectType0 = recordType0.getImplicitPrototype();
      boolean boolean0 = ((PrototypeObjectType) objectType0).matchesStringContext();
      assertTrue(objectType0.isNominalType());
      assertTrue(boolean0);
      assertFalse(recordType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "H");
      boolean boolean0 = errorFunctionType0.matchesStringContext();
      assertFalse(boolean0);
      assertTrue(errorFunctionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "`uq&!IWl$&XJNGQs/");
      JSType[] jSTypeArray0 = new JSType[1];
      jSTypeArray0[0] = (JSType) errorFunctionType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) errorFunctionType0, jSTypeArray0);
      boolean boolean0 = functionType0.matchesStringContext();
      assertTrue(errorFunctionType0.isNominalConstructor());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      Node node0 = Node.newString(0, ", ...", 1, 0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) nullType0, node0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, functionType0);
      boolean boolean0 = instanceObjectType0.matchesStringContext();
      assertTrue(functionType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "H");
      JSType jSType0 = errorFunctionType0.unboxesTo();
      assertTrue(errorFunctionType0.isNominalConstructor());
      assertNull(jSType0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)stringType0.autoboxesTo();
      StringType stringType1 = (StringType)instanceObjectType0.unboxesTo();
      assertNotNull(stringType1);
      assertTrue(instanceObjectType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      ObjectType objectType0 = recordType0.getImplicitPrototype();
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "`uq&!IWl$&XJNGQs/", objectType0, false);
      String string0 = prototypeObjectType0.toString();
      assertFalse(recordType0.hasReferenceName());
      assertEquals("`uq&!IWl$&XJNGQs/", string0);
      assertFalse(prototypeObjectType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType[] jSTypeArray0 = new JSType[3];
      jSTypeArray0[2] = (JSType) recordType0;
      FunctionType functionType0 = jSTypeRegistry0.createConstructorTypeWithVarArgs((JSType) null, jSTypeArray0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, functionType0);
      String string0 = instanceObjectType0.toStringHelper(false);
      assertFalse(instanceObjectType0.isNativeObjectType());
      assertEquals("{...}", string0);
      assertNotNull(string0);
      assertFalse(instanceObjectType0.isNominalType());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Mu1WsgAI}|", "Mu1WsgAI}|", (-558), (-558));
      JSType jSType0 = namedType0.getReferencedType();
      Node node0 = Node.newString("Named type with empty name component");
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(jSType0, node0);
      hashMap0.put("Mu1WsgAI}|", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      String string0 = recordType0.toStringHelper(true);
      assertEquals("{Mu1WsgAI}|: ?}", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "(7wV");
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(errorFunctionType0, (Node) null);
      hashMap0.put("t,c3:vPT", recordTypeBuilder_RecordProperty0);
      hashMap0.put("Not declared as a constructor", recordTypeBuilder_RecordProperty0);
      hashMap0.put("'y@zR|r$&UYmU|^vT$Z", recordTypeBuilder_RecordProperty0);
      hashMap0.put(" 5n4T&WjKK~dz", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      String string0 = recordType0.toStringHelper(false);
      assertEquals("{ 5n4T&WjKK~dz: function (new:(7wV, *=, *=, *=): (7wV, 'y@zR|r$&UYmU|^vT$Z: function (new:(7wV, *=, *=, *=): (7wV, Not declared as a constructor: function (new:(7wV, *=, *=, *=): (7wV, t,c3:vPT: function (new:(7wV, *=, *=, *=): (7wV, ...}", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      recordType0.setPrettyPrint(false);
      String string0 = recordType0.toStringHelper(true);
      assertFalse(recordType0.hasReferenceName());
      assertNotNull(string0);
      assertFalse(recordType0.isNativeObjectType());
      assertEquals("?", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "'");
      JSType[] jSTypeArray0 = new JSType[3];
      jSTypeArray0[2] = (JSType) errorFunctionType0;
      FunctionType functionType0 = jSTypeRegistry0.createConstructorType((JSType) errorFunctionType0, true, jSTypeArray0);
      // Undeclared exception!
      try { 
        errorFunctionType0.setImplicitPrototype(functionType0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "H");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      errorFunctionType0.setPrototype(recordType0, (Node) null);
      recordType0.setPropertyJSDocInfo("oNxZA{8##nn7", jSDocInfo0);
      assertTrue(recordType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NullType nullType0 = new NullType(jSTypeRegistry0);
      Node node0 = Node.newString(0, ", ...", 1, 0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) nullType0, node0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, functionType0);
      boolean boolean0 = instanceObjectType0.isString();
      assertTrue(functionType0.hasCachedValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Unknown class name");
      boolean boolean0 = errorFunctionType0.isNumber();
      assertTrue(errorFunctionType0.isNominalConstructor());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "`uq&!IWl$&XJNGQsB/", (Node) null);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, functionType0);
      boolean boolean0 = instanceObjectType0.isSubtype(functionType0);
      assertTrue(instanceObjectType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "H");
      ErrorFunctionType errorFunctionType1 = (ErrorFunctionType)errorFunctionType0.forceResolve(simpleErrorReporter0, errorFunctionType0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      assertFalse(recordType0.hasReferenceName());
      
      errorFunctionType1.setPrototype(recordType0, (Node) null);
      assertTrue(recordType0.hasReferenceName());
      assertTrue(errorFunctionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "H");
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      errorFunctionType0.setPrototype(recordType0, (Node) null);
      // Undeclared exception!
      try { 
        recordType0.setOwnerFunction(errorFunctionType0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "H");
      errorFunctionType0.getCtorImplementedInterfaces();
      assertTrue(errorFunctionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "`kJV% ^9i!");
      errorFunctionType0.setOwnerFunction(errorFunctionType0);
      errorFunctionType0.getCtorImplementedInterfaces();
      assertTrue(errorFunctionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "H");
      JSType jSType0 = errorFunctionType0.getPropertyType("H");
      boolean boolean0 = errorFunctionType0.defineDeclaredProperty("Named type with empty name component", jSType0, (Node) null);
      assertTrue(boolean0);
      
      JSType jSType1 = errorFunctionType0.forceResolve(simpleErrorReporter0, errorFunctionType0);
      assertTrue(jSType1.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "H");
      UnknownType unknownType0 = (UnknownType)errorFunctionType0.getPropertyType("H");
      errorFunctionType0.matchConstraint(unknownType0);
      assertTrue(errorFunctionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "`uq&!IWl$&XJNGQs/");
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) errorFunctionType0, (List<JSType>) linkedList0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      functionType0.matchConstraint(noObjectType0);
      assertTrue(errorFunctionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Mu1WsgAI}|", "Mu1WsgAI}|", (-558), (-558));
      JSType jSType0 = namedType0.getReferencedType();
      Node node0 = Node.newString("Named type with empty name component");
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(jSType0, node0);
      hashMap0.put("Mu1WsgAI}|", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      recordType0.matchConstraint(recordType0);
      assertFalse(recordType0.hasCachedValues());
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty((JSType) null, (Node) null);
      hashMap0.put("fs'*W+", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      // Undeclared exception!
      try { 
        noObjectType0.matchConstraint(recordType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.JSType", e);
      }
  }
}
