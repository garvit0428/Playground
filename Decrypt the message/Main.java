#include<iostream>
using namespace std;
int main(){
  int n1,n2,n;
  cin >> n1>>n2;
  n=n1+n2;
  int sum=0;
  for(int i=1;i<n;i++){
    if(n%i==0){
      sum+=i;
    }
  }if(sum==n){
    cout<<"They can read the message";
  }else{
    cout<<"They can't read the message";
  }return 0;
}