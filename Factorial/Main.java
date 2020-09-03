#include<iostream>
using namespace std;
int fact(int n){
    int mul;
    if(n==1){
        return 1;
    }else{
        mul=n*fact(n-1);
        return mul;
    }
}
int main(){
    int n;
    cin>>n;
    cout<<"The factorial of "<<n<<" is "<<fact(n);
    return 0;
}