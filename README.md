# SortManager 
## Requirements:

You will be building a program that will allow a user to sort a randomised array. The general flow of the application is:

- The user is presented with a number of sort algorithms to choose from.
- Decision is given via the command line (using ```Scanner```).
- The program will then ask for the length of an array again via the command line.
- The program should then output:
    - The unsorted randomly generated array
    - The sort algorithm to be used
    - The sorted array after the algorithm has been executed
    - The time taken

You are required to test both the functionality of the program and the performance of the algorithms (speed tests).

### Phase 1
- Write a program which will take an array of ```int```s and sort it using a [bubble sort](https://en.wikipedia.org/wiki/Bubble_sort) algorithm.
- Add the option to use a [merge sort](https://en.wikipedia.org/wiki/Merge_sort) algorithm instead.
- Include JUnit tests for this and all subsequent phases (and all subsequent projects for the rest of time).

### Phase 2
- Update your project to use MVC and start to incorporate some of the design principles discussed earlier in the course (OOP, SOLID, design patterns).
- Create classes which implements MVC, including ```SortManager``` (controller) and ```DisplayManager``` (view) classes.
- The code should include a basic factory pattern to determine which sorter to use.
- Make sure packages are created properly and the structure follows the MVC pattern.
- The code should separate the business logic (```sorters```) from the ```display``` to show MVC in action.
- ```display``` - Classes that deal with printing to the console window.
- ```exceptions``` - Any custom exceptions which will be thrown.
- ```sorters``` - The sort algorithms with Sorter interface for the Factory pattern.
- (Within ```sorters```) ```binaryTree``` - Logic for the binary tree including contract interface (see Phase 4).
- ```start``` - Factory pattern for sorters, loader for run logic and Java ```main``` method.
- Create an ```interface``` which both sort classes can implement and make sure your application uses this interface where possible.

### Phase 3
- Add logging code into the Sort Manager project.
- Set up ```log4j``` in the project and add a ```.properties``` file.
- Create logs at different levels and fully test the resulting output.
- Have output going to a log file created in the resources directory.
- Ensure there are meaningful log messages added to the project and that they reflect the needs of the levels for which they are set.


### Phase 4
- Integrate a new class to implement a [tree sort](https://en.wikipedia.org/wiki/Tree_sort), using a [binary search tree](https://en.wikipedia.org/wiki/Binary_search_tree), so that the tree sort can be called in the same way as the other sort algorithms.
- The new class should implement the current ```Sorter interface```.
- Add code that calls the BST and passes in the array that will be used to construct the tree and then return a sorted array.
- Use the Adapter design pattern for this step.
- Implement a nested class to represent a node in the tree.

### Phase 5
- Add timing information to the project and allow the user to select multiple algorithms to compare their performance.

**Quick rundown**:

_My program idealizes an array length 10_
I am made a randomer control class that is responsible for randomising the values inside the array then the program askes the users what method they would like to use (bubble or merge) using the scanner and it gets stored into a string.
Afterwards the string will check if the user used B or M and calls for the appropriate method.
After the array is sorted, it is printed to console for user to see and analyse.
**_KEY
B = Bubble method
M = Merge method_**
I also made a timer that starts before you start the sort and end of it which shows the time the algorithm took to run in nanoseconds.







