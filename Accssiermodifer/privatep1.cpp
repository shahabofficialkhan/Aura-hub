   #include <iostream>
   #include  <iomanip>
   using namespace std;
  class salary {
  int salary;
  public :
  int service;
   void setservice (int n){
    this->service=n;
    if (service>=10){
   this->salary= service*10;}
   else 
    this->salary=service*3;
   }
   void salaryshow(){
    cout << salary;
   }
  };
   int main () {while (true){
    salary s;
    cout << "Enter the service ";
    int n; cin>>n;
    s.setservice(n);
    
    cout << "Enter 1 for Salary";
    int option;cin>>option;
    if (option==1)
   { s.salaryshow ();
    s.salaryshow ();
    s.salaryshow ();}
    else {cout << "Program Completed";
        break;}}
     return 0;
   }