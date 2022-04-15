#include<bits/stdc++.h>
using namespace std;

void reverse(stack<int>&s, int current){
    if(current == s.size()){
        return;
    }
    stack<int>news;
    
}

void main(){
    stack <int>s;
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    reverse(s, 0);
    while(!s.empty()){
        cout<<s.top()<<endl;
        s.pop();
    }
}