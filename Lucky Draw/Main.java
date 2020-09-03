#include<iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  int p=0;
  if(n==1){
    p=1;
  }else if(n/2 == 1){
    p=0;
  }else{
  	for(int i=2;i<=(n/2);i++){
      if(n%i!=0){
        p=0;
      }else{
        p=1;
        break;
      }
    }
  }p==0 ? cout<<"Eligible":cout<<"Not eligible";
  return 0;
}