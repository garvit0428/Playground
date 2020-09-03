#include<iostream>
using namespace std;
int main()
{
  int d1,d2,c1,c2,sum_d,sum_c;
  cin>>d1>>c1>>d2>>c2;
  sum_d=d1+d2;
  if((c1+c2)>99){
    sum_c=(c1+c2)%100;
    sum_d+=(c1+c2)/100;
  }else{
    sum_c = c1+c2;
  }
  cout<<sum_d<<"\n"<<sum_c;
  return 0;
}