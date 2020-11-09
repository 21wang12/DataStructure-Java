#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int bitCount(int a){
        int count = 0;
        while (a!=0)
        {
            if(a&1 == 1){
                count++;
            }
            a>>1;
        }
        return count;
    }
    bool cmp(int a,int b){
        
        bitset<32> bsa = a;
        bitset<32> bsb = b;
        int countA = bsa.count();
        int countB = bsb.count();
        return countA == countB? a<b : countA<countB;
    }
    vector<int> sortByBits(vector<int>& arr) {
        sort(begin(arr),end(arr),cmp);
        arr.begin();
        int a[10];
        sort(begin(a),end(a));
        return arr;
    }
};