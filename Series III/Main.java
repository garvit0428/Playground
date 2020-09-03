#include<iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  int g=5;
  int p=6;
  for(int i=1;i<=n;i++){
    cout<<p<<" ";
    p=p+(g*i);
  }return 0;
}