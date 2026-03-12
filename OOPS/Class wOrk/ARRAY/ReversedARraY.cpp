#include <iostream>
using namespace std;


int main (){
    // int arr [4] = {1,2,3,4};
  
    // int a = 0;
    // for (int i=0 ; i < 4 ; i++){
    //      int x = arr[i];
         
    //     for (int j = 3 ; j <= 1 ; j-- ){

    //        a = arr [j]  ;
    //        arr [j] = x ;
    //     }
               
    // }
// string txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
// cout << "The length of the txt string is: " << txt.length();
      // cout << " Element No " << a + 1 << " = " <<arr [i] <<endl;
      // a++;
      // cout << a ; 


      string letters[2][2][2] = {
  {
    { "A", "B" },
    { "C", "D" }
  },
  {
    { "E", "F" },
    { "G", "H" }
  }
};
cout << letters [1][1][0];

}


