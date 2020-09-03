#include<iostream>
using namespace std;
int main()
{
  int s1,m,t1,w,t2,f,s2;
  cin>>s1>>m>>t1>>w>>t2>>f>>s2;
  int sum=0;
  int total = s1+m+t1+w+t2+f+s2;
  sum = s1<=8 ? sum+(s1*150):sum+(s1*150)+((s1-8)*15);
  sum = m<=8 ? sum+(m*100) : sum +(m*100)+((m-8)*15);
  sum = t1<=8 ? sum+(t1*100) : sum +(t1*100)+((t1-8)*15);
  sum = w<=8 ? sum+(w*100) : sum +(w*100)+((w-8)*15);
  sum = t2<=8 ? sum+(t2*100) : sum +(t2*100)+((t2-8)*15);
  sum = f<=8 ? sum+(f*100) : sum +(f*100)+((f-8)*15);
  sum = s2<=8 ? sum+(s2*125):sum+(s2*125)+((s2-8)*15);
  cout << sum;
  return 0;
}