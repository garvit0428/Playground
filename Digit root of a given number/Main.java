#include<iostream>
using namespace std;
int root(int &m){
  if(m/10==0){
    return m;
  }else{
    int sum =(m%10)+root(m/=10);
    return sum;
  }
}
int dig_root(int &m){
    int c;
    if(m/10!=0){
        m=root(m);
        dig_root(m);
    }return m;
}
int main(){
  int n;
  cin>>n;
  cout<<dig_root(n);
  return 0;
}