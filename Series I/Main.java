#include<iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  float l=0.5;
  for(int i=1;i<=n;i++){
    cout<<l<<" ";
    l=l*3;
  }return 0;
}