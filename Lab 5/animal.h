#ifndef ANIMAL_H
#define ANIMAL_H

#include <string>

enum COLOR { Green, Blue, White, Black, Brown } ;

class Animal {
    private:
        std::string _name;
        COLOR _color;
    public :
        Animal();
        Animal(std::string n, COLOR c);
        ~Animal();
        virtual void speak() const;
        virtual void move() = 0;
};

class Mammal : public Animal {
    public:
        Mammal();
        Mammal(std::string n, COLOR c);
        ~Mammal();
        void eat() const;
        void move();
};
#endif