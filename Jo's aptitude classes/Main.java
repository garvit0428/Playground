#include <iostream>
using namespace std;
int check(int a, int b, int c){
  int mul=1;
  for(int i=a; i>0;i--){
    if(a%i==0 && b%i==0 && c%i==0){
      mul=i;
      break;
    }
  }return mul;
}
int main() 
{
  int a,b,c,re,res;
  cin>>a>>b>>c>>re;
  if(a<b && a<c){
    res=check(a,b,c);
  }else if(b<a && b<c){
    res=check(b,a,c);
  }else{
    res=check(c,a,b);
  }if(res==re)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
  return 0;
}