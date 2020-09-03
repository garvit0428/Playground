#include<iostream>
using namespace std;
int gcd(int n, int m,int d){
  if(n%d==0 && m%d==0){
    return d;
  }else{
    gcd(n,m,--d);
  }
}
int main()
{
  int n,m;
  cin>>n>>m;
  int d = n>m ? gcd(m,n,m):gcd(n,m,n);
  cout<<"G.C.D of "<<n<<" and "<<m<<" = "<<d;
  return 0;
}