# System-Design
**Adapter Design pattern **
In design, adapters are used when we have a class (Client) expecting some type of object and we have an object (Adaptee) offering the same features but exposing a different interface.

To use an adapter:

The client makes a request to the adapter by calling a method on it using the target interface.
The adapter translates that request on the adaptee using the adaptee interface.
Client receive the results of the call and is unaware of adapter’s presence.

![image](https://github.com/shwetank04/System-Design/assets/56911869/87c7b036-b5a7-4941-a5a0-74f074cb20c8)
