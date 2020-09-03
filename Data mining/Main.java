#include<iostream>
using namespace std;
int main()
{
  int n,m;
  cin>>n;
  int even=0,odd=0;
  while(n>0){
    m=n%10;
    if(m%2==0){
      even+=m;
    }else{
      odd+=m;
    }n/=10;
  }if(even==odd){
    cout<<"Yes";
  }else{
    cout<<"No";
  }return 0;
}