#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int items;
  float time;
  cin >> items >> time;
  switch(items){
    case 1:
      cout << time;
      break;
    case 2:
      cout<<fixed<<setprecision(2)<<((150*1.0)/(100*1.0))*time;
      break;
    case 3:
      cout<<fixed<<setprecision(2)<<time*2;
      break;
    default:
      cout<<"Number of items is more";
  }
  return 0;
}