#include<iostream>
using namespace std;
int main()
{
  int n,p,i=0;
  cin>>n;
  int sum=0;
  while(sum<n){
    cin>>p;
    sum+=p;
    i++;
  }cout<<"The number of turns is "<<i;
  return 0;
}