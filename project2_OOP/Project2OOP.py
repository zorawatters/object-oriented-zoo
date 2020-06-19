#!/usr/bin/env python
# coding: utf-8

# In[1]:


import numpy as np
import abc


# In[2]:


class Zoo:
    
    def __init__(self): # constructor
        self.animals = []; #to hold animals in zoo

    def add(self, newAnimal):
        self.animals.append(newAnimal); #adding animals
    
    def getAnimals(self):
        return self.animals;


# In[3]:


class AnimalStrategyAbstract(object): #using stratedy pattern to separate animal behavior
    #told to do this
    __metaclass__ = abc.ABCMeta

    @abc.abstractmethod
    def makeNoise(self, name, species):
        """Required Method"""
        
    def roam(self, name, species):
        """Required Method"""
        
    def eat(self, name, species):
        """Required Method"""

class ferociousFeline(AnimalStrategyAbstract): #angry feline behavior - like lion
    def makeNoise(self, name, species):
        print(name + " the " + species + " is roaring!")
        
    def roam(self, name, species):
        print(name + " the " + species + " is prowling!")
        
    def eat(self, name, species):
        wildCard = np.random.choice(10)
        if wildCard % 3 == 0:
            print(name + " the " + species + " tried to eat the Zookeeper!")

        else:
            print(name + " the " + species + " is eating!")
        
class gentleFeline(AnimalStrategyAbstract): #nice feline behavior - like cat
    def makeNoise(self, name, species):
        print(name + " the " + species + " is meowing!")
    
    def roam(self, name, species):
        print(name + " the " + species + " trying to cuddle!")
    
    def eat(self, name, species):
        print(name + " the " + species + " is eating!")
        
class ferociousCanine(AnimalStrategyAbstract): #angry canine behavior - like wolf
    def makeNoise(self, name, species):
        print(name + " the " + species + " is howling!")
    
    def roam(self, name, species):
        print(name + " the " + species + " is roaming around!")
    
    def eat(self, name, species):
        print(name + " the " + species + " is scarfing their food!")
        
class gentleCanine(AnimalStrategyAbstract): #nice canine behavior - like dog
    def makeNoise(self, name, species):
        print(name + " the " + species + " is barking!")
        
    def roam(self, name, species):
        print(name + " the " + species + " is running around and wagging their tail!")
    
    def eat(self, name, species):
        print(name + " the " + species + " is lapping up their food!")
        
class pachyderm(AnimalStrategyAbstract): #all pachyderms are nice
    def makeNoise(self, name, species):
        print(name + " the " + species + " is trumpeting!")
        
    def roam(self, name, species):
        print(name + " the " + species + " is sniffing around!")
    
    def eat(self, name, species):
        print(name + " the " + species + " is slurping their food!")
    

#thought about making each type of action a separate class but figured it might be better to consolidate

# class RoamStrategyAbstract(object): #using strategy to separate roam style
#     __metaclass__ = abc.ABCMeta

#     @abc.abstractmethod
#     def heavyRoam(self):
#         """Required Method"""

# class heavyRoam(RoamStrategyAbstract):
#     def heavyRoam(self, name, species):
#         print(name + " the " + species + " is stomping around!")


# In[4]:


#setting behavior types
gentleFeline = gentleFeline()
ferociousFeline = ferociousFeline()
gentleCanine = gentleCanine()
ferociousCanine = ferociousCanine()
pachyderm = pachyderm()

class Animal:
    def __init__(self, name, species, behavior):
        self.name = name
        self.species = species
        #strategy is set
        self.behavior = behavior
    
    def wakeup(self):
        print(self.name + " the " + self.species + " has woken up!") #all animals wakeup and fall asleep the same
    
    #invoking stratedy for roam, eat, and makeNoise
    def roam(self):
        self.behavior.roam(self.name, self.species)
    
    def eat(self):
        self.behavior.eat(self.name, self.species)

    def makeNoise(self):
        self.behavior.makeNoise(self.name, self.species)
        
    def sleep(self):
        print(self.name + " the " + self.species + " has gone to sleep!")

#animals
#felines
class Cat(Animal):
    def __init__(self, name, species):
        super(Cat, self).__init__(name, species, gentleFeline)
    
    def sleep(self): #except for the cat, who is a silly guy
        sleep = self.name + " the " + self.species + " has gone to sleep!"
        hiss = self.name + " the " + self.species + " is hissing at you!"
        wild = self.name + " the " + self.species + " is jumping everywhere!"
        cuddle = self.name + " the " + self.species + " is trying to cuddle!"
        
        #pick a random action for sleep
        choices = [sleep, hiss, wild, cuddle]
        print(np.random.choice(choices))
        
class Tiger(Animal):
    def __init__(self, name, species):
        super(Tiger, self).__init__(name, species, ferociousFeline)

class Lion(Animal):
    def __init__(self, name, species):
        super(Lion, self).__init__(name, species, ferociousFeline)
        
#canines
class Wolf(Animal):
    def __init__(self, name, species):
        super(Wolf, self).__init__(name, species, ferociousCanine)

class Dog(Animal):
    def __init__(self, name, species):
        super(Dog, self).__init__(name, species, gentleCanine)

#pachyderms
class Elephant(Animal):
    def __init__(self, name, species):
        super(Elephant, self).__init__(name, species, pachyderm)
        
class Rhino(Animal):
    def __init__(self, name, species):
        super(Rhino, self).__init__(name, species, pachyderm)
        
class Hippo(Animal):
    def __init__(self, name, species):
        super(Hippo, self).__init__(name, species, pachyderm)


# In[9]:


class Zookeeper:
    def __init__(self, zoo):
        self.animals = zoo.getAnimals()
        self.observers = []
        
    #wake all animals
    def wakeAnimals(self):
        self.notify_observers('wake') #updating the observers
        print("------ The zookeeper is waking the animals up! ------")
        for a in self.animals:
            a.wakeup()
            
    #roll call all animals
    def rollCallAnimals(self):
        self.notify_observers('roll')
        print("------ The zookeeper is giving a roll call! ------")
        for a in self.animals:
            a.makeNoise()
                
    #feed all animals
    def feedAnimals(self):
        self.notify_observers('feed')
        print("------ The zookeeper is feeding the animals! ------")
        for a in self.animals:
            a.eat()
            
    #play with all animals
    def playAnimals(self):
        self.notify_observers('play')
        print("------ The zookeeper is playing with the animals! ------")
        for a in self.animals:
            a.roam()
            
    #put all animals to sleep
    def shutdownAnimals(self):
        self.notify_observers('sleep')
        print("------ The zookeeper is putting the animals to sleep. ------");
        for a in self.animals:
            a.sleep()
        
    #observable functions
    def register_observer(self, observer):
        self.observers.append(observer)
    def remove_observer(self, observer):
        self.observers.remove(observer)
    def notify_observers(self, action):
        for o in self.observers:
            o.update(action)
            
#Zoo annoucer observer class
class ZooAnnoucer:
    def __init__(self):
        pass
    
    #wait for update from observable and print accordingly
    def update(self, action): #observer notifying us about whats happening
        if action == 'wake':
            print('Hey yall the zookeeper is waking the animals')
            
        elif action == 'roll':
            print('Yo the zookeeper is making the animals yell')
        elif action == 'feed':
            print('The zookeeper is now feeding the animals')
        elif action == 'play':
            print('The zookeeper is playing with all the animals come watch')
        elif action == 'sleep':
            print('Its time for you to leave goodbye')
        
    
    


# In[10]:


zoo = Zoo()
        
cat1 = Cat("Carla", "cat")
lion1 = Lion("Leonard", "lion")
tiger1 = Tiger("Tammy", "tiger")
dog1 = Dog("Darius", "dog")
wolf1 = Wolf("Wendy", "wolf")
hippo1 = Hippo("Henry", "hippo")
rhino1 = Rhino("Remy", "rhino")
elephant1 = Elephant("Eloise", "elephant")

cat2 = Cat("Charlie", "cat")
lion2 = Lion("Leah", "lion")
tiger2 = Tiger("Tyler", "tiger")
dog2 = Dog("Darla", "dog")
wolf2 = Wolf("Willis", "wolf")
hippo2 = Hippo("Hillary", "hippo")
rhino2 = Rhino("Rachel", "rhino")
elephant2 = Elephant("Elbert", "elephant")

#add animals to the zoo
zoo.add(cat1)
zoo.add(cat2)
zoo.add(lion1)
zoo.add(lion2)
zoo.add(tiger1)
zoo.add(tiger2)
zoo.add(dog1)
zoo.add(dog2)
zoo.add(wolf1)
zoo.add(wolf2)
zoo.add(hippo1)
zoo.add(hippo2)
zoo.add(rhino1)
zoo.add(rhino2)
zoo.add(elephant1)
zoo.add(elephant2)
        


keeper = Zookeeper(zoo)
#create annoucer and have it watch the zookeeper
annoucer = ZooAnnoucer()
keeper.register_observer(annoucer)

#zookeeper activities
keeper.wakeAnimals()
keeper.rollCallAnimals()
keeper.feedAnimals()
keeper.playAnimals()
keeper.shutdownAnimals()

#unsubscribe the annoucer
keeper.remove_observer(annoucer)


# In[ ]:





# In[ ]:




