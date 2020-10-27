
#include<bits/stdc++.h>

using namespace std;

#define log2(n)  log(n)/log(2)

int main(){
    int xCount = 0,yCount = 0;
    bool sub_flag = 1;
    unsigned int x,y;
    cin >> x >> y; 
    unsigned int temp,temp2,temp3;
    while (x != 0 || y != 0)
    {
        temp = log2(y);
        temp = 1<<temp;
        temp2 = temp<<1;
        if(y-temp < temp2-y){
            sub_flag = 1;
        }else{
            sub_flag = 0;
        }

        if(sub_flag){
            y -= temp;
        }else
        {//进行加法
            temp3 = log2(temp2-y);
            temp = 1<<temp3;
            y += temp;
        }
        yCount++;
        if (y==0){
            break;
        }

        temp = log2(x);
        temp = 1<<temp;
        temp2 = temp<<1;
        if(x-temp < temp2-x){
            sub_flag = 1;
        }else{
            sub_flag = 0;
        }

        if(sub_flag){
            x -= temp;
        }else
        {//进行加法
            temp3 = log2(temp2-x);
            temp = 1<<temp3;
            x += temp;
        }
        xCount++;
    }
    cout<<xCount<<" "<<yCount;
    if(x==0){//STO赢
        cout<<"ORZ";
    }else
    {
        cout<<"STO";
    }
    

    return 0;
}