# System-Design

**Adapter Design pattern **
In design, adapters are used when we have a class (Client) expecting some type of object and we have an object (Adaptee) offering the same features but exposing a different interface.

To use an adapter:

The client makes a request to the adapter by calling a method on it using the target interface.
The adapter translates that request on the adaptee using the adaptee interface.
Client receive the results of the call and is unaware of adapter’s presence.

![image](https://github.com/shwetank04/System-Design/assets/56911869/05555fea-54a2-42da-a8b6-cf9baf43645c)



**Bridge Design Pattern**
The Bridge design pattern allows you to separate the abstraction from the implementation. It is a structural design pattern. 

There are 2 parts in Bridge design pattern : 

Abstraction
Implementation
This is a design mechanism that encapsulates an implementation class inside of an interface class.  

The bridge pattern allows the Abstraction and the Implementation to be developed independently and the client code can access only the Abstraction part without being concerned about the Implementation part.
The abstraction is an interface or abstract class and the implementer is also an interface or abstract class.
The abstraction contains a reference to the implementer. Children of the abstraction are referred to as refined abstractions, and children of the implementer are concrete implementers. Since we can change the reference to the implementer in the abstraction, we are able to change the abstraction’s implementer at run-time. Changes to the implementer do not affect client code.
It increases the loose coupling between class abstraction and it’s implementation.
![image](https://github.com/shwetank04/System-Design/assets/56911869/87c7b036-b5a7-4941-a5a0-74f074cb20c8)

**Command Design Pattern
**
The command pattern encapsulates a request as an object, thereby letting us parameterize other objects with different requests, queue or log requests, and support undoable operations.

In a command pattern, there is a Command object that encapsulates a request by binding together a set of actions on a specific receiver. It does so by exposing just one method execute() that causes some actions to be invoked on the receiver.

**Composite Design Pattern**
The Composite Pattern has four participants:

Component – Component declares the interface for objects in the composition and for accessing and managing its child components. It also implements default behavior for the interface common to all classes as appropriate.

Leaf – Leaf defines behavior for primitive objects in the composition. It represents leaf objects in the composition.

Composite – Composite stores child components and implements child related operations in the component interface.

Client – Client manipulates the objects in the composition through the component interface.

Client use the component class interface to interact with objects in the composition structure. If recipient is a leaf then request is handled directly. If recipient is a composite, then it usually forwards request to its child components, possibly performing additional operations before and after forwarding.

Real Life example

In an organization, It have general managers and under general managers, there can be managers and under managers there can be developers. Now you can set a tree structure and ask each node to perform common operation like getSalary(). Composite design pattern treats each node in two ways: 1)
![image](https://github.com/shwetank04/System-Design/assets/56911869/e8efa5b6-e0b6-4955-9443-0ac8d960ef28)
