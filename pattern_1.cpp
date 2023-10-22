// Print the pattern: 

// ****
// ****
// ****
// ****

#include<iostream>
using namespace std;

void pattern(int n){
    for (int i = 0; i < n; i++) // changes the coloumns
    {
        for (int j = 0; j < n; j++) //changes the rows
        {
            cout << "*";
        }
        cout<<endl;  //create next line after each row execution 
    }    
}

int main(){
    int n; 
    cin>>n;  //Takes the input for printing number of rows!
    pattern(n);

    return 0;
}