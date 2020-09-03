#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int total_ball, total_runs, run_scored, balls_bowled;
  cin >> total_ball >> total_runs >> run_scored >> balls_bowled;
  float overs = total_ball/6;
  int k = balls_bowled/6;
  float p = (balls_bowled*1.0)/(6*1.0);
  float overs_finish = (k*1.0)+(p-k)*(6*0.1);
  float c_run_rate = (run_scored*1.0)/overs_finish;
  float t_run_rate = (total_runs *1.0)/overs;
  overs==(int)overs ? cout << (int)overs << "\n":cout <<fixed<<setprecision(1)<< overs << "\n";
  cout <<fixed<<setprecision(1)<<overs_finish<<"\n";
  cout <<fixed<<setprecision(1)<<c_run_rate<<"\n";
  cout <<fixed<<setprecision(1)<<t_run_rate<<"\n";
  c_run_rate>t_run_rate ? cout<<"Eligible to Win":cout<<"Not Eligible to Win";
  return 0;
}