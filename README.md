# Food Truck - Week 2 Skill Distillery

# Overview (what the project is, how to do it, how to run it)


- This project is to receive user input of different types of food trucks, along with the type of food each food truck offers and the overall rating of the food truck, from 1-5, meaning quality.
- The user is also able to have the program generate a list of all the food trucks they entered in.
- The user is also able to have the program generate the average rating of the food trucks, from 1-5.
- The user is also able to have the program generate the highest rated food truck.
- This project was created with a Food Truck class as well as a Food Truck Application class with a main method.


- The user will first have to enter in the information of all food trucks - food truck name, type of food served and rating - they can input up to five food trucks.
- Once these food trucks are entered in by the user, they are stored into the foodTrucks array.
- Then, the user will be able to choose from the menu, made in a while loop, which has the option to view all food trucks and information that was inputted along with a unique food truck ID, can view the average rating of the food trucks and can also view the highest rated food truck. The user is able to view the menu again due to the while loop and choose a different option based on what they would like to view next.
- If the user would like to exit the program, they can enter in option number 4 to quit.
- Option 1 on the menu will list all the food trucks. When this method is called, a for loop goes through the array of Food Trucks and grabs all the properties that were inputted by the user that were saved into the constructor via getter and setters. This is printed out in the form of a toString in order to display our objects and their properties in the form of a string.
- Option 2 on the menu will calculate the average of all food trucks entered in the array. It does so by using a for loop to go through all the array spots. The getters for the food truck rating's which are in the Food Truck class are used to send the food truck rating of a specific spot to the application in order to calculate this based on the number of food truck objects in the array.
- Option 3 on the menu will show the food truck with the highest rating. When option 2 is selected, the method to find the highest rated food truck is called. We will be using a for loop to get this from the objects in the array that were inputted. The for loop will check for each food truck object's rating with the help of the getter from the Food Truck class.
- Option 4 will end the food truck application and program.

# Technologies used
- Eclipse
- Java
- Atom
- Terminal Commands
- GitHub/Git

# Lessons learned
- This project helped me understand the interaction between an object class to a class such as the food truck application class that ran the program.
- Arrays have not been the easier for me to grasp, but this project did increase my Understanding. A project that was done in class last week by the name of Deaf Granny now seems more manageable.
- Methods have also been a challenge for me and the different ways they can be used to create cleaner code. On the last project, I was able to put all of my code in the main but should have taken that time to practice methods. This project required methods so it helped my understanding of them immensely.
- Getters and setters were interesting to put to use in this project but since this is a relatively new concept I still need to increase my understanding on these.
- I can never get enough practice with all types of loops.
- This project was overall tough to get through. I second guessed myself many times but it all came together with some research as well as much appreciated assistance from my peers. The remote learning aspect during which most material on this project was taught has definitely made this more challenging for me but a challenge I am excited to put in the extra work towards and succeed.
