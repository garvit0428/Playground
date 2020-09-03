#include<iostream>
using namespace std;
int main()
{
  float mil;
  int km,lit;
  cin >> mil >> lit >> km;
  (mil*lit)<km ? cout<<"Cannot reach":cout<<"Can reach";
  return 0;
}