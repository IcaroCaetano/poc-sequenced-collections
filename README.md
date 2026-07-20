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

Sequenced Collections não introduzem um novo tipo de coleção. Elas criam uma API unificada para coleções que possuem ordem de encontro (encounter order), eliminando diferenças entre implementações e tornando o código mais expressivo. Em vez de depender de índices, iteradores ou métodos específicos de cada implementação, agora é possível trabalhar de forma consistente com o primeiro e o último elemento, navegar em ordem inversa e manipular as extremidades de coleções ordenadas usando a mesma interface. Isso melhora a legibilidade, reduz código repetitivo e facilita a troca de implementações sem alterar a lógica da aplicação