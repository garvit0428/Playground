#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  for(int i=1;i<=n;i++){
    i%2!=0 ? cout<<((i*i)-1)<<" ":cout<<((i*i)-2)<<" ";
  }return 0;
}