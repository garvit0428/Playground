#include <iostream>
using namespace std;
int main() {
  int n;
  cin>>n;
  int k=1;
  int l;
  for(int i=1;i<=n;i++){
    if(i%2!=0){
      for(int j=1;j<=n;j++){
        cout<<k;
        j==n-1 ? k++:k;
      }cout<<"\n";
    }else{
      l=++k;
      for(int j=1;j<=n;j++){
        cout<<l;
        j==1 ? l--:l;
      }cout<<"\n";
    }
  }
}