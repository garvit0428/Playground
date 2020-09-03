#include<iostream>
using namespace std;
int check(int m, int n, int req){
  int l=1;
  for(int i=1;i<=n;i++){
    l=l*m;
  }
  if(l>=req){
    return 1;
  }else{
    return 0;
  }
}
int main(){
  int m,n,req;
  cin>>m>>n>>req;
  check(m,n,req)==1 ? cout<<"Doctor, you can proceed with your experiment.":cout<<"Sorry Doctor! You need more bacteria.";
}