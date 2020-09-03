#include<iostream>
using namespace std;
int main()
{
  int f_cost,f_dis,f_ship,s_cost,s_dis,s_ship,a_cost,a_dis,a_ship;
  cin >> f_cost>>f_dis>>f_ship>>s_cost>>s_dis>>s_ship>>a_cost>>a_dis>>a_ship;
  float flipkart = ((((100-f_dis)*1.0)/(100*1.0))*f_cost)+f_ship;
  float snapdeal = ((((100-s_dis)*1.0)/(100*1.0))*s_cost)+s_ship;
  float amazon = ((((100-a_dis)*1.0)/(100*1.0))*a_cost)+a_ship;
  cout << "In Flipkart Rs."<<flipkart<<endl;
  cout << "In Snapdeal Rs."<<snapdeal<<endl;
  cout << "In Amazon Rs."<<amazon<<endl;
  if(amazon<snapdeal && amazon < flipkart)
    cout << "He will prefer Amazon"<<endl;
  else if ( snapdeal< amazon && snapdeal<flipkart)
    cout << "He will prefer Snapdeal"<<endl;
  else
    cout << "He will prefer Flipkart"<<endl;
  return 0;
  
}