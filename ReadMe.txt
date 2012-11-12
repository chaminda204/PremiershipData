This project addresses the following problem
http://codekata.pragprog.com/2007/01/kata_four_data_.html

This contains the set of instructions required to build and run Premier League Application.

Building the Project.
====================

Pre-requisites
--------------
JDK 1.6.x or higher
Maven 2 or higher
set java_home and m2_home.
eClipse 3.5 or higher

Steps:
------
1 - Open the PremierLeague.zip file and extract information.
2 - Go to the project home directory of PremierLeague, and run 
    $ mvn clean package
    
3 - Import project to your IDE 
	a) To import your project into eclipse IDE
			$ mvn eclipse:eclipse
 			Import the project into eclipse IDE (Existing Projects in Workspace > Browse and locate the extracted "PremierLeague" folder). 
    


Running the application.
========================
1. Go to target folder and run
	Java -jar premierLeague.jar
	
2. Import the project to Eclipse IDE and Run the Bootstrap.java.

       
       


