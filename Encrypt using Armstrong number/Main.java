#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int m)
{
  int n=m;
  int p=m;
  int sum=0,i=0;
  while(p%10!=0){
    i++;
    p/=10;
  }
  while(n%10!=0){
    sum+=power(n%10,i);
    n/=10;
  }
  if(sum==m)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}