/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 23:44:56 GMT 2019
 */

package org.joda.time.tz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.DateTimeZoneBuilder;
import org.joda.time.tz.ZoneInfoCompiler;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ZoneInfoCompiler_ESTest extends ZoneInfoCompiler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      zoneInfoCompiler_DateTimeOfYear0.addCutover(dateTimeZoneBuilder0, 2713);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear();
      // Undeclared exception!
      try { 
        zoneInfoCompiler_DateTimeOfYear0.addRecurring((DateTimeZoneBuilder) null, "=1g hO;b", 0, 2050, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler$DateTimeOfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      String string0 = zoneInfoCompiler_DateTimeOfYear0.toString();
      assertEquals("MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[0];
      boolean boolean0 = ZoneInfoCompiler.verbose();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ZoneInfoCompiler.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      Map<String, DateTimeZone> map0 = zoneInfoCompiler0.compile((File) null, (File[]) null);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseDayOfWeek("\nToYear: ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"
         // ToYear: \" for dayOfWeek is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-dst";
      try { 
        ZoneInfoCompiler.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-?";
      ZoneInfoCompiler.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-src";
      stringArray0[1] = "-src";
      stringArray0[2] = "-src";
      stringArray0[3] = "-src";
      stringArray0[4] = "-src";
      stringArray0[5] = "-src";
      stringArray0[6] = "y";
      stringArray0[7] = "-src";
      try { 
        ZoneInfoCompiler.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear1 = ZoneInfoCompiler.getStartOfYear();
      assertSame(zoneInfoCompiler_DateTimeOfYear1, zoneInfoCompiler_DateTimeOfYear0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Chronology chronology0 = ZoneInfoCompiler.getLenientISOChronology();
      Chronology chronology1 = ZoneInfoCompiler.getLenientISOChronology();
      assertSame(chronology1, chronology0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(".akxF4", true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      ZoneInfoCompiler.writeZoneInfoMap(dataOutputStream0, hashMap0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = ".akxF4";
      stringArray0[1] = ".akxF4";
      stringArray0[2] = ".akxF4";
      stringArray0[3] = "Mx&rhcQ(I/[@ wvc";
      stringArray0[4] = ".akxF4";
      stringArray0[5] = ".akxF4";
      stringArray0[6] = ".akxF4";
      stringArray0[7] = ".akxF4";
      try { 
        ZoneInfoCompiler.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("?%e7:!z>");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      TimeZone timeZone0 = TimeZone.getTimeZone("4^9$+ +]0CmTp");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      hashMap0.put("4^9$+ +]0CmTp", dateTimeZone0);
      ZoneInfoCompiler.writeZoneInfoMap(dataOutputStream0, hashMap0);
      assertEquals(28L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("/FG6+5 zNi*xC", false);
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      hashMap0.put("org.joda.time.field.BaseDurationField", dateTimeZone0);
      hashMap0.put("g+QIF)WP7x08aDN\"C", dateTimeZone0);
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.writeZoneInfoMap((DataOutputStream) null, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseYear("minimum", (-1982292596));
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseYear("min", (-1913044533));
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseYear("Fkto{Vj@", 149);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"fkto{vj@\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseYear("max", 7);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseYear("only", 1334);
      assertEquals(1334, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = ZoneInfoCompiler.parseOptional("%N");
      assertEquals("%N", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseTime("01?jGX7zU)");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseTime("-01?jGX7zU)");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseTime("D");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // D
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('G');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('V');
      assertEquals('w', char0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('S');
      assertEquals('s', char0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('U');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('W');
      assertEquals('w', char0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('Z');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('g');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('s');
      assertEquals('s', char0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('u');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('w');
      assertEquals('w', char0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('z');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("/FG6+5 zNi*xC", false);
      boolean boolean0 = ZoneInfoCompiler.test("/FG6+5 zNi*xC", dateTimeZone0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(7);
      boolean boolean0 = ZoneInfoCompiler.test("$amiwxmvmf^e7", dateTimeZone0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "$amiwxmvmf^e7";
      stringArray0[1] = "$amiwxmvmf^e7";
      stringArray0[2] = "$amiwxmvmf^e7";
      stringArray0[3] = "$amiwxmvmf^e7";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("$amiwxmvmf^e7");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "$amiwxmvmf^e7");
      stringArray0[4] = "$amiwxmvmf^e7";
      stringArray0[5] = "$amiwxmvmf^e7";
      ZoneInfoCompiler.main(stringArray0);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      MockFile mockFile0 = new MockFile("\nFromYear: ", "`L}l*g)N#wBT");
      File[] fileArray0 = new File[0];
      Map<String, DateTimeZone> map0 = zoneInfoCompiler0.compile(mockFile0, fileArray0);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      MockFile mockFile0 = new MockFile("");
      File[] fileArray0 = new File[0];
      Map<String, DateTimeZone> map0 = zoneInfoCompiler0.compile(mockFile0, fileArray0);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      File file0 = MockFile.createTempFile("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", "v~!Me:!g!");
      MockFile mockFile0 = new MockFile(file0, "v~!Me:!g!");
      File[] fileArray0 = new File[0];
      try { 
        zoneInfoCompiler0.compile(mockFile0, fileArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Destination directory doesn't exist and cannot be created: /tmp/org.joda.time.format.PeriodFormatterBuilder$FieldFormatter0v~!Me:!g!/v~!Me:!g!
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      File file0 = MockFile.createTempFile("Unknown line: ", "Unknown line: ");
      File[] fileArray0 = new File[6];
      fileArray0[0] = file0;
      fileArray0[1] = file0;
      fileArray0[2] = file0;
      fileArray0[3] = file0;
      fileArray0[4] = file0;
      fileArray0[5] = file0;
      try { 
        zoneInfoCompiler0.compile(file0, fileArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Destination is not a directory: /tmp/Unknown line: 0Unknown line: 
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      StringReader stringReader0 = new StringReader("Invalid encoding");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 2837);
      char[] charArray0 = new char[7];
      bufferedReader0.read(charArray0);
      zoneInfoCompiler0.parseDataFile(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringTokenizer stringTokenizer0 = new StringTokenizer("", "", false);
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringTokenizer stringTokenizer0 = new StringTokenizer("3lvM&[O~Bv(4Nt!1p", "?J?_`?AJ`Ihl99-s6w`", false);
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = null;
      try {
        zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // vM&[O~Bv(4Nt!1p
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler$DateTimeOfYear", e);
      }
  }
}
