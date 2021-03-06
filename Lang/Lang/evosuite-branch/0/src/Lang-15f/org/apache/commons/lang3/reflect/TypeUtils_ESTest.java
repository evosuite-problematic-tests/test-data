/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 10:07:08 GMT 2018
 */

package org.apache.commons.lang3.reflect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Map;
import org.apache.commons.lang3.reflect.TypeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypeUtils_ESTest extends TypeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TypeUtils typeUtils0 = new TypeUtils();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Type[] typeArray0 = new Type[1];
      WildcardType wildcardType0 = mock(WildcardType.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(wildcardType0).getLowerBounds();
      doReturn(typeArray0).when(wildcardType0).getUpperBounds();
      Class<Object> class0 = Object.class;
      boolean boolean0 = TypeUtils.isAssignable(class0, wildcardType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Type[] typeArray0 = new Type[1];
      WildcardType wildcardType0 = mock(WildcardType.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(wildcardType0).getUpperBounds();
      Class<Object> class0 = Object.class;
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(parameterizedType0).getRawType();
      // Undeclared exception!
      try { 
        TypeUtils.isAssignable(wildcardType0, parameterizedType0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // found an unhandled type: null
         //
         verifyException("org.apache.commons.lang3.reflect.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(type0).toString();
      Type[] typeArray0 = new Type[7];
      typeArray0[2] = type0;
      // Undeclared exception!
      try { 
        TypeUtils.normalizeUpperBounds(typeArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // found an unhandled type: Mock for Type, hashCode: 555463965
         //
         verifyException("org.apache.commons.lang3.reflect.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = TypeUtils.isAssignable((Type) null, (Type) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn(class0, (Type) null).when(parameterizedType0).getRawType();
      Class<Integer> class1 = Integer.class;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = (Type) class1;
      typeArray0[1] = (Type) class0;
      typeArray0[2] = (Type) parameterizedType0;
      // Undeclared exception!
      try { 
        TypeUtils.normalizeUpperBounds(typeArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Wait... What!? Type of rawType: null
         //
         verifyException("org.apache.commons.lang3.reflect.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<?> class1 = TypeUtils.getRawType(class0, (Type) null);
      assertNotNull(class1);
      
      WildcardType wildcardType0 = mock(WildcardType.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = TypeUtils.isAssignable(wildcardType0, class1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = (Type) parameterizedType0;
      Type[] typeArray1 = TypeUtils.normalizeUpperBounds(typeArray0);
      assertEquals(1, typeArray1.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = TypeUtils.isAssignable(parameterizedType0, parameterizedType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<String> class0 = String.class;
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn(class0, class0, class0).when(parameterizedType0).getRawType();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = (Type) parameterizedType0;
      typeArray0[1] = (Type) parameterizedType0;
      typeArray0[2] = (Type) class0;
      Type[] typeArray1 = TypeUtils.normalizeUpperBounds(typeArray0);
      assertEquals(0, typeArray1.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<String> class0 = String.class;
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn(class0, class0).when(parameterizedType0).getRawType();
      Class<?> class1 = TypeUtils.getRawType(parameterizedType0, parameterizedType0);
      boolean boolean0 = TypeUtils.isInstance(class1, parameterizedType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      WildcardType wildcardType0 = mock(WildcardType.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = TypeUtils.isAssignable((Type) null, wildcardType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      WildcardType wildcardType0 = mock(WildcardType.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = TypeUtils.isAssignable(wildcardType0, wildcardType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<String> class0 = String.class;
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn((Type[]) null).when(parameterizedType0).getActualTypeArguments();
      doReturn(class0).when(parameterizedType0).getOwnerType();
      doReturn(class0).when(parameterizedType0).getRawType();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = (Type) parameterizedType0;
      Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments(typeArray0[0], class0);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<Integer> class1 = Integer.class;
      Type[] typeArray0 = new Type[3];
      typeArray0[1] = (Type) class0;
      WildcardType wildcardType0 = mock(WildcardType.class, new ViolatedAssumptionAnswer());
      Class<?> class2 = TypeUtils.getRawType(class1, typeArray0[0]);
      Class<?> class3 = TypeUtils.getRawType(typeArray0[1], wildcardType0);
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn((Type[]) null).when(parameterizedType0).getActualTypeArguments();
      doReturn((Type) null).when(parameterizedType0).getOwnerType();
      doReturn(class3, class0, typeArray0[1], (Type) null).when(parameterizedType0).getRawType();
      Map<TypeVariable<?>, Type> map0 = TypeUtils.determineTypeArguments(class2, parameterizedType0);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<String> class1 = String.class;
      Class<?> class2 = TypeUtils.getRawType(class1, class0);
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn(class2).when(parameterizedType0).getRawType();
      Map<TypeVariable<?>, Type> map0 = TypeUtils.determineTypeArguments(class0, parameterizedType0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = TypeUtils.isInstance(object0, (Type) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = TypeUtils.isInstance((Object) null, parameterizedType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Object> class0 = Object.class;
      boolean boolean0 = TypeUtils.isInstance((Object) null, class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Type[] typeArray0 = new Type[0];
      WildcardType wildcardType0 = mock(WildcardType.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(wildcardType0).getUpperBounds();
      Type[] typeArray1 = TypeUtils.getImplicitUpperBounds(wildcardType0);
      assertEquals(1, typeArray1.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Type[] typeArray0 = new Type[0];
      WildcardType wildcardType0 = mock(WildcardType.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(wildcardType0).getLowerBounds();
      Type[] typeArray1 = TypeUtils.getImplicitLowerBounds(wildcardType0);
      assertEquals(1, typeArray1.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Type[] typeArray0 = new Type[1];
      Class<Object> class0 = Object.class;
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(parameterizedType0).getActualTypeArguments();
      doReturn(class0).when(parameterizedType0).getOwnerType();
      doReturn(class0, class0).when(parameterizedType0).getRawType();
      Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments(parameterizedType0);
      assertNotNull(map0);
      
      boolean boolean0 = TypeUtils.typesSatisfyVariables(map0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeUtils.getRawType((Type) null, (Type) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown type: null
         //
         verifyException("org.apache.commons.lang3.reflect.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      WildcardType wildcardType0 = mock(WildcardType.class, new ViolatedAssumptionAnswer());
      Class<?> class0 = TypeUtils.getRawType(wildcardType0, wildcardType0);
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Object> class0 = Object.class;
      boolean boolean0 = TypeUtils.isArrayType(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = TypeUtils.isArrayType((Type) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Type type0 = TypeUtils.getArrayComponentType((Type) null);
      assertNull(type0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Type type0 = TypeUtils.getArrayComponentType(class0);
      assertNull(type0);
  }
}
