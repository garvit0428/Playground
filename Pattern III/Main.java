#include<iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  for(int i=1;i<=n;i++){
    for(int j=0;j<i;j++){
      j+1==i ? cout<<i:cout<<i<<"*";
    }cout<<"\n";
  }for(int i=n;i>0;i--){
    for(int j=i-1;j>=0;j--){
      j==0 ? cout<<i:cout<<i<<"*";
    }cout<<"\n";
  }return 0;
}