#include<iostream>
using namespace std;
int main()
{
  int n,mark;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++){
    cin>>arr[i];
  }cin>>mark;
  int g=0;
  for(int i=0;i<n;i++){
    if(mark==arr[i]){
      g=1;
      break;
    }
  }g==1 ? cout<<"She passed her exam":cout<<"She failed";
  return 0;
}