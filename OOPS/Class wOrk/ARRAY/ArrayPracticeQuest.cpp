#include <iostream> 
using namespace std;
#include <cmath>

//Function 
int maxArrElement (int arr[], int size){
    int largestElement = INT_MIN;
    for (int i = 0 ; i < size ; i++){
        if (arr [i] > largestElement){
            largestElement = arr [i];
        }
    }
    return largestElement;
}

int minArrElement (int arr[], int size){
    int SmallestElement = INT_MAX;
    for (int i = 0 ; i < size ; i++){
        if (arr [i] < SmallestElement){
            SmallestElement = arr [i];
        }
    }
    return SmallestElement;
}
int SecLargestelement (int arr[], int size){
    int largestElement = INT_MIN;
    int secondLargestElement = INT_MIN;
    for (int i = 0 ; i < size ; i++){
        if (arr[i] > largestElement){
               largestElement = arr[i];
               continue;
            }

     
    }
     for (int j = 0 ; j < size ; j++){
            if (arr[j] > secondLargestElement && arr[j] < largestElement){

                     secondLargestElement= arr[j];}
         }
        
     cout << "the largest element is : " << largestElement << endl ;
     cout << "the second largest element is : "  << endl ;

    return secondLargestElement;
}


void Posi_Element_InArray (int arr [],int  size){
    cout << "The positive elements in the array are : " ;
    int countpositive = 0 ;
    int countnegative = 0 ;
    int countzero = 0 ;
    for (int i = 0 ; i < size ; i++){
        if (arr [i] == 0){
            countzero++ ;
        }
        if (arr [i] > 0){
            cout << arr [i] << " " ;
            countpositive++ ;
        }
        else {
            cout << arr [i] << " " ;
            countnegative++ ;
        }
    }
    cout << endl ;
    cout << "The number of positive elements in the array is : " << countpositive << endl ;
    cout << "The number of negative elements in the array is : " << countnegative << endl ;
    cout << "The number of zero elements in the array is : " << countzero << endl ;
     

}

int Manu (int arr [] , int size){
    cout << "1- Find the largest element in the array " << endl ;
    cout << "2- Find the smallest element in the array " << endl ;
    cout << "3- Find the Positive and negative elements in the array " << endl ;
    cout << "4- Find The second largest Element in the array " << endl ;
    // cout << "5- Exit " << endl ;
    int option ; 
    cin >> option ;

     if (option == 1){
        cout << "The largest element in the array is : " << maxArrElement (arr , size) ;
    }
    else if (option == 2){
        cout << "The smallest element in the array is : " << minArrElement (arr , size) ;
    }  
    else if (option == 3){
        Posi_Element_InArray (arr , size) ;
    } 
     else if (option == 4){
      cout  << SecLargestelement (arr , size) ;
    } 
    else {
        cout << "Invalid option " ;
    }

    return option ;
}
int main (){

  int size ;
  cout << "Enter the size of the array : " ;
    cin >> size ;
    int arr [size] ;

    for (int i = 0 ; i < size ; i++){
        cout << "Enter element No "  << i + 1 << " : " ;
        cin >> arr [i] ;
    }
Manu (arr , size) ;

}








