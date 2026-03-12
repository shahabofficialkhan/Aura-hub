#include <iostream>
using namespace std;

class Demo {
public:
    Demo() {
        cout << "Constructor called\n";
    }
    void message() {
        cout << "Demo class\n";
    }
};

int main() {
    Demo d1;
    d1.message();
}
