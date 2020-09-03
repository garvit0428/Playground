#include<iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  int k=1;
  int l;
  for(int i=1;i<=n;i++){
    if(i%2!=0){
      for(int j=0;j<i;j++){
        j+1==i ? cout<<k++:cout<<k++<<"*";
      }cout<<"\n";
    }else{
      l=k+i-1;
      for(int j=0;j<i;j++){
        j+1==i ? cout<<l--:cout<<l--<<"*";
        k++;
      }cout<<"\n";
    }
  }return 0;
}