#ifndef CHILDANIMAL_H
#define CHILDANIMAL_H

#include "animal.h"
#include <string>

class Dog : public Mammal {
    public :
        Dog(std::string n, COLOR c, std::string owner);
        ~Dog();
        void speak() const;
        void move();

    private :
        std::string owner;
};

class Cat : public Mammal {
    public :
        Cat(std::string n, COLOR c);
        ~Cat();
        void speak() const;
        void move();
};

class Lion : public Mammal {
    public :
        Lion(std::string n, COLOR c);
        ~Lion();
        void speak() const;
        void move();
};

#endif