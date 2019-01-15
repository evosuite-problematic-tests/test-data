/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 11:25:34 GMT 2018
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.LookupTranslator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LookupTranslator_ESTest extends LookupTranslator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CharSequence[] charSequenceArray0 = new CharSequence[7];
      charSequenceArray0[0] = (CharSequence) "FFFFFFFF";
      LookupTranslator lookupTranslator0 = new LookupTranslator((CharSequence[][]) null);
      String string0 = lookupTranslator0.translate(charSequenceArray0[0]);
      assertEquals("FFFFFFFF", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CharSequence[][] charSequenceArray0 = new CharSequence[2][6];
      CharSequence[] charSequenceArray1 = new CharSequence[5];
      CharBuffer charBuffer0 = CharBuffer.allocate(857);
      charSequenceArray1[0] = (CharSequence) charBuffer0;
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      charSequenceArray1[1] = (CharSequence) stringBuffer0;
      charSequenceArray0[0] = charSequenceArray1;
      charSequenceArray0[1] = charSequenceArray1;
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray0);
      // Undeclared exception!
      try { 
        lookupTranslator0.translate(charSequenceArray1[1], (-1472), (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1472
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CharSequence[][] charSequenceArray0 = new CharSequence[2][3];
      CharSequence[] charSequenceArray1 = new CharSequence[3];
      CharBuffer charBuffer0 = CharBuffer.allocate(1);
      charSequenceArray1[0] = (CharSequence) charBuffer0;
      char[] charArray0 = new char[0];
      CharBuffer charBuffer1 = CharBuffer.wrap(charArray0);
      charSequenceArray0[0] = charSequenceArray1;
      CharSequence[] charSequenceArray2 = new CharSequence[2];
      charSequenceArray2[0] = (CharSequence) charBuffer1;
      charSequenceArray0[1] = charSequenceArray2;
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray0);
      StringWriter stringWriter0 = new StringWriter(377);
      int int0 = lookupTranslator0.translate((CharSequence) charBuffer0, 1, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CharSequence[][] charSequenceArray0 = new CharSequence[2][3];
      CharSequence[] charSequenceArray1 = new CharSequence[3];
      CharBuffer charBuffer0 = CharBuffer.allocate(1);
      charSequenceArray1[0] = (CharSequence) charBuffer0;
      char[] charArray0 = new char[0];
      CharBuffer charBuffer1 = CharBuffer.wrap(charArray0);
      charSequenceArray0[0] = charSequenceArray1;
      CharSequence[] charSequenceArray2 = new CharSequence[2];
      charSequenceArray2[0] = (CharSequence) charBuffer1;
      charSequenceArray2[1] = (CharSequence) "1";
      charSequenceArray0[1] = charSequenceArray2;
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray0);
      StringWriter stringWriter0 = new StringWriter(377);
      int int0 = lookupTranslator0.translate((CharSequence) charBuffer0, 1, (Writer) stringWriter0);
      assertEquals("1", stringWriter0.toString());
      assertEquals(0, int0);
  }
}
