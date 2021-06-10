# Simulation project
### by Eng_87

#### intro

The aim of the project was to provide working software that could help predict future growth of Sparta Global. the project could be used to help better inform decsions regarding the future. it had to be able to simualte a given duration of time and output the results in a way that is both readable and desired by the product owner

#### Tools and techniques used in the simulation project
the tools used by the team include
- Git for version control.
- GitHub to share progress across the group, track user stories and project progress.
- Draw.io to allow the group to work collabritivly on creating different kinds of documents, such as a UML document.
- Intelli-j to write the software for the project
- JUnit to test the software
- Maven to manage software dependancies
- SOLID principles and OOP values to help design the project in a way that allows it to be scaleable, testable and readable for any future developers that work on the project
- MVC as the project architecture to help co-ordinate classes and varies packages
- JDK 11 as the compilier for the software
- Onedrive to allow multiple people to work on a single document at a time

### User Guide

Upon starting the program the UI will open and have two drop-down boxes that will allow a user to input how they would like to have the data outputted to them, the options are to only show the final month or all month and a option to display the output data or to have it export in a .txt file. After the user confirms there choice by clicking next another screen will display and have another choice of how the user would like to enter the length of time the simulation will run for, the three options are years,months or both. if years or months are selected then a single text box will be there to enter the number of years or months respectivly, if both are selected there will be two text boxes, the leftmost box will be for the years andthe rightmost box for months. once all the selections are made and the timeframe specified the program will procced with the simulatation, once the simulation is complete the data will be presented to the user in the format they selected. The user will then be given two options the leftmost one will restart the program and the left button will exit the program.


#### CentreType

| Return Type  	|     Call Method      	|            Description            	|
|:------------:	|:--------------------:	|:---------------------------------:	|
|  CentreType  	| getRandomCentreType  	| Returns a random type of centre.  	|

#### CourseType

| Return Type  	|     Call Method      	|            Description            	|
|:------------:	|:--------------------:	|:---------------------------------:	|
|  CourseType  	| getRandomCourseType  	| Returns a random type of course.  	|

#### GenerateTrainees

|  Return Type   	|    Call Method    	|                                  Description                                   	|
|:--------------:	|:-----------------:	|:------------------------------------------------------------------------------:	|
| List<trainee>  	| generateTrainees  	| Returns a list of a given number of trainees with a randomly assigned course.  	|
	
#### Trainee
	
	| Return Type  	| Call Method     	| Description                                  	|
|--------------	|-----------------	|----------------------------------------------	|
| CourseType   	| getCourseType() 	| Returns the coursetype of the trainee object 	|
	
#### Bootcamp

| Return Type  	| Call Method                  	| Description                                       	|
|--------------	|------------------------------	|---------------------------------------------------	|
| int          	| getMAX_CAPACITY              	| Returns the Bootcamp’s max capacity.              	|
| Int          	| getNumberOfTraineesInCentre  	| Returns the number of trainees in the centre.     	|
| Int          	| newTraineeIntake             	| Returns a random number of trainees to intake.    	|
| Void         	| addTrainees                  	| Add trainees to the simulation.                   	|
| Boolean      	| isFull                       	| If the Bootcamp is full or not.                   	|
| Void         	| setFull                      	| Set the bootcamp to full.                         	|
| Boolean      	| lowCapacity                  	| If the Bootcamp has less than 10 members or not.  	|
| CentreType   	| getCentreType                	| Returns the centre type.                          	|
  
#### TechCentre
  
  | Return Type  	|         Call Method          	|                     Description                      	|
|:------------:	|:----------------------------:	|:----------------------------------------------------:	|
|     int      	|       getMAX_CAPACITY        	|       Returns the Tech Centre’s max capacity.        	|
|     Int      	| getNumberOfTraineesInCentre  	|    Returns the number of trainees in the centre.     	|
|     Int      	|       newTraineeIntake       	|    Returns a random number of trainees to intake.    	|
|     Void     	|         addTrainees          	|           Add trainees to the simulation.            	|
|   Boolean    	|            isFull            	|          If the Tech Centre is full or not.          	|
|     Void     	|           setFull            	|             Set the Tech Centre to full.             	|
|   Boolean    	|         lowCapacity          	| If the Tech Centre has less than 10 members or not.  	|
|  CentreType  	|        getCentreType         	|               Returns the centre type.               	|
  
#### TrainingHub
  
  | Return Type  	|         Call Method          	|                     Description                      	|
|:------------:	|:----------------------------:	|:----------------------------------------------------:	|
|     int      	|       getMAX_CAPACITY        	|       Returns the Tech Centre’s max capacity.        	|
|     Int      	| getNumberOfTraineesInCentre  	|    Returns the number of trainees in the centre.     	|
|     Int      	|       newTraineeIntake       	|    Returns a random number of trainees to intake.    	|
|     Void     	|         addTrainees          	|           Add trainees to the simulation.            	|
|   Boolean    	|            isFull            	|          If the Tech Centre is full or not.          	|
|     Void     	|           setFull            	|             Set the Tech Centre to full.             	|
|   Boolean    	|         lowCapacity          	| If the Tech Centre has less than 10 members or not.  	|
|  CentreType  	|        getCentreType         	|               Returns the centre type.               	|
  
#### Simulation
  
  | Return Type              	| Call Method    	| Description                                                                                                                                  	|
|--------------------------	|----------------	|----------------------------------------------------------------------------------------------------------------------------------------------	|
| void 	| runSimulation  	| Takes an int input as number if iterations to run and stores the results in the FinalData class    	|
  
#### RandomGenerator
  
  | Return Type    	| Call Method   	| Description                           	|
|----------------	|---------------	|---------------------------------------	|
| List<Trainee>  	| newTrainees   	| Returns a list of random trainees.    	|
| List<Centre>   	| randomCentre  	| Returns a list of random centres.     	|
  
#### Starter
  
  |  Return Type  	|  Call Method  	|                       Description                       	|
|:-------------:	|:-------------:	|:-------------------------------------------------------:	|
|     Void      	|     start     	| The main control method that will start the program.    	|
| List<Centre>  	| randomCentre  	| Returns a list of random centres.                       	|
  
#### UserInput
  
  | Return Type  	| Call Method  	| Description                               	|
|--------------	|--------------	|-------------------------------------------	|
| Int          	| inputInt     	| Returns the number the user has input.    	|
  
#### FinalData
  
  | Return Type              	| Call Method                 	| Description                                                         	|
|--------------------------	|-----------------------------	|---------------------------------------------------------------------	|
| Void                     	| addToClosedCentres          	| Add closed centres to the closedCentres hashmap.                    	|
| HashMap<Integer, int[]>  	| getOpenCentres              	| Returns the HashMap openCentres.                                    	|
| Void                     	| addToOpenCentres            	| Add open centres to the openCentresInput HashMap.                   	|
| HashMap<Integer, int[]>  	| getFullCentres              	| Returns the full centres.                                           	|
| Void                     	| addToFullCentres            	| Add the full centres to the fullCentresInput HashMap.               	|
| HashMap<Integer, int[]>  	| getTraineesTraining         	| Returns the hashmap traineesTraining.                               	|
| Void                     	| addToTraineesTraining       	| Add the trainees in training to the traineesTrainingInput HashMap.  	|
| HashMap<Integer, int[]>  	| getTraineesOnWaitingList    	| Returns the HashMap of waiting trainees.                            	|
| Void                     	| addToTraineesOnWaitingList  	| Add waiting trainees to the traineesOnWaitingListInput HashMap.     	|
  
#### OutputToTXT
  
  | Return Type  	|      Call Method      	|                        Description                        	|
|:------------:	|:---------------------:	|:---------------------------------------------------------:	|
| Void         	| outputToTXT           	| Uses BufferWriter to output to txt file                   	|
| Void         	| outpuToTXTFinalMonth  	| Uses BufferWriter to output the final month to txt file.  	|
  
#### Printer

  | Return Type  	| Call Method                             	| Description                                        	|
|--------------	|-----------------------------------------	|----------------------------------------------------	|
| Void         	| Print(String message)                   	| Prints message                                     	|
| Void         	| Print(HashMap<Integer, int[]>           	| Prints the details of output                       	|
| Void         	| rintFinalMonth(HashMap<Integer, int[]>  	| Prints the details of output for the final month.  	|

  
  
  ### Testing
  
  Testing was done using JUnit 5 to perform automated testing.
  
  #### Tests for BootCamp class: 

getMAX_CAPACITY() - Test should return the max capacity of the bootcamp - This was tested by creating a bootCamp object and checking that the getMAX_CAPACITY() method returns 500 when called 

 

getNumberOfTraineesInCentre() - Test should return the default number of trainees (which is 0) - This was tested by creating a bootCamp object and checking that the getNumberOfTraineesInCentre() method returns 0 if no trainees have been added 

 

getNumberOfTraineesInCentre(), addTrainees() - Test should return the number of trainees after trainees have been added - This was tested by adding trainees to the bootCamp object using the addTrainees() method and checking that the getNumberOfTrainees() method returns the right number of trainees that were added 

 

isFull() - Test should return false when the training centre is not full - This was tested by checking that the isFull() method returns false when the bootCamp object is not full 

 

isFull(), setFull() - Test should return true when the training centre is full – This was tested by using the setFull() method to make the bootCamp full and then checking that the isFull() method returns true 

 

lowCapacity() - Test should return true when the bootcamp's number of trainees is less than 10 for 3 months - This was tested by calling the lowCapacity() method on the bootCamp 3 times to simulate the bootCamp having less than 10 trainees for 3 months in the row. The lowCapacity() method was checked on the third time to make sure it returned true 

 

lowCapacity() - Test should return false when the bootcamp's number of trainees is less than 10 but for less than 3 months – This was tested by calling the lowCapacity() method on the bootCamp twice when it had less than 10 trainees. It was checked that it returned false so that the bootCamps only close when they have low attendance for 3 months in a row 

 

lowCapacity() - Test should return false when the bootcamp's number of trainees is 10 or higher – This was tested by calling the lowCapacity() method on a bootCamp that has more than 10 trainees and checking that it returns false 

 

GetCentreType() - Test should return the correct centre type (bootcamp in this case) - This was tested by calling the getCentreType() method on a bootCamp object and checking that it returns CentreType.BOOTCAMP 

 

GetTrainees() - Test should return the list of current trainees – This was tested by adding a trainee to a bootCamp object and checking that the getTrainees() method returns the trainee in a List 

#### Tests for Printer class: 

Test the Printer.print function can print out a string 

This test tests the Printer.print() method. We used a lambda expression SystemLambda.tapSystemOut to have Printer.print print to a String instead of the console. This was then compared to the string that was imputed using Assertions.assertEquals. 

Test the Printer.print function can print out the final month 

This test tests the Printer.print method that has been overloaded to accept a HashMap. This method then takes values from the hashmap and prints them to the console. We used a lambda expression SystemLambda.tapSystemOut to have Printer.print print to a String instead of the console. This was then compared to what we expected it to print using Assertions.assertEquals. 

#### Tests for Random Generator class: 

TestRandomTraineesWithinBounds 

This test tests that the random trainees that are generated remain within the predeteremined bounds. This was tested by generated a random list of trainees using the RandomGenerator.newtrainees() method then determining the size of this list. If the list is between 10 & 30 (10 & 30 inclusive), then this test will return true. Else it’ll return false. We used Assertions.assertEquals() to compare the result of the test with true.  

TestRandomTraineesOutsideBounds 

This test tests that if the random trainees that are generated are outside of the predetermined bounds, I.e. between 20 and 30 (inclusive). This tests this by generating a random list of trainees using the RandomGenerator.newTrainees() method. Then assessing the size of this list and determining whether the size is between 20 and 30 and assigning the result to a boolean output. This output is then assessed using the Assertions.assertEquals() method comparing the output to ‘true’. 

TestRandomCentre() 

This test simply tests that the randomCentre method returns a value that is not null. This is done by creating a list of randomly generated centres using the RandomGenerator.randomCentre() method. Then, by using a for each loop to cycle through each of the created centres and determine if any of the centres are null, the returningCentre boolean variable is set to false and we break out of the for each loop. (if the centre isnt null, the boolean variable is simply determined as true and the for each loop is continued). After the for each loop is completed or broken out of, an Assertions.assertEquals(true, returningCentre) is run. 

TestRandomIntakeWithinBounds 

	This test tests whether a randomly generated number of trainee intake is 		between the predetermined bounds of 0 & 20 (inclusive). This is done by using 	the RandomGenerator.randomTraineeIntake() method. And running an if statement 	testing that it is infact between those two bounds. If it isnt, a pre-		initialised boolean value is set to false (or kept initialised as true 		otherwise), then the Assertions.assertEquals(true, withinBounds) method is 		run. 

TestRandomIntakeOutsideBounds 

This is an identical test to the above, however, it tests whether the randomly generated trainee intake value is outside of the bounds of 0 & 20 (inclusive). It sets the result of that if statement to a boolean value, then that boolean value is placed within the Assertions.assertEquals(true, outsideBounds) method which is run. 

#### Tests for TechCentre class: 

	getMAX_CAPACITY() - Test should return the max capacity of the techCentre - This was tested by creating a techCentre object and checking that the getMAX_CAPACITY() method returns 200 when called 

 

getNumberOfTraineesInCentre() - Test should return the default number of trainees (which is 0) - This was tested by creating a techCentre object and checking that the getNumberOfTraineesInCentre() method returns 0 if no trainees have been added 

 

getNumberOfTraineesInCentre(), addTrainees() - Test should return the number of trainees after trainees have been added - This was tested by adding trainees to the techCentre object using the addTrainees() method and checking that the getNumberOfTrainees() method returns the right number of trainees that were added 

 

isFull() - Test should return false when the training centre is not full - This was tested by checking that the isFull() method returns false when the techCentre object is not full 

 

isFull(), setFull() - Test should return true when the training centre is full – This was tested by using the setFull() method to make the techCentre full and then checking that the isFull() method returns true 

 

lowCapacity() - Test should return true when the bootcamp's number of trainees is lower than 10 – This was tested by calling the lowCapacity() method on a techCentre that has less than 10 trainees and checking that it returns true. 

 

GetCentreType() - Test should return the correct centre type (bootcamp in this case) - This was tested by calling the getCentreType() method on a techCentre object and checking that it returns CentreType.TECHCENTRE 

 

GetTrainees() - Test should return the list of current trainees – This was tested by adding a trainee to a techCentre object and checking that the getTrainees() method returns the trainee in a List 

 

#### Tests for FinalData class: 

Test adding and retrieving from closed centres 

Both methods .addToClosedCentres and .getClosedCentres were tested. A dummy value was inserted using .addToClosedCentres and was then retreived using .getClosedCentres. This retrieved value was then compared to the original value that was inserted using Assertions.assertEQuals. Due to the fact that this test would only have passed if both methods were working we were able to test both methods in one test. 

Test adding and retrieving from open centres 

Both methods .addToOpenCentres and .getOpenCentres were tested. A dummy value was inserted using .addToOpenCentres and was then retreived using .getOpenCentres. This retrieved value was then compared to the original value that was inserted using Assertions.assertEQuals. Due to the fact that this test would only have passed if both methods were working we were able to test both methods in one test. 

 

Test adding and retrieving from full centres 

Both methods .addToFullCentres and .getFullCentres were tested. A dummy value was inserted using .addToFullCentres and was then retreived using .getFullCentres. This retrieved value was then compared to the original value that was inserted using Assertions.assertEQuals. Due to the fact that this test would only have passed if both methods were working we were able to test both methods in one test. 

 

Test adding and retrieving from trainees training 

Both methods .addTotraineesTraing and .getTraineesTraining were tested. A dummy value was inserted using .addToTraineesTraining and was then retreived using .getTraineesTraining. This retrieved value was then compared to the original value that was inserted using Assertions.assertEQuals. Due to the fact that this test would only have passed if both methods were working we were able to test both methods in one test. 

 

Test adding and retrieving from trainees on waiting list 

Both methods .addToTraineesOnWaitingList and .getTraineesOnWaitingList were tested. A dummy value was inserted using .addToTraineesOnWaitingList and was then retreived using .getTraineesOnWaitingList. This retrieved value was then compared to the original value that was inserted using Assertions.assertEQuals. Due to the fact that this test would only have passed if both methods were working we were able to test both methods in one test. 

 

#### Tests for Trainee class: 

Test that trainee.getCourseType returns course type that was inputted when creating the Trainee object 

This test tests the trainee.getCourseType. This tests that courseType that has been assigned to each trainee is the same as the course type that is returned when the trainee.getCourseType method is called.This was done by creating a dummy trainee object and setting it’s course to CSharp. This was then compared using Assertions.assertEqualsCSharps 

Tests for TrainingHub class: 

getMAX_CAPACITY() - Test should return the max capacity of the TrainingHub - This was tested by creating a trainingHub object and checking that the getMAX_CAPACITY() method returns 100 when called 

 

getNumberOfTraineesInCentre() - Test should return the default number of trainees (which is 0) - This was tested by creating a trainingHub object and checking that the getNumberOfTraineesInCentre() method returns 0 if no trainees have been added 

 

getNumberOfTraineesInCentre(), addTrainees() - Test should return the number of trainees after trainees have been added - This was tested by adding trainees to the trainingHub object using the addTrainees() method and checking that the getNumberOfTrainees() method returns the right number of trainees that were added 

 

isFull() - Test should return false when the training centre is not full - This was tested by checking that the isFull() method returns false when the trainingHub object is not full 

 

isFull(), setFull() - Test should return true when the training centre is full – This was tested by using the setFull() method to make the trainingHub full and then checking that the isFull() method returns true 

 

lowCapacity() - Test should return true when the bootcamp's number of trainees is lower than 10 – This was tested by calling the lowCapacity() method on a trainingHub that has less than 10 trainees and checking that it returns true. 

 

GetCentreType() - Test should return the correct centre type (bootcamp in this case) - This was tested by calling the getCentreType() method on a trainingHub object and checking that it returns CentreType.TRAININGHUB 

 

GetTrainees() - Test should return the list of current trainees – This was tested by adding a trainee to a trainingHub object and checking that the getTrainees() method returns the trainee in a List 

 

#### Tests for UserInput class: 

Test to see if scanner can read in an int 

This test tests the UserInput method. A dummy user input was created using  

ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes()); 

	This was then inputted to UserInput and Assertions.assertEquals was used to 	check if the input returned is the same as the inputted input.
  
