#include <iomanip>
#include <iostream>
#include <string>
using namespace std;
class student
{
public:
    int id;
    string name;
    student()
    {
    }
    student(string s, int n);
    student(string s)
    {
        name = s;
    }
    student(int n)
    {
        id = n;
    }
};
student::student(string s, int n)
{
    name = s;
    id = n;
}
student ::student(string s)
{
    name = s;
}
int main()
{
    student s("shahab", 102);
    student s1;
    s1.id = 101;
    s1.name = "fahad";

    cout << "->" << s.name << "|\t" << s.id << endl;
    cout << "->" << s1.name << " |\t" << s1.id << endl;
    return 0;
}
