#include<iostream>
using namespace std;
int main()
{
  int n,m,i=0,z=1;
  cin>>n;
  m=n;
  while(m>0){
    m=m/10;
    i++;
  }
  m=n*n;
  int m1,m2;
  for(int j=0;j<i;j++){
    z*=10;
  }m1=m%z;
  m2=m/z;
  if((m1+m2)==n){
	cout<<"Kaprekar Number";
  }else{
    cout<<"Not a Kaprekar Number";
  }return 0;
}