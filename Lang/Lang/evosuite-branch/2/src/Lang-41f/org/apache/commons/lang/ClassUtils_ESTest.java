/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 18:06:16 GMT 2019
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.lang.ClassUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassUtils_ESTest extends ClassUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Character character0 = Character.valueOf('z');
      String string0 = ClassUtils.getShortCanonicalName((Object) character0, "");
      assertEquals("Character", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      try { 
        ClassUtils.getClass(classLoader0, "java.lang");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Object) "Byte", "Byte");
      assertEquals("java.lang", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassUtils classUtils0 = new ClassUtils();
      assertEquals('.', ClassUtils.PACKAGE_SEPARATOR_CHAR);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Short> class0 = Short.class;
      String string0 = ClassUtils.getShortClassName((Object) class0, "][]");
      assertEquals("Class", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Object) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("[");
      assertEquals("][]", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("[L");
      assertEquals("L[]", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("J");
      assertEquals("long", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("i`;Y=}q4of8iMYOx{$");
      assertEquals("i`;Y=}q4of8iMYOx{.", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      String string0 = ClassUtils.getPackageName((Object) class0, "java.lang");
      assertEquals("java.lang", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Object) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("[jdjzY");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("LINUX");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("L;");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses((Class<?>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.getAllInterfaces((Class<?>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<Double> class0 = Double.class;
      List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      List<Class<?>> list2 = ClassUtils.convertClassNamesToClasses(list1);
      assertEquals(2, list2.size());
      assertNotNull(list2);
      assertTrue(list2.equals((Object)list0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses((List<String>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      List<String> list0 = ClassUtils.convertClassesToClassNames((List<Class<?>>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.offerLast("");
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses(linkedList0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      assertEquals(1, list1.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 4);
      boolean boolean0 = ClassUtils.isAssignable((Class<?>[]) null, classArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = ClassUtils.isAssignable((Class<?>[]) null, (Class<?>[]) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<Short>[] classArray0 = (Class<Short>[]) Array.newInstance(Class.class, 6);
      Class<ClassUtils> class0 = ClassUtils.class;
      boolean boolean0 = ClassUtils.isAssignable(classArray0[2], class0, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 4);
      Class<Integer> class0 = Integer.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(classArray0[2], class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 6);
      Class<Integer> class0 = Integer.class;
      classArray0[0] = class0;
      classArray0[1] = class0;
      classArray0[2] = classArray0[1];
      classArray0[3] = class0;
      Class<Integer> class1 = Integer.TYPE;
      classArray0[4] = class1;
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Class<ClassUtils> class1 = ClassUtils.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      Class<Character> class1 = Character.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("double", true);
      Class<Object> class1 = Object.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 4);
      Class<Integer> class0 = Integer.class;
      classArray0[0] = class0;
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertNotNull(classArray1);
      
      boolean boolean0 = ClassUtils.isAssignable(classArray1, classArray0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<Float> class1 = Float.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<Integer> class1 = Integer.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Class<Character> class0 = Character.TYPE;
      Class<Integer> class1 = Integer.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      Class<Integer> class1 = Integer.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Class<Long> class1 = Long.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      Class<Long> class1 = Long.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Class<Character> class0 = Character.TYPE;
      Class<Boolean> class1 = Boolean.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      Class<Short> class1 = Short.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Class<Float> class1 = Float.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      Class<Double> class1 = Double.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Class<Character> class0 = Character.TYPE;
      Class<Integer> class1 = Integer.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<Character> class1 = Character.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      Class<Character> class1 = Character.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Class<Character> class1 = Character.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Class<Long> class1 = Long.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      Class<Short> class1 = Short.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Class<Short> class0 = Short.class;
      Class<Boolean> class1 = Boolean.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      Class<Short> class1 = Short.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Class<Byte> class1 = Byte.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      Class<Byte> class1 = Byte.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<Byte> class1 = Byte.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Class<Boolean> class0 = Boolean.TYPE;
      Class<Byte> class1 = Byte.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 2);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
      assertEquals(2, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.primitivesToWrappers((Class<?>[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
      assertEquals(0, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.wrappersToPrimitives((Class<?>[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertEquals(0, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      boolean boolean0 = ClassUtils.isInnerClass(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      boolean boolean0 = ClassUtils.isInnerClass((Class<?>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("org.apache.commons.lang.builder.ToStringStyle$NoFieldNameToStringStyle", true);
      boolean boolean0 = ClassUtils.isInnerClass(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      // Undeclared exception!
      try { 
        ClassUtils.getClass(classLoader0, (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // className must not be null.
         //
         verifyException("org.apache.commons.lang.ClassUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("int[]", false);
      assertEquals(1041, class0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      try { 
        ClassUtils.getClass("][]");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.toClass((Object[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.toClass(classArray0);
      assertEquals(0, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Class<Short>[] classArray0 = (Class<Short>[]) Array.newInstance(Class.class, 6);
      classArray0[0] = class0;
      classArray0[1] = class0;
      classArray0[2] = class0;
      classArray0[3] = class0;
      classArray0[4] = class0;
      classArray0[5] = class0;
      Class<?>[] classArray1 = ClassUtils.toClass(classArray0);
      assertEquals(6, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Object) null, ".");
      assertEquals(".", string0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Class<Double> class0 = Double.class;
      String string0 = ClassUtils.getShortCanonicalName(class0);
      assertEquals("Double", string0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 21);
      String string0 = ClassUtils.getPackageCanonicalName((Object) classArray0[3], "org.apache.Lommons.lang.Classrtils");
      assertEquals("org.apache.Lommons.lang.Classrtils", string0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      String string0 = ClassUtils.getPackageCanonicalName(class0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 4);
      String string0 = ClassUtils.getPackageCanonicalName(classArray0[1]);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("[L");
      assertEquals("][]", string0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getPackageCanonicalName("[jdjzY");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}