#include<iostream>
using namespace std;
int main(){
  int n;
  cin >> n;
  int g=11;
  for(int i=1;i<=n;i++){
    cout<<g*g<<" ";
    g=g+4;
  }return 0;
}