#include<iostream>
using namespace std;
int main()
{
  int n,i=0;
  float sum=0;
  while(i<3){
    cin>>n;
    if(n>=0){
      if(n%2!=0){
        sum+=1.0;
        i++;
      }else{
        sum-=0.5;
      }
    }else{
      sum-=1.0;
      i=3;
    }
  }cout<<sum;
  return 0;
}