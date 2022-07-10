#include <iostream>
#include <string>

using namespace std ;

enum COLOR { Green, Blue, White, Black, Brown } ;

class Animal {
    public :
            Animal() : _name("unknown") {
                cout << "constructing Animal object "<< _name << endl ;
            }
            Animal(string n, COLOR c) : _name(n), _color(c){
                cout << "constructing Animal object "<< _name << endl ;
                cout << "Colour: " << _color << endl;
            }

            ~Animal(){
                cout << "destructing Animal object "<< _name << endl ;
            }
            virtual void speak() const {
                cout << "Animal speaks "<< endl;
            }
            virtual void move() = 0; 
            

    private :
            string _name;
            COLOR _color;
};

class Mammal : public Animal {
    public :
        Mammal(){}
        Mammal(string n, COLOR c) : Animal(n,c){
            cout << "constructing Mammal object "<< endl;
        }
        ~Mammal(){
            cout << "destructing Mammal object "<< endl;
        }
        void eat() const {
            cout << "Mammal eat " << endl;
        }
        void move(){}
};

class Dog : public Mammal {
    public :
            Dog(string n, COLOR c, string owner) : Mammal(n, c), owner(owner){
                cout << "constructing Dog object "<< n << endl;
            }
            ~Dog(){
                cout<< "destructing Dog object "<< endl;
            }
            void speak() const {
                cout << "Woof"<< endl;
            }
            void move(){
                cout << "Walk"<< endl;
            }

    private :
            string owner;
};

class Cat : public Mammal {
    public :
            Cat(string n, COLOR c) : Mammal(n,c){
                cout << "constructing Cat object "<< n << endl;
            }
            ~Cat(){
                cout<< "destucting Cat object "<< endl;
            }
            void speak() const {
                cout << "Cat Meow" << endl;
            }
            void move() {
                cout << "Cat Crawl" << endl;
            }
};

class Lion : public Mammal {
    public :
            Lion(string n, COLOR c) : Mammal(n,c){
                cout << "constructing Lion object "<< n << endl;
            }
            ~Lion(){
                cout<< "destucting Cat object "<< endl;
            }
            void speak() const {
                cout << "Lion Roar" << endl;
            }
            void move() {
                cout << "Lion Run" << endl;
            }
};

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
        default:
            cout<<"Invalid Choice! Please try again."<<endl;
    }
    }while(x != 5);
    
    cout << "Program exiting... "<< endl ;
    return 0;
}