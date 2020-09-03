#include<iostream>
using namespace std;
int main()
{
  int r,c,num;
  cin >> r>>c>>num;
  if((num>=1 && num<=r)||(num<=(r*c) && num>(r*(c-1)))||((num-1)%r==0))
    cout << "Yes";
  else
    cout<<"No";
  return 0;
}