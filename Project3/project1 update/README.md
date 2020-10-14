# 项目名称
# 团队成员
# What did we do：
- We realized the daily operation of a zoo through java face object programming，including zookeeper commuting, feeding and training different animals, animals eating, sleeping and other functions, and realized a system that simulates zoo operation.


- Among them, a large number of Java object-oriented programming ideas are used, and the features of inheritance, encapsulation, polymorphism and other object-oriented features are applied to the project, which makes the whole system low in coupling and clear in structure.

# Code structure:

1. Animal

    1. Canidae
        1. Dog
    2. Feline
        1. Cat

2. Employee

    1. Zookeeper
    
# Project comment
- In the code, the Animal class is established to implement some common attributes and methods of animals, such as eating and sleeping. Then two animals, Canidae and Feline, were established. These two classes extend Animal class, and implemented exercise methods for these two animals. Subsequently, specific animals belonging to these two animal categories were established, Cat and Dog, and the animal speek method was implemented in them.


- The Employee class is an abstract class, which contains abstract methods, which are methods that any zookeeper should have. Then the class Zookeeper was established, and the abstract methods in the Employee class were implemented in it.