#include<iostream>
using namespace std;

class Solution {
public:
    string replaceSpace(string s) {
        //count blank
        int n=s.size(), blank_num=0;
        for(int i=0;i<n;i++){
            if(s[i]==' '){
                blank_num++;
            }
        }
        //expand the original array
        int m=n+2*blank_num;
        s.resize(m);
        //change in-place
        for(int i=n-1, j=m-1;blank_num>0;){
            if(s[i]==' '){
                s[j]='0'; j--;
                s[j]='2'; j--;
                s[j]='%'; j--;
                i--;
                blank_num--;
            }
            else{
                s[j]=s[i];
                j--;
                i--;
            }
        }
        return s;
    }
};