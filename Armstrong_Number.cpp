#include<bits/stdc++.h>
using namespace std;

int main(){

    int n;
    cin >> n;
    int dup = n;
    int sum = 0;
    while (n > 0){
        int ld = n % 10;
        sum = sum + (ld*ld*ld);
        n = n / 10;
    }

    if (sum == dup){
        cout << "TRUE";
    }
    else{
        cout << "FALSE";
    }

    return 0;
}

//1634