#include<iostream>
using namespace std;
int main(){
  int n, fac=1;
  cin>>n;
  if(n==0){
    cout<<1;
  }else{
  	for(int i=1;i<=n;i++){
  		fac = fac*i;
  	}
    cout<<fac;
  }
  return 0;
}