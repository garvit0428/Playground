#include<iostream>
using namespace std;
int main()
{
  int r,l;
  cin >> r >> l;
  float p = (l*1.0)/(2*1.0);
  (p>=r) ? (cout<<"circle can be inside a square"):(cout<<"circle cannot be inside a square");
  return 0;
}