#include <iostream>
using namespace std;

class X {
public:
    int a = 100;
};

int main() {
    X obj1;
    X obj2 = obj1; // Constructor copy make 
    //it the deep copy not shalow copy
    obj1.a = 200;
    cout << obj2.a<<endl;
}
