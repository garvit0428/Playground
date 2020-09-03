#include<iostream>
using namespace std;
int main()
{
  int n1=0,n2=1,m,n3,n4;
  cin>>m;
  if(m==1)
    cout<<n1;
  else if(m==2)
    cout<<n2;
  for(int i=3;i<=m;i++){
    n3=n2+n1;
    n1=n2;
    n2=n3;
  }cout<<n3;
  return 0;
}