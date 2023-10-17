# Design Patterns

* Represent the best practices followed by experienced software developers.
* Targeted to solve the problems of object creation and integration.
* Design pattern act as template for real world problems.
* 1994, 4 peoples publised book (Gang of four) - **Design Patterns - Elements of reusable object-oriented sw**
  * Pros and cons of OOP
  * 23 design patterns


* **Creational** : Object creation and initialization  
  * Singleton
  * Factory
* **Structural** : Decoupling interface & implementation
* **Behavioural** : Communication BETWEEN classes and objects. 


## Creational Pattern

* Deal with object creation mechanism
* create objects based on use case
* reduce the complexity of object creation
* Define the best way to reuse it.


  * **Abstract Factory** - _create an instance of several families of classes_
  * **Builder** - _build complex object from scratch_
  * **Factory** - _Create an instance of several derived classes_
  * **Object pool** - _reuse existing objects_
  * **Prototype** - _copy or clone the existing objects_
  * **Singleton** - _only one instance can be created_


### Singleton Design Pattern

* Only one object creation
* If we want to the common things from the object, these use singleton design patterns.
  * Ex: <br/>
        Student lenin = new Student(1,100); <br />
        Student chelo = new Student(2,100);
  
  **Every object has specific thing, so no singleton.**

REAL WORLD Examples
1. Java course by Rakesh
   * One object Rakesh
   * All the viewers view to get information from the rakesh object.

2. Runtime class



### Factory design pattern

* Falls under creational pattern.
* Create objects without exposing the creation logic to the client.

Ex 1: Phone Manufacturer OS kekar , OS Factory phone ku aetha maari OS kodukum.
    Iphone - IOS, Samsung - Android, Nokia - Windows. Itha OS factory pathukollum. Manufacturer atha pakamatar.
    Thevalla solapona.

2: Client vanthu Best UI developer kekar, Manager kita Developers set ondu iruku, athukula iruka devs kula. avar best a choice
    panni kodupar. but client dont know about them. 



### Abstract Factory design pattern - Hiding

* Super factory which creates other factories
* Provides interface for creating objects (related or dependent) without specifying the concrete class.
* Abstract means hiding, Factory - provide object based on type 

Animal - Wild animal Factory, Domestic Animal Factory
Wild animal - Animal--> Lion, Tiger
Domestic animal - Animal--> Cat, Dog

* Using JAVA Library ,Reading XML file using DOM parser.

`DocumentBuilderFactory docFact = DocumentBuilderFactory.newInstance();
 DocumentBuilderFactory factory = docFact.newDocumentBuilder();
 DocumentBuilderFactory doc = factory.parse(itc);
`

like a tree

### Object Pool Design Pattern

* Creational design pattern
* Reuse the objects that are expensive to create
* Objects in pool have a lifecycle ccreation, validation and destroy.
