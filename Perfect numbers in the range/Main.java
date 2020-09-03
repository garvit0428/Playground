#include<iostream>
using namespace std;
int main(){
  int n1,n2,sum;
  cin>>n1>>n2;
  for(int i=n1;i<n2;i++){
    sum=0;
    for(int j=1;j<i;j++){
      if(i%j==0){
        sum+=j;
      }
    }if(sum==i){
      cout<<sum<<" ";
    }
  }return 0;
}