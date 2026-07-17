# POC Sequence Collections

## Structure

## The Goal of POC

Show

- SequencedCollection;
- SequencedSet;
- SequencedMap;
- getFirst();
- getLast();
- addFirst();
- addLast();
- removeFirst();
- removeLast();
- reversed();
- firstEntry();
- lastEntry();
- pollFirstEntry();
- pollLastEntry();

````plantuml
src
└── main
    └── java
        └── com.project.poc_sequenced_collections
            │
            ├── Main.java
            ├── examples
            │      ListExample.java
            │      SetExample.java
            │      MapExample.java
            │      QueueExample.java
            │      ReverseExample.java
            │
            └── dto
                   Employee.java
````

### ListExample

- SequencedCollection
- getFirst
- getLast
- addFirst
- addLast
- removeFirst
- removeLast

#### Output

````plantuml
Joao
Pedro
[Carlos, Joao, Maria, Pedro, Jose]
[Joao, Maria, Pedro]
````

### SetExample

SequencedSet is a subinterface of SequencedCollection and Set. It standardizes the access, 
addition, and removal of elements in collections that have a defined order but do not allow 
duplicates.

- SequencedSet
- getFirst
- getLast

#### Output

````plantuml
10
40
````

### SequencedMap

#### Output

````plantuml
1=Ana
4=Maria
````

### ReversedExample

#### Output

````plantuml
Viena
Londres
Roma
Paris
````

### NavigationExample

- pollFirstEntry
- pollLastEntry