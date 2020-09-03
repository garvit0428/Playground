#include<iostream>
using namespace std;
int main()
{
  int age;
  float time;
  cin>>age>>time;
  float matinee = 13.30;
  if(time==matinee){
    if(age>13)
      cout<<"$5.00";
  	else
      cout<<"$2.00";
  }else{
    if(age>13)
      cout<<"$8.00";
  	else
      cout<<"$4.00";
  }
  return 0;
}