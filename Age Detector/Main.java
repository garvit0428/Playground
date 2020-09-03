#include<iostream>
using namespace std;
int main()
{
  int birth, current;
  cin >> birth >> current;
  birth>current ? cout<<(100+current-birth):cout <<(current-birth);
  return 0;
}