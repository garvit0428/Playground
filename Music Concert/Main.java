#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  int n;
  cin>>n;
  int *p = (int *)malloc(n*sizeof(int));
  int even=0,odd=0;
  for(int i=0;i<n;i++){
    cin>>*(p+i);
    *(p+i)%2==0 ? even++:odd++;
  }cout<<odd<<"\n"<<even<<endl;
  return 0;
}