A. Project Overview
• Purpose and description of the Vehicle Management System
The Vehicle management system is a project designed to simulate the management of diverse transportation types and their assigned drivers.
This project contains two abstract classes - Vehicle and its subclass PublicTransport, and seven concrete classes - Car, Motorcycle, Track, Driver, Bus, Subway.
Vehicle has 7 subclasses - 4 direct subclasses and 3 indirect subclasses.
• Summary of inheritance, composition, and abstraction usage
Inheritance - Vehicle has 7 subclasses - 4 direct subclasses and 3 indirect subclasses, PublicTransport has 2 subclasses - Bus and Subway, Car has 1 subclass - ElectricCar. Subclasses inherit all fields and methods of their superclasses.
Composition - Each Vehicle should have a Driver object. But Driver is independent and can be associated with many Vehicles - aggregation.
Abstraction - the Vehicle and PublicTransport classes are abstract and act as a template for subclasses, and they also contain abstract methods so that they must be declared in subclasses.

B. Class Hierarchy
• Explanation of the superclass and subclasses
Vehicle abstract class is a superclass for Car, Motorcycle, Track, PublicTransport, ElectricCar, Bus, Subway. Vehicle contains brand and year. It defines the template for all vehicles via the abstract methods startEngine() and stopEngine().
Direct concrete subclasses of Vehicle - Car adds doors and fuelType. Car is superclass for ElectricCar class.
Motorcycle adds hasSidecar.
Truck adds capacity and numAxles.
PublicTransport abstract class - is a superclass for public transport, has passengerCapacity.
Indirect concrete Subclasses of Vehicle - ElectricCar inherits from Car, adds bCapacity.
Bus inherits from PublicTransport, adds routeNumber.
Subway inherits from PublicTransport adds lineName.

• Description of overridden methods
startEngine(), stopEngine() abstract methods - by overriding every concrete subclass is required to provide these methods.
displayInfo() - each subclass calls super.displayInfo() to print the brand and year, then adds its own unique attributes.

• Explanation of access modifiers used
private - I used for subclass fields without its subclasses to ensure strict encapsulation.
protected - I used for classes that have subclasses so that subclasses can access these fields directly without needing getters/setters, facilitating easier inheritance.

C. Instructions to Compile and Run
To compile and run this program, use the following commands in your terminal:
Compile all classes: javac *.java
Run the driver program: java Main

E. Reflection Section
• How inheritance simplified the design
Thanks to inheritance, the project became more structured and reduced code repetition. It will also make it easier to add classes based on existing ones in the future.
• How method overriding helped customize behavior
Thanks to overriding, each subclass can have its own unique output.
• Challenges faced when using protected and default access modifiers
At first, it wasn't clear where to use private and where to use protected. But after adding subclasses and testing the code, it became clear when to use private and protected.