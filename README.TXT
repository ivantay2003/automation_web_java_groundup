README FILE

A)
Setup
Pre-requisite software
- Java 1.8
- Eclipse IDE
- TestNG
- Maven

Use Eclipse to import this folder as Project


B)
Refer to pom.xml for dependencies. You will need this otherwise you will need to install the libraries manually 

MAKE SURE THIS IS IN POM.XML
=============================

 <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.11</version>
      <scope>test</scope>
    </dependency>
    <dependency>
  <groupId>org.testng</groupId>
  <artifactId>testng</artifactId>
  <version>6.8</version>
  <scope>test</scope>
    </dependency>

	<dependency>
	    <groupId>org.seleniumhq.selenium</groupId>
	    <artifactId>selenium-java</artifactId>
	    <version>3.12.0</version>
	</dependency>
 
	<dependency>
		<groupId>com.aventstack</groupId>
		<artifactId>extentreports</artifactId>
		<version>3.1.2</version>
	</dependency>    
     <dependency>
            <groupId>com.googlecode.json-simple</groupId>
            <artifactId>json-simple</artifactId>
            <version>1.1.1</version>
      </dependency>
    <dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi</artifactId>
    <version>3.17</version>
</dependency>
<dependency>
    <groupId>commons-codec</groupId>
    <artifactId>commons-codec</artifactId>
    <version>1.11</version>
	</dependency>
		<dependency>
	    <groupId>org.apache.commons</groupId>
	    <artifactId>commons-collections4</artifactId>
	    <version>4.2</version>
	</dependency>
	
	<dependency>
	   <groupId>org.apache.poi</groupId>
	   <artifactId>poi-ooxml</artifactId>
	   <version>3.15</version>
	</dependency>
  </dependencies>


3)
User Test data

User test data is located in  /UserData

There are currently a few excel xlsx files
UserData.xlsx
Tempate_UserData.xlsx

Each excel file contains a single test data. You can create as many test data by having different excel files.


Under test.java 
Change the file name in this method

 @BeforeTest
  public void beforeTest() {
	  
	  config = new Configuration();

	  filename =  config.getUserDataPath()+"UserData.xlsx"; // CHANGE THIS IF YOU WANT TO READ DIFFERENT USER DATA !

.
.
.
.
}



4) 
Running the test 

There are 2 ways to run the file.

1) 
You can open the project and press Run

2)Use maven
(My prefer way)

Go to terminal 
- mvn test
 

