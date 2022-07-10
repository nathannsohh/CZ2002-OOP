#include "childAnimal.h"
#include "animal.h"
#include <iostream>
using namespace std ;

Animal::Animal() : _name("unknown") {
            cout << "constructing Animal object "<< _name << endl ;
        }
Animal::Animal(string n, COLOR c) : _name(n), _color(c){
            cout << "constructing Animal object "<< _name << endl ;
            cout << "Colour: " << _color << endl;
        }
Animal::~Animal(){
            cout << "destructing Animal object "<< _name << endl ;
        }
void Animal::speak() const {
            cout << "Animal speaks "<< endl;
        }

Mammal::Mammal(){}
Mammal::Mammal(string n, COLOR c) : Animal(n,c){
        cout << "constructing Mammal object "<< endl;
    }
Mammal::~Mammal(){
        cout << "destructing Mammal object "<< endl;
    }
void Mammal::eat() const {
    cout << "Mammal eat " << endl;
}
void Mammal::move(){}

Dog::Dog(string n, COLOR c, string owner) : Mammal(n, c), owner(owner){
        cout << "constructing Dog object "<< n << endl;
    }
Dog::~Dog(){
    cout<< "destructing Dog object "<< endl;
}
void Dog::speak() const {
    cout << "Woof"<< endl;
}
void Dog::move(){
    cout << "Walk"<< endl;
}

Cat::Cat(string n, COLOR c) : Mammal(n,c){
    cout << "constructing Cat object "<< n << endl;
}
Cat::~Cat(){
    cout<< "destucting Cat object "<< endl;
}
void Cat::speak() const {
    cout << "Cat Meow" << endl;
}
void Cat::move() {
    cout << "Cat Crawl" << endl;
}

Lion::Lion(string n, COLOR c) : Mammal(n,c){
    cout << "constructing Lion object "<< n << endl;
}
Lion::~Lion(){
    cout<< "destucting Cat object "<< endl;
}
void Lion::speak() const {
    cout << "Lion Roar" << endl;
}
void Lion::move() {
    cout << "Lion Run" << endl;
}

int main() {
    // Animal a("Rabbit", White);
    // Mammal m("Dog", Black);
    // a.speak() ;
    // m.speak();
    // Dog d("Eevee", White, "Nathan");
    // d.speak();
    // d.move();

    // Animal *animalPtr = new Dog("Lassie", White, "Andy");
    // animalPtr->speak();
    // animalPtr->move();
    // delete animalPtr;
    
    // Dog dogi("Lassie", White, "Andy");
    // Mammal *aniPtr = &dogi;
    // Mammal &aniRef = dogi;
    // Mammal aniVal = dogi;
    // aniPtr->speak();
    //     aniRef.speak();
    //         aniVal.speak();

    Mammal **m = new Mammal*[10];
    int x = -1;
    int i = 0;
    do{
    cout << "Select the animal to send to Zoo:"<< endl;
    cout << "(1) Dog  (2) Cat  (3) Lion  (4) Move all animals  (5) Quit"<< endl;
    cin >> x;
    switch(x){
        case 1: 
            m[i] = new Dog("x", White, "Gregory");
            i++;
            break;
        case 2:
            m[i] = new Cat("c", Brown);
            i++;
            break;
        case 3:
            m[i] = new Lion("l", Brown);
            i++;
            break;
        case 4:
            for(int y = 0; y < i; y++){
                m[y]->speak();
                m[y]->move();
                m[y]->eat();
            }
            break;
        case 5:
            break;
        default:
            cout<<"Invalid Choice! Please try again."<<endl;
    }
    }while(x != 5);
    
    cout << "Program exiting... "<< endl ;
    return 0;
}