# Simulation project
### by Eng_87

#### intro

The aim of the project was to provide working software that could help predict future growth of Sparta Global. the project could be used to help better inform decsions regarding the future. it had to be able to simualte a given duration of time and output the results in a way that is both readable and desired by the product owner

#### Tools and techniques used in the simulation project
the tools used by the team include
- git for version control.
- github to share progress across the group, track user stories and project progress.
- draw.io to allow the group to work collabritivly on creating different kinds of documents, such as a UML document.
- intelli-j to write the software for the project
- JUnit to test the software
- maven to manage software dependancies
- SOLID principles and OOP values to help design the project in a way that allows it to be scaleable, testable and readable for any future developers that work on the project
- MVC as the project architecture to help co-ordinate classes and varies packages
- JDK 11 as the compilier for the software
- onedrive to allow multiple people to work on a single document at a time

### User Guide

upon starting the program the ui will open and have two drop-down boxes that will allow a user to input how they would like to have the data outputted to them, the options are to only show the final month or all month and a option to display the output data or to have it export in a .txt file. after the user confirms there choice by clicking next another screen will display and have another choice of how the user would like to enter the length of time the simulation will run for, the three options are years,months or both. if years or months are selected then a single text box will be there to enter the number of years or months respectivly, if both are selected there will be two text boxes, the leftmost box will be for the years andthe rightmost box for months. once all the selections are made and the timeframe specified the program will procced with the simulatation, once the simulation is complete 


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
