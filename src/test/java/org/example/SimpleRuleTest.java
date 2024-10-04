package org.example;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

@AnalyzeClasses(packages = "org.example")
public class SimpleRuleTest {
  @ArchTest
  public static ArchRule simpleRule = noClasses().should().beAnnotatedWith(Deprecated.class);
}
