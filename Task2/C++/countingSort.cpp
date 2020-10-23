#include<iostream>
using namespace std;

class Sort{
 private:
    int N;
    int *arr;
public:
    Sort(int n): N(n){
        arr = new int[N];
        for(int i=0;i<N;i++) arr[i]=0;
    }
    void sort(int Array[]){
        for(int i=0;i<N;i++) arr[Array[i]]++;
        int pos=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<arr[i];j++) Array[pos+j]=i;
            pos+=arr[i];
        }
    }
};

int main(){
    //Enter Size of array;
    int n; 
    std::cin>>n;
    int Array[n];
    //take input less than N and greater than 0
    for(int i=0;i<n;i++) cin>>Array[i];

    Sort sortArray(n);
    sortArray.sort(Array);
    cout<<endl<<"Sorted Array: ";
    for(int i=0;i<n;i++) cout<<Array[i]<<" ";
    
    return 0;
}