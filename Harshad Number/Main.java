#include<iostream>
using namespace std;
int main()
{
  int n,m;
  cin >>n;
  m=n;
  int sum=0;
  while(m>0){
    sum+=m%10;
    m=m/10;
  }
  n%sum==0 ? cout<<"Harshad Number":cout<<"Not Harshad Number";
  return 0;
}