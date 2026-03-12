#include <iostream>
using namespace std;

class Test {
public:
    void show() {
        cout << "Hello, World!" << endl;
    }
};

int main() {
    Test t;
    t.show();
    return 0;
}
