#include <iostream>
using namespace std;

class MyClass {
private:
    int x = 5;
public:
    void print() {
        cout << x;
    }
};

int main() {
    MyClass obj;
  obj.print();
  cout << endl;
}
