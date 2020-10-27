
#include<bits/stdc++.h>

using namespace std;

int main(){
    int n,k;
    cin >> n >> k;
    int count = n;
    //所有参赛队伍 second为正式队伍的标记 first为排名
    vector<pair<int,int>> vp;
    map<int,int> mi;
    //zzu参赛队伍排名
    vector<int> vi;
    int temp;
    pair<int,int> ptemp;
    
    //计算正式队伍的数量
    for (int i = 0; i < n; i++)
    {
        cin >> temp;
        if(temp == 0){
            count--;
        }
        ptemp.second = temp;
        vp.push_back(ptemp);
    }
    //输入参赛队伍排名
    for (int i = 0;i < n; i++){
        cin >> temp;
        vp[i].first = temp;
    }
    //将数量和排名以map形式存储
    for (int i = 0;i < n; i++){
        mi.insert(vp[i]);
    }
    //输入zzu参赛队伍的排名
    for (int i = 0;i < k; i++){
        cin >> temp;
        vi.push_back(temp);
    }
    //计算金银铜的比例
    double gold = count*0.1,silver = count*0.3,copper = count*0.6;

    int goldCount = 0,silverCount = 0,copperCount = 0;

    for (int i = 0;i < k; i++){
        map<int,int>::iterator iter = mi.find(vi[i]);
        if ( iter->second == 1){
            if(iter->first <= gold){
                goldCount ++;
            }else if(iter->first <= silver){
                silverCount ++;
            }else if(iter->first <= copper){
                copperCount ++;
            }
        }
    }
    cout<<goldCount<<" "<<silverCount<<" "<<copperCount<<endl;
    return 0;
}