#include <iostream>
using namespace std;

class Alpha {
public:
    Alpha() {
        cout << "Alpha Constructor" << endl;
    }
};

int main() {
    Alpha a1, a2;
    return 0;
}
