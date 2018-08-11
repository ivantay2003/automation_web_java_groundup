README FILE

If these list seem too long for you to read, go to the my youtube channel and enjoy the video. The video describe setting up this testing , setting up the script, running the script and the results. Below is the link:
https://youtu.be/AmiNlwON0e8



They are part of the "Automation Fun" Youtube channel which I have developed
https://www.youtube.com/playlist?list=PLFUDS9LewFc6UYkIZ66qfobOWhgE-_bvM


If you have completed this , go to this repo for the next advance module for better design
https://github.com/ivantay2003/automation_web_java_groundup_v2



You can contact me in Linkedin
https://www.linkedin.com/in/ivantay


A) Setup
=========
Pre-requisite software
- Java 1.8
- Eclipse IDE
- TestNG
- Maven

Use Eclipse to import this folder as Project


B) Dependencies
================
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


3) User Test data
=================

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



4) Running the test 
====================
There are 2 ways to run the file.

A) 
You can open the project and press Run

B)Use maven
(My prefer way)

Go to terminal 
- mvn test
 

5) Test Document

Folder:
//Documents

Test Plan in Word format
2 Test Cases (001 / 002) in Excel format


6) User Data 
============

Folder :
UserData

2 Excel format files
Template_UserData
UserData

You can change the data in UserData and the scripts will pick it up.
