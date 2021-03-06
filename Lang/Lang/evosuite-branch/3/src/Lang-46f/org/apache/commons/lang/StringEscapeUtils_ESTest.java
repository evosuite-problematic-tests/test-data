/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 13:43:49 GMT 2019
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.commons.lang.StringEscapeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringEscapeUtils_ESTest extends StringEscapeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("}d#iAN~!R");
      assertEquals("}d#iAN~!R", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJava((Writer) stringWriter0, "The Writer must not be null.");
      assertEquals("The Writer must not be null.", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, string0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("FI5!/");
      assertNotNull(string0);
      assertEquals("FI5!/", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJavaScript((Writer) null, "nabla");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("\"`ta@;:ocyN\t(9u)S1");
      assertEquals("\\\"`ta@;:ocyN\\t(9u)S1", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("VZ>'FiJEu2`N");
      assertEquals("VZ>'FiJEu2`N", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("Fv)9w'a90Ry");
      assertEquals("Fv)9w\\'a90Ry", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, "i/ ,!#bV?y2fD\"/0vH");
      assertEquals("i\\/ ,!#bV?y2fD\\\"\\/0vH", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript((Writer) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      String string0 = "9x\\u4,#.k?+|)6";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 4,#.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "z4@os}e#\"6`O= <X?N");
      assertEquals("z4@os}e#\"6`O= <X?N", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      String string0 = "\\u000";
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("8G\\ybmdh7k6_8o");
      assertEquals("8Gybmdh7k6_8o", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava(";=<g\"+");
      assertEquals(";=<g\"+", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("Fv)9w'a90Ry");
      assertEquals("Fv)9w'a90Ry", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeHtml((Writer) null, "pnXXF*$!3;");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("6kO-!@D_Qh>#");
      assertNotNull(string0);
      assertEquals("6kO-!@D_Qh>#", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeHtml((Writer) null, "ax5;&");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "z4@os}e#\"6`O= <X?N");
      assertEquals("z4@os}e#&quot;6`O= &lt;X?N", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, "@\"yXHR9Z%");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("a~E&\"S");
      assertEquals("a~E&amp;&quot;S", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeXml((Writer) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("pnXXF*$!3;");
      assertEquals("pnXXF*$!3;", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("21F'VQYkLS");
      assertEquals("21F''VQYkLS", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeCsv("c(c,Fg%");
      assertEquals("\"c(c,Fg%\"", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeCsv("@JqDxooA[/~y*3yjk");
      assertEquals("@JqDxooA[/~y*3yjk", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.escapeCsv((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeCsv((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeCsv((Writer) stringWriter0, "\"c(c,Fg%\"");
      assertEquals("\"\"\"c(c,Fg%\"\"\"", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeCsv("\"c(c,Fg%\"");
      assertNotNull(string0);
      assertEquals("c(c,Fg%", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeCsv((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(16);
      StringEscapeUtils.unescapeCsv((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeCsv((Writer) stringWriter0, "");
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeCsv((Writer) stringWriter0, "@JqDxooA[/~y*3yjk");
      assertEquals("@JqDxooA[/~y*3yjk", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeCsv("\" Ugd6>]{A'37t>%e-Z");
      assertEquals("\" Ugd6>]{A'37t>%e-Z", string0);
  }
}
