https://github.com/Frontend-mini-projects/sanity_blog

<project xmlns="https://maven.apache.org/POM/4.0.0" xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="https://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.herokuapp.theinternet</groupId>
  <artifactId>PositiveTest</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <name>MCA_Automated_Test</name>
  <description>MCA EXP3</description>
  
  <!-- Maven Dependencies -->
  <!-- SureFire -->
  <!-- Compiler -->
  <!-- TestNG -->
  <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependencies>
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.17.0</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.9.0</version>

</dependency>


</dependencies>
    
  <build>

    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.12.1</version>
        <configuration>
          <source>21</source>
          <target>21</target>
        </configuration>
      </plugin>
       <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>3.2.5</version>
          </plugin>
      
    </plugins>

  </build>

</project>
