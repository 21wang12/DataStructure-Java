
#include<bits/stdc++.h>

using namespace std;

int main(){
    int n,k;
    cin >> n >> k;
    int count = n;
    //���в������� secondΪ��ʽ����ı�� firstΪ����
    vector<pair<int,int>> vp;
    map<int,int> mi;
    //zzu������������
    vector<int> vi;
    int temp;
    pair<int,int> ptemp;
    
    //������ʽ���������
    for (int i = 0; i < n; i++)
    {
        cin >> temp;
        if(temp == 0){
            count--;
        }
        ptemp.second = temp;
        vp.push_back(ptemp);
    }
    //���������������
    for (int i = 0;i < n; i++){
        cin >> temp;
        vp[i].first = temp;
    }
    //��������������map��ʽ�洢
    for (int i = 0;i < n; i++){
        mi.insert(vp[i]);
    }
    //����zzu�������������
    for (int i = 0;i < k; i++){
        cin >> temp;
        vi.push_back(temp);
    }
    //�������ͭ�ı���
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