#include<iostream>
using namespace std;
int power(int n,int p){
  if(p==0){
    return 1;
  }else{
    return n*power(n,--p);
  }
}
int main()
{
  int n,p;
  cin>> n>>p;
  cout<<"Enter the value of a\nEnter the value of n\nThe value of "<<n<<" power "<<p<<" is "<<power(n,p);
  return 0;
}