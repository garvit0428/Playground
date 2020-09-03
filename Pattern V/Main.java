#include<iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  int k=1;
  int l=0;
  for(int i=1;i<=n;i++){
    l+=i;
  }l*=2;
  int g,h;
  for(int i=1;i<=n;i++){
    for(int j=1;j<i;j++){
      cout<<"--";
    }for(int j=n;j>i-1;j--){
      cout<<k++<<"*";
    }g=l-(n-i+1)+1;
    l=l-(n-i+1);
    for(int j=n;j>i-1;j--){
      j==i ? cout<<g++:cout<<g++<<"*";
    }cout<<"\n";
  }return 0;
}